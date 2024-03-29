/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/challenge_service.proto

import * as public_challenge_service_pb from "../public/challenge_service_pb";
import * as common_gateway_base_pb from "../common/gateway_base_pb";
import * as common_challenge_pb from "../common/challenge_pb";
import {grpc} from "@improbable-eng/grpc-web";

type ChallengeServiceChallengeFormMeta = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeFormMetaRequest;
  readonly responseType: typeof common_challenge_pb.ChallengeFormMetaResponse;
};

type ChallengeServiceChallengeCreate = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeCreateRequest;
  readonly responseType: typeof common_challenge_pb.ChallengeCreateResponse;
};

type ChallengeServiceChallengeFreezeStatus = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeFreezeStatusRequest;
  readonly responseType: typeof common_gateway_base_pb.StatusResponse;
};

type ChallengeServiceGetChallengeDetails = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.GetChallengeDetailsRequest;
  readonly responseType: typeof common_challenge_pb.GetChallengeDetailsResponse;
};

type ChallengeServiceGetChallengeAttachmentUploadUrl = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.GetAttachmentUploadUrlRequest;
  readonly responseType: typeof common_challenge_pb.GetAttachmentUploadUrlResponse;
};

type ChallengeServiceChallengeActive = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeActiveRequest;
  readonly responseType: typeof common_challenge_pb.ChallengeActiveResponse;
};

type ChallengeServiceChallengeList = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeListRequest;
  readonly responseType: typeof common_challenge_pb.ChallengeListResponse;
};

type ChallengeServiceChallengeHistory = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeHistoryRequest;
  readonly responseType: typeof common_challenge_pb.ChallengeHistoryResponse;
};

type ChallengeServiceChallengeDecision = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeDecisionRequest;
  readonly responseType: typeof common_gateway_base_pb.MessageResponse;
};

type ChallengeServiceChallengeFreezeAction = {
  readonly methodName: string;
  readonly service: typeof ChallengeService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_challenge_pb.ChallengeFreezeActionRequest;
  readonly responseType: typeof common_gateway_base_pb.MessageResponse;
};

export class ChallengeService {
  static readonly serviceName: string;
  static readonly ChallengeFormMeta: ChallengeServiceChallengeFormMeta;
  static readonly ChallengeCreate: ChallengeServiceChallengeCreate;
  static readonly ChallengeFreezeStatus: ChallengeServiceChallengeFreezeStatus;
  static readonly GetChallengeDetails: ChallengeServiceGetChallengeDetails;
  static readonly GetChallengeAttachmentUploadUrl: ChallengeServiceGetChallengeAttachmentUploadUrl;
  static readonly ChallengeActive: ChallengeServiceChallengeActive;
  static readonly ChallengeList: ChallengeServiceChallengeList;
  static readonly ChallengeHistory: ChallengeServiceChallengeHistory;
  static readonly ChallengeDecision: ChallengeServiceChallengeDecision;
  static readonly ChallengeFreezeAction: ChallengeServiceChallengeFreezeAction;
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

export class ChallengeServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  challengeFormMeta(
    requestMessage: common_challenge_pb.ChallengeFormMetaRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeFormMetaResponse|null) => void
  ): UnaryResponse;
  challengeFormMeta(
    requestMessage: common_challenge_pb.ChallengeFormMetaRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeFormMetaResponse|null) => void
  ): UnaryResponse;
  challengeCreate(
    requestMessage: common_challenge_pb.ChallengeCreateRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeCreateResponse|null) => void
  ): UnaryResponse;
  challengeCreate(
    requestMessage: common_challenge_pb.ChallengeCreateRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeCreateResponse|null) => void
  ): UnaryResponse;
  challengeFreezeStatus(
    requestMessage: common_challenge_pb.ChallengeFreezeStatusRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.StatusResponse|null) => void
  ): UnaryResponse;
  challengeFreezeStatus(
    requestMessage: common_challenge_pb.ChallengeFreezeStatusRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.StatusResponse|null) => void
  ): UnaryResponse;
  getChallengeDetails(
    requestMessage: common_challenge_pb.GetChallengeDetailsRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.GetChallengeDetailsResponse|null) => void
  ): UnaryResponse;
  getChallengeDetails(
    requestMessage: common_challenge_pb.GetChallengeDetailsRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.GetChallengeDetailsResponse|null) => void
  ): UnaryResponse;
  getChallengeAttachmentUploadUrl(
    requestMessage: common_challenge_pb.GetAttachmentUploadUrlRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.GetAttachmentUploadUrlResponse|null) => void
  ): UnaryResponse;
  getChallengeAttachmentUploadUrl(
    requestMessage: common_challenge_pb.GetAttachmentUploadUrlRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.GetAttachmentUploadUrlResponse|null) => void
  ): UnaryResponse;
  challengeActive(
    requestMessage: common_challenge_pb.ChallengeActiveRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeActiveResponse|null) => void
  ): UnaryResponse;
  challengeActive(
    requestMessage: common_challenge_pb.ChallengeActiveRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeActiveResponse|null) => void
  ): UnaryResponse;
  challengeList(
    requestMessage: common_challenge_pb.ChallengeListRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeListResponse|null) => void
  ): UnaryResponse;
  challengeList(
    requestMessage: common_challenge_pb.ChallengeListRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeListResponse|null) => void
  ): UnaryResponse;
  challengeHistory(
    requestMessage: common_challenge_pb.ChallengeHistoryRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeHistoryResponse|null) => void
  ): UnaryResponse;
  challengeHistory(
    requestMessage: common_challenge_pb.ChallengeHistoryRequest,
    callback: (error: ServiceError|null, responseMessage: common_challenge_pb.ChallengeHistoryResponse|null) => void
  ): UnaryResponse;
  challengeDecision(
    requestMessage: common_challenge_pb.ChallengeDecisionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
  challengeDecision(
    requestMessage: common_challenge_pb.ChallengeDecisionRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
  challengeFreezeAction(
    requestMessage: common_challenge_pb.ChallengeFreezeActionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
  challengeFreezeAction(
    requestMessage: common_challenge_pb.ChallengeFreezeActionRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
}

