# coding: utf-8

"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class TitaniumExpertiseScore(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'challenge_score': 'object',
        'consensus_distance_score': 'object',
        'consensus_score': 'object',
        'dimension_credit_score': 'object',
        'expertise_rank': 'object',
        'experts_count': 'object',
        'proximity_to_post_challenge_consensus_mean': 'object',
        'score': 'object',
        'submitted_score': 'object'
    }

    attribute_map = {
        'challenge_score': 'challengeScore',
        'consensus_distance_score': 'consensusDistanceScore',
        'consensus_score': 'consensusScore',
        'dimension_credit_score': 'dimensionCreditScore',
        'expertise_rank': 'expertiseRank',
        'experts_count': 'expertsCount',
        'proximity_to_post_challenge_consensus_mean': 'proximityToPostChallengeConsensusMean',
        'score': 'score',
        'submitted_score': 'submittedScore'
    }

    def __init__(self, challenge_score=None, consensus_distance_score=None, consensus_score=None, dimension_credit_score=None, expertise_rank=None, experts_count=None, proximity_to_post_challenge_consensus_mean=None, score=None, submitted_score=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumExpertiseScore - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._challenge_score = None
        self._consensus_distance_score = None
        self._consensus_score = None
        self._dimension_credit_score = None
        self._expertise_rank = None
        self._experts_count = None
        self._proximity_to_post_challenge_consensus_mean = None
        self._score = None
        self._submitted_score = None
        self.discriminator = None

        if challenge_score is not None:
            self.challenge_score = challenge_score
        if consensus_distance_score is not None:
            self.consensus_distance_score = consensus_distance_score
        if consensus_score is not None:
            self.consensus_score = consensus_score
        if dimension_credit_score is not None:
            self.dimension_credit_score = dimension_credit_score
        if expertise_rank is not None:
            self.expertise_rank = expertise_rank
        if experts_count is not None:
            self.experts_count = experts_count
        if proximity_to_post_challenge_consensus_mean is not None:
            self.proximity_to_post_challenge_consensus_mean = proximity_to_post_challenge_consensus_mean
        if score is not None:
            self.score = score
        if submitted_score is not None:
            self.submitted_score = submitted_score

    @property
    def challenge_score(self):
        """Gets the challenge_score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The challenge_score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._challenge_score

    @challenge_score.setter
    def challenge_score(self, challenge_score):
        """Sets the challenge_score of this TitaniumExpertiseScore.


        :param challenge_score: The challenge_score of this TitaniumExpertiseScore.  # noqa: E501
        :type challenge_score: object
        """

        self._challenge_score = challenge_score

    @property
    def consensus_distance_score(self):
        """Gets the consensus_distance_score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The consensus_distance_score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._consensus_distance_score

    @consensus_distance_score.setter
    def consensus_distance_score(self, consensus_distance_score):
        """Sets the consensus_distance_score of this TitaniumExpertiseScore.


        :param consensus_distance_score: The consensus_distance_score of this TitaniumExpertiseScore.  # noqa: E501
        :type consensus_distance_score: object
        """

        self._consensus_distance_score = consensus_distance_score

    @property
    def consensus_score(self):
        """Gets the consensus_score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The consensus_score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._consensus_score

    @consensus_score.setter
    def consensus_score(self, consensus_score):
        """Sets the consensus_score of this TitaniumExpertiseScore.


        :param consensus_score: The consensus_score of this TitaniumExpertiseScore.  # noqa: E501
        :type consensus_score: object
        """

        self._consensus_score = consensus_score

    @property
    def dimension_credit_score(self):
        """Gets the dimension_credit_score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The dimension_credit_score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._dimension_credit_score

    @dimension_credit_score.setter
    def dimension_credit_score(self, dimension_credit_score):
        """Sets the dimension_credit_score of this TitaniumExpertiseScore.


        :param dimension_credit_score: The dimension_credit_score of this TitaniumExpertiseScore.  # noqa: E501
        :type dimension_credit_score: object
        """

        self._dimension_credit_score = dimension_credit_score

    @property
    def expertise_rank(self):
        """Gets the expertise_rank of this TitaniumExpertiseScore.  # noqa: E501


        :return: The expertise_rank of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._expertise_rank

    @expertise_rank.setter
    def expertise_rank(self, expertise_rank):
        """Sets the expertise_rank of this TitaniumExpertiseScore.


        :param expertise_rank: The expertise_rank of this TitaniumExpertiseScore.  # noqa: E501
        :type expertise_rank: object
        """

        self._expertise_rank = expertise_rank

    @property
    def experts_count(self):
        """Gets the experts_count of this TitaniumExpertiseScore.  # noqa: E501


        :return: The experts_count of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._experts_count

    @experts_count.setter
    def experts_count(self, experts_count):
        """Sets the experts_count of this TitaniumExpertiseScore.


        :param experts_count: The experts_count of this TitaniumExpertiseScore.  # noqa: E501
        :type experts_count: object
        """

        self._experts_count = experts_count

    @property
    def proximity_to_post_challenge_consensus_mean(self):
        """Gets the proximity_to_post_challenge_consensus_mean of this TitaniumExpertiseScore.  # noqa: E501


        :return: The proximity_to_post_challenge_consensus_mean of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._proximity_to_post_challenge_consensus_mean

    @proximity_to_post_challenge_consensus_mean.setter
    def proximity_to_post_challenge_consensus_mean(self, proximity_to_post_challenge_consensus_mean):
        """Sets the proximity_to_post_challenge_consensus_mean of this TitaniumExpertiseScore.


        :param proximity_to_post_challenge_consensus_mean: The proximity_to_post_challenge_consensus_mean of this TitaniumExpertiseScore.  # noqa: E501
        :type proximity_to_post_challenge_consensus_mean: object
        """

        self._proximity_to_post_challenge_consensus_mean = proximity_to_post_challenge_consensus_mean

    @property
    def score(self):
        """Gets the score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this TitaniumExpertiseScore.


        :param score: The score of this TitaniumExpertiseScore.  # noqa: E501
        :type score: object
        """

        self._score = score

    @property
    def submitted_score(self):
        """Gets the submitted_score of this TitaniumExpertiseScore.  # noqa: E501


        :return: The submitted_score of this TitaniumExpertiseScore.  # noqa: E501
        :rtype: object
        """
        return self._submitted_score

    @submitted_score.setter
    def submitted_score(self, submitted_score):
        """Sets the submitted_score of this TitaniumExpertiseScore.


        :param submitted_score: The submitted_score of this TitaniumExpertiseScore.  # noqa: E501
        :type submitted_score: object
        """

        self._submitted_score = submitted_score

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TitaniumExpertiseScore):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumExpertiseScore):
            return True

        return self.to_dict() != other.to_dict()
