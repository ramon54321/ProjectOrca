import orca.netstate.NetState
import orca.protobuf.NetStateSetter.NetStateSetterMessage

import scala.scalajs.js
import js.annotation.{JSExport, JSExportTopLevel, JSGlobal}

@js.native
@JSGlobal("websocket")
object WebSocket extends js.Object {
  def client: js.Dynamic = js.native
}

@js.native
trait WebSocketClient extends js.Object {
  def on(event: String, callback: js.Function1[Connection, Unit]): Unit = js.native
  def connect(host: String): Unit = js.native
}

@js.native
trait Connection extends js.Object {
  def on(event: String, callback: js.Function): Unit = js.native
  def sendUTF(message: String): Unit = js.native
}

@js.native
trait Message extends js.Object {
  val binaryData: js.typedarray.Uint8Array = js.native
}

@JSExportTopLevel("Orca")
class Orca {
  private val netState = new NetState()
  private val client = js.Dynamic.newInstance(WebSocket.client)()
  client.on("connect", (connection: Connection) => {
    connection.on("error", (error: js.Object) => {
      println(error.toString)
    })
    connection.on("close", () => println("Connection closed"))
    connection.on("message", (data: Message) => {
      // Convert UInt8 to Byte
      val bytes = new Array[Byte](data.binaryData.byteLength)
      for(i <- bytes.indices) {
        bytes(i) = (data.binaryData(i) << 24 >> 24).asInstanceOf[Byte]
      }
      val netStateSetter = NetStateSetterMessage.parseFrom(bytes).toNetStateSetter
      netStateSetter.asNonEmpty.foreach(this.netState.applySetter)
    })
    connection.sendUTF("Hello from the orca client")
  })
  client.connect("ws://95.216.221.23:8080/")

  def sendClientRequest(): Unit = {}

  @JSExport
  def getNetState: NetState = this.netState
}