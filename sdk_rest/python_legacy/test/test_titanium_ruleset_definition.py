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
from openapi_client.models.titanium_ruleset_definition import TitaniumRulesetDefinition  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumRulesetDefinition(unittest.TestCase):
    """TitaniumRulesetDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumRulesetDefinition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_ruleset_definition.TitaniumRulesetDefinition()  # noqa: E501
        if include_optional :
            return TitaniumRulesetDefinition(
                criteria = [
                    openapi_client.models.titanium_criteria_definition.titaniumCriteriaDefinition(
                        description = '', 
                        metadata = [
                            ''
                            ], 
                        name = '', 
                        rule = '', 
                        tags = [
                            ''
                            ], 
                        validations = [
                            openapi_client.models.titanium_rule_definition.titaniumRuleDefinition(
                                description = '', 
                                error = openapi_client.models.titanium_error_definition.titaniumErrorDefinition(
                                    message = '', 
                                    message_args = [
                                        ''
                                        ], ), 
                                filter = '', 
                                lookuptable = openapi_client.models.titanium_dynamic_lut.titaniumDynamicLut(
                                    filter = '', 
                                    key = [
                                        ''
                                        ], 
                                    type = '', 
                                    value = '', ), 
                                name = '', 
                                rule = '', 
                                rule_type = '', 
                                severity = 56, )
                            ], )
                    ], 
                descriptor_name = ''
            )
        else :
            return TitaniumRulesetDefinition(
        )

    def testTitaniumRulesetDefinition(self):
        """Test TitaniumRulesetDefinition"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
