# coding: utf-8

"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.custom_function_service_api import CustomFunctionServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestCustomFunctionServiceApi(unittest.TestCase):
    """CustomFunctionServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.custom_function_service_api.CustomFunctionServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_custom_function_service_add_custom_function(self):
        """Test case for custom_function_service_add_custom_function

        AddCustomFunction allows the user to create a new custom function by sending a CustomFunction message. It returns an AcknowledgeResponse indicating whether the custom function was successfully added or not.  # noqa: E501
        """
        pass

    def test_custom_function_service_get_custom_function(self):
        """Test case for custom_function_service_get_custom_function

        GetCustomFunction retrieves the definition of a specific custom function. The custom function is specified in the CustomFunctionGetDefinition message, which includes its ID and scope. The method returns a CustomFunctionDefinitionResponse that contains either the custom function definition or an error.  # noqa: E501
        """
        pass

    def test_custom_function_service_list_custom_function_versions(self):
        """Test case for custom_function_service_list_custom_function_versions

        ListCustomFunctionVersions lists all the versions of a specific custom function. The custom function is specified in the GetDefinition message, which includes its ID and scope. The method returns a ListVersionResponse that contains either a list of versions or an error.  # noqa: E501
        """
        pass

    def test_custom_function_service_list_custom_functions(self):
        """Test case for custom_function_service_list_custom_functions

        ListCustomFunctions lists all the custom functions that match the specified criteria. The criteria are defined in the ListCustomFunctionRequest message, which includes the descriptor name and the type of the custom function descriptor. The method returns a ListCustomFunctionResponse that contains either a list of custom functions or an error.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
