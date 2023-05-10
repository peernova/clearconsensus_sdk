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


class TitaniumRuleDefinition(object):
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
        'description': 'str',
        'error': 'TitaniumErrorDefinition',
        'filter': 'str',
        'lookuptable': 'TitaniumDynamicLut',
        'name': 'str',
        'rule': 'str',
        'rule_type': 'str',
        'severity': 'int',
        'tags': 'list[str]'
    }

    attribute_map = {
        'description': 'description',
        'error': 'error',
        'filter': 'filter',
        'lookuptable': 'lookuptable',
        'name': 'name',
        'rule': 'rule',
        'rule_type': 'ruleType',
        'severity': 'severity',
        'tags': 'tags'
    }

    def __init__(self, description=None, error=None, filter=None, lookuptable=None, name=None, rule=None, rule_type=None, severity=None, tags=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumRuleDefinition - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._description = None
        self._error = None
        self._filter = None
        self._lookuptable = None
        self._name = None
        self._rule = None
        self._rule_type = None
        self._severity = None
        self._tags = None
        self.discriminator = None

        if description is not None:
            self.description = description
        if error is not None:
            self.error = error
        if filter is not None:
            self.filter = filter
        if lookuptable is not None:
            self.lookuptable = lookuptable
        if name is not None:
            self.name = name
        if rule is not None:
            self.rule = rule
        if rule_type is not None:
            self.rule_type = rule_type
        if severity is not None:
            self.severity = severity
        if tags is not None:
            self.tags = tags

    @property
    def description(self):
        """Gets the description of this TitaniumRuleDefinition.  # noqa: E501


        :return: The description of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this TitaniumRuleDefinition.


        :param description: The description of this TitaniumRuleDefinition.  # noqa: E501
        :type description: str
        """

        self._description = description

    @property
    def error(self):
        """Gets the error of this TitaniumRuleDefinition.  # noqa: E501


        :return: The error of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: TitaniumErrorDefinition
        """
        return self._error

    @error.setter
    def error(self, error):
        """Sets the error of this TitaniumRuleDefinition.


        :param error: The error of this TitaniumRuleDefinition.  # noqa: E501
        :type error: TitaniumErrorDefinition
        """

        self._error = error

    @property
    def filter(self):
        """Gets the filter of this TitaniumRuleDefinition.  # noqa: E501


        :return: The filter of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """Sets the filter of this TitaniumRuleDefinition.


        :param filter: The filter of this TitaniumRuleDefinition.  # noqa: E501
        :type filter: str
        """

        self._filter = filter

    @property
    def lookuptable(self):
        """Gets the lookuptable of this TitaniumRuleDefinition.  # noqa: E501


        :return: The lookuptable of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: TitaniumDynamicLut
        """
        return self._lookuptable

    @lookuptable.setter
    def lookuptable(self, lookuptable):
        """Sets the lookuptable of this TitaniumRuleDefinition.


        :param lookuptable: The lookuptable of this TitaniumRuleDefinition.  # noqa: E501
        :type lookuptable: TitaniumDynamicLut
        """

        self._lookuptable = lookuptable

    @property
    def name(self):
        """Gets the name of this TitaniumRuleDefinition.  # noqa: E501


        :return: The name of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TitaniumRuleDefinition.


        :param name: The name of this TitaniumRuleDefinition.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def rule(self):
        """Gets the rule of this TitaniumRuleDefinition.  # noqa: E501


        :return: The rule of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: str
        """
        return self._rule

    @rule.setter
    def rule(self, rule):
        """Sets the rule of this TitaniumRuleDefinition.


        :param rule: The rule of this TitaniumRuleDefinition.  # noqa: E501
        :type rule: str
        """

        self._rule = rule

    @property
    def rule_type(self):
        """Gets the rule_type of this TitaniumRuleDefinition.  # noqa: E501


        :return: The rule_type of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: str
        """
        return self._rule_type

    @rule_type.setter
    def rule_type(self, rule_type):
        """Sets the rule_type of this TitaniumRuleDefinition.


        :param rule_type: The rule_type of this TitaniumRuleDefinition.  # noqa: E501
        :type rule_type: str
        """

        self._rule_type = rule_type

    @property
    def severity(self):
        """Gets the severity of this TitaniumRuleDefinition.  # noqa: E501


        :return: The severity of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: int
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """Sets the severity of this TitaniumRuleDefinition.


        :param severity: The severity of this TitaniumRuleDefinition.  # noqa: E501
        :type severity: int
        """

        self._severity = severity

    @property
    def tags(self):
        """Gets the tags of this TitaniumRuleDefinition.  # noqa: E501


        :return: The tags of this TitaniumRuleDefinition.  # noqa: E501
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this TitaniumRuleDefinition.


        :param tags: The tags of this TitaniumRuleDefinition.  # noqa: E501
        :type tags: list[str]
        """

        self._tags = tags

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
        if not isinstance(other, TitaniumRuleDefinition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumRuleDefinition):
            return True

        return self.to_dict() != other.to_dict()
