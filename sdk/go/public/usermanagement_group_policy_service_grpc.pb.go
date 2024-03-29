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

// GroupPolicyServiceClient is the client API for GroupPolicyService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type GroupPolicyServiceClient interface {
	Create(ctx context.Context, in *common.GroupPolicies, opts ...grpc.CallOption) (*common.OperationSuccess, error)
	GetPolicies(ctx context.Context, in *common.PolicyType, opts ...grpc.CallOption) (*common.GroupPoliciesResponse, error)
}

type groupPolicyServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewGroupPolicyServiceClient(cc grpc.ClientConnInterface) GroupPolicyServiceClient {
	return &groupPolicyServiceClient{cc}
}

func (c *groupPolicyServiceClient) Create(ctx context.Context, in *common.GroupPolicies, opts ...grpc.CallOption) (*common.OperationSuccess, error) {
	out := new(common.OperationSuccess)
	err := c.cc.Invoke(ctx, "/com.peernova.titanium.casbin.management.grpc.service.GroupPolicyService/create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupPolicyServiceClient) GetPolicies(ctx context.Context, in *common.PolicyType, opts ...grpc.CallOption) (*common.GroupPoliciesResponse, error) {
	out := new(common.GroupPoliciesResponse)
	err := c.cc.Invoke(ctx, "/com.peernova.titanium.casbin.management.grpc.service.GroupPolicyService/getPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// GroupPolicyServiceServer is the server API for GroupPolicyService service.
// All implementations must embed UnimplementedGroupPolicyServiceServer
// for forward compatibility
type GroupPolicyServiceServer interface {
	Create(context.Context, *common.GroupPolicies) (*common.OperationSuccess, error)
	GetPolicies(context.Context, *common.PolicyType) (*common.GroupPoliciesResponse, error)
	mustEmbedUnimplementedGroupPolicyServiceServer()
}

// UnimplementedGroupPolicyServiceServer must be embedded to have forward compatible implementations.
type UnimplementedGroupPolicyServiceServer struct {
}

func (UnimplementedGroupPolicyServiceServer) Create(context.Context, *common.GroupPolicies) (*common.OperationSuccess, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (UnimplementedGroupPolicyServiceServer) GetPolicies(context.Context, *common.PolicyType) (*common.GroupPoliciesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPolicies not implemented")
}
func (UnimplementedGroupPolicyServiceServer) mustEmbedUnimplementedGroupPolicyServiceServer() {}

// UnsafeGroupPolicyServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to GroupPolicyServiceServer will
// result in compilation errors.
type UnsafeGroupPolicyServiceServer interface {
	mustEmbedUnimplementedGroupPolicyServiceServer()
}

func RegisterGroupPolicyServiceServer(s grpc.ServiceRegistrar, srv GroupPolicyServiceServer) {
	s.RegisterService(&GroupPolicyService_ServiceDesc, srv)
}

func _GroupPolicyService_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.GroupPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupPolicyServiceServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/com.peernova.titanium.casbin.management.grpc.service.GroupPolicyService/create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupPolicyServiceServer).Create(ctx, req.(*common.GroupPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupPolicyService_GetPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.PolicyType)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupPolicyServiceServer).GetPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/com.peernova.titanium.casbin.management.grpc.service.GroupPolicyService/getPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupPolicyServiceServer).GetPolicies(ctx, req.(*common.PolicyType))
	}
	return interceptor(ctx, in, info, handler)
}

// GroupPolicyService_ServiceDesc is the grpc.ServiceDesc for GroupPolicyService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var GroupPolicyService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "com.peernova.titanium.casbin.management.grpc.service.GroupPolicyService",
	HandlerType: (*GroupPolicyServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "create",
			Handler:    _GroupPolicyService_Create_Handler,
		},
		{
			MethodName: "getPolicies",
			Handler:    _GroupPolicyService_GetPolicies_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "public/usermanagement_group_policy_service.proto",
}
