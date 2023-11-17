// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: common/udf.proto

package common

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type UdfType int32

const (
	UdfType_VALUE   UdfType = 0
	UdfType_ERRORS  UdfType = 1
	UdfType_DATASET UdfType = 2
)

// Enum value maps for UdfType.
var (
	UdfType_name = map[int32]string{
		0: "VALUE",
		1: "ERRORS",
		2: "DATASET",
	}
	UdfType_value = map[string]int32{
		"VALUE":   0,
		"ERRORS":  1,
		"DATASET": 2,
	}
)

func (x UdfType) Enum() *UdfType {
	p := new(UdfType)
	*p = x
	return p
}

func (x UdfType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (UdfType) Descriptor() protoreflect.EnumDescriptor {
	return file_common_udf_proto_enumTypes[0].Descriptor()
}

func (UdfType) Type() protoreflect.EnumType {
	return &file_common_udf_proto_enumTypes[0]
}

func (x UdfType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use UdfType.Descriptor instead.
func (UdfType) EnumDescriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{0}
}

type UdfMetadata_UdfFieldType int32

const (
	UdfMetadata_STRING      UdfMetadata_UdfFieldType = 0
	UdfMetadata_BOOLEAN     UdfMetadata_UdfFieldType = 1
	UdfMetadata_BIGDECIMAL  UdfMetadata_UdfFieldType = 2
	UdfMetadata_TIMESTAMP   UdfMetadata_UdfFieldType = 3
	UdfMetadata_LONG        UdfMetadata_UdfFieldType = 4
	UdfMetadata_LIST        UdfMetadata_UdfFieldType = 5
	UdfMetadata_FLOAT       UdfMetadata_UdfFieldType = 6
	UdfMetadata_DOUBLE      UdfMetadata_UdfFieldType = 7
	UdfMetadata_INTEGER     UdfMetadata_UdfFieldType = 8
	UdfMetadata_LOOKUPTABLE UdfMetadata_UdfFieldType = 9
	UdfMetadata_RULEERROR   UdfMetadata_UdfFieldType = 10
	UdfMetadata_DATASET     UdfMetadata_UdfFieldType = 11
)

// Enum value maps for UdfMetadata_UdfFieldType.
var (
	UdfMetadata_UdfFieldType_name = map[int32]string{
		0:  "STRING",
		1:  "BOOLEAN",
		2:  "BIGDECIMAL",
		3:  "TIMESTAMP",
		4:  "LONG",
		5:  "LIST",
		6:  "FLOAT",
		7:  "DOUBLE",
		8:  "INTEGER",
		9:  "LOOKUPTABLE",
		10: "RULEERROR",
		11: "DATASET",
	}
	UdfMetadata_UdfFieldType_value = map[string]int32{
		"STRING":      0,
		"BOOLEAN":     1,
		"BIGDECIMAL":  2,
		"TIMESTAMP":   3,
		"LONG":        4,
		"LIST":        5,
		"FLOAT":       6,
		"DOUBLE":      7,
		"INTEGER":     8,
		"LOOKUPTABLE": 9,
		"RULEERROR":   10,
		"DATASET":     11,
	}
)

func (x UdfMetadata_UdfFieldType) Enum() *UdfMetadata_UdfFieldType {
	p := new(UdfMetadata_UdfFieldType)
	*p = x
	return p
}

func (x UdfMetadata_UdfFieldType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (UdfMetadata_UdfFieldType) Descriptor() protoreflect.EnumDescriptor {
	return file_common_udf_proto_enumTypes[1].Descriptor()
}

func (UdfMetadata_UdfFieldType) Type() protoreflect.EnumType {
	return &file_common_udf_proto_enumTypes[1]
}

func (x UdfMetadata_UdfFieldType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use UdfMetadata_UdfFieldType.Descriptor instead.
func (UdfMetadata_UdfFieldType) EnumDescriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{4, 0}
}

type UdfItem struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name         string  `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type         UdfType `protobuf:"varint,2,opt,name=type,proto3,enum=titanium.UdfType" json:"type,omitempty"`
	LastModified string  `protobuf:"bytes,3,opt,name=last_modified,json=lastModified,proto3" json:"last_modified,omitempty"`
}

func (x *UdfItem) Reset() {
	*x = UdfItem{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UdfItem) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UdfItem) ProtoMessage() {}

func (x *UdfItem) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UdfItem.ProtoReflect.Descriptor instead.
func (*UdfItem) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{0}
}

func (x *UdfItem) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UdfItem) GetType() UdfType {
	if x != nil {
		return x.Type
	}
	return UdfType_VALUE
}

func (x *UdfItem) GetLastModified() string {
	if x != nil {
		return x.LastModified
	}
	return ""
}

type UdfList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Results []*UdfItem `protobuf:"bytes,1,rep,name=results,proto3" json:"results,omitempty"`
}

func (x *UdfList) Reset() {
	*x = UdfList{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UdfList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UdfList) ProtoMessage() {}

func (x *UdfList) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UdfList.ProtoReflect.Descriptor instead.
func (*UdfList) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{1}
}

func (x *UdfList) GetResults() []*UdfItem {
	if x != nil {
		return x.Results
	}
	return nil
}

type ListUdfResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*ListUdfResponse_Data
	//	*ListUdfResponse_Error
	Response isListUdfResponse_Response `protobuf_oneof:"response"`
}

func (x *ListUdfResponse) Reset() {
	*x = ListUdfResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListUdfResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListUdfResponse) ProtoMessage() {}

func (x *ListUdfResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListUdfResponse.ProtoReflect.Descriptor instead.
func (*ListUdfResponse) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{2}
}

func (m *ListUdfResponse) GetResponse() isListUdfResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *ListUdfResponse) GetData() *UdfList {
	if x, ok := x.GetResponse().(*ListUdfResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *ListUdfResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*ListUdfResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isListUdfResponse_Response interface {
	isListUdfResponse_Response()
}

type ListUdfResponse_Data struct {
	Data *UdfList `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type ListUdfResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*ListUdfResponse_Data) isListUdfResponse_Response() {}

func (*ListUdfResponse_Error) isListUdfResponse_Response() {}

type UdfNameRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name  string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Scope string `protobuf:"bytes,2,opt,name=scope,proto3" json:"scope,omitempty"`
}

