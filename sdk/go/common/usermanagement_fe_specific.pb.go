// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: common/usermanagement_fe_specific.proto

package common

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	anypb "google.golang.org/protobuf/types/known/anypb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ColumnDefinition struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ColumnDbType  string `protobuf:"bytes,1,opt,name=column_db_type,json=columnDbType,proto3" json:"column_db_type,omitempty"`
	ColumnName    string `protobuf:"bytes,2,opt,name=column_name,json=columnName,proto3" json:"column_name,omitempty"`
	ColumnType    string `protobuf:"bytes,3,opt,name=column_type,json=columnType,proto3" json:"column_type,omitempty"`
	RawColumnName string `protobuf:"bytes,4,opt,name=raw_column_name,json=rawColumnName,proto3" json:"raw_column_name,omitempty"`
}

func (x *ColumnDefinition) Reset() {
	*x = ColumnDefinition{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ColumnDefinition) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ColumnDefinition) ProtoMessage() {}

func (x *ColumnDefinition) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ColumnDefinition.ProtoReflect.Descriptor instead.
func (*ColumnDefinition) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{0}
}

func (x *ColumnDefinition) GetColumnDbType() string {
	if x != nil {
		return x.ColumnDbType
	}
	return ""
}

func (x *ColumnDefinition) GetColumnName() string {
	if x != nil {
		return x.ColumnName
	}
	return ""
}

func (x *ColumnDefinition) GetColumnType() string {
	if x != nil {
		return x.ColumnType
	}
	return ""
}

func (x *ColumnDefinition) GetRawColumnName() string {
	if x != nil {
		return x.RawColumnName
	}
	return ""
}

type Table struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TotalRows int32               `protobuf:"varint,1,opt,name=total_rows,json=totalRows,proto3" json:"total_rows,omitempty"`
	Columns   []*ColumnDefinition `protobuf:"bytes,2,rep,name=columns,proto3" json:"columns,omitempty"`
	Rows      []*Table_Row        `protobuf:"bytes,3,rep,name=rows,proto3" json:"rows,omitempty"`
}

func (x *Table) Reset() {
	*x = Table{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Table) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Table) ProtoMessage() {}

func (x *Table) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Table.ProtoReflect.Descriptor instead.
func (*Table) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{1}
}

func (x *Table) GetTotalRows() int32 {
	if x != nil {
		return x.TotalRows
	}
	return 0
}

func (x *Table) GetColumns() []*ColumnDefinition {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *Table) GetRows() []*Table_Row {
	if x != nil {
		return x.Rows
	}
	return nil
}

type TableResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*TableResponse_Data
	//	*TableResponse_Error
	Response isTableResponse_Response `protobuf_oneof:"response"`
}

func (x *TableResponse) Reset() {
	*x = TableResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TableResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TableResponse) ProtoMessage() {}

func (x *TableResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TableResponse.ProtoReflect.Descriptor instead.
func (*TableResponse) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{2}
}

func (m *TableResponse) GetResponse() isTableResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *TableResponse) GetData() *Table {
	if x, ok := x.GetResponse().(*TableResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *TableResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*TableResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isTableResponse_Response interface {
	isTableResponse_Response()
}

type TableResponse_Data struct {
	Data *Table `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type TableResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*TableResponse_Data) isTableResponse_Response() {}

func (*TableResponse_Error) isTableResponse_Response() {}

type SearchCriteria struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Limit   *SearchCriteria_Limit   `protobuf:"bytes,1,opt,name=limit,proto3" json:"limit,omitempty"`
	Offset  int32                   `protobuf:"varint,2,opt,name=offset,proto3" json:"offset,omitempty"`
	OrderBy *SearchCriteria_OrderBy `protobuf:"bytes,3,opt,name=orderBy,proto3" json:"orderBy,omitempty"`
	Filter  string                  `protobuf:"bytes,4,opt,name=filter,proto3" json:"filter,omitempty"`
}

func (x *SearchCriteria) Reset() {
	*x = SearchCriteria{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchCriteria) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchCriteria) ProtoMessage() {}

func (x *SearchCriteria) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchCriteria.ProtoReflect.Descriptor instead.
func (*SearchCriteria) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{3}
}

func (x *SearchCriteria) GetLimit() *SearchCriteria_Limit {
	if x != nil {
		return x.Limit
	}
	return nil
}

func (x *SearchCriteria) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

func (x *SearchCriteria) GetOrderBy() *SearchCriteria_OrderBy {
	if x != nil {
		return x.OrderBy
	}
	return nil
}

func (x *SearchCriteria) GetFilter() string {
	if x != nil {
		return x.Filter
	}
	return ""
}

type ServiceResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*ServiceResponse_Data
	//	*ServiceResponse_Error
	Response isServiceResponse_Response `protobuf_oneof:"response"`
}

func (x *ServiceResponse) Reset() {
	*x = ServiceResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ServiceResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ServiceResponse) ProtoMessage() {}

func (x *ServiceResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ServiceResponse.ProtoReflect.Descriptor instead.
func (*ServiceResponse) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{4}
}

func (m *ServiceResponse) GetResponse() isServiceResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *ServiceResponse) GetData() *anypb.Any {
	if x, ok := x.GetResponse().(*ServiceResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *ServiceResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*ServiceResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isServiceResponse_Response interface {
	isServiceResponse_Response()
}

type ServiceResponse_Data struct {
	Data *anypb.Any `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type ServiceResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*ServiceResponse_Data) isServiceResponse_Response() {}

func (*ServiceResponse_Error) isServiceResponse_Response() {}

type NoParameters struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *NoParameters) Reset() {
	*x = NoParameters{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NoParameters) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NoParameters) ProtoMessage() {}

func (x *NoParameters) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NoParameters.ProtoReflect.Descriptor instead.
func (*NoParameters) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{5}
}

