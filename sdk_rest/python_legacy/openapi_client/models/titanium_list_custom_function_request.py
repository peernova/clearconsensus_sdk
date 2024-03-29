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


class TitaniumListCustomFunctionRequest(object):
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
        'descriptor_name': 'str',
        'descriptor_type': 'str',
        'request': 'TitaniumListRequest'
    }

    attribute_map = {
        'descriptor_name': 'descriptorName',
        'descriptor_type': 'descriptorType',
        'request': 'request'
    }

    def __init__(self, descriptor_name=None, descriptor_type=None, request=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumListCustomFunctionRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._descriptor_name = None
        self._descriptor_type = None
        self._request = None
        self.discriminator = None

        if descriptor_name is not None:
            self.descriptor_name = descriptor_name
        if descriptor_type is not None:
            self.descriptor_type = descriptor_type
        if request is not None:
            self.request = request

    @property
    def descriptor_name(self):
        """Gets the descriptor_name of this TitaniumListCustomFunctionRequest.  # noqa: E501


        :return: The descriptor_name of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :rtype: str
        """
        return self._descriptor_name

    @descriptor_name.setter
    def descriptor_name(self, descriptor_name):
        """Sets the descriptor_name of this TitaniumListCustomFunctionRequest.


        :param descriptor_name: The descriptor_name of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :type descriptor_name: str
        """

        self._descriptor_name = descriptor_name

    @property
    def descriptor_type(self):
        """Gets the descriptor_type of this TitaniumListCustomFunctionRequest.  # noqa: E501


        :return: The descriptor_type of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :rtype: str
        """
        return self._descriptor_type

    @descriptor_type.setter
    def descriptor_type(self, descriptor_type):
        """Sets the descriptor_type of this TitaniumListCustomFunctionRequest.


        :param descriptor_type: The descriptor_type of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :type descriptor_type: str
        """

        self._descriptor_type = descriptor_type

    @property
    def request(self):
        """Gets the request of this TitaniumListCustomFunctionRequest.  # noqa: E501


        :return: The request of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :rtype: TitaniumListRequest
        """
        return self._request

    @request.setter
    def request(self, request):
        """Sets the request of this TitaniumListCustomFunctionRequest.


        :param request: The request of this TitaniumListCustomFunctionRequest.  # noqa: E501
        :type request: TitaniumListRequest
        """

        self._request = request

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
        if not isinstance(other, TitaniumListCustomFunctionRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumListCustomFunctionRequest):
            return True

        return self.to_dict() != other.to_dict()
