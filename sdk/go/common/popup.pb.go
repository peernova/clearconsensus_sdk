// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: common/popup.proto

package common

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	structpb "google.golang.org/protobuf/types/known/structpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// PopUpViewRequest is request for information that need to be used in popup view
type PopUpViewRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AssetId               string `protobuf:"bytes,1,opt,name=asset_id,json=assetId,proto3" json:"asset_id,omitempty"` //the ID of the asset for which to request form information
	SubmittedDate         string `protobuf:"bytes,2,opt,name=submitted_date,json=submittedDate,proto3" json:"submitted_date,omitempty"`
	ConsensusRunTimestamp string `protobuf:"bytes,3,opt,name=consensus_run_timestamp,json=consensusRunTimestamp,proto3" json:"consensus_run_timestamp,omitempty"` // the timestamp of the consensus run.
	// Types that are assignable to Id:
	//
	//	*PopUpViewRequest_SubmittedId
	//	*PopUpViewRequest_ConsensusId
	//	*PopUpViewRequest_EvaluatedPriceId
	Id        isPopUpViewRequest_Id `protobuf_oneof:"id"`
	TraceName string                `protobuf:"bytes,7,opt,name=trace_name,json=traceName,proto3" json:"trace_name,omitempty"`
}

func (x *PopUpViewRequest) Reset() {
	*x = PopUpViewRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_popup_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PopUpViewRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PopUpViewRequest) ProtoMessage() {}

func (x *PopUpViewRequest) ProtoReflect() protoreflect.Message {
	mi := &file_common_popup_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PopUpViewRequest.ProtoReflect.Descriptor instead.
func (*PopUpViewRequest) Descriptor() ([]byte, []int) {
	return file_common_popup_proto_rawDescGZIP(), []int{0}
}

func (x *PopUpViewRequest) GetAssetId() string {
	if x != nil {
		return x.AssetId
	}
	return ""
}

func (x *PopUpViewRequest) GetSubmittedDate() string {
	if x != nil {
		return x.SubmittedDate
	}
	return ""
}

func (x *PopUpViewRequest) GetConsensusRunTimestamp() string {
	if x != nil {
		return x.ConsensusRunTimestamp
	}
	return ""
}

func (m *PopUpViewRequest) GetId() isPopUpViewRequest_Id {
	if m != nil {
		return m.Id
	}
	return nil
}

func (x *PopUpViewRequest) GetSubmittedId() string {
	if x, ok := x.GetId().(*PopUpViewRequest_SubmittedId); ok {
		return x.SubmittedId
	}
	return ""
}

func (x *PopUpViewRequest) GetConsensusId() string {
	if x, ok := x.GetId().(*PopUpViewRequest_ConsensusId); ok {
		return x.ConsensusId
	}
	return ""
}

func (x *PopUpViewRequest) GetEvaluatedPriceId() string {
	if x, ok := x.GetId().(*PopUpViewRequest_EvaluatedPriceId); ok {
		return x.EvaluatedPriceId
	}
	return ""
}

func (x *PopUpViewRequest) GetTraceName() string {
	if x != nil {
		return x.TraceName
	}
	return ""
}

type isPopUpViewRequest_Id interface {
	isPopUpViewRequest_Id()
}

type PopUpViewRequest_SubmittedId struct {
	SubmittedId string `protobuf:"bytes,4,opt,name=submitted_id,json=submittedId,proto3,oneof"`
}

type PopUpViewRequest_ConsensusId struct {
	ConsensusId string `protobuf:"bytes,5,opt,name=consensus_id,json=consensusId,proto3,oneof"`
}

type PopUpViewRequest_EvaluatedPriceId struct {
	EvaluatedPriceId string `protobuf:"bytes,6,opt,name=evaluated_price_id,json=evaluatedPriceId,proto3,oneof"`
}

func (*PopUpViewRequest_SubmittedId) isPopUpViewRequest_Id() {}

func (*PopUpViewRequest_ConsensusId) isPopUpViewRequest_Id() {}

func (*PopUpViewRequest_EvaluatedPriceId) isPopUpViewRequest_Id() {}

// PopUpViewResponse can contains error or response data for pop up view request.
type PopUpViewResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*PopUpViewResponse_Data
	//	*PopUpViewResponse_Error
	Response isPopUpViewResponse_Response `protobuf_oneof:"response"`
}

