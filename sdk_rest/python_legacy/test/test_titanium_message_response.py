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
from openapi_client.models.titanium_message_response import TitaniumMessageResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumMessageResponse(unittest.TestCase):
    """TitaniumMessageResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumMessageResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_message_response.TitaniumMessageResponse()  # noqa: E501
        if include_optional :
            return TitaniumMessageResponse(
                data = openapi_client.models.titanium_message_response_data.titaniumMessageResponseData(
                    message = '', ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumMessageResponse(
        )

    def testTitaniumMessageResponse(self):
        """Test TitaniumMessageResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
