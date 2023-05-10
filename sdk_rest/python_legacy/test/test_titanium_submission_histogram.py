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
from openapi_client.models.titanium_submission_histogram import TitaniumSubmissionHistogram  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumSubmissionHistogram(unittest.TestCase):
    """TitaniumSubmissionHistogram unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumSubmissionHistogram
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_submission_histogram.TitaniumSubmissionHistogram()  # noqa: E501
        if include_optional :
            return TitaniumSubmissionHistogram(
                high_severity = openapi_client.models.predefined_filter_is_filter_that_added_to_the_system_to_use_it_later_for_filtration_in_analytics.PredefinedFilter is filter that added to the system to use it later for filtration in analytics(
                    key = '', 
                    operator = '', 
                    predefined_value_label = '', 
                    result_count = 56, 
                    value = openapi_client.models.value.value(), ), 
                low_severity = openapi_client.models.predefined_filter_is_filter_that_added_to_the_system_to_use_it_later_for_filtration_in_analytics.PredefinedFilter is filter that added to the system to use it later for filtration in analytics(
                    key = '', 
                    operator = '', 
                    predefined_value_label = '', 
                    result_count = 56, 
                    value = openapi_client.models.value.value(), ), 
                medium_severity = openapi_client.models.predefined_filter_is_filter_that_added_to_the_system_to_use_it_later_for_filtration_in_analytics.PredefinedFilter is filter that added to the system to use it later for filtration in analytics(
                    key = '', 
                    operator = '', 
                    predefined_value_label = '', 
                    result_count = 56, 
                    value = openapi_client.models.value.value(), ), 
                total_invalid_rows = 56, 
                total_parse_errors = 56, 
                total_rows = 56, 
                valid = openapi_client.models.predefined_filter_is_filter_that_added_to_the_system_to_use_it_later_for_filtration_in_analytics.PredefinedFilter is filter that added to the system to use it later for filtration in analytics(
                    key = '', 
                    operator = '', 
                    predefined_value_label = '', 
                    result_count = 56, 
                    value = openapi_client.models.value.value(), )
            )
        else :
            return TitaniumSubmissionHistogram(
        )

    def testTitaniumSubmissionHistogram(self):
        """Test TitaniumSubmissionHistogram"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
