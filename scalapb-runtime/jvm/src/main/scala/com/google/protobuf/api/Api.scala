// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api

import scala.collection.JavaConverters._

/** Api is a light-weight descriptor for a protocol buffer service.
  *
  * @param name
  *   The fully qualified name of this api, including package name
  *   followed by the api's simple name.
  * @param methods
  *   The methods of this api, in unspecified order.
  * @param options
  *   Any metadata attached to the API.
  * @param version
  *   A version string for this api. If specified, must have the form
  *   `major-version.minor-version`, as in `1.10`. If the minor version
  *   is omitted, it defaults to zero. If the entire version field is
  *   empty, the major version is derived from the package name, as
  *   outlined below. If the field is not empty, the version in the
  *   package name will be verified to be consistent with what is
  *   provided here.
  *  
  *   The versioning schema uses [semantic
  *   versioning](http://semver.org) where the major version number
  *   indicates a breaking change and the minor version an additive,
  *   non-breaking change. Both version numbers are signals to users
  *   what to expect from different versions, and should be carefully
  *   chosen based on the product plan.
  *  
  *   The major version is also reflected in the package name of the
  *   API, which must end in `v&lt;major-version&gt;`, as in
  *   `google.feature.v1`. For major versions 0 and 1, the suffix can
  *   be omitted. Zero major versions must only be used for
  *   experimental, none-GA apis.
  * @param sourceContext
  *   Source context for the protocol buffer service represented by this
  *   message.
  * @param mixins
  *   Included APIs. See [Mixin][].
  * @param syntax
  *   The source syntax of the service.
  */
