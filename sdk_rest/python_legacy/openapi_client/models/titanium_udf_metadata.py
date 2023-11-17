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


class TitaniumUdfMetadata(object):
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
        'args': 'list[str]',
        'column_types': 'list[str]',
        'detail_column_types': 'list[str]',
        'name': 'str',
        'output': 'str',
        'type': 'str'
    }

    attribute_map = {
        'args': 'args',
        'column_types': 'columnTypes',
        'detail_column_types': 'detailColumnTypes',
        'name': 'name',
        'output': 'output',
        'type': 'type'
    }

    def __init__(self, args=None, column_types=None, detail_column_types=None, name=None, output=None, type=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumUdfMetadata - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._args = None
        self._column_types = None
        self._detail_column_types = None
        self._name = None
        self._output = None
        self._type = None
        self.discriminator = None

        if args is not None:
            self.args = args
        if column_types is not None:
            self.column_types = column_types
        if detail_column_types is not None:
            self.detail_column_types = detail_column_types
        if name is not None:
            self.name = name
        if output is not None:
            self.output = output
        if type is not None:
            self.type = type

    @property
    def args(self):
        """Gets the args of this TitaniumUdfMetadata.  # noqa: E501


        :return: The args of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: list[str]
        """
        return self._args

    @args.setter
    def args(self, args):
        """Sets the args of this TitaniumUdfMetadata.


        :param args: The args of this TitaniumUdfMetadata.  # noqa: E501
        :type args: list[str]
        """

        self._args = args

    @property
    def column_types(self):
        """Gets the column_types of this TitaniumUdfMetadata.  # noqa: E501


        :return: The column_types of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: list[str]
        """
        return self._column_types

    @column_types.setter
    def column_types(self, column_types):
        """Sets the column_types of this TitaniumUdfMetadata.


        :param column_types: The column_types of this TitaniumUdfMetadata.  # noqa: E501
        :type column_types: list[str]
        """

        self._column_types = column_types

    @property
    def detail_column_types(self):
        """Gets the detail_column_types of this TitaniumUdfMetadata.  # noqa: E501


        :return: The detail_column_types of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: list[str]
        """
        return self._detail_column_types

    @detail_column_types.setter
    def detail_column_types(self, detail_column_types):
        """Sets the detail_column_types of this TitaniumUdfMetadata.


        :param detail_column_types: The detail_column_types of this TitaniumUdfMetadata.  # noqa: E501
        :type detail_column_types: list[str]
        """

        self._detail_column_types = detail_column_types

    @property
    def name(self):
        """Gets the name of this TitaniumUdfMetadata.  # noqa: E501


        :return: The name of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TitaniumUdfMetadata.


        :param name: The name of this TitaniumUdfMetadata.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def output(self):
        """Gets the output of this TitaniumUdfMetadata.  # noqa: E501


        :return: The output of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: str
        """
        return self._output

    @output.setter
    def output(self, output):
        """Sets the output of this TitaniumUdfMetadata.


        :param output: The output of this TitaniumUdfMetadata.  # noqa: E501
        :type output: str
        """

        self._output = output

    @property
    def type(self):
        """Gets the type of this TitaniumUdfMetadata.  # noqa: E501


        :return: The type of this TitaniumUdfMetadata.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this TitaniumUdfMetadata.


        :param type: The type of this TitaniumUdfMetadata.  # noqa: E501
        :type type: str
        """

        self._type = type

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
        if not isinstance(other, TitaniumUdfMetadata):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumUdfMetadata):
            return True

        return self.to_dict() != other.to_dict()
