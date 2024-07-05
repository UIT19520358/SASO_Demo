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

public class demo5 {
	/*
	 * Automates a series of actions on a job search website using Selenium WebDriver.
	 *
	 * Scenario 8: Applying for a job
	 * 1. Opens a browser and navigates to the job search website's URL.
	 * 2. Searches for a job using the search bar.
	 * 3. Clicks on a job listing from the search results.
	 * 4. Applies for the job by submitting the application form.
	 * 5. Verifies that the application is successfully submitted.
	 * ...
	 */
// Opens a browser and navigates to the job search website's URL
WebUI.openBrowser('')

// Navigates to the job search website's URL
WebUI.navigateToUrl('https://www.example.com')

// Searches for a job using the search bar
WebUI.setText(findTestObject('input_searchBar'), 'Software Engineer')

// Clicks on a job listing from the search results
WebUI.click(findTestObject('link_jobListing'))

// Applies for the job by submitting the application form
WebUI.click(findTestObject('button_apply'))

// Verifies that the application is successfully submitted
WebUI.verifyElementPresent(findTestObject('text_applicationSubmittedMessage'))
}
