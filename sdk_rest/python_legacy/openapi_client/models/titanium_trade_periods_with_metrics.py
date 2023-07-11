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


class TitaniumTradePeriodsWithMetrics(object):
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
        'less_day': 'TitaniumTradePeriodMetrics',
        'less_month': 'TitaniumTradePeriodMetrics',
        'less_week': 'TitaniumTradePeriodMetrics'
    }

    attribute_map = {
        'less_day': 'lessDay',
        'less_month': 'lessMonth',
        'less_week': 'lessWeek'
    }

    def __init__(self, less_day=None, less_month=None, less_week=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumTradePeriodsWithMetrics - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._less_day = None
        self._less_month = None
        self._less_week = None
        self.discriminator = None

        if less_day is not None:
            self.less_day = less_day
        if less_month is not None:
            self.less_month = less_month
        if less_week is not None:
            self.less_week = less_week

    @property
    def less_day(self):
        """Gets the less_day of this TitaniumTradePeriodsWithMetrics.  # noqa: E501


        :return: The less_day of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :rtype: TitaniumTradePeriodMetrics
        """
        return self._less_day

    @less_day.setter
    def less_day(self, less_day):
        """Sets the less_day of this TitaniumTradePeriodsWithMetrics.


        :param less_day: The less_day of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :type less_day: TitaniumTradePeriodMetrics
        """

        self._less_day = less_day

    @property
    def less_month(self):
        """Gets the less_month of this TitaniumTradePeriodsWithMetrics.  # noqa: E501


        :return: The less_month of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :rtype: TitaniumTradePeriodMetrics
        """
        return self._less_month

    @less_month.setter
    def less_month(self, less_month):
        """Sets the less_month of this TitaniumTradePeriodsWithMetrics.


        :param less_month: The less_month of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :type less_month: TitaniumTradePeriodMetrics
        """

        self._less_month = less_month

    @property
    def less_week(self):
        """Gets the less_week of this TitaniumTradePeriodsWithMetrics.  # noqa: E501


        :return: The less_week of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :rtype: TitaniumTradePeriodMetrics
        """
        return self._less_week

    @less_week.setter
    def less_week(self, less_week):
        """Sets the less_week of this TitaniumTradePeriodsWithMetrics.


        :param less_week: The less_week of this TitaniumTradePeriodsWithMetrics.  # noqa: E501
        :type less_week: TitaniumTradePeriodMetrics
        """

        self._less_week = less_week

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
        if not isinstance(other, TitaniumTradePeriodsWithMetrics):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumTradePeriodsWithMetrics):
            return True

        return self.to_dict() != other.to_dict()