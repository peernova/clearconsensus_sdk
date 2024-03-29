/* eslint-disable */
/*Generated by GenDocu.com*/
// package: com.peernova.titanium.casbin.management.grpc.proto
// file: common/usermanagement_group_policy.proto

import * as jspb from "google-protobuf";
import * as common_usermanagement_error_pb from "../common/usermanagement_error_pb";

export class GroupPolicyDto extends jspb.Message {
  getType(): string;
  setType(value: string): void;

  getUsername(): string;
  setUsername(value: string): void;

  getGroup(): string;
  setGroup(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupPolicyDto.AsObject;
  static toObject(includeInstance: boolean, msg: GroupPolicyDto): GroupPolicyDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupPolicyDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupPolicyDto;
  static deserializeBinaryFromReader(message: GroupPolicyDto, reader: jspb.BinaryReader): GroupPolicyDto;
}

export namespace GroupPolicyDto {
  export type AsObject = {
    type: string,
    username: string,
    group: string,
  }
}

export class GroupPolicies extends jspb.Message {
  clearGrouppolicyList(): void;
  getGrouppolicyList(): Array<GroupPolicyDto>;
  setGrouppolicyList(value: Array<GroupPolicyDto>): void;
  addGrouppolicy(value?: GroupPolicyDto, index?: number): GroupPolicyDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupPolicies.AsObject;
  static toObject(includeInstance: boolean, msg: GroupPolicies): GroupPolicies.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupPolicies, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupPolicies;
  static deserializeBinaryFromReader(message: GroupPolicies, reader: jspb.BinaryReader): GroupPolicies;
}

export namespace GroupPolicies {
  export type AsObject = {
    grouppolicyList: Array<GroupPolicyDto.AsObject>,
  }
}

export class GroupPoliciesResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): GroupPolicies | undefined;
  setData(value?: GroupPolicies): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_usermanagement_error_pb.Error | undefined;
  setError(value?: common_usermanagement_error_pb.Error): void;

  getResponseCase(): GroupPoliciesResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupPoliciesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GroupPoliciesResponse): GroupPoliciesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupPoliciesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupPoliciesResponse;
  static deserializeBinaryFromReader(message: GroupPoliciesResponse, reader: jspb.BinaryReader): GroupPoliciesResponse;
}

export namespace GroupPoliciesResponse {
  export type AsObject = {
    data?: GroupPolicies.AsObject,
    error?: common_usermanagement_error_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

