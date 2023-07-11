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


class TitaniumOnBoardRequest(object):
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
        'authorized': 'TitaniumAssetsList',
        'client': 'str',
        'password': 'str',
        'public_key': 'str',
        'username': 'str'
    }

    attribute_map = {
        'authorized': 'authorized',
        'client': 'client',
        'password': 'password',
        'public_key': 'publicKey',
        'username': 'username'
    }

    def __init__(self, authorized=None, client=None, password=None, public_key=None, username=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumOnBoardRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._authorized = None
        self._client = None
        self._password = None
        self._public_key = None
        self._username = None
        self.discriminator = None

        if authorized is not None:
            self.authorized = authorized
        if client is not None:
            self.client = client
        if password is not None:
            self.password = password
        if public_key is not None:
            self.public_key = public_key
        if username is not None:
            self.username = username

    @property
    def authorized(self):
        """Gets the authorized of this TitaniumOnBoardRequest.  # noqa: E501


        :return: The authorized of this TitaniumOnBoardRequest.  # noqa: E501
        :rtype: TitaniumAssetsList
        """
        return self._authorized

    @authorized.setter
    def authorized(self, authorized):
        """Sets the authorized of this TitaniumOnBoardRequest.


        :param authorized: The authorized of this TitaniumOnBoardRequest.  # noqa: E501
        :type authorized: TitaniumAssetsList
        """

        self._authorized = authorized

    @property
    def client(self):
        """Gets the client of this TitaniumOnBoardRequest.  # noqa: E501


        :return: The client of this TitaniumOnBoardRequest.  # noqa: E501
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this TitaniumOnBoardRequest.


        :param client: The client of this TitaniumOnBoardRequest.  # noqa: E501
        :type client: str
        """

        self._client = client

    @property
    def password(self):
        """Gets the password of this TitaniumOnBoardRequest.  # noqa: E501


        :return: The password of this TitaniumOnBoardRequest.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this TitaniumOnBoardRequest.


        :param password: The password of this TitaniumOnBoardRequest.  # noqa: E501
        :type password: str
        """

        self._password = password

    @property
    def public_key(self):
        """Gets the public_key of this TitaniumOnBoardRequest.  # noqa: E501


        :return: The public_key of this TitaniumOnBoardRequest.  # noqa: E501
        :rtype: str
        """
        return self._public_key

    @public_key.setter
    def public_key(self, public_key):
        """Sets the public_key of this TitaniumOnBoardRequest.


        :param public_key: The public_key of this TitaniumOnBoardRequest.  # noqa: E501
        :type public_key: str
        """

        self._public_key = public_key

    @property
    def username(self):
        """Gets the username of this TitaniumOnBoardRequest.  # noqa: E501


        :return: The username of this TitaniumOnBoardRequest.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this TitaniumOnBoardRequest.


        :param username: The username of this TitaniumOnBoardRequest.  # noqa: E501
        :type username: str
        """

        self._username = username

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
        if not isinstance(other, TitaniumOnBoardRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumOnBoardRequest):
            return True

        return self.to_dict() != other.to_dict()