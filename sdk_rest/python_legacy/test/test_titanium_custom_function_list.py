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
from openapi_client.models.titanium_custom_function_list import TitaniumCustomFunctionList  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumCustomFunctionList(unittest.TestCase):
    """TitaniumCustomFunctionList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumCustomFunctionList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_custom_function_list.TitaniumCustomFunctionList()  # noqa: E501
        if include_optional :
            return TitaniumCustomFunctionList(
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
                    ]
            )
        else :
            return TitaniumCustomFunctionList(
        )

    def testTitaniumCustomFunctionList(self):
        """Test TitaniumCustomFunctionList"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
