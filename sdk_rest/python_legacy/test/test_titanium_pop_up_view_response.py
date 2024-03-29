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
from openapi_client.models.titanium_pop_up_view_response import TitaniumPopUpViewResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumPopUpViewResponse(unittest.TestCase):
    """TitaniumPopUpViewResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumPopUpViewResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_pop_up_view_response.TitaniumPopUpViewResponse()  # noqa: E501
        if include_optional :
            return TitaniumPopUpViewResponse(
                data = openapi_client.models.titanium_pop_up_view_response_data.titaniumPopUpViewResponseData(
                    benchmark = '', 
                    consensus = openapi_client.models.titanium_view_row.titaniumViewRow(
                        columns = [
                            openapi_client.models.titanium_column_info.titaniumColumnInfo(
                                column_db_type = '', 
                                column_name = '', 
                                column_type = '', 
                                raw_column_name = '', )
                            ], 
                        values = [
                            None
                            ], ), 
                    consensus_details = openapi_client.models.titanium_consensus_detail.titaniumConsensusDetail(
                        calculation_detail = '', 
                        calculation_status = '', 
                        highest_sev = '', 
                        parse_status = '', ), 
                    data_quality_errors = openapi_client.models.titanium_data_quality_errors.titaniumDataQualityErrors(
                        errors = [
                            openapi_client.models.titanium_data_quality_error.titaniumDataQualityError(
                                message = '', 
                                severity = 56, )
                            ], ), 
                    evaluated_price = openapi_client.models.titanium_view_row.titaniumViewRow(), 
                    grouping_keys = [
                        openapi_client.models.titanium_string_key_val.titaniumStringKeyVal(
                            key = '', 
                            val = '', )
                        ], 
                    outlier = '', 
                    ranges_chart = '', 
                    submission = , 
                    validation_errors = '', ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumPopUpViewResponse(
        )

    def testTitaniumPopUpViewResponse(self):
        """Test TitaniumPopUpViewResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