func (x *UdfNameRequest) Reset() {
	*x = UdfNameRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UdfNameRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UdfNameRequest) ProtoMessage() {}

func (x *UdfNameRequest) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UdfNameRequest.ProtoReflect.Descriptor instead.
func (*UdfNameRequest) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{3}
}

func (x *UdfNameRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UdfNameRequest) GetScope() string {
	if x != nil {
		return x.Scope
	}
	return ""
}

type UdfMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name              string                     `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type              UdfType                    `protobuf:"varint,2,opt,name=type,proto3,enum=titanium.UdfType" json:"type,omitempty"`
	Args              []UdfMetadata_UdfFieldType `protobuf:"varint,3,rep,packed,name=args,proto3,enum=titanium.UdfMetadata_UdfFieldType" json:"args,omitempty"`
	Output            UdfMetadata_UdfFieldType   `protobuf:"varint,4,opt,name=output,proto3,enum=titanium.UdfMetadata_UdfFieldType" json:"output,omitempty"`
	ColumnTypes       []UdfMetadata_UdfFieldType `protobuf:"varint,5,rep,packed,name=column_types,json=columnTypes,proto3,enum=titanium.UdfMetadata_UdfFieldType" json:"column_types,omitempty"`
	DetailColumnTypes []string                   `protobuf:"bytes,6,rep,name=detail_column_types,json=detailColumnTypes,proto3" json:"detail_column_types,omitempty"`
}

func (x *UdfMetadata) Reset() {
	*x = UdfMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UdfMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UdfMetadata) ProtoMessage() {}

func (x *UdfMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UdfMetadata.ProtoReflect.Descriptor instead.
func (*UdfMetadata) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{4}
}

func (x *UdfMetadata) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UdfMetadata) GetType() UdfType {
	if x != nil {
		return x.Type
	}
	return UdfType_VALUE
}

func (x *UdfMetadata) GetArgs() []UdfMetadata_UdfFieldType {
	if x != nil {
		return x.Args
	}
	return nil
}

func (x *UdfMetadata) GetOutput() UdfMetadata_UdfFieldType {
	if x != nil {
		return x.Output
	}
	return UdfMetadata_STRING
}

func (x *UdfMetadata) GetColumnTypes() []UdfMetadata_UdfFieldType {
	if x != nil {
		return x.ColumnTypes
	}
	return nil
}

func (x *UdfMetadata) GetDetailColumnTypes() []string {
	if x != nil {
		return x.DetailColumnTypes
	}
	return nil
}

type GetUdfResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*GetUdfResponse_Data
	//	*GetUdfResponse_Error
	Response isGetUdfResponse_Response `protobuf_oneof:"response"`
}

func (x *GetUdfResponse) Reset() {
	*x = GetUdfResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_udf_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUdfResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUdfResponse) ProtoMessage() {}

func (x *GetUdfResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_udf_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUdfResponse.ProtoReflect.Descriptor instead.
func (*GetUdfResponse) Descriptor() ([]byte, []int) {
	return file_common_udf_proto_rawDescGZIP(), []int{5}
}

func (m *GetUdfResponse) GetResponse() isGetUdfResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *GetUdfResponse) GetData() *UdfMetadata {
	if x, ok := x.GetResponse().(*GetUdfResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *GetUdfResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*GetUdfResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isGetUdfResponse_Response interface {
	isGetUdfResponse_Response()
}

type GetUdfResponse_Data struct {
	Data *UdfMetadata `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type GetUdfResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*GetUdfResponse_Data) isGetUdfResponse_Response() {}

