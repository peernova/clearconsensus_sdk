/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: common/file_service.proto

import * as jspb from "google-protobuf";
import * as google_protobuf_struct_pb from "google-protobuf/google/protobuf/struct_pb";
import * as common_gateway_base_pb from "../common/gateway_base_pb";

export class FileIdentifier extends jspb.Message {
  getFilename(): string;
  setFilename(value: string): void;

  getUploadDate(): string;
  setUploadDate(value: string): void;

  getFileStatus(): string;
  setFileStatus(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileIdentifier.AsObject;
  static toObject(includeInstance: boolean, msg: FileIdentifier): FileIdentifier.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileIdentifier, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileIdentifier;
  static deserializeBinaryFromReader(message: FileIdentifier, reader: jspb.BinaryReader): FileIdentifier;
}

export namespace FileIdentifier {
  export type AsObject = {
    filename: string,
    uploadDate: string,
    fileStatus: string,
  }
}

export class FileDelimiterSetting extends jspb.Message {
  getDelimiter(): string;
  setDelimiter(value: string): void;

  getEncapsulatingChar(): string;
  setEncapsulatingChar(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileDelimiterSetting.AsObject;
  static toObject(includeInstance: boolean, msg: FileDelimiterSetting): FileDelimiterSetting.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileDelimiterSetting, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileDelimiterSetting;
  static deserializeBinaryFromReader(message: FileDelimiterSetting, reader: jspb.BinaryReader): FileDelimiterSetting;
}

export namespace FileDelimiterSetting {
  export type AsObject = {
    delimiter: string,
    encapsulatingChar: string,
  }
}

export class SetFileDelimiterRequest extends jspb.Message {
  hasFileIdentifier(): boolean;
  clearFileIdentifier(): void;
  getFileIdentifier(): FileIdentifier | undefined;
  setFileIdentifier(value?: FileIdentifier): void;

  hasDelimiterSetting(): boolean;
  clearDelimiterSetting(): void;
  getDelimiterSetting(): FileDelimiterSetting | undefined;
  setDelimiterSetting(value?: FileDelimiterSetting): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetFileDelimiterRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SetFileDelimiterRequest): SetFileDelimiterRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SetFileDelimiterRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetFileDelimiterRequest;
  static deserializeBinaryFromReader(message: SetFileDelimiterRequest, reader: jspb.BinaryReader): SetFileDelimiterRequest;
}

export namespace SetFileDelimiterRequest {
  export type AsObject = {
    fileIdentifier?: FileIdentifier.AsObject,
    delimiterSetting?: FileDelimiterSetting.AsObject,
  }
}

export class FilePreview extends jspb.Message {
  clearRowsList(): void;
  getRowsList(): Array<google_protobuf_struct_pb.Struct>;
  setRowsList(value: Array<google_protobuf_struct_pb.Struct>): void;
  addRows(value?: google_protobuf_struct_pb.Struct, index?: number): google_protobuf_struct_pb.Struct;

  hasDelimiterSetting(): boolean;
  clearDelimiterSetting(): void;
  getDelimiterSetting(): FileDelimiterSetting | undefined;
  setDelimiterSetting(value?: FileDelimiterSetting): void;

  hasDescriptorDefinition(): boolean;
  clearDescriptorDefinition(): void;
  getDescriptorDefinition(): common_gateway_base_pb.DescriptorDefinition | undefined;
  setDescriptorDefinition(value?: common_gateway_base_pb.DescriptorDefinition): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FilePreview.AsObject;
  static toObject(includeInstance: boolean, msg: FilePreview): FilePreview.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FilePreview, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FilePreview;
  static deserializeBinaryFromReader(message: FilePreview, reader: jspb.BinaryReader): FilePreview;
}

export namespace FilePreview {
  export type AsObject = {
    rowsList: Array<google_protobuf_struct_pb.Struct.AsObject>,
    delimiterSetting?: FileDelimiterSetting.AsObject,
    descriptorDefinition?: common_gateway_base_pb.DescriptorDefinition.AsObject,
  }
}

export class FileList extends jspb.Message {
  clearResultsList(): void;
  getResultsList(): Array<FileIdentifier>;
  setResultsList(value: Array<FileIdentifier>): void;
  addResults(value?: FileIdentifier, index?: number): FileIdentifier;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileList.AsObject;
  static toObject(includeInstance: boolean, msg: FileList): FileList.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileList, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileList;
  static deserializeBinaryFromReader(message: FileList, reader: jspb.BinaryReader): FileList;
}

export namespace FileList {
  export type AsObject = {
    resultsList: Array<FileIdentifier.AsObject>,
  }
}

export class FileDescriptorSetting extends jspb.Message {
  getDescriptorName(): string;
  setDescriptorName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileDescriptorSetting.AsObject;
  static toObject(includeInstance: boolean, msg: FileDescriptorSetting): FileDescriptorSetting.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileDescriptorSetting, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileDescriptorSetting;
  static deserializeBinaryFromReader(message: FileDescriptorSetting, reader: jspb.BinaryReader): FileDescriptorSetting;
}

export namespace FileDescriptorSetting {
  export type AsObject = {
    descriptorName: string,
  }
}

export class SetFileDescriptorRequest extends jspb.Message {
  hasFileIdentifier(): boolean;
  clearFileIdentifier(): void;
  getFileIdentifier(): FileIdentifier | undefined;
  setFileIdentifier(value?: FileIdentifier): void;

