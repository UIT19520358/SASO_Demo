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

public class demo2 {
	/*
	 Purpose of the code is to add a new family member to the user's profile on a healthcare service website.
	 1. Opens a browser and navigates to the healthcare service website's URL.
	 2. Logs in with valid credentials.
	 3. Clicks on the user profile section and selects the "Family Members" option.
	 4. Clicks on the "Add New" button and enters the necessary details for the new family member.
	 5. Saves the new family member information and verifies the success message for adding a new family member.
	 */
	// Open browser and navigate to the healthcare service website's URL
	WebUI.openBrowser('')

	// Navigate to the healthcare service website's URL
	WebUI.navigateToUrl('https://healthcareservice.com')

	// Log in with valid credentials
	WebUI.setText(findTestObject('login_username_field'), 'your_username')
	WebUI.setEncryptedText(findTestObject('login_password_field'), 'your_password')
	WebUI.click(findTestObject('login_button'))

	// Click on the user profile section
	WebUI.click(findTestObject('user_profile_section'))

	// Select the "Family Members" option
	WebUI.click(findTestObject('family_members_option'))

	// Click on the "Add New" button
	WebUI.click(findTestObject('add_new_button'))

	// Enter necessary details for the new family member
	WebUI.setText(findTestObject('family_member_name_field'), 'Family Member Name')
	WebUI.setText(findTestObject('family_member_relation_field'), 'Relation')
	WebUI.setText(findTestObject('family_member_dob_field'), 'Date of Birth')

	// Save the new family member information
	WebUI.click(findTestObject('save_button'))

	// Verify the success message for adding a new family member
	WebUI.verifyElementPresent(findTestObject('success_message'))
}
