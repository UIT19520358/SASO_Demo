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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))

SearchText = WebUI.getText(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Test any type of app with a single all-_2fdae6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Resources'))

WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Product Documentation'))

println(SearchText)

WebUI.switchToWindowTitle('About Katalon Platform | Katalon Docs')

WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/span_Search'))

WebUI.setText(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/input_Cancel_docsearch-input'), 
    SearchText)

WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/span_Mobile  Get Element Height'))
/*
 *  This script opens a browser, navigates to a specific URL, interacts with elements on the page, retrieves text, and performs various actions.
 *
 *  @param SearchText The text to be searched on the page
 */

// Open a browser
WebUI.openBrowser('')

// Navigate to a specific URL
WebUI.navigateToUrl('https://katalon.com/')

// Click on the "Accept All Cookies" button
WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))

// Get text from a specific element on the page
SearchText = WebUI.getText(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Test any type of app with a single all-_2fdae6'),
FailureHandling.STOP_ON_FAILURE)

// Hover over a specific element on the page
WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Resources'))

// Click on the "Product Documentation" link
WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Product Documentation'))

// Print the retrieved text
println(SearchText)

// Switch to a specific window title
WebUI.switchToWindowTitle('About Katalon Platform | Katalon Docs')

// Click on the "Search" button
WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/span_Search'))

// Set text in the search input field
WebUI.setText(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/input_Cancel_docsearch-input'),
SearchText)

// Click on the "Mobile - Get Element Height" link
WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/span_Mobile  Get Element Height'))
