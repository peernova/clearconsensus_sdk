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


class TitaniumRunWorkflowResponse(object):
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
        'run_id': 'str',
        'workflow_id': 'str'
    }

    attribute_map = {
        'run_id': 'runId',
        'workflow_id': 'workflowId'
    }

    def __init__(self, run_id=None, workflow_id=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumRunWorkflowResponse - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._run_id = None
        self._workflow_id = None
        self.discriminator = None

        if run_id is not None:
            self.run_id = run_id
        if workflow_id is not None:
            self.workflow_id = workflow_id

    @property
    def run_id(self):
        """Gets the run_id of this TitaniumRunWorkflowResponse.  # noqa: E501


        :return: The run_id of this TitaniumRunWorkflowResponse.  # noqa: E501
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """Sets the run_id of this TitaniumRunWorkflowResponse.


        :param run_id: The run_id of this TitaniumRunWorkflowResponse.  # noqa: E501
        :type run_id: str
        """

        self._run_id = run_id

    @property
    def workflow_id(self):
        """Gets the workflow_id of this TitaniumRunWorkflowResponse.  # noqa: E501


        :return: The workflow_id of this TitaniumRunWorkflowResponse.  # noqa: E501
        :rtype: str
        """
        return self._workflow_id

    @workflow_id.setter
    def workflow_id(self, workflow_id):
        """Sets the workflow_id of this TitaniumRunWorkflowResponse.


        :param workflow_id: The workflow_id of this TitaniumRunWorkflowResponse.  # noqa: E501
        :type workflow_id: str
        """

        self._workflow_id = workflow_id

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
        if not isinstance(other, TitaniumRunWorkflowResponse):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumRunWorkflowResponse):
            return True

        return self.to_dict() != other.to_dict()
