"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
_sym_db = _symbol_database.Default()
from ..common import usermanagement_error_pb2 as common_dot_usermanagement__error__pb2
from ..common import usermanagement_entity_pb2 as common_dot_usermanagement__entity__pb2
DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n common/usermanagement_user.proto\x122com.peernova.titanium.casbin.management.grpc.proto\x1a!common/usermanagement_error.proto\x1a"common/usermanagement_entity.proto"\xa9\x01\n\x07UserDto\x12\n\n\x02id\x18\x01 \x01(\t\x12\r\n\x05email\x18\x02 \x01(\t\x12\x11\n\tfirstName\x18\x03 \x01(\t\x12\x10\n\x08lastName\x18\x04 \x01(\t\x12\x0f\n\x07enabled\x18\x05 \x01(\x08\x12M\n\x06entity\x18\x06 \x01(\x0b2=.com.peernova.titanium.casbin.management.grpc.proto.EntityDto"\xb3\x01\n\x0cUserResponse\x12K\n\x04data\x18\x01 \x01(\x0b2;.com.peernova.titanium.casbin.management.grpc.proto.UserDtoH\x00\x12J\n\x05error\x18\x02 \x01(\x0b29.com.peernova.titanium.casbin.management.grpc.proto.ErrorH\x00B\n\n\x08response"U\n\x08UsersDto\x12I\n\x04user\x18\x01 \x03(\x0b2;.com.peernova.titanium.casbin.management.grpc.proto.UserDto"\xb5\x01\n\rUsersResponse\x12L\n\x04data\x18\x01 \x01(\x0b2<.com.peernova.titanium.casbin.management.grpc.proto.UsersDtoH\x00\x12J\n\x05error\x18\x02 \x01(\x0b29.com.peernova.titanium.casbin.management.grpc.proto.ErrorH\x00B\n\n\x08response"\x1e\n\x0bUserEnabled\x12\x0f\n\x07enabled\x18\x01 \x01(\x08"\x14\n\x06UserId\x12\n\n\x02id\x18\x01 \x01(\tBl\n2com.peernova.titanium.casbin.management.grpc.protoP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/commonb\x06proto3')
_USERDTO = DESCRIPTOR.message_types_by_name['UserDto']
_USERRESPONSE = DESCRIPTOR.message_types_by_name['UserResponse']
_USERSDTO = DESCRIPTOR.message_types_by_name['UsersDto']
_USERSRESPONSE = DESCRIPTOR.message_types_by_name['UsersResponse']
_USERENABLED = DESCRIPTOR.message_types_by_name['UserEnabled']
_USERID = DESCRIPTOR.message_types_by_name['UserId']
UserDto = _reflection.GeneratedProtocolMessageType('UserDto', (_message.Message,), {'DESCRIPTOR': _USERDTO, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UserDto)
UserResponse = _reflection.GeneratedProtocolMessageType('UserResponse', (_message.Message,), {'DESCRIPTOR': _USERRESPONSE, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UserResponse)
UsersDto = _reflection.GeneratedProtocolMessageType('UsersDto', (_message.Message,), {'DESCRIPTOR': _USERSDTO, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UsersDto)
UsersResponse = _reflection.GeneratedProtocolMessageType('UsersResponse', (_message.Message,), {'DESCRIPTOR': _USERSRESPONSE, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UsersResponse)
UserEnabled = _reflection.GeneratedProtocolMessageType('UserEnabled', (_message.Message,), {'DESCRIPTOR': _USERENABLED, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UserEnabled)
UserId = _reflection.GeneratedProtocolMessageType('UserId', (_message.Message,), {'DESCRIPTOR': _USERID, '__module__': 'common.usermanagement_user_pb2'})
_sym_db.RegisterMessage(UserId)
if _descriptor._USE_C_DESCRIPTORS == False:
    DESCRIPTOR._options = None
    DESCRIPTOR._serialized_options = b'\n2com.peernova.titanium.casbin.management.grpc.protoP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/common'
    _USERDTO._serialized_start = 160
    _USERDTO._serialized_end = 329
    _USERRESPONSE._serialized_start = 332
    _USERRESPONSE._serialized_end = 511
    _USERSDTO._serialized_start = 513
    _USERSDTO._serialized_end = 598
    _USERSRESPONSE._serialized_start = 601
    _USERSRESPONSE._serialized_end = 782
    _USERENABLED._serialized_start = 784
    _USERENABLED._serialized_end = 814
    _USERID._serialized_start = 816
    _USERID._serialized_end = 836