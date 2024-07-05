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
* Automate a series of actions on an e-commerce website using Selenium WebDriver.
*
* 1. Opens a browser and navigates to the e-commerce website's URL: https://www.amazon.com.
* 2. Searches for a product using the search bar.
* 3. Clicks on a product from the search results.
* 4. Clicks the "Add to Cart" button.
* 5. Verifies that the product is added to the shopping cart.
*
*/
// Open browser and navigate to the e-commerce website's URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.amazon.com')

// Search for a product using the search bar
WebUI.setText(findTestObject('Object Repository/Amazon/SearchBar'), 'product name')
WebUI.sendKeys(findTestObject('Object Repository/Amazon/SearchBar'), Keys.chord(Keys.ENTER))

// Click on a product from the search results
WebUI.click(findTestObject('Object Repository/Amazon/ProductResult'))

// Click the "Add to Cart" button
WebUI.click(findTestObject('Object Repository/Amazon/AddToCartButton'))

// Verify that the product is added to the shopping cart
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/ShoppingCartIcon'))