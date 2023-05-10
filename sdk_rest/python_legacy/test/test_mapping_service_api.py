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
from openapi_client.api.mapping_service_api import MappingServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestMappingServiceApi(unittest.TestCase):
    """MappingServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.mapping_service_api.MappingServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_mapping_service_add_mapping_rule(self):
        """Test case for mapping_service_add_mapping_rule

        AddMappingRule AddMappingRule is an API used to add a specific mapping rule to the system. The name provided for the mapping rule must match the asset class and descriptor names. If a mapping rule with the same name already exists, it will be updated. This API accepts a MappingRuleDefinition object as its parameter,which includes information about the mapping rule being added. The response from this API is a DescriptorPairBasedAcknowledgeResponse,which acknowledges the addition of the mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_disable_mapping_rule(self):
        """Test case for mapping_service_disable_mapping_rule

        DisableMappingRule is used to disable a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a DescriptorPairBasedAcknowledgeResponse, which acknowledges the disablement of the mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_enable_mapping_rule(self):
        """Test case for mapping_service_enable_mapping_rule

        EnableMappingRule is used to enable a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a DescriptorPairBasedAcknowledgeResponse, which acknowledges the enablement of the mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_get_mapping_rule(self):
        """Test case for mapping_service_get_mapping_rule

        GetMappingRule is used to retrieve a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a MappingRuleResponse, which includes information about the retrieved mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_get_mapping_rule_version(self):
        """Test case for mapping_service_get_mapping_rule_version

        GetMappingRuleVersion is used to retrieve a specific version of a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedVersionRequest object as its parameter, which includes the scope, source descriptor, destination descriptor, and version ID for the mapping rule. The response from it is a MappingRuleResponse, which includes information about the retrieved version of the mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_list_mapping_rule_versions(self):
        """Test case for mapping_service_list_mapping_rule_versions

        ListMappingRuleVersions is used to retrieve a list of all versions of a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a ListVersionResponse, which includes information about all versions of the mapping rule.  # noqa: E501
        """
        pass

    def test_mapping_service_list_mapping_rules(self):
        """Test case for mapping_service_list_mapping_rules

        ListMappingRules is used to retrieve a list of all mapping rules in the system. It accepts a ListRequest object as its parameter, which includes optional parameters for filtering the results. The response from this it is a MappingRuleList, which includes information about all mapping rules in the system that match the provided filter parameters.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
