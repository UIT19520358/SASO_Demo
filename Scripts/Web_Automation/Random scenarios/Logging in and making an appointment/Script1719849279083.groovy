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
Scenario 1: Logging in and making an appointment
Opens a browser.
Navigates to the healthcare service website's URL.
Clicks on the "Login" button.
Sets text in the username field.
Sets encrypted text in the password field.
Clicks on the login button.
Clicks on the "Make Appointment" link.
Selects a doctor from the available options.
Selects a visit date from a calendar.
Enters symptoms in the symptom textarea.
Clicks on the "Book Appointment" button.
Verifies the success message for the appointment booking.
 */
// Open a browser
WebUI.openBrowser('')

// Navigate to the healthcare service website's URL
WebUI.navigateToUrl('https://healthcare-service-website.com')

// Click on the "Login" button
WebUI.click(findTestObject('button_Login'))

// Set text in the username field
WebUI.setText(findTestObject('input_Username'), 'your_username')

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('input_Password'), 'your_encrypted_password')

// Click on the login button
WebUI.click(findTestObject('button_LoginSubmit'))

// Click on the "Make Appointment" link
WebUI.click(findTestObject('link_MakeAppointment'))

// Select a doctor from the available options
WebUI.selectOptionByValue(findTestObject('dropdown_Doctor'), 'doctor_value')

// Select a visit date from a calendar
WebUI.click(findTestObject('calendar_DatePicker'))
WebUI.click(findTestObject('date_SelectedDate'))

// Enter symptoms in the symptom textarea
WebUI.setText(findTestObject('textarea_Symptoms'), 'your_symptoms')

// Click on the "Book Appointment" button
WebUI.click(findTestObject('button_BookAppointment'))

// Verify the success message for the appointment booking
WebUI.verifyElementText(findTestObject('message_Success'), 'Appointment booked successfully')

//Close browser after test run done
/*
 *  Close browser after test run done
 */
// Close the current browser
WebUI.closeBrowser()