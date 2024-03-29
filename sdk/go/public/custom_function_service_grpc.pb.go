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

// CustomFunctionServiceClient is the client API for CustomFunctionService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type CustomFunctionServiceClient interface {
	// AddCustomFunction allows the user to create a new custom function by sending a CustomFunction message. It returns an AcknowledgeResponse indicating whether the custom function was successfully added or not.
	AddCustomFunction(ctx context.Context, in *common.CustomFunction, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error)
	// GetCustomFunction retrieves the definition of a specific custom function. The custom function is specified in the CustomFunctionGetDefinition message, which includes its ID and scope. The method returns a CustomFunctionDefinitionResponse that contains either the custom function definition or an error.
	GetCustomFunction(ctx context.Context, in *common.CustomFunctionGetDefinition, opts ...grpc.CallOption) (*common.CustomFunctionDefinitionResponse, error)
	// ListCustomFunctions lists all the custom functions that match the specified criteria. The criteria are defined in the ListCustomFunctionRequest message, which includes the descriptor name and the type of the custom function descriptor. The method returns a ListCustomFunctionResponse that contains either a list of custom functions or an error.
	ListCustomFunctions(ctx context.Context, in *common.ListCustomFunctionRequest, opts ...grpc.CallOption) (*common.ListCustomFunctionResponse, error)
	// ListCustomFunctionVersions lists all the versions of a specific custom function. The custom function is specified in the GetDefinition message, which includes its ID and scope. The method returns a ListVersionResponse that contains either a list of versions or an error.
	ListCustomFunctionVersions(ctx context.Context, in *common.GetDefinition, opts ...grpc.CallOption) (*common.ListVersionResponse, error)
}

type customFunctionServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewCustomFunctionServiceClient(cc grpc.ClientConnInterface) CustomFunctionServiceClient {
	return &customFunctionServiceClient{cc}
}

