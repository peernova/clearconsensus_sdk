/* eslint-disable */
/*Generated by GenDocu.com*/
// package: titanium
// file: common/workflow.proto

import * as jspb from "google-protobuf";
import * as google_api_annotations_pb from "../google/api/annotations_pb";
import * as google_protobuf_struct_pb from "google-protobuf/google/protobuf/struct_pb";
import * as google_protobuf_any_pb from "google-protobuf/google/protobuf/any_pb";
import * as common_gateway_base_pb from "../common/gateway_base_pb";

export class RunWorkflowRequest extends jspb.Message {
  getScope(): string;
  setScope(value: string): void;

  getName(): string;
  setName(value: string): void;

  hasArgs(): boolean;
  clearArgs(): void;
  getArgs(): google_protobuf_struct_pb.Struct | undefined;
  setArgs(value?: google_protobuf_struct_pb.Struct): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RunWorkflowRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RunWorkflowRequest): RunWorkflowRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RunWorkflowRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RunWorkflowRequest;
  static deserializeBinaryFromReader(message: RunWorkflowRequest, reader: jspb.BinaryReader): RunWorkflowRequest;
}

export namespace RunWorkflowRequest {
  export type AsObject = {
    scope: string,
    name: string,
    args?: google_protobuf_struct_pb.Struct.AsObject,
  }
}

export class ReprocessWorkflowRequest extends jspb.Message {
  getWorkflowId(): string;
  setWorkflowId(value: string): void;

  getRunId(): string;
  setRunId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ReprocessWorkflowRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ReprocessWorkflowRequest): ReprocessWorkflowRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ReprocessWorkflowRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ReprocessWorkflowRequest;
  static deserializeBinaryFromReader(message: ReprocessWorkflowRequest, reader: jspb.BinaryReader): ReprocessWorkflowRequest;
}

export namespace ReprocessWorkflowRequest {
  export type AsObject = {
    workflowId: string,
    runId: string,
  }
}

export class GetActionRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetActionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetActionRequest): GetActionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetActionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetActionRequest;
  static deserializeBinaryFromReader(message: GetActionRequest, reader: jspb.BinaryReader): GetActionRequest;
}

export namespace GetActionRequest {
  export type AsObject = {
    name: string,
  }
}

export class RunWorkflowResponse extends jspb.Message {
  getWorkflowid(): string;
  setWorkflowid(value: string): void;

  getRunid(): string;
  setRunid(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RunWorkflowResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RunWorkflowResponse): RunWorkflowResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RunWorkflowResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RunWorkflowResponse;
  static deserializeBinaryFromReader(message: RunWorkflowResponse, reader: jspb.BinaryReader): RunWorkflowResponse;
}

export namespace RunWorkflowResponse {
  export type AsObject = {
    workflowid: string,
    runid: string,
  }
}

export class AddWorkflowDefinitionRequest extends jspb.Message {
  getScope(): string;
  setScope(value: string): void;

  hasDefinition(): boolean;
  clearDefinition(): void;
  getDefinition(): WorkflowDefinition | undefined;
  setDefinition(value?: WorkflowDefinition): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AddWorkflowDefinitionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AddWorkflowDefinitionRequest): AddWorkflowDefinitionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AddWorkflowDefinitionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AddWorkflowDefinitionRequest;
  static deserializeBinaryFromReader(message: AddWorkflowDefinitionRequest, reader: jspb.BinaryReader): AddWorkflowDefinitionRequest;
}

export namespace AddWorkflowDefinitionRequest {
  export type AsObject = {
    scope: string,
    definition?: WorkflowDefinition.AsObject,
  }
}

export class WorkflowDefinitionResponse extends jspb.Message {
  hasDefinition(): boolean;
  clearDefinition(): void;
  getDefinition(): string;
  setDefinition(value: string): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): WorkflowDefinitionResponse.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkflowDefinitionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: WorkflowDefinitionResponse): WorkflowDefinitionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkflowDefinitionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkflowDefinitionResponse;
  static deserializeBinaryFromReader(message: WorkflowDefinitionResponse, reader: jspb.BinaryReader): WorkflowDefinitionResponse;
}

export namespace WorkflowDefinitionResponse {
  export type AsObject = {
    definition: string,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DEFINITION = 1,
    ERROR = 2,
  }
}

export class WorkflowDefinition extends jspb.Message {
  getWorkflowName(): string;
  setWorkflowName(value: string): void;

  getWorkflowQueue(): string;
  setWorkflowQueue(value: string): void;

  getTimeout(): number;
  setTimeout(value: number): void;

  getSchedule(): string;
  setSchedule(value: string): void;

  getMaxAttempts(): number;
  setMaxAttempts(value: number): void;

  clearActionListList(): void;
  getActionListList(): Array<ActionDefinition>;
  setActionListList(value: Array<ActionDefinition>): void;
  addActionList(value?: ActionDefinition, index?: number): ActionDefinition;

  hasPredefinedArguments(): boolean;
  clearPredefinedArguments(): void;
  getPredefinedArguments(): google_protobuf_struct_pb.Struct | undefined;
  setPredefinedArguments(value?: google_protobuf_struct_pb.Struct): void;

