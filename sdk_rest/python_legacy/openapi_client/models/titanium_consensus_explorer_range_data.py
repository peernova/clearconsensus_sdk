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


class TitaniumConsensusExplorerRangeData(object):
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
        'all_participant_crs_consensus_price': 'TitaniumRangePoint',
        'challenge_overlay_crs_consensus_price': 'TitaniumRangePoint',
        'chart_ranges': 'TitaniumChartRanges',
        'evp_mid': 'TitaniumRangePoint',
        'expert_post_challenge_consensus_price': 'TitaniumRangePoint',
        'expert_pre_challenge_consensus_price': 'TitaniumRangePoint',
        'market_data_crs_consensus_price': 'TitaniumRangePoint',
        'submission_mean_point': 'TitaniumRangePoint',
        'submission_point': 'TitaniumRangePoint'
    }

    attribute_map = {
        'all_participant_crs_consensus_price': 'allParticipantCrsConsensusPrice',
        'challenge_overlay_crs_consensus_price': 'challengeOverlayCrsConsensusPrice',
        'chart_ranges': 'chartRanges',
        'evp_mid': 'evpMid',
        'expert_post_challenge_consensus_price': 'expertPostChallengeConsensusPrice',
        'expert_pre_challenge_consensus_price': 'expertPreChallengeConsensusPrice',
        'market_data_crs_consensus_price': 'marketDataCrsConsensusPrice',
        'submission_mean_point': 'submissionMeanPoint',
        'submission_point': 'submissionPoint'
    }

    def __init__(self, all_participant_crs_consensus_price=None, challenge_overlay_crs_consensus_price=None, chart_ranges=None, evp_mid=None, expert_post_challenge_consensus_price=None, expert_pre_challenge_consensus_price=None, market_data_crs_consensus_price=None, submission_mean_point=None, submission_point=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumConsensusExplorerRangeData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._all_participant_crs_consensus_price = None
        self._challenge_overlay_crs_consensus_price = None
        self._chart_ranges = None
        self._evp_mid = None
        self._expert_post_challenge_consensus_price = None
        self._expert_pre_challenge_consensus_price = None
        self._market_data_crs_consensus_price = None
        self._submission_mean_point = None
        self._submission_point = None
        self.discriminator = None

        if all_participant_crs_consensus_price is not None:
            self.all_participant_crs_consensus_price = all_participant_crs_consensus_price
        if challenge_overlay_crs_consensus_price is not None:
            self.challenge_overlay_crs_consensus_price = challenge_overlay_crs_consensus_price
        if chart_ranges is not None:
            self.chart_ranges = chart_ranges
        if evp_mid is not None:
            self.evp_mid = evp_mid
        if expert_post_challenge_consensus_price is not None:
            self.expert_post_challenge_consensus_price = expert_post_challenge_consensus_price
        if expert_pre_challenge_consensus_price is not None:
            self.expert_pre_challenge_consensus_price = expert_pre_challenge_consensus_price
        if market_data_crs_consensus_price is not None:
            self.market_data_crs_consensus_price = market_data_crs_consensus_price
        if submission_mean_point is not None:
            self.submission_mean_point = submission_mean_point
        if submission_point is not None:
            self.submission_point = submission_point

    @property
    def all_participant_crs_consensus_price(self):
        """Gets the all_participant_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The all_participant_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._all_participant_crs_consensus_price

    @all_participant_crs_consensus_price.setter
    def all_participant_crs_consensus_price(self, all_participant_crs_consensus_price):
        """Sets the all_participant_crs_consensus_price of this TitaniumConsensusExplorerRangeData.


        :param all_participant_crs_consensus_price: The all_participant_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type all_participant_crs_consensus_price: TitaniumRangePoint
        """

        self._all_participant_crs_consensus_price = all_participant_crs_consensus_price

    @property
    def challenge_overlay_crs_consensus_price(self):
        """Gets the challenge_overlay_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The challenge_overlay_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._challenge_overlay_crs_consensus_price

    @challenge_overlay_crs_consensus_price.setter
    def challenge_overlay_crs_consensus_price(self, challenge_overlay_crs_consensus_price):
        """Sets the challenge_overlay_crs_consensus_price of this TitaniumConsensusExplorerRangeData.


        :param challenge_overlay_crs_consensus_price: The challenge_overlay_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type challenge_overlay_crs_consensus_price: TitaniumRangePoint
        """

        self._challenge_overlay_crs_consensus_price = challenge_overlay_crs_consensus_price

    @property
    def chart_ranges(self):
        """Gets the chart_ranges of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The chart_ranges of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumChartRanges
        """
        return self._chart_ranges

    @chart_ranges.setter
    def chart_ranges(self, chart_ranges):
        """Sets the chart_ranges of this TitaniumConsensusExplorerRangeData.


        :param chart_ranges: The chart_ranges of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type chart_ranges: TitaniumChartRanges
        """

        self._chart_ranges = chart_ranges

    @property
    def evp_mid(self):
        """Gets the evp_mid of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The evp_mid of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._evp_mid

    @evp_mid.setter
    def evp_mid(self, evp_mid):
        """Sets the evp_mid of this TitaniumConsensusExplorerRangeData.


        :param evp_mid: The evp_mid of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type evp_mid: TitaniumRangePoint
        """

        self._evp_mid = evp_mid

    @property
    def expert_post_challenge_consensus_price(self):
        """Gets the expert_post_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The expert_post_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._expert_post_challenge_consensus_price

    @expert_post_challenge_consensus_price.setter
    def expert_post_challenge_consensus_price(self, expert_post_challenge_consensus_price):
        """Sets the expert_post_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.


        :param expert_post_challenge_consensus_price: The expert_post_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type expert_post_challenge_consensus_price: TitaniumRangePoint
        """

        self._expert_post_challenge_consensus_price = expert_post_challenge_consensus_price

    @property
    def expert_pre_challenge_consensus_price(self):
        """Gets the expert_pre_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The expert_pre_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._expert_pre_challenge_consensus_price

    @expert_pre_challenge_consensus_price.setter
    def expert_pre_challenge_consensus_price(self, expert_pre_challenge_consensus_price):
        """Sets the expert_pre_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.


        :param expert_pre_challenge_consensus_price: The expert_pre_challenge_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type expert_pre_challenge_consensus_price: TitaniumRangePoint
        """

        self._expert_pre_challenge_consensus_price = expert_pre_challenge_consensus_price

    @property
    def market_data_crs_consensus_price(self):
        """Gets the market_data_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The market_data_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._market_data_crs_consensus_price

    @market_data_crs_consensus_price.setter
    def market_data_crs_consensus_price(self, market_data_crs_consensus_price):
        """Sets the market_data_crs_consensus_price of this TitaniumConsensusExplorerRangeData.


        :param market_data_crs_consensus_price: The market_data_crs_consensus_price of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type market_data_crs_consensus_price: TitaniumRangePoint
        """

        self._market_data_crs_consensus_price = market_data_crs_consensus_price

    @property
    def submission_mean_point(self):
        """Gets the submission_mean_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The submission_mean_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._submission_mean_point

    @submission_mean_point.setter
    def submission_mean_point(self, submission_mean_point):
        """Sets the submission_mean_point of this TitaniumConsensusExplorerRangeData.


        :param submission_mean_point: The submission_mean_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type submission_mean_point: TitaniumRangePoint
        """

        self._submission_mean_point = submission_mean_point

    @property
    def submission_point(self):
        """Gets the submission_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501


        :return: The submission_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :rtype: TitaniumRangePoint
        """
        return self._submission_point

    @submission_point.setter
    def submission_point(self, submission_point):
        """Sets the submission_point of this TitaniumConsensusExplorerRangeData.


        :param submission_point: The submission_point of this TitaniumConsensusExplorerRangeData.  # noqa: E501
        :type submission_point: TitaniumRangePoint
        """

        self._submission_point = submission_point

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
        if not isinstance(other, TitaniumConsensusExplorerRangeData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumConsensusExplorerRangeData):
            return True

        return self.to_dict() != other.to_dict()