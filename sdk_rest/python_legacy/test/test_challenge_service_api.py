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
from openapi_client.api.challenge_service_api import ChallengeServiceApi  # noqa: E501
from openapi_client.rest import ApiException


class TestChallengeServiceApi(unittest.TestCase):
    """ChallengeServiceApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.challenge_service_api.ChallengeServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_challenge_service_challenge_create(self):
        """Test case for challenge_service_challenge_create

        ChallengeCreate creates challenge in the system.(Initiate process by dealer) To create \"challenger\" needs to be authorised and challenge can be created only if one of their own submitted data points has been declared an outlier in the published Consensus. Need to specify asset and fill out evidence information. Returns response that contains ticket ID of the Challenge or the Error.  # noqa: E501
        """
        pass

    def test_challenge_service_challenge_form_meta(self):
        """Test case for challenge_service_challenge_form_meta

        ChallengeFormMeta is used to request information(template) about the form fields required to submit a challenge for a specific asset and evidence type. Returns response with template with pre-filled data.  # noqa: E501
        """
        pass

    def test_challenge_service_challenge_freeze_status(self):
        """Test case for challenge_service_challenge_freeze_status

        ChallengeFreezeStatus returns StatusResponse that contains string that represents freeze status of challenges if the challenge process is stopped and nothing if the one is not. Challenge can be stopped by operator.Dealer can see the freeze status using this method. Need to specify consensus(where outliers exists) run timestamp.  # noqa: E501
        """
        pass

    def test_challenge_service_get_challenge_attachment_upload_url(self):
        """Test case for challenge_service_get_challenge_attachment_upload_url

        GetChallengeAttachmentUploadUrl returns string that represents s3 URL that can be used to upload attachment for the challenge. The file in attachment can be any file that provides additional information about the disputable outlier. Need to specify asset ID, submitted ID and file name.  # noqa: E501
        """
        pass

    def test_challenge_service_get_challenge_details(self):
        """Test case for challenge_service_get_challenge_details

        """
        pass


if __name__ == '__main__':
    unittest.main()
