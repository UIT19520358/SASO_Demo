import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import sample.TestmeHere as TestmeHere
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//import sample.TestmeHere as CKeyword
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_password'), GlobalVariable.Password)

//CustomKeywords.'sample.TestmeHere.clickElement'(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))
not_run: TestmeHere.compareDigits(10, 20, FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'sample.TestmeHere.compareDigits'(10, 50)
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_8'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), 'Demo Script')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.takeScreenshotAsCheckpoint('Visual_Sample')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

