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

public class demo3 {
	/*
	 Automates the process of logging in to a healthcare service website, navigating to the Lab Results section, selecting a specific lab test, and verifying the displayed results.
	 
	 1. Opens a browser.
	 2. Navigates to the healthcare service website's URL.
	 3. Logs in with valid credentials.
	 4. Clicks on the "Lab Results" section.
	 5. Selects a specific lab test from the available options.
	 6. Verifies the displayed lab test results.
	 */
// Opens a browser
WebUI.openBrowser('')

// Navigates to the healthcare service website's URL
WebUI.navigateToUrl('https://healthcare-service-website.com')

// Logs in with valid credentials
WebUI.setText(findTestObject('input_username'), 'your_username')
WebUI.setText(findTestObject('input_password'), 'your_password')
WebUI.click(findTestObject('button_login'))

// Clicks on the "Lab Results" section
WebUI.click(findTestObject('link_lab_results'))

// Selects a specific lab test from the available options
WebUI.click(findTestObject('dropdown_lab_test'))
WebUI.click(findTestObject('option_specific_lab_test'))

// Verifies the displayed lab test results
WebUI.verifyElementPresent(findTestObject('text_lab_test_results'))
}
