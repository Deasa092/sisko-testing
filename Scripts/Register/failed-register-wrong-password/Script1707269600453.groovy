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

WebUI.comment('using different password when re-enter password')

WebUI.openBrowser('https://sistemtoko.com/register')

WebUI.setText(findTestObject('Page_Register  sistemtoko.com/input_Email_email'), 'cecep@gmail.com')

WebUI.setText(findTestObject('Page_Register  sistemtoko.com/input_Password_pswd'), '12345678')

WebUI.comment('different password')

WebUI.setText(findTestObject('Page_Register  sistemtoko.com/input_Re-enter Password_password'), '1234567u')

WebUI.setText(findTestObject('Page_Register  sistemtoko.com/input_Full Name_name'), 'Cecep ')

WebUI.setText(findTestObject('Page_Register  sistemtoko.com/input_Phone_phone'), '084234458413')

WebUI.click(findTestObject('Page_Register  sistemtoko.com/select_Coba Gratis paket Platinum'))

WebUI.click(findTestObject('Page_Register  sistemtoko.com/button_Register'))

WebUI.verifyElementVisible(findTestObject('Page_Register  sistemtoko.com/Failed-Register'))

WebUI.getText(findTestObject('Page_Register  sistemtoko.com/wrong-password-message'))

WebUI.closeBrowser()

