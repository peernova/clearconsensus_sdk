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


class TitaniumGetChartDataRequest(object):
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
        'asset_id': 'str',
        'chart_id': 'str',
        'filter_pack': 'TitaniumFilterPack',
        'invalidate_cache': 'bool',
        'parameters': 'object',
        'slice_id': 'str',
        'trace_name': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'chart_id': 'chartId',
        'filter_pack': 'filterPack',
        'invalidate_cache': 'invalidateCache',
        'parameters': 'parameters',
        'slice_id': 'sliceId',
        'trace_name': 'traceName'
    }

    def __init__(self, asset_id=None, chart_id=None, filter_pack=None, invalidate_cache=None, parameters=None, slice_id=None, trace_name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumGetChartDataRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._chart_id = None
        self._filter_pack = None
        self._invalidate_cache = None
        self._parameters = None
        self._slice_id = None
        self._trace_name = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if chart_id is not None:
            self.chart_id = chart_id
        if filter_pack is not None:
            self.filter_pack = filter_pack
        if invalidate_cache is not None:
            self.invalidate_cache = invalidate_cache
        if parameters is not None:
            self.parameters = parameters
        if slice_id is not None:
            self.slice_id = slice_id
        if trace_name is not None:
            self.trace_name = trace_name

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The asset_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumGetChartDataRequest.


        :param asset_id: The asset_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def chart_id(self):
        """Gets the chart_id of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The chart_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: str
        """
        return self._chart_id

    @chart_id.setter
    def chart_id(self, chart_id):
        """Sets the chart_id of this TitaniumGetChartDataRequest.


        :param chart_id: The chart_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :type chart_id: str
        """

        self._chart_id = chart_id

    @property
    def filter_pack(self):
        """Gets the filter_pack of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The filter_pack of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: TitaniumFilterPack
        """
        return self._filter_pack

    @filter_pack.setter
    def filter_pack(self, filter_pack):
        """Sets the filter_pack of this TitaniumGetChartDataRequest.


        :param filter_pack: The filter_pack of this TitaniumGetChartDataRequest.  # noqa: E501
        :type filter_pack: TitaniumFilterPack
        """

        self._filter_pack = filter_pack

    @property
    def invalidate_cache(self):
        """Gets the invalidate_cache of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The invalidate_cache of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: bool
        """
        return self._invalidate_cache

    @invalidate_cache.setter
    def invalidate_cache(self, invalidate_cache):
        """Sets the invalidate_cache of this TitaniumGetChartDataRequest.


        :param invalidate_cache: The invalidate_cache of this TitaniumGetChartDataRequest.  # noqa: E501
        :type invalidate_cache: bool
        """

        self._invalidate_cache = invalidate_cache

    @property
    def parameters(self):
        """Gets the parameters of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The parameters of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: object
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """Sets the parameters of this TitaniumGetChartDataRequest.


        :param parameters: The parameters of this TitaniumGetChartDataRequest.  # noqa: E501
        :type parameters: object
        """

        self._parameters = parameters

    @property
    def slice_id(self):
        """Gets the slice_id of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The slice_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: str
        """
        return self._slice_id

    @slice_id.setter
    def slice_id(self, slice_id):
        """Sets the slice_id of this TitaniumGetChartDataRequest.


        :param slice_id: The slice_id of this TitaniumGetChartDataRequest.  # noqa: E501
        :type slice_id: str
        """

        self._slice_id = slice_id

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumGetChartDataRequest.  # noqa: E501


        :return: The trace_name of this TitaniumGetChartDataRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumGetChartDataRequest.


        :param trace_name: The trace_name of this TitaniumGetChartDataRequest.  # noqa: E501
        :type trace_name: str
        """

        self._trace_name = trace_name

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
        if not isinstance(other, TitaniumGetChartDataRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumGetChartDataRequest):
            return True

        return self.to_dict() != other.to_dict()