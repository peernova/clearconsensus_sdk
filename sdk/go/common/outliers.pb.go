// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: common/outliers.proto

package common

import (
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

// request for the outliers
type OutliersRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Limit   *Limit   `protobuf:"bytes,1,opt,name=limit,proto3" json:"limit,omitempty"`
	Offset  int32    `protobuf:"varint,2,opt,name=offset,proto3" json:"offset,omitempty"`
	OrderBy *OrderBy `protobuf:"bytes,3,opt,name=orderBy,proto3" json:"orderBy,omitempty"`
	Filter  string   `protobuf:"bytes,4,opt,name=filter,proto3" json:"filter,omitempty"`
}

func (x *OutliersRequest) Reset() {
	*x = OutliersRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_outliers_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OutliersRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OutliersRequest) ProtoMessage() {}

func (x *OutliersRequest) ProtoReflect() protoreflect.Message {
	mi := &file_common_outliers_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OutliersRequest.ProtoReflect.Descriptor instead.
func (*OutliersRequest) Descriptor() ([]byte, []int) {
	return file_common_outliers_proto_rawDescGZIP(), []int{0}
}

func (x *OutliersRequest) GetLimit() *Limit {
	if x != nil {
		return x.Limit
	}
	return nil
}

func (x *OutliersRequest) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

func (x *OutliersRequest) GetOrderBy() *OrderBy {
	if x != nil {
		return x.OrderBy
	}
	return nil
}

func (x *OutliersRequest) GetFilter() string {
	if x != nil {
		return x.Filter
	}
	return ""
}

// response contains rows(and information about it) that considered outlier by the system
type OutliersResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*OutliersResponse_Data
	//	*OutliersResponse_Error
	Response isOutliersResponse_Response `protobuf_oneof:"response"`
}

func (x *OutliersResponse) Reset() {
	*x = OutliersResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_outliers_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OutliersResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OutliersResponse) ProtoMessage() {}

