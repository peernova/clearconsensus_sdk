"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import unittest

import openapi_client
from openapi_client.api.data_service_api import DataServiceApi  # noqa: E501


class TestDataServiceApi(unittest.TestCase):
    """DataServiceApi unit test stubs"""

    def setUp(self):
        self.api = DataServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_data_service_export(self):
        """Test case for data_service_export

        Export exports data according to the request.  # noqa: E501
        """
        pass

    def test_data_service_submitted(self):
        """Test case for data_service_submitted

        Submitted returns submitted data based on the request made.  # noqa: E501
        """
        pass

    def test_data_service_upload_url(self):
        """Test case for data_service_upload_url

        UploadURL returns a pre-signed S3 URL for uploading data.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
