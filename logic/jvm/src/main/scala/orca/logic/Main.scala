package orca.logic

import orca.logic.events.Events
import orca.logic.net.Server
import orca.protobuf.NetStateSetter.{SetGameName, SetGameSeed}
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.TimeUnit

object Main extends App {
  Log.clearOutput()

  // Init
  Events
  Server
  NetState
  Game

//  if (true) {
//    println("Debug")
//
//    NetState.apply(SetGameName("Andy"))
//    NetState.apply(SetGameName("Bob"))
//    NetState.apply(SetGameSeed(1234))
//
//    println(NetState.getState)
//
//    sys.exit(0)
//  }

  // Startup
  Server.start()
  Game.start()
}

object Game {
  println("Game Init")
  private var name: String = "unknown"
  private var seed: Int = -1

  def start(): Unit = {
    val threadPoolExecutor = new ScheduledThreadPoolExecutor(1)
    threadPoolExecutor.scheduleAtFixedRate(new Runnable {
      def run(): Unit = Game.tick()
    }, 0, 1000, TimeUnit.MILLISECONDS)
  }

  def tick(): Unit = {
    println("Tick")
  }
}
