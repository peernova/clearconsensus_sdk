"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
_sym_db = _symbol_database.Default()
from ..common import gateway_base_pb2 as common_dot_gateway__base__pb2
DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16common/analytics.proto\x12\x08titanium\x1a\x19common/gateway_base.proto"\x83\x02\n\x1bGetPredefinedFiltersRequest\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x12\n\ntrace_name\x18\x02 \x01(\t\x12\x16\n\x0esubmitted_date\x18\x03 \x01(\t\x12\x1f\n\x17consensus_run_timestamp\x18\x04 \x01(\t\x127\n\x0cfilters_type\x18\x05 \x01(\x0e2!.titanium.Predefined_Filters_Type\x12!\n\x07filters\x18\x06 \x03(\x0b2\x10.titanium.Filter\x12)\n\x0bfilter_pack\x18\x07 \x01(\x0b2\x14.titanium.FilterPack"y\n\x1cGetPredefinedFiltersResponse\x12+\n\x04data\x18\x01 \x01(\x0b2\x1b.titanium.PredefinedFiltersH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"|\n\x11PredefinedFilters\x12+\n\x07filters\x18\x01 \x03(\x0b2\x1a.titanium.PredefinedFilter\x12:\n\x16specific_asset_filters\x18\x02 \x03(\x0b2\x1a.titanium.PredefinedFilter"\x87\x01\n\x10HistogramRequest\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x14\n\x0csubmitted_id\x18\x02 \x01(\t\x12\x16\n\x0esubmitted_date\x18\x03 \x01(\t\x12\x1f\n\x17consensus_run_timestamp\x18\x04 \x01(\t\x12\x12\n\ntrace_name\x18\x05 \x01(\t"j\n\x11HistogramResponse\x12\'\n\x04data\x18\x01 \x01(\x0b2\x17.titanium.HistogramDataH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"\x85\x01\n\rHistogramData\x12:\n\x13submissionHistogram\x18\x01 \x01(\x0b2\x1d.titanium.SubmissionHistogram\x128\n\x12consensusHistogram\x18\x02 \x01(\x0b2\x1c.titanium.ConsensusHistogram"\xa1\x02\n\x13SubmissionHistogram\x121\n\rhigh_severity\x18\x01 \x01(\x0b2\x1a.titanium.PredefinedFilter\x123\n\x0fmedium_severity\x18\x02 \x01(\x0b2\x1a.titanium.PredefinedFilter\x120\n\x0clow_severity\x18\x03 \x01(\x0b2\x1a.titanium.PredefinedFilter\x12)\n\x05valid\x18\x04 \x01(\x0b2\x1a.titanium.PredefinedFilter\x12\x11\n\ttotalRows\x18\x05 \x01(\x05\x12\x18\n\x10totalInvalidRows\x18\x06 \x01(\x05\x12\x18\n\x10totalParseErrors\x18\x07 \x01(\x05"\xfe\x01\n\x12ConsensusHistogram\x12/\n\x0bnonOutliers\x18\x01 \x01(\x0b2\x1a.titanium.PredefinedFilter\x12,\n\x08outliers\x18\x02 \x01(\x0b2\x1a.titanium.PredefinedFilter\x12/\n\x0bnoConsensus\x18\x03 \x01(\x0b2\x1a.titanium.PredefinedFilter\x120\n\x0chighSeverity\x18\x04 \x01(\x0b2\x1a.titanium.PredefinedFilter\x12\x0c\n\x04rows\x18\x05 \x01(\x05\x12\x18\n\x10totalParseErrors\x18\x06 \x01(\x05"\x87\x01\n\'GenericChartMetadataDataQualityResponse\x12.\n\x04data\x18\x01 \x01(\x0b2\x1e.titanium.GenericChartResponseH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"\xb5\x01\n\x1dGenericChartMetadataConsensus\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x0c\n\x02id\x18\x02 \x01(\tH\x00\x12\x1b\n\x11date_range_filter\x18\x03 \x01(\tH\x00\x126\n\x0echart_metadata\x18\x04 \x01(\x0b2\x1e.titanium.GenericChartMetadata\x12\x12\n\ntrace_name\x18\x05 \x01(\tB\x0b\n\tconsensus"\x85\x01\n%GenericChartMetadataConsensusResponse\x12.\n\x04data\x18\x01 \x01(\x0b2\x1e.titanium.GenericChartResponseH\x00\x12 \n\x05error\x18\x02 \x01(\x0b2\x0f.titanium.ErrorH\x00B\n\n\x08response"\xe5\x01\n\x14GenericChartMetadata\x12(\n\x07metrics\x18\x01 \x03(\x0b2\x17.titanium.NameAliasPair\x12\x0e\n\x06filter\x18\x02 \x01(\t\x12)\n\x08group_by\x18\x03 \x03(\x0b2\x17.titanium.NameAliasPair\x12\x0f\n\x07sort_by\x18\x04 \x01(\t\x12\x11\n\trow_limit\x18\x05 \x01(\x05\x12\x14\n\x0cseries_limit\x18\x06 \x01(\x05\x12.\n\rselect_fields\x18\x07 \x03(\x0b2\x17.titanium.NameAliasPair"\xc8\x01\n\x1fGenericChartMetadataDataQuality\x12\x10\n\x08asset_id\x18\x01 \x01(\t\x12\x0e\n\x06client\x18\x02 \x01(\t\x12\x0c\n\x02id\x18\x03 \x01(\tH\x00\x12\x1b\n\x11date_range_filter\x18\x04 \x01(\tH\x00\x126\n\x0echart_metadata\x18\x05 \x01(\x0b2\x1e.titanium.GenericChartMetadata\x12\x12\n\ntrace_name\x18\x06 \x01(\tB\x0c\n\nsubmission*?\n\x17Predefined_Filters_Type\x12\x11\n\rSUBMITTED_TAB\x10\x00\x12\x11\n\rCONSENSUS_TAB\x10\x01Bz\n com.peernova.titanium.interfacesB\x1eAnalyticsControllerProtoCommonP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/commonb\x06proto3')
_PREDEFINED_FILTERS_TYPE = DESCRIPTOR.enum_types_by_name['Predefined_Filters_Type']
Predefined_Filters_Type = enum_type_wrapper.EnumTypeWrapper(_PREDEFINED_FILTERS_TYPE)
SUBMITTED_TAB = 0
CONSENSUS_TAB = 1
_GETPREDEFINEDFILTERSREQUEST = DESCRIPTOR.message_types_by_name['GetPredefinedFiltersRequest']
_GETPREDEFINEDFILTERSRESPONSE = DESCRIPTOR.message_types_by_name['GetPredefinedFiltersResponse']
_PREDEFINEDFILTERS = DESCRIPTOR.message_types_by_name['PredefinedFilters']
_HISTOGRAMREQUEST = DESCRIPTOR.message_types_by_name['HistogramRequest']
_HISTOGRAMRESPONSE = DESCRIPTOR.message_types_by_name['HistogramResponse']
_HISTOGRAMDATA = DESCRIPTOR.message_types_by_name['HistogramData']
_SUBMISSIONHISTOGRAM = DESCRIPTOR.message_types_by_name['SubmissionHistogram']
_CONSENSUSHISTOGRAM = DESCRIPTOR.message_types_by_name['ConsensusHistogram']
_GENERICCHARTMETADATADATAQUALITYRESPONSE = DESCRIPTOR.message_types_by_name['GenericChartMetadataDataQualityResponse']
_GENERICCHARTMETADATACONSENSUS = DESCRIPTOR.message_types_by_name['GenericChartMetadataConsensus']
_GENERICCHARTMETADATACONSENSUSRESPONSE = DESCRIPTOR.message_types_by_name['GenericChartMetadataConsensusResponse']
_GENERICCHARTMETADATA = DESCRIPTOR.message_types_by_name['GenericChartMetadata']
_GENERICCHARTMETADATADATAQUALITY = DESCRIPTOR.message_types_by_name['GenericChartMetadataDataQuality']
GetPredefinedFiltersRequest = _reflection.GeneratedProtocolMessageType('GetPredefinedFiltersRequest', (_message.Message,), {'DESCRIPTOR': _GETPREDEFINEDFILTERSREQUEST, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GetPredefinedFiltersRequest)
GetPredefinedFiltersResponse = _reflection.GeneratedProtocolMessageType('GetPredefinedFiltersResponse', (_message.Message,), {'DESCRIPTOR': _GETPREDEFINEDFILTERSRESPONSE, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GetPredefinedFiltersResponse)
PredefinedFilters = _reflection.GeneratedProtocolMessageType('PredefinedFilters', (_message.Message,), {'DESCRIPTOR': _PREDEFINEDFILTERS, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(PredefinedFilters)
HistogramRequest = _reflection.GeneratedProtocolMessageType('HistogramRequest', (_message.Message,), {'DESCRIPTOR': _HISTOGRAMREQUEST, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(HistogramRequest)
HistogramResponse = _reflection.GeneratedProtocolMessageType('HistogramResponse', (_message.Message,), {'DESCRIPTOR': _HISTOGRAMRESPONSE, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(HistogramResponse)
HistogramData = _reflection.GeneratedProtocolMessageType('HistogramData', (_message.Message,), {'DESCRIPTOR': _HISTOGRAMDATA, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(HistogramData)
SubmissionHistogram = _reflection.GeneratedProtocolMessageType('SubmissionHistogram', (_message.Message,), {'DESCRIPTOR': _SUBMISSIONHISTOGRAM, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(SubmissionHistogram)
ConsensusHistogram = _reflection.GeneratedProtocolMessageType('ConsensusHistogram', (_message.Message,), {'DESCRIPTOR': _CONSENSUSHISTOGRAM, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(ConsensusHistogram)
GenericChartMetadataDataQualityResponse = _reflection.GeneratedProtocolMessageType('GenericChartMetadataDataQualityResponse', (_message.Message,), {'DESCRIPTOR': _GENERICCHARTMETADATADATAQUALITYRESPONSE, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GenericChartMetadataDataQualityResponse)
GenericChartMetadataConsensus = _reflection.GeneratedProtocolMessageType('GenericChartMetadataConsensus', (_message.Message,), {'DESCRIPTOR': _GENERICCHARTMETADATACONSENSUS, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GenericChartMetadataConsensus)
GenericChartMetadataConsensusResponse = _reflection.GeneratedProtocolMessageType('GenericChartMetadataConsensusResponse', (_message.Message,), {'DESCRIPTOR': _GENERICCHARTMETADATACONSENSUSRESPONSE, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GenericChartMetadataConsensusResponse)
GenericChartMetadata = _reflection.GeneratedProtocolMessageType('GenericChartMetadata', (_message.Message,), {'DESCRIPTOR': _GENERICCHARTMETADATA, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GenericChartMetadata)
GenericChartMetadataDataQuality = _reflection.GeneratedProtocolMessageType('GenericChartMetadataDataQuality', (_message.Message,), {'DESCRIPTOR': _GENERICCHARTMETADATADATAQUALITY, '__module__': 'common.analytics_pb2'})
_sym_db.RegisterMessage(GenericChartMetadataDataQuality)
if _descriptor._USE_C_DESCRIPTORS == False:
    DESCRIPTOR._options = None
    DESCRIPTOR._serialized_options = b'\n com.peernova.titanium.interfacesB\x1eAnalyticsControllerProtoCommonP\x01Z4github.com/peernova/clearconsensus-sdk/sdk/go/common'
    _PREDEFINED_FILTERS_TYPE._serialized_start = 2398
    _PREDEFINED_FILTERS_TYPE._serialized_end = 2461
    _GETPREDEFINEDFILTERSREQUEST._serialized_start = 64
    _GETPREDEFINEDFILTERSREQUEST._serialized_end = 323
    _GETPREDEFINEDFILTERSRESPONSE._serialized_start = 325
    _GETPREDEFINEDFILTERSRESPONSE._serialized_end = 446
    _PREDEFINEDFILTERS._serialized_start = 448
    _PREDEFINEDFILTERS._serialized_end = 572
    _HISTOGRAMREQUEST._serialized_start = 575
    _HISTOGRAMREQUEST._serialized_end = 710
    _HISTOGRAMRESPONSE._serialized_start = 712
    _HISTOGRAMRESPONSE._serialized_end = 818
    _HISTOGRAMDATA._serialized_start = 821
    _HISTOGRAMDATA._serialized_end = 954
    _SUBMISSIONHISTOGRAM._serialized_start = 957
    _SUBMISSIONHISTOGRAM._serialized_end = 1246
    _CONSENSUSHISTOGRAM._serialized_start = 1249
    _CONSENSUSHISTOGRAM._serialized_end = 1503
    _GENERICCHARTMETADATADATAQUALITYRESPONSE._serialized_start = 1506
    _GENERICCHARTMETADATADATAQUALITYRESPONSE._serialized_end = 1641
    _GENERICCHARTMETADATACONSENSUS._serialized_start = 1644
    _GENERICCHARTMETADATACONSENSUS._serialized_end = 1825
    _GENERICCHARTMETADATACONSENSUSRESPONSE._serialized_start = 1828
    _GENERICCHARTMETADATACONSENSUSRESPONSE._serialized_end = 1961
    _GENERICCHARTMETADATA._serialized_start = 1964
    _GENERICCHARTMETADATA._serialized_end = 2193
    _GENERICCHARTMETADATADATAQUALITY._serialized_start = 2196
    _GENERICCHARTMETADATADATAQUALITY._serialized_end = 2396