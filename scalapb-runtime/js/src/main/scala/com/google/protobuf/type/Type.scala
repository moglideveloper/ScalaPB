// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`



/** A protocol buffer message type.
  *
  * @param name
  *   The fully qualified message name.
  * @param fields
  *   The list of fields.
  * @param oneofs
  *   The list of types appearing in `oneof` definitions in this type.
  * @param options
  *   The protocol buffer options.
  * @param sourceContext
  *   The source context.
  * @param syntax
  *   The source syntax.
  */
@SerialVersionUID(0L)
final case class Type(
    name: String = "",
    fields: scala.collection.Seq[com.google.protobuf.`type`.Field] = Nil,
    oneofs: scala.collection.Seq[String] = Nil,
    options: scala.collection.Seq[com.google.protobuf.`type`.OptionProto] = Nil,
    sourceContext: scala.Option[com.google.protobuf.source_context.SourceContext] = None,
    syntax: com.google.protobuf.`type`.Syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Type] with com.trueaccord.lenses.Updatable[Type] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      fields.foreach(fields => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(fields.serializedSize) + fields.serializedSize)
      oneofs.foreach(oneofs => __size += com.google.protobuf.CodedOutputStream.computeStringSize(3, oneofs))
      options.foreach(options => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.serializedSize) + options.serializedSize)
      if (sourceContext.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(sourceContext.get.serializedSize) + sourceContext.get.serializedSize }
      if (syntax != com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) { __size += com.google.protobuf.CodedOutputStream.computeEnumSize(6, syntax.value) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      fields.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      oneofs.foreach { __v =>
        _output__.writeString(3, __v)
      };
      options.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      sourceContext.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = syntax
        if (__v != com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) {
          _output__.writeEnum(6, __v.value)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.Type = {
      var __name = this.name
      val __fields = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.Field] ++= this.fields)
      val __oneofs = (scala.collection.immutable.Vector.newBuilder[String] ++= this.oneofs)
      val __options = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= this.options)
      var __sourceContext = this.sourceContext
      var __syntax = this.syntax
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __fields += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.Field.defaultInstance)
          case 26 =>
            __oneofs += _input__.readString()
          case 34 =>
            __options += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.OptionProto.defaultInstance)
          case 42 =>
            __sourceContext = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)))
          case 48 =>
            __syntax = com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.`type`.Type(
          name = __name,
          fields = __fields.result(),
          oneofs = __oneofs.result(),
          options = __options.result(),
          sourceContext = __sourceContext,
          syntax = __syntax
      )
    }
    def withName(__v: String): Type = copy(name = __v)
    def clearFields = copy(fields = scala.collection.Seq.empty)
    def addFields(__vs: com.google.protobuf.`type`.Field*): Type = addAllFields(__vs)
    def addAllFields(__vs: TraversableOnce[com.google.protobuf.`type`.Field]): Type = copy(fields = fields ++ __vs)
    def withFields(__v: scala.collection.Seq[com.google.protobuf.`type`.Field]): Type = copy(fields = __v)
    def clearOneofs = copy(oneofs = scala.collection.Seq.empty)
    def addOneofs(__vs: String*): Type = addAllOneofs(__vs)
    def addAllOneofs(__vs: TraversableOnce[String]): Type = copy(oneofs = oneofs ++ __vs)
    def withOneofs(__v: scala.collection.Seq[String]): Type = copy(oneofs = __v)
    def clearOptions = copy(options = scala.collection.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Type = addAllOptions(__vs)
    def addAllOptions(__vs: TraversableOnce[com.google.protobuf.`type`.OptionProto]): Type = copy(options = options ++ __vs)
    def withOptions(__v: scala.collection.Seq[com.google.protobuf.`type`.OptionProto]): Type = copy(options = __v)
    def getSourceContext: com.google.protobuf.source_context.SourceContext = sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)
    def clearSourceContext: Type = copy(sourceContext = None)
    def withSourceContext(__v: com.google.protobuf.source_context.SourceContext): Type = copy(sourceContext = Some(__v))
    def withSyntax(__v: com.google.protobuf.`type`.Syntax): Type = copy(syntax = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => fields
        case 3 => oneofs
        case 4 => options
        case 5 => sourceContext.getOrElse(null)
        case 6 => {
          val __t = syntax.valueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.Type
}

object Type extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Type] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Type] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.`type`.Type = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.`type`.Type(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.`type`.Field]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[scala.collection.Seq[String]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.`type`.OptionProto]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.google.protobuf.source_context.SourceContext]],
      com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.getOrElse(__fields.get(5), com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.valueDescriptor).asInstanceOf[com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber)
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = TypeProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.`type`.Field
      case 4 => __out = com.google.protobuf.`type`.OptionProto
      case 5 => __out = com.google.protobuf.source_context.SourceContext
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    __field.getNumber match {
      case 6 => com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = com.google.protobuf.`type`.Type(
  )
  implicit class TypeLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Type]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.Type](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def fields: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.`type`.Field]] = field(_.fields)((c_, f_) => c_.copy(fields = f_))
    def oneofs: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[String]] = field(_.oneofs)((c_, f_) => c_.copy(oneofs = f_))
    def options: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def sourceContext: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext] = field(_.getSourceContext)((c_, f_) => c_.copy(sourceContext = Some(f_)))
    def optionalSourceContext: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.source_context.SourceContext]] = field(_.sourceContext)((c_, f_) => c_.copy(sourceContext = f_))
    def syntax: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val FIELDS_FIELD_NUMBER = 2
  final val ONEOFS_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val SOURCE_CONTEXT_FIELD_NUMBER = 5
  final val SYNTAX_FIELD_NUMBER = 6
}