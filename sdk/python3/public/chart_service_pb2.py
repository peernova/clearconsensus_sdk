"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
_sym_db = _symbol_database.Default()
from ..google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from ..common import gateway_base_pb2 as common_dot_gateway__base__pb2
DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1apublic/chart_service.proto\x12\x08titanium\x1a\x1cgoogle/api/annotations.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x19common/gateway_base.proto"\xd1\x01\n\x13GetChartDataRequest\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x10\n\x08chart_id\x18\x02 \x01(\t\x12\x10\n\x08slice_id\x18\x03 \x01(\t\x12+\n\nparameters\x18\x04 \x01(\x0b2\x17.google.protobuf.Struct\x12)\n\x0bfilter_pack\x18\x05 \x01(\x0b2\x14.titanium.FilterPack\x12\x18\n\x10invalidate_cache\x18\x06 \x01(\x08\x12\x12\n\ntrace_name\x18\x07 \x01(\t"q\n\x14GetChartDataResponse\x12+\n\x04data\x18\x01 \x01(\x0b2\x1b.titanium.ChartDataResponseH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"[\n\x11ChartDataResponse\x12\x12\n\nchart_type\x18\x01 \x01(\t\x12\x10\n\x08chart_id\x18\x02 \x01(\t\x12 \n\x06series\x18\x03 \x03(\x0b2\x10.titanium.Series"y\n\x06Series\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0ccontent_type\x18\x02 \x01(\t\x12$\n\x08metadata\x18\x03 \x01(\x0b2\x12.titanium.Metadata\x12%\n\x04data\x18\x04 \x03(\x0b2\x17.google.protobuf.Struct" \n\x08Metadata\x12\x14\n\x0ccolumn_names\x18\x01 \x03(\t"\xe3\x01\n\x05Table\x12\'\n\x07columns\x18\x01 \x03(\x0b2\x16.titanium.Table.Column\x12!\n\x04rows\x18\x02 \x03(\x0b2\x13.titanium.Table.Row\x12\x12\n\ntotal_rows\x18\x03 \x01(\x03\x1aK\n\x06Column\x12\x13\n\x0bcolumn_name\x18\x01 \x01(\t\x12\x17\n\x0fraw_column_name\x18\x02 \x01(\t\x12\x13\n\x0bcolumn_type\x18\x03 \x01(\t\x1a-\n\x03Row\x12&\n\x06values\x18\x01 \x03(\x0b2\x16.google.protobuf.Value"a\n\x10GetTableResponse\x12\x1f\n\x04data\x18\x01 \x01(\x0b2\x0f.titanium.TableH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response2\xf5\x01\n\x0cChartService\x12v\n\x0cgetChartData\x12\x1d.titanium.GetChartDataRequest\x1a\x1e.titanium.GetChartDataResponse"\'\x82\xd3\xe4\x93\x02!"\x1c/api/v1/analytics/chart-data:\x01*\x12m\n\x0cgetTableData\x12\x1d.titanium.GetChartDataRequest\x1a\x1a.titanium.GetTableResponse""\x82\xd3\xe4\x93\x02\x1c"\x17/api/v1/analytics/table:\x01*BZ\n com.peernova.titanium.interfacesP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/publicb\x06proto3')
_GETCHARTDATAREQUEST = DESCRIPTOR.message_types_by_name['GetChartDataRequest']
_GETCHARTDATARESPONSE = DESCRIPTOR.message_types_by_name['GetChartDataResponse']
_CHARTDATARESPONSE = DESCRIPTOR.message_types_by_name['ChartDataResponse']
_SERIES = DESCRIPTOR.message_types_by_name['Series']
_METADATA = DESCRIPTOR.message_types_by_name['Metadata']
_TABLE = DESCRIPTOR.message_types_by_name['Table']
_TABLE_COLUMN = _TABLE.nested_types_by_name['Column']
_TABLE_ROW = _TABLE.nested_types_by_name['Row']
_GETTABLERESPONSE = DESCRIPTOR.message_types_by_name['GetTableResponse']
GetChartDataRequest = _reflection.GeneratedProtocolMessageType('GetChartDataRequest', (_message.Message,), {'DESCRIPTOR': _GETCHARTDATAREQUEST, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(GetChartDataRequest)
GetChartDataResponse = _reflection.GeneratedProtocolMessageType('GetChartDataResponse', (_message.Message,), {'DESCRIPTOR': _GETCHARTDATARESPONSE, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(GetChartDataResponse)
ChartDataResponse = _reflection.GeneratedProtocolMessageType('ChartDataResponse', (_message.Message,), {'DESCRIPTOR': _CHARTDATARESPONSE, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(ChartDataResponse)
Series = _reflection.GeneratedProtocolMessageType('Series', (_message.Message,), {'DESCRIPTOR': _SERIES, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(Series)
Metadata = _reflection.GeneratedProtocolMessageType('Metadata', (_message.Message,), {'DESCRIPTOR': _METADATA, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(Metadata)
Table = _reflection.GeneratedProtocolMessageType('Table', (_message.Message,), {'Column': _reflection.GeneratedProtocolMessageType('Column', (_message.Message,), {'DESCRIPTOR': _TABLE_COLUMN, '__module__': 'public.chart_service_pb2'}), 'Row': _reflection.GeneratedProtocolMessageType('Row', (_message.Message,), {'DESCRIPTOR': _TABLE_ROW, '__module__': 'public.chart_service_pb2'}), 'DESCRIPTOR': _TABLE, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(Table)
_sym_db.RegisterMessage(Table.Column)
_sym_db.RegisterMessage(Table.Row)
GetTableResponse = _reflection.GeneratedProtocolMessageType('GetTableResponse', (_message.Message,), {'DESCRIPTOR': _GETTABLERESPONSE, '__module__': 'public.chart_service_pb2'})
_sym_db.RegisterMessage(GetTableResponse)
_CHARTSERVICE = DESCRIPTOR.services_by_name['ChartService']
if _descriptor._USE_C_DESCRIPTORS == False:
    DESCRIPTOR._options = None
    DESCRIPTOR._serialized_options = b'\n com.peernova.titanium.interfacesP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/public'
    _CHARTSERVICE.methods_by_name['getChartData']._options = None
    _CHARTSERVICE.methods_by_name['getChartData']._serialized_options = b'\x82\xd3\xe4\x93\x02!"\x1c/api/v1/analytics/chart-data:\x01*'
    _CHARTSERVICE.methods_by_name['getTableData']._options = None
    _CHARTSERVICE.methods_by_name['getTableData']._serialized_options = b'\x82\xd3\xe4\x93\x02\x1c"\x17/api/v1/analytics/table:\x01*'
    _GETCHARTDATAREQUEST._serialized_start = 128
    _GETCHARTDATAREQUEST._serialized_end = 337
    _GETCHARTDATARESPONSE._serialized_start = 339
    _GETCHARTDATARESPONSE._serialized_end = 452
    _CHARTDATARESPONSE._serialized_start = 454
    _CHARTDATARESPONSE._serialized_end = 545
    _SERIES._serialized_start = 547
    _SERIES._serialized_end = 668
    _METADATA._serialized_start = 670
    _METADATA._serialized_end = 702
    _TABLE._serialized_start = 705
    _TABLE._serialized_end = 932
    _TABLE_COLUMN._serialized_start = 810
    _TABLE_COLUMN._serialized_end = 885
    _TABLE_ROW._serialized_start = 887
    _TABLE_ROW._serialized_end = 932
    _GETTABLERESPONSE._serialized_start = 934
    _GETTABLERESPONSE._serialized_end = 1031
    _CHARTSERVICE._serialized_start = 1034
    _CHARTSERVICE._serialized_end = 1279