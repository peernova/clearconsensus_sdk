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


class TitaniumExpertExplorerTableColumn(object):
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
        'abs_diff_from_expert_cohort_mean': 'object',
        'max': 'object',
        'mean': 'object',
        'min': 'object',
        'participant_instruments_count': 'str',
        'std_dev': 'object',
        'sub_price_diff': 'object'
    }

    attribute_map = {
        'abs_diff_from_expert_cohort_mean': 'absDiffFromExpertCohortMean',
        'max': 'max',
        'mean': 'mean',
        'min': 'min',
        'participant_instruments_count': 'participantInstrumentsCount',
        'std_dev': 'stdDev',
        'sub_price_diff': 'subPriceDiff'
    }

    def __init__(self, abs_diff_from_expert_cohort_mean=None, max=None, mean=None, min=None, participant_instruments_count=None, std_dev=None, sub_price_diff=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumExpertExplorerTableColumn - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._abs_diff_from_expert_cohort_mean = None
        self._max = None
        self._mean = None
        self._min = None
        self._participant_instruments_count = None
        self._std_dev = None
        self._sub_price_diff = None
        self.discriminator = None

        if abs_diff_from_expert_cohort_mean is not None:
            self.abs_diff_from_expert_cohort_mean = abs_diff_from_expert_cohort_mean
        if max is not None:
            self.max = max
        if mean is not None:
            self.mean = mean
        if min is not None:
            self.min = min
        if participant_instruments_count is not None:
            self.participant_instruments_count = participant_instruments_count
        if std_dev is not None:
            self.std_dev = std_dev
        if sub_price_diff is not None:
            self.sub_price_diff = sub_price_diff

    @property
    def abs_diff_from_expert_cohort_mean(self):
        """Gets the abs_diff_from_expert_cohort_mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The abs_diff_from_expert_cohort_mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._abs_diff_from_expert_cohort_mean

    @abs_diff_from_expert_cohort_mean.setter
    def abs_diff_from_expert_cohort_mean(self, abs_diff_from_expert_cohort_mean):
        """Sets the abs_diff_from_expert_cohort_mean of this TitaniumExpertExplorerTableColumn.


        :param abs_diff_from_expert_cohort_mean: The abs_diff_from_expert_cohort_mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type abs_diff_from_expert_cohort_mean: object
        """

        self._abs_diff_from_expert_cohort_mean = abs_diff_from_expert_cohort_mean

    @property
    def max(self):
        """Gets the max of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The max of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._max

    @max.setter
    def max(self, max):
        """Sets the max of this TitaniumExpertExplorerTableColumn.


        :param max: The max of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type max: object
        """

        self._max = max

    @property
    def mean(self):
        """Gets the mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._mean

    @mean.setter
    def mean(self, mean):
        """Sets the mean of this TitaniumExpertExplorerTableColumn.


        :param mean: The mean of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type mean: object
        """

        self._mean = mean

    @property
    def min(self):
        """Gets the min of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The min of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._min

    @min.setter
    def min(self, min):
        """Sets the min of this TitaniumExpertExplorerTableColumn.


        :param min: The min of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type min: object
        """

        self._min = min

    @property
    def participant_instruments_count(self):
        """Gets the participant_instruments_count of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The participant_instruments_count of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: str
        """
        return self._participant_instruments_count

    @participant_instruments_count.setter
    def participant_instruments_count(self, participant_instruments_count):
        """Sets the participant_instruments_count of this TitaniumExpertExplorerTableColumn.


        :param participant_instruments_count: The participant_instruments_count of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type participant_instruments_count: str
        """

        self._participant_instruments_count = participant_instruments_count

    @property
    def std_dev(self):
        """Gets the std_dev of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The std_dev of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._std_dev

    @std_dev.setter
    def std_dev(self, std_dev):
        """Sets the std_dev of this TitaniumExpertExplorerTableColumn.


        :param std_dev: The std_dev of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :type std_dev: object
        """

        self._std_dev = std_dev

    @property
    def sub_price_diff(self):
        """Gets the sub_price_diff of this TitaniumExpertExplorerTableColumn.  # noqa: E501


        :return: The sub_price_diff of this TitaniumExpertExplorerTableColumn.  # noqa: E501
        :rtype: object
        """
        return self._sub_price_diff

    @sub_price_diff.setter
    def sub_price_diff(self, sub_price_diff):
        """Sets the sub_price_diff of this TitaniumExpertExplorerTableColumn.


        :param sub_price_diff: The sub_price_diff of this TitaniumExpertExplorerTableColumn.  # noqa: E501
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
        if not isinstance(other, TitaniumExpertExplorerTableColumn):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumExpertExplorerTableColumn):
            return True

        return self.to_dict() != other.to_dict()