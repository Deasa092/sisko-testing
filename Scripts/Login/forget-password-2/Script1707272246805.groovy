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

WebUI.comment('Forget password, email doesn\'t register')

WebUI.openBrowser('https://sistemtoko.com/login')

WebUI.click(findTestObject('Page_Login  sistemtoko.com/a_I forgot my password'))

'true email: dewifakea@gmail.com'
WebUI.setText(findTestObject('Page_Password Reminder  Vendpad/input_Password Reminder_email'), 'dewifake@gmail.com')

WebUI.click(findTestObject('Page_Password Reminder  Vendpad/Password Reminder_btn'))

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Password Reminder  Vendpad/wrong-email-reminder-message'), 0)

WebUI.closeBrowser()

