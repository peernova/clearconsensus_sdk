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
from openapi_client.models.proto_column_definition import ProtoColumnDefinition  # noqa: E501
from openapi_client.rest import ApiException

class TestProtoColumnDefinition(unittest.TestCase):
    """ProtoColumnDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ProtoColumnDefinition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.proto_column_definition.ProtoColumnDefinition()  # noqa: E501
        if include_optional :
            return ProtoColumnDefinition(
                column_db_type = '', 
                column_name = '', 
                column_type = '', 
                raw_column_name = ''
            )
        else :
            return ProtoColumnDefinition(
        )

    def testProtoColumnDefinition(self):
        """Test ProtoColumnDefinition"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
