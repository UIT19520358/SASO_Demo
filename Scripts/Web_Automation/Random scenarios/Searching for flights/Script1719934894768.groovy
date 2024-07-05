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
 * Automates a series of actions on a travel booking website using Selenium WebDriver.
 *
 * Scenario 3: Searching for flights
 * 1. Opens a browser and navigates to the travel booking website's URL: https://www.expedia.com.
 * 2. Selects the "Flights" tab.
 * 3. Enters the departure and destination airports.
 * 4. Selects the travel dates.
 * 5. Clicks the "Search" button.
 * 6. Verifies that the search results are displayed.
 * ...
 */
// Opens a browser and navigates to the travel booking website's URL
WebUI.openBrowser('https://www.expedia.com')

// Selects the "Flights" tab
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E'))

// Enters the departure and destination airports
WebUI.setText(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/input-Flight origin-input'), 'Departure Airport')
WebUI.setText(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/input-Flight destination-input'), 'Destination Airport')

// Selects the travel dates
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/input-Flight departure-input'))
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/span-Next month'))
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/span-Next month'))
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/div-15'))

// Clicks the "Search" button
WebUI.click(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/button-Search flights'))

// Verifies that the search results are displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Expedia/Page_Expedia Flights, Hotels, Cars and Cruises - E/div-Search results'))