func (c *customFunctionServiceClient) AddCustomFunction(ctx context.Context, in *common.CustomFunction, opts ...grpc.CallOption) (*common.AcknowledgeResponse, error) {
	out := new(common.AcknowledgeResponse)
	err := c.cc.Invoke(ctx, "/titanium.CustomFunctionService/AddCustomFunction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *customFunctionServiceClient) GetCustomFunction(ctx context.Context, in *common.CustomFunctionGetDefinition, opts ...grpc.CallOption) (*common.CustomFunctionDefinitionResponse, error) {
	out := new(common.CustomFunctionDefinitionResponse)
	err := c.cc.Invoke(ctx, "/titanium.CustomFunctionService/GetCustomFunction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *customFunctionServiceClient) ListCustomFunctions(ctx context.Context, in *common.ListCustomFunctionRequest, opts ...grpc.CallOption) (*common.ListCustomFunctionResponse, error) {
	out := new(common.ListCustomFunctionResponse)
	err := c.cc.Invoke(ctx, "/titanium.CustomFunctionService/ListCustomFunctions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *customFunctionServiceClient) ListCustomFunctionVersions(ctx context.Context, in *common.GetDefinition, opts ...grpc.CallOption) (*common.ListVersionResponse, error) {
	out := new(common.ListVersionResponse)
	err := c.cc.Invoke(ctx, "/titanium.CustomFunctionService/ListCustomFunctionVersions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CustomFunctionServiceServer is the server API for CustomFunctionService service.
// All implementations must embed UnimplementedCustomFunctionServiceServer
// for forward compatibility
type CustomFunctionServiceServer interface {
	// AddCustomFunction allows the user to create a new custom function by sending a CustomFunction message. It returns an AcknowledgeResponse indicating whether the custom function was successfully added or not.
	AddCustomFunction(context.Context, *common.CustomFunction) (*common.AcknowledgeResponse, error)
	// GetCustomFunction retrieves the definition of a specific custom function. The custom function is specified in the CustomFunctionGetDefinition message, which includes its ID and scope. The method returns a CustomFunctionDefinitionResponse that contains either the custom function definition or an error.
	GetCustomFunction(context.Context, *common.CustomFunctionGetDefinition) (*common.CustomFunctionDefinitionResponse, error)
	// ListCustomFunctions lists all the custom functions that match the specified criteria. The criteria are defined in the ListCustomFunctionRequest message, which includes the descriptor name and the type of the custom function descriptor. The method returns a ListCustomFunctionResponse that contains either a list of custom functions or an error.
	ListCustomFunctions(context.Context, *common.ListCustomFunctionRequest) (*common.ListCustomFunctionResponse, error)
	// ListCustomFunctionVersions lists all the versions of a specific custom function. The custom function is specified in the GetDefinition message, which includes its ID and scope. The method returns a ListVersionResponse that contains either a list of versions or an error.
	ListCustomFunctionVersions(context.Context, *common.GetDefinition) (*common.ListVersionResponse, error)
	mustEmbedUnimplementedCustomFunctionServiceServer()
}

// UnimplementedCustomFunctionServiceServer must be embedded to have forward compatible implementations.
type UnimplementedCustomFunctionServiceServer struct {
}

func (UnimplementedCustomFunctionServiceServer) AddCustomFunction(context.Context, *common.CustomFunction) (*common.AcknowledgeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddCustomFunction not implemented")
}
func (UnimplementedCustomFunctionServiceServer) GetCustomFunction(context.Context, *common.CustomFunctionGetDefinition) (*common.CustomFunctionDefinitionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCustomFunction not implemented")
}
func (UnimplementedCustomFunctionServiceServer) ListCustomFunctions(context.Context, *common.ListCustomFunctionRequest) (*common.ListCustomFunctionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListCustomFunctions not implemented")
}
func (UnimplementedCustomFunctionServiceServer) ListCustomFunctionVersions(context.Context, *common.GetDefinition) (*common.ListVersionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListCustomFunctionVersions not implemented")
}
func (UnimplementedCustomFunctionServiceServer) mustEmbedUnimplementedCustomFunctionServiceServer() {}

// UnsafeCustomFunctionServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to CustomFunctionServiceServer will
// result in compilation errors.
type UnsafeCustomFunctionServiceServer interface {
	mustEmbedUnimplementedCustomFunctionServiceServer()
}

func RegisterCustomFunctionServiceServer(s grpc.ServiceRegistrar, srv CustomFunctionServiceServer) {
	s.RegisterService(&CustomFunctionService_ServiceDesc, srv)
}

func _CustomFunctionService_AddCustomFunction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.CustomFunction)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CustomFunctionServiceServer).AddCustomFunction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.CustomFunctionService/AddCustomFunction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CustomFunctionServiceServer).AddCustomFunction(ctx, req.(*common.CustomFunction))
	}
	return interceptor(ctx, in, info, handler)
}

func _CustomFunctionService_GetCustomFunction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.CustomFunctionGetDefinition)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CustomFunctionServiceServer).GetCustomFunction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.CustomFunctionService/GetCustomFunction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CustomFunctionServiceServer).GetCustomFunction(ctx, req.(*common.CustomFunctionGetDefinition))
	}
	return interceptor(ctx, in, info, handler)
}

func _CustomFunctionService_ListCustomFunctions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.ListCustomFunctionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CustomFunctionServiceServer).ListCustomFunctions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.CustomFunctionService/ListCustomFunctions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CustomFunctionServiceServer).ListCustomFunctions(ctx, req.(*common.ListCustomFunctionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CustomFunctionService_ListCustomFunctionVersions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.GetDefinition)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CustomFunctionServiceServer).ListCustomFunctionVersions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/titanium.CustomFunctionService/ListCustomFunctionVersions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CustomFunctionServiceServer).ListCustomFunctionVersions(ctx, req.(*common.GetDefinition))
	}
	return interceptor(ctx, in, info, handler)
}

// CustomFunctionService_ServiceDesc is the grpc.ServiceDesc for CustomFunctionService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var CustomFunctionService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "titanium.CustomFunctionService",
	HandlerType: (*CustomFunctionServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AddCustomFunction",
			Handler:    _CustomFunctionService_AddCustomFunction_Handler,
		},
		{
			MethodName: "GetCustomFunction",
			Handler:    _CustomFunctionService_GetCustomFunction_Handler,
		},
		{
			MethodName: "ListCustomFunctions",
			Handler:    _CustomFunctionService_ListCustomFunctions_Handler,
		},
		{
			MethodName: "ListCustomFunctionVersions",
			Handler:    _CustomFunctionService_ListCustomFunctionVersions_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "public/custom_function_service.proto",
}
