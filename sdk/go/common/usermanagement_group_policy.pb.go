// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: common/usermanagement_group_policy.proto

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

type GroupPolicyDto struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type     string `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	Username string `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
	Group    string `protobuf:"bytes,3,opt,name=group,proto3" json:"group,omitempty"`
}

func (x *GroupPolicyDto) Reset() {
	*x = GroupPolicyDto{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_group_policy_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GroupPolicyDto) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GroupPolicyDto) ProtoMessage() {}

func (x *GroupPolicyDto) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_group_policy_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GroupPolicyDto.ProtoReflect.Descriptor instead.
func (*GroupPolicyDto) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_group_policy_proto_rawDescGZIP(), []int{0}
}

func (x *GroupPolicyDto) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *GroupPolicyDto) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *GroupPolicyDto) GetGroup() string {
	if x != nil {
		return x.Group
	}
	return ""
}

type GroupPolicies struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	GroupPolicy []*GroupPolicyDto `protobuf:"bytes,1,rep,name=groupPolicy,proto3" json:"groupPolicy,omitempty"`
}

func (x *GroupPolicies) Reset() {
	*x = GroupPolicies{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_group_policy_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GroupPolicies) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GroupPolicies) ProtoMessage() {}

func (x *GroupPolicies) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_group_policy_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GroupPolicies.ProtoReflect.Descriptor instead.
func (*GroupPolicies) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_group_policy_proto_rawDescGZIP(), []int{1}
}

func (x *GroupPolicies) GetGroupPolicy() []*GroupPolicyDto {
	if x != nil {
		return x.GroupPolicy
	}
	return nil
}

type GroupPoliciesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Response:
	//
	//	*GroupPoliciesResponse_Data
	//	*GroupPoliciesResponse_Error
	Response isGroupPoliciesResponse_Response `protobuf_oneof:"response"`
}

func (x *GroupPoliciesResponse) Reset() {
	*x = GroupPoliciesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_usermanagement_group_policy_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GroupPoliciesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GroupPoliciesResponse) ProtoMessage() {}

func (x *GroupPoliciesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_common_usermanagement_group_policy_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GroupPoliciesResponse.ProtoReflect.Descriptor instead.
func (*GroupPoliciesResponse) Descriptor() ([]byte, []int) {
	return file_common_usermanagement_group_policy_proto_rawDescGZIP(), []int{2}
}

func (m *GroupPoliciesResponse) GetResponse() isGroupPoliciesResponse_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (x *GroupPoliciesResponse) GetData() *GroupPolicies {
	if x, ok := x.GetResponse().(*GroupPoliciesResponse_Data); ok {
		return x.Data
	}
	return nil
}

func (x *GroupPoliciesResponse) GetError() *Error {
	if x, ok := x.GetResponse().(*GroupPoliciesResponse_Error); ok {
		return x.Error
	}
	return nil
}

type isGroupPoliciesResponse_Response interface {
	isGroupPoliciesResponse_Response()
}

type GroupPoliciesResponse_Data struct {
	Data *GroupPolicies `protobuf:"bytes,1,opt,name=data,proto3,oneof"`
}

type GroupPoliciesResponse_Error struct {
	Error *Error `protobuf:"bytes,2,opt,name=error,proto3,oneof"`
}

func (*GroupPoliciesResponse_Data) isGroupPoliciesResponse_Response() {}

func (*GroupPoliciesResponse_Error) isGroupPoliciesResponse_Response() {}

var File_common_usermanagement_group_policy_proto protoreflect.FileDescriptor

var file_common_usermanagement_group_policy_proto_rawDesc = []byte{
	0x0a, 0x28, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x70, 0x6f,
	0x6c, 0x69, 0x63, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x32, 0x63, 0x6f, 0x6d, 0x2e,
	0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d,
	0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x21,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x56, 0x0a, 0x0e, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x44, 0x74, 0x6f, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x22, 0x75, 0x0a, 0x0d, 0x47, 0x72, 0x6f,
	0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x12, 0x64, 0x0a, 0x0b, 0x67, 0x72,
	0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x42, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x44, 0x74, 0x6f, 0x52, 0x0b, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x22, 0xcf, 0x01, 0x0a, 0x15, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69,
	0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x57, 0x0a, 0x04, 0x64, 0x61,
	0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x41, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70,
	0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d,
	0x2e, 0x63, 0x61, 0x73, 0x62, 0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65,
	0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x47, 0x72,
	0x6f, 0x75, 0x70, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x48, 0x00, 0x52, 0x04, 0x64,
	0x61, 0x74, 0x61, 0x12, 0x51, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x39, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76,
	0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62, 0x69,
	0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70,
	0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x48, 0x00, 0x52,
	0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x42, 0x0a, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x42, 0x6c, 0x0a, 0x32, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f,
	0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x63, 0x61, 0x73, 0x62,
	0x69, 0x6e, 0x2e, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72,
	0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f,
	0x63, 0x6c, 0x65, 0x61, 0x72, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73,
	0x64, 0x6b, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_common_usermanagement_group_policy_proto_rawDescOnce sync.Once
	file_common_usermanagement_group_policy_proto_rawDescData = file_common_usermanagement_group_policy_proto_rawDesc
)

func file_common_usermanagement_group_policy_proto_rawDescGZIP() []byte {
	file_common_usermanagement_group_policy_proto_rawDescOnce.Do(func() {
		file_common_usermanagement_group_policy_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_usermanagement_group_policy_proto_rawDescData)
	})
	return file_common_usermanagement_group_policy_proto_rawDescData
}

