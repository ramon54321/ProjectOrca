// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package orca.protobuf.NetStateSetter

object NetStateSetterProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      orca.protobuf.NetStateSetter.NetStateSetterMessage,
      orca.protobuf.NetStateSetter.SetGameName,
      orca.protobuf.NetStateSetter.SetGameSeed
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Ci1zaGFyZWQvc3JjL21haW4vcHJvdG9idWYvTmV0U3RhdGVTZXR0ZXIucHJvdG8SDW9yY2EucHJvdG9idWYisgEKDk5ldFN0Y
  XRlU2V0dGVyEkcKCGdhbWVOYW1lGAEgASgLMhoub3JjYS5wcm90b2J1Zi5TZXRHYW1lTmFtZUIN4j8KEghnYW1lTmFtZUgAUghnY
  W1lTmFtZRJHCghnYW1lU2VlZBgCIAEoCzIaLm9yY2EucHJvdG9idWYuU2V0R2FtZVNlZWRCDeI/ChIIZ2FtZVNlZWRIAFIIZ2FtZ
  VNlZWRCDgoMc2VhbGVkX3ZhbHVlIiwKC1NldEdhbWVOYW1lEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZSIsCgtTZXRHY
  W1lU2VlZBIdCgRzZWVkGAEgASgNQgniPwYSBHNlZWRSBHNlZWRiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}