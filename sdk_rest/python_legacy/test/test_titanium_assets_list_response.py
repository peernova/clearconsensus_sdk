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
from openapi_client.models.titanium_assets_list_response import TitaniumAssetsListResponse  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumAssetsListResponse(unittest.TestCase):
    """TitaniumAssetsListResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumAssetsListResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_assets_list_response.TitaniumAssetsListResponse()  # noqa: E501
        if include_optional :
            return TitaniumAssetsListResponse(
                data = openapi_client.models.assets_list_is_representation_of_list_of_assets.AssetsList is representation of list of assets(
                    assets = [
                        openapi_client.models.titanium_asset.titaniumAsset(
                            name = '', 
                            services = [
                                openapi_client.models.titanium_service.titaniumService(
                                    name = '', 
                                    sub_assets = [
                                        openapi_client.models.titanium_sub_asset.titaniumSubAsset(
                                            id = '', 
                                            name = '', 
                                            trace_name = '', )
                                        ], )
                                ], )
                        ], ), 
                error = openapi_client.models.titanium_error.titaniumError(
                    code = 56, 
                    message = '', )
            )
        else :
            return TitaniumAssetsListResponse(
        )

    def testTitaniumAssetsListResponse(self):
        """Test TitaniumAssetsListResponse"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
