/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: common/market.proto

import * as jspb from "google-protobuf";
import * as common_gateway_base_pb from "../common/gateway_base_pb";

export class MarketSnapTimeResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): SnapTimes | undefined;
  setData(value?: SnapTimes): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): MarketSnapTimeResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarketSnapTimeResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MarketSnapTimeResponse): MarketSnapTimeResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarketSnapTimeResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarketSnapTimeResponse;
  static deserializeBinaryFromReader(message: MarketSnapTimeResponse, reader: jspb.BinaryReader): MarketSnapTimeResponse;
}

export namespace MarketSnapTimeResponse {
  export type AsObject = {
    data?: SnapTimes.AsObject,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class SnapTimes extends jspb.Message {
  clearSnapTimesList(): void;
  getSnapTimesList(): Array<string>;
  setSnapTimesList(value: Array<string>): void;
  addSnapTimes(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SnapTimes.AsObject;
  static toObject(includeInstance: boolean, msg: SnapTimes): SnapTimes.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SnapTimes, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SnapTimes;
  static deserializeBinaryFromReader(message: SnapTimes, reader: jspb.BinaryReader): SnapTimes;
}

export namespace SnapTimes {
  export type AsObject = {
    snapTimesList: Array<string>,
  }
}

