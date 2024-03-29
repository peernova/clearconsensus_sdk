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


class TitaniumUploadNotifyRequest(object):
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
        'current_path': 'str',
        'target_path': 'str',
        'uuid': 'str'
    }

    attribute_map = {
        'current_path': 'currentPath',
        'target_path': 'targetPath',
        'uuid': 'uuid'
    }

    def __init__(self, current_path=None, target_path=None, uuid=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumUploadNotifyRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._current_path = None
        self._target_path = None
        self._uuid = None
        self.discriminator = None

        if current_path is not None:
            self.current_path = current_path
        if target_path is not None:
            self.target_path = target_path
        if uuid is not None:
            self.uuid = uuid

    @property
    def current_path(self):
        """Gets the current_path of this TitaniumUploadNotifyRequest.  # noqa: E501


        :return: The current_path of this TitaniumUploadNotifyRequest.  # noqa: E501
        :rtype: str
        """
        return self._current_path

    @current_path.setter
    def current_path(self, current_path):
        """Sets the current_path of this TitaniumUploadNotifyRequest.


        :param current_path: The current_path of this TitaniumUploadNotifyRequest.  # noqa: E501
        :type current_path: str
        """

        self._current_path = current_path

    @property
    def target_path(self):
        """Gets the target_path of this TitaniumUploadNotifyRequest.  # noqa: E501


        :return: The target_path of this TitaniumUploadNotifyRequest.  # noqa: E501
        :rtype: str
        """
        return self._target_path

    @target_path.setter
    def target_path(self, target_path):
        """Sets the target_path of this TitaniumUploadNotifyRequest.


        :param target_path: The target_path of this TitaniumUploadNotifyRequest.  # noqa: E501
        :type target_path: str
        """

        self._target_path = target_path

    @property
    def uuid(self):
        """Gets the uuid of this TitaniumUploadNotifyRequest.  # noqa: E501


        :return: The uuid of this TitaniumUploadNotifyRequest.  # noqa: E501
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """Sets the uuid of this TitaniumUploadNotifyRequest.


        :param uuid: The uuid of this TitaniumUploadNotifyRequest.  # noqa: E501
        :type uuid: str
        """

        self._uuid = uuid

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
        if not isinstance(other, TitaniumUploadNotifyRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumUploadNotifyRequest):
            return True

        return self.to_dict() != other.to_dict()
