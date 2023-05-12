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
from openapi_client.models.titanium_charts_response_data import TitaniumChartsResponseData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumChartsResponseData(unittest.TestCase):
    """TitaniumChartsResponseData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumChartsResponseData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_charts_response_data.TitaniumChartsResponseData()  # noqa: E501
        if include_optional :
            return TitaniumChartsResponseData(
                benchmark = [
                    openapi_client.models.titanium_benchmark_metadata.titaniumBenchmarkMetadata(
                        reason = '', 
                        tenor = '', )
                    ], 
                chart_sources = [
                    openapi_client.models.titanium_chart_source.titaniumChartSource(
                        charts = [
                            openapi_client.models.titanium_chart.titaniumChart(
                                name = '', 
                                points = [
                                    openapi_client.models.chart_point_is_representation_of_chart_point(tenor_and_value)_(tenor_refers_to_the_time_to_maturity_of_a_loan_or_other_financial_contract).ChartPoint is representation of chart point(tenor and value) (Tenor refers to the time-to-maturity of a loan or other financial contract)(
                                        tenor = '', 
                                        value = 1.337, )
                                    ], )
                            ], 
                        name = '', )
                    ], 
                outliers = [
                    openapi_client.models.titanium_outlier_metadata.titaniumOutlierMetadata(
                        reason = '', 
                        tenor = '', )
                    ], 
                tenors = [
                    ''
                    ]
            )
        else :
            return TitaniumChartsResponseData(
        )

    def testTitaniumChartsResponseData(self):
        """Test TitaniumChartsResponseData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()