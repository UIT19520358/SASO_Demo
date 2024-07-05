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
Clicks on the "Appointments" section.
Selects the specific appointment to cancel.
Clicks on the "Cancel Appointment" button.
Provides a reason for the cancellation.
Confirms the cancellation request.
Verifies the success message for the appointment cancellation.
*/
// Opens a browser, navigates to the healthcare service website's URL, logs in with valid credentials
WebUI.openBrowser('https://healthcare-service-website.com')
WebUI.setText(findTestObject('login_username_input'), 'your_username')
WebUI.setText(findTestObject('login_password_input'), 'your_password')
WebUI.click(findTestObject('login_button'))

// Clicks on the "Appointments" section
WebUI.click(findTestObject('appointments_section'))

// Selects the specific appointment to cancel
WebUI.click(findTestObject('specific_appointment_to_cancel'))

// Clicks on the "Cancel Appointment" button
WebUI.click(findTestObject('cancel_appointment_button'))

// Provides a reason for the cancellation
WebUI.setText(findTestObject('cancellation_reason_input'), 'Reason for cancellation')

// Confirms the cancellation request
WebUI.click(findTestObject('confirm_cancellation_button'))

// Verifies the success message for the appointment cancellation
WebUI.verifyElementPresent(findTestObject('success_message_for_cancellation'))