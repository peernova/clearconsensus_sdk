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


class TitaniumUploadURLRequest(object):
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
        'client': 'str',
        'date': 'str',
        'descriptor_name': 'str',
        'file_name': 'str',
        'trace_name': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'client': 'client',
        'date': 'date',
        'descriptor_name': 'descriptorName',
        'file_name': 'fileName',
        'trace_name': 'traceName'
    }

    def __init__(self, asset_id=None, client=None, date=None, descriptor_name=None, file_name=None, trace_name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumUploadURLRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._client = None
        self._date = None
        self._descriptor_name = None
        self._file_name = None
        self._trace_name = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if client is not None:
            self.client = client
        if date is not None:
            self.date = date
        if descriptor_name is not None:
            self.descriptor_name = descriptor_name
        if file_name is not None:
            self.file_name = file_name
        if trace_name is not None:
            self.trace_name = trace_name

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The asset_id of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumUploadURLRequest.


        :param asset_id: The asset_id of this TitaniumUploadURLRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def client(self):
        """Gets the client of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The client of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this TitaniumUploadURLRequest.


        :param client: The client of this TitaniumUploadURLRequest.  # noqa: E501
        :type client: str
        """

        self._client = client

    @property
    def date(self):
        """Gets the date of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The date of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this TitaniumUploadURLRequest.


        :param date: The date of this TitaniumUploadURLRequest.  # noqa: E501
        :type date: str
        """

        self._date = date

    @property
    def descriptor_name(self):
        """Gets the descriptor_name of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The descriptor_name of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._descriptor_name

    @descriptor_name.setter
    def descriptor_name(self, descriptor_name):
        """Sets the descriptor_name of this TitaniumUploadURLRequest.


        :param descriptor_name: The descriptor_name of this TitaniumUploadURLRequest.  # noqa: E501
        :type descriptor_name: str
        """

        self._descriptor_name = descriptor_name

    @property
    def file_name(self):
        """Gets the file_name of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The file_name of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name):
        """Sets the file_name of this TitaniumUploadURLRequest.


        :param file_name: The file_name of this TitaniumUploadURLRequest.  # noqa: E501
        :type file_name: str
        """

        self._file_name = file_name

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumUploadURLRequest.  # noqa: E501


        :return: The trace_name of this TitaniumUploadURLRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumUploadURLRequest.


        :param trace_name: The trace_name of this TitaniumUploadURLRequest.  # noqa: E501
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
        if not isinstance(other, TitaniumUploadURLRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumUploadURLRequest):
            return True

        return self.to_dict() != other.to_dict()
