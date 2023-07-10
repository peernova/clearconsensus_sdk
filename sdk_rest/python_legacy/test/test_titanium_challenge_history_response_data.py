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
from openapi_client.models.titanium_challenge_history_response_data import TitaniumChallengeHistoryResponseData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumChallengeHistoryResponseData(unittest.TestCase):
    """TitaniumChallengeHistoryResponseData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumChallengeHistoryResponseData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_challenge_history_response_data.TitaniumChallengeHistoryResponseData()  # noqa: E501
        if include_optional :
            return TitaniumChallengeHistoryResponseData(
                columns = [
                    openapi_client.models.titanium_column_info.titaniumColumnInfo(
                        column_db_type = '', 
                        column_name = '', 
                        column_type = '', 
                        raw_column_name = '', )
                    ], 
                rows = [
                    openapi_client.models.titanium_values_row.titaniumValuesRow(
                        values = [
                            None
                            ], )
                    ], 
                total_rows = 56
            )
        else :
            return TitaniumChallengeHistoryResponseData(
        )

    def testTitaniumChallengeHistoryResponseData(self):
        """Test TitaniumChallengeHistoryResponseData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