type OperationSuccess struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*OperationSuccess_Success
	//	*OperationSuccess_Error
	Response isOperationSuccess_Response `protobuf_oneof:"response"`
}

func (x *OperationSuccess) Reset() {
	*x = OperationSuccess{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OperationSuccess) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OperationSuccess) ProtoMessage() {}

func (x *OperationSuccess) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OperationSuccess.ProtoReflect.Descriptor instead.
func (*OperationSuccess) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{6}
}

func (m *OperationSuccess) GetResponse() isOperationSuccess_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *OperationSuccess) GetSuccess() bool {
	if x, ok := x.GetResponse().(*OperationSuccess_Success); ok {
		return x.Success
	}
	return false
}

func (x *OperationSuccess) GetError() *Error {
	if x, ok := x.GetResponse().(*OperationSuccess_Error); ok {
		return x.Error
	}
	return nil
}

type isOperationSuccess_Response interface {
	isOperationSuccess_Response()
}

type OperationSuccess_Success struct {
	Success bool `protobuf:"varint,1,opt,name=success,proto3,oneof"`
}

type OperationSuccess_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*OperationSuccess_Success) isOperationSuccess_Response() {}

func (*OperationSuccess_Error) isOperationSuccess_Response() {}

type Table_Row struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Values []string `protobuf:"bytes,1,rep,name=values,proto3" json:"values,omitempty"`
}

func (x *Table_Row) Reset() {
	*x = Table_Row{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Table_Row) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Table_Row) ProtoMessage() {}

func (x *Table_Row) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Table_Row.ProtoReflect.Descriptor instead.
func (*Table_Row) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{1, 0}
}

func (x *Table_Row) GetValues() []string {
	if x != nil {
		return x.Values
	}
	return nil
}

type SearchCriteria_Limit struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Value int32 `protobuf:"varint,1,opt,name=value,proto3" json:"value,omitempty"`
}

func (x *SearchCriteria_Limit) Reset() {
	*x = SearchCriteria_Limit{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchCriteria_Limit) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchCriteria_Limit) ProtoMessage() {}

func (x *SearchCriteria_Limit) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchCriteria_Limit.ProtoReflect.Descriptor instead.
func (*SearchCriteria_Limit) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{3, 0}
}

func (x *SearchCriteria_Limit) GetValue() int32 {
	if x != nil {
		return x.Value
	}
	return 0
}

type SearchCriteria_OrderBy struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Column string `protobuf:"bytes,1,opt,name=column,proto3" json:"column,omitempty"`
	Order  string `protobuf:"bytes,2,opt,name=order,proto3" json:"order,omitempty"`
}

func (x *SearchCriteria_OrderBy) Reset() {
	*x = SearchCriteria_OrderBy{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_fe_specific_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchCriteria_OrderBy) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchCriteria_OrderBy) ProtoMessage() {}

func (x *SearchCriteria_OrderBy) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_fe_specific_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchCriteria_OrderBy.ProtoReflect.Descriptor instead.
func (*SearchCriteria_OrderBy) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_fe_specific_proto_rawDescGZIP(), []int{3, 1}
}

func (x *SearchCriteria_OrderBy) GetColumn() string {
	if x != nil {
		return x.Column
	}
	return ""
}

