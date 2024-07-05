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
Enters a specific service name in the search field.
Clicks on the search button.
Verifies the search results for the specific service.
Close browser either test run fail or pass
*/
// Open a browser
WebUI.openBrowser('')

// Navigate to the healthcare service website's URL
WebUI.navigateToUrl('https://www.healthcareservicewebsite.com')

// Enter a specific service name in the search field
WebUI.setText(findTestObject('Page_HealthcareService/input_Search'), 'Specific Service Name')

// Click on the search button
WebUI.click(findTestObject('Page_HealthcareService/button_Search'))

// Verify the search results for the specific service
WebUI.verifyElementPresent(findTestObject('Page_HealthcareService/text_SearchResult'))

// Close browser
WebUI.closeBrowser()