"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import unittest

import openapi_client
from openapi_client.api.validator_service_api import ValidatorServiceApi  # noqa: E501


class TestValidatorServiceApi(unittest.TestCase):
    """ValidatorServiceApi unit test stubs"""

    def setUp(self):
        self.api = ValidatorServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_validator_service_add_validation_rule(self):
        """Test case for validator_service_add_validation_rule

        AddValidationRule is a method used to add a validation rule to the system. Backoffice users can create a new validation ruleset in the 'global' scope, for each asset class. Participant users can create a new validation ruleset in its own scope, for each asset class. Backoffice users can represent any participant and create a new validation ruleset in that participant's scope. The default scope is used if no scope is given in the request ('global' for the operator, participant scope for that participant user). The authorization will be fetched from the user's token. It will do an update if a validation rule with the same name already exists.  # noqa: E501
        """
        pass

    def test_validator_service_disable_validation_rule(self):
        """Test case for validator_service_disable_validation_rule

        DisableValidationRule method disables a validation rule in the system. The request includes the descriptor name and scope of the rule. Example of Request: { \"descriptor_name\" : \"foreign_exchange-vanilla-forwards\", \"scope\": \"global\" }  # noqa: E501
        """
        pass

    def test_validator_service_enable_validation_rule(self):
        """Test case for validator_service_enable_validation_rule

        EnableValidationRule method enables a validation rule that has been previously disabled. The request includes the descriptor name and scope of the rule. Example of Request: { \"descriptor_name\" : \"foreign_exchange-vanilla-forwards\", \"scope\": \"global\" }  # noqa: E501
        """
        pass

    def test_validator_service_get_generated_validation_rule(self):
        """Test case for validator_service_get_generated_validation_rule

        GetGeneratedValidationRule method allows back office users to view all generated validation rulesets, including Java rulesets. Participant users can only view global generated validation rulesets and rulesets within their own scope. If no scope is given in the request, the default scope is used (\"global\" for operators and participant scope for the participant user). Authorization is fetched from the user's token. This method returns the latest version of the generated ruleset if multiple versions exist.  # noqa: E501
        """
        pass

    def test_validator_service_get_generated_validation_rule_version(self):
        """Test case for validator_service_get_generated_validation_rule_version

        GetGeneratedValidationRuleVersion method allows the user to view a particular version of a generated ruleset. The request requires a descriptor name and a version ID. If the requested ruleset version is not found, an error response is returned.  # noqa: E501
        """
        pass

    def test_validator_service_get_validation_rule(self):
        """Test case for validator_service_get_validation_rule

        GetValidationRule method retrieves information about a validation rule. Both back office users and participant users can view validation rulesets. The default scope is used if no scope is given in the request. Authorization is fetched from the user's token. The rule can be retrieved by either descriptor name or UID. If multiple versions of the rule exist, this method returns the latest version.  # noqa: E501
        """
        pass

    def test_validator_service_get_validation_rule_version(self):
        """Test case for validator_service_get_validation_rule_version

        This is a method that allows both back office users and regular users to retrieve a specific version of a ruleset given the descriptor name and version ID. The ruleset is used for validation purposes and contains criteria and rules for validating data submissions. Back office users can retrieve a particular version of a ruleset from any scope, while participant users can only retrieve a version of a ruleset from either the global scope or their own scope.  # noqa: E501
        """
        pass

    def test_validator_service_list_generated_validation_rule_versions(self):
        """Test case for validator_service_list_generated_validation_rule_versions

        ListGeneratedValidationRuleVersions method returns a list of generated ruleset version IDs along with their creation timestamps. The request requires a descriptor name. If the requested ruleset is not found, an error response is returned.  # noqa: E501
        """
        pass

    def test_validator_service_list_validation_rule_versions(self):
        """Test case for validator_service_list_validation_rule_versions

        ListValidationRuleVersions method is used to retrieve a list of versions for a given validation rule. Both back office users and participant users can retrieve versions of validation rulesets, but the scope will depend on the user. The request must specify the descriptor name for the validation rule. The response will include a list of versions and their created timestamp. If the requested rule is not found, an error response will be returned.  # noqa: E501
        """
        pass

    def test_validator_service_list_validation_rules(self):
        """Test case for validator_service_list_validation_rules

        ListValidationRules method is used to retrieve a list of validation rule names. Both back office users and participant users can retrieve validation rulesets, but the scope and authorization will depend on the user. The default scope is used if no scope is specified in the request. The request may include an optional filter and orderBy parameter to refine the search results. Pagination is also supported. The response will include a list of rule names matching the filter criteria.  # noqa: E501
        """
        pass

    def test_validator_service_rdl_check(self):
        """Test case for validator_service_rdl_check

        RdlCheck method checks the syntax of a given RDL (Rule Description Language) expression. It takes a RdlCheckRequest message as input and returns a MessageResponse message.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