func (x *PopUpViewResponse) Reset() {
	*x = PopUpViewResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_popup_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PopUpViewResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PopUpViewResponse) ProtoMessage() {}

func (x *PopUpViewResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_popup_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PopUpViewResponse.ProtoReflect.Descriptor instead.
func (*PopUpViewResponse) Descriptor() ([]byte, []int) {
	return file_common_popup_proto_rawDescGZIP(), []int{1}
}

func (m *PopUpViewResponse) GetResponse() isPopUpViewResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *PopUpViewResponse) GetData() *PopUpViewResponseData {
	if x, ok := x.GetResponse().(*PopUpViewResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *PopUpViewResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*PopUpViewResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isPopUpViewResponse_Response interface {
	isPopUpViewResponse_Response()
}

type PopUpViewResponse_Data struct {
	Data *PopUpViewResponseData `protobuf:"bytes,1,opt,name=data,proto3,oneof"` //data which contains metadata and details about requested information based on type of ID in request.
}

type PopUpViewResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*PopUpViewResponse_Data) isPopUpViewResponse_Response() {}

func (*PopUpViewResponse_Error) isPopUpViewResponse_Response() {}

// PopUpViewResponseData contains several fields that provide information about a view in pop-up.
type PopUpViewResponseData struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Submission     *ViewRow `protobuf:"bytes,1,opt,name=submission,proto3" json:"submission,omitempty"`
	Consensus      *ViewRow `protobuf:"bytes,2,opt,name=consensus,proto3" json:"consensus,omitempty"`
	EvaluatedPrice *ViewRow `protobuf:"bytes,3,opt,name=evaluatedPrice,proto3" json:"evaluatedPrice,omitempty"`
	// Types that are assignable to Metadata:
	//
	//	*PopUpViewResponseData_ValidationErrors
	//	*PopUpViewResponseData_Outlier
	//	*PopUpViewResponseData_Benchmark
	Metadata          isPopUpViewResponseData_Metadata `protobuf_oneof:"metadata"`
	ConsensusDetails  *ConsensusDetail                 `protobuf:"bytes,7,opt,name=consensusDetails,proto3" json:"consensusDetails,omitempty"`
	RangesChart       string                           `protobuf:"bytes,8,opt,name=ranges_chart,json=rangesChart,proto3" json:"ranges_chart,omitempty"`
	DataQualityErrors *DataQualityErrors               `protobuf:"bytes,9,opt,name=dataQualityErrors,proto3" json:"dataQualityErrors,omitempty"`
	GroupingKeys      []*StringKeyVal                  `protobuf:"bytes,10,rep,name=grouping_keys,json=groupingKeys,proto3" json:"grouping_keys,omitempty"`
}

