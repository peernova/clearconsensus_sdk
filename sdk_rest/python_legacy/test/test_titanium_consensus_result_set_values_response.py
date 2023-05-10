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
from openapi_client.models.titanium_consensus_result_set_values_response import TitaniumConsensusResultSetValuesResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumConsensusResultSetValuesResponse(unittest.TestCase):
    """TitaniumConsensusResultSetValuesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumConsensusResultSetValuesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_consensus_result_set_values_response.TitaniumConsensusResultSetValuesResponse()  # noqa: E501
        if include_optional :
            return TitaniumConsensusResultSetValuesResponse(
                data = openapi_client.models.titanium_consensus_result_set_values.titaniumConsensusResultSetValues(
                    columns = [
                        openapi_client.models.titanium_column_info.titaniumColumnInfo(
                            column_db_type = '', 
                            column_name = '', 
                            column_type = '', 
                            raw_column_name = '', )
                        ], 
                    page = openapi_client.models.titanium_page.titaniumPage(
                        page_number = 56, 
                        size = 56, 
                        total_number_of_elements = '', ), 
                    rows = [
                        openapi_client.models.titanium_values_row.titaniumValuesRow(
                            values = [
                                None
                                ], )
                        ], ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumConsensusResultSetValuesResponse(
        )

    def testTitaniumConsensusResultSetValuesResponse(self):
        """Test TitaniumConsensusResultSetValuesResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
