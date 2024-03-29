"""
    clearconsensus-sdk

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import unittest

import openapi_client
from openapi_client.api.file_service_api import FileServiceApi  # noqa: E501


class TestFileServiceApi(unittest.TestCase):
    """FileServiceApi unit test stubs"""

    def setUp(self):
        self.api = FileServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_file_service_file_history(self):
        """Test case for file_service_file_history

        FileHistory retrieves the history for a specified file.  # noqa: E501
        """
        pass

    def test_file_service_file_submission(self):
        """Test case for file_service_file_submission

        FileSubmission submits a file for processing.  # noqa: E501
        """
        pass

    def test_file_service_get_file_delimiter(self):
        """Test case for file_service_get_file_delimiter

        GetFileDelimiter retrieves the delimiter for a specified file.  # noqa: E501
        """
        pass

    def test_file_service_get_file_descriptor(self):
        """Test case for file_service_get_file_descriptor

        GetFileDescriptor retrieves the descriptor for a specified file.  # noqa: E501
        """
        pass

    def test_file_service_get_file_export_url(self):
        """Test case for file_service_get_file_export_url

        GetFileExportUrl retrieves the export URL for a specified file.  # noqa: E501
        """
        pass

    def test_file_service_get_file_preview(self):
        """Test case for file_service_get_file_preview

        GetFilePreview retrieves a preview of a specified file.  # noqa: E501
        """
        pass

    def test_file_service_list_files(self):
        """Test case for file_service_list_files

        ListFiles retrieves a list of files.  # noqa: E501
        """
        pass

    def test_file_service_set_file_delimiter(self):
        """Test case for file_service_set_file_delimiter

        SetFileDelimiter sets the delimiter for a specified file.  # noqa: E501
        """
        pass

    def test_file_service_set_file_descriptor(self):
        """Test case for file_service_set_file_descriptor

        SetFileDescriptor sets the descriptor for a specified file.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
