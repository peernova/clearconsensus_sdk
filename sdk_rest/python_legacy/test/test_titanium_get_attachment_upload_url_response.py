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
from openapi_client.models.titanium_get_attachment_upload_url_response import TitaniumGetAttachmentUploadUrlResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumGetAttachmentUploadUrlResponse(unittest.TestCase):
    """TitaniumGetAttachmentUploadUrlResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumGetAttachmentUploadUrlResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_get_attachment_upload_url_response.TitaniumGetAttachmentUploadUrlResponse()  # noqa: E501
        if include_optional :
            return TitaniumGetAttachmentUploadUrlResponse(
                data = openapi_client.models.get_attachment_upload_url_response_attachment_upload_url.GetAttachmentUploadUrlResponseAttachmentUploadUrl(
                    attachment_id = '', 
                    file_name = '', 
                    upload_url = '', ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumGetAttachmentUploadUrlResponse(
        )

    def testTitaniumGetAttachmentUploadUrlResponse(self):
        """Test TitaniumGetAttachmentUploadUrlResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
