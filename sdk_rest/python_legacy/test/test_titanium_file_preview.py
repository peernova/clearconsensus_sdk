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
from openapi_client.models.titanium_file_preview import TitaniumFilePreview  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumFilePreview(unittest.TestCase):
    """TitaniumFilePreview unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumFilePreview
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_file_preview.TitaniumFilePreview()  # noqa: E501
        if include_optional :
            return TitaniumFilePreview(
                delimiter_setting = openapi_client.models.titanium_file_delimiter_setting.titaniumFileDelimiterSetting(
                    delimiter = '', 
                    encapsulating_char = '', ), 
                descriptor_definition = openapi_client.models.titanium_descriptor_definition.titaniumDescriptorDefinition(
                    fields = [
                        openapi_client.models.definition_of_descriptor_field.definition of descriptor field(
                            alias = '', 
                            name = '', 
                            nullable = True, 
                            options = openapi_client.models.options.options(), 
                            type = '', )
                        ], 
                    name = '', 
                    options = openapi_client.models.options.options(), 
                    scope = '', ), 
                rows = [
                    None
                    ]
            )
        else :
            return TitaniumFilePreview(
        )

    def testTitaniumFilePreview(self):
        """Test TitaniumFilePreview"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