  hasDescriptorSetting(): boolean;
  clearDescriptorSetting(): void;
  getDescriptorSetting(): FileDescriptorSetting | undefined;
  setDescriptorSetting(value?: FileDescriptorSetting): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetFileDescriptorRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SetFileDescriptorRequest): SetFileDescriptorRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SetFileDescriptorRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetFileDescriptorRequest;
  static deserializeBinaryFromReader(message: SetFileDescriptorRequest, reader: jspb.BinaryReader): SetFileDescriptorRequest;
}

export namespace SetFileDescriptorRequest {
  export type AsObject = {
    fileIdentifier?: FileIdentifier.AsObject,
    descriptorSetting?: FileDescriptorSetting.AsObject,
  }
}

export class FileSubmissionRequest extends jspb.Message {
  getDate(): string;
  setDate(value: string): void;

  getAssetId(): string;
  setAssetId(value: string): void;

  getFileName(): string;
  setFileName(value: string): void;

  getFile(): string;
  setFile(value: string): void;

  getClient(): string;
  setClient(value: string): void;

  getCompression(): string;
  setCompression(value: string): void;

  getTraceName(): string;
  setTraceName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileSubmissionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FileSubmissionRequest): FileSubmissionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileSubmissionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileSubmissionRequest;
  static deserializeBinaryFromReader(message: FileSubmissionRequest, reader: jspb.BinaryReader): FileSubmissionRequest;
}

export namespace FileSubmissionRequest {
  export type AsObject = {
    date: string,
    assetId: string,
    fileName: string,
    file: string,
    client: string,
    compression: string,
    traceName: string,
  }
}

export class FileHistoryRequest extends jspb.Message {
  getAssetId(): string;
  setAssetId(value: string): void;

  getFileDate(): string;
  setFileDate(value: string): void;

  getFilter(): string;
  setFilter(value: string): void;

  getClient(): string;
  setClient(value: string): void;

  hasOrderby(): boolean;
  clearOrderby(): void;
  getOrderby(): common_gateway_base_pb.OrderBy | undefined;
  setOrderby(value?: common_gateway_base_pb.OrderBy): void;

  hasLimit(): boolean;
  clearLimit(): void;
  getLimit(): common_gateway_base_pb.Limit | undefined;
  setLimit(value?: common_gateway_base_pb.Limit): void;

  getOffset(): number;
  setOffset(value: number): void;

  getTraceName(): string;
  setTraceName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileHistoryRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FileHistoryRequest): FileHistoryRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileHistoryRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileHistoryRequest;
  static deserializeBinaryFromReader(message: FileHistoryRequest, reader: jspb.BinaryReader): FileHistoryRequest;
}

export namespace FileHistoryRequest {
  export type AsObject = {
    assetId: string,
    fileDate: string,
    filter: string,
    client: string,
    orderby?: common_gateway_base_pb.OrderBy.AsObject,
    limit?: common_gateway_base_pb.Limit.AsObject,
    offset: number,
    traceName: string,
  }
}

export class FileHistoryResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): FileHistoryResponseData | undefined;
  setData(value?: FileHistoryResponseData): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): FileHistoryResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileHistoryResponse.AsObject;
  static toObject(includeInstance: boolean, msg: FileHistoryResponse): FileHistoryResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileHistoryResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileHistoryResponse;
  static deserializeBinaryFromReader(message: FileHistoryResponse, reader: jspb.BinaryReader): FileHistoryResponse;
}

