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
 * Automates a series of actions on a healthcare service website using Katalon Studio.
 *
 * Scenario 11: Resetting user password
 * 1. Opens a browser.
 * 2. Navigates to the healthcare service website's URL.
 * 3. Clicks on the "Forgot Password" link.
 * 4. Enters the registered email address for password reset.
 * 5. Submits the password reset request.
 * 6. Checks the email for a password reset link.
 * 7. Clicks on the password reset link in the email.
 * 8. Sets a new password for the user.
 * 9. Logs in with the updated password.
 * 10. Verifies successful login after password reset.
 *
 */
// Opens a browser
WebUI.openBrowser('')

// Navigates to the healthcare service website's URL
WebUI.navigateToUrl('https://www.example.com')

// Clicks on the "Forgot Password" link
WebUI.click(findTestObject('Page_HealthcareService/button_ForgotPassword'))

// Enters the registered email address for password reset
WebUI.setText(findTestObject('Page_HealthcareService/input_Email'), 'user@example.com')

// Submits the password reset request
WebUI.click(findTestObject('Page_HealthcareService/button_Submit'))

// Checks the email for a password reset link
// This step cannot be automated in Katalon Studio

// Clicks on the password reset link in the email
// This step cannot be automated in Katalon Studio

// Sets a new password for the user
WebUI.setText(findTestObject('Page_HealthcareService/input_NewPassword'), 'newPassword123')
WebUI.setText(findTestObject('Page_HealthcareService/input_ConfirmPassword'), 'newPassword123')
WebUI.click(findTestObject('Page_HealthcareService/button_SavePassword'))

// Logs in with the updated password
WebUI.setText(findTestObject('Page_HealthcareService/input_Username'), 'username')
WebUI.setText(findTestObject('Page_HealthcareService/input_Password'), 'newPassword123')
WebUI.click(findTestObject('Page_HealthcareService/button_Login'))

// Verifies successful login after password reset
WebUI.verifyElementPresent(findTestObject('Page_HealthcareService/text_SuccessMessage'))