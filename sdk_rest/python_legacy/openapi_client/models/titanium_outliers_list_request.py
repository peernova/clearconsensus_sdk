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


class TitaniumOutliersListRequest(object):
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
        'consensus_run_timestamp': 'str',
        'filter': 'str',
        'limit': 'TitaniumLimit',
        'offset': 'int',
        'order_by': 'TitaniumOrderBy',
        'submitted_date': 'str',
        'submitted_id': 'str',
        'trace_name': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'consensus_run_timestamp': 'consensusRunTimestamp',
        'filter': 'filter',
        'limit': 'limit',
        'offset': 'offset',
        'order_by': 'orderBy',
        'submitted_date': 'submittedDate',
        'submitted_id': 'submittedId',
        'trace_name': 'traceName'
    }

    def __init__(self, asset_id=None, consensus_run_timestamp=None, filter=None, limit=None, offset=None, order_by=None, submitted_date=None, submitted_id=None, trace_name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumOutliersListRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._consensus_run_timestamp = None
        self._filter = None
        self._limit = None
        self._offset = None
        self._order_by = None
        self._submitted_date = None
        self._submitted_id = None
        self._trace_name = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if consensus_run_timestamp is not None:
            self.consensus_run_timestamp = consensus_run_timestamp
        if filter is not None:
            self.filter = filter
        if limit is not None:
            self.limit = limit
        if offset is not None:
            self.offset = offset
        if order_by is not None:
            self.order_by = order_by
        if submitted_date is not None:
            self.submitted_date = submitted_date
        if submitted_id is not None:
            self.submitted_id = submitted_id
        if trace_name is not None:
            self.trace_name = trace_name

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The asset_id of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumOutliersListRequest.


        :param asset_id: The asset_id of this TitaniumOutliersListRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def consensus_run_timestamp(self):
        """Gets the consensus_run_timestamp of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The consensus_run_timestamp of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._consensus_run_timestamp

    @consensus_run_timestamp.setter
    def consensus_run_timestamp(self, consensus_run_timestamp):
        """Sets the consensus_run_timestamp of this TitaniumOutliersListRequest.


        :param consensus_run_timestamp: The consensus_run_timestamp of this TitaniumOutliersListRequest.  # noqa: E501
        :type consensus_run_timestamp: str
        """

        self._consensus_run_timestamp = consensus_run_timestamp

    @property
    def filter(self):
        """Gets the filter of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The filter of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """Sets the filter of this TitaniumOutliersListRequest.


        :param filter: The filter of this TitaniumOutliersListRequest.  # noqa: E501
        :type filter: str
        """

        self._filter = filter

    @property
    def limit(self):
        """Gets the limit of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The limit of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: TitaniumLimit
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """Sets the limit of this TitaniumOutliersListRequest.


        :param limit: The limit of this TitaniumOutliersListRequest.  # noqa: E501
        :type limit: TitaniumLimit
        """

        self._limit = limit

    @property
    def offset(self):
        """Gets the offset of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The offset of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """Sets the offset of this TitaniumOutliersListRequest.


        :param offset: The offset of this TitaniumOutliersListRequest.  # noqa: E501
        :type offset: int
        """

        self._offset = offset

    @property
    def order_by(self):
        """Gets the order_by of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The order_by of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: TitaniumOrderBy
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """Sets the order_by of this TitaniumOutliersListRequest.


        :param order_by: The order_by of this TitaniumOutliersListRequest.  # noqa: E501
        :type order_by: TitaniumOrderBy
        """

        self._order_by = order_by

    @property
    def submitted_date(self):
        """Gets the submitted_date of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The submitted_date of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._submitted_date

    @submitted_date.setter
    def submitted_date(self, submitted_date):
        """Sets the submitted_date of this TitaniumOutliersListRequest.


        :param submitted_date: The submitted_date of this TitaniumOutliersListRequest.  # noqa: E501
        :type submitted_date: str
        """

        self._submitted_date = submitted_date

    @property
    def submitted_id(self):
        """Gets the submitted_id of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The submitted_id of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._submitted_id

    @submitted_id.setter
    def submitted_id(self, submitted_id):
        """Sets the submitted_id of this TitaniumOutliersListRequest.


        :param submitted_id: The submitted_id of this TitaniumOutliersListRequest.  # noqa: E501
        :type submitted_id: str
        """

        self._submitted_id = submitted_id

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumOutliersListRequest.  # noqa: E501


        :return: The trace_name of this TitaniumOutliersListRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumOutliersListRequest.


        :param trace_name: The trace_name of this TitaniumOutliersListRequest.  # noqa: E501
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
        if not isinstance(other, TitaniumOutliersListRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumOutliersListRequest):
            return True

        return self.to_dict() != other.to_dict()