func (x *PopUpViewResponseData) Reset() {
	*x = PopUpViewResponseData{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_popup_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PopUpViewResponseData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PopUpViewResponseData) ProtoMessage() {}

func (x *PopUpViewResponseData) ProtoReflect() protoreflect.Message {
	mi := &file_common_popup_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PopUpViewResponseData.ProtoReflect.Descriptor instead.
func (*PopUpViewResponseData) Descriptor() ([]byte, []int) {
	return file_common_popup_proto_rawDescGZIP(), []int{2}
}

func (x *PopUpViewResponseData) GetSubmission() *ViewRow {
	if x != nil {
		return x.Submission
	}
	return nil
}

func (x *PopUpViewResponseData) GetConsensus() *ViewRow {
	if x != nil {
		return x.Consensus
	}
	return nil
}

func (x *PopUpViewResponseData) GetEvaluatedPrice() *ViewRow {
	if x != nil {
		return x.EvaluatedPrice
	}
	return nil
}

func (m *PopUpViewResponseData) GetMetadata() isPopUpViewResponseData_Metadata {
	if m != nil {
		return m.Metadata
	}
	return nil
}

func (x *PopUpViewResponseData) GetValidationErrors() string {
	if x, ok := x.GetMetadata().(*PopUpViewResponseData_ValidationErrors); ok {
		return x.ValidationErrors
	}
	return ""
}

func (x *PopUpViewResponseData) GetOutlier() string {
	if x, ok := x.GetMetadata().(*PopUpViewResponseData_Outlier); ok {
		return x.Outlier
	}
	return ""
}

func (x *PopUpViewResponseData) GetBenchmark() string {
	if x, ok := x.GetMetadata().(*PopUpViewResponseData_Benchmark); ok {
		return x.Benchmark
	}
	return ""
}

func (x *PopUpViewResponseData) GetConsensusDetails() *ConsensusDetail {
	if x != nil {
		return x.ConsensusDetails
	}
	return nil
}

func (x *PopUpViewResponseData) GetRangesChart() string {
	if x != nil {
		return x.RangesChart
	}
	return ""
}

func (x *PopUpViewResponseData) GetDataQualityErrors() *DataQualityErrors {
	if x != nil {
		return x.DataQualityErrors
	}
	return nil
}

func (x *PopUpViewResponseData) GetGroupingKeys() []*StringKeyVal {
	if x != nil {
		return x.GroupingKeys
	}
	return nil
}

type isPopUpViewResponseData_Metadata interface {
	isPopUpViewResponseData_Metadata()
}

type PopUpViewResponseData_ValidationErrors struct {
	ValidationErrors string `protobuf:"bytes,4,opt,name=validationErrors,proto3,oneof"`
}

type PopUpViewResponseData_Outlier struct {
	Outlier string `protobuf:"bytes,5,opt,name=outlier,proto3,oneof"`
}

type PopUpViewResponseData_Benchmark struct {
	Benchmark string `protobuf:"bytes,6,opt,name=benchmark,proto3,oneof"`
}

func (*PopUpViewResponseData_ValidationErrors) isPopUpViewResponseData_Metadata() {}

func (*PopUpViewResponseData_Outlier) isPopUpViewResponseData_Metadata() {}

func (*PopUpViewResponseData_Benchmark) isPopUpViewResponseData_Metadata() {}

// ViewRow contains information about the columns in the view and value for each column.
type ViewRow struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Columns []*ColumnInfo     `protobuf:"bytes,1,rep,name=columns,proto3" json:"columns,omitempty"` //repeated field that represent information about columns
	Values  []*structpb.Value `protobuf:"bytes,2,rep,name=values,proto3" json:"values,omitempty"`   //repeated field which represents values
}

func (x *ViewRow) Reset() {
	*x = ViewRow{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_popup_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ViewRow) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ViewRow) ProtoMessage() {}

func (x *ViewRow) ProtoReflect() protoreflect.Message {
	mi := &file_common_popup_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ViewRow.ProtoReflect.Descriptor instead.
func (*ViewRow) Descriptor() ([]byte, []int) {
	return file_common_popup_proto_rawDescGZIP(), []int{3}
}

func (x *ViewRow) GetColumns() []*ColumnInfo {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *ViewRow) GetValues() []*structpb.Value {
	if x != nil {
		return x.Values
	}
	return nil
}

type PopViewStatus struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ParsingStatus              string `protobuf:"bytes,1,opt,name=parsingStatus,proto3" json:"parsingStatus,omitempty"`
	HighestSeverity            string `protobuf:"bytes,2,opt,name=highestSeverity,proto3" json:"highestSeverity,omitempty"`
	ConsensusCalculationStatus string `protobuf:"bytes,3,opt,name=consensusCalculationStatus,proto3" json:"consensusCalculationStatus,omitempty"`
	ConsensusDetailStatus      string `protobuf:"bytes,4,opt,name=consensusDetailStatus,proto3" json:"consensusDetailStatus,omitempty"`
}

func (x *PopViewStatus) Reset() {
	*x = PopViewStatus{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_popup_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PopViewStatus) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PopViewStatus) ProtoMessage() {}

func (x *PopViewStatus) ProtoReflect() protoreflect.Message {
	mi := &file_common_popup_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PopViewStatus.ProtoReflect.Descriptor instead.
func (*PopViewStatus) Descriptor() ([]byte, []int) {
	return file_common_popup_proto_rawDescGZIP(), []int{4}
}

func (x *PopViewStatus) GetParsingStatus() string {
	if x != nil {
		return x.ParsingStatus
	}
	return ""
}

func (x *PopViewStatus) GetHighestSeverity() string {
	if x != nil {
		return x.HighestSeverity
	}
	return ""
}

func (x *PopViewStatus) GetConsensusCalculationStatus() string {
	if x != nil {
		return x.ConsensusCalculationStatus
	}
	return ""
}

func (x *PopViewStatus) GetConsensusDetailStatus() string {
	if x != nil {
		return x.ConsensusDetailStatus
	}
	return ""
}

var File_common_popup_proto protoreflect.FileDescriptor

var file_common_popup_proto_rawDesc = []byte{
	0x0a, 0x12, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x70, 0x6f, 0x70, 0x75, 0x70, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x1a, 0x1c,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x62, 0x61, 0x73,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xab, 0x02, 0x0a, 0x10, 0x50, 0x6f, 0x70, 0x55,
	0x70, 0x56, 0x69, 0x65, 0x77, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x19, 0x0a, 0x08,
	0x61, 0x73, 0x73, 0x65, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07,
	0x61, 0x73, 0x73, 0x65, 0x74, 0x49, 0x64, 0x12, 0x25, 0x0a, 0x0e, 0x73, 0x75, 0x62, 0x6d, 0x69,
	0x74, 0x74, 0x65, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0d, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x44, 0x61, 0x74, 0x65, 0x12, 0x36,
	0x0a, 0x17, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x5f, 0x72, 0x75, 0x6e, 0x5f,
	0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x15, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x52, 0x75, 0x6e, 0x54, 0x69, 0x6d,
	0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x12, 0x23, 0x0a, 0x0c, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x74,
	0x74, 0x65, 0x64, 0x5f, 0x69, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x0b,
	0x73, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x49, 0x64, 0x12, 0x23, 0x0a, 0x0c, 0x63,
	0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x5f, 0x69, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x09, 0x48, 0x00, 0x52, 0x0b, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x49, 0x64,
	0x12, 0x2e, 0x0a, 0x12, 0x65, 0x76, 0x61, 0x6c, 0x75, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x70, 0x72,
	0x69, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x10,
	0x65, 0x76, 0x61, 0x6c, 0x75, 0x61, 0x74, 0x65, 0x64, 0x50, 0x72, 0x69, 0x63, 0x65, 0x49, 0x64,
	0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x72, 0x61, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x74, 0x72, 0x61, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x42,
	0x04, 0x0a, 0x02, 0x69, 0x64, 0x22, 0x7f, 0x0a, 0x11, 0x50, 0x6f, 0x70, 0x55, 0x70, 0x56, 0x69,
	0x65, 0x77, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x35, 0x0a, 0x04, 0x64, 0x61,
	0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e,
	0x69, 0x75, 0x6d, 0x2e, 0x50, 0x6f, 0x70, 0x55, 0x70, 0x56, 0x69, 0x65, 0x77, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61, 0x48, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x45, 0x72, 0x72, 0x6f,
	0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x9e, 0x04, 0x0a, 0x15, 0x50, 0x6f, 0x70, 0x55, 0x70,
	0x56, 0x69, 0x65, 0x77, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61,
	0x12, 0x31, 0x0a, 0x0a, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e,
	0x56, 0x69, 0x65, 0x77, 0x52, 0x6f, 0x77, 0x52, 0x0a, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x12, 0x2f, 0x0a, 0x09, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x56, 0x69, 0x65, 0x77, 0x52, 0x6f, 0x77, 0x52, 0x09, 0x63, 0x6f, 0x6e, 0x73, 0x65,
	0x6e, 0x73, 0x75, 0x73, 0x12, 0x39, 0x0a, 0x0e, 0x65, 0x76, 0x61, 0x6c, 0x75, 0x61, 0x74, 0x65,
	0x64, 0x50, 0x72, 0x69, 0x63, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x56, 0x69, 0x65, 0x77, 0x52, 0x6f, 0x77, 0x52,
	0x0e, 0x65, 0x76, 0x61, 0x6c, 0x75, 0x61, 0x74, 0x65, 0x64, 0x50, 0x72, 0x69, 0x63, 0x65, 0x12,
	0x2c, 0x0a, 0x10, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x45, 0x72, 0x72,
	0x6f, 0x72, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x10, 0x76, 0x61, 0x6c,
	0x69, 0x64, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x12, 0x1a, 0x0a,
	0x07, 0x6f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00,
	0x52, 0x07, 0x6f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x12, 0x1e, 0x0a, 0x09, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x6d, 0x61, 0x72, 0x6b, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x09,
	0x62, 0x65, 0x6e, 0x63, 0x68, 0x6d, 0x61, 0x72, 0x6b, 0x12, 0x45, 0x0a, 0x10, 0x63, 0x6f, 0x6e,
	0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43,
	0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x52, 0x10,
	0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73,
	0x12, 0x21, 0x0a, 0x0c, 0x72, 0x61, 0x6e, 0x67, 0x65, 0x73, 0x5f, 0x63, 0x68, 0x61, 0x72, 0x74,
	0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x72, 0x61, 0x6e, 0x67, 0x65, 0x73, 0x43, 0x68,
	0x61, 0x72, 0x74, 0x12, 0x49, 0x0a, 0x11, 0x64, 0x61, 0x74, 0x61, 0x51, 0x75, 0x61, 0x6c, 0x69,
	0x74, 0x79, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b,
	0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x51, 0x75,
	0x61, 0x6c, 0x69, 0x74, 0x79, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x52, 0x11, 0x64, 0x61, 0x74,
	0x61, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x12, 0x3b,
	0x0a, 0x0d, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x69, 0x6e, 0x67, 0x5f, 0x6b, 0x65, 0x79, 0x73, 0x18,
	0x0a, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x56, 0x61, 0x6c, 0x52, 0x0c, 0x67,
	0x72, 0x6f, 0x75, 0x70, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x73, 0x42, 0x0a, 0x0a, 0x08, 0x6d,
	0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x22, 0x69, 0x0a, 0x07, 0x56, 0x69, 0x65, 0x77, 0x52,
	0x6f, 0x77, 0x12, 0x2e, 0x0a, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43,
	0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d,
	0x6e, 0x73, 0x12, 0x2e, 0x0a, 0x06, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x06, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x73, 0x22, 0xd5, 0x01, 0x0a, 0x0d, 0x50, 0x6f, 0x70, 0x56, 0x69, 0x65, 0x77, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x24, 0x0a, 0x0d, 0x70, 0x61, 0x72, 0x73, 0x69, 0x6e, 0x67, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x70, 0x61, 0x72,
	0x73, 0x69, 0x6e, 0x67, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x28, 0x0a, 0x0f, 0x68, 0x69,
	0x67, 0x68, 0x65, 0x73, 0x74, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0f, 0x68, 0x69, 0x67, 0x68, 0x65, 0x73, 0x74, 0x53, 0x65, 0x76, 0x65,
	0x72, 0x69, 0x74, 0x79, 0x12, 0x3e, 0x0a, 0x1a, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75,
	0x73, 0x43, 0x61, 0x6c, 0x63, 0x75, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x1a, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e,
	0x73, 0x75, 0x73, 0x43, 0x61, 0x6c, 0x63, 0x75, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x34, 0x0a, 0x15, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75,
	0x73, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x15, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x44, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x73, 0x0a, 0x20, 0x63, 0x6f,
	0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e,
	0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61, 0x63, 0x65, 0x73, 0x42, 0x17,
	0x50, 0x6f, 0x70, 0x55, 0x70, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63,
	0x6c, 0x65, 0x61, 0x72, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73, 0x64,
	0x6b, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_common_popup_proto_rawDescOnce sync.Once
	file_common_popup_proto_rawDescData = file_common_popup_proto_rawDesc
)

func file_common_popup_proto_rawDescGZIP() []byte {
	file_common_popup_proto_rawDescOnce.Do(func() {
		file_common_popup_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_popup_proto_rawDescData)
	})
	return file_common_popup_proto_rawDescData
}

var file_common_popup_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_common_popup_proto_goTypes = []interface{}{
	(*PopUpViewRequest)(nil),      // 0: titanium.PopUpViewRequest
	(*PopUpViewResponse)(nil),     // 1: titanium.PopUpViewResponse
	(*PopUpViewResponseData)(nil), // 2: titanium.PopUpViewResponseData
	(*ViewRow)(nil),               // 3: titanium.ViewRow
	(*PopViewStatus)(nil),         // 4: titanium.PopViewStatus
	(*Error)(nil),                 // 5: titanium.Error
	(*ConsensusDetail)(nil),       // 6: titanium.ConsensusDetail
	(*DataQualityErrors)(nil),     // 7: titanium.DataQualityErrors
	(*StringKeyVal)(nil),          // 8: titanium.StringKeyVal
	(*ColumnInfo)(nil),            // 9: titanium.ColumnInfo
	(*structpb.Value)(nil),        // 10: google.protobuf.Value
}
var file_common_popup_proto_depIdxs = []int32{
	2,  // 0: titanium.PopUpViewResponse.data:type_name -> titanium.PopUpViewResponseData
	5,  // 1: titanium.PopUpViewResponse.error:type_name -> titanium.Error
	3,  // 2: titanium.PopUpViewResponseData.submission:type_name -> titanium.ViewRow
	3,  // 3: titanium.PopUpViewResponseData.consensus:type_name -> titanium.ViewRow
	3,  // 4: titanium.PopUpViewResponseData.evaluatedPrice:type_name -> titanium.ViewRow
	6,  // 5: titanium.PopUpViewResponseData.consensusDetails:type_name -> titanium.ConsensusDetail
	7,  // 6: titanium.PopUpViewResponseData.dataQualityErrors:type_name -> titanium.DataQualityErrors
	8,  // 7: titanium.PopUpViewResponseData.grouping_keys:type_name -> titanium.StringKeyVal
	9,  // 8: titanium.ViewRow.columns:type_name -> titanium.ColumnInfo
	10, // 9: titanium.ViewRow.values:type_name -> google.protobuf.Value
	10, // [10:10] is the sub-list for method output_type
	10, // [10:10] is the sub-list for method input_type
	10, // [10:10] is the sub-list for extension type_name
	10, // [10:10] is the sub-list for extension extendee
	0,  // [0:10] is the sub-list for field type_name
}

func init() { file_common_popup_proto_init() }
func file_common_popup_proto_init() {
	if File_common_popup_proto != nil {
		return
	}
	file_common_gateway_base_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_popup_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PopUpViewRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_common_popup_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PopUpViewResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_common_popup_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PopUpViewResponseData); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_common_popup_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ViewRow); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_common_popup_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PopViewStatus); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_common_popup_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*PopUpViewRequest_SubmittedId)(nil),
		(*PopUpViewRequest_ConsensusId)(nil),
		(*PopUpViewRequest_EvaluatedPriceId)(nil),
	}
	file_common_popup_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*PopUpViewResponse_Data)(nil),
		(*PopUpViewResponse_Error)(nil),
	}
	file_common_popup_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*PopUpViewResponseData_ValidationErrors)(nil),
		(*PopUpViewResponseData_Outlier)(nil),
		(*PopUpViewResponseData_Benchmark)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_popup_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_popup_proto_goTypes,
		DependencyIndexes: file_common_popup_proto_depIdxs,
		MessageInfos:      file_common_popup_proto_msgTypes,
	}.Build()
	File_common_popup_proto = out.File
	file_common_popup_proto_rawDesc = nil
	file_common_popup_proto_goTypes = nil
	file_common_popup_proto_depIdxs = nil
}
