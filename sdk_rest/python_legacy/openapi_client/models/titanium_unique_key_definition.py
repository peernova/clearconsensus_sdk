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


class TitaniumUniqueKeyDefinition(object):
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
        'name': 'str',
        'order': 'str',
        'order_by': 'list[str]',
        'scope': 'str',
        'unique_key': 'list[str]'
    }

    attribute_map = {
        'name': 'name',
        'order': 'order',
        'order_by': 'orderBy',
        'scope': 'scope',
        'unique_key': 'uniqueKey'
    }

    def __init__(self, name=None, order=None, order_by=None, scope=None, unique_key=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumUniqueKeyDefinition - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._name = None
        self._order = None
        self._order_by = None
        self._scope = None
        self._unique_key = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if order is not None:
            self.order = order
        if order_by is not None:
            self.order_by = order_by
        if scope is not None:
            self.scope = scope
        if unique_key is not None:
            self.unique_key = unique_key

    @property
    def name(self):
        """Gets the name of this TitaniumUniqueKeyDefinition.  # noqa: E501


        :return: The name of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TitaniumUniqueKeyDefinition.


        :param name: The name of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def order(self):
        """Gets the order of this TitaniumUniqueKeyDefinition.  # noqa: E501


        :return: The order of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :rtype: str
        """
        return self._order

    @order.setter
    def order(self, order):
        """Sets the order of this TitaniumUniqueKeyDefinition.


        :param order: The order of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :type order: str
        """

        self._order = order

    @property
    def order_by(self):
        """Gets the order_by of this TitaniumUniqueKeyDefinition.  # noqa: E501


        :return: The order_by of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :rtype: list[str]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """Sets the order_by of this TitaniumUniqueKeyDefinition.


        :param order_by: The order_by of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :type order_by: list[str]
        """

        self._order_by = order_by

    @property
    def scope(self):
        """Gets the scope of this TitaniumUniqueKeyDefinition.  # noqa: E501


        :return: The scope of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """Sets the scope of this TitaniumUniqueKeyDefinition.


        :param scope: The scope of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :type scope: str
        """

        self._scope = scope

    @property
    def unique_key(self):
        """Gets the unique_key of this TitaniumUniqueKeyDefinition.  # noqa: E501


        :return: The unique_key of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :rtype: list[str]
        """
        return self._unique_key

    @unique_key.setter
    def unique_key(self, unique_key):
        """Sets the unique_key of this TitaniumUniqueKeyDefinition.


        :param unique_key: The unique_key of this TitaniumUniqueKeyDefinition.  # noqa: E501
        :type unique_key: list[str]
        """

        self._unique_key = unique_key

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
        if not isinstance(other, TitaniumUniqueKeyDefinition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumUniqueKeyDefinition):
            return True

        return self.to_dict() != other.to_dict()
