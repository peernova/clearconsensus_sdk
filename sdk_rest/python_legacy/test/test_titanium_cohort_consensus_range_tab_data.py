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
from openapi_client.models.titanium_cohort_consensus_range_tab_data import TitaniumCohortConsensusRangeTabData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumCohortConsensusRangeTabData(unittest.TestCase):
    """TitaniumCohortConsensusRangeTabData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumCohortConsensusRangeTabData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_cohort_consensus_range_tab_data.TitaniumCohortConsensusRangeTabData()  # noqa: E501
        if include_optional :
            return TitaniumCohortConsensusRangeTabData(
                distance_to_anchor = None, 
                distance_to_consensus = None, 
                evp_anchor_details = openapi_client.models.titanium_evp_anchor_details.titaniumEvpAnchorDetails(
                    distance_to_consensus = 1.337, 
                    mid = 1.337, ), 
                expertise_rank = None, 
                expertise_score = None, 
                experts_count = 56, 
                submission_evidence_anchor_details = openapi_client.models.titanium_submission_evidence_anchor_details.titaniumSubmissionEvidenceAnchorDetails(
                    distance_to_consensus = 1.337, 
                    submission_evidence = 1.337, ), 
                trade_anchor_details = openapi_client.models.titanium_trade_anchor_details.titaniumTradeAnchorDetails(
                    distance_to_consensus = 1.337, 
                    latest_trade_price = 1.337, 
                    notional = 1.337, 
                    pricing_age = '', 
                    source = '', 
                    trade_execution_time = '', ), 
                trade_periods_with_metrics = openapi_client.models.titanium_trade_periods_with_metrics.titaniumTradePeriodsWithMetrics(
                    less_day = openapi_client.models.titanium_trade_period_metrics.titaniumTradePeriodMetrics(
                        max_notional_amount = 1.337, 
                        min_notional_amount = 1.337, 
                        total_liquidity = 1.337, 
                        trade_count = '', ), 
                    less_month = openapi_client.models.titanium_trade_period_metrics.titaniumTradePeriodMetrics(
                        max_notional_amount = 1.337, 
                        min_notional_amount = 1.337, 
                        total_liquidity = 1.337, 
                        trade_count = '', ), 
                    less_week = , )
            )
        else :
            return TitaniumCohortConsensusRangeTabData(
        )

    def testTitaniumCohortConsensusRangeTabData(self):
        """Test TitaniumCohortConsensusRangeTabData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()