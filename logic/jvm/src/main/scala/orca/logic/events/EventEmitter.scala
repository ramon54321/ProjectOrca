package orca.logic.events

import scala.collection.mutable.{HashMap, ListBuffer}

class EventEmitter {
  private val eventMap = new HashMap[String, ListBuffer[() => Unit]]()
  private def ensureEventExists(event: String): Unit = {
    if (this.eventMap.contains(event)) return
    this.eventMap.addOne((event, new ListBuffer[() => Unit]))
  }
  def eventCount: Int = this.eventMap.size
  def actionCount: Int = this.eventMap.flatMap(entry => entry._2).size
  def on(event: String, action: () => Unit): Unit = {
    this.ensureEventExists(event)
    this.eventMap.get(event).foreach(list => list.addOne(action))
  }
  def emit(event: String): Unit = {
    if (!this.eventMap.contains(event)) return
    this.eventMap.get(event).foreach(list => list.foreach(action => action()))
  }
}

object Events extends EventEmitter {
  println("Events Init")
}
