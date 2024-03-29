// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package public

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// KVServiceClient is the client API for KVService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type KVServiceClient interface {
	AddKey(ctx context.Context, in *KVAsset, opts ...grpc.CallOption) (*KVOperationResponse, error)
	UpdateKey(ctx context.Context, in *KVAsset, opts ...grpc.CallOption) (*KVOperationResponse, error)
	GetKey(ctx context.Context, in *KVRequest, opts ...grpc.CallOption) (*GetKVResponse, error)
	DeleteKey(ctx context.Context, in *KVRequest, opts ...grpc.CallOption) (*KVOperationResponse, error)
	ListKeys(ctx context.Context, in *ListKVRequest, opts ...grpc.CallOption) (*ListKVResponse, error)
}

type kVServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewKVServiceClient(cc grpc.ClientConnInterface) KVServiceClient {
	return &kVServiceClient{cc}
}

func (c *kVServiceClient) AddKey(ctx context.Context, in *KVAsset, opts ...grpc.CallOption) (*KVOperationResponse, error) {
	out := new(KVOperationResponse)
	err := c.cc.Invoke(ctx, "/titanium.KVService/AddKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVServiceClient) UpdateKey(ctx context.Context, in *KVAsset, opts ...grpc.CallOption) (*KVOperationResponse, error) {
	out := new(KVOperationResponse)
	err := c.cc.Invoke(ctx, "/titanium.KVService/UpdateKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVServiceClient) GetKey(ctx context.Context, in *KVRequest, opts ...grpc.CallOption) (*GetKVResponse, error) {
	out := new(GetKVResponse)
	err := c.cc.Invoke(ctx, "/titanium.KVService/GetKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVServiceClient) DeleteKey(ctx context.Context, in *KVRequest, opts ...grpc.CallOption) (*KVOperationResponse, error) {
	out := new(KVOperationResponse)
	err := c.cc.Invoke(ctx, "/titanium.KVService/DeleteKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVServiceClient) ListKeys(ctx context.Context, in *ListKVRequest, opts ...grpc.CallOption) (*ListKVResponse, error) {
	out := new(ListKVResponse)
	err := c.cc.Invoke(ctx, "/titanium.KVService/ListKeys", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// KVServiceServer is the server API for KVService service.
// All implementations must embed UnimplementedKVServiceServer
// for forward compatibility
type KVServiceServer interface {
	AddKey(context.Context, *KVAsset) (*KVOperationResponse, error)
	UpdateKey(context.Context, *KVAsset) (*KVOperationResponse, error)
	GetKey(context.Context, *KVRequest) (*GetKVResponse, error)
	DeleteKey(context.Context, *KVRequest) (*KVOperationResponse, error)
	ListKeys(context.Context, *ListKVRequest) (*ListKVResponse, error)
	mustEmbedUnimplementedKVServiceServer()
}

// UnimplementedKVServiceServer must be embedded to have forward compatible implementations.
type UnimplementedKVServiceServer struct {
}

func (UnimplementedKVServiceServer) AddKey(context.Context, *KVAsset) (*KVOperationResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddKey not implemented")
}
func (UnimplementedKVServiceServer) UpdateKey(context.Context, *KVAsset) (*KVOperationResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateKey not implemented")
}
func (UnimplementedKVServiceServer) GetKey(context.Context, *KVRequest) (*GetKVResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetKey not implemented")
}
func (UnimplementedKVServiceServer) DeleteKey(context.Context, *KVRequest) (*KVOperationResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteKey not implemented")
}
func (UnimplementedKVServiceServer) ListKeys(context.Context, *ListKVRequest) (*ListKVResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListKeys not implemented")
}
func (UnimplementedKVServiceServer) mustEmbedUnimplementedKVServiceServer() {}

// UnsafeKVServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to KVServiceServer will
// result in compilation errors.
type UnsafeKVServiceServer interface {
	mustEmbedUnimplementedKVServiceServer()
}

func RegisterKVServiceServer(s grpc.ServiceRegistrar, srv KVServiceServer) {
	s.RegisterService(&KVService_ServiceDesc, srv)
}

func _KVService_AddKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(KVAsset)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVServiceServer).AddKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.KVService/AddKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVServiceServer).AddKey(ctx, req.(*KVAsset))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVService_UpdateKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(KVAsset)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVServiceServer).UpdateKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.KVService/UpdateKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVServiceServer).UpdateKey(ctx, req.(*KVAsset))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVService_GetKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(KVRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVServiceServer).GetKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.KVService/GetKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVServiceServer).GetKey(ctx, req.(*KVRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVService_DeleteKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(KVRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVServiceServer).DeleteKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.KVService/DeleteKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVServiceServer).DeleteKey(ctx, req.(*KVRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVService_ListKeys_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListKVRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVServiceServer).ListKeys(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.KVService/ListKeys",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVServiceServer).ListKeys(ctx, req.(*ListKVRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// KVService_ServiceDesc is the grpc.ServiceDesc for KVService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var KVService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "titanium.KVService",
	HandlerType: (*KVServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AddKey",
			Handler:    _KVService_AddKey_Handler,
		},
		{
			MethodName: "UpdateKey",
			Handler:    _KVService_UpdateKey_Handler,
		},
		{
			MethodName: "GetKey",
			Handler:    _KVService_GetKey_Handler,
		},
		{
			MethodName: "DeleteKey",
			Handler:    _KVService_DeleteKey_Handler,
		},
		{
			MethodName: "ListKeys",
			Handler:    _KVService_ListKeys_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "public/key_storage.proto",
}
