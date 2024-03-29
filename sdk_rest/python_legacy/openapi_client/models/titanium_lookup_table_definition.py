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


class TitaniumLookupTableDefinition(object):
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
        'fields': 'list[TitaniumLutField]',
        'name': 'str',
        'rows': 'list[TitaniumLutEntry]',
        'total_records': 'int',
        'type': 'str'
    }

    attribute_map = {
        'fields': 'fields',
        'name': 'name',
        'rows': 'rows',
        'total_records': 'totalRecords',
        'type': 'type'
    }

    def __init__(self, fields=None, name=None, rows=None, total_records=None, type=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumLookupTableDefinition - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._fields = None
        self._name = None
        self._rows = None
        self._total_records = None
        self._type = None
        self.discriminator = None

        if fields is not None:
            self.fields = fields
        if name is not None:
            self.name = name
        if rows is not None:
            self.rows = rows
        if total_records is not None:
            self.total_records = total_records
        if type is not None:
            self.type = type

    @property
    def fields(self):
        """Gets the fields of this TitaniumLookupTableDefinition.  # noqa: E501


        :return: The fields of this TitaniumLookupTableDefinition.  # noqa: E501
        :rtype: list[TitaniumLutField]
        """
        return self._fields

    @fields.setter
    def fields(self, fields):
        """Sets the fields of this TitaniumLookupTableDefinition.


        :param fields: The fields of this TitaniumLookupTableDefinition.  # noqa: E501
        :type fields: list[TitaniumLutField]
        """

        self._fields = fields

    @property
    def name(self):
        """Gets the name of this TitaniumLookupTableDefinition.  # noqa: E501


        :return: The name of this TitaniumLookupTableDefinition.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TitaniumLookupTableDefinition.


        :param name: The name of this TitaniumLookupTableDefinition.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def rows(self):
        """Gets the rows of this TitaniumLookupTableDefinition.  # noqa: E501


        :return: The rows of this TitaniumLookupTableDefinition.  # noqa: E501
        :rtype: list[TitaniumLutEntry]
        """
        return self._rows

    @rows.setter
    def rows(self, rows):
        """Sets the rows of this TitaniumLookupTableDefinition.


        :param rows: The rows of this TitaniumLookupTableDefinition.  # noqa: E501
        :type rows: list[TitaniumLutEntry]
        """

        self._rows = rows

    @property
    def total_records(self):
        """Gets the total_records of this TitaniumLookupTableDefinition.  # noqa: E501


        :return: The total_records of this TitaniumLookupTableDefinition.  # noqa: E501
        :rtype: int
        """
        return self._total_records

    @total_records.setter
    def total_records(self, total_records):
        """Sets the total_records of this TitaniumLookupTableDefinition.


        :param total_records: The total_records of this TitaniumLookupTableDefinition.  # noqa: E501
        :type total_records: int
        """

        self._total_records = total_records

    @property
    def type(self):
        """Gets the type of this TitaniumLookupTableDefinition.  # noqa: E501


        :return: The type of this TitaniumLookupTableDefinition.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this TitaniumLookupTableDefinition.


        :param type: The type of this TitaniumLookupTableDefinition.  # noqa: E501
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
        if not isinstance(other, TitaniumLookupTableDefinition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumLookupTableDefinition):
            return True

        return self.to_dict() != other.to_dict()
