/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/popup_service.proto

import * as public_popup_service_pb from "../public/popup_service_pb";
import * as common_popup_pb from "../common/popup_pb";
import {grpc} from "@improbable-eng/grpc-web";

type PopUpServicePopUpView = {
  readonly methodName: string;
  readonly service: typeof PopUpService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_popup_pb.PopUpViewRequest;
  readonly responseType: typeof common_popup_pb.PopUpViewResponse;
};

export class PopUpService {
  static readonly serviceName: string;
  static readonly PopUpView: PopUpServicePopUpView;
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

export class PopUpServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  popUpView(
    requestMessage: common_popup_pb.PopUpViewRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_popup_pb.PopUpViewResponse|null) => void
  ): UnaryResponse;
  popUpView(
    requestMessage: common_popup_pb.PopUpViewRequest,
    callback: (error: ServiceError|null, responseMessage: common_popup_pb.PopUpViewResponse|null) => void
  ): UnaryResponse;
}

