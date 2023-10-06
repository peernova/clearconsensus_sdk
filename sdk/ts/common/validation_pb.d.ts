/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: common/validation.proto

import * as jspb from "google-protobuf";
import * as common_gateway_base_pb from "../common/gateway_base_pb";

export class ValidationRuleDefinition extends jspb.Message {
  getUid(): string;
  setUid(value: string): void;

  hasDefinition(): boolean;
  clearDefinition(): void;
  getDefinition(): common_gateway_base_pb.RulesetDefinition | undefined;
  setDefinition(value?: common_gateway_base_pb.RulesetDefinition): void;

  getScope(): string;
  setScope(value: string): void;

  getDescriptorName(): string;
  setDescriptorName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValidationRuleDefinition.AsObject;
  static toObject(includeInstance: boolean, msg: ValidationRuleDefinition): ValidationRuleDefinition.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ValidationRuleDefinition, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValidationRuleDefinition;
  static deserializeBinaryFromReader(message: ValidationRuleDefinition, reader: jspb.BinaryReader): ValidationRuleDefinition;
}

export namespace ValidationRuleDefinition {
  export type AsObject = {
    uid: string,
    definition?: common_gateway_base_pb.RulesetDefinition.AsObject,
    scope: string,
    descriptorName: string,
  }
}

export class GetValidationRuleResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): ValidationRuleDefinition | undefined;
  setData(value?: ValidationRuleDefinition): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): GetValidationRuleResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetValidationRuleResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetValidationRuleResponse): GetValidationRuleResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetValidationRuleResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetValidationRuleResponse;
  static deserializeBinaryFromReader(message: GetValidationRuleResponse, reader: jspb.BinaryReader): GetValidationRuleResponse;
}

export namespace GetValidationRuleResponse {
  export type AsObject = {
    data?: ValidationRuleDefinition.AsObject,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class GetGeneratedValidationRuleResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): string;
  setData(value: string): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): GetGeneratedValidationRuleResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetGeneratedValidationRuleResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetGeneratedValidationRuleResponse): GetGeneratedValidationRuleResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetGeneratedValidationRuleResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetGeneratedValidationRuleResponse;
  static deserializeBinaryFromReader(message: GetGeneratedValidationRuleResponse, reader: jspb.BinaryReader): GetGeneratedValidationRuleResponse;
}

export namespace GetGeneratedValidationRuleResponse {
  export type AsObject = {
    data: string,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class RdlCheckRequest extends jspb.Message {
  getRdl(): string;
  setRdl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RdlCheckRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RdlCheckRequest): RdlCheckRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RdlCheckRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RdlCheckRequest;
  static deserializeBinaryFromReader(message: RdlCheckRequest, reader: jspb.BinaryReader): RdlCheckRequest;
}

export namespace RdlCheckRequest {
  export type AsObject = {
    rdl: string,
  }
}
