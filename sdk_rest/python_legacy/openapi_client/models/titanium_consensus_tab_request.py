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


class TitaniumConsensusTabRequest(object):
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
        'collapse_table_config': 'TitaniumCollapseTableRequest',
        'consensus_run_timestamp': 'str',
        'data_type': 'str',
        'table_config': 'TitaniumTableRequest',
        'trace_name': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'collapse_table_config': 'collapseTableConfig',
        'consensus_run_timestamp': 'consensusRunTimestamp',
        'data_type': 'dataType',
        'table_config': 'tableConfig',
        'trace_name': 'traceName'
    }

    def __init__(self, asset_id=None, collapse_table_config=None, consensus_run_timestamp=None, data_type=None, table_config=None, trace_name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumConsensusTabRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._collapse_table_config = None
        self._consensus_run_timestamp = None
        self._data_type = None
        self._table_config = None
        self._trace_name = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if collapse_table_config is not None:
            self.collapse_table_config = collapse_table_config
        if consensus_run_timestamp is not None:
            self.consensus_run_timestamp = consensus_run_timestamp
        if data_type is not None:
            self.data_type = data_type
        if table_config is not None:
            self.table_config = table_config
        if trace_name is not None:
            self.trace_name = trace_name

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The asset_id of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumConsensusTabRequest.


        :param asset_id: The asset_id of this TitaniumConsensusTabRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def collapse_table_config(self):
        """Gets the collapse_table_config of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The collapse_table_config of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: TitaniumCollapseTableRequest
        """
        return self._collapse_table_config

    @collapse_table_config.setter
    def collapse_table_config(self, collapse_table_config):
        """Sets the collapse_table_config of this TitaniumConsensusTabRequest.


        :param collapse_table_config: The collapse_table_config of this TitaniumConsensusTabRequest.  # noqa: E501
        :type collapse_table_config: TitaniumCollapseTableRequest
        """

        self._collapse_table_config = collapse_table_config

    @property
    def consensus_run_timestamp(self):
        """Gets the consensus_run_timestamp of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The consensus_run_timestamp of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: str
        """
        return self._consensus_run_timestamp

    @consensus_run_timestamp.setter
    def consensus_run_timestamp(self, consensus_run_timestamp):
        """Sets the consensus_run_timestamp of this TitaniumConsensusTabRequest.


        :param consensus_run_timestamp: The consensus_run_timestamp of this TitaniumConsensusTabRequest.  # noqa: E501
        :type consensus_run_timestamp: str
        """

        self._consensus_run_timestamp = consensus_run_timestamp

    @property
    def data_type(self):
        """Gets the data_type of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The data_type of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """Sets the data_type of this TitaniumConsensusTabRequest.


        :param data_type: The data_type of this TitaniumConsensusTabRequest.  # noqa: E501
        :type data_type: str
        """

        self._data_type = data_type

    @property
    def table_config(self):
        """Gets the table_config of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The table_config of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: TitaniumTableRequest
        """
        return self._table_config

    @table_config.setter
    def table_config(self, table_config):
        """Sets the table_config of this TitaniumConsensusTabRequest.


        :param table_config: The table_config of this TitaniumConsensusTabRequest.  # noqa: E501
        :type table_config: TitaniumTableRequest
        """

        self._table_config = table_config

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumConsensusTabRequest.  # noqa: E501


        :return: The trace_name of this TitaniumConsensusTabRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumConsensusTabRequest.


        :param trace_name: The trace_name of this TitaniumConsensusTabRequest.  # noqa: E501
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
        if not isinstance(other, TitaniumConsensusTabRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumConsensusTabRequest):
            return True

        return self.to_dict() != other.to_dict()
