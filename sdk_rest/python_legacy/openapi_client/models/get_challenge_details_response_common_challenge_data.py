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


class GetChallengeDetailsResponseCommonChallengeData(object):
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
        'date': 'str',
        'evidence_type': 'str',
        'time': 'str'
    }

    attribute_map = {
        'date': 'date',
        'evidence_type': 'evidenceType',
        'time': 'time'
    }

    def __init__(self, date=None, evidence_type=None, time=None, local_vars_configuration=None):  # noqa: E501
        """GetChallengeDetailsResponseCommonChallengeData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._date = None
        self._evidence_type = None
        self._time = None
        self.discriminator = None

        if date is not None:
            self.date = date
        if evidence_type is not None:
            self.evidence_type = evidence_type
        if time is not None:
            self.time = time

    @property
    def date(self):
        """Gets the date of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501


        :return: The date of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :rtype: str
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this GetChallengeDetailsResponseCommonChallengeData.


        :param date: The date of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :type date: str
        """

        self._date = date

    @property
    def evidence_type(self):
        """Gets the evidence_type of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501


        :return: The evidence_type of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :rtype: str
        """
        return self._evidence_type

    @evidence_type.setter
    def evidence_type(self, evidence_type):
        """Sets the evidence_type of this GetChallengeDetailsResponseCommonChallengeData.


        :param evidence_type: The evidence_type of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :type evidence_type: str
        """

        self._evidence_type = evidence_type

    @property
    def time(self):
        """Gets the time of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501


        :return: The time of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :rtype: str
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this GetChallengeDetailsResponseCommonChallengeData.


        :param time: The time of this GetChallengeDetailsResponseCommonChallengeData.  # noqa: E501
        :type time: str
        """

        self._time = time

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
        if not isinstance(other, GetChallengeDetailsResponseCommonChallengeData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GetChallengeDetailsResponseCommonChallengeData):
            return True

        return self.to_dict() != other.to_dict()