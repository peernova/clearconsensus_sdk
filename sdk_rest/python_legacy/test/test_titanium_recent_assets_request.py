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
from openapi_client.models.titanium_recent_assets_request import TitaniumRecentAssetsRequest  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumRecentAssetsRequest(unittest.TestCase):
    """TitaniumRecentAssetsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumRecentAssetsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_recent_assets_request.TitaniumRecentAssetsRequest()  # noqa: E501
        if include_optional :
            return TitaniumRecentAssetsRequest(
                filter = '', 
                limit = openapi_client.models.use_for_customize_result_of_query_with_limit_of_returned_results.use for customize result of query with limit of returned results(
                    value = 56, ), 
                offset = 56, 
                order_by = openapi_client.models.used_to_identify_by_which_column_need_to_order_returned_results.used to identify by which column need to order returned results(
                    column = '', 
                    order = '', )
            )
        else :
            return TitaniumRecentAssetsRequest(
        )

    def testTitaniumRecentAssetsRequest(self):
        """Test TitaniumRecentAssetsRequest"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
