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
from openapi_client.models.titanium_user_notifications import TitaniumUserNotifications  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumUserNotifications(unittest.TestCase):
    """TitaniumUserNotifications unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumUserNotifications
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_user_notifications.TitaniumUserNotifications()  # noqa: E501
        if include_optional :
            return TitaniumUserNotifications(
                user_notification = [
                    openapi_client.models.titanium_user_notification.titaniumUserNotification(
                        asset = openapi_client.models.titanium_asset_m.titaniumAssetM(
                            id = '', 
                            instrument_types = [
                                ''
                                ], 
                            name = '', ), 
                        id = '', 
                        market = openapi_client.models.titanium_market.titaniumMarket(
                            id = '', 
                            name = '', 
                            user = openapi_client.models.titanium_user.titaniumUser(
                                email = '', 
                                id = '', 
                                notify_by_app_enabled = True, 
                                notify_by_email_enabled = True, 
                                organization = '', ), ), 
                        type = '', 
                        user = openapi_client.models.titanium_user.titaniumUser(
                            email = '', 
                            id = '', 
                            notify_by_app_enabled = True, 
                            notify_by_email_enabled = True, 
                            organization = '', ), 
                        value = '', )
                    ]
            )
        else :
            return TitaniumUserNotifications(
        )

    def testTitaniumUserNotifications(self):
        """Test TitaniumUserNotifications"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
