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
from openapi_client.api.descriptor_service_api import DescriptorServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestDescriptorServiceApi(unittest.TestCase):
    """DescriptorServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.descriptor_service_api.DescriptorServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_descriptor_service_add_descriptor(self):
        """Test case for descriptor_service_add_descriptor

        AddDescriptor is used to add specific descriptor with specific definition to the system. Regular users can store a descriptor within their own scope, and any attempts to push it to a different scope will be declined. Back office users can store descriptors in any scope, provided that a scope key is provided. The name of the descriptor must match the name of the asset class to be mapped correctly. If a descriptor with the same name already exists, it will be updated.  # noqa: E501
        """
        pass

    def test_descriptor_service_disable_descriptor(self):
        """Test case for descriptor_service_disable_descriptor

        DisableDescriptor is used to disable specific descriptor. Example of response : {    \"data\": {        \"uid\": \"\",        \"name\": \"foreign_exchange-vanilla-forwards\"    } }  # noqa: E501
        """
        pass

    def test_descriptor_service_enable_descriptor(self):
        """Test case for descriptor_service_enable_descriptor

        EnableDescriptor is used to enable specific descriptor.  # noqa: E501
        """
        pass

    def test_descriptor_service_get_descriptor(self):
        """Test case for descriptor_service_get_descriptor

        GetDescriptor is used to get specific descriptor definition based on get definition. Regular users can retrieve only their own descriptors and descriptors associated with asset classes. Back office users can retrieve any of the existing descriptors.  # noqa: E501
        """
        pass

    def test_descriptor_service_get_descriptor_version(self):
        """Test case for descriptor_service_get_descriptor_version

        GetDescriptorVersion returns current version of the specific descriptor.  # noqa: E501
        """
        pass

    def test_descriptor_service_list_descriptor_versions(self):
        """Test case for descriptor_service_list_descriptor_versions

        ListDescriptorVersions returns list of version of the specific descriptor versions.  # noqa: E501
        """
        pass

    def test_descriptor_service_list_descriptors(self):
        """Test case for descriptor_service_list_descriptors

        ListDescriptors returns list of specific descriptors according to request.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
