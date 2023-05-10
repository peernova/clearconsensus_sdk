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
from openapi_client.models.titanium_list_custom_function_response import TitaniumListCustomFunctionResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumListCustomFunctionResponse(unittest.TestCase):
    """TitaniumListCustomFunctionResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumListCustomFunctionResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_list_custom_function_response.TitaniumListCustomFunctionResponse()  # noqa: E501
        if include_optional :
            return TitaniumListCustomFunctionResponse(
                data = openapi_client.models.titanium_custom_function_list.titaniumCustomFunctionList(
                    results = [
                        openapi_client.models.titanium_custom_function.titaniumCustomFunction(
                            category = '', 
                            definition = '', 
                            descriptor_name = '', 
                            descriptor_type = '', 
                            name = '', 
                            output_type = '', 
                            scope = '', 
                            uid = '', 
                            usages = [
                                openapi_client.models.titanium_custom_function_usage.titaniumCustomFunctionUsage(
                                    identifier = openapi_client.models.titanium_identifier.titaniumIdentifier(
                                        name = '', 
                                        uid = '', ), 
                                    type = '', )
                                ], )
                        ], ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumListCustomFunctionResponse(
        )

    def testTitaniumListCustomFunctionResponse(self):
        """Test TitaniumListCustomFunctionResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
