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


class TitaniumEvpExplorerTableColumn(object):
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
        'abs_diff_from_evp_mid': 'object',
        'ask': 'object',
        'bid': 'object',
        'evp_lower_boundary': 'object',
        'evp_upper_boundary': 'object',
        'mid': 'object',
        'sub_price_diff': 'object',
        'trades_or_orders_count': 'object'
    }

    attribute_map = {
        'abs_diff_from_evp_mid': 'absDiffFromEvpMid',
        'ask': 'ask',
        'bid': 'bid',
        'evp_lower_boundary': 'evpLowerBoundary',
        'evp_upper_boundary': 'evpUpperBoundary',
        'mid': 'mid',
        'sub_price_diff': 'subPriceDiff',
        'trades_or_orders_count': 'tradesOrOrdersCount'
    }

    def __init__(self, abs_diff_from_evp_mid=None, ask=None, bid=None, evp_lower_boundary=None, evp_upper_boundary=None, mid=None, sub_price_diff=None, trades_or_orders_count=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumEvpExplorerTableColumn - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._abs_diff_from_evp_mid = None
        self._ask = None
        self._bid = None
        self._evp_lower_boundary = None
        self._evp_upper_boundary = None
        self._mid = None
        self._sub_price_diff = None
        self._trades_or_orders_count = None
        self.discriminator = None

        if abs_diff_from_evp_mid is not None:
            self.abs_diff_from_evp_mid = abs_diff_from_evp_mid
        if ask is not None:
            self.ask = ask
        if bid is not None:
            self.bid = bid
        if evp_lower_boundary is not None:
            self.evp_lower_boundary = evp_lower_boundary
        if evp_upper_boundary is not None:
            self.evp_upper_boundary = evp_upper_boundary
        if mid is not None:
            self.mid = mid
        if sub_price_diff is not None:
            self.sub_price_diff = sub_price_diff
        if trades_or_orders_count is not None:
            self.trades_or_orders_count = trades_or_orders_count

    @property
    def abs_diff_from_evp_mid(self):
        """Gets the abs_diff_from_evp_mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The abs_diff_from_evp_mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._abs_diff_from_evp_mid

    @abs_diff_from_evp_mid.setter
    def abs_diff_from_evp_mid(self, abs_diff_from_evp_mid):
        """Sets the abs_diff_from_evp_mid of this TitaniumEvpExplorerTableColumn.


        :param abs_diff_from_evp_mid: The abs_diff_from_evp_mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type abs_diff_from_evp_mid: object
        """

        self._abs_diff_from_evp_mid = abs_diff_from_evp_mid

    @property
    def ask(self):
        """Gets the ask of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The ask of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._ask

    @ask.setter
    def ask(self, ask):
        """Sets the ask of this TitaniumEvpExplorerTableColumn.


        :param ask: The ask of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type ask: object
        """

        self._ask = ask

    @property
    def bid(self):
        """Gets the bid of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The bid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._bid

    @bid.setter
    def bid(self, bid):
        """Sets the bid of this TitaniumEvpExplorerTableColumn.


        :param bid: The bid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type bid: object
        """

        self._bid = bid

    @property
    def evp_lower_boundary(self):
        """Gets the evp_lower_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The evp_lower_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._evp_lower_boundary

    @evp_lower_boundary.setter
    def evp_lower_boundary(self, evp_lower_boundary):
        """Sets the evp_lower_boundary of this TitaniumEvpExplorerTableColumn.


        :param evp_lower_boundary: The evp_lower_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type evp_lower_boundary: object
        """

        self._evp_lower_boundary = evp_lower_boundary

    @property
    def evp_upper_boundary(self):
        """Gets the evp_upper_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The evp_upper_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._evp_upper_boundary

    @evp_upper_boundary.setter
    def evp_upper_boundary(self, evp_upper_boundary):
        """Sets the evp_upper_boundary of this TitaniumEvpExplorerTableColumn.


        :param evp_upper_boundary: The evp_upper_boundary of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type evp_upper_boundary: object
        """

        self._evp_upper_boundary = evp_upper_boundary

    @property
    def mid(self):
        """Gets the mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._mid

    @mid.setter
    def mid(self, mid):
        """Sets the mid of this TitaniumEvpExplorerTableColumn.


        :param mid: The mid of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type mid: object
        """

        self._mid = mid

    @property
    def sub_price_diff(self):
        """Gets the sub_price_diff of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The sub_price_diff of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._sub_price_diff

    @sub_price_diff.setter
    def sub_price_diff(self, sub_price_diff):
        """Sets the sub_price_diff of this TitaniumEvpExplorerTableColumn.


        :param sub_price_diff: The sub_price_diff of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type sub_price_diff: object
        """

        self._sub_price_diff = sub_price_diff

    @property
    def trades_or_orders_count(self):
        """Gets the trades_or_orders_count of this TitaniumEvpExplorerTableColumn.  # noqa: E501


        :return: The trades_or_orders_count of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._trades_or_orders_count

    @trades_or_orders_count.setter
    def trades_or_orders_count(self, trades_or_orders_count):
        """Sets the trades_or_orders_count of this TitaniumEvpExplorerTableColumn.


        :param trades_or_orders_count: The trades_or_orders_count of this TitaniumEvpExplorerTableColumn.  # noqa: E501
        :type trades_or_orders_count: object
        """

        self._trades_or_orders_count = trades_or_orders_count

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
        if not isinstance(other, TitaniumEvpExplorerTableColumn):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumEvpExplorerTableColumn):
            return True

        return self.to_dict() != other.to_dict()
