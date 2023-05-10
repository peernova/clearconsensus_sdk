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
from openapi_client.models.titanium_file_history_row import TitaniumFileHistoryRow  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumFileHistoryRow(unittest.TestCase):
    """TitaniumFileHistoryRow unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumFileHistoryRow
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_file_history_row.TitaniumFileHistoryRow()  # noqa: E501
        if include_optional :
            return TitaniumFileHistoryRow(
                consensus_run = [
                    openapi_client.models.titanium_consensus_run_info.titaniumConsensusRunInfo(
                        consensus_result_set_info = [
                            openapi_client.models.titanium_consensus_result_set_info.titaniumConsensusResultSetInfo(
                                cohort_name = '', 
                                consensus_result_set_id = '', 
                                consensus_run_timestamp = '', 
                                data_content = '', 
                                description = '', 
                                status = '', 
                                type = '', )
                            ], 
                        consensus_run_id = '', 
                        number_of_participants = 56, 
                        run_by = '', )
                    ], 
                latest_consensus_member = True, 
                values = [
                    None
                    ]
            )
        else :
            return TitaniumFileHistoryRow(
        )

    def testTitaniumFileHistoryRow(self):
        """Test TitaniumFileHistoryRow"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
