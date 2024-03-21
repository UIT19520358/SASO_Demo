package sample
import org.apache.commons.io.FileUtils
import org.openqa.selenium.By
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.server.handler.CaptureScreenshot

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.ErrorCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger


class TestmeHere {

	private static final KeywordLogger logger = KeywordLogger.getInstance(KeywordUtil.class);
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	@Keyword
	def compareDigits(digit1, digit2){
		if (digit1 === digit2) {
			KeywordUtil.markPassed("PASS")
			return "The two digits are equal.";
		} else {
			KeywordUtil.markFailed("Failed")
			WebUI.takeScreenshot("/Users/vaibhavjain/Desktop/Screenshot/Test1.png")
			return "The two digits are not equal";
		}
	}

	public static String compareDigits(digit1, digit2, FailureHandling flowControl) throws StepFailedException {
		if (digit1 === digit2) {
			KeywordUtil.markPassed("PASS")
			return "The two digits are equal.";
		} else {
			String message = "Failed"
			KeywordUtil.markFailed("Failed")
			return "The two digits are not equal";
		}
	}


	public void captureScreenshot() {
		try {
			// Convert WebDriver object to TakesScreenshot
			WebDriver driver = DriverFactory.getWebDriver()
			TakesScreenshot ts = (TakesScreenshot) driver;
			// Capture the screenshot as File
			File source = ts.getScreenshotAs(OutputType.FILE);
			// Define the destination file path
			String destination = "/Users/vaibhavjain/Desktop/Screenshot/Test.png";
			// Copy the screenshot to the destination file
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Screenshot taken and saved as " + destination);
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
	}
}