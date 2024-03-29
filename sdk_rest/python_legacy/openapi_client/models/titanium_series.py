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


class TitaniumSeries(object):
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
        'content_type': 'str',
        'data': 'list[object]',
        'metadata': 'TitaniumMetadata',
        'name': 'str'
    }

    attribute_map = {
        'content_type': 'contentType',
        'data': 'data',
        'metadata': 'metadata',
        'name': 'name'
    }

    def __init__(self, content_type=None, data=None, metadata=None, name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumSeries - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._content_type = None
        self._data = None
        self._metadata = None
        self._name = None
        self.discriminator = None

        if content_type is not None:
            self.content_type = content_type
        if data is not None:
            self.data = data
        if metadata is not None:
            self.metadata = metadata
        if name is not None:
            self.name = name

    @property
    def content_type(self):
        """Gets the content_type of this TitaniumSeries.  # noqa: E501


        :return: The content_type of this TitaniumSeries.  # noqa: E501
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """Sets the content_type of this TitaniumSeries.


        :param content_type: The content_type of this TitaniumSeries.  # noqa: E501
        :type content_type: str
        """

        self._content_type = content_type

    @property
    def data(self):
        """Gets the data of this TitaniumSeries.  # noqa: E501


        :return: The data of this TitaniumSeries.  # noqa: E501
        :rtype: list[object]
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this TitaniumSeries.


        :param data: The data of this TitaniumSeries.  # noqa: E501
        :type data: list[object]
        """

        self._data = data

    @property
    def metadata(self):
        """Gets the metadata of this TitaniumSeries.  # noqa: E501


        :return: The metadata of this TitaniumSeries.  # noqa: E501
        :rtype: TitaniumMetadata
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this TitaniumSeries.


        :param metadata: The metadata of this TitaniumSeries.  # noqa: E501
        :type metadata: TitaniumMetadata
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this TitaniumSeries.  # noqa: E501


        :return: The name of this TitaniumSeries.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TitaniumSeries.


        :param name: The name of this TitaniumSeries.  # noqa: E501
        :type name: str
        """

        self._name = name

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
        if not isinstance(other, TitaniumSeries):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumSeries):
            return True

        return self.to_dict() != other.to_dict()
