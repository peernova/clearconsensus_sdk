/* eslint-disable */
/*Generated by GenDocu.com*/
// package: com.peernova.titanium.casbin.management.grpc.service
// file: public/usermanagement_entity_service.proto

var public_usermanagement_entity_service_pb = require("../public/usermanagement_entity_service_pb");
var common_usermanagement_entity_pb = require("../common/usermanagement_entity_pb");
var common_usermanagement_fe_specific_pb = require("../common/usermanagement_fe_specific_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var EntityService = (function () {
  function EntityService() {}
  EntityService.serviceName = "com.peernova.titanium.casbin.management.grpc.service.EntityService";
  return EntityService;
}());

EntityService.create = {
  methodName: "create",
  service: EntityService,
  requestStream: false,
  responseStream: false,
  requestType: common_usermanagement_entity_pb.EntityDto,
  responseType: common_usermanagement_entity_pb.EntityResponse
};

EntityService.update = {
  methodName: "update",
  service: EntityService,
  requestStream: false,
  responseStream: false,
  requestType: common_usermanagement_entity_pb.EntityDto,
  responseType: common_usermanagement_entity_pb.EntityResponse
};

EntityService.getById = {
  methodName: "getById",
  service: EntityService,
  requestStream: false,
  responseStream: false,
  requestType: common_usermanagement_entity_pb.EntityId,
  responseType: common_usermanagement_entity_pb.EntityResponse
};

EntityService.getAllEnabledOnly = {
  methodName: "getAllEnabledOnly",
  service: EntityService,
  requestStream: false,
  responseStream: false,
  requestType: common_usermanagement_fe_specific_pb.NoParameters,
  responseType: common_usermanagement_entity_pb.EntitiesResponse
};

EntityService.find = {
  methodName: "find",
  service: EntityService,
  requestStream: false,
  responseStream: false,
  requestType: common_usermanagement_fe_specific_pb.SearchCriteria,
  responseType: common_usermanagement_fe_specific_pb.TableResponse
};

exports.EntityService = EntityService;

function EntityServiceClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

EntityServiceClient.prototype.create = function create(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(EntityService.create, {
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

EntityServiceClient.prototype.update = function update(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(EntityService.update, {
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

EntityServiceClient.prototype.getById = function getById(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(EntityService.getById, {
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

EntityServiceClient.prototype.getAllEnabledOnly = function getAllEnabledOnly(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(EntityService.getAllEnabledOnly, {
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

EntityServiceClient.prototype.find = function find(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(EntityService.find, {
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

exports.EntityServiceClient = EntityServiceClient;