func (x *SearchCriteria_OrderBy) GetOrder() string {
	if x != nil {
		return x.Order
	}
	return ""
}

var File_common_usermanagement_fe_specific_proto protoreflect.FileDescriptor

var file_common_usermanagement_fe_specific_proto_rawDesc = []byte{
	0x0a, 0x27, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x66, 0x65, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x69,
	0x66, 0x69, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x32, 0x63, 0x6f, 0x6d, 0x2e, 0x70,
	0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d,
	0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65,
	0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x21, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65,
	0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2f, 0x61, 0x6e, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa2, 0x01, 0x0a, 0x10,
	0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x24, 0x0a, 0x0e, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x5f, 0x64, 0x62, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e,
	0x44, 0x62, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e,
	0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x63, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x63, 0x6f, 0x6c, 0x75, 0x6d,
	0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x63, 0x6f,
	0x6c, 0x75, 0x6d, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x26, 0x0a, 0x0f, 0x72, 0x61, 0x77, 0x5f,
	0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0d, 0x72, 0x61, 0x77, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x4e, 0x61, 0x6d, 0x65,
	0x22, 0xf8, 0x01, 0x0a, 0x05, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x6f,
	0x74, 0x61, 0x6c, 0x5f, 0x72, 0x6f, 0x77, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x52, 0x6f, 0x77, 0x73, 0x12, 0x5e, 0x0a, 0x07, 0x63, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x44, 0x2e, 0x63, 0x6f, 0x6d,
	0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69,
	0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65,
	0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x12, 0x51, 0x0a, 0x04, 0x72, 0x6f, 0x77,
	0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65,
	0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e,
	0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e,
	0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x54, 0x61, 0x62,
	0x6c, 0x65, 0x2e, 0x52, 0x6f, 0x77, 0x52, 0x04, 0x72, 0x6f, 0x77, 0x73, 0x1a, 0x1d, 0x0a, 0x03,
	0x52, 0x6f, 0x77, 0x12, 0x16, 0x0a, 0x06, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x09, 0x52, 0x06, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x22, 0xbf, 0x01, 0x0a, 0x0d,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4f, 0x0a,
	0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x39, 0x2e, 0x63, 0x6f,
	0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e,
	0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x48, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x12, 0x51,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x39, 0x2e,
	0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0xde, 0x02,
	0x0a, 0x0e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x61,
	0x12, 0x5e, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x48, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x43, 0x72, 0x69, 0x74, 0x65,
	0x72, 0x69, 0x61, 0x2e, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74,
	0x12, 0x16, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x12, 0x64, 0x0a, 0x07, 0x6f, 0x72, 0x64, 0x65,
	0x72, 0x42, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x4a, 0x2e, 0x63, 0x6f, 0x6d, 0x2e,
	0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d,
	0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x53,
	0x65, 0x61, 0x72, 0x63, 0x68, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x61, 0x2e, 0x4f, 0x72,
	0x64, 0x65, 0x72, 0x42, 0x79, 0x52, 0x07, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79, 0x12, 0x16,
	0x0a, 0x06, 0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x1a, 0x1d, 0x0a, 0x05, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x12,
	0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x05,
	0x76, 0x61, 0x6c, 0x75, 0x65, 0x1a, 0x37, 0x0a, 0x07, 0x4f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79,
	0x12, 0x16, 0x0a, 0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x12, 0x14, 0x0a, 0x05, 0x6f, 0x72, 0x64, 0x65,
	0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x22, 0x9c,
	0x01, 0x0a, 0x0f, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x2a, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x14, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x41, 0x6e, 0x79, 0x48, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x12, 0x51,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x39, 0x2e,
	0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x0e, 0x0a,
	0x0c, 0x4e, 0x6f, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73, 0x22, 0x8d, 0x01,
	0x0a, 0x10, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x75, 0x63, 0x63, 0x65,
	0x73, 0x73, 0x12, 0x1a, 0x0a, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x08, 0x48, 0x00, 0x52, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x12, 0x51,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x39, 0x2e,
	0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x6c, 0x0a,
	0x32, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61,
	0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61, 0x72,
	0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73, 0x64,
	0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_common_usermanagement_fe_specific_proto_rawDescOnce sync.Once
	file_common_usermanagement_fe_specific_proto_rawDescData = file_common_usermanagement_fe_specific_proto_rawDesc
)

