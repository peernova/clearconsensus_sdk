/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/operator_service.proto

var public_operator_service_pb = require("../public/operator_service_pb");
var google_protobuf_empty_pb = require("google-protobuf/google/protobuf/empty_pb");
var common_gateway_base_pb = require("../common/gateway_base_pb");
var common_assets_pb = require("../common/assets_pb");
var common_data_pb = require("../common/data_pb");
var common_outliers_pb = require("../common/outliers_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var OperatorServicePrivate = (function () {
  function OperatorServicePrivate() {}
  OperatorServicePrivate.serviceName = "titanium.OperatorServicePrivate";
  return OperatorServicePrivate;
}());

OperatorServicePrivate.AddClient = {
  methodName: "AddClient",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.ClientName,
  responseType: common_gateway_base_pb.MessageResponse
};

OperatorServicePrivate.ListClients = {
  methodName: "ListClients",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: google_protobuf_empty_pb.Empty,
  responseType: public_operator_service_pb.ListClientsResponse
};

OperatorServicePrivate.EvpStatuses = {
  methodName: "EvpStatuses",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.EvpStatusesRequest,
  responseType: public_operator_service_pb.EvpStatusesResponse
};

OperatorServicePrivate.UploadEVP = {
  methodName: "UploadEVP",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.UploadEVPRequest,
  responseType: common_gateway_base_pb.UploadURLResponse
};

OperatorServicePrivate.UploadDTCC = {
  methodName: "UploadDTCC",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.UploadDTCCRequest,
  responseType: common_gateway_base_pb.UploadURLResponse
};

OperatorServicePrivate.OperatorOutliers = {
  methodName: "OperatorOutliers",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.OperatorOutliersRequest,
  responseType: public_operator_service_pb.OperatorOutliersResponse
};

OperatorServicePrivate.Outliers = {
  methodName: "Outliers",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: common_outliers_pb.OutliersRequest,
  responseType: common_outliers_pb.OutliersResponse
};

OperatorServicePrivate.CreateSupportedFields = {
  methodName: "CreateSupportedFields",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.SupportedFieldsValues,
  responseType: common_gateway_base_pb.MessageResponse
};

OperatorServicePrivate.AddSupportedFields = {
  methodName: "AddSupportedFields",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.SupportedFieldsValues,
  responseType: common_gateway_base_pb.MessageResponse
};

OperatorServicePrivate.DeleteSupportedFields = {
  methodName: "DeleteSupportedFields",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.SupportedFieldsValues,
  responseType: common_gateway_base_pb.MessageResponse
};

OperatorServicePrivate.ExportReport = {
  methodName: "ExportReport",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: common_data_pb.ExportReportRequest,
  responseType: common_data_pb.ExportResponse
};

OperatorServicePrivate.AddAsset = {
  methodName: "AddAsset",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: public_operator_service_pb.AddAssetRequest,
  responseType: common_gateway_base_pb.MessageResponse
};

OperatorServicePrivate.RecentAssets = {
  methodName: "RecentAssets",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: common_assets_pb.RecentAssetsRequest,
  responseType: common_assets_pb.RecentAssetsResponse
};

OperatorServicePrivate.Assets = {
  methodName: "Assets",
  service: OperatorServicePrivate,
  requestStream: false,
  responseStream: false,
  requestType: common_assets_pb.AssetsRequest,
  responseType: common_assets_pb.AssetsResponse
};

exports.OperatorServicePrivate = OperatorServicePrivate;

function OperatorServicePrivateClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

OperatorServicePrivateClient.prototype.addClient = function addClient(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.AddClient, {
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

OperatorServicePrivateClient.prototype.listClients = function listClients(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.ListClients, {
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

OperatorServicePrivateClient.prototype.evpStatuses = function evpStatuses(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.EvpStatuses, {
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

OperatorServicePrivateClient.prototype.uploadEVP = function uploadEVP(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.UploadEVP, {
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

OperatorServicePrivateClient.prototype.uploadDTCC = function uploadDTCC(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.UploadDTCC, {
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

OperatorServicePrivateClient.prototype.operatorOutliers = function operatorOutliers(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.OperatorOutliers, {
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

OperatorServicePrivateClient.prototype.outliers = function outliers(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.Outliers, {
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

OperatorServicePrivateClient.prototype.createSupportedFields = function createSupportedFields(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.CreateSupportedFields, {
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

OperatorServicePrivateClient.prototype.addSupportedFields = function addSupportedFields(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.AddSupportedFields, {
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

OperatorServicePrivateClient.prototype.deleteSupportedFields = function deleteSupportedFields(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.DeleteSupportedFields, {
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

OperatorServicePrivateClient.prototype.exportReport = function exportReport(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.ExportReport, {
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

OperatorServicePrivateClient.prototype.addAsset = function addAsset(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.AddAsset, {
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

OperatorServicePrivateClient.prototype.recentAssets = function recentAssets(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.RecentAssets, {
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

OperatorServicePrivateClient.prototype.assets = function assets(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(OperatorServicePrivate.Assets, {
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

exports.OperatorServicePrivateClient = OperatorServicePrivateClient;
