package orca.logic.net

import orca.logic.NetState
import orca.logic.events.Events
import org.java_websocket.WebSocket
import org.java_websocket.handshake.ClientHandshake
import org.java_websocket.server

import java.net.InetSocketAddress

object Server extends server.WebSocketServer(new InetSocketAddress(8080)) {
  println("Server Init")
  Runtime.getRuntime.addShutdownHook(new Thread {
    override def run(): Unit = {
      println("WSS Shutdown")
      Server.stop()
    }
  })
  override def onOpen(connection: WebSocket, handshake: ClientHandshake): Unit = {
    println("WSS Client Connected")
    NetState.sync(connection)
  }
  override def onClose(connection: WebSocket, code: Int, reason: String, remote: Boolean): Unit = {
    println("WSS Client Disconnected")
  }
  override def onMessage(connection: WebSocket, message: String): Unit = {
    println("WSS Message " + message)
  }
  override def onError(connection: WebSocket, ex: Exception): Unit = {
    println("WSS Error " + ex.toString)
    Events.emit("server.error")
  }
  override def onStart(): Unit = {
    println("WSS Startup")
    Events.emit("server.startup")
  }
  override def broadcast(data: Array[Byte]): Unit = {
    println("WSS Broadcast " + data.toString)
    super.broadcast(data)
  }
}
