/* eslint-disable */
/*Generated by GenDocu.com*/
// package: com.peernova.titanium.casbin.management.grpc.service
// file: public/usermanagement_group_policy_service.proto

import * as public_usermanagement_group_policy_service_pb from "../public/usermanagement_group_policy_service_pb";
import * as common_usermanagement_group_policy_pb from "../common/usermanagement_group_policy_pb";
import * as common_usermanagement_fe_specific_pb from "../common/usermanagement_fe_specific_pb";
import * as common_usermanagement_policy_pb from "../common/usermanagement_policy_pb";
import {grpc} from "@improbable-eng/grpc-web";

type GroupPolicyServicecreate = {
  readonly methodName: string;
  readonly service: typeof GroupPolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_group_policy_pb.GroupPolicies;
  readonly responseType: typeof common_usermanagement_fe_specific_pb.OperationSuccess;
};

type GroupPolicyServicegetPolicies = {
  readonly methodName: string;
  readonly service: typeof GroupPolicyService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_usermanagement_policy_pb.PolicyType;
  readonly responseType: typeof common_usermanagement_group_policy_pb.GroupPoliciesResponse;
};

export class GroupPolicyService {
  static readonly serviceName: string;
  static readonly create: GroupPolicyServicecreate;
  static readonly getPolicies: GroupPolicyServicegetPolicies;
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

export class GroupPolicyServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  create(
    requestMessage: common_usermanagement_group_policy_pb.GroupPolicies,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  create(
    requestMessage: common_usermanagement_group_policy_pb.GroupPolicies,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_fe_specific_pb.OperationSuccess|null) => void
  ): UnaryResponse;
  getPolicies(
    requestMessage: common_usermanagement_policy_pb.PolicyType,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_group_policy_pb.GroupPoliciesResponse|null) => void
  ): UnaryResponse;
  getPolicies(
    requestMessage: common_usermanagement_policy_pb.PolicyType,
    callback: (error: ServiceError|null, responseMessage: common_usermanagement_group_policy_pb.GroupPoliciesResponse|null) => void
  ): UnaryResponse;
}

