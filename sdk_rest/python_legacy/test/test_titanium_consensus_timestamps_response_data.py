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
from openapi_client.models.titanium_consensus_timestamps_response_data import TitaniumConsensusTimestampsResponseData  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumConsensusTimestampsResponseData(unittest.TestCase):
    """TitaniumConsensusTimestampsResponseData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumConsensusTimestampsResponseData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_consensus_timestamps_response_data.TitaniumConsensusTimestampsResponseData()  # noqa: E501
        if include_optional :
            return TitaniumConsensusTimestampsResponseData(
                timestamps = [
                    openapi_client.models.titanium_consensus_timestamp_meta.titaniumConsensusTimestampMeta(
                        consensus_run_timestamp = '', 
                        submitted_dates = [
                            ''
                            ], )
                    ]
            )
        else :
            return TitaniumConsensusTimestampsResponseData(
        )

    def testTitaniumConsensusTimestampsResponseData(self):
        """Test TitaniumConsensusTimestampsResponseData"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
