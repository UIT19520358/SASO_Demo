import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

String path = RunConfiguration.getProjectDir()

println(path)

String RunningtestCaseName = RunConfiguration.getExecutionSourceName()



// Specify the path to your test data file
String excelFile1Path = path + '/Sample_Data.xlsx'

// Specify the sheet name in your test data file
String wb1sheet = 'Sheet1'

//declaring workbook
workbook01 = ExcelKeywords.getWorkbook(excelFile1Path)

//declaring sheets of workbook
sheet1 = workbook01.getSheet(wb1sheet)

//declaring total number of rows in sheets of workbook
totalRowsS1 = (sheet1.getLastRowNum() + 1)

LastRowS1 = (sheet1.getLastRowNum() + 1)

println(LastRowS1)

// Iterate through rows in the data table
for (int row = 1; row <= totalRowsS1; row++) {
    if (row != LastRowS1) {
        // Check if the current row matches the target TestCaseID
        if (sheet1.getRow(row).getCell(0).getStringCellValue() == RunningtestCaseName) {
            println(sheet1.getRow(row).getCell(0).getStringCellValue())

            // Get values from column in the current row
            String SearchText = sheet1.getRow(row).getCell(1).getStringCellValue()

            // Process the data as needed, for example, print it
            println("TestCaseID: $RunningtestCaseName, SearchText: $SearchText")
			
			String Browserinfo = DriverFactory.getExecutedBrowser()
			println(Browserinfo)

            WebUI.openBrowser('')

            WebUI.navigateToUrl('https://www.google.com/')

            WebUI.setText(findTestObject('Object Repository/Page_Google/textarea__q'), SearchText)

            WebUI.sendKeys(findTestObject('Page_Google/textarea__q'), Keys.chord(Keys.ENTER))

            WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium - Google Search/textarea_Selenium'), 
                SearchText)

            WebUI.takeScreenshotAsCheckpoint('Demo_Screenshot')

            WebUI.closeBrowser()
        }
    }
}