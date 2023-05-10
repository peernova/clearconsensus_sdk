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


class ProtobufAny(object):
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
        'type_url': 'str',
        'value': 'str'
    }

    attribute_map = {
        'type_url': 'typeUrl',
        'value': 'value'
    }

    def __init__(self, type_url=None, value=None, local_vars_configuration=None):  # noqa: E501
        """ProtobufAny - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._type_url = None
        self._value = None
        self.discriminator = None

        if type_url is not None:
            self.type_url = type_url
        if value is not None:
            self.value = value

    @property
    def type_url(self):
        """Gets the type_url of this ProtobufAny.  # noqa: E501


        :return: The type_url of this ProtobufAny.  # noqa: E501
        :rtype: str
        """
        return self._type_url

    @type_url.setter
    def type_url(self, type_url):
        """Sets the type_url of this ProtobufAny.


        :param type_url: The type_url of this ProtobufAny.  # noqa: E501
        :type type_url: str
        """

        self._type_url = type_url

    @property
    def value(self):
        """Gets the value of this ProtobufAny.  # noqa: E501


        :return: The value of this ProtobufAny.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this ProtobufAny.


        :param value: The value of this ProtobufAny.  # noqa: E501
        :type value: str
        """

        self._value = value

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
        if not isinstance(other, ProtobufAny):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ProtobufAny):
            return True

        return self.to_dict() != other.to_dict()
