/* eslint-disable */
/*Generated by GenDocu.com*/
// package: com.peernova.titanium.casbin.management.grpc.service
// file: public/usermanagement_policy_service.proto

import * as public_usermanagement_policy_service_pb from "../public/usermanagement_policy_service_pb";
import * as common_usermanagement_policy_pb from "../common/usermanagement_policy_pb";
import * as common_usermanagement_fe_specific_pb from "../common/usermanagement_fe_specific_pb";
import {grpc} from "@improbable-eng/grpc-web";

type PolicyServicecreate = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.Policies;
  readonly responseType: typeof common_usermanagement_fe_specific_pb.OperationSuccess;
};

type PolicyServicegetPolicies = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.PolicyType;
  readonly responseType: typeof common_usermanagement_policy_pb.PoliciesResponse;
};

type PolicyServiceremovePolicy = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.PolicyDto;
  readonly responseType: typeof common_usermanagement_fe_specific_pb.OperationSuccess;
};

type PolicyServicecheckPolicy = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.PolicyDto;
  readonly responseType: typeof common_usermanagement_fe_specific_pb.OperationSuccess;
};

type PolicyServicegetAssets = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.UsernamePermissionRequest;
  readonly responseType: typeof common_usermanagement_policy_pb.PoliciesListResponse;
};

type PolicyServicegetApis = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.UsernamePermissionRequest;
  readonly responseType: typeof common_usermanagement_policy_pb.PoliciesListResponse;
};

type PolicyServicegetAddons = {
  readonly methodName: string;
  readonly service: typeof PolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.UsernamePermissionRequest;
  readonly responseType: typeof common_usermanagement_policy_pb.PoliciesListResponse;
};

export class PolicyService {
  static readonly serviceName: string;
  static readonly create: PolicyServicecreate;
  static readonly getPolicies: PolicyServicegetPolicies;
  static readonly removePolicy: PolicyServiceremovePolicy;
  static readonly checkPolicy: PolicyServicecheckPolicy;
  static readonly getAssets: PolicyServicegetAssets;
  static readonly getApis: PolicyServicegetApis;
  static readonly getAddons: PolicyServicegetAddons;
}

export type ServiceError = { message: string, code: number; metadata: grpc.Metadata }
export type Status = { details: string, code: number; metadata: grpc.Metadata }

interface UnaryResponse {
  cancel(): void;
}
interface ResponseStream<T> {
  cancel(): void;
  on(type: 'data', handler: (message: T) => void): ResponseStream<T>;
  on(type: 'end', handler: (status?: Status) => void): ResponseStream<T>;
  on(type: 'status', handler: (status: Status) => void): ResponseStream<T>;
}
interface RequestStream<T> {
  write(message: T): RequestStream<T>;
  end(): void;
  cancel(): void;
  on(type: 'end', handler: (status?: Status) => void): RequestStream<T>;
  on(type: 'status', handler: (status: Status) => void): RequestStream<T>;
}
interface BidirectionalStream<ReqT, ResT> {
  write(message: ReqT): BidirectionalStream<ReqT, ResT>;
  end(): void;
  cancel(): void;
  on(type: 'data', handler: (message: ResT) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'end', handler: (status?: Status) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'status', handler: (status: Status) => void): BidirectionalStream<ReqT, ResT>;
}

export class PolicyServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  create(
    requestMessage: common_usermanagement_policy_pb.Policies,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  create(
    requestMessage: common_usermanagement_policy_pb.Policies,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  getPolicies(
    requestMessage: common_usermanagement_policy_pb.PolicyType,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesResponse|null) => void
  ): UnaryResponse;
  getPolicies(
    requestMessage: common_usermanagement_policy_pb.PolicyType,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesResponse|null) => void
  ): UnaryResponse;
  removePolicy(
    requestMessage: common_usermanagement_policy_pb.PolicyDto,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  removePolicy(
    requestMessage: common_usermanagement_policy_pb.PolicyDto,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  checkPolicy(
    requestMessage: common_usermanagement_policy_pb.PolicyDto,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  checkPolicy(
    requestMessage: common_usermanagement_policy_pb.PolicyDto,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  getAssets(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
  getAssets(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
  getApis(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
  getApis(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
  getAddons(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
  getAddons(
    requestMessage: common_usermanagement_policy_pb.UsernamePermissionRequest,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_policy_pb.PoliciesListResponse|null) => void
  ): UnaryResponse;
}

