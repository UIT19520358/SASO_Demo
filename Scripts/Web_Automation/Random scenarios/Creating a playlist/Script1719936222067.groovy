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
 * Automates a series of actions on a music streaming platform using Selenium WebDriver.
 *
 * Scenario 7: Creating a playlist
 * 1. Opens a browser and navigates to the music streaming platform's URL: https://www.spotify.com.
 * 2. Logs in with valid credentials.
 * 3. Clicks the "Create Playlist" button.
 * 4. Enters a name for the playlist.
 * 5. Adds songs to the playlist.
 * 6. Verifies that the playlist is created successfully.
 * ...
 */
// Opens a browser and navigates to the music streaming platform's URL
WebUI.openBrowser('https://www.spotify.com')

// Logs in with valid credentials
WebUI.setText(findTestObject('Page_Spotify/Login/input_Username'), 'your_username')
WebUI.setText(findTestObject('Page_Spotify/Login/input_Password'), 'your_password')
WebUI.click(findTestObject('Page_Spotify/Login/button_Login'))

// Clicks the "Create Playlist" button
WebUI.click(findTestObject('Page_Spotify/Home/button_CreatePlaylist'))

// Enters a name for the playlist
WebUI.setText(findTestObject('Page_Spotify/Playlist/input_PlaylistName'), 'My Playlist')

// Adds songs to the playlist
WebUI.click(findTestObject('Page_Spotify/Playlist/button_AddSong'))
WebUI.click(findTestObject('Page_Spotify/Playlist/song_Item1'))
WebUI.click(findTestObject('Page_Spotify/Playlist/button_SavePlaylist'))

// Verifies that the playlist is created successfully
WebUI.verifyElementVisible(findTestObject('Page_Spotify/Playlist/label_SuccessMessage'))