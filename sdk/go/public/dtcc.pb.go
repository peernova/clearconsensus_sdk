// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: public/dtcc.proto

package public

import (
	common "github.com/peernova/clearconsensus-sdk/sdk/go/common"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	_ "google.golang.org/protobuf/types/known/structpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type DtccTabRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AssetId    string             `protobuf:"bytes,1,opt,name=asset_id,json=assetId,proto3" json:"asset_id,omitempty"`
	TraceName  string             `protobuf:"bytes,2,opt,name=trace_name,json=traceName,proto3" json:"trace_name,omitempty"`
	SnapDate   string             `protobuf:"bytes,3,opt,name=snap_date,json=snapDate,proto3" json:"snap_date,omitempty"`
	FilterPack *common.FilterPack `protobuf:"bytes,4,opt,name=filter_pack,json=filterPack,proto3" json:"filter_pack,omitempty"`
	OrderBy    *common.OrderBy    `protobuf:"bytes,5,opt,name=orderBy,proto3" json:"orderBy,omitempty"`
	Page       *common.Page       `protobuf:"bytes,6,opt,name=page,proto3" json:"page,omitempty"`
	// Types that are assignable to Id:
	//
	//	*DtccTabRequest_SubmissionId
	//	*DtccTabRequest_SubGroupKeySearch
	Id isDtccTabRequest_Id `protobuf_oneof:"id"`
}

func (x *DtccTabRequest) Reset() {
	*x = DtccTabRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_public_dtcc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DtccTabRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DtccTabRequest) ProtoMessage() {}

func (x *DtccTabRequest) ProtoReflect() protoreflect.Message {
	mi := &file_public_dtcc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DtccTabRequest.ProtoReflect.Descriptor instead.
func (*DtccTabRequest) Descriptor() ([]byte, []int) {
	return file_public_dtcc_proto_rawDescGZIP(), []int{0}
}

func (x *DtccTabRequest) GetAssetId() string {
	if x != nil {
		return x.AssetId
	}
	return ""
}

func (x *DtccTabRequest) GetTraceName() string {
	if x != nil {
		return x.TraceName
	}
	return ""
}

func (x *DtccTabRequest) GetSnapDate() string {
	if x != nil {
		return x.SnapDate
	}
	return ""
}

func (x *DtccTabRequest) GetFilterPack() *common.FilterPack {
	if x != nil {
		return x.FilterPack
	}
	return nil
}

func (x *DtccTabRequest) GetOrderBy() *common.OrderBy {
	if x != nil {
		return x.OrderBy
	}
	return nil
}

func (x *DtccTabRequest) GetPage() *common.Page {
	if x != nil {
		return x.Page
	}
	return nil
}

func (m *DtccTabRequest) GetId() isDtccTabRequest_Id {
	if m != nil {
		return m.Id
	}
	return nil
}

func (x *DtccTabRequest) GetSubmissionId() string {
	if x, ok := x.GetId().(*DtccTabRequest_SubmissionId); ok {
		return x.SubmissionId
	}
	return ""
}

func (x *DtccTabRequest) GetSubGroupKeySearch() *SubGroupKeySearch {
	if x, ok := x.GetId().(*DtccTabRequest_SubGroupKeySearch); ok {
		return x.SubGroupKeySearch
	}
	return nil
}

type isDtccTabRequest_Id interface {
	isDtccTabRequest_Id()
}

type DtccTabRequest_SubmissionId struct {
	SubmissionId string `protobuf:"bytes,7,opt,name=submission_id,json=submissionId,proto3,oneof"`
}

type DtccTabRequest_SubGroupKeySearch struct {
	SubGroupKeySearch *SubGroupKeySearch `protobuf:"bytes,8,opt,name=sub_group_key_search,json=subGroupKeySearch,proto3,oneof"`
}

func (*DtccTabRequest_SubmissionId) isDtccTabRequest_Id() {}

func (*DtccTabRequest_SubGroupKeySearch) isDtccTabRequest_Id() {}

type SubGroupKeySearch struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SubSubmittedDate string             `protobuf:"bytes,1,opt,name=sub_submitted_date,json=subSubmittedDate,proto3" json:"sub_submitted_date,omitempty"`
	GroupKeys        *common.FilterPack `protobuf:"bytes,2,opt,name=group_keys,json=groupKeys,proto3" json:"group_keys,omitempty"`
}

