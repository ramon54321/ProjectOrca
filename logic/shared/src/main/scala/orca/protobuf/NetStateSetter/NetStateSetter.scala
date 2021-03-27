// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package orca.protobuf.NetStateSetter

sealed trait NetStateSetter extends scalapb.GeneratedSealedOneof {
  type MessageType = orca.protobuf.NetStateSetter.NetStateSetterMessage
  final def isEmpty = this.isInstanceOf[orca.protobuf.NetStateSetter.NetStateSetter.Empty.type]
  final def isDefined = !isEmpty
  final def asMessage: orca.protobuf.NetStateSetter.NetStateSetterMessage = orca.protobuf.NetStateSetter.NetStateSetter.NetStateSetterTypeMapper.toBase(this)
  final def asNonEmpty: Option[orca.protobuf.NetStateSetter.NetStateSetter.NonEmpty] = if (isEmpty) None else Some(this.asInstanceOf[orca.protobuf.NetStateSetter.NetStateSetter.NonEmpty])
}

object NetStateSetter {
  case object Empty extends orca.protobuf.NetStateSetter.NetStateSetter
  
  sealed trait NonEmpty extends orca.protobuf.NetStateSetter.NetStateSetter
  def defaultInstance: orca.protobuf.NetStateSetter.NetStateSetter = Empty
  
