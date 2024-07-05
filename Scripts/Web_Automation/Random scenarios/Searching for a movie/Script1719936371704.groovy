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
 * Automates a series of actions on a movie streaming platform using Selenium WebDriver.
 *
 * Scenario 10: Searching for a movie
 * 1. Opens a browser and navigates to the movie streaming platform's URL: https://www.netflix.com.
 * 2. Enters the title of a movie in the search bar.
 * 3. Clicks on the movie from the search results.
 * 4. Verifies that the movie details are displayed correctly.
 * ...
 */
// Opens a browser and navigates to the movie streaming platform's URL
WebUI.openBrowser('https://www.netflix.com')

// Enters the title of a movie in the search bar
WebUI.setText(findTestObject('input_search_bar'), 'Movie Title')

// Clicks on the movie from the search results
WebUI.click(findTestObject('button_search'))

// Verifies that the movie details are displayed correctly
WebUI.verifyElementPresent(findTestObject('movie_details'))