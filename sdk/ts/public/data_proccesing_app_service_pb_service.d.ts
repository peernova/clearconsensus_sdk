/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/data_proccesing_app_service.proto

import * as public_data_proccesing_app_service_pb from "../public/data_proccesing_app_service_pb";
import * as common_data_proccesing_app_pb from "../common/data_proccesing_app_pb";
import {grpc} from "@improbable-eng/grpc-web";

type DataProcessingAppServiceRunDataProcessingApp = {
  readonly methodName: string;
  readonly service: typeof DataProcessingAppService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_data_proccesing_app_pb.RunDataProcessingAppRequest;
  readonly responseType: typeof common_data_proccesing_app_pb.RunDataProcessingAppResponse;
};

export class DataProcessingAppService {
  static readonly serviceName: string;
  static readonly RunDataProcessingApp: DataProcessingAppServiceRunDataProcessingApp;
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

export class DataProcessingAppServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  runDataProcessingApp(
    requestMessage: common_data_proccesing_app_pb.RunDataProcessingAppRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_data_proccesing_app_pb.RunDataProcessingAppResponse|null) => void
  ): UnaryResponse;
  runDataProcessingApp(
    requestMessage: common_data_proccesing_app_pb.RunDataProcessingAppRequest,
    callback: (error: ServiceError|null, responseMessage: common_data_proccesing_app_pb.RunDataProcessingAppResponse|null) => void
  ): UnaryResponse;
}

