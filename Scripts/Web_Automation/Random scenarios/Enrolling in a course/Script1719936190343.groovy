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
 * Automates a series of actions on an online learning platform using Selenium WebDriver.
 *
 * Scenario 6: Enrolling in a course
 * 1. Opens a browser and navigates to the online learning platform's URL: https://www.udemy.com.
 * 2. Searches for a course using the search bar.
 * 3. Clicks on a course from the search results.
 * 4. Clicks the "Enroll" button.
 * 5. Verifies that the user is successfully enrolled in the course.
 * ...
 */
// Opens a browser and navigates to the online learning platform's URL
WebUI.openBrowser('https://www.udemy.com')

// Searches for a course using the search bar
WebUI.setText(findTestObject('input_search_bar'), 'Course Name')
WebUI.sendKeys(findTestObject('input_search_bar'), Keys.chord(Keys.ENTER))

// Clicks on a course from the search results
WebUI.click(findTestObject('course_search_result'))

// Clicks the "Enroll" button
WebUI.click(findTestObject('button_enroll'))

// Verifies that the user is successfully enrolled in the course
WebUI.verifyElementPresent(findTestObject('success_message_enrolled'))