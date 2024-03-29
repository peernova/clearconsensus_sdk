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


class TitaniumGetConsensusRunsRequest(object):
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
        'filter_pack': 'TitaniumFilterPack',
        'order_by': 'TitaniumOrderBy',
        'page': 'TitaniumPage',
        'participant': 'str',
        'show_archived': 'bool',
        'snap_date_from': 'str',
        'snap_date_to': 'str',
        'trace_name': 'str'
    }

    attribute_map = {
        'asset_id': 'assetId',
        'filter_pack': 'filterPack',
        'order_by': 'orderBy',
        'page': 'page',
        'participant': 'participant',
        'show_archived': 'showArchived',
        'snap_date_from': 'snapDateFrom',
        'snap_date_to': 'snapDateTo',
        'trace_name': 'traceName'
    }

    def __init__(self, asset_id=None, filter_pack=None, order_by=None, page=None, participant=None, show_archived=None, snap_date_from=None, snap_date_to=None, trace_name=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumGetConsensusRunsRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._asset_id = None
        self._filter_pack = None
        self._order_by = None
        self._page = None
        self._participant = None
        self._show_archived = None
        self._snap_date_from = None
        self._snap_date_to = None
        self._trace_name = None
        self.discriminator = None

        if asset_id is not None:
            self.asset_id = asset_id
        if filter_pack is not None:
            self.filter_pack = filter_pack
        if order_by is not None:
            self.order_by = order_by
        if page is not None:
            self.page = page
        if participant is not None:
            self.participant = participant
        if show_archived is not None:
            self.show_archived = show_archived
        if snap_date_from is not None:
            self.snap_date_from = snap_date_from
        if snap_date_to is not None:
            self.snap_date_to = snap_date_to
        if trace_name is not None:
            self.trace_name = trace_name

    @property
    def asset_id(self):
        """Gets the asset_id of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The asset_id of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this TitaniumGetConsensusRunsRequest.


        :param asset_id: The asset_id of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type asset_id: str
        """

        self._asset_id = asset_id

    @property
    def filter_pack(self):
        """Gets the filter_pack of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The filter_pack of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: TitaniumFilterPack
        """
        return self._filter_pack

    @filter_pack.setter
    def filter_pack(self, filter_pack):
        """Sets the filter_pack of this TitaniumGetConsensusRunsRequest.


        :param filter_pack: The filter_pack of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type filter_pack: TitaniumFilterPack
        """

        self._filter_pack = filter_pack

    @property
    def order_by(self):
        """Gets the order_by of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The order_by of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: TitaniumOrderBy
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """Sets the order_by of this TitaniumGetConsensusRunsRequest.


        :param order_by: The order_by of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type order_by: TitaniumOrderBy
        """

        self._order_by = order_by

    @property
    def page(self):
        """Gets the page of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The page of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: TitaniumPage
        """
        return self._page

    @page.setter
    def page(self, page):
        """Sets the page of this TitaniumGetConsensusRunsRequest.


        :param page: The page of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type page: TitaniumPage
        """

        self._page = page

    @property
    def participant(self):
        """Gets the participant of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The participant of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: str
        """
        return self._participant

    @participant.setter
    def participant(self, participant):
        """Sets the participant of this TitaniumGetConsensusRunsRequest.


        :param participant: The participant of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type participant: str
        """

        self._participant = participant

    @property
    def show_archived(self):
        """Gets the show_archived of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The show_archived of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_archived

    @show_archived.setter
    def show_archived(self, show_archived):
        """Sets the show_archived of this TitaniumGetConsensusRunsRequest.


        :param show_archived: The show_archived of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type show_archived: bool
        """

        self._show_archived = show_archived

    @property
    def snap_date_from(self):
        """Gets the snap_date_from of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The snap_date_from of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: str
        """
        return self._snap_date_from

    @snap_date_from.setter
    def snap_date_from(self, snap_date_from):
        """Sets the snap_date_from of this TitaniumGetConsensusRunsRequest.


        :param snap_date_from: The snap_date_from of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type snap_date_from: str
        """

        self._snap_date_from = snap_date_from

    @property
    def snap_date_to(self):
        """Gets the snap_date_to of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The snap_date_to of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: str
        """
        return self._snap_date_to

    @snap_date_to.setter
    def snap_date_to(self, snap_date_to):
        """Sets the snap_date_to of this TitaniumGetConsensusRunsRequest.


        :param snap_date_to: The snap_date_to of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :type snap_date_to: str
        """

        self._snap_date_to = snap_date_to

    @property
    def trace_name(self):
        """Gets the trace_name of this TitaniumGetConsensusRunsRequest.  # noqa: E501


        :return: The trace_name of this TitaniumGetConsensusRunsRequest.  # noqa: E501
        :rtype: str
        """
        return self._trace_name

    @trace_name.setter
    def trace_name(self, trace_name):
        """Sets the trace_name of this TitaniumGetConsensusRunsRequest.


        :param trace_name: The trace_name of this TitaniumGetConsensusRunsRequest.  # noqa: E501
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
        if not isinstance(other, TitaniumGetConsensusRunsRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumGetConsensusRunsRequest):
            return True

        return self.to_dict() != other.to_dict()
