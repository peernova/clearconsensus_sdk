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


class TitaniumFileAnnotation(object):
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
        'annotation': 'object',
        'asset': 'TitaniumAssetDetails',
        'chunks': 'list[TitaniumChunk]',
        'client': 'str',
        'file_name': 'str',
        'mode': 'str',
        'upload_time': 'str'
    }

    attribute_map = {
        'annotation': 'annotation',
        'asset': 'asset',
        'chunks': 'chunks',
        'client': 'client',
        'file_name': 'fileName',
        'mode': 'mode',
        'upload_time': 'uploadTime'
    }

    def __init__(self, annotation=None, asset=None, chunks=None, client=None, file_name=None, mode=None, upload_time=None, local_vars_configuration=None):  # noqa: E501
        """TitaniumFileAnnotation - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._annotation = None
        self._asset = None
        self._chunks = None
        self._client = None
        self._file_name = None
        self._mode = None
        self._upload_time = None
        self.discriminator = None

        if annotation is not None:
            self.annotation = annotation
        if asset is not None:
            self.asset = asset
        if chunks is not None:
            self.chunks = chunks
        if client is not None:
            self.client = client
        if file_name is not None:
            self.file_name = file_name
        if mode is not None:
            self.mode = mode
        if upload_time is not None:
            self.upload_time = upload_time

    @property
    def annotation(self):
        """Gets the annotation of this TitaniumFileAnnotation.  # noqa: E501


        :return: The annotation of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: object
        """
        return self._annotation

    @annotation.setter
    def annotation(self, annotation):
        """Sets the annotation of this TitaniumFileAnnotation.


        :param annotation: The annotation of this TitaniumFileAnnotation.  # noqa: E501
        :type annotation: object
        """

        self._annotation = annotation

    @property
    def asset(self):
        """Gets the asset of this TitaniumFileAnnotation.  # noqa: E501


        :return: The asset of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: TitaniumAssetDetails
        """
        return self._asset

    @asset.setter
    def asset(self, asset):
        """Sets the asset of this TitaniumFileAnnotation.


        :param asset: The asset of this TitaniumFileAnnotation.  # noqa: E501
        :type asset: TitaniumAssetDetails
        """

        self._asset = asset

    @property
    def chunks(self):
        """Gets the chunks of this TitaniumFileAnnotation.  # noqa: E501


        :return: The chunks of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: list[TitaniumChunk]
        """
        return self._chunks

    @chunks.setter
    def chunks(self, chunks):
        """Sets the chunks of this TitaniumFileAnnotation.


        :param chunks: The chunks of this TitaniumFileAnnotation.  # noqa: E501
        :type chunks: list[TitaniumChunk]
        """

        self._chunks = chunks

    @property
    def client(self):
        """Gets the client of this TitaniumFileAnnotation.  # noqa: E501


        :return: The client of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this TitaniumFileAnnotation.


        :param client: The client of this TitaniumFileAnnotation.  # noqa: E501
        :type client: str
        """

        self._client = client

    @property
    def file_name(self):
        """Gets the file_name of this TitaniumFileAnnotation.  # noqa: E501


        :return: The file_name of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name):
        """Sets the file_name of this TitaniumFileAnnotation.


        :param file_name: The file_name of this TitaniumFileAnnotation.  # noqa: E501
        :type file_name: str
        """

        self._file_name = file_name

    @property
    def mode(self):
        """Gets the mode of this TitaniumFileAnnotation.  # noqa: E501


        :return: The mode of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """Sets the mode of this TitaniumFileAnnotation.


        :param mode: The mode of this TitaniumFileAnnotation.  # noqa: E501
        :type mode: str
        """

        self._mode = mode

    @property
    def upload_time(self):
        """Gets the upload_time of this TitaniumFileAnnotation.  # noqa: E501


        :return: The upload_time of this TitaniumFileAnnotation.  # noqa: E501
        :rtype: str
        """
        return self._upload_time

    @upload_time.setter
    def upload_time(self, upload_time):
        """Sets the upload_time of this TitaniumFileAnnotation.


        :param upload_time: The upload_time of this TitaniumFileAnnotation.  # noqa: E501
        :type upload_time: str
        """

        self._upload_time = upload_time

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
        if not isinstance(other, TitaniumFileAnnotation):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TitaniumFileAnnotation):
            return True

        return self.to_dict() != other.to_dict()