func (*GetUdfResponse_Error) isGetUdfResponse_Response() {}

var File_common_udf_proto protoreflect.FileDescriptor

var file_common_udf_proto_rawDesc = []byte{
	0x0a, 0x10, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x64, 0x66, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x1a, 0x1c, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x69, 0x0a, 0x07, 0x55, 0x64, 0x66, 0x49, 0x74, 0x65, 0x6d,
	0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x25, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64,
	0x66, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x23, 0x0a, 0x0d, 0x6c,
	0x61, 0x73, 0x74, 0x5f, 0x6d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x64, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0c, 0x6c, 0x61, 0x73, 0x74, 0x4d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x64,
	0x22, 0x36, 0x0a, 0x07, 0x55, 0x64, 0x66, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x2b, 0x0a, 0x07, 0x72,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x49, 0x74, 0x65, 0x6d, 0x52,
	0x07, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x22, 0x6f, 0x0a, 0x0f, 0x4c, 0x69, 0x73, 0x74,
	0x55, 0x64, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x27, 0x0a, 0x04, 0x64,
	0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61,
	0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x4c, 0x69, 0x73, 0x74, 0x48, 0x00, 0x52, 0x04,
	0x64, 0x61, 0x74, 0x61, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x45,
	0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x42, 0x0a, 0x0a,
	0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x3a, 0x0a, 0x0e, 0x55, 0x64, 0x66,
	0x4e, 0x61, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0x14, 0x0a, 0x05, 0x73, 0x63, 0x6f, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05,
	0x73, 0x63, 0x6f, 0x70, 0x65, 0x22, 0xe1, 0x03, 0x0a, 0x0b, 0x55, 0x64, 0x66, 0x4d, 0x65, 0x74,
	0x61, 0x64, 0x61, 0x74, 0x61, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x25, 0x0a, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69,
	0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65,
	0x12, 0x36, 0x0a, 0x04, 0x61, 0x72, 0x67, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x22,
	0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x4d, 0x65, 0x74,
	0x61, 0x64, 0x61, 0x74, 0x61, 0x2e, 0x55, 0x64, 0x66, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x04, 0x61, 0x72, 0x67, 0x73, 0x12, 0x3a, 0x0a, 0x06, 0x6f, 0x75, 0x74, 0x70,
	0x75, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e,
	0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x2e,
	0x55, 0x64, 0x66, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x54, 0x79, 0x70, 0x65, 0x52, 0x06, 0x6f, 0x75,
	0x74, 0x70, 0x75, 0x74, 0x12, 0x45, 0x0a, 0x0c, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x22, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74,
	0x61, 0x2e, 0x55, 0x64, 0x66, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b,
	0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x73, 0x12, 0x2e, 0x0a, 0x13, 0x64,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x5f, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x18, 0x06, 0x20, 0x03, 0x28, 0x09, 0x52, 0x11, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x73, 0x22, 0xab, 0x01, 0x0a, 0x0c,
	0x55, 0x64, 0x66, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x54, 0x79, 0x70, 0x65, 0x12, 0x0a, 0x0a, 0x06,
	0x53, 0x54, 0x52, 0x49, 0x4e, 0x47, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x42, 0x4f, 0x4f, 0x4c,
	0x45, 0x41, 0x4e, 0x10, 0x01, 0x12, 0x0e, 0x0a, 0x0a, 0x42, 0x49, 0x47, 0x44, 0x45, 0x43, 0x49,
	0x4d, 0x41, 0x4c, 0x10, 0x02, 0x12, 0x0d, 0x0a, 0x09, 0x54, 0x49, 0x4d, 0x45, 0x53, 0x54, 0x41,
	0x4d, 0x50, 0x10, 0x03, 0x12, 0x08, 0x0a, 0x04, 0x4c, 0x4f, 0x4e, 0x47, 0x10, 0x04, 0x12, 0x08,
	0x0a, 0x04, 0x4c, 0x49, 0x53, 0x54, 0x10, 0x05, 0x12, 0x09, 0x0a, 0x05, 0x46, 0x4c, 0x4f, 0x41,
	0x54, 0x10, 0x06, 0x12, 0x0a, 0x0a, 0x06, 0x44, 0x4f, 0x55, 0x42, 0x4c, 0x45, 0x10, 0x07, 0x12,
	0x0b, 0x0a, 0x07, 0x49, 0x4e, 0x54, 0x45, 0x47, 0x45, 0x52, 0x10, 0x08, 0x12, 0x0f, 0x0a, 0x0b,
	0x4c, 0x4f, 0x4f, 0x4b, 0x55, 0x50, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x10, 0x09, 0x12, 0x0d, 0x0a,
	0x09, 0x52, 0x55, 0x4c, 0x45, 0x45, 0x52, 0x52, 0x4f, 0x52, 0x10, 0x0a, 0x12, 0x0b, 0x0a, 0x07,
	0x44, 0x41, 0x54, 0x41, 0x53, 0x45, 0x54, 0x10, 0x0b, 0x22, 0x72, 0x0a, 0x0e, 0x47, 0x65, 0x74,
	0x55, 0x64, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x2b, 0x0a, 0x04, 0x64,
	0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x74, 0x69, 0x74, 0x61,
	0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x64, 0x66, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0x48, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69,
	0x75, 0x6d, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2a, 0x2d, 0x0a,
	0x07, 0x55, 0x64, 0x66, 0x54, 0x79, 0x70, 0x65, 0x12, 0x09, 0x0a, 0x05, 0x56, 0x41, 0x4c, 0x55,
	0x45, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x45, 0x52, 0x52, 0x4f, 0x52, 0x53, 0x10, 0x01, 0x12,
	0x0b, 0x0a, 0x07, 0x44, 0x41, 0x54, 0x41, 0x53, 0x45, 0x54, 0x10, 0x02, 0x42, 0x64, 0x0a, 0x20,
	0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61, 0x63, 0x65, 0x73,
	0x42, 0x08, 0x55, 0x64, 0x66, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76,
	0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61, 0x72, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73,
	0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_common_udf_proto_rawDescOnce sync.Once
	file_common_udf_proto_rawDescData = file_common_udf_proto_rawDesc
)