@SerialVersionUID(0L)
final case class Api(
    name: String = "",
    methods: _root_.scala.collection.Seq[com.google.protobuf.api.Method] = _root_.scala.collection.Seq.empty,
    options: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.collection.Seq.empty,
    version: String = "",
    sourceContext: scala.Option[com.google.protobuf.source_context.SourceContext] = None,
    mixins: _root_.scala.collection.Seq[com.google.protobuf.api.Mixin] = _root_.scala.collection.Seq.empty,
    syntax: com.google.protobuf.`type`.Syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Api] with com.trueaccord.lenses.Updatable[Api] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      methods.foreach(methods => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(methods.serializedSize) + methods.serializedSize)
      options.foreach(options => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.serializedSize) + options.serializedSize)
      if (version != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, version) }
      if (sourceContext.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(sourceContext.get.serializedSize) + sourceContext.get.serializedSize }
      mixins.foreach(mixins => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(mixins.serializedSize) + mixins.serializedSize)
      if (syntax != com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(7, syntax.value) }
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
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      methods.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      options.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = version
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      sourceContext.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      mixins.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = syntax
        if (__v != com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) {
          _output__.writeEnum(7, __v.value)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.api.Api = {
      var __name = this.name
      val __methods = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.api.Method] ++= this.methods)
      val __options = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= this.options)
      var __version = this.version
      var __sourceContext = this.sourceContext
      val __mixins = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.api.Mixin] ++= this.mixins)
      var __syntax = this.syntax
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __methods += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.api.Method.defaultInstance)
          case 26 =>
            __options += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.OptionProto.defaultInstance)
          case 34 =>
            __version = _input__.readString()
          case 42 =>
            __sourceContext = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)))
          case 50 =>
            __mixins += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.api.Mixin.defaultInstance)
          case 56 =>
            __syntax = com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.api.Api(
          name = __name,
          methods = __methods.result(),
          options = __options.result(),
          version = __version,
          sourceContext = __sourceContext,
          mixins = __mixins.result(),
          syntax = __syntax
      )
    }
    def withName(__v: String): Api = copy(name = __v)
    def clearMethods = copy(methods = _root_.scala.collection.Seq.empty)
    def addMethods(__vs: com.google.protobuf.api.Method*): Api = addAllMethods(__vs)
    def addAllMethods(__vs: TraversableOnce[com.google.protobuf.api.Method]): Api = copy(methods = methods ++ __vs)
    def withMethods(__v: _root_.scala.collection.Seq[com.google.protobuf.api.Method]): Api = copy(methods = __v)
    def clearOptions = copy(options = _root_.scala.collection.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Api = addAllOptions(__vs)
    def addAllOptions(__vs: TraversableOnce[com.google.protobuf.`type`.OptionProto]): Api = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]): Api = copy(options = __v)
    def withVersion(__v: String): Api = copy(version = __v)
    def getSourceContext: com.google.protobuf.source_context.SourceContext = sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)
    def clearSourceContext: Api = copy(sourceContext = None)
    def withSourceContext(__v: com.google.protobuf.source_context.SourceContext): Api = copy(sourceContext = Some(__v))
    def clearMixins = copy(mixins = _root_.scala.collection.Seq.empty)
    def addMixins(__vs: com.google.protobuf.api.Mixin*): Api = addAllMixins(__vs)
    def addAllMixins(__vs: TraversableOnce[com.google.protobuf.api.Mixin]): Api = copy(mixins = mixins ++ __vs)
    def withMixins(__v: _root_.scala.collection.Seq[com.google.protobuf.api.Mixin]): Api = copy(mixins = __v)
    def withSyntax(__v: com.google.protobuf.`type`.Syntax): Api = copy(syntax = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => methods
        case 3 => options
        case 4 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 5 => sourceContext.orNull
        case 6 => mixins
        case 7 => {
          val __t = syntax.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(methods.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PRepeated(options.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PString(version)
        case 5 => sourceContext.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => _root_.scalapb.descriptors.PRepeated(mixins.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 7 => _root_.scalapb.descriptors.PEnum(syntax.scalaValueDescriptor)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.api.Api
}

object Api extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Api] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.api.Api, com.google.protobuf.Api] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Api] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.api.Api, com.google.protobuf.Api] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.api.Api): com.google.protobuf.Api = {
    val javaPbOut = com.google.protobuf.Api.newBuilder
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.addAllMethods(scalaPbSource.methods.map(com.google.protobuf.api.Method.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.addAllOptions(scalaPbSource.options.map(com.google.protobuf.`type`.OptionProto.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.setVersion(scalaPbSource.version)
    scalaPbSource.sourceContext.map(com.google.protobuf.source_context.SourceContext.toJavaProto).foreach(javaPbOut.setSourceContext)
    javaPbOut.addAllMixins(scalaPbSource.mixins.map(com.google.protobuf.api.Mixin.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.setSyntaxValue(scalaPbSource.syntax.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Api): com.google.protobuf.api.Api = com.google.protobuf.api.Api(
    name = javaPbSource.getName,
    methods = javaPbSource.getMethodsList.asScala.map(com.google.protobuf.api.Method.fromJavaProto)(_root_.scala.collection.breakOut),
    options = javaPbSource.getOptionsList.asScala.map(com.google.protobuf.`type`.OptionProto.fromJavaProto)(_root_.scala.collection.breakOut),
    version = javaPbSource.getVersion,
    sourceContext = if (javaPbSource.hasSourceContext) Some(com.google.protobuf.source_context.SourceContext.fromJavaProto(javaPbSource.getSourceContext)) else None,
    mixins = javaPbSource.getMixinsList.asScala.map(com.google.protobuf.api.Mixin.fromJavaProto)(_root_.scala.collection.breakOut),
    syntax = com.google.protobuf.`type`.Syntax.fromJavaValue(javaPbSource.getSyntax)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.api.Api = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.api.Api(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.api.Method]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[String],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.google.protobuf.source_context.SourceContext]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.api.Mixin]],
      com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.getOrElse(__fields.get(6), com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.api.Api] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.api.Api(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.api.Method]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[com.google.protobuf.source_context.SourceContext]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.api.Mixin]]).getOrElse(_root_.scala.collection.Seq.empty),
        com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.api.Method
      case 3 => __out = com.google.protobuf.`type`.OptionProto
      case 5 => __out = com.google.protobuf.source_context.SourceContext
      case 6 => __out = com.google.protobuf.api.Mixin
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 7 => com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = com.google.protobuf.api.Api(
  )
  implicit class ApiLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.api.Api]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.api.Api](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def methods: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.api.Method]] = field(_.methods)((c_, f_) => c_.copy(methods = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def version: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def sourceContext: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext] = field(_.getSourceContext)((c_, f_) => c_.copy(sourceContext = Some(f_)))
    def optionalSourceContext: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.source_context.SourceContext]] = field(_.sourceContext)((c_, f_) => c_.copy(sourceContext = f_))
    def mixins: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.api.Mixin]] = field(_.mixins)((c_, f_) => c_.copy(mixins = f_))
    def syntax: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val METHODS_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  final val VERSION_FIELD_NUMBER = 4
  final val SOURCE_CONTEXT_FIELD_NUMBER = 5
  final val MIXINS_FIELD_NUMBER = 6
  final val SYNTAX_FIELD_NUMBER = 7
}
