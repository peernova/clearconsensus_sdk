/* eslint-disable */
/*Generated by GenDocu.com*/
// source: common/usermanagement_error.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.com.peernova.titanium.casbin.management.grpc.proto.Error', null, global);
goog.exportSymbol('proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.com.peernova.titanium.casbin.management.grpc.proto.Error.repeatedFields_, null);
};
goog.inherits(proto.com.peernova.titanium.casbin.management.grpc.proto.Error, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.com.peernova.titanium.casbin.management.grpc.proto.Error.displayName = 'proto.com.peernova.titanium.casbin.management.grpc.proto.Error';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.displayName = 'proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.repeatedFields_ = [3];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.toObject = function(opt_includeInstance) {
  return proto.com.peernova.titanium.casbin.management.grpc.proto.Error.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.toObject = function(includeInstance, msg) {
  var f, obj = {
    code: jspb.Message.getFieldWithDefault(msg, 1, 0),
    message: jspb.Message.getFieldWithDefault(msg, 2, ""),
    validationerrordetailsList: jspb.Message.toObjectList(msg.getValidationerrordetailsList(),
    proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.peernova.titanium.casbin.management.grpc.proto.Error;
  return proto.com.peernova.titanium.casbin.management.grpc.proto.Error.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setCode(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMessage(value);
      break;
    case 3:
      var value = new proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail;
      reader.readMessage(value,proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.deserializeBinaryFromReader);
      msg.addValidationerrordetails(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.peernova.titanium.casbin.management.grpc.proto.Error.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCode();
  if (f !== 0) {
    writer.writeInt32(
      1,
      f
    );
  }
  f = message.getMessage();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getValidationerrordetailsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.serializeBinaryToWriter
    );
  }
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.toObject = function(opt_includeInstance) {
  return proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.toObject = function(includeInstance, msg) {
  var f, obj = {
    fieldname: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail;
  return proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFieldname(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFieldname();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string fieldName = 1;
 * @return {string}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.getFieldname = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail} returns this
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.setFieldname = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail} returns this
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional int32 code = 1;
 * @return {number}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.getCode = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} returns this
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.setCode = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string message = 2;
 * @return {string}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.getMessage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} returns this
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.setMessage = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated ValidationErrorDetail validationErrorDetails = 3;
 * @return {!Array<!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail>}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.getValidationerrordetailsList = function() {
  return /** @type{!Array<!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail, 3));
};


/**
 * @param {!Array<!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail>} value
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} returns this
*/
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.setValidationerrordetailsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail=} opt_value
 * @param {number=} opt_index
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail}
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.addValidationerrordetails = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.com.peernova.titanium.casbin.management.grpc.proto.Error.ValidationErrorDetail, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.com.peernova.titanium.casbin.management.grpc.proto.Error} returns this
 */
proto.com.peernova.titanium.casbin.management.grpc.proto.Error.prototype.clearValidationerrordetailsList = function() {
  return this.setValidationerrordetailsList([]);
};


goog.object.extend(exports, proto.com.peernova.titanium.casbin.management.grpc.proto);