export namespace FileHistoryResponse {
  export type AsObject = {
    data?: FileHistoryResponseData.AsObject,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class FileHistoryResponseData extends jspb.Message {
  clearColumnsList(): void;
  getColumnsList(): Array<common_gateway_base_pb.ColumnInfo>;
  setColumnsList(value: Array<common_gateway_base_pb.ColumnInfo>): void;
  addColumns(value?: common_gateway_base_pb.ColumnInfo, index?: number): common_gateway_base_pb.ColumnInfo;

  clearRowsList(): void;
  getRowsList(): Array<FileHistoryRow>;
  setRowsList(value: Array<FileHistoryRow>): void;
  addRows(value?: FileHistoryRow, index?: number): FileHistoryRow;

  getTotalRows(): number;
  setTotalRows(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileHistoryResponseData.AsObject;
  static toObject(includeInstance: boolean, msg: FileHistoryResponseData): FileHistoryResponseData.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileHistoryResponseData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileHistoryResponseData;
  static deserializeBinaryFromReader(message: FileHistoryResponseData, reader: jspb.BinaryReader): FileHistoryResponseData;
}

export namespace FileHistoryResponseData {
  export type AsObject = {
    columnsList: Array<common_gateway_base_pb.ColumnInfo.AsObject>,
    rowsList: Array<FileHistoryRow.AsObject>,
    totalRows: number,
  }
}

export class FileHistoryRow extends jspb.Message {
  clearValuesList(): void;
  getValuesList(): Array<google_protobuf_struct_pb.Value>;
  setValuesList(value: Array<google_protobuf_struct_pb.Value>): void;
  addValues(value?: google_protobuf_struct_pb.Value, index?: number): google_protobuf_struct_pb.Value;

  getLatestConsensusMember(): boolean;
  setLatestConsensusMember(value: boolean): void;

  clearConsensusrunList(): void;
  getConsensusrunList(): Array<common_gateway_base_pb.ConsensusRunInfo>;
  setConsensusrunList(value: Array<common_gateway_base_pb.ConsensusRunInfo>): void;
  addConsensusrun(value?: common_gateway_base_pb.ConsensusRunInfo, index?: number): common_gateway_base_pb.ConsensusRunInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FileHistoryRow.AsObject;
  static toObject(includeInstance: boolean, msg: FileHistoryRow): FileHistoryRow.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FileHistoryRow, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FileHistoryRow;
  static deserializeBinaryFromReader(message: FileHistoryRow, reader: jspb.BinaryReader): FileHistoryRow;
}

export namespace FileHistoryRow {
  export type AsObject = {
    valuesList: Array<google_protobuf_struct_pb.Value.AsObject>,
    latestConsensusMember: boolean,
    consensusrunList: Array<common_gateway_base_pb.ConsensusRunInfo.AsObject>,
  }
}

export class GetFileExportUrlRequest extends jspb.Message {
  getSubmittedId(): string;
  setSubmittedId(value: string): void;

  getSubmittedDate(): string;
  setSubmittedDate(value: string): void;

  getExportType(): ExportTypeMap[keyof ExportTypeMap];
  setExportType(value: ExportTypeMap[keyof ExportTypeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFileExportUrlRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFileExportUrlRequest): GetFileExportUrlRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFileExportUrlRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFileExportUrlRequest;
  static deserializeBinaryFromReader(message: GetFileExportUrlRequest, reader: jspb.BinaryReader): GetFileExportUrlRequest;
}

export namespace GetFileExportUrlRequest {
  export type AsObject = {
    submittedId: string,
    submittedDate: string,
    exportType: ExportTypeMap[keyof ExportTypeMap],
  }
}

export class GetFileExportUrlResponse extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): GetFileExportUrlResponse.FileExportUrl | undefined;
  setData(value?: GetFileExportUrlResponse.FileExportUrl): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): GetFileExportUrlResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFileExportUrlResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetFileExportUrlResponse): GetFileExportUrlResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFileExportUrlResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFileExportUrlResponse;
  static deserializeBinaryFromReader(message: GetFileExportUrlResponse, reader: jspb.BinaryReader): GetFileExportUrlResponse;
}

export namespace GetFileExportUrlResponse {
  export type AsObject = {
    data?: GetFileExportUrlResponse.FileExportUrl.AsObject,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export class FileExportUrl extends jspb.Message {
    getS3Url(): string;
    setS3Url(value: string): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): FileExportUrl.AsObject;
    static toObject(includeInstance: boolean, msg: FileExportUrl): FileExportUrl.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: FileExportUrl, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): FileExportUrl;
    static deserializeBinaryFromReader(message: FileExportUrl, reader: jspb.BinaryReader): FileExportUrl;
  }

  export namespace FileExportUrl {
    export type AsObject = {
      s3Url: string,
    }
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export interface ExportTypeMap {
  EXPORT_TYPE_UNSPECIFIED: 0;
  EXPORT_TYPE_ORIGINALLY_SUBMITTED_FILE: 1;
  EXPORT_TYPE_PARSING_ERRORS_FILE: 2;
  EXPORT_TYPE_EXPORT_FILE: 3;
  EXPORT_TYPE_REPORT_FILE: 4;
}

export const ExportType: ExportTypeMap;

