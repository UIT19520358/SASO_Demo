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

Mobile.startApplication('/Users/vaibhavjain/Desktop/Sample Mobile App/Mobile Sample App/Android/MaterialLoginExample.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Material_Login/android.widget.TextView - No account yet Create one'), 0)

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText'), 'Vaibhav', 0)

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText (1)'), 'M G Road', 0)

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText (2)'), 'vjain089@abc.com', 0)

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText (3)'), '8787387877', 0)

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText (4)'), 'Demo@1234', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Material_Login/android.widget.EditText (5)'), 'Demo@1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Material_Login/android.widget.Button - CREATE ACCOUNT'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Material_Login/android.widget.TextView - Hello world'), 'Hello world!')

Mobile.takeScreenshotAsCheckpoint('Mobile_Script1')

Mobile.closeApplication()