func (x *SubGroupKeySearch) Reset() {
	*x = SubGroupKeySearch{}
	if protoimpl.UnsafeEnabled {
		mi := &file_public_dtcc_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubGroupKeySearch) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubGroupKeySearch) ProtoMessage() {}

func (x *SubGroupKeySearch) ProtoReflect() protoreflect.Message {
	mi := &file_public_dtcc_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubGroupKeySearch.ProtoReflect.Descriptor instead.
func (*SubGroupKeySearch) Descriptor() ([]byte, []int) {
	return file_public_dtcc_proto_rawDescGZIP(), []int{1}
}

func (x *SubGroupKeySearch) GetSubSubmittedDate() string {
	if x != nil {
		return x.SubSubmittedDate
	}
	return ""
}

func (x *SubGroupKeySearch) GetGroupKeys() *common.FilterPack {
	if x != nil {
		return x.GroupKeys
	}
	return nil
}

type DtccTabResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*DtccTabResponse_Data
	//	*DtccTabResponse_Error
	Response isDtccTabResponse_Response `protobuf_oneof:"response"`
}

func (x *DtccTabResponse) Reset() {
	*x = DtccTabResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_public_dtcc_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DtccTabResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DtccTabResponse) ProtoMessage() {}

func (x *DtccTabResponse) ProtoReflect() protoreflect.Message {
	mi := &file_public_dtcc_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DtccTabResponse.ProtoReflect.Descriptor instead.
func (*DtccTabResponse) Descriptor() ([]byte, []int) {
	return file_public_dtcc_proto_rawDescGZIP(), []int{2}
}

func (m *DtccTabResponse) GetResponse() isDtccTabResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *DtccTabResponse) GetData() *DtccTabResponseData {
	if x, ok := x.GetResponse().(*DtccTabResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *DtccTabResponse) GetError() *common.Error {
	if x, ok := x.GetResponse().(*DtccTabResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isDtccTabResponse_Response interface {
	isDtccTabResponse_Response()
}

type DtccTabResponse_Data struct {
	Data *DtccTabResponseData `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type DtccTabResponse_Error struct {
	Error *common.Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*DtccTabResponse_Data) isDtccTabResponse_Response() {}

func (*DtccTabResponse_Error) isDtccTabResponse_Response() {}

type DtccTabResponseData struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Columns []*common.ColumnInfo `protobuf:"bytes,1,rep,name=columns,proto3" json:"columns,omitempty"`
	Rows    []*common.ValuesRow  `protobuf:"bytes,2,rep,name=rows,proto3" json:"rows,omitempty"`
	Page    *common.Page         `protobuf:"bytes,3,opt,name=page,proto3" json:"page,omitempty"`
}

func (x *DtccTabResponseData) Reset() {
	*x = DtccTabResponseData{}
	if protoimpl.UnsafeEnabled {
		mi := &file_public_dtcc_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DtccTabResponseData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DtccTabResponseData) ProtoMessage() {}

func (x *DtccTabResponseData) ProtoReflect() protoreflect.Message {
	mi := &file_public_dtcc_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DtccTabResponseData.ProtoReflect.Descriptor instead.
func (*DtccTabResponseData) Descriptor() ([]byte, []int) {
	return file_public_dtcc_proto_rawDescGZIP(), []int{3}
}

func (x *DtccTabResponseData) GetColumns() []*common.ColumnInfo {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *DtccTabResponseData) GetRows() []*common.ValuesRow {
	if x != nil {
		return x.Rows
	}
	return nil
}

func (x *DtccTabResponseData) GetPage() *common.Page {
	if x != nil {
		return x.Page
	}
	return nil
}

var File_public_dtcc_proto protoreflect.FileDescriptor

var file_public_dtcc_proto_rawDesc = []byte{
	0x0a, 0x11, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x2f, 0x64, 0x74, 0x63, 0x63, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x1a, 0x1c, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x73, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0xec, 0x02, 0x0a, 0x0e, 0x44, 0x74, 0x63, 0x63, 0x54, 0x61, 0x62,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x19, 0x0a, 0x08, 0x61, 0x73, 0x73, 0x65, 0x74,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x61, 0x73, 0x73, 0x65, 0x74,
	0x49, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x72, 0x61, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x74, 0x72, 0x61, 0x63, 0x65, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x1b, 0x0a, 0x09, 0x73, 0x6e, 0x61, 0x70, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x73, 0x6e, 0x61, 0x70, 0x44, 0x61, 0x74, 0x65, 0x12, 0x35,
	0x0a, 0x0b, 0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x5f, 0x70, 0x61, 0x63, 0x6b, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x46,
	0x69, 0x6c, 0x74, 0x65, 0x72, 0x50, 0x61, 0x63, 0x6b, 0x52, 0x0a, 0x66, 0x69, 0x6c, 0x74, 0x65,
	0x72, 0x50, 0x61, 0x63, 0x6b, 0x12, 0x2b, 0x0a, 0x07, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x4f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79, 0x52, 0x07, 0x6f, 0x72, 0x64, 0x65, 0x72,
	0x42, 0x79, 0x12, 0x22, 0x0a, 0x04, 0x70, 0x61, 0x67, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0e, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x50, 0x61, 0x67, 0x65,
	0x52, 0x04, 0x70, 0x61, 0x67, 0x65, 0x12, 0x25, 0x0a, 0x0d, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x73,
	0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52,
	0x0c, 0x73, 0x75, 0x62, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x4e, 0x0a,
	0x14, 0x73, 0x75, 0x62, 0x5f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x6b, 0x65, 0x79, 0x5f, 0x73,
	0x65, 0x61, 0x72, 0x63, 0x68, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x53, 0x75, 0x62, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x4b,
	0x65, 0x79, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x48, 0x00, 0x52, 0x11, 0x73, 0x75, 0x62, 0x47,
	0x72, 0x6f, 0x75, 0x70, 0x4b, 0x65, 0x79, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x42, 0x04, 0x0a,
	0x02, 0x69, 0x64, 0x22, 0x76, 0x0a, 0x11, 0x53, 0x75, 0x62, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x4b,
	0x65, 0x79, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x12, 0x2c, 0x0a, 0x12, 0x73, 0x75, 0x62, 0x5f,
	0x73, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x73, 0x75, 0x62, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x74,
	0x65, 0x64, 0x44, 0x61, 0x74, 0x65, 0x12, 0x33, 0x0a, 0x0a, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f,
	0x6b, 0x65, 0x79, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x50, 0x61, 0x63, 0x6b,
	0x52, 0x09, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x4b, 0x65, 0x79, 0x73, 0x22, 0x7b, 0x0a, 0x0f, 0x44,
	0x74, 0x63, 0x63, 0x54, 0x61, 0x62, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x33,
	0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x44, 0x74, 0x63, 0x63, 0x54, 0x61, 0x62, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61, 0x48, 0x00, 0x52, 0x04, 0x64,
	0x61, 0x74, 0x61, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x45, 0x72,
	0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x42, 0x0a, 0x0a, 0x08,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x92, 0x01, 0x0a, 0x13, 0x44, 0x74, 0x63,
	0x63, 0x54, 0x61, 0x62, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61,
	0x12, 0x2e, 0x0a, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x14, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73,
	0x12, 0x27, 0x0a, 0x04, 0x72, 0x6f, 0x77, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x13,
	0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x73,
	0x52, 0x6f, 0x77, 0x52, 0x04, 0x72, 0x6f, 0x77, 0x73, 0x12, 0x22, 0x0a, 0x04, 0x70, 0x61, 0x67,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69,
	0x75, 0x6d, 0x2e, 0x50, 0x61, 0x67, 0x65, 0x52, 0x04, 0x70, 0x61, 0x67, 0x65, 0x32, 0x6f, 0x0a,
	0x0b, 0x44, 0x74, 0x63, 0x63, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x60, 0x0a, 0x0c,
	0x47, 0x65, 0x74, 0x44, 0x74, 0x63, 0x63, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x18, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x44, 0x74, 0x63, 0x63, 0x54, 0x61, 0x62, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x44, 0x74, 0x63, 0x63, 0x54, 0x61, 0x62, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x1b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x15, 0x22, 0x10, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x76, 0x31, 0x2f, 0x64, 0x74, 0x63, 0x63, 0x2f, 0x74, 0x61, 0x62, 0x3a, 0x01, 0x2a, 0x42, 0x5a,
	0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61, 0x63,
	0x65, 0x73, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61, 0x72, 0x63,
	0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73, 0x64, 0x6b,
	0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_public_dtcc_proto_rawDescOnce sync.Once
	file_public_dtcc_proto_rawDescData = file_public_dtcc_proto_rawDesc
)

func file_public_dtcc_proto_rawDescGZIP() []byte {
	file_public_dtcc_proto_rawDescOnce.Do(func() {
		file_public_dtcc_proto_rawDescData = protoimpl.X.CompressGZIP(file_public_dtcc_proto_rawDescData)
	})
	return file_public_dtcc_proto_rawDescData
}

var file_public_dtcc_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_public_dtcc_proto_goTypes = []interface{}{
	(*DtccTabRequest)(nil),      // 0: titanium.DtccTabRequest
	(*SubGroupKeySearch)(nil),   // 1: titanium.SubGroupKeySearch
	(*DtccTabResponse)(nil),     // 2: titanium.DtccTabResponse
	(*DtccTabResponseData)(nil), // 3: titanium.DtccTabResponseData
	(*common.FilterPack)(nil),   // 4: titanium.FilterPack
	(*common.OrderBy)(nil),      // 5: titanium.OrderBy
	(*common.Page)(nil),         // 6: titanium.Page
	(*common.Error)(nil),        // 7: titanium.Error
	(*common.ColumnInfo)(nil),   // 8: titanium.ColumnInfo
	(*common.ValuesRow)(nil),    // 9: titanium.ValuesRow
}
var file_public_dtcc_proto_depIdxs = []int32{
	4,  // 0: titanium.DtccTabRequest.filter_pack:type_name -> titanium.FilterPack
	5,  // 1: titanium.DtccTabRequest.orderBy:type_name -> titanium.OrderBy
	6,  // 2: titanium.DtccTabRequest.page:type_name -> titanium.Page
	1,  // 3: titanium.DtccTabRequest.sub_group_key_search:type_name -> titanium.SubGroupKeySearch
	4,  // 4: titanium.SubGroupKeySearch.group_keys:type_name -> titanium.FilterPack
	3,  // 5: titanium.DtccTabResponse.data:type_name -> titanium.DtccTabResponseData
	7,  // 6: titanium.DtccTabResponse.error:type_name -> titanium.Error
	8,  // 7: titanium.DtccTabResponseData.columns:type_name -> titanium.ColumnInfo
	9,  // 8: titanium.DtccTabResponseData.rows:type_name -> titanium.ValuesRow
	6,  // 9: titanium.DtccTabResponseData.page:type_name -> titanium.Page
	0,  // 10: titanium.DtccService.GetDtccTable:input_type -> titanium.DtccTabRequest
	2,  // 11: titanium.DtccService.GetDtccTable:output_type -> titanium.DtccTabResponse
	11, // [11:12] is the sub-list for method output_type
	10, // [10:11] is the sub-list for method input_type
	10, // [10:10] is the sub-list for extension type_name
	10, // [10:10] is the sub-list for extension extendee
	0,  // [0:10] is the sub-list for field type_name
}

func init() { file_public_dtcc_proto_init() }
func file_public_dtcc_proto_init() {
	if File_public_dtcc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_public_dtcc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DtccTabRequest); i {
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
		file_public_dtcc_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubGroupKeySearch); i {
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
		file_public_dtcc_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DtccTabResponse); i {
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
		file_public_dtcc_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DtccTabResponseData); i {
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
	file_public_dtcc_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*DtccTabRequest_SubmissionId)(nil),
		(*DtccTabRequest_SubGroupKeySearch)(nil),
	}
	file_public_dtcc_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*DtccTabResponse_Data)(nil),
		(*DtccTabResponse_Error)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_public_dtcc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_public_dtcc_proto_goTypes,
		DependencyIndexes: file_public_dtcc_proto_depIdxs,
		MessageInfos:      file_public_dtcc_proto_msgTypes,
	}.Build()
	File_public_dtcc_proto = out.File
	file_public_dtcc_proto_rawDesc = nil
	file_public_dtcc_proto_goTypes = nil
	file_public_dtcc_proto_depIdxs = nil
}
