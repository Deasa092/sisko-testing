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

WebUI.openBrowser('https://sistemtoko.com/')

WebUI.click(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/button_Login'))

WebUI.setText(findTestObject('Page_Login  sistemtoko.com/input_Email_email'), 'dewifakea@gmail.com')

WebUI.setText(findTestObject('Page_Login  sistemtoko.com/input_Password_password'), 'pasword123')

WebUI.click(findTestObject('Page_Login  sistemtoko.com/button_Login'))

WebUI.verifyElementVisible(findTestObject('Page_Management Store  Sistemtoko.com/account-button'))

WebUI.click(findTestObject('Page_Management Store  Sistemtoko.com/account-button'))

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Management Store  Sistemtoko.com/email-active'), 0)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Dashboard  Sistemtoko.com/Profile-button'), 0)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Dashboard  Sistemtoko.com/Type-account'), 0)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Dashboard  Sistemtoko.com/Logout-Button'), 0)

WebUI.closeBrowser()

