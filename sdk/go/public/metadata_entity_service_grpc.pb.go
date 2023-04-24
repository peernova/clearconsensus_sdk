// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package public

import (
	context "context"
	common "github.com/peernova/clearconsensus-sdk/sdk/go/common"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// MetadataEntityServiceClient is the client API for MetadataEntityService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type MetadataEntityServiceClient interface {
	AddEntity(ctx context.Context, in *common.EntityDefinition, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error)
	GetEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.EntityDefinition, error)
	EnableEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error)
	DisableEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error)
}

type metadataEntityServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewMetadataEntityServiceClient(cc grpc.ClientConnInterface) MetadataEntityServiceClient {
	return &metadataEntityServiceClient{cc}
}

func (c *metadataEntityServiceClient) AddEntity(ctx context.Context, in *common.EntityDefinition, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error) {
	out := new(common.AcknowledgeResponse)
	err := c.cc.Invoke(ctx, "/titanium.MetadataEntityService/AddEntity", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *metadataEntityServiceClient) GetEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.EntityDefinition, error) {
	out := new(common.EntityDefinition)
	err := c.cc.Invoke(ctx, "/titanium.MetadataEntityService/GetEntity", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *metadataEntityServiceClient) EnableEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error) {
	out := new(common.AcknowledgeResponse)
	err := c.cc.Invoke(ctx, "/titanium.MetadataEntityService/EnableEntity", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *metadataEntityServiceClient) DisableEntity(ctx context.Context, in *common.EntityIdentifier, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error) {
	out := new(common.AcknowledgeResponse)
	err := c.cc.Invoke(ctx, "/titanium.MetadataEntityService/DisableEntity", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MetadataEntityServiceServer is the server API for MetadataEntityService service.
// All implementations must embed UnimplementedMetadataEntityServiceServer
// for forward compatibility
type MetadataEntityServiceServer interface {
	AddEntity(context.Context, *common.EntityDefinition) (*common.AcknowledgeResponse, error)
	GetEntity(context.Context, *common.EntityIdentifier) (*common.EntityDefinition, error)
	EnableEntity(context.Context, *common.EntityIdentifier) (*common.AcknowledgeResponse, error)
	DisableEntity(context.Context, *common.EntityIdentifier) (*common.AcknowledgeResponse, error)
	mustEmbedUnimplementedMetadataEntityServiceServer()
}

// UnimplementedMetadataEntityServiceServer must be embedded to have forward compatible implementations.
type UnimplementedMetadataEntityServiceServer struct {
}

func (UnimplementedMetadataEntityServiceServer) AddEntity(context.Context, *common.EntityDefinition) (*common.AcknowledgeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddEntity not implemented")
}
func (UnimplementedMetadataEntityServiceServer) GetEntity(context.Context, *common.EntityIdentifier) (*common.EntityDefinition, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEntity not implemented")
}
func (UnimplementedMetadataEntityServiceServer) EnableEntity(context.Context, *common.EntityIdentifier) (*common.AcknowledgeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method EnableEntity not implemented")
}
func (UnimplementedMetadataEntityServiceServer) DisableEntity(context.Context, *common.EntityIdentifier) (*common.AcknowledgeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DisableEntity not implemented")
}
func (UnimplementedMetadataEntityServiceServer) mustEmbedUnimplementedMetadataEntityServiceServer() {}

// UnsafeMetadataEntityServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to MetadataEntityServiceServer will
// result in compilation errors.
type UnsafeMetadataEntityServiceServer interface {
	mustEmbedUnimplementedMetadataEntityServiceServer()
}

func RegisterMetadataEntityServiceServer(s grpc.ServiceRegistrar, srv MetadataEntityServiceServer) {
	s.RegisterService(&MetadataEntityService_ServiceDesc, srv)
}

func _MetadataEntityService_AddEntity_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.EntityDefinition)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MetadataEntityServiceServer).AddEntity(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.MetadataEntityService/AddEntity",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MetadataEntityServiceServer).AddEntity(ctx, req.(*common.EntityDefinition))
	}
	return interceptor(ctx, in, info, handler)
}

func _MetadataEntityService_GetEntity_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.EntityIdentifier)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MetadataEntityServiceServer).GetEntity(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.MetadataEntityService/GetEntity",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MetadataEntityServiceServer).GetEntity(ctx, req.(*common.EntityIdentifier))
	}
	return interceptor(ctx, in, info, handler)
}

func _MetadataEntityService_EnableEntity_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.EntityIdentifier)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MetadataEntityServiceServer).EnableEntity(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.MetadataEntityService/EnableEntity",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MetadataEntityServiceServer).EnableEntity(ctx, req.(*common.EntityIdentifier))
	}
	return interceptor(ctx, in, info, handler)
}

func _MetadataEntityService_DisableEntity_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.EntityIdentifier)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MetadataEntityServiceServer).DisableEntity(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.MetadataEntityService/DisableEntity",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MetadataEntityServiceServer).DisableEntity(ctx, req.(*common.EntityIdentifier))
	}
	return interceptor(ctx, in, info, handler)
}

// MetadataEntityService_ServiceDesc is the grpc.ServiceDesc for MetadataEntityService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var MetadataEntityService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "titanium.MetadataEntityService",
	HandlerType: (*MetadataEntityServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AddEntity",
			Handler:    _MetadataEntityService_AddEntity_Handler,
		},
		{
			MethodName: "GetEntity",
			Handler:    _MetadataEntityService_GetEntity_Handler,
		},
		{
			MethodName: "EnableEntity",
			Handler:    _MetadataEntityService_EnableEntity_Handler,
		},
		{
			MethodName: "DisableEntity",
			Handler:    _MetadataEntityService_DisableEntity_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "public/metadata_entity_service.proto",
}
