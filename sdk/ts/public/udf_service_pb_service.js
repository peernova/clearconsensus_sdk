/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/udf_service.proto

var public_udf_service_pb = require("../public/udf_service_pb");
var common_gateway_base_pb = require("../common/gateway_base_pb");
var common_udf_pb = require("../common/udf_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var UdfService = (function () {
  function UdfService() {}
  UdfService.serviceName = "titanium.UdfService";
  return UdfService;
}());

UdfService.ListUdfs = {
  methodName: "ListUdfs",
  service: UdfService,
  requestStream: false,
  responseStream: false,
  requestType: common_gateway_base_pb.ListRequest,
  responseType: common_udf_pb.ListUdfResponse
};

UdfService.GetUdfDefinition = {
  methodName: "GetUdfDefinition",
  service: UdfService,
  requestStream: false,
  responseStream: false,
  requestType: common_udf_pb.UdfNameRequest,
  responseType: common_udf_pb.GetUdfResponse
};

UdfService.DisableUdf = {
  methodName: "DisableUdf",
  service: UdfService,
  requestStream: false,
  responseStream: false,
  requestType: common_udf_pb.UdfNameRequest,
  responseType: common_gateway_base_pb.MessageResponse
};

exports.UdfService = UdfService;

function UdfServiceClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

UdfServiceClient.prototype.listUdfs = function listUdfs(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(UdfService.ListUdfs, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

UdfServiceClient.prototype.getUdfDefinition = function getUdfDefinition(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(UdfService.GetUdfDefinition, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

UdfServiceClient.prototype.disableUdf = function disableUdf(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(UdfService.DisableUdf, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

exports.UdfServiceClient = UdfServiceClient;

