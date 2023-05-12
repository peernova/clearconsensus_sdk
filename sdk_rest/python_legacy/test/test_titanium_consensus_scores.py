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
from openapi_client.models.titanium_consensus_scores import TitaniumConsensusScores  # noqa: E501
from openapi_client.rest import ApiException

class TestTitaniumConsensusScores(unittest.TestCase):
    """TitaniumConsensusScores unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TitaniumConsensusScores
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.titanium_consensus_scores.TitaniumConsensusScores()  # noqa: E501
        if include_optional :
            return TitaniumConsensusScores(
                consensus_density_score = openapi_client.models.titanium_consensus_density_score.titaniumConsensusDensityScore(
                    bimodality = openapi_client.models.bimodality.bimodality(), 
                    challenge_quality = openapi_client.models.challenge_quality.challengeQuality(), 
                    dispersion = openapi_client.models.dispersion.dispersion(), 
                    evp_alignment_score = openapi_client.models.evp_alignment_score.evpAlignmentScore(), 
                    evp_quality = openapi_client.models.evp_quality.evpQuality(), 
                    number_of_participants = '', 
                    outlier_volume = openapi_client.models.outlier_volume.outlierVolume(), 
                    score = openapi_client.models.score.score(), ), 
                evp_alignment_score = openapi_client.models.titanium_evp_alignment_score.titaniumEvpAlignmentScore(
                    evp_alignment_dispersion_score = openapi_client.models.evp_alignment_dispersion_score.evpAlignmentDispersionScore(), 
                    evp_mid = openapi_client.models.evp_mid.evpMid(), 
                    score = openapi_client.models.score.score(), 
                    score_status = '', 
                    submission_mean = openapi_client.models.submission_mean.submissionMean(), 
                    submission_std_dev = openapi_client.models.submission_std_dev.submissionStdDev(), ), 
                evp_quality_score = openapi_client.models.titanium_evp_quality_score.titaniumEvpQualityScore(
                    indicative_count = '', 
                    order_count = '', 
                    score = openapi_client.models.score.score(), 
                    trade_count = '', ), 
                expertise_score = openapi_client.models.titanium_expertise_score.titaniumExpertiseScore(
                    challenge_score = openapi_client.models.challenge_score.challengeScore(), 
                    consensus_distance_score = openapi_client.models.consensus_distance_score.consensusDistanceScore(), 
                    consensus_score = openapi_client.models.consensus_score.consensusScore(), 
                    dimension_credit_score = openapi_client.models.dimension_credit_score.dimensionCreditScore(), 
                    expertise_rank = openapi_client.models.expertise_rank.expertiseRank(), 
                    experts_count = openapi_client.models.experts_count.expertsCount(), 
                    proximity_to_post_challenge_consensus_mean = openapi_client.models.proximity_to_post_challenge_consensus_mean.proximityToPostChallengeConsensusMean(), 
                    score = openapi_client.models.score.score(), 
                    submitted_score = openapi_client.models.submitted_score.submittedScore(), )
            )
        else :
            return TitaniumConsensusScores(
        )

    def testTitaniumConsensusScores(self):
        """Test TitaniumConsensusScores"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()