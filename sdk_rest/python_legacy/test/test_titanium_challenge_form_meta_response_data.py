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
from openapi_client.models.titanium_challenge_form_meta_response_data import TitaniumChallengeFormMetaResponseData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumChallengeFormMetaResponseData(unittest.TestCase):
    """TitaniumChallengeFormMetaResponseData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumChallengeFormMetaResponseData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_challenge_form_meta_response_data.TitaniumChallengeFormMetaResponseData()  # noqa: E501
        if include_optional :
            return TitaniumChallengeFormMetaResponseData(
                one_of_fields = [
                    openapi_client.models.titanium_challenge_form_one_of_fields.titaniumChallengeFormOneOfFields(
                        names = [
                            ''
                            ], )
                    ], 
                rows = [
                    openapi_client.models.titanium_challenge_form_general_row.titaniumChallengeFormGeneralRow(
                        field = '', 
                        max = openapi_client.models.titanium_challenge_form_general_row_max.titaniumChallengeFormGeneralRowMax(
                            value = 1.337, ), 
                        max_length = openapi_client.models.titanium_challenge_form_general_row_max_length.titaniumChallengeFormGeneralRowMaxLength(
                            value = 56, ), 
                        min = openapi_client.models.titanium_challenge_form_general_row_min.titaniumChallengeFormGeneralRowMin(
                            value = 1.337, ), 
                        min_length = openapi_client.models.titanium_challenge_form_general_row_min_length.titaniumChallengeFormGeneralRowMinLength(
                            value = 56, ), 
                        precision = openapi_client.models.titanium_challenge_form_general_row_precision.titaniumChallengeFormGeneralRowPrecision(
                            value = 56, ), 
                        regex = '', 
                        tooltip = '', 
                        type = '', 
                        value = openapi_client.models.value.value(), )
                    ]
            )
        else :
            return TitaniumChallengeFormMetaResponseData(
        )

    def testTitaniumChallengeFormMetaResponseData(self):
        """Test TitaniumChallengeFormMetaResponseData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()