var file_common_usermanagement_group_policy_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_common_usermanagement_group_policy_proto_goTypes = []interface{}{
	(*GroupPolicyDto)(nil),        // 0: com.peernova.titanium.casbin.management.grpc.proto.GroupPolicyDto
	(*GroupPolicies)(nil),         // 1: com.peernova.titanium.casbin.management.grpc.proto.GroupPolicies
	(*GroupPoliciesResponse)(nil), // 2: com.peernova.titanium.casbin.management.grpc.proto.GroupPoliciesResponse
	(*Error)(nil),                 // 3: com.peernova.titanium.casbin.management.grpc.proto.Error
}
var file_common_usermanagement_group_policy_proto_depIdxs = []int32{
	0, // 0: com.peernova.titanium.casbin.management.grpc.proto.GroupPolicies.groupPolicy:type_name -> com.peernova.titanium.casbin.management.grpc.proto.GroupPolicyDto
	1, // 1: com.peernova.titanium.casbin.management.grpc.proto.GroupPoliciesResponse.data:type_name -> com.peernova.titanium.casbin.management.grpc.proto.GroupPolicies
	3, // 2: com.peernova.titanium.casbin.management.grpc.proto.GroupPoliciesResponse.error:type_name -> com.peernova.titanium.casbin.management.grpc.proto.Error
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_common_usermanagement_group_policy_proto_init() }
func file_common_usermanagement_group_policy_proto_init() {
	if File_common_usermanagement_group_policy_proto != nil {
		return
	}
	file_common_usermanagement_error_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_usermanagement_group_policy_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GroupPolicyDto); i {
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
		file_common_usermanagement_group_policy_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GroupPolicies); i {
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
		file_common_usermanagement_group_policy_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GroupPoliciesResponse); i {
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
	file_common_usermanagement_group_policy_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*GroupPoliciesResponse_Data)(nil),
		(*GroupPoliciesResponse_Error)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_usermanagement_group_policy_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_usermanagement_group_policy_proto_goTypes,
		DependencyIndexes: file_common_usermanagement_group_policy_proto_depIdxs,
		MessageInfos:      file_common_usermanagement_group_policy_proto_msgTypes,
	}.Build()
	File_common_usermanagement_group_policy_proto = out.File
	file_common_usermanagement_group_policy_proto_rawDesc = nil
	file_common_usermanagement_group_policy_proto_goTypes = nil
	file_common_usermanagement_group_policy_proto_depIdxs = nil
}
