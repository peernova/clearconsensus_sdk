# coding: utf-8

"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.titanium_consensus_explorer_table_data import TitaniumConsensusExplorerTableData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumConsensusExplorerTableData(unittest.TestCase):
    """TitaniumConsensusExplorerTableData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumConsensusExplorerTableData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_consensus_explorer_table_data.TitaniumConsensusExplorerTableData()  # noqa: E501
        if include_optional :
            return TitaniumConsensusExplorerTableData(
                comparison_table = openapi_client.models.titanium_comparison_table.titaniumComparisonTable(
                    all_participant_cohort_consensus = openapi_client.models.titanium_all_participant_explorer_table_column.titaniumAllParticipantExplorerTableColumn(
                        abs_diff_from_consensus_price = openapi_client.models.abs_diff_from_consensus_price.absDiffFromConsensusPrice(), 
                        consensus_price = openapi_client.models.consensus_price.consensusPrice(), 
                        lower_boundary = openapi_client.models.lower_boundary.lowerBoundary(), 
                        participants_count = '', 
                        std_dev = openapi_client.models.std_dev.stdDev(), 
                        sub_price_diff = openapi_client.models.sub_price_diff.subPriceDiff(), 
                        upper_boundary = openapi_client.models.upper_boundary.upperBoundary(), ), 
                    evaluated_price = openapi_client.models.titanium_evp_explorer_table_column.titaniumEvpExplorerTableColumn(
                        abs_diff_from_evp_mid = openapi_client.models.abs_diff_from_evp_mid.absDiffFromEvpMid(), 
                        ask = openapi_client.models.ask.ask(), 
                        bid = openapi_client.models.bid.bid(), 
                        evp_lower_boundary = openapi_client.models.evp_lower_boundary.evpLowerBoundary(), 
                        evp_upper_boundary = openapi_client.models.evp_upper_boundary.evpUpperBoundary(), 
                        mid = openapi_client.models.mid.mid(), 
                        sub_price_diff = openapi_client.models.sub_price_diff.subPriceDiff(), 
                        trades_or_orders_count = openapi_client.models.trades_or_orders_count.tradesOrOrdersCount(), ), 
                    expert_cohort_consensus = openapi_client.models.titanium_expert_explorer_table_column.titaniumExpertExplorerTableColumn(
                        abs_diff_from_expert_cohort_mean = openapi_client.models.abs_diff_from_expert_cohort_mean.absDiffFromExpertCohortMean(), 
                        max = openapi_client.models.max.max(), 
                        mean = openapi_client.models.mean.mean(), 
                        min = openapi_client.models.min.min(), 
                        participant_instruments_count = '', 
                        std_dev = openapi_client.models.std_dev.stdDev(), 
                        sub_price_diff = openapi_client.models.sub_price_diff.subPriceDiff(), ), 
                    submission = openapi_client.models.titanium_submission_explorer_table_column.titaniumSubmissionExplorerTableColumn(
                        submission_price = 1.337, ), 
                    submission_statistics = openapi_client.models.titanium_submission_statistics_explorer_table_column.titaniumSubmissionStatisticsExplorerTableColumn(
                        abs_diff_from_statistical_mean = openapi_client.models.abs_diff_from_statistical_mean.absDiffFromStatisticalMean(), 
                        lower_boundary = openapi_client.models.lower_boundary.lowerBoundary(), 
                        max = openapi_client.models.max.max(), 
                        min = openapi_client.models.min.min(), 
                        statistical_mean = openapi_client.models.statistical_mean.statisticalMean(), 
                        std_dev = openapi_client.models.std_dev.stdDev(), 
                        sub_price_diff = openapi_client.models.sub_price_diff.subPriceDiff(), 
                        sub_valid_points_count = '', 
                        upper_boundary = openapi_client.models.upper_boundary.upperBoundary(), ), )
            )
        else :
            return TitaniumConsensusExplorerTableData(
        )

    def testTitaniumConsensusExplorerTableData(self):
        """Test TitaniumConsensusExplorerTableData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
