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


class TitaniumFilterPack(object):
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
        'filter_packs': 'list[TitaniumFilterPack]',
        'filters': 'list[TitaniumFilter]',
        'logical_operation': 'str'
    }

    attribute_map = {
        'filter_packs': 'filterPacks',
        'filters': 'filters',
        'logical_operation': 'logicalOperation'
    }

    def __init__(self, filter_packs=None, filters=None, logical_operation=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumFilterPack - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._filter_packs = None
        self._filters = None
        self._logical_operation = None
        self.discriminator = None

        if filter_packs is not None:
            self.filter_packs = filter_packs
        if filters is not None:
            self.filters = filters
        if logical_operation is not None:
            self.logical_operation = logical_operation

    @property
    def filter_packs(self):
        """Gets the filter_packs of this TitaniumFilterPack.  # noqa: E501


        :return: The filter_packs of this TitaniumFilterPack.  # noqa: E501
        :rtype: list[TitaniumFilterPack]
        """
        return self._filter_packs

    @filter_packs.setter
    def filter_packs(self, filter_packs):
        """Sets the filter_packs of this TitaniumFilterPack.


        :param filter_packs: The filter_packs of this TitaniumFilterPack.  # noqa: E501
        :type filter_packs: list[TitaniumFilterPack]
        """

        self._filter_packs = filter_packs

    @property
    def filters(self):
        """Gets the filters of this TitaniumFilterPack.  # noqa: E501


        :return: The filters of this TitaniumFilterPack.  # noqa: E501
        :rtype: list[TitaniumFilter]
        """
        return self._filters

    @filters.setter
    def filters(self, filters):
        """Sets the filters of this TitaniumFilterPack.


        :param filters: The filters of this TitaniumFilterPack.  # noqa: E501
        :type filters: list[TitaniumFilter]
        """

        self._filters = filters

    @property
    def logical_operation(self):
        """Gets the logical_operation of this TitaniumFilterPack.  # noqa: E501


        :return: The logical_operation of this TitaniumFilterPack.  # noqa: E501
        :rtype: str
        """
        return self._logical_operation

    @logical_operation.setter
    def logical_operation(self, logical_operation):
        """Sets the logical_operation of this TitaniumFilterPack.


        :param logical_operation: The logical_operation of this TitaniumFilterPack.  # noqa: E501
        :type logical_operation: str
        """

        self._logical_operation = logical_operation

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
        if not isinstance(other, TitaniumFilterPack):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumFilterPack):
            return True

        return self.to_dict() != other.to_dict()
