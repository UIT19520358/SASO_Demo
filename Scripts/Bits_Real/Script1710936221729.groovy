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

Mobile.startExistingApplication('com.bitabiz.preprod', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.setText(findTestObject('Object Repository/Bitz_Real/android.widget.EditText - Your email'), 'b1@bitabiz.com', 
    0)

not_run: Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.ViewGroup'), 0)

not_run: Mobile.setText(findTestObject('Object Repository/Bitz_Real/android.widget.EditText - Password'), '123456BB', 0)

not_run: Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.ViewGroup (1)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.ViewGroup (2)'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.widget.Button - Without label'), 0)

Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.View - Day off'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Bitz_Real/android.view.View'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('android.widget.Button - regis-widget-calendar-icon-date-from date'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.View - 24'), 0)

Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.widget.Button - OK'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Bitz_Real/android.view.View - Back'), 0)

Mobile.closeApplication()

