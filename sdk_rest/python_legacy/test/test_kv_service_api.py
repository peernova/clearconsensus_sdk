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
from openapi_client.api.kv_service_api import KVServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestKVServiceApi(unittest.TestCase):
    """KVServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.kv_service_api.KVServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_k_v_service_add_key(self):
        """Test case for k_v_service_add_key

        """
        pass

    def test_k_v_service_delete_key(self):
        """Test case for k_v_service_delete_key

        """
        pass

    def test_k_v_service_get_key(self):
        """Test case for k_v_service_get_key

        """
        pass

    def test_k_v_service_list_keys(self):
        """Test case for k_v_service_list_keys

        """
        pass

    def test_k_v_service_update_key(self):
        """Test case for k_v_service_update_key

        """
        pass


if __name__ == '__main__':
    unittest.main()