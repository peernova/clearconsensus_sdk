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
from openapi_client.api.user_service_api import UserServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestUserServiceApi(unittest.TestCase):
    """UserServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.user_service_api.UserServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_user_service_add_user_notification(self):
        """Test case for user_service_add_user_notification

        """
        pass

    def test_user_service_delete_user_notification(self):
        """Test case for user_service_delete_user_notification

        """
        pass

    def test_user_service_get_user(self):
        """Test case for user_service_get_user

        """
        pass

    def test_user_service_get_user_notifications(self):
        """Test case for user_service_get_user_notifications

        """
        pass

    def test_user_service_get_user_notifications_by_market(self):
        """Test case for user_service_get_user_notifications_by_market

        """
        pass

    def test_user_service_get_user_permissions(self):
        """Test case for user_service_get_user_permissions

        """
        pass

    def test_user_service_update_user_notification(self):
        """Test case for user_service_update_user_notification

        """
        pass


if __name__ == '__main__':
    unittest.main()