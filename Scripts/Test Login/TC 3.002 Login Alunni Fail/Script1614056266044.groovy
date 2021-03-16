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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tzs-global.com/alumni-1/index.php/Welcome')

WebUI.click(findTestObject('Object Repository/Page_Document/button_'))

WebUI.setText(findTestObject('Object Repository/Page_Register System/input_Student ID_email'), '614259035')

WebUI.click(findTestObject('Object Repository/Page_Register System/input_Password_login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register System/input_Password_psw'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Register System/input_Password_login'))

WebUI.verifyTextPresent('เข้าสู่ระบบ', false)

WebUI.closeBrowser()

