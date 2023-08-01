/* eslint-disable */
/*Generated by GenDocu.com*/
// package: com.peernova.titanium.casbin.management.grpc.proto
// file: common/usermanagement_user.proto

import * as jspb from "google-protobuf";
import * as common_usermanagement_error_pb from "../common/usermanagement_error_pb";
import * as common_usermanagement_fe_specific_pb from "../common/usermanagement_fe_specific_pb";
import * as common_usermanagement_entity_pb from "../common/usermanagement_entity_pb";

export class UserDto extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getEmail(): string;
  setEmail(value: string): void;

  getFirstname(): string;
  setFirstname(value: string): void;

  getLastname(): string;
  setLastname(value: string): void;

  getEnabled(): boolean;
  setEnabled(value: boolean): void;

  hasEntity(): boolean;
  clearEntity(): void;
  getEntity(): common_usermanagement_entity_pb.EntityDto | undefined;
  setEntity(value?: common_usermanagement_entity_pb.EntityDto): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserDto.AsObject;
  static toObject(includeInstance: boolean, msg: UserDto): UserDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserDto;
  static deserializeBinaryFromReader(message: UserDto, reader: jspb.BinaryReader): UserDto;
}

export namespace UserDto {
  export type AsObject = {
    id: string,
    email: string,
    firstname: string,
    lastname: string,
    enabled: boolean,
    entity?: common_usermanagement_entity_pb.EntityDto.AsObject,
  }
}

export class UserResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): UserDto | undefined;
  setData(value?: UserDto): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_usermanagement_error_pb.Error | undefined;
  setError(value?: common_usermanagement_error_pb.Error): void;

  getResponseCase(): UserResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UserResponse): UserResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserResponse;
  static deserializeBinaryFromReader(message: UserResponse, reader: jspb.BinaryReader): UserResponse;
}

export namespace UserResponse {
  export type AsObject = {
    data?: UserDto.AsObject,
    error?: common_usermanagement_error_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class UsersDto extends jspb.Message {
  clearUserList(): void;
  getUserList(): Array<UserDto>;
  setUserList(value: Array<UserDto>): void;
  addUser(value?: UserDto, index?: number): UserDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UsersDto.AsObject;
  static toObject(includeInstance: boolean, msg: UsersDto): UsersDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UsersDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UsersDto;
  static deserializeBinaryFromReader(message: UsersDto, reader: jspb.BinaryReader): UsersDto;
}

export namespace UsersDto {
  export type AsObject = {
    userList: Array<UserDto.AsObject>,
  }
}

export class UsersResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): UsersDto | undefined;
  setData(value?: UsersDto): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_usermanagement_error_pb.Error | undefined;
  setError(value?: common_usermanagement_error_pb.Error): void;

  getResponseCase(): UsersResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UsersResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UsersResponse): UsersResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UsersResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UsersResponse;
  static deserializeBinaryFromReader(message: UsersResponse, reader: jspb.BinaryReader): UsersResponse;
}

export namespace UsersResponse {
  export type AsObject = {
    data?: UsersDto.AsObject,
    error?: common_usermanagement_error_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class UserEnabled extends jspb.Message {
  getEnabled(): boolean;
  setEnabled(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserEnabled.AsObject;
  static toObject(includeInstance: boolean, msg: UserEnabled): UserEnabled.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserEnabled, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserEnabled;
  static deserializeBinaryFromReader(message: UserEnabled, reader: jspb.BinaryReader): UserEnabled;
}

export namespace UserEnabled {
  export type AsObject = {
    enabled: boolean,
  }
}

export class UserId extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserId.AsObject;
  static toObject(includeInstance: boolean, msg: UserId): UserId.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserId, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserId;
  static deserializeBinaryFromReader(message: UserId, reader: jspb.BinaryReader): UserId;
}

export namespace UserId {
  export type AsObject = {
    id: string,
  }
}

