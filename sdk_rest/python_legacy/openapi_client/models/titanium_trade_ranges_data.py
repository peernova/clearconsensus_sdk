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


class TitaniumTradeRangesData(object):
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
        'latest_trade_price': 'float',
        'notional': 'float',
        'pricing_recency': 'str',
        'trade_execution_time': 'str'
    }

    attribute_map = {
        'latest_trade_price': 'latestTradePrice',
        'notional': 'notional',
        'pricing_recency': 'pricingRecency',
        'trade_execution_time': 'tradeExecutionTime'
    }

    def __init__(self, latest_trade_price=None, notional=None, pricing_recency=None, trade_execution_time=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumTradeRangesData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._latest_trade_price = None
        self._notional = None
        self._pricing_recency = None
        self._trade_execution_time = None
        self.discriminator = None

        if latest_trade_price is not None:
            self.latest_trade_price = latest_trade_price
        if notional is not None:
            self.notional = notional
        if pricing_recency is not None:
            self.pricing_recency = pricing_recency
        if trade_execution_time is not None:
            self.trade_execution_time = trade_execution_time

    @property
    def latest_trade_price(self):
        """Gets the latest_trade_price of this TitaniumTradeRangesData.  # noqa: E501


        :return: The latest_trade_price of this TitaniumTradeRangesData.  # noqa: E501
        :rtype: float
        """
        return self._latest_trade_price

    @latest_trade_price.setter
    def latest_trade_price(self, latest_trade_price):
        """Sets the latest_trade_price of this TitaniumTradeRangesData.


        :param latest_trade_price: The latest_trade_price of this TitaniumTradeRangesData.  # noqa: E501
        :type latest_trade_price: float
        """

        self._latest_trade_price = latest_trade_price

    @property
    def notional(self):
        """Gets the notional of this TitaniumTradeRangesData.  # noqa: E501


        :return: The notional of this TitaniumTradeRangesData.  # noqa: E501
        :rtype: float
        """
        return self._notional

    @notional.setter
    def notional(self, notional):
        """Sets the notional of this TitaniumTradeRangesData.


        :param notional: The notional of this TitaniumTradeRangesData.  # noqa: E501
        :type notional: float
        """

        self._notional = notional

    @property
    def pricing_recency(self):
        """Gets the pricing_recency of this TitaniumTradeRangesData.  # noqa: E501


        :return: The pricing_recency of this TitaniumTradeRangesData.  # noqa: E501
        :rtype: str
        """
        return self._pricing_recency

    @pricing_recency.setter
    def pricing_recency(self, pricing_recency):
        """Sets the pricing_recency of this TitaniumTradeRangesData.


        :param pricing_recency: The pricing_recency of this TitaniumTradeRangesData.  # noqa: E501
        :type pricing_recency: str
        """

        self._pricing_recency = pricing_recency

    @property
    def trade_execution_time(self):
        """Gets the trade_execution_time of this TitaniumTradeRangesData.  # noqa: E501


        :return: The trade_execution_time of this TitaniumTradeRangesData.  # noqa: E501
        :rtype: str
        """
        return self._trade_execution_time

    @trade_execution_time.setter
    def trade_execution_time(self, trade_execution_time):
        """Sets the trade_execution_time of this TitaniumTradeRangesData.


        :param trade_execution_time: The trade_execution_time of this TitaniumTradeRangesData.  # noqa: E501
        :type trade_execution_time: str
        """

        self._trade_execution_time = trade_execution_time

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
        if not isinstance(other, TitaniumTradeRangesData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumTradeRangesData):
            return True

        return self.to_dict() != other.to_dict()