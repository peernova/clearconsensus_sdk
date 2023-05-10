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


class TitaniumConsensusHistogram(object):
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
        'high_severity': 'TitaniumPredefinedFilter',
        'no_consensus': 'TitaniumPredefinedFilter',
        'non_outliers': 'TitaniumPredefinedFilter',
        'outliers': 'TitaniumPredefinedFilter',
        'rows': 'int',
        'total_parse_errors': 'int'
    }

    attribute_map = {
        'high_severity': 'highSeverity',
        'no_consensus': 'noConsensus',
        'non_outliers': 'nonOutliers',
        'outliers': 'outliers',
        'rows': 'rows',
        'total_parse_errors': 'totalParseErrors'
    }

    def __init__(self, high_severity=None, no_consensus=None, non_outliers=None, outliers=None, rows=None, total_parse_errors=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumConsensusHistogram - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._high_severity = None
        self._no_consensus = None
        self._non_outliers = None
        self._outliers = None
        self._rows = None
        self._total_parse_errors = None
        self.discriminator = None

        if high_severity is not None:
            self.high_severity = high_severity
        if no_consensus is not None:
            self.no_consensus = no_consensus
        if non_outliers is not None:
            self.non_outliers = non_outliers
        if outliers is not None:
            self.outliers = outliers
        if rows is not None:
            self.rows = rows
        if total_parse_errors is not None:
            self.total_parse_errors = total_parse_errors

    @property
    def high_severity(self):
        """Gets the high_severity of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The high_severity of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: TitaniumPredefinedFilter
        """
        return self._high_severity

    @high_severity.setter
    def high_severity(self, high_severity):
        """Sets the high_severity of this TitaniumConsensusHistogram.


        :param high_severity: The high_severity of this TitaniumConsensusHistogram.  # noqa: E501
        :type high_severity: TitaniumPredefinedFilter
        """

        self._high_severity = high_severity

    @property
    def no_consensus(self):
        """Gets the no_consensus of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The no_consensus of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: TitaniumPredefinedFilter
        """
        return self._no_consensus

    @no_consensus.setter
    def no_consensus(self, no_consensus):
        """Sets the no_consensus of this TitaniumConsensusHistogram.


        :param no_consensus: The no_consensus of this TitaniumConsensusHistogram.  # noqa: E501
        :type no_consensus: TitaniumPredefinedFilter
        """

        self._no_consensus = no_consensus

    @property
    def non_outliers(self):
        """Gets the non_outliers of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The non_outliers of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: TitaniumPredefinedFilter
        """
        return self._non_outliers

    @non_outliers.setter
    def non_outliers(self, non_outliers):
        """Sets the non_outliers of this TitaniumConsensusHistogram.


        :param non_outliers: The non_outliers of this TitaniumConsensusHistogram.  # noqa: E501
        :type non_outliers: TitaniumPredefinedFilter
        """

        self._non_outliers = non_outliers

    @property
    def outliers(self):
        """Gets the outliers of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The outliers of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: TitaniumPredefinedFilter
        """
        return self._outliers

    @outliers.setter
    def outliers(self, outliers):
        """Sets the outliers of this TitaniumConsensusHistogram.


        :param outliers: The outliers of this TitaniumConsensusHistogram.  # noqa: E501
        :type outliers: TitaniumPredefinedFilter
        """

        self._outliers = outliers

    @property
    def rows(self):
        """Gets the rows of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The rows of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: int
        """
        return self._rows

    @rows.setter
    def rows(self, rows):
        """Sets the rows of this TitaniumConsensusHistogram.


        :param rows: The rows of this TitaniumConsensusHistogram.  # noqa: E501
        :type rows: int
        """

        self._rows = rows

    @property
    def total_parse_errors(self):
        """Gets the total_parse_errors of this TitaniumConsensusHistogram.  # noqa: E501


        :return: The total_parse_errors of this TitaniumConsensusHistogram.  # noqa: E501
        :rtype: int
        """
        return self._total_parse_errors

    @total_parse_errors.setter
    def total_parse_errors(self, total_parse_errors):
        """Sets the total_parse_errors of this TitaniumConsensusHistogram.


        :param total_parse_errors: The total_parse_errors of this TitaniumConsensusHistogram.  # noqa: E501
        :type total_parse_errors: int
        """

        self._total_parse_errors = total_parse_errors

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
        if not isinstance(other, TitaniumConsensusHistogram):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumConsensusHistogram):
            return True

        return self.to_dict() != other.to_dict()
