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


class TitaniumGenericChartMetadata(object):
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
        'filter': 'str',
        'group_by': 'list[TitaniumNameAliasPair]',
        'metrics': 'list[TitaniumNameAliasPair]',
        'row_limit': 'int',
        'select_fields': 'list[TitaniumNameAliasPair]',
        'series_limit': 'int',
        'sort_by': 'str'
    }

    attribute_map = {
        'filter': 'filter',
        'group_by': 'groupBy',
        'metrics': 'metrics',
        'row_limit': 'rowLimit',
        'select_fields': 'selectFields',
        'series_limit': 'seriesLimit',
        'sort_by': 'sortBy'
    }

    def __init__(self, filter=None, group_by=None, metrics=None, row_limit=None, select_fields=None, series_limit=None, sort_by=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumGenericChartMetadata - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._filter = None
        self._group_by = None
        self._metrics = None
        self._row_limit = None
        self._select_fields = None
        self._series_limit = None
        self._sort_by = None
        self.discriminator = None

        if filter is not None:
            self.filter = filter
        if group_by is not None:
            self.group_by = group_by
        if metrics is not None:
            self.metrics = metrics
        if row_limit is not None:
            self.row_limit = row_limit
        if select_fields is not None:
            self.select_fields = select_fields
        if series_limit is not None:
            self.series_limit = series_limit
        if sort_by is not None:
            self.sort_by = sort_by

    @property
    def filter(self):
        """Gets the filter of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The filter of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """Sets the filter of this TitaniumGenericChartMetadata.


        :param filter: The filter of this TitaniumGenericChartMetadata.  # noqa: E501
        :type filter: str
        """

        self._filter = filter

    @property
    def group_by(self):
        """Gets the group_by of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The group_by of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: list[TitaniumNameAliasPair]
        """
        return self._group_by

    @group_by.setter
    def group_by(self, group_by):
        """Sets the group_by of this TitaniumGenericChartMetadata.


        :param group_by: The group_by of this TitaniumGenericChartMetadata.  # noqa: E501
        :type group_by: list[TitaniumNameAliasPair]
        """

        self._group_by = group_by

    @property
    def metrics(self):
        """Gets the metrics of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The metrics of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: list[TitaniumNameAliasPair]
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """Sets the metrics of this TitaniumGenericChartMetadata.


        :param metrics: The metrics of this TitaniumGenericChartMetadata.  # noqa: E501
        :type metrics: list[TitaniumNameAliasPair]
        """

        self._metrics = metrics

    @property
    def row_limit(self):
        """Gets the row_limit of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The row_limit of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: int
        """
        return self._row_limit

    @row_limit.setter
    def row_limit(self, row_limit):
        """Sets the row_limit of this TitaniumGenericChartMetadata.


        :param row_limit: The row_limit of this TitaniumGenericChartMetadata.  # noqa: E501
        :type row_limit: int
        """

        self._row_limit = row_limit

    @property
    def select_fields(self):
        """Gets the select_fields of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The select_fields of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: list[TitaniumNameAliasPair]
        """
        return self._select_fields

    @select_fields.setter
    def select_fields(self, select_fields):
        """Sets the select_fields of this TitaniumGenericChartMetadata.


        :param select_fields: The select_fields of this TitaniumGenericChartMetadata.  # noqa: E501
        :type select_fields: list[TitaniumNameAliasPair]
        """

        self._select_fields = select_fields

    @property
    def series_limit(self):
        """Gets the series_limit of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The series_limit of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: int
        """
        return self._series_limit

    @series_limit.setter
    def series_limit(self, series_limit):
        """Sets the series_limit of this TitaniumGenericChartMetadata.


        :param series_limit: The series_limit of this TitaniumGenericChartMetadata.  # noqa: E501
        :type series_limit: int
        """

        self._series_limit = series_limit

    @property
    def sort_by(self):
        """Gets the sort_by of this TitaniumGenericChartMetadata.  # noqa: E501


        :return: The sort_by of this TitaniumGenericChartMetadata.  # noqa: E501
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """Sets the sort_by of this TitaniumGenericChartMetadata.


        :param sort_by: The sort_by of this TitaniumGenericChartMetadata.  # noqa: E501
        :type sort_by: str
        """

        self._sort_by = sort_by

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
        if not isinstance(other, TitaniumGenericChartMetadata):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumGenericChartMetadata):
            return True

        return self.to_dict() != other.to_dict()
