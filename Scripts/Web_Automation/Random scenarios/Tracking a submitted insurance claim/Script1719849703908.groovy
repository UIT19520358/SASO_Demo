import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
Opens a browser.
Navigates to the healthcare service website's URL.
Logs in with valid credentials.
Clicks on the "Insurance" section.
Selects the "Claims" option.
Searches for a specific claim by claim number or patient information.
Clicks on the desired claim from the search results.
Verifies the details of the claim, such as claim status, amounts, and dates.
Downloads the claim documentation or summary if available.
Logs out of the account.
*/
// Open a browser
WebUI.openBrowser('')

// Navigate to the healthcare service website's URL
WebUI.navigateToUrl('https://healthcare-service-website.com')

// Log in with valid credentials
WebUI.setText(findTestObject('Page_Login/input_Username'), 'your_username')
WebUI.setText(findTestObject('Page_Login/input_Password'), 'your_password')
WebUI.click(findTestObject('Page_Login/button_Login'))

// Click on the "Insurance" section
WebUI.click(findTestObject('Page_Home/button_Insurance'))

// Select the "Claims" option
WebUI.click(findTestObject('Page_Insurance/button_Claims'))

// Search for a specific claim by claim number or patient information
WebUI.setText(findTestObject('Page_Claims/input_Search'), 'specific_claim_info')
WebUI.click(findTestObject('Page_Claims/button_Search'))

// Click on the desired claim from the search results
WebUI.click(findTestObject('Page_Claims/link_DesiredClaim'))

// Verify the details of the claim
// Add verification steps for claim status, amounts, and dates

// Download the claim documentation or summary if available
WebUI.click(findTestObject('Page_ClaimDetails/button_Download'))

// Log out of the account
WebUI.click(findTestObject('Page_Account/button_Logout'))