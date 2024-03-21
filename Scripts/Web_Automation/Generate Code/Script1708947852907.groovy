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
 *  1. Open a browser with an empty URL.
 *  2. Navigate to 'https://katalon.com/'.
 *  3. Click on the 'Accept All Cookies' button.
 *  4. Get the text from a specific element on the page.
 *  5. Hover the mouse over the 'Resources' section.
 *  6. Click on the 'Product Documentation' section.
 */
// Open a browser with an empty URL
WebUI.openBrowser('')

// Navigate to 'https://katalon.com/'
WebUI.navigateToUrl('https://katalon.com/')

// Click on the 'Accept All Cookies' button
WebUI.click(findTestObject('Page_Katalon - Intelligent Test Automation/Accept All Cookies Button'))

// Get the text from a specific element on the page
String elementText = WebUI.getText(findTestObject('Page_Katalon - Intelligent Test Automation/Specific Element'))

// Hover the mouse over the 'Resources' section
WebUI.moveToElement(findTestObject('Page_Katalon - Intelligent Test Automation/Resources Section'))

// Click on the 'Product Documentation' section
WebUI.click(findTestObject('Page_Katalon - Intelligent Test Automation/Product Documentation Section'))
