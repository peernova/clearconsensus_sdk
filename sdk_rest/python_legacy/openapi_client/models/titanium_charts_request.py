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


class TitaniumChartsRequest(object):
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
        'submitted_date': 'str',
        'trace_name': 'str',
        'underlying': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'client': 'client',
        'submitted_date': 'submittedDate',
        'trace_name': 'traceName',
        'underlying': 'underlying'
    }

    def __init__(self, asset_id=None, client=None, submitted_date=None, trace_name=None, underlying=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumChartsRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._client = None
        self._submitted_date = None
        self._trace_name = None
        self._underlying = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if client is not None:
            self.client = client
        if submitted_date is not None:
            self.submitted_date = submitted_date
        if trace_name is not None:
            self.trace_name = trace_name
        if underlying is not None:
            self.underlying = underlying

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumChartsRequest.  # noqa: E501


        :return: The asset_id of this TitaniumChartsRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumChartsRequest.


        :param asset_id: The asset_id of this TitaniumChartsRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def client(self):
        """Gets the client of this TitaniumChartsRequest.  # noqa: E501


        :return: The client of this TitaniumChartsRequest.  # noqa: E501
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this TitaniumChartsRequest.


        :param client: The client of this TitaniumChartsRequest.  # noqa: E501
        :type client: str
        """

        self._client = client

    @property
    def submitted_date(self):
        """Gets the submitted_date of this TitaniumChartsRequest.  # noqa: E501


        :return: The submitted_date of this TitaniumChartsRequest.  # noqa: E501
        :rtype: str
        """
        return self._submitted_date

    @submitted_date.setter
    def submitted_date(self, submitted_date):
        """Sets the submitted_date of this TitaniumChartsRequest.


        :param submitted_date: The submitted_date of this TitaniumChartsRequest.  # noqa: E501
        :type submitted_date: str
        """

        self._submitted_date = submitted_date

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumChartsRequest.  # noqa: E501


        :return: The trace_name of this TitaniumChartsRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumChartsRequest.


        :param trace_name: The trace_name of this TitaniumChartsRequest.  # noqa: E501
        :type trace_name: str
        """

        self._trace_name = trace_name

    @property
    def underlying(self):
        """Gets the underlying of this TitaniumChartsRequest.  # noqa: E501


        :return: The underlying of this TitaniumChartsRequest.  # noqa: E501
        :rtype: str
        """
        return self._underlying

    @underlying.setter
    def underlying(self, underlying):
        """Sets the underlying of this TitaniumChartsRequest.


        :param underlying: The underlying of this TitaniumChartsRequest.  # noqa: E501
        :type underlying: str
        """

        self._underlying = underlying

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
        if not isinstance(other, TitaniumChartsRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumChartsRequest):
            return True

        return self.to_dict() != other.to_dict()
