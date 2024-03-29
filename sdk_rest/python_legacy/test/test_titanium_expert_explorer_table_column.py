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
from openapi_client.models.titanium_expert_explorer_table_column import TitaniumExpertExplorerTableColumn  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumExpertExplorerTableColumn(unittest.TestCase):
    """TitaniumExpertExplorerTableColumn unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumExpertExplorerTableColumn
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_expert_explorer_table_column.TitaniumExpertExplorerTableColumn()  # noqa: E501
        if include_optional :
            return TitaniumExpertExplorerTableColumn(
                abs_diff_from_expert_cohort_mean = openapi_client.models.abs_diff_from_expert_cohort_mean.absDiffFromExpertCohortMean(), 
                max = openapi_client.models.max.max(), 
                mean = openapi_client.models.mean.mean(), 
                min = openapi_client.models.min.min(), 
                participant_instruments_count = '', 
                std_dev = openapi_client.models.std_dev.stdDev(), 
                sub_price_diff = openapi_client.models.sub_price_diff.subPriceDiff()
            )
        else :
            return TitaniumExpertExplorerTableColumn(
        )

    def testTitaniumExpertExplorerTableColumn(self):
        """Test TitaniumExpertExplorerTableColumn"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
