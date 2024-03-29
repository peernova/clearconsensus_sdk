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
from openapi_client.models.titanium_export_request import TitaniumExportRequest  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumExportRequest(unittest.TestCase):
    """TitaniumExportRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumExportRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_export_request.TitaniumExportRequest()  # noqa: E501
        if include_optional :
            return TitaniumExportRequest(
                asset_id = '', 
                consensus_run_timestamp = '', 
                filter_pack = openapi_client.models.titanium_filter_pack.titaniumFilterPack(
                    filter_packs = [
                        openapi_client.models.titanium_filter_pack.titaniumFilterPack(
                            filters = [
                                openapi_client.models.filter_is_used_to_customize_query_for_getting_some_data.Filter is used to customize query for getting some data(
                                    key = '', 
                                    operator = '', 
                                    value = openapi_client.models.value.value(), )
                                ], 
                            logical_operation = '', )
                        ], 
                    filters = [
                        openapi_client.models.filter_is_used_to_customize_query_for_getting_some_data.Filter is used to customize query for getting some data(
                            key = '', 
                            operator = '', 
                            value = openapi_client.models.value.value(), )
                        ], 
                    logical_operation = '', ), 
                include_header = True, 
                order_by = openapi_client.models.used_to_identify_by_which_column_need_to_order_returned_results.used to identify by which column need to order returned results(
                    column = '', 
                    order = '', ), 
                submission_date = '', 
                trace_name = ''
            )
        else :
            return TitaniumExportRequest(
        )

    def testTitaniumExportRequest(self):
        """Test TitaniumExportRequest"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
