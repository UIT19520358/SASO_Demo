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
Automates the process of contacting customer support on a healthcare service website.

1. Opens a browser.
2. Navigates to the healthcare service website's URL.
3. Clicks on the "Contact Us" section.
4. Enters the necessary contact details.
5. Writes the message to customer support.
6. Submits the contact form.
7. Verifies the success message for contacting customer support.
*/
// Opens a browser
WebUI.openBrowser('')

// Navigates to the healthcare service website's URL
WebUI.navigateToUrl('https://healthcareservice.com')

// Clicks on the "Contact Us" section
WebUI.click(findTestObject('Object Repository/ContactUsButton'))

// Enters the necessary contact details
WebUI.setText(findTestObject('Object Repository/NameField'), 'John Doe')
WebUI.setText(findTestObject('Object Repository/EmailField'), 'johndoe@example.com')
WebUI.setText(findTestObject('Object Repository/PhoneNumberField'), '1234567890')

// Writes the message to customer support
WebUI.setText(findTestObject('Object Repository/MessageField'), 'This is a test message for customer support.')

// Submits the contact form
WebUI.click(findTestObject('Object Repository/SubmitButton'))

// Verifies the success message for contacting customer support
WebUI.verifyElementText(findTestObject('Object Repository/SuccessMessage'), 'Your message has been successfully sent to customer support.')
