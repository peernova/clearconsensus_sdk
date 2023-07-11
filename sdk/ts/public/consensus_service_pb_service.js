/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/consensus_service.proto

var public_consensus_service_pb = require("../public/consensus_service_pb");
var common_gateway_base_pb = require("../common/gateway_base_pb");
var common_consensus_pb = require("../common/consensus_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var ConsensusService = (function () {
  function ConsensusService() {}
  ConsensusService.serviceName = "titanium.ConsensusService";
  return ConsensusService;
}());

ConsensusService.ConsensusTimestamps = {
  methodName: "ConsensusTimestamps",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusTimestampsRequest,
  responseType: common_consensus_pb.ConsensusTimestampsResponse
};

ConsensusService.Consensus = {
  methodName: "Consensus",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusRequest,
  responseType: common_consensus_pb.ConsensusResponse
};

ConsensusService.EvaluatedPrice = {
  methodName: "EvaluatedPrice",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.EVPRequest,
  responseType: common_consensus_pb.EVPResponse
};

ConsensusService.ConsensusOutliers = {
  methodName: "ConsensusOutliers",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_gateway_base_pb.OutliersListRequest,
  responseType: common_gateway_base_pb.ConsensusActiveResponse
};

ConsensusService.GetConsensusRuns = {
  methodName: "GetConsensusRuns",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.GetConsensusRunsRequest,
  responseType: common_consensus_pb.GetConsensusRunsResponse
};

ConsensusService.ConsensusExplorerInstrumentDetails = {
  methodName: "ConsensusExplorerInstrumentDetails",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: public_consensus_service_pb.ConsensusExplorerRequest,
  responseType: public_consensus_service_pb.ConsensusExplorerInstrumentDetailsResponse
};

ConsensusService.ConsensusExplorerTable = {
  methodName: "ConsensusExplorerTable",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: public_consensus_service_pb.ConsensusExplorerRequest,
  responseType: public_consensus_service_pb.ConsensusExplorerTableResponse
};

ConsensusService.ConsensusExplorerRanges = {
  methodName: "ConsensusExplorerRanges",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: public_consensus_service_pb.ConsensusExplorerRequest,
  responseType: public_consensus_service_pb.ConsensusExplorerRangeResponse
};

ConsensusService.CohortConsensusTab = {
  methodName: "CohortConsensusTab",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: public_consensus_service_pb.ConsensusTabRequest,
  responseType: common_consensus_pb.ConsensusResultSetValuesResponse
};

ConsensusService.SubmissionEvidenceTab = {
  methodName: "SubmissionEvidenceTab",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: public_consensus_service_pb.ConsensusTabRequest,
  responseType: common_consensus_pb.ConsensusResultSetValuesResponse
};

ConsensusService.ConsensusActive = {
  methodName: "ConsensusActive",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusActiveRequest,
  responseType: common_gateway_base_pb.ConsensusActiveResponse
};

ConsensusService.ConsensusToPublish = {
  methodName: "ConsensusToPublish",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusToPublishRequest,
  responseType: common_consensus_pb.ConsensusToPublishResponse
};

ConsensusService.ConsensusPublish = {
  methodName: "ConsensusPublish",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusPublishRequest,
  responseType: common_gateway_base_pb.MessageResponse
};

ConsensusService.ConsensusHistory = {
  methodName: "ConsensusHistory",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusHistoryRequest,
  responseType: common_consensus_pb.ConsensusHistoryResponse
};

ConsensusService.ConsensusDecision = {
  methodName: "ConsensusDecision",
  service: ConsensusService,
  requestStream: false,
  responseStream: false,
  requestType: common_consensus_pb.ConsensusDecisionRequest,
  responseType: common_gateway_base_pb.MessageResponse
};

exports.ConsensusService = ConsensusService;

function ConsensusServiceClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

ConsensusServiceClient.prototype.consensusTimestamps = function consensusTimestamps(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusTimestamps, {
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

ConsensusServiceClient.prototype.consensus = function consensus(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.Consensus, {
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

ConsensusServiceClient.prototype.evaluatedPrice = function evaluatedPrice(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.EvaluatedPrice, {
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

ConsensusServiceClient.prototype.consensusOutliers = function consensusOutliers(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusOutliers, {
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

ConsensusServiceClient.prototype.getConsensusRuns = function getConsensusRuns(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.GetConsensusRuns, {
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

ConsensusServiceClient.prototype.consensusExplorerInstrumentDetails = function consensusExplorerInstrumentDetails(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusExplorerInstrumentDetails, {
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

ConsensusServiceClient.prototype.consensusExplorerTable = function consensusExplorerTable(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusExplorerTable, {
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

ConsensusServiceClient.prototype.consensusExplorerRanges = function consensusExplorerRanges(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusExplorerRanges, {
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

ConsensusServiceClient.prototype.cohortConsensusTab = function cohortConsensusTab(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.CohortConsensusTab, {
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

ConsensusServiceClient.prototype.submissionEvidenceTab = function submissionEvidenceTab(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.SubmissionEvidenceTab, {
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

ConsensusServiceClient.prototype.consensusActive = function consensusActive(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusActive, {
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

ConsensusServiceClient.prototype.consensusToPublish = function consensusToPublish(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusToPublish, {
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

ConsensusServiceClient.prototype.consensusPublish = function consensusPublish(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusPublish, {
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

ConsensusServiceClient.prototype.consensusHistory = function consensusHistory(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusHistory, {
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

ConsensusServiceClient.prototype.consensusDecision = function consensusDecision(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(ConsensusService.ConsensusDecision, {
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

exports.ConsensusServiceClient = ConsensusServiceClient;

