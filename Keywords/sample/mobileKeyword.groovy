package sample

import org.openqa.selenium.interactions.KeyInput

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

import io.appium.java_client.AppiumDriver


public class mobileKeyword {

	@Keyword
	def setMohitText(TestObject to, String text, int timeout, FailureHandling flowControl) {
		MobileElementCommonHelper.findElement(to, 1).click()
		AppiumDriver driver = MobileDriverFactory.getDriver()
		KeyInput keyboard = new KeyInput('keyboard')
		Sequence sendKeys = new Sequence(keyboard, 0)
		for (int i = 0; i < text.length(); i++) {
			String c = text.charAt(i).toString()
			sendKeys.addAction(keyboard.createKeyDown(c.codePointAt(0)))
		}
		driver.perform(Arrays.asList(sendKeys))
		try{
			driver.hideKeyboard()
		}
		catch(Exception e) {}
	}
}
