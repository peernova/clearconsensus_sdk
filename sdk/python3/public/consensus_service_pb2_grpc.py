"""Client and server classes corresponding to protobuf-defined services."""
import grpc
from ..common import consensus_pb2 as common_dot_consensus__pb2
from ..common import gateway_base_pb2 as common_dot_gateway__base__pb2
from ..public import consensus_service_pb2 as public_dot_consensus__service__pb2

class ConsensusServiceStub(object):
    """
    <b>ConsensusService</b> is service that used to operate with consensus process.

    Consensus price is either the *valuation* price of an instrument provided by combining the submissions for an
    instrument. For a consensus to be reached for a tenor 3 points of data are requirement at minimum.
    It can be the***average price***, average volatility or other agreed upon methods for a particular instrument.

    Consensus process is :

    0. Validation of submitted data(using validation rules). All of the valid submitted points are used in the calculation of the consensus.
    These are rows from the submission that pass the data validation rules. Only rows with a state of “passed” are used in the calculation.

    1. Select: Gets all of the submission rows that are for this consensus.

    2. Group By: Group by of the fields to make sure the same points are being compared to each other. there is data on the submission that
    is used for grouping.


    3. Outlier Detection: It determines if any of the points are outliers using 2 calculations
    The results of the outlier identification are available in details for research and explanation.
    Note: An outlier is an instrument price that falls outside the standard deviation limit for a particular instrument.

    4. Apply Evaluated Price to Outliers: Uses the evaluated price to bring points back in
    >Note:
    >The Evaluated Price is an authoritative source of data regarding the opinion of the market because it is based on trades and actionable orders beyond the view of information by a given dealer.
    >There are two types of Evaluated Prices :
    >The first is Bid/Ask which is where the view into the market establishes and spread in the pricing between buyers and sellers.
    >There is a Mid calculated between the Bid and Ask. There is a second type of Evaluated Price called Mid Only.
    >This is where there is no Bid and Ask available and the observable activity in the market is designated as a “Mid”, but it is not known whether this observable activity is from a seller or a buyer.

    5. Calculate Consensus: Calculates the consensus using the points that are included and creates some statistics

    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ConsensusTimestamps = channel.unary_unary('/titanium.ConsensusService/ConsensusTimestamps', request_serializer=common_dot_consensus__pb2.ConsensusTimestampsRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusTimestampsResponse.FromString)
        self.Consensus = channel.unary_unary('/titanium.ConsensusService/Consensus', request_serializer=common_dot_consensus__pb2.ConsensusRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusResponse.FromString)
        self.EvaluatedPrice = channel.unary_unary('/titanium.ConsensusService/EvaluatedPrice', request_serializer=common_dot_consensus__pb2.EVPRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.EVPResponse.FromString)
        self.ConsensusOutliers = channel.unary_unary('/titanium.ConsensusService/ConsensusOutliers', request_serializer=common_dot_gateway__base__pb2.OutliersListRequest.SerializeToString, response_deserializer=common_dot_gateway__base__pb2.ConsensusActiveResponse.FromString)
        self.GetConsensusRuns = channel.unary_unary('/titanium.ConsensusService/GetConsensusRuns', request_serializer=common_dot_consensus__pb2.GetConsensusRunsRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.GetConsensusRunsResponse.FromString)
        self.ConsensusExplorerInstrumentDetails = channel.unary_unary('/titanium.ConsensusService/ConsensusExplorerInstrumentDetails', request_serializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, response_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerInstrumentDetailsResponse.FromString)
        self.ConsensusExplorerTable = channel.unary_unary('/titanium.ConsensusService/ConsensusExplorerTable', request_serializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, response_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerTableResponse.FromString)
        self.ConsensusExplorerRanges = channel.unary_unary('/titanium.ConsensusService/ConsensusExplorerRanges', request_serializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, response_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerRangeResponse.FromString)
        self.CohortConsensusTab = channel.unary_unary('/titanium.ConsensusService/CohortConsensusTab', request_serializer=public_dot_consensus__service__pb2.ConsensusTabRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusResultSetValuesResponse.FromString)
        self.SubmissionEvidenceTab = channel.unary_unary('/titanium.ConsensusService/SubmissionEvidenceTab', request_serializer=public_dot_consensus__service__pb2.ConsensusTabRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusResultSetValuesResponse.FromString)
        self.ConsensusActive = channel.unary_unary('/titanium.ConsensusService/ConsensusActive', request_serializer=common_dot_consensus__pb2.ConsensusActiveRequest.SerializeToString, response_deserializer=common_dot_gateway__base__pb2.ConsensusActiveResponse.FromString)
        self.ConsensusToPublish = channel.unary_unary('/titanium.ConsensusService/ConsensusToPublish', request_serializer=common_dot_consensus__pb2.ConsensusToPublishRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusToPublishResponse.FromString)
        self.ConsensusPublish = channel.unary_unary('/titanium.ConsensusService/ConsensusPublish', request_serializer=common_dot_consensus__pb2.ConsensusPublishRequest.SerializeToString, response_deserializer=common_dot_gateway__base__pb2.MessageResponse.FromString)
        self.ConsensusHistory = channel.unary_unary('/titanium.ConsensusService/ConsensusHistory', request_serializer=common_dot_consensus__pb2.ConsensusHistoryRequest.SerializeToString, response_deserializer=common_dot_consensus__pb2.ConsensusHistoryResponse.FromString)
        self.ConsensusDecision = channel.unary_unary('/titanium.ConsensusService/ConsensusDecision', request_serializer=common_dot_consensus__pb2.ConsensusDecisionRequest.SerializeToString, response_deserializer=common_dot_gateway__base__pb2.MessageResponse.FromString)

class ConsensusServiceServicer(object):
    """
    <b>ConsensusService</b> is service that used to operate with consensus process.

    Consensus price is either the *valuation* price of an instrument provided by combining the submissions for an
    instrument. For a consensus to be reached for a tenor 3 points of data are requirement at minimum.
    It can be the***average price***, average volatility or other agreed upon methods for a particular instrument.

    Consensus process is :

    0. Validation of submitted data(using validation rules). All of the valid submitted points are used in the calculation of the consensus.
    These are rows from the submission that pass the data validation rules. Only rows with a state of “passed” are used in the calculation.

    1. Select: Gets all of the submission rows that are for this consensus.

    2. Group By: Group by of the fields to make sure the same points are being compared to each other. there is data on the submission that
    is used for grouping.


    3. Outlier Detection: It determines if any of the points are outliers using 2 calculations
    The results of the outlier identification are available in details for research and explanation.
    Note: An outlier is an instrument price that falls outside the standard deviation limit for a particular instrument.

    4. Apply Evaluated Price to Outliers: Uses the evaluated price to bring points back in
    >Note:
    >The Evaluated Price is an authoritative source of data regarding the opinion of the market because it is based on trades and actionable orders beyond the view of information by a given dealer.
    >There are two types of Evaluated Prices :
    >The first is Bid/Ask which is where the view into the market establishes and spread in the pricing between buyers and sellers.
    >There is a Mid calculated between the Bid and Ask. There is a second type of Evaluated Price called Mid Only.
    >This is where there is no Bid and Ask available and the observable activity in the market is designated as a “Mid”, but it is not known whether this observable activity is from a seller or a buyer.

    5. Calculate Consensus: Calculates the consensus using the points that are included and creates some statistics

    """

    def ConsensusTimestamps(self, request, context):
        """ConsensusTimestamps returns timestamps when it was submitted.
        Need to specify asset ID and trace name.
        Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.

        This is a test to see how detailed we can make a RPC method's documentation using this commenting type:
        Below we will be shown sample input for the ConsensusTimestamps endpoint.
        **sample input**

        >`{`<br>
        >`   "asset_id": "238917-2131-341ff",`<br>
        >`   "trace_name": "placeholder value"`<br>
        >`}`
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Consensus(self, request, context):
        """
        Consensus return information about consensus according to request.
        Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition)
        Returns ConsensusResponse that contains information about column and rows related to consensus.

        This is a test of a different commenting type:
        Below we will be shown a placeholder for the Consensus RPC request.
        *sample input**

        >`{`<br>
        >`   "asset_id": "238917-2131-341ff",`<br>
        >`   "trace_name": "placeholder value",`<br>
        >`   "submitted_date": "238472301213"`<br>
        >`}`

        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EvaluatedPrice(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusOutliers(self, request, context):
        """ConsensusOutliers return list of outliers according to specified consensus.
        Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest)
        Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetConsensusRuns(self, request, context):
        """Get Consensus Run's consensus result sets

        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusExplorerInstrumentDetails(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusExplorerTable(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusExplorerRanges(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CohortConsensusTab(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SubmissionEvidenceTab(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusActive(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusToPublish(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusPublish(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusHistory(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsensusDecision(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

def add_ConsensusServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {'ConsensusTimestamps': grpc.unary_unary_rpc_method_handler(servicer.ConsensusTimestamps, request_deserializer=common_dot_consensus__pb2.ConsensusTimestampsRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusTimestampsResponse.SerializeToString), 'Consensus': grpc.unary_unary_rpc_method_handler(servicer.Consensus, request_deserializer=common_dot_consensus__pb2.ConsensusRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusResponse.SerializeToString), 'EvaluatedPrice': grpc.unary_unary_rpc_method_handler(servicer.EvaluatedPrice, request_deserializer=common_dot_consensus__pb2.EVPRequest.FromString, response_serializer=common_dot_consensus__pb2.EVPResponse.SerializeToString), 'ConsensusOutliers': grpc.unary_unary_rpc_method_handler(servicer.ConsensusOutliers, request_deserializer=common_dot_gateway__base__pb2.OutliersListRequest.FromString, response_serializer=common_dot_gateway__base__pb2.ConsensusActiveResponse.SerializeToString), 'GetConsensusRuns': grpc.unary_unary_rpc_method_handler(servicer.GetConsensusRuns, request_deserializer=common_dot_consensus__pb2.GetConsensusRunsRequest.FromString, response_serializer=common_dot_consensus__pb2.GetConsensusRunsResponse.SerializeToString), 'ConsensusExplorerInstrumentDetails': grpc.unary_unary_rpc_method_handler(servicer.ConsensusExplorerInstrumentDetails, request_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.FromString, response_serializer=public_dot_consensus__service__pb2.ConsensusExplorerInstrumentDetailsResponse.SerializeToString), 'ConsensusExplorerTable': grpc.unary_unary_rpc_method_handler(servicer.ConsensusExplorerTable, request_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.FromString, response_serializer=public_dot_consensus__service__pb2.ConsensusExplorerTableResponse.SerializeToString), 'ConsensusExplorerRanges': grpc.unary_unary_rpc_method_handler(servicer.ConsensusExplorerRanges, request_deserializer=public_dot_consensus__service__pb2.ConsensusExplorerRequest.FromString, response_serializer=public_dot_consensus__service__pb2.ConsensusExplorerRangeResponse.SerializeToString), 'CohortConsensusTab': grpc.unary_unary_rpc_method_handler(servicer.CohortConsensusTab, request_deserializer=public_dot_consensus__service__pb2.ConsensusTabRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusResultSetValuesResponse.SerializeToString), 'SubmissionEvidenceTab': grpc.unary_unary_rpc_method_handler(servicer.SubmissionEvidenceTab, request_deserializer=public_dot_consensus__service__pb2.ConsensusTabRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusResultSetValuesResponse.SerializeToString), 'ConsensusActive': grpc.unary_unary_rpc_method_handler(servicer.ConsensusActive, request_deserializer=common_dot_consensus__pb2.ConsensusActiveRequest.FromString, response_serializer=common_dot_gateway__base__pb2.ConsensusActiveResponse.SerializeToString), 'ConsensusToPublish': grpc.unary_unary_rpc_method_handler(servicer.ConsensusToPublish, request_deserializer=common_dot_consensus__pb2.ConsensusToPublishRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusToPublishResponse.SerializeToString), 'ConsensusPublish': grpc.unary_unary_rpc_method_handler(servicer.ConsensusPublish, request_deserializer=common_dot_consensus__pb2.ConsensusPublishRequest.FromString, response_serializer=common_dot_gateway__base__pb2.MessageResponse.SerializeToString), 'ConsensusHistory': grpc.unary_unary_rpc_method_handler(servicer.ConsensusHistory, request_deserializer=common_dot_consensus__pb2.ConsensusHistoryRequest.FromString, response_serializer=common_dot_consensus__pb2.ConsensusHistoryResponse.SerializeToString), 'ConsensusDecision': grpc.unary_unary_rpc_method_handler(servicer.ConsensusDecision, request_deserializer=common_dot_consensus__pb2.ConsensusDecisionRequest.FromString, response_serializer=common_dot_gateway__base__pb2.MessageResponse.SerializeToString)}
    generic_handler = grpc.method_handlers_generic_handler('titanium.ConsensusService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))

class ConsensusService(object):
    """
    <b>ConsensusService</b> is service that used to operate with consensus process.

    Consensus price is either the *valuation* price of an instrument provided by combining the submissions for an
    instrument. For a consensus to be reached for a tenor 3 points of data are requirement at minimum.
    It can be the***average price***, average volatility or other agreed upon methods for a particular instrument.

    Consensus process is :

    0. Validation of submitted data(using validation rules). All of the valid submitted points are used in the calculation of the consensus.
    These are rows from the submission that pass the data validation rules. Only rows with a state of “passed” are used in the calculation.

    1. Select: Gets all of the submission rows that are for this consensus.

    2. Group By: Group by of the fields to make sure the same points are being compared to each other. there is data on the submission that
    is used for grouping.


    3. Outlier Detection: It determines if any of the points are outliers using 2 calculations
    The results of the outlier identification are available in details for research and explanation.
    Note: An outlier is an instrument price that falls outside the standard deviation limit for a particular instrument.

    4. Apply Evaluated Price to Outliers: Uses the evaluated price to bring points back in
    >Note:
    >The Evaluated Price is an authoritative source of data regarding the opinion of the market because it is based on trades and actionable orders beyond the view of information by a given dealer.
    >There are two types of Evaluated Prices :
    >The first is Bid/Ask which is where the view into the market establishes and spread in the pricing between buyers and sellers.
    >There is a Mid calculated between the Bid and Ask. There is a second type of Evaluated Price called Mid Only.
    >This is where there is no Bid and Ask available and the observable activity in the market is designated as a “Mid”, but it is not known whether this observable activity is from a seller or a buyer.

    5. Calculate Consensus: Calculates the consensus using the points that are included and creates some statistics

    """

    @staticmethod
    def ConsensusTimestamps(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusTimestamps', common_dot_consensus__pb2.ConsensusTimestampsRequest.SerializeToString, common_dot_consensus__pb2.ConsensusTimestampsResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Consensus(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/Consensus', common_dot_consensus__pb2.ConsensusRequest.SerializeToString, common_dot_consensus__pb2.ConsensusResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EvaluatedPrice(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/EvaluatedPrice', common_dot_consensus__pb2.EVPRequest.SerializeToString, common_dot_consensus__pb2.EVPResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusOutliers(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusOutliers', common_dot_gateway__base__pb2.OutliersListRequest.SerializeToString, common_dot_gateway__base__pb2.ConsensusActiveResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetConsensusRuns(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/GetConsensusRuns', common_dot_consensus__pb2.GetConsensusRunsRequest.SerializeToString, common_dot_consensus__pb2.GetConsensusRunsResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusExplorerInstrumentDetails(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusExplorerInstrumentDetails', public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, public_dot_consensus__service__pb2.ConsensusExplorerInstrumentDetailsResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusExplorerTable(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusExplorerTable', public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, public_dot_consensus__service__pb2.ConsensusExplorerTableResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusExplorerRanges(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusExplorerRanges', public_dot_consensus__service__pb2.ConsensusExplorerRequest.SerializeToString, public_dot_consensus__service__pb2.ConsensusExplorerRangeResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CohortConsensusTab(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/CohortConsensusTab', public_dot_consensus__service__pb2.ConsensusTabRequest.SerializeToString, common_dot_consensus__pb2.ConsensusResultSetValuesResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SubmissionEvidenceTab(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/SubmissionEvidenceTab', public_dot_consensus__service__pb2.ConsensusTabRequest.SerializeToString, common_dot_consensus__pb2.ConsensusResultSetValuesResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusActive(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusActive', common_dot_consensus__pb2.ConsensusActiveRequest.SerializeToString, common_dot_gateway__base__pb2.ConsensusActiveResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusToPublish(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusToPublish', common_dot_consensus__pb2.ConsensusToPublishRequest.SerializeToString, common_dot_consensus__pb2.ConsensusToPublishResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusPublish(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusPublish', common_dot_consensus__pb2.ConsensusPublishRequest.SerializeToString, common_dot_gateway__base__pb2.MessageResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusHistory(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusHistory', common_dot_consensus__pb2.ConsensusHistoryRequest.SerializeToString, common_dot_consensus__pb2.ConsensusHistoryResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConsensusDecision(request, target, options=(), channel_credentials=None, call_credentials=None, insecure=False, compression=None, wait_for_ready=None, timeout=None, metadata=None):
        return grpc.experimental.unary_unary(request, target, '/titanium.ConsensusService/ConsensusDecision', common_dot_consensus__pb2.ConsensusDecisionRequest.SerializeToString, common_dot_gateway__base__pb2.MessageResponse.FromString, options, channel_credentials, insecure, call_credentials, compression, wait_for_ready, timeout, metadata)