import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.apple.freeform')

/*ElementPresentR = Mobile.verifyElementExist(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Continue'), 
    0)

if (ElementPresentR == true) {
    Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Continue'), 0)

    Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Not Now'), 0)
}
*/
Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - New Board'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add sticky note'), 0)

Mobile.setText(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeTextField - sticky note'), 'Mobile Automation', 
    0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - sticky note'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add shape'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Animals'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeCell - Horse'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - Horse'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add text box'), 0)

Mobile.setText(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeTextField - text box'), 'Demo Flow', 
    0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - text box'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.closeApplication()

