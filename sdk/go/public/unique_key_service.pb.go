// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: public/unique_key_service.proto

package public

import (
	common "github.com/peernova/clearconsensus-sdk/sdk/go/common"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

var File_public_unique_key_service_proto protoreflect.FileDescriptor

var file_public_unique_key_service_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x5f,
	0x6b, 0x65, 0x79, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x1a, 0x1c, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x6e, 0x69,
	0x71, 0x75, 0x65, 0x5f, 0x6b, 0x65, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xe2, 0x06,
	0x0a, 0x10, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65, 0x79, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x12, 0x6e, 0x0a, 0x0c, 0x41, 0x64, 0x64, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b,
	0x65, 0x79, 0x12, 0x1d, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x6e,
	0x69, 0x71, 0x75, 0x65, 0x4b, 0x65, 0x79, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x1a, 0x1d, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x41, 0x63, 0x6b,
	0x6e, 0x6f, 0x77, 0x6c, 0x65, 0x64, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x22, 0x20, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1a, 0x22, 0x15, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76,
	0x31, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x61, 0x64, 0x64, 0x3a,
	0x01, 0x2a, 0x12, 0x70, 0x0a, 0x0c, 0x47, 0x65, 0x74, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b,
	0x65, 0x79, 0x12, 0x17, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x47, 0x65,
	0x74, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x1a, 0x25, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65, 0x79,
	0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x22, 0x20, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1a, 0x22, 0x15, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x76, 0x31, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x67, 0x65,
	0x74, 0x3a, 0x01, 0x2a, 0x12, 0x6c, 0x0a, 0x0e, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x6e, 0x69, 0x71,
	0x75, 0x65, 0x4b, 0x65, 0x79, 0x73, 0x12, 0x15, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x6e, 0x69,
	0x71, 0x75, 0x65, 0x4b, 0x65, 0x79, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x21, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1b, 0x22, 0x16, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31,
	0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x6c, 0x69, 0x73, 0x74, 0x3a,
	0x01, 0x2a, 0x12, 0x76, 0x0a, 0x15, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65,
	0x4b, 0x65, 0x79, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x17, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x47, 0x65, 0x74, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69,
	0x74, 0x69, 0x6f, 0x6e, 0x1a, 0x1d, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x25, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1f, 0x22, 0x1a, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x76, 0x31, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x3a, 0x01, 0x2a, 0x12, 0x95, 0x01, 0x0a, 0x13, 0x47,
	0x65, 0x74, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65, 0x79, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x12, 0x18, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x25, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65,
	0x79, 0x44, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x3d, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x37, 0x12, 0x35, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x76, 0x31, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x2f, 0x7b, 0x73, 0x63, 0x6f, 0x70, 0x65, 0x7d, 0x2f, 0x7b,
	0x6e, 0x61, 0x6d, 0x65, 0x7d, 0x2f, 0x7b, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x69,
	0x64, 0x7d, 0x12, 0x75, 0x0a, 0x0f, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x55, 0x6e, 0x69, 0x71,
	0x75, 0x65, 0x4b, 0x65, 0x79, 0x12, 0x1e, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d,
	0x2e, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x44, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d,
	0x2e, 0x41, 0x63, 0x6b, 0x6e, 0x6f, 0x77, 0x6c, 0x65, 0x64, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x23, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1d, 0x22, 0x18, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f,
	0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x3a, 0x01, 0x2a, 0x12, 0x77, 0x0a, 0x10, 0x44, 0x69, 0x73,
	0x61, 0x62, 0x6c, 0x65, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65, 0x79, 0x12, 0x1e, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x44,
	0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x41, 0x63, 0x6b, 0x6e, 0x6f, 0x77, 0x6c,
	0x65, 0x64, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x24, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x1e, 0x22, 0x19, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x75, 0x6e,
	0x69, 0x71, 0x75, 0x65, 0x6b, 0x65, 0x79, 0x2f, 0x64, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x3a,
	0x01, 0x2a, 0x42, 0x77, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f,
	0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74, 0x65,
	0x72, 0x66, 0x61, 0x63, 0x65, 0x73, 0x42, 0x1b, 0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x4b, 0x65,
	0x79, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x75, 0x62,
	0x6c, 0x69, 0x63, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61, 0x72,
	0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73, 0x64,
	0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var file_public_unique_key_service_proto_goTypes = []interface{}{
	(*common.UniqueKeyDefinition)(nil),         // 0: titanium.UniqueKeyDefinition
	(*common.GetDefinition)(nil),               // 1: titanium.GetDefinition
	(*common.ListRequest)(nil),                 // 2: titanium.ListRequest
	(*common.VersionRequest)(nil),              // 3: titanium.VersionRequest
	(*common.EnableDisableRequest)(nil),        // 4: titanium.EnableDisableRequest
	(*common.AcknowledgeResponse)(nil),         // 5: titanium.AcknowledgeResponse
	(*common.UniqueKeyDefinitionResponse)(nil), // 6: titanium.UniqueKeyDefinitionResponse
	(*common.ListUniqueKeysResponse)(nil),      // 7: titanium.ListUniqueKeysResponse
	(*common.ListVersionResponse)(nil),         // 8: titanium.ListVersionResponse
}
var file_public_unique_key_service_proto_depIdxs = []int32{
	0, // 0: titanium.UniqueKeyService.AddUniqueKey:input_type -> titanium.UniqueKeyDefinition
	1, // 1: titanium.UniqueKeyService.GetUniqueKey:input_type -> titanium.GetDefinition
	2, // 2: titanium.UniqueKeyService.ListUniqueKeys:input_type -> titanium.ListRequest
	1, // 3: titanium.UniqueKeyService.ListUniqueKeyVersions:input_type -> titanium.GetDefinition
	3, // 4: titanium.UniqueKeyService.GetUniqueKeyVersion:input_type -> titanium.VersionRequest
	4, // 5: titanium.UniqueKeyService.EnableUniqueKey:input_type -> titanium.EnableDisableRequest
	4, // 6: titanium.UniqueKeyService.DisableUniqueKey:input_type -> titanium.EnableDisableRequest
	5, // 7: titanium.UniqueKeyService.AddUniqueKey:output_type -> titanium.AcknowledgeResponse
	6, // 8: titanium.UniqueKeyService.GetUniqueKey:output_type -> titanium.UniqueKeyDefinitionResponse
	7, // 9: titanium.UniqueKeyService.ListUniqueKeys:output_type -> titanium.ListUniqueKeysResponse
	8, // 10: titanium.UniqueKeyService.ListUniqueKeyVersions:output_type -> titanium.ListVersionResponse
	6, // 11: titanium.UniqueKeyService.GetUniqueKeyVersion:output_type -> titanium.UniqueKeyDefinitionResponse
	5, // 12: titanium.UniqueKeyService.EnableUniqueKey:output_type -> titanium.AcknowledgeResponse
	5, // 13: titanium.UniqueKeyService.DisableUniqueKey:output_type -> titanium.AcknowledgeResponse
	7, // [7:14] is the sub-list for method output_type
	0, // [0:7] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_public_unique_key_service_proto_init() }
func file_public_unique_key_service_proto_init() {
	if File_public_unique_key_service_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_public_unique_key_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_public_unique_key_service_proto_goTypes,
		DependencyIndexes: file_public_unique_key_service_proto_depIdxs,
	}.Build()
	File_public_unique_key_service_proto = out.File
	file_public_unique_key_service_proto_rawDesc = nil
	file_public_unique_key_service_proto_goTypes = nil
	file_public_unique_key_service_proto_depIdxs = nil
}