func file_common_usermanagement_fe_specific_proto_rawDescGZIP() []byte {
	file_common_usermanagement_fe_specific_proto_rawDescOnce.Do(func() {
		file_common_usermanagement_fe_specific_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_usermanagement_fe_specific_proto_rawDescData)
	})
	return file_common_usermanagement_fe_specific_proto_rawDescData
}

var file_common_usermanagement_fe_specific_proto_msgTypes = make([]protoimpl.MessageInfo, 10)
var file_common_usermanagement_fe_specific_proto_goTypes = []interface{}{
	(*ColumnDefinition)(nil),       // 0: com.peernova.titanium.casbin.management.grpc.proto.ColumnDefinition
	(*Table)(nil),                  // 1: com.peernova.titanium.casbin.management.grpc.proto.Table
	(*TableResponse)(nil),          // 2: com.peernova.titanium.casbin.management.grpc.proto.TableResponse
	(*SearchCriteria)(nil),         // 3: com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria
	(*ServiceResponse)(nil),        // 4: com.peernova.titanium.casbin.management.grpc.proto.ServiceResponse
	(*NoParameters)(nil),           // 5: com.peernova.titanium.casbin.management.grpc.proto.NoParameters
	(*OperationSuccess)(nil),       // 6: com.peernova.titanium.casbin.management.grpc.proto.OperationSuccess
	(*Table_Row)(nil),              // 7: com.peernova.titanium.casbin.management.grpc.proto.Table.Row
	(*SearchCriteria_Limit)(nil),   // 8: com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.Limit
	(*SearchCriteria_OrderBy)(nil), // 9: com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.OrderBy
	(*Error)(nil),                  // 10: com.peernova.titanium.casbin.management.grpc.proto.Error
	(*anypb.Any)(nil),              // 11: google.protobuf.Any
}
var file_common_usermanagement_fe_specific_proto_depIdxs = []int32{
	0,  // 0: com.peernova.titanium.casbin.management.grpc.proto.Table.columns:type_name -> com.peernova.titanium.casbin.management.grpc.proto.ColumnDefinition
	7,  // 1: com.peernova.titanium.casbin.management.grpc.proto.Table.rows:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Table.Row
	1,  // 2: com.peernova.titanium.casbin.management.grpc.proto.TableResponse.data:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Table
	10, // 3: com.peernova.titanium.casbin.management.grpc.proto.TableResponse.error:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Error
	8,  // 4: com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.limit:type_name -> com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.Limit
	9,  // 5: com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.orderBy:type_name -> com.peernova.titanium.casbin.management.grpc.proto.SearchCriteria.OrderBy
	11, // 6: com.peernova.titanium.casbin.management.grpc.proto.ServiceResponse.data:type_name -> google.protobuf.Any
	10, // 7: com.peernova.titanium.casbin.management.grpc.proto.ServiceResponse.error:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Error
	10, // 8: com.peernova.titanium.casbin.management.grpc.proto.OperationSuccess.error:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Error
	9,  // [9:9] is the sub-list for method output_type
	9,  // [9:9] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_common_usermanagement_fe_specific_proto_init() }
func file_common_usermanagement_fe_specific_proto_init() {
	if File_common_usermanagement_fe_specific_proto != nil {
		return
	}
	file_common_usermanagement_error_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_usermanagement_fe_specific_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ColumnDefinition); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Table); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TableResponse); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchCriteria); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ServiceResponse); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NoParameters); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OperationSuccess); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Table_Row); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchCriteria_Limit); i {
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
		file_common_usermanagement_fe_specific_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchCriteria_OrderBy); i {
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
	file_common_usermanagement_fe_specific_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*TableResponse_Data)(nil),
		(*TableResponse_Error)(nil),
	}
	file_common_usermanagement_fe_specific_proto_msgTypes[4].OneofWrappers = []interface{}{
		(*ServiceResponse_Data)(nil),
		(*ServiceResponse_Error)(nil),
	}
	file_common_usermanagement_fe_specific_proto_msgTypes[6].OneofWrappers = []interface{}{
		(*OperationSuccess_Success)(nil),
		(*OperationSuccess_Error)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_usermanagement_fe_specific_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   10,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_usermanagement_fe_specific_proto_goTypes,
		DependencyIndexes: file_common_usermanagement_fe_specific_proto_depIdxs,
		MessageInfos:      file_common_usermanagement_fe_specific_proto_msgTypes,
	}.Build()
	File_common_usermanagement_fe_specific_proto = out.File
	file_common_usermanagement_fe_specific_proto_rawDesc = nil
	file_common_usermanagement_fe_specific_proto_goTypes = nil
	file_common_usermanagement_fe_specific_proto_depIdxs = nil
}
