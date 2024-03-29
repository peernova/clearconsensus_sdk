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


class TitaniumCohortConsensusColumn(object):
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
        'abs_diff_from_consensus': 'object',
        'accepted_max': 'object',
        'accepted_min': 'object',
        'cohort_consensus_price': 'object',
        'cons_abs_diff_from_anchor_evp_mid': 'object',
        'cons_abs_diff_from_anchor_evp_mid_calc': 'object',
        'cons_abs_diff_from_anchor_sub': 'object',
        'cons_abs_diff_from_anchor_trade': 'object',
        'number_of_instruments': 'object',
        'std_dev': 'object',
        'sub_price_diff': 'object'
    }

    attribute_map = {
        'abs_diff_from_consensus': 'absDiffFromConsensus',
        'accepted_max': 'acceptedMax',
        'accepted_min': 'acceptedMin',
        'cohort_consensus_price': 'cohortConsensusPrice',
        'cons_abs_diff_from_anchor_evp_mid': 'consAbsDiffFromAnchorEvpMid',
        'cons_abs_diff_from_anchor_evp_mid_calc': 'consAbsDiffFromAnchorEvpMidCalc',
        'cons_abs_diff_from_anchor_sub': 'consAbsDiffFromAnchorSub',
        'cons_abs_diff_from_anchor_trade': 'consAbsDiffFromAnchorTrade',
        'number_of_instruments': 'numberOfInstruments',
        'std_dev': 'stdDev',
        'sub_price_diff': 'subPriceDiff'
    }

    def __init__(self, abs_diff_from_consensus=None, accepted_max=None, accepted_min=None, cohort_consensus_price=None, cons_abs_diff_from_anchor_evp_mid=None, cons_abs_diff_from_anchor_evp_mid_calc=None, cons_abs_diff_from_anchor_sub=None, cons_abs_diff_from_anchor_trade=None, number_of_instruments=None, std_dev=None, sub_price_diff=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumCohortConsensusColumn - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._abs_diff_from_consensus = None
        self._accepted_max = None
        self._accepted_min = None
        self._cohort_consensus_price = None
        self._cons_abs_diff_from_anchor_evp_mid = None
        self._cons_abs_diff_from_anchor_evp_mid_calc = None
        self._cons_abs_diff_from_anchor_sub = None
        self._cons_abs_diff_from_anchor_trade = None
        self._number_of_instruments = None
        self._std_dev = None
        self._sub_price_diff = None
        self.discriminator = None

        if abs_diff_from_consensus is not None:
            self.abs_diff_from_consensus = abs_diff_from_consensus
        if accepted_max is not None:
            self.accepted_max = accepted_max
        if accepted_min is not None:
            self.accepted_min = accepted_min
        if cohort_consensus_price is not None:
            self.cohort_consensus_price = cohort_consensus_price
        if cons_abs_diff_from_anchor_evp_mid is not None:
            self.cons_abs_diff_from_anchor_evp_mid = cons_abs_diff_from_anchor_evp_mid
        if cons_abs_diff_from_anchor_evp_mid_calc is not None:
            self.cons_abs_diff_from_anchor_evp_mid_calc = cons_abs_diff_from_anchor_evp_mid_calc
        if cons_abs_diff_from_anchor_sub is not None:
            self.cons_abs_diff_from_anchor_sub = cons_abs_diff_from_anchor_sub
        if cons_abs_diff_from_anchor_trade is not None:
            self.cons_abs_diff_from_anchor_trade = cons_abs_diff_from_anchor_trade
        if number_of_instruments is not None:
            self.number_of_instruments = number_of_instruments
        if std_dev is not None:
            self.std_dev = std_dev
        if sub_price_diff is not None:
            self.sub_price_diff = sub_price_diff

    @property
    def abs_diff_from_consensus(self):
        """Gets the abs_diff_from_consensus of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The abs_diff_from_consensus of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._abs_diff_from_consensus

    @abs_diff_from_consensus.setter
    def abs_diff_from_consensus(self, abs_diff_from_consensus):
        """Sets the abs_diff_from_consensus of this TitaniumCohortConsensusColumn.


        :param abs_diff_from_consensus: The abs_diff_from_consensus of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type abs_diff_from_consensus: object
        """

        self._abs_diff_from_consensus = abs_diff_from_consensus

    @property
    def accepted_max(self):
        """Gets the accepted_max of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The accepted_max of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._accepted_max

    @accepted_max.setter
    def accepted_max(self, accepted_max):
        """Sets the accepted_max of this TitaniumCohortConsensusColumn.


        :param accepted_max: The accepted_max of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type accepted_max: object
        """

        self._accepted_max = accepted_max

    @property
    def accepted_min(self):
        """Gets the accepted_min of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The accepted_min of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._accepted_min

    @accepted_min.setter
    def accepted_min(self, accepted_min):
        """Sets the accepted_min of this TitaniumCohortConsensusColumn.


        :param accepted_min: The accepted_min of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type accepted_min: object
        """

        self._accepted_min = accepted_min

    @property
    def cohort_consensus_price(self):
        """Gets the cohort_consensus_price of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The cohort_consensus_price of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._cohort_consensus_price

    @cohort_consensus_price.setter
    def cohort_consensus_price(self, cohort_consensus_price):
        """Sets the cohort_consensus_price of this TitaniumCohortConsensusColumn.


        :param cohort_consensus_price: The cohort_consensus_price of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type cohort_consensus_price: object
        """

        self._cohort_consensus_price = cohort_consensus_price

    @property
    def cons_abs_diff_from_anchor_evp_mid(self):
        """Gets the cons_abs_diff_from_anchor_evp_mid of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The cons_abs_diff_from_anchor_evp_mid of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._cons_abs_diff_from_anchor_evp_mid

    @cons_abs_diff_from_anchor_evp_mid.setter
    def cons_abs_diff_from_anchor_evp_mid(self, cons_abs_diff_from_anchor_evp_mid):
        """Sets the cons_abs_diff_from_anchor_evp_mid of this TitaniumCohortConsensusColumn.


        :param cons_abs_diff_from_anchor_evp_mid: The cons_abs_diff_from_anchor_evp_mid of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type cons_abs_diff_from_anchor_evp_mid: object
        """

        self._cons_abs_diff_from_anchor_evp_mid = cons_abs_diff_from_anchor_evp_mid

    @property
    def cons_abs_diff_from_anchor_evp_mid_calc(self):
        """Gets the cons_abs_diff_from_anchor_evp_mid_calc of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The cons_abs_diff_from_anchor_evp_mid_calc of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._cons_abs_diff_from_anchor_evp_mid_calc

    @cons_abs_diff_from_anchor_evp_mid_calc.setter
    def cons_abs_diff_from_anchor_evp_mid_calc(self, cons_abs_diff_from_anchor_evp_mid_calc):
        """Sets the cons_abs_diff_from_anchor_evp_mid_calc of this TitaniumCohortConsensusColumn.


        :param cons_abs_diff_from_anchor_evp_mid_calc: The cons_abs_diff_from_anchor_evp_mid_calc of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type cons_abs_diff_from_anchor_evp_mid_calc: object
        """

        self._cons_abs_diff_from_anchor_evp_mid_calc = cons_abs_diff_from_anchor_evp_mid_calc

    @property
    def cons_abs_diff_from_anchor_sub(self):
        """Gets the cons_abs_diff_from_anchor_sub of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The cons_abs_diff_from_anchor_sub of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._cons_abs_diff_from_anchor_sub

    @cons_abs_diff_from_anchor_sub.setter
    def cons_abs_diff_from_anchor_sub(self, cons_abs_diff_from_anchor_sub):
        """Sets the cons_abs_diff_from_anchor_sub of this TitaniumCohortConsensusColumn.


        :param cons_abs_diff_from_anchor_sub: The cons_abs_diff_from_anchor_sub of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type cons_abs_diff_from_anchor_sub: object
        """

        self._cons_abs_diff_from_anchor_sub = cons_abs_diff_from_anchor_sub

    @property
    def cons_abs_diff_from_anchor_trade(self):
        """Gets the cons_abs_diff_from_anchor_trade of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The cons_abs_diff_from_anchor_trade of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._cons_abs_diff_from_anchor_trade

    @cons_abs_diff_from_anchor_trade.setter
    def cons_abs_diff_from_anchor_trade(self, cons_abs_diff_from_anchor_trade):
        """Sets the cons_abs_diff_from_anchor_trade of this TitaniumCohortConsensusColumn.


        :param cons_abs_diff_from_anchor_trade: The cons_abs_diff_from_anchor_trade of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type cons_abs_diff_from_anchor_trade: object
        """

        self._cons_abs_diff_from_anchor_trade = cons_abs_diff_from_anchor_trade

    @property
    def number_of_instruments(self):
        """Gets the number_of_instruments of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The number_of_instruments of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._number_of_instruments

    @number_of_instruments.setter
    def number_of_instruments(self, number_of_instruments):
        """Sets the number_of_instruments of this TitaniumCohortConsensusColumn.


        :param number_of_instruments: The number_of_instruments of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type number_of_instruments: object
        """

        self._number_of_instruments = number_of_instruments

    @property
    def std_dev(self):
        """Gets the std_dev of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The std_dev of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._std_dev

    @std_dev.setter
    def std_dev(self, std_dev):
        """Sets the std_dev of this TitaniumCohortConsensusColumn.


        :param std_dev: The std_dev of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type std_dev: object
        """

        self._std_dev = std_dev

    @property
    def sub_price_diff(self):
        """Gets the sub_price_diff of this TitaniumCohortConsensusColumn.  # noqa: E501


        :return: The sub_price_diff of this TitaniumCohortConsensusColumn.  # noqa: E501
        :rtype: object
        """
        return self._sub_price_diff

    @sub_price_diff.setter
    def sub_price_diff(self, sub_price_diff):
        """Sets the sub_price_diff of this TitaniumCohortConsensusColumn.


        :param sub_price_diff: The sub_price_diff of this TitaniumCohortConsensusColumn.  # noqa: E501
        :type sub_price_diff: object
        """

        self._sub_price_diff = sub_price_diff

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
        if not isinstance(other, TitaniumCohortConsensusColumn):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumCohortConsensusColumn):
            return True

        return self.to_dict() != other.to_dict()
