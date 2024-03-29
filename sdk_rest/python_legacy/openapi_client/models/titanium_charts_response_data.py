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


class TitaniumChartsResponseData(object):
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
        'benchmark': 'list[TitaniumBenchmarkMetadata]',
        'chart_sources': 'list[TitaniumChartSource]',
        'outliers': 'list[TitaniumOutlierMetadata]',
        'tenors': 'list[str]'
    }

    attribute_map = {
        'benchmark': 'benchmark',
        'chart_sources': 'chartSources',
        'outliers': 'outliers',
        'tenors': 'tenors'
    }

    def __init__(self, benchmark=None, chart_sources=None, outliers=None, tenors=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumChartsResponseData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._benchmark = None
        self._chart_sources = None
        self._outliers = None
        self._tenors = None
        self.discriminator = None

        if benchmark is not None:
            self.benchmark = benchmark
        if chart_sources is not None:
            self.chart_sources = chart_sources
        if outliers is not None:
            self.outliers = outliers
        if tenors is not None:
            self.tenors = tenors

    @property
    def benchmark(self):
        """Gets the benchmark of this TitaniumChartsResponseData.  # noqa: E501


        :return: The benchmark of this TitaniumChartsResponseData.  # noqa: E501
        :rtype: list[TitaniumBenchmarkMetadata]
        """
        return self._benchmark

    @benchmark.setter
    def benchmark(self, benchmark):
        """Sets the benchmark of this TitaniumChartsResponseData.


        :param benchmark: The benchmark of this TitaniumChartsResponseData.  # noqa: E501
        :type benchmark: list[TitaniumBenchmarkMetadata]
        """

        self._benchmark = benchmark

    @property
    def chart_sources(self):
        """Gets the chart_sources of this TitaniumChartsResponseData.  # noqa: E501


        :return: The chart_sources of this TitaniumChartsResponseData.  # noqa: E501
        :rtype: list[TitaniumChartSource]
        """
        return self._chart_sources

    @chart_sources.setter
    def chart_sources(self, chart_sources):
        """Sets the chart_sources of this TitaniumChartsResponseData.


        :param chart_sources: The chart_sources of this TitaniumChartsResponseData.  # noqa: E501
        :type chart_sources: list[TitaniumChartSource]
        """

        self._chart_sources = chart_sources

    @property
    def outliers(self):
        """Gets the outliers of this TitaniumChartsResponseData.  # noqa: E501


        :return: The outliers of this TitaniumChartsResponseData.  # noqa: E501
        :rtype: list[TitaniumOutlierMetadata]
        """
        return self._outliers

    @outliers.setter
    def outliers(self, outliers):
        """Sets the outliers of this TitaniumChartsResponseData.


        :param outliers: The outliers of this TitaniumChartsResponseData.  # noqa: E501
        :type outliers: list[TitaniumOutlierMetadata]
        """

        self._outliers = outliers

    @property
    def tenors(self):
        """Gets the tenors of this TitaniumChartsResponseData.  # noqa: E501


        :return: The tenors of this TitaniumChartsResponseData.  # noqa: E501
        :rtype: list[str]
        """
        return self._tenors

    @tenors.setter
    def tenors(self, tenors):
        """Sets the tenors of this TitaniumChartsResponseData.


        :param tenors: The tenors of this TitaniumChartsResponseData.  # noqa: E501
        :type tenors: list[str]
        """

        self._tenors = tenors

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
        if not isinstance(other, TitaniumChartsResponseData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumChartsResponseData):
            return True

        return self.to_dict() != other.to_dict()
