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


class TitaniumChallengeFreezeActionRequest(object):
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
        'action': 'str',
        'consensus_run_id': 'str'
    }

    attribute_map = {
        'action': 'action',
        'consensus_run_id': 'consensusRunId'
    }

    def __init__(self, action=None, consensus_run_id=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumChallengeFreezeActionRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._action = None
        self._consensus_run_id = None
        self.discriminator = None

        if action is not None:
            self.action = action
        if consensus_run_id is not None:
            self.consensus_run_id = consensus_run_id

    @property
    def action(self):
        """Gets the action of this TitaniumChallengeFreezeActionRequest.  # noqa: E501


        :return: The action of this TitaniumChallengeFreezeActionRequest.  # noqa: E501
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """Sets the action of this TitaniumChallengeFreezeActionRequest.


        :param action: The action of this TitaniumChallengeFreezeActionRequest.  # noqa: E501
        :type action: str
        """

        self._action = action

    @property
    def consensus_run_id(self):
        """Gets the consensus_run_id of this TitaniumChallengeFreezeActionRequest.  # noqa: E501


        :return: The consensus_run_id of this TitaniumChallengeFreezeActionRequest.  # noqa: E501
        :rtype: str
        """
        return self._consensus_run_id

    @consensus_run_id.setter
    def consensus_run_id(self, consensus_run_id):
        """Sets the consensus_run_id of this TitaniumChallengeFreezeActionRequest.


        :param consensus_run_id: The consensus_run_id of this TitaniumChallengeFreezeActionRequest.  # noqa: E501
        :type consensus_run_id: str
        """

        self._consensus_run_id = consensus_run_id

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
        if not isinstance(other, TitaniumChallengeFreezeActionRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumChallengeFreezeActionRequest):
            return True

        return self.to_dict() != other.to_dict()
