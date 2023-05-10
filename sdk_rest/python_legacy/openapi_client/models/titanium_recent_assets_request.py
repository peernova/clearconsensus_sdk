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


class TitaniumRecentAssetsRequest(object):
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
        'limit': 'TitaniumLimit',
        'offset': 'int',
        'order_by': 'TitaniumOrderBy'
    }

    attribute_map = {
        'filter': 'filter',
        'limit': 'limit',
        'offset': 'offset',
        'order_by': 'orderBy'
    }

    def __init__(self, filter=None, limit=None, offset=None, order_by=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumRecentAssetsRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._filter = None
        self._limit = None
        self._offset = None
        self._order_by = None
        self.discriminator = None

        if filter is not None:
            self.filter = filter
        if limit is not None:
            self.limit = limit
        if offset is not None:
            self.offset = offset
        if order_by is not None:
            self.order_by = order_by

    @property
    def filter(self):
        """Gets the filter of this TitaniumRecentAssetsRequest.  # noqa: E501


        :return: The filter of this TitaniumRecentAssetsRequest.  # noqa: E501
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """Sets the filter of this TitaniumRecentAssetsRequest.


        :param filter: The filter of this TitaniumRecentAssetsRequest.  # noqa: E501
        :type filter: str
        """

        self._filter = filter

    @property
    def limit(self):
        """Gets the limit of this TitaniumRecentAssetsRequest.  # noqa: E501


        :return: The limit of this TitaniumRecentAssetsRequest.  # noqa: E501
        :rtype: TitaniumLimit
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """Sets the limit of this TitaniumRecentAssetsRequest.


        :param limit: The limit of this TitaniumRecentAssetsRequest.  # noqa: E501
        :type limit: TitaniumLimit
        """

        self._limit = limit

    @property
    def offset(self):
        """Gets the offset of this TitaniumRecentAssetsRequest.  # noqa: E501


        :return: The offset of this TitaniumRecentAssetsRequest.  # noqa: E501
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """Sets the offset of this TitaniumRecentAssetsRequest.


        :param offset: The offset of this TitaniumRecentAssetsRequest.  # noqa: E501
        :type offset: int
        """

        self._offset = offset

    @property
    def order_by(self):
        """Gets the order_by of this TitaniumRecentAssetsRequest.  # noqa: E501


        :return: The order_by of this TitaniumRecentAssetsRequest.  # noqa: E501
        :rtype: TitaniumOrderBy
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """Sets the order_by of this TitaniumRecentAssetsRequest.


        :param order_by: The order_by of this TitaniumRecentAssetsRequest.  # noqa: E501
        :type order_by: TitaniumOrderBy
        """

        self._order_by = order_by

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
        if not isinstance(other, TitaniumRecentAssetsRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumRecentAssetsRequest):
            return True

        return self.to_dict() != other.to_dict()
