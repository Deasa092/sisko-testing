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

WebUI.click(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/button_register'))

WebUI.verifyEqual('https://sistemtoko.com/register', 'https://sistemtoko.com/register')

WebUI.verifyElementText(findTestObject('Page_Register  sistemtoko.com/h3_Register'), 'Register')

WebUI.back()

WebUI.click(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/button_Login'))

WebUI.verifyEqual('https://sistemtoko.com/login', 'https://sistemtoko.com/login')

WebUI.verifyElementText(findTestObject('Page_Login  sistemtoko.com/Header_Login'), 'Login')

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/Button_Harga'))

WebUI.getText(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/h2_Perbandingan Harga'))

WebUI.comment('because it\'s still on the homepage, there\'s no need to click back')

WebUI.click(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/dropdown_Fitur'))

WebUI.getText(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/Hyperlink_Website'))

WebUI.getText(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/Hyperlink_Sistem Informasi'))

WebUI.getText(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/Hyperlink_ChatBot'))

WebUI.getText(findTestObject('Page_sistemtoko.com, Aplikasi Termudah untuk mengelola penjualan Offline  Online/Hyperlink_Aplikasi Kasir'))

WebUI.closeBrowser()

