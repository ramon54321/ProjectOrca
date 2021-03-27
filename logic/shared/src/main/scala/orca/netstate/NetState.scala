package orca.netstate

import orca.protobuf.NetStateSetter.{NetStateSetter, SetGameName, SetGameSeed}

class NetState {
  private var gameName: String = "unknown"
  private var gameSeed: Int = -1
  def applySetter(netStateSetter: NetStateSetter.NonEmpty): Unit = netStateSetter match {
    case SetGameName(name, _) => this.gameName = name
    case SetGameSeed(seed, _) => this.gameSeed = seed
  }
  override def toString: String = "Name " + this.gameName
}