func (x *OutliersResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_outliers_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OutliersResponse.ProtoReflect.Descriptor instead.
func (*OutliersResponse) Descriptor() ([]byte, []int) {
	return file_common_outliers_proto_rawDescGZIP(), []int{1}
}

func (m *OutliersResponse) GetResponse() isOutliersResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *OutliersResponse) GetData() *OutliersResponseData {
	if x, ok := x.GetResponse().(*OutliersResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *OutliersResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*OutliersResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isOutliersResponse_Response interface {
	isOutliersResponse_Response()
}

type OutliersResponse_Data struct {
	Data *OutliersResponseData `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type OutliersResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*OutliersResponse_Data) isOutliersResponse_Response() {}

func (*OutliersResponse_Error) isOutliersResponse_Response() {}

type OutliersResponseData struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Columns   []*ColumnInfo  `protobuf:"bytes,1,rep,name=columns,proto3" json:"columns,omitempty"`
	Rows      []*OutliersRow `protobuf:"bytes,2,rep,name=rows,proto3" json:"rows,omitempty"`
	TotalRows int32          `protobuf:"varint,3,opt,name=total_rows,json=totalRows,proto3" json:"total_rows,omitempty"`
}

func (x *OutliersResponseData) Reset() {
	*x = OutliersResponseData{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_outliers_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OutliersResponseData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OutliersResponseData) ProtoMessage() {}

func (x *OutliersResponseData) ProtoReflect() protoreflect.Message {
	mi := &file_common_outliers_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OutliersResponseData.ProtoReflect.Descriptor instead.
func (*OutliersResponseData) Descriptor() ([]byte, []int) {
	return file_common_outliers_proto_rawDescGZIP(), []int{2}
}

func (x *OutliersResponseData) GetColumns() []*ColumnInfo {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *OutliersResponseData) GetRows() []*OutliersRow {
	if x != nil {
		return x.Rows
	}
	return nil
}

func (x *OutliersResponseData) GetTotalRows() int32 {
	if x != nil {
		return x.TotalRows
	}
	return 0
}

type OutliersRow struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Values []string `protobuf:"bytes,1,rep,name=values,proto3" json:"values,omitempty"`
}

func (x *OutliersRow) Reset() {
	*x = OutliersRow{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_outliers_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OutliersRow) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OutliersRow) ProtoMessage() {}

func (x *OutliersRow) ProtoReflect() protoreflect.Message {
	mi := &file_common_outliers_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OutliersRow.ProtoReflect.Descriptor instead.
func (*OutliersRow) Descriptor() ([]byte, []int) {
	return file_common_outliers_proto_rawDescGZIP(), []int{3}
}

func (x *OutliersRow) GetValues() []string {
	if x != nil {
		return x.Values
	}
	return nil
}

var File_common_outliers_proto protoreflect.FileDescriptor

var file_common_outliers_proto_rawDesc = []byte{
	0x0a, 0x15, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x6f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x1a, 0x19, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61,
	0x79, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x95, 0x01, 0x0a,
	0x0f, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x25, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x0f, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4c, 0x69, 0x6d, 0x69, 0x74,
	0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65,
	0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x12,
	0x2b, 0x0a, 0x07, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x11, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4f, 0x72, 0x64, 0x65,
	0x72, 0x42, 0x79, 0x52, 0x07, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x42, 0x79, 0x12, 0x16, 0x0a, 0x06,
	0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x66, 0x69,
	0x6c, 0x74, 0x65, 0x72, 0x22, 0x7d, 0x0a, 0x10, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x34, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1e, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x44, 0x61, 0x74, 0x61, 0x48, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x12, 0x27,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0f, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00,
	0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x90, 0x01, 0x0a, 0x14, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61, 0x12, 0x2e, 0x0a, 0x07,
	0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x14, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x49,
	0x6e, 0x66, 0x6f, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x12, 0x29, 0x0a, 0x04,
	0x72, 0x6f, 0x77, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73, 0x52, 0x6f,
	0x77, 0x52, 0x04, 0x72, 0x6f, 0x77, 0x73, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x6f, 0x74, 0x61, 0x6c,
	0x5f, 0x72, 0x6f, 0x77, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x52, 0x6f, 0x77, 0x73, 0x22, 0x25, 0x0a, 0x0b, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65,
	0x72, 0x73, 0x52, 0x6f, 0x77, 0x12, 0x16, 0x0a, 0x06, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x18,
	0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x06, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x42, 0x76, 0x0a,
	0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61, 0x63, 0x65,
	0x73, 0x42, 0x1a, 0x4f, 0x75, 0x74, 0x6c, 0x69, 0x65, 0x72, 0x73, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x50, 0x01, 0x5a,
	0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72,
	0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61, 0x72, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e,
	0x73, 0x75, 0x73, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_common_outliers_proto_rawDescOnce sync.Once
	file_common_outliers_proto_rawDescData = file_common_outliers_proto_rawDesc
)

func file_common_outliers_proto_rawDescGZIP() []byte {
	file_common_outliers_proto_rawDescOnce.Do(func() {
		file_common_outliers_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_outliers_proto_rawDescData)
	})
	return file_common_outliers_proto_rawDescData
}

var file_common_outliers_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_common_outliers_proto_goTypes = []interface{}{
	(*OutliersRequest)(nil),      // 0: titanium.OutliersRequest
	(*OutliersResponse)(nil),     // 1: titanium.OutliersResponse
	(*OutliersResponseData)(nil), // 2: titanium.OutliersResponseData
	(*OutliersRow)(nil),          // 3: titanium.OutliersRow
	(*Limit)(nil),                // 4: titanium.Limit
	(*OrderBy)(nil),              // 5: titanium.OrderBy
	(*Error)(nil),                // 6: titanium.Error
	(*ColumnInfo)(nil),           // 7: titanium.ColumnInfo
}
var file_common_outliers_proto_depIdxs = []int32{
	4, // 0: titanium.OutliersRequest.limit:type_name -> titanium.Limit
	5, // 1: titanium.OutliersRequest.orderBy:type_name -> titanium.OrderBy
	2, // 2: titanium.OutliersResponse.data:type_name -> titanium.OutliersResponseData
	6, // 3: titanium.OutliersResponse.error:type_name -> titanium.Error
	7, // 4: titanium.OutliersResponseData.columns:type_name -> titanium.ColumnInfo
	3, // 5: titanium.OutliersResponseData.rows:type_name -> titanium.OutliersRow
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_common_outliers_proto_init() }
func file_common_outliers_proto_init() {
	if File_common_outliers_proto != nil {
		return
	}
	file_common_gateway_base_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_outliers_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OutliersRequest); i {
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
		file_common_outliers_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OutliersResponse); i {
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
		file_common_outliers_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OutliersResponseData); i {
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
		file_common_outliers_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OutliersRow); i {
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
	file_common_outliers_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*OutliersResponse_Data)(nil),
		(*OutliersResponse_Error)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_outliers_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_outliers_proto_goTypes,
		DependencyIndexes: file_common_outliers_proto_depIdxs,
		MessageInfos:      file_common_outliers_proto_msgTypes,
	}.Build()
	File_common_outliers_proto = out.File
	file_common_outliers_proto_rawDesc = nil
	file_common_outliers_proto_goTypes = nil
	file_common_outliers_proto_depIdxs = nil
}
