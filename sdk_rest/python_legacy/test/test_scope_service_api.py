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
from openapi_client.api.scope_service_api import ScopeServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestScopeServiceApi(unittest.TestCase):
    """ScopeServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.scope_service_api.ScopeServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_scope_service_add_scope(self):
        """Test case for scope_service_add_scope

        AddScope creates scope in the system.  # noqa: E501
        """
        pass

    def test_scope_service_exist_scope(self):
        """Test case for scope_service_exist_scope

        ExistScope return boolean value about existence of scope according to request.  # noqa: E501
        """
        pass

    def test_scope_service_list_scope(self):
        """Test case for scope_service_list_scope

        ListScope returns list of all existing scopes.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
