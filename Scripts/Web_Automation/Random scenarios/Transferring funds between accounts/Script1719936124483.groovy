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
 * Automates a series of actions on a banking website using Selenium WebDriver.
 *
 * Scenario 4: Transferring funds between accounts
 * 1. Opens a browser and navigates to the banking website's URL: https://www.chase.com.
 * 2. Logs in with valid credentials.
 * 3. Selects the "Transfer Funds" option.
 * 4. Enters the recipient's account details and the transfer amount.
 * 5. Clicks the "Transfer" button.
 * 6. Verifies that the funds are successfully transferred.
 * ...
 */
// Opens a browser and navigates to the banking website's URL
WebUI.openBrowser('https://www.chase.com')

// Logs in with valid credentials
WebUI.setText(findTestObject('Page_Login/input_Username'), 'your_username')
WebUI.setText(findTestObject('Page_Login/input_Password'), 'your_password')
WebUI.click(findTestObject('Page_Login/button_Login'))

// Selects the "Transfer Funds" option
WebUI.click(findTestObject('Page_Dashboard/button_TransferFunds'))

// Enters the recipient's account details and the transfer amount
WebUI.setText(findTestObject('Page_TransferFunds/input_RecipientAccount'), 'recipient_account_number')
WebUI.setText(findTestObject('Page_TransferFunds/input_TransferAmount'), '100')

// Clicks the "Transfer" button
WebUI.click(findTestObject('Page_TransferFunds/button_Transfer'))

// Verifies that the funds are successfully transferred
WebUI.verifyElementPresent(findTestObject('Page_TransferConfirmation/message_SuccessfulTransfer'))