// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.18.1
// source: public/challenge_service.proto

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

var File_public_challenge_service_proto protoreflect.FileDescriptor

var file_public_challenge_service_proto_rawDesc = []byte{
	0x0a, 0x1e, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e,
	0x67, 0x65, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x08, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x16, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x68, 0x61, 0x6c,
	0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xf5, 0x0a, 0x0a, 0x10,
	0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x12, 0x84, 0x01, 0x0a, 0x11, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x46, 0x6f,
	0x72, 0x6d, 0x4d, 0x65, 0x74, 0x61, 0x12, 0x22, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x46, 0x6f, 0x72, 0x6d, 0x4d,
	0x65, 0x74, 0x61, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x46,
	0x6f, 0x72, 0x6d, 0x4d, 0x65, 0x74, 0x61, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x26, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x20, 0x22, 0x1b, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31,
	0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x66, 0x6f, 0x72, 0x6d, 0x2d,
	0x6d, 0x65, 0x74, 0x61, 0x3a, 0x01, 0x2a, 0x12, 0x7b, 0x0a, 0x0f, 0x43, 0x68, 0x61, 0x6c, 0x6c,
	0x65, 0x6e, 0x67, 0x65, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x12, 0x20, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x74,
	0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67,
	0x65, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x23, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1d, 0x22, 0x18, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31,
	0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x3a, 0x01, 0x2a, 0x12, 0x85, 0x01, 0x0a, 0x15, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e,
	0x67, 0x65, 0x46, 0x72, 0x65, 0x65, 0x7a, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x26,
	0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65,
	0x6e, 0x67, 0x65, 0x46, 0x72, 0x65, 0x65, 0x7a, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75,
	0x6d, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x22, 0x2a, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x24, 0x22, 0x1f, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76,
	0x31, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x66, 0x72, 0x65, 0x65,
	0x7a, 0x65, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x3a, 0x01, 0x2a, 0x12, 0x88, 0x01, 0x0a,
	0x13, 0x47, 0x65, 0x74, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x44, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x73, 0x12, 0x24, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e,
	0x47, 0x65, 0x74, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x44, 0x65, 0x74, 0x61,
	0x69, 0x6c, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x25, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x47, 0x65, 0x74, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e,
	0x67, 0x65, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x24, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1e, 0x22, 0x19, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x76, 0x31, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2d, 0x64, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x73, 0x3a, 0x01, 0x2a, 0x12, 0xa9, 0x01, 0x0a, 0x1f, 0x47, 0x65, 0x74, 0x43,
	0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x41, 0x74, 0x74, 0x61, 0x63, 0x68, 0x6d, 0x65,
	0x6e, 0x74, 0x55, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x55, 0x72, 0x6c, 0x12, 0x27, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x47, 0x65, 0x74, 0x41, 0x74, 0x74, 0x61, 0x63, 0x68,
	0x6d, 0x65, 0x6e, 0x74, 0x55, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x55, 0x72, 0x6c, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x28, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e,
	0x47, 0x65, 0x74, 0x41, 0x74, 0x74, 0x61, 0x63, 0x68, 0x6d, 0x65, 0x6e, 0x74, 0x55, 0x70, 0x6c,
	0x6f, 0x61, 0x64, 0x55, 0x72, 0x6c, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x33,
	0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2d, 0x22, 0x28, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f,
	0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x61, 0x74, 0x74, 0x61, 0x63, 0x68,
	0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x75, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x5f, 0x75, 0x72, 0x6c, 0x73,
	0x3a, 0x01, 0x2a, 0x12, 0x84, 0x01, 0x0a, 0x0f, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67,
	0x65, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x12, 0x20, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69,
	0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x41, 0x63, 0x74, 0x69,
	0x76, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x74, 0x69, 0x74, 0x61,
	0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x41, 0x63,
	0x74, 0x69, 0x76, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2c, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x26, 0x22, 0x21, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65,
	0x2f, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x3a, 0x01, 0x2a, 0x12, 0x7c, 0x0a, 0x0d, 0x43, 0x68,
	0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x1e, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65,
	0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x74, 0x69,
	0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65,
	0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2a, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x24, 0x22, 0x1f, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65,
	0x2f, 0x6c, 0x69, 0x73, 0x74, 0x3a, 0x01, 0x2a, 0x12, 0x88, 0x01, 0x0a, 0x10, 0x43, 0x68, 0x61,
	0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x48, 0x69, 0x73, 0x74, 0x6f, 0x72, 0x79, 0x12, 0x21, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e,
	0x67, 0x65, 0x48, 0x69, 0x73, 0x74, 0x6f, 0x72, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x22, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c,
	0x6c, 0x65, 0x6e, 0x67, 0x65, 0x48, 0x69, 0x73, 0x74, 0x6f, 0x72, 0x79, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2d, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x27, 0x22, 0x22, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x2f, 0x63,
	0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x68, 0x69, 0x73, 0x74, 0x6f, 0x72, 0x79,
	0x3a, 0x01, 0x2a, 0x12, 0x82, 0x01, 0x0a, 0x11, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67,
	0x65, 0x44, 0x65, 0x63, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x22, 0x2e, 0x74, 0x69, 0x74, 0x61,
	0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x44, 0x65,
	0x63, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e,
	0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2e, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x28,
	0x22, 0x23, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x6f, 0x72, 0x2f, 0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x64, 0x65, 0x63,
	0x69, 0x73, 0x69, 0x6f, 0x6e, 0x3a, 0x01, 0x2a, 0x12, 0x88, 0x01, 0x0a, 0x15, 0x43, 0x68, 0x61,
	0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x46, 0x72, 0x65, 0x65, 0x7a, 0x65, 0x41, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x26, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x43, 0x68,
	0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x46, 0x72, 0x65, 0x65, 0x7a, 0x65, 0x41, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x74, 0x69, 0x74,
	0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2c, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x26, 0x22, 0x21, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x2f,
	0x63, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e, 0x67, 0x65, 0x2f, 0x66, 0x72, 0x65, 0x65, 0x7a, 0x65,
	0x3a, 0x01, 0x2a, 0x42, 0x77, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x65, 0x65, 0x72, 0x6e,
	0x6f, 0x76, 0x61, 0x2e, 0x74, 0x69, 0x74, 0x61, 0x6e, 0x69, 0x75, 0x6d, 0x2e, 0x69, 0x6e, 0x74,
	0x65, 0x72, 0x66, 0x61, 0x63, 0x65, 0x73, 0x42, 0x1b, 0x43, 0x68, 0x61, 0x6c, 0x6c, 0x65, 0x6e,
	0x67, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x75,
	0x62, 0x6c, 0x69, 0x63, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x70, 0x65, 0x65, 0x72, 0x6e, 0x6f, 0x76, 0x61, 0x2f, 0x63, 0x6c, 0x65, 0x61,
	0x72, 0x63, 0x6f, 0x6e, 0x73, 0x65, 0x6e, 0x73, 0x75, 0x73, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x73,
	0x64, 0x6b, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var file_public_challenge_service_proto_goTypes = []interface{}{
	(*common.ChallengeFormMetaRequest)(nil),       // 0: titanium.ChallengeFormMetaRequest
	(*common.ChallengeCreateRequest)(nil),         // 1: titanium.ChallengeCreateRequest
	(*common.ChallengeFreezeStatusRequest)(nil),   // 2: titanium.ChallengeFreezeStatusRequest
	(*common.GetChallengeDetailsRequest)(nil),     // 3: titanium.GetChallengeDetailsRequest
	(*common.GetAttachmentUploadUrlRequest)(nil),  // 4: titanium.GetAttachmentUploadUrlRequest
	(*common.ChallengeActiveRequest)(nil),         // 5: titanium.ChallengeActiveRequest
	(*common.ChallengeListRequest)(nil),           // 6: titanium.ChallengeListRequest
	(*common.ChallengeHistoryRequest)(nil),        // 7: titanium.ChallengeHistoryRequest
	(*common.ChallengeDecisionRequest)(nil),       // 8: titanium.ChallengeDecisionRequest
	(*common.ChallengeFreezeActionRequest)(nil),   // 9: titanium.ChallengeFreezeActionRequest
	(*common.ChallengeFormMetaResponse)(nil),      // 10: titanium.ChallengeFormMetaResponse
	(*common.ChallengeCreateResponse)(nil),        // 11: titanium.ChallengeCreateResponse
	(*common.StatusResponse)(nil),                 // 12: titanium.StatusResponse
	(*common.GetChallengeDetailsResponse)(nil),    // 13: titanium.GetChallengeDetailsResponse
	(*common.GetAttachmentUploadUrlResponse)(nil), // 14: titanium.GetAttachmentUploadUrlResponse
	(*common.ChallengeActiveResponse)(nil),        // 15: titanium.ChallengeActiveResponse
	(*common.ChallengeListResponse)(nil),          // 16: titanium.ChallengeListResponse
	(*common.ChallengeHistoryResponse)(nil),       // 17: titanium.ChallengeHistoryResponse
	(*common.MessageResponse)(nil),                // 18: titanium.MessageResponse
}
var file_public_challenge_service_proto_depIdxs = []int32{
	0,  // 0: titanium.ChallengeService.ChallengeFormMeta:input_type -> titanium.ChallengeFormMetaRequest
	1,  // 1: titanium.ChallengeService.ChallengeCreate:input_type -> titanium.ChallengeCreateRequest
	2,  // 2: titanium.ChallengeService.ChallengeFreezeStatus:input_type -> titanium.ChallengeFreezeStatusRequest
	3,  // 3: titanium.ChallengeService.GetChallengeDetails:input_type -> titanium.GetChallengeDetailsRequest
	4,  // 4: titanium.ChallengeService.GetChallengeAttachmentUploadUrl:input_type -> titanium.GetAttachmentUploadUrlRequest
	5,  // 5: titanium.ChallengeService.ChallengeActive:input_type -> titanium.ChallengeActiveRequest
	6,  // 6: titanium.ChallengeService.ChallengeList:input_type -> titanium.ChallengeListRequest
	7,  // 7: titanium.ChallengeService.ChallengeHistory:input_type -> titanium.ChallengeHistoryRequest
	8,  // 8: titanium.ChallengeService.ChallengeDecision:input_type -> titanium.ChallengeDecisionRequest
	9,  // 9: titanium.ChallengeService.ChallengeFreezeAction:input_type -> titanium.ChallengeFreezeActionRequest
	10, // 10: titanium.ChallengeService.ChallengeFormMeta:output_type -> titanium.ChallengeFormMetaResponse
	11, // 11: titanium.ChallengeService.ChallengeCreate:output_type -> titanium.ChallengeCreateResponse
	12, // 12: titanium.ChallengeService.ChallengeFreezeStatus:output_type -> titanium.StatusResponse
	13, // 13: titanium.ChallengeService.GetChallengeDetails:output_type -> titanium.GetChallengeDetailsResponse
	14, // 14: titanium.ChallengeService.GetChallengeAttachmentUploadUrl:output_type -> titanium.GetAttachmentUploadUrlResponse
	15, // 15: titanium.ChallengeService.ChallengeActive:output_type -> titanium.ChallengeActiveResponse
	16, // 16: titanium.ChallengeService.ChallengeList:output_type -> titanium.ChallengeListResponse
	17, // 17: titanium.ChallengeService.ChallengeHistory:output_type -> titanium.ChallengeHistoryResponse
	18, // 18: titanium.ChallengeService.ChallengeDecision:output_type -> titanium.MessageResponse
	18, // 19: titanium.ChallengeService.ChallengeFreezeAction:output_type -> titanium.MessageResponse
	10, // [10:20] is the sub-list for method output_type
	0,  // [0:10] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_public_challenge_service_proto_init() }
func file_public_challenge_service_proto_init() {
	if File_public_challenge_service_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_public_challenge_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_public_challenge_service_proto_goTypes,
		DependencyIndexes: file_public_challenge_service_proto_depIdxs,
	}.Build()
	File_public_challenge_service_proto = out.File
	file_public_challenge_service_proto_rawDesc = nil
	file_public_challenge_service_proto_goTypes = nil
	file_public_challenge_service_proto_depIdxs = nil
}