  clearRuntimeArgumentsList(): void;
  getRuntimeArgumentsList(): Array<string>;
  setRuntimeArgumentsList(value: Array<string>): void;
  addRuntimeArguments(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkflowDefinition.AsObject;
  static toObject(includeInstance: boolean, msg: WorkflowDefinition): WorkflowDefinition.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkflowDefinition, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkflowDefinition;
  static deserializeBinaryFromReader(message: WorkflowDefinition, reader: jspb.BinaryReader): WorkflowDefinition;
}

export namespace WorkflowDefinition {
  export type AsObject = {
    workflowName: string,
    workflowQueue: string,
    timeout: number,
    schedule: string,
    maxAttempts: number,
    actionListList: Array<ActionDefinition.AsObject>,
    predefinedArguments?: google_protobuf_struct_pb.Struct.AsObject,
    runtimeArgumentsList: Array<string>,
  }
}

export class ActionDefinition extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  clearDependsOnList(): void;
  getDependsOnList(): Array<string>;
  setDependsOnList(value: Array<string>): void;
  addDependsOn(value: string, index?: number): string;

  getActionType(): string;
  setActionType(value: string): void;

  getQueue(): string;
  setQueue(value: string): void;

  getTimeoutSeconds(): number;
  setTimeoutSeconds(value: number): void;

  getRetries(): number;
  setRetries(value: number): void;

  getIgnoreFailure(): boolean;
  setIgnoreFailure(value: boolean): void;

  getRunIf(): string;
  setRunIf(value: string): void;

  getDoNotRunIf(): string;
  setDoNotRunIf(value: string): void;

  clearInputArgumentsList(): void;
  getInputArgumentsList(): Array<Argument>;
  setInputArgumentsList(value: Array<Argument>): void;
  addInputArguments(value?: Argument, index?: number): Argument;

  getOutputArgument(): string;
  setOutputArgument(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ActionDefinition.AsObject;
  static toObject(includeInstance: boolean, msg: ActionDefinition): ActionDefinition.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ActionDefinition, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ActionDefinition;
  static deserializeBinaryFromReader(message: ActionDefinition, reader: jspb.BinaryReader): ActionDefinition;
}

export namespace ActionDefinition {
  export type AsObject = {
    id: string,
    dependsOnList: Array<string>,
    actionType: string,
    queue: string,
    timeoutSeconds: number,
    retries: number,
    ignoreFailure: boolean,
    runIf: string,
    doNotRunIf: string,
    inputArgumentsList: Array<Argument.AsObject>,
    outputArgument: string,
  }
}

export class Argument extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getVariable(): string;
  setVariable(value: string): void;

  hasValue(): boolean;
  clearValue(): void;
  getValue(): google_protobuf_struct_pb.Value | undefined;
  setValue(value?: google_protobuf_struct_pb.Value): void;

  getDefinition(): string;
  setDefinition(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Argument.AsObject;
  static toObject(includeInstance: boolean, msg: Argument): Argument.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Argument, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Argument;
  static deserializeBinaryFromReader(message: Argument, reader: jspb.BinaryReader): Argument;
}

export namespace Argument {
  export type AsObject = {
    name: string,
    variable: string,
    value?: google_protobuf_struct_pb.Value.AsObject,
    definition: string,
  }
}

export class GetWorkflowActionResponse extends jspb.Message {
  getDescription(): string;
  setDescription(value: string): void;

  clearInputArgumentsList(): void;
  getInputArgumentsList(): Array<string>;
  setInputArgumentsList(value: Array<string>): void;
  addInputArguments(value: string, index?: number): string;

  getOutputArgument(): string;
  setOutputArgument(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetWorkflowActionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetWorkflowActionResponse): GetWorkflowActionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetWorkflowActionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetWorkflowActionResponse;
  static deserializeBinaryFromReader(message: GetWorkflowActionResponse, reader: jspb.BinaryReader): GetWorkflowActionResponse;
}

export namespace GetWorkflowActionResponse {
  export type AsObject = {
    description: string,
    inputArgumentsList: Array<string>,
    outputArgument: string,
  }
}

export class WorkflowList extends jspb.Message {
  hasData(): boolean;
  clearData(): void;
  getData(): common_gateway_base_pb.ResultsList | undefined;
  setData(value?: common_gateway_base_pb.ResultsList): void;

  hasError(): boolean;
  clearError(): void;
  getError(): common_gateway_base_pb.Error | undefined;
  setError(value?: common_gateway_base_pb.Error): void;

  getResponseCase(): WorkflowList.ResponseCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkflowList.AsObject;
  static toObject(includeInstance: boolean, msg: WorkflowList): WorkflowList.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkflowList, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkflowList;
  static deserializeBinaryFromReader(message: WorkflowList, reader: jspb.BinaryReader): WorkflowList;
}

export namespace WorkflowList {
  export type AsObject = {
    data?: common_gateway_base_pb.ResultsList.AsObject,
    error?: common_gateway_base_pb.Error.AsObject,
  }

  export enum ResponseCase {
    RESPONSE_NOT_SET = 0,
    DATA = 1,
    ERROR = 2,
  }
}

export class WorkflowDefinitionList extends jspb.Message {
  clearResultsList(): void;
  getResultsList(): Array<WorkflowDefinition>;
  setResultsList(value: Array<WorkflowDefinition>): void;
  addResults(value?: WorkflowDefinition, index?: number): WorkflowDefinition;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkflowDefinitionList.AsObject;
  static toObject(includeInstance: boolean, msg: WorkflowDefinitionList): WorkflowDefinitionList.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkflowDefinitionList, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkflowDefinitionList;
  static deserializeBinaryFromReader(message: WorkflowDefinitionList, reader: jspb.BinaryReader): WorkflowDefinitionList;
}

export namespace WorkflowDefinitionList {
  export type AsObject = {
    resultsList: Array<WorkflowDefinition.AsObject>,
  }
}