  implicit val NetStateSetterTypeMapper: _root_.scalapb.TypeMapper[orca.protobuf.NetStateSetter.NetStateSetterMessage, orca.protobuf.NetStateSetter.NetStateSetter] = new _root_.scalapb.TypeMapper[orca.protobuf.NetStateSetter.NetStateSetterMessage, orca.protobuf.NetStateSetter.NetStateSetter] {
    override def toCustom(__base: orca.protobuf.NetStateSetter.NetStateSetterMessage): orca.protobuf.NetStateSetter.NetStateSetter = __base.sealedValue match {
      case __v: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName => __v.value
      case __v: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed => __v.value
      case orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty => Empty
    }
    override def toBase(__custom: orca.protobuf.NetStateSetter.NetStateSetter): orca.protobuf.NetStateSetter.NetStateSetterMessage = orca.protobuf.NetStateSetter.NetStateSetterMessage(__custom match {
      case __v: orca.protobuf.NetStateSetter.SetGameName => orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName(__v)
      case __v: orca.protobuf.NetStateSetter.SetGameSeed => orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed(__v)
      case Empty => orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty
    })
  }
}
@SerialVersionUID(0L)
final case class NetStateSetterMessage(
    sealedValue: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[NetStateSetterMessage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (sealedValue.gameName.isDefined) {
        val __value = sealedValue.gameName.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.gameSeed.isDefined) {
        val __value = sealedValue.gameSeed.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      sealedValue.gameName.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.gameSeed.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getGameName: orca.protobuf.NetStateSetter.SetGameName = sealedValue.gameName.getOrElse(orca.protobuf.NetStateSetter.SetGameName.defaultInstance)
    def withGameName(__v: orca.protobuf.NetStateSetter.SetGameName): NetStateSetterMessage = copy(sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName(__v))
    def getGameSeed: orca.protobuf.NetStateSetter.SetGameSeed = sealedValue.gameSeed.getOrElse(orca.protobuf.NetStateSetter.SetGameSeed.defaultInstance)
    def withGameSeed(__v: orca.protobuf.NetStateSetter.SetGameSeed): NetStateSetterMessage = copy(sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed(__v))
    def clearSealedValue: NetStateSetterMessage = copy(sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty)
    def withSealedValue(__v: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue): NetStateSetterMessage = copy(sealedValue = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => sealedValue.gameName.orNull
        case 2 => sealedValue.gameSeed.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => sealedValue.gameName.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => sealedValue.gameSeed.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = orca.protobuf.NetStateSetter.NetStateSetterMessage
    def toNetStateSetter: orca.protobuf.NetStateSetter.NetStateSetter = orca.protobuf.NetStateSetter.NetStateSetter.NetStateSetterTypeMapper.toCustom(this)
    // @@protoc_insertion_point(GeneratedMessage[orca.protobuf.NetStateSetter])
}

object NetStateSetterMessage extends scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.NetStateSetterMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.NetStateSetterMessage] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): orca.protobuf.NetStateSetter.NetStateSetterMessage = {
    var __sealedValue: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName(__sealedValue.gameName.fold(_root_.scalapb.LiteParser.readMessage[orca.protobuf.NetStateSetter.SetGameName](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 18 =>
          __sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed(__sealedValue.gameSeed.fold(_root_.scalapb.LiteParser.readMessage[orca.protobuf.NetStateSetter.SetGameSeed](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    orca.protobuf.NetStateSetter.NetStateSetterMessage(
        sealedValue = __sealedValue,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[orca.protobuf.NetStateSetter.NetStateSetterMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      orca.protobuf.NetStateSetter.NetStateSetterMessage(
        sealedValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[orca.protobuf.NetStateSetter.SetGameName]]).map(orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName(_))
            .orElse[orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue](__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[orca.protobuf.NetStateSetter.SetGameSeed]]).map(orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed(_)))
            .getOrElse(orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = NetStateSetterProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = NetStateSetterProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = orca.protobuf.NetStateSetter.SetGameName
      case 2 => __out = orca.protobuf.NetStateSetter.SetGameSeed
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = orca.protobuf.NetStateSetter.NetStateSetterMessage(
    sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.Empty
  )
  sealed trait SealedValue extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isGameName: _root_.scala.Boolean = false
    def isGameSeed: _root_.scala.Boolean = false
    def gameName: _root_.scala.Option[orca.protobuf.NetStateSetter.SetGameName] = _root_.scala.None
    def gameSeed: _root_.scala.Option[orca.protobuf.NetStateSetter.SetGameSeed] = _root_.scala.None
  }
  object SealedValue {
    @SerialVersionUID(0L)
    case object Empty extends orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class GameName(value: orca.protobuf.NetStateSetter.SetGameName) extends orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue {
      type ValueType = orca.protobuf.NetStateSetter.SetGameName
      override def isGameName: _root_.scala.Boolean = true
      override def gameName: _root_.scala.Option[orca.protobuf.NetStateSetter.SetGameName] = Some(value)
      override def number: _root_.scala.Int = 1
    }
    @SerialVersionUID(0L)
    final case class GameSeed(value: orca.protobuf.NetStateSetter.SetGameSeed) extends orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue {
      type ValueType = orca.protobuf.NetStateSetter.SetGameSeed
      override def isGameSeed: _root_.scala.Boolean = true
      override def gameSeed: _root_.scala.Option[orca.protobuf.NetStateSetter.SetGameSeed] = Some(value)
      override def number: _root_.scala.Int = 2
    }
  }
  implicit class NetStateSetterMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.NetStateSetterMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, orca.protobuf.NetStateSetter.NetStateSetterMessage](_l) {
    def gameName: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.SetGameName] = field(_.getGameName)((c_, f_) => c_.copy(sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameName(f_)))
    def gameSeed: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.SetGameSeed] = field(_.getGameSeed)((c_, f_) => c_.copy(sealedValue = orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue.GameSeed(f_)))
    def sealedValue: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue] = field(_.sealedValue)((c_, f_) => c_.copy(sealedValue = f_))
  }
  final val GAMENAME_FIELD_NUMBER = 1
  final val GAMESEED_FIELD_NUMBER = 2
  def of(
    sealedValue: orca.protobuf.NetStateSetter.NetStateSetterMessage.SealedValue
  ): _root_.orca.protobuf.NetStateSetter.NetStateSetterMessage = _root_.orca.protobuf.NetStateSetter.NetStateSetterMessage(
    sealedValue
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[orca.protobuf.NetStateSetter])
}

@SerialVersionUID(0L)
final case class SetGameName(
    name: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with orca.protobuf.NetStateSetter.NetStateSetter.NonEmpty with scalapb.lenses.Updatable[SetGameName] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): SetGameName = copy(name = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = orca.protobuf.NetStateSetter.SetGameName
    // @@protoc_insertion_point(GeneratedMessage[orca.protobuf.SetGameName])
}

object SetGameName extends scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.SetGameName] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.SetGameName] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): orca.protobuf.NetStateSetter.SetGameName = {
    var __name: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    orca.protobuf.NetStateSetter.SetGameName(
        name = __name,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[orca.protobuf.NetStateSetter.SetGameName] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      orca.protobuf.NetStateSetter.SetGameName(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = NetStateSetterProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = NetStateSetterProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = orca.protobuf.NetStateSetter.SetGameName(
    name = ""
  )
  implicit class SetGameNameLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.SetGameName]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, orca.protobuf.NetStateSetter.SetGameName](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  def of(
    name: _root_.scala.Predef.String
  ): _root_.orca.protobuf.NetStateSetter.SetGameName = _root_.orca.protobuf.NetStateSetter.SetGameName(
    name
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[orca.protobuf.SetGameName])
}

@SerialVersionUID(0L)
final case class SetGameSeed(
    seed: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with orca.protobuf.NetStateSetter.NetStateSetter.NonEmpty with scalapb.lenses.Updatable[SetGameSeed] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = seed
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = seed
        if (__v != 0) {
          _output__.writeUInt32(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withSeed(__v: _root_.scala.Int): SetGameSeed = copy(seed = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = seed
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(seed)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = orca.protobuf.NetStateSetter.SetGameSeed
    // @@protoc_insertion_point(GeneratedMessage[orca.protobuf.SetGameSeed])
}

object SetGameSeed extends scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.SetGameSeed] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[orca.protobuf.NetStateSetter.SetGameSeed] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): orca.protobuf.NetStateSetter.SetGameSeed = {
    var __seed: _root_.scala.Int = 0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __seed = _input__.readUInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    orca.protobuf.NetStateSetter.SetGameSeed(
        seed = __seed,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[orca.protobuf.NetStateSetter.SetGameSeed] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      orca.protobuf.NetStateSetter.SetGameSeed(
        seed = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = NetStateSetterProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = NetStateSetterProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = orca.protobuf.NetStateSetter.SetGameSeed(
    seed = 0
  )
  implicit class SetGameSeedLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, orca.protobuf.NetStateSetter.SetGameSeed]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, orca.protobuf.NetStateSetter.SetGameSeed](_l) {
    def seed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.seed)((c_, f_) => c_.copy(seed = f_))
  }
  final val SEED_FIELD_NUMBER = 1
  def of(
    seed: _root_.scala.Int
  ): _root_.orca.protobuf.NetStateSetter.SetGameSeed = _root_.orca.protobuf.NetStateSetter.SetGameSeed(
    seed
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[orca.protobuf.SetGameSeed])
}
