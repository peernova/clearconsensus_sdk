"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
_sym_db = _symbol_database.Default()
from ..common import gateway_base_pb2 as common_dot_gateway__base__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16common/dq_errors.proto\x12\x08titanium\x1a\x19common/gateway_base.proto\x1a\x1cgoogle/protobuf/struct.proto"\xb0\x01\n\x1bGetDataQualityErrorsRequest\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x17\n\rsubmission_id\x18\x02 \x01(\tH\x00\x12\x16\n\x0cconsensus_id\x18\x03 \x01(\tH\x00\x12\x1c\n\x12evaluated_price_id\x18\x04 \x01(\tH\x00\x12\x16\n\x0esubmitted_date\x18\x05 \x01(\t\x12\x12\n\ntrace_name\x18\x06 \x01(\tB\x04\n\x02id"\x81\x01\n\x1cGetDataQualityErrorsResponse\x123\n\x04data\x18\x01 \x01(\x0b2#.titanium.DataQualityErrorsResponseH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"\x9e\x01\n\x19DataQualityErrorsResponse\x12<\n\x13data_quality_errors\x18\x01 \x01(\x0b2\x1f.titanium.SeverityToDataQuality\x12/\n\x0esubmitted_data\x18\x02 \x03(\x0b2\x17.titanium.SubmittedData\x12\x12\n\ntotal_rows\x18\x03 \x01(\x05"{\n\x15SeverityToDataQuality\x12\x1f\n\x04high\x18\x01 \x03(\x0b2\x11.titanium.DQError\x12!\n\x06medium\x18\x02 \x03(\x0b2\x11.titanium.DQError\x12\x1e\n\x03low\x18\x03 \x03(\x0b2\x11.titanium.DQError"\x86\x01\n\x07DQError\x12\x14\n\x0cruleset_name\x18\x01 \x01(\t\x12\x15\n\rcriteria_name\x18\x02 \x01(\t\x12\x11\n\trule_name\x18\x03 \x01(\t\x12$\n\x08severity\x18\x04 \x01(\x0e2\x12.titanium.Severity\x12\x15\n\rerror_message\x18\x05 \x01(\t"\xe2\x01\n\x0fDQErrorsRequest\x12\x16\n\x0esubmitted_date\x18\x01 \x01(\t\x12\x14\n\x0csubmitted_id\x18\x02 \x01(\t\x12\x10\n\x08asset_id\x18\x03 \x01(\t\x12\x0e\n\x06filter\x18\x04 \x01(\t\x12)\n\x0bfilter_pack\x18\x05 \x01(\x0b2\x14.titanium.FilterPack\x12"\n\x07orderBy\x18\x06 \x01(\x0b2\x11.titanium.OrderBy\x12\x1c\n\x04page\x18\x07 \x01(\x0b2\x0e.titanium.Page\x12\x12\n\ntrace_name\x18\x08 \x01(\t"D\n\rSubmittedData\x12\x0b\n\x03key\x18\x01 \x01(\t\x12&\n\x06values\x18\x02 \x01(\x0b2\x16.google.protobuf.Value"h\n\x10DQErrorsResponse\x12&\n\x04data\x18\x01 \x01(\x0b2\x16.titanium.ResponseDataH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response*A\n\x08Severity\x12\x16\n\x12UNDEFINED_SEVERITY\x10\x00\x12\x08\n\x04HIGH\x10\x01\x12\n\n\x06MEDIUM\x10\x02\x12\x07\n\x03LOW\x10\x03By\n com.peernova.titanium.interfacesB\x1dDataQualityServiceProtoCommonP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/commonb\x06proto3')
_SEVERITY = DESCRIPTOR.enum_types_by_name['Severity']
Severity = enum_type_wrapper.EnumTypeWrapper(_SEVERITY)
UNDEFINED_SEVERITY = 0
HIGH = 1
MEDIUM = 2
LOW = 3
_GETDATAQUALITYERRORSREQUEST = DESCRIPTOR.message_types_by_name['GetDataQualityErrorsRequest']
_GETDATAQUALITYERRORSRESPONSE = DESCRIPTOR.message_types_by_name['GetDataQualityErrorsResponse']
_DATAQUALITYERRORSRESPONSE = DESCRIPTOR.message_types_by_name['DataQualityErrorsResponse']
_SEVERITYTODATAQUALITY = DESCRIPTOR.message_types_by_name['SeverityToDataQuality']
_DQERROR = DESCRIPTOR.message_types_by_name['DQError']
_DQERRORSREQUEST = DESCRIPTOR.message_types_by_name['DQErrorsRequest']
_SUBMITTEDDATA = DESCRIPTOR.message_types_by_name['SubmittedData']
_DQERRORSRESPONSE = DESCRIPTOR.message_types_by_name['DQErrorsResponse']
GetDataQualityErrorsRequest = _reflection.GeneratedProtocolMessageType('GetDataQualityErrorsRequest', (_message.Message,), {'DESCRIPTOR': _GETDATAQUALITYERRORSREQUEST, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(GetDataQualityErrorsRequest)
GetDataQualityErrorsResponse = _reflection.GeneratedProtocolMessageType('GetDataQualityErrorsResponse', (_message.Message,), {'DESCRIPTOR': _GETDATAQUALITYERRORSRESPONSE, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(GetDataQualityErrorsResponse)
DataQualityErrorsResponse = _reflection.GeneratedProtocolMessageType('DataQualityErrorsResponse', (_message.Message,), {'DESCRIPTOR': _DATAQUALITYERRORSRESPONSE, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(DataQualityErrorsResponse)
SeverityToDataQuality = _reflection.GeneratedProtocolMessageType('SeverityToDataQuality', (_message.Message,), {'DESCRIPTOR': _SEVERITYTODATAQUALITY, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(SeverityToDataQuality)
DQError = _reflection.GeneratedProtocolMessageType('DQError', (_message.Message,), {'DESCRIPTOR': _DQERROR, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(DQError)
DQErrorsRequest = _reflection.GeneratedProtocolMessageType('DQErrorsRequest', (_message.Message,), {'DESCRIPTOR': _DQERRORSREQUEST, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(DQErrorsRequest)
SubmittedData = _reflection.GeneratedProtocolMessageType('SubmittedData', (_message.Message,), {'DESCRIPTOR': _SUBMITTEDDATA, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(SubmittedData)
DQErrorsResponse = _reflection.GeneratedProtocolMessageType('DQErrorsResponse', (_message.Message,), {'DESCRIPTOR': _DQERRORSRESPONSE, '__module__': 'common.dq_errors_pb2'})
_sym_db.RegisterMessage(DQErrorsResponse)
if _descriptor._USE_C_DESCRIPTORS == False:
    DESCRIPTOR._options = None
    DESCRIPTOR._serialized_options = b'\n com.peernova.titanium.interfacesB\x1dDataQualityServiceProtoCommonP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/common'
    _SEVERITY._serialized_start = 1232
    _SEVERITY._serialized_end = 1297
    _GETDATAQUALITYERRORSREQUEST._serialized_start = 94
    _GETDATAQUALITYERRORSREQUEST._serialized_end = 270
    _GETDATAQUALITYERRORSRESPONSE._serialized_start = 273
    _GETDATAQUALITYERRORSRESPONSE._serialized_end = 402
    _DATAQUALITYERRORSRESPONSE._serialized_start = 405
    _DATAQUALITYERRORSRESPONSE._serialized_end = 563
    _SEVERITYTODATAQUALITY._serialized_start = 565
    _SEVERITYTODATAQUALITY._serialized_end = 688
    _DQERROR._serialized_start = 691
    _DQERROR._serialized_end = 825
    _DQERRORSREQUEST._serialized_start = 828
    _DQERRORSREQUEST._serialized_end = 1054
    _SUBMITTEDDATA._serialized_start = 1056
    _SUBMITTEDDATA._serialized_end = 1124
    _DQERRORSRESPONSE._serialized_start = 1126
    _DQERRORSRESPONSE._serialized_end = 1230