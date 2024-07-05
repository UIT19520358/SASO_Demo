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
 * Automates a series of actions on a food delivery app using Selenium WebDriver.
 *
 * Scenario 9: Placing a food order
 * 1. Opens a browser and navigates to the food delivery app's URL: https://www.ubereats.com.
 * 2. Enters the delivery address.
 * 3. Selects a restaurant from the available options.
 * 4. Adds items to the cart.
 * 5. Proceeds to checkout.
 * 6. Selects a payment method.
 * 7. Places the order.
 * 8. Verifies that the order is successfully placed.
 * ...
 */
// Automates a series of actions on a food delivery app using Selenium WebDriver
WebUI.openBrowser('https://www.ubereats.com')

WebUI.setText(findTestObject('input_delivery_address'), '123 Main Street')

WebUI.click(findTestObject('btn_select_restaurant'))

WebUI.click(findTestObject('btn_add_to_cart'))

WebUI.click(findTestObject('btn_proceed_to_checkout'))

WebUI.click(findTestObject('btn_select_payment_method'))

WebUI.click(findTestObject('btn_place_order'))

WebUI.verifyElementPresent(findTestObject('msg_order_placed'))