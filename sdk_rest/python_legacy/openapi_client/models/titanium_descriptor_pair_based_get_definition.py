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


class TitaniumDescriptorPairBasedGetDefinition(object):
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
        'dest_descriptor': 'str',
        'identifier': 'TitaniumIdentifier',
        'scope': 'str',
        'src_descriptor': 'str'
    }

    attribute_map = {
        'dest_descriptor': 'destDescriptor',
        'identifier': 'identifier',
        'scope': 'scope',
        'src_descriptor': 'srcDescriptor'
    }

    def __init__(self, dest_descriptor=None, identifier=None, scope=None, src_descriptor=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumDescriptorPairBasedGetDefinition - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._dest_descriptor = None
        self._identifier = None
        self._scope = None
        self._src_descriptor = None
        self.discriminator = None

        if dest_descriptor is not None:
            self.dest_descriptor = dest_descriptor
        if identifier is not None:
            self.identifier = identifier
        if scope is not None:
            self.scope = scope
        if src_descriptor is not None:
            self.src_descriptor = src_descriptor

    @property
    def dest_descriptor(self):
        """Gets the dest_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501


        :return: The dest_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :rtype: str
        """
        return self._dest_descriptor

    @dest_descriptor.setter
    def dest_descriptor(self, dest_descriptor):
        """Sets the dest_descriptor of this TitaniumDescriptorPairBasedGetDefinition.


        :param dest_descriptor: The dest_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :type dest_descriptor: str
        """

        self._dest_descriptor = dest_descriptor

    @property
    def identifier(self):
        """Gets the identifier of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501


        :return: The identifier of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :rtype: TitaniumIdentifier
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this TitaniumDescriptorPairBasedGetDefinition.


        :param identifier: The identifier of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :type identifier: TitaniumIdentifier
        """

        self._identifier = identifier

    @property
    def scope(self):
        """Gets the scope of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501


        :return: The scope of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """Sets the scope of this TitaniumDescriptorPairBasedGetDefinition.


        :param scope: The scope of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :type scope: str
        """

        self._scope = scope

    @property
    def src_descriptor(self):
        """Gets the src_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501


        :return: The src_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :rtype: str
        """
        return self._src_descriptor

    @src_descriptor.setter
    def src_descriptor(self, src_descriptor):
        """Sets the src_descriptor of this TitaniumDescriptorPairBasedGetDefinition.


        :param src_descriptor: The src_descriptor of this TitaniumDescriptorPairBasedGetDefinition.  # noqa: E501
        :type src_descriptor: str
        """

        self._src_descriptor = src_descriptor

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
        if not isinstance(other, TitaniumDescriptorPairBasedGetDefinition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumDescriptorPairBasedGetDefinition):
            return True

        return self.to_dict() != other.to_dict()