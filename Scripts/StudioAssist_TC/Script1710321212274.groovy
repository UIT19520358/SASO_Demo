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
 *  1. Opens a browser.
 *  2. Navigates to a specific URL.
 *  3. Maximizes the browser window.
 *  4. Clicks on a "Make Appointment" link.
 *  5. Enters a username into a text field.
 *  6. Enters an encrypted password into a password field.
/*
 *  Opens a browser, navigates to a specific URL, maximizes the browser window, clicks on a "Make Appointment" link, enters a username into a text field, and enters an encrypted password into a password field.
 *
 *  @param url The URL to navigate to
 *  @param username The username to enter into the text field
 *  @param encryptedPassword The encrypted password to enter into the password field
 */

// Opens a browser
WebUI.openBrowser('')

// Navigates to a specific URL
WebUI.navigateToUrl('url')

// Maximizes the browser window
WebUI.maximizeWindow()

// Clicks on a "Make Appointment" link
WebUI.click(findTestObject('your_make_appointment_link_test_object'))

// Enters a username into a text field
WebUI.setText(findTestObject('your_username_text_field_test_object'), 'username')

// Enters an encrypted password into a password field
WebUI.setEncryptedText(findTestObject('your_password_field_test_object'), 'encryptedPassword')

/*Check balance before
        Go to transfer page
        Input beneficiary account
        Input total amount
        Click button transfer
        Input PIN
        Go to transaction success page
        Get reference number
        Check balance after
        Check history transaction
        Check inbox notification*/
