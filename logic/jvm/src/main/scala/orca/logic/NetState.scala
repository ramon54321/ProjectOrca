package orca.logic

import orca.logic.net.Server
import orca.netstate.NetState
import orca.protobuf.NetStateSetter.{NetStateSetter}
import org.java_websocket.WebSocket

import scala.collection.mutable.HashMap

object NetState {
  println("NetState Init")
  private val netState = new NetState()
  private val lastAppliedMap = new HashMap[String, NetStateSetter.NonEmpty]()

  def apply(netStateSetter: NetStateSetter.NonEmpty): Unit = {
    val serializedNetStateSetter = netStateSetter.asMessage.toByteArray
    Server.broadcast(serializedNetStateSetter)
    this.netState.applySetter(netStateSetter)
    this.lastAppliedMap.put(Utils.shortClassName(netStateSetter), netStateSetter)
  }

  def sync(connection: WebSocket): Unit = {
    println("NS Syncing with connection")
    this.lastAppliedMap.valuesIterator.foreach(netStateSetter => {
      val serializedNetStateSetter = netStateSetter.asMessage.toByteArray
      connection.send(serializedNetStateSetter)
    })
  }

  def getState: String = {
    lastAppliedMap.toString()
  }
}
