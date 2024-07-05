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

public class demo7 {
	/*
	 Automates the process of contacting customer support on a healthcare service website.
	 
	 1. Opens a browser.
	 2. Navigates to the healthcare service website's URL.
	 3. Clicks on the "Contact Us" section.
	 4. Enters the necessary contact details.
	 5. Writes the message to customer support.
	 6. Submits the contact form.
	 7. Verifies the success message for contacting customer support.
	 */
// Opens a browser, navigates to the healthcare service website's URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://healthcareservice.com')

// Clicks on the "Contact Us" section
WebUI.click(findTestObject('healthcare/contact_us_button'))

// Enters the necessary contact details
WebUI.setText(findTestObject('healthcare/name_input'), 'John Doe')
WebUI.setText(findTestObject('healthcare/email_input'), 'johndoe@example.com')
WebUI.setText(findTestObject('healthcare/phone_input'), '1234567890')

// Writes the message to customer support
WebUI.setText(findTestObject('healthcare/message_input'), 'This is a test message for customer support.')

// Submits the contact form
WebUI.click(findTestObject('healthcare/submit_button'))

// Verifies the success message for contacting customer support
WebUI.verifyElementPresent(findTestObject('healthcare/success_message'))
}
