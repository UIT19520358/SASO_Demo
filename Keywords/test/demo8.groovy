package test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class demo8 {
	/*
	 Opens a browser.
	 Navigates to the healthcare service website's URL.
	 Logs in with valid credentials.
	 Clicks on the user profile section.
	 Edits the user's contact information.
	 Saves the updated profile information.
	 Verifies the successful update message.
	 */
// Opens a browser and navigates to the healthcare service website's URL
WebUI.openBrowser('https://healthcareservice.com')

// Logs in with valid credentials
WebUI.setText(findTestObject('input_username'), 'your_username')
WebUI.setText(findTestObject('input_password'), 'your_password')
WebUI.click(findTestObject('button_login'))

// Clicks on the user profile section
WebUI.click(findTestObject('link_user_profile'))

// Edits the user's contact information
WebUI.setText(findTestObject('input_contact_info'), 'new_contact_info')

// Saves the updated profile information
WebUI.click(findTestObject('button_save_profile'))

// Verifies the successful update message
WebUI.verifyElementPresent(findTestObject('message_update_success'))
}
