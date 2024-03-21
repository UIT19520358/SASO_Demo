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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_username'), 'John DOe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Visit Date (Required)_col-sm-4'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_29'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), 'Demo')

WebUI.takeScreenshotAsCheckpoint('New Demo')

/*
 *  Automates a series of actions on a healthcare service website using Katalon Studio.
 *
 *  1. Opens a browser.
 *  2. Navigates to a specific URL.
 *  3. Clicks on "Make Appointment" link.
 *  4. Sets text in the username field.
 *  5. Sets encrypted text in the password field.
 *  6. Clicks on the login button.
 *  7. Clicks on "Make Appointment" heading.
 *  8. Verifies the text of the "Make Appointment" heading.
 *  9. Selects an option by value in a dropdown.
 *  10. Clicks on checkboxes for hospital readmission and programs.
 *  11. Selects a visit date from a calendar.
 *  12. Enters text in the comment textarea.
 *  13. Takes a screenshot as a checkpoint named "New Demo".
 */