func file_common_udf_proto_rawDescGZIP() []byte {
	file_common_udf_proto_rawDescOnce.Do(func() {
		file_common_udf_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_udf_proto_rawDescData)
	})
	return file_common_udf_proto_rawDescData
}

var file_common_udf_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_common_udf_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_common_udf_proto_goTypes = []interface{}{
	(UdfType)(0),                  // 0: titanium.UdfType
	(UdfMetadata_UdfFieldType)(0), // 1: titanium.UdfMetadata.UdfFieldType
	(*UdfItem)(nil),               // 2: titanium.UdfItem
	(*UdfList)(nil),               // 3: titanium.UdfList
	(*ListUdfResponse)(nil),       // 4: titanium.ListUdfResponse
	(*UdfNameRequest)(nil),        // 5: titanium.UdfNameRequest
	(*UdfMetadata)(nil),           // 6: titanium.UdfMetadata
	(*GetUdfResponse)(nil),        // 7: titanium.GetUdfResponse
	(*Error)(nil),                 // 8: titanium.Error
}
var file_common_udf_proto_depIdxs = []int32{
	0,  // 0: titanium.UdfItem.type:type_name -> titanium.UdfType
	2,  // 1: titanium.UdfList.results:type_name -> titanium.UdfItem
	3,  // 2: titanium.ListUdfResponse.data:type_name -> titanium.UdfList
	8,  // 3: titanium.ListUdfResponse.error:type_name -> titanium.Error
	0,  // 4: titanium.UdfMetadata.type:type_name -> titanium.UdfType
	1,  // 5: titanium.UdfMetadata.args:type_name -> titanium.UdfMetadata.UdfFieldType
	1,  // 6: titanium.UdfMetadata.output:type_name -> titanium.UdfMetadata.UdfFieldType
	1,  // 7: titanium.UdfMetadata.column_types:type_name -> titanium.UdfMetadata.UdfFieldType
	6,  // 8: titanium.GetUdfResponse.data:type_name -> titanium.UdfMetadata
	8,  // 9: titanium.GetUdfResponse.error:type_name -> titanium.Error
	10, // [10:10] is the sub-list for method output_type
	10, // [10:10] is the sub-list for method input_type
	10, // [10:10] is the sub-list for extension type_name
	10, // [10:10] is the sub-list for extension extendee
	0,  // [0:10] is the sub-list for field type_name
}

func init() { file_common_udf_proto_init() }
func file_common_udf_proto_init() {
	if File_common_udf_proto != nil {
		return
	}
	file_common_gateway_base_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_udf_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UdfItem); i {
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
		file_common_udf_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UdfList); i {
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
		file_common_udf_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListUdfResponse); i {
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
		file_common_udf_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UdfNameRequest); i {
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
		file_common_udf_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UdfMetadata); i {
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
		file_common_udf_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUdfResponse); i {
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
	file_common_udf_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*ListUdfResponse_Data)(nil),
		(*ListUdfResponse_Error)(nil),
	}
	file_common_udf_proto_msgTypes[5].OneofWrappers = []interface{}{
		(*GetUdfResponse_Data)(nil),
		(*GetUdfResponse_Error)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_udf_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_udf_proto_goTypes,
		DependencyIndexes: file_common_udf_proto_depIdxs,
		EnumInfos:         file_common_udf_proto_enumTypes,
		MessageInfos:      file_common_udf_proto_msgTypes,
	}.Build()
	File_common_udf_proto = out.File
	file_common_udf_proto_rawDesc = nil
	file_common_udf_proto_goTypes = nil
	file_common_udf_proto_depIdxs = nil
}
