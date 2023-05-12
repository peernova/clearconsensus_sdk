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
from openapi_client.models.titanium_get_file_export_url_request import TitaniumGetFileExportUrlRequest  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumGetFileExportUrlRequest(unittest.TestCase):
    """TitaniumGetFileExportUrlRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumGetFileExportUrlRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_get_file_export_url_request.TitaniumGetFileExportUrlRequest()  # noqa: E501
        if include_optional :
            return TitaniumGetFileExportUrlRequest(
                export_type = '', 
                submitted_date = '', 
                submitted_id = ''
            )
        else :
            return TitaniumGetFileExportUrlRequest(
        )

    def testTitaniumGetFileExportUrlRequest(self):
        """Test TitaniumGetFileExportUrlRequest"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()