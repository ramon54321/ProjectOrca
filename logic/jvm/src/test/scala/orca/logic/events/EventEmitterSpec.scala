package orca.logic.events

import org.scalatest.flatspec.AnyFlatSpec

class EventEmitterSpec extends AnyFlatSpec {
  val events = new EventEmitter()

  events.on("tick", () => null)
  events.on("tick", () => null)
  events.on("close", () => null)

  events.emit("close")
  events.emit("tick")

  "EventEmitter" should "return correct event count" in {
    assert(events.eventCount == 2)
  }

  it should "return correct action count" in {
    assert(events.actionCount == 3)
  }

  it should "call action when event is emitted" in {
    var called = false
    events.on("open", () => called = true)
    events.emit("open")
    assert(called == true)
  }
}
