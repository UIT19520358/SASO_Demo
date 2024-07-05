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
Opens a browser and navigates to a healthcare service website, clicks on the "Articles" section, selects a category, clicks on a specific article, and verifies the content of the article.
*
*  1. Opens a browser and navigates to the healthcare service website's URL.
*  2. Clicks on the "Articles" section.
*  3. Selects a category from the available options.
*  4. Clicks on a specific article.
*  5. Verifies the content of the article.
*
*/
// Opens a browser and navigates to the healthcare service website's URL
WebUI.openBrowser('')

// Navigates to the healthcare service website's URL
WebUI.navigateToUrl('https://www.healthcareservicewebsite.com')

// Clicks on the "Articles" section
WebUI.click(findTestObject('xpath=//a[text()="Articles"]'))

// Selects a category from the available options
WebUI.click(findTestObject('xpath=//div[@class="categories"]//a[text()="Specific Category"]'))

// Clicks on a specific article
WebUI.click(findTestObject('xpath=//div[@class="articles"]//a[text()="Specific Article"]'))

// Verifies the content of the article
WebUI.verifyElementText(findTestObject('xpath=//div[@class="article-content"]'), 'Expected article content')
