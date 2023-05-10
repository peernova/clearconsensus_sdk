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


class TitaniumConsensusResponseData(object):
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
        'columns': 'list[TitaniumColumnInfo]',
        'rows': 'list[TitaniumValuesRow]',
        'total_rows': 'int'
    }

    attribute_map = {
        'columns': 'columns',
        'rows': 'rows',
        'total_rows': 'totalRows'
    }

    def __init__(self, columns=None, rows=None, total_rows=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumConsensusResponseData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._columns = None
        self._rows = None
        self._total_rows = None
        self.discriminator = None

        if columns is not None:
            self.columns = columns
        if rows is not None:
            self.rows = rows
        if total_rows is not None:
            self.total_rows = total_rows

    @property
    def columns(self):
        """Gets the columns of this TitaniumConsensusResponseData.  # noqa: E501


        :return: The columns of this TitaniumConsensusResponseData.  # noqa: E501
        :rtype: list[TitaniumColumnInfo]
        """
        return self._columns

    @columns.setter
    def columns(self, columns):
        """Sets the columns of this TitaniumConsensusResponseData.


        :param columns: The columns of this TitaniumConsensusResponseData.  # noqa: E501
        :type columns: list[TitaniumColumnInfo]
        """

        self._columns = columns

    @property
    def rows(self):
        """Gets the rows of this TitaniumConsensusResponseData.  # noqa: E501


        :return: The rows of this TitaniumConsensusResponseData.  # noqa: E501
        :rtype: list[TitaniumValuesRow]
        """
        return self._rows

    @rows.setter
    def rows(self, rows):
        """Sets the rows of this TitaniumConsensusResponseData.


        :param rows: The rows of this TitaniumConsensusResponseData.  # noqa: E501
        :type rows: list[TitaniumValuesRow]
        """

        self._rows = rows

    @property
    def total_rows(self):
        """Gets the total_rows of this TitaniumConsensusResponseData.  # noqa: E501


        :return: The total_rows of this TitaniumConsensusResponseData.  # noqa: E501
        :rtype: int
        """
        return self._total_rows

    @total_rows.setter
    def total_rows(self, total_rows):
        """Sets the total_rows of this TitaniumConsensusResponseData.


        :param total_rows: The total_rows of this TitaniumConsensusResponseData.  # noqa: E501
        :type total_rows: int
        """

        self._total_rows = total_rows

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
        if not isinstance(other, TitaniumConsensusResponseData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumConsensusResponseData):
            return True

        return self.to_dict() != other.to_dict()
