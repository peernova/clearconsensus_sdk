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


class TitaniumSetFileDelimiterRequest(object):
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
        'delimiter_setting': 'TitaniumFileDelimiterSetting',
        'file_identifier': 'TitaniumFileIdentifier'
    }

    attribute_map = {
        'delimiter_setting': 'delimiterSetting',
        'file_identifier': 'fileIdentifier'
    }

    def __init__(self, delimiter_setting=None, file_identifier=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumSetFileDelimiterRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._delimiter_setting = None
        self._file_identifier = None
        self.discriminator = None

        if delimiter_setting is not None:
            self.delimiter_setting = delimiter_setting
        if file_identifier is not None:
            self.file_identifier = file_identifier

    @property
    def delimiter_setting(self):
        """Gets the delimiter_setting of this TitaniumSetFileDelimiterRequest.  # noqa: E501


        :return: The delimiter_setting of this TitaniumSetFileDelimiterRequest.  # noqa: E501
        :rtype: TitaniumFileDelimiterSetting
        """
        return self._delimiter_setting

    @delimiter_setting.setter
    def delimiter_setting(self, delimiter_setting):
        """Sets the delimiter_setting of this TitaniumSetFileDelimiterRequest.


        :param delimiter_setting: The delimiter_setting of this TitaniumSetFileDelimiterRequest.  # noqa: E501
        :type delimiter_setting: TitaniumFileDelimiterSetting
        """

        self._delimiter_setting = delimiter_setting

    @property
    def file_identifier(self):
        """Gets the file_identifier of this TitaniumSetFileDelimiterRequest.  # noqa: E501


        :return: The file_identifier of this TitaniumSetFileDelimiterRequest.  # noqa: E501
        :rtype: TitaniumFileIdentifier
        """
        return self._file_identifier

    @file_identifier.setter
    def file_identifier(self, file_identifier):
        """Sets the file_identifier of this TitaniumSetFileDelimiterRequest.


        :param file_identifier: The file_identifier of this TitaniumSetFileDelimiterRequest.  # noqa: E501
        :type file_identifier: TitaniumFileIdentifier
        """

        self._file_identifier = file_identifier

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
        if not isinstance(other, TitaniumSetFileDelimiterRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumSetFileDelimiterRequest):
            return True

        return self.to_dict() != other.to_dict()
