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


class TitaniumChallengeDecisionRequest(object):
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
        'asset_id': 'str',
        'challenge_id': 'str',
        'decision': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'challenge_id': 'challengeId',
        'decision': 'decision'
    }

    def __init__(self, asset_id=None, challenge_id=None, decision=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumChallengeDecisionRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._challenge_id = None
        self._decision = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if challenge_id is not None:
            self.challenge_id = challenge_id
        if decision is not None:
            self.decision = decision

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumChallengeDecisionRequest.  # noqa: E501


        :return: The asset_id of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumChallengeDecisionRequest.


        :param asset_id: The asset_id of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def challenge_id(self):
        """Gets the challenge_id of this TitaniumChallengeDecisionRequest.  # noqa: E501


        :return: The challenge_id of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :rtype: str
        """
        return self._challenge_id

    @challenge_id.setter
    def challenge_id(self, challenge_id):
        """Sets the challenge_id of this TitaniumChallengeDecisionRequest.


        :param challenge_id: The challenge_id of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :type challenge_id: str
        """

        self._challenge_id = challenge_id

    @property
    def decision(self):
        """Gets the decision of this TitaniumChallengeDecisionRequest.  # noqa: E501


        :return: The decision of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :rtype: str
        """
        return self._decision

    @decision.setter
    def decision(self, decision):
        """Sets the decision of this TitaniumChallengeDecisionRequest.


        :param decision: The decision of this TitaniumChallengeDecisionRequest.  # noqa: E501
        :type decision: str
        """

        self._decision = decision

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
        if not isinstance(other, TitaniumChallengeDecisionRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumChallengeDecisionRequest):
            return True

        return self.to_dict() != other.to_dict()
