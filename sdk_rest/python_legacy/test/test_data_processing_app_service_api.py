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
from openapi_client.api.data_processing_app_service_api import DataProcessingAppServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestDataProcessingAppServiceApi(unittest.TestCase):
    """DataProcessingAppServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.data_processing_app_service_api.DataProcessingAppServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_data_processing_app_service_run_data_processing_app(self):
        """Test case for data_processing_app_service_run_data_processing_app

        RunDataProcessingApp triggers jobs that are responsible to processing of received data.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
