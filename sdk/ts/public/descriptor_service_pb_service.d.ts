/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: public/descriptor_service.proto

import * as public_descriptor_service_pb from "../public/descriptor_service_pb";
import * as common_gateway_base_pb from "../common/gateway_base_pb";
import * as common_descriptor_pb from "../common/descriptor_pb";
import {grpc} from "@improbable-eng/grpc-web";

type DescriptorServiceAddDescriptor = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.DescriptorDefinition;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DescriptorServiceGetDescriptor = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_descriptor_pb.DescriptorDefinitionResponse;
};

type DescriptorServiceEnableDescriptor = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.EnableDisableRequest;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DescriptorServiceDisableDescriptor = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.EnableDisableRequest;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DescriptorServiceListDescriptors = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.ListRequest;
  readonly responseType: typeof common_descriptor_pb.DescriptorList;
};

type DescriptorServiceListDescriptorVersions = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_gateway_base_pb.ListVersionResponse;
};

type DescriptorServiceGetDescriptorVersion = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.VersionRequest;
  readonly responseType: typeof common_descriptor_pb.DescriptorDefinitionResponse;
};

type DescriptorServiceDescriptorDependencies = {
  readonly methodName: string;
  readonly service: typeof DescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_descriptor_pb.DescriptorDependenciesResponse;
};

export class DescriptorService {
  static readonly serviceName: string;
  static readonly AddDescriptor: DescriptorServiceAddDescriptor;
  static readonly GetDescriptor: DescriptorServiceGetDescriptor;
  static readonly EnableDescriptor: DescriptorServiceEnableDescriptor;
  static readonly DisableDescriptor: DescriptorServiceDisableDescriptor;
  static readonly ListDescriptors: DescriptorServiceListDescriptors;
  static readonly ListDescriptorVersions: DescriptorServiceListDescriptorVersions;
  static readonly GetDescriptorVersion: DescriptorServiceGetDescriptorVersion;
  static readonly DescriptorDependencies: DescriptorServiceDescriptorDependencies;
}

type DbDescriptorServiceAddDbDescriptor = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.DescriptorDefinition;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DbDescriptorServiceGetDbDescriptor = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_descriptor_pb.DescriptorDefinitionResponse;
};

type DbDescriptorServiceEnableDbDescriptor = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.EnableDisableRequest;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DbDescriptorServiceDisableDbDescriptor = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.EnableDisableRequest;
  readonly responseType: typeof common_gateway_base_pb.AcknowledgeResponse;
};

type DbDescriptorServiceListDbDescriptors = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.ListRequest;
  readonly responseType: typeof common_descriptor_pb.DescriptorList;
};

type DbDescriptorServiceListDbDescriptorVersions = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_gateway_base_pb.ListVersionResponse;
};

type DbDescriptorServiceGetDbDescriptorVersion = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.VersionRequest;
  readonly responseType: typeof common_descriptor_pb.DescriptorDefinitionResponse;
};

type DbDescriptorServiceDescriptorDependencies = {
  readonly methodName: string;
  readonly service: typeof DbDescriptorService;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof common_gateway_base_pb.GetDefinition;
  readonly responseType: typeof common_descriptor_pb.DescriptorDependenciesResponse;
};

export class DbDescriptorService {
  static readonly serviceName: string;
  static readonly AddDbDescriptor: DbDescriptorServiceAddDbDescriptor;
  static readonly GetDbDescriptor: DbDescriptorServiceGetDbDescriptor;
  static readonly EnableDbDescriptor: DbDescriptorServiceEnableDbDescriptor;
  static readonly DisableDbDescriptor: DbDescriptorServiceDisableDbDescriptor;
  static readonly ListDbDescriptors: DbDescriptorServiceListDbDescriptors;
  static readonly ListDbDescriptorVersions: DbDescriptorServiceListDbDescriptorVersions;
  static readonly GetDbDescriptorVersion: DbDescriptorServiceGetDbDescriptorVersion;
  static readonly DescriptorDependencies: DbDescriptorServiceDescriptorDependencies;
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

export class DescriptorServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  addDescriptor(
    requestMessage: common_gateway_base_pb.DescriptorDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  addDescriptor(
    requestMessage: common_gateway_base_pb.DescriptorDefinition,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  getDescriptor(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  getDescriptor(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  enableDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  enableDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  disableDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  disableDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  listDescriptors(
    requestMessage: common_gateway_base_pb.ListRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorList|null) => void
  ): UnaryResponse;
  listDescriptors(
    requestMessage: common_gateway_base_pb.ListRequest,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorList|null) => void
  ): UnaryResponse;
  listDescriptorVersions(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.ListVersionResponse|null) => void
  ): UnaryResponse;
  listDescriptorVersions(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.ListVersionResponse|null) => void
  ): UnaryResponse;
  getDescriptorVersion(
    requestMessage: common_gateway_base_pb.VersionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  getDescriptorVersion(
    requestMessage: common_gateway_base_pb.VersionRequest,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  descriptorDependencies(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDependenciesResponse|null) => void
  ): UnaryResponse;
  descriptorDependencies(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDependenciesResponse|null) => void
  ): UnaryResponse;
}

export class DbDescriptorServiceClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  addDbDescriptor(
    requestMessage: common_gateway_base_pb.DescriptorDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  addDbDescriptor(
    requestMessage: common_gateway_base_pb.DescriptorDefinition,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  getDbDescriptor(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  getDbDescriptor(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  enableDbDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  enableDbDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  disableDbDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  disableDbDescriptor(
    requestMessage: common_gateway_base_pb.EnableDisableRequest,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.AcknowledgeResponse|null) => void
  ): UnaryResponse;
  listDbDescriptors(
    requestMessage: common_gateway_base_pb.ListRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorList|null) => void
  ): UnaryResponse;
  listDbDescriptors(
    requestMessage: common_gateway_base_pb.ListRequest,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorList|null) => void
  ): UnaryResponse;
  listDbDescriptorVersions(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.ListVersionResponse|null) => void
  ): UnaryResponse;
  listDbDescriptorVersions(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_gateway_base_pb.ListVersionResponse|null) => void
  ): UnaryResponse;
  getDbDescriptorVersion(
    requestMessage: common_gateway_base_pb.VersionRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  getDbDescriptorVersion(
    requestMessage: common_gateway_base_pb.VersionRequest,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDefinitionResponse|null) => void
  ): UnaryResponse;
  descriptorDependencies(
    requestMessage: common_gateway_base_pb.GetDefinition,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDependenciesResponse|null) => void
  ): UnaryResponse;
  descriptorDependencies(
    requestMessage: common_gateway_base_pb.GetDefinition,
    callback: (error: ServiceError|null, responseMessage: common_descriptor_pb.DescriptorDependenciesResponse|null) => void
  ): UnaryResponse;
}

