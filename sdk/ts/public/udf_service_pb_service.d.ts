/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/udf_service.proto

import * as public_udf_service_pb from "../public/udf_service_pb";
import * as common_gateway_base_pb from "../common/gateway_base_pb";
import * as common_udf_pb from "../common/udf_pb";
import {grpc} from "@improbable-eng/grpc-web";

type UdfServiceListUdfs = {
  readonly methodName: string;
  readonly service: typeof UdfService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.ListRequest;
  readonly responseType: typeof common_udf_pb.ListUdfResponse;
};

type UdfServiceGetUdfDefinition = {
  readonly methodName: string;
  readonly service: typeof UdfService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_udf_pb.UdfNameRequest;
  readonly responseType: typeof common_udf_pb.GetUdfResponse;
};

type UdfServiceDisableUdf = {
  readonly methodName: string;
  readonly service: typeof UdfService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_udf_pb.UdfNameRequest;
  readonly responseType: typeof common_gateway_base_pb.MessageResponse;
};

export class UdfService {
  static readonly serviceName: string;
  static readonly ListUdfs: UdfServiceListUdfs;
  static readonly GetUdfDefinition: UdfServiceGetUdfDefinition;
  static readonly DisableUdf: UdfServiceDisableUdf;
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

export class UdfServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  listUdfs(
    requestMessage: common_gateway_base_pb.ListRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_udf_pb.ListUdfResponse|null) => void
  ): UnaryResponse;
  listUdfs(
    requestMessage: common_gateway_base_pb.ListRequest,
    callback: (error: ServiceError|null, responseMessage: common_udf_pb.ListUdfResponse|null) => void
  ): UnaryResponse;
  getUdfDefinition(
    requestMessage: common_udf_pb.UdfNameRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_udf_pb.GetUdfResponse|null) => void
  ): UnaryResponse;
  getUdfDefinition(
    requestMessage: common_udf_pb.UdfNameRequest,
    callback: (error: ServiceError|null, responseMessage: common_udf_pb.GetUdfResponse|null) => void
  ): UnaryResponse;
  disableUdf(
    requestMessage: common_udf_pb.UdfNameRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
  disableUdf(
    requestMessage: common_udf_pb.UdfNameRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.MessageResponse|null) => void
  ): UnaryResponse;
}

