import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startApplication('/Users/vaibhavjain/Downloads/app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Density_MobileAPp/android.widget.TextView - Login To Density'), 0)

Mobile.setText(findTestObject('Density_MobileAPp/android.widget.EditText - johndoeemail.com (1)'), 'testfordensity@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Density_MobileAPp/android.widget.EditText -'), 'abcdefg@1', 0)

Mobile.tap(findTestObject('Object Repository/Density_MobileAPp/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Density_MobileAPp/android.view.ViewGroup - OTP'), 0)

Mobile.setText(findTestObject('Object Repository/Density_MobileAPp/android.widget.EditText - 000000'), '987456', 0)

Mobile.tap(findTestObject('Density_MobileAPp/android.view.ViewGroup (1)'), 0)

