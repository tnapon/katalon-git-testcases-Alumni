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

WebUI.click(findTestObject('Page_Document/a_register'))

WebUI.setText(findTestObject('Object Repository/Page_Document/input_- ()_fname'), 'ธนภัธ')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_- ()_ename'), 'เด็กดี')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_- ()_id'), '1730576414578')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__job'), 'programer')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__nation'), 'ไทย')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__nation2'), 'ไทย')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__re'), 'พุทธ')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__blood'), 'o')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__email'), '614259002@webmail.npru.ac.th')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__tel'), '091115050')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Facebook_face'), 'DekDee')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Line ID_line'), 'Dee')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__homea'), '132')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__mou'), '4')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__song'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__road'), '-')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__tampon'), 'กระตีบ')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__ampor'), 'กำแพงแสน')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__prov'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__zipcode'), '73180')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__h2'), '1123')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__m2'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__s2'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__road2'), 'มาลัยแมน')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__t2'), 'ลาดหญ้า')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__a2'), 'เมือง')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__prov2'), 'ราชบุรี')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__zip2'), '71163')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__phone'), '0955541561')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__sid'), '614259002')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__sec'), '61/47')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__grade'), '4.00')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__ry'), '2560')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__sy'), '2564')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Document/input__pass'), 'MmKcP4t/ZMKo/YkxbFJmfQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Document/input__repass'), 'MmKcP4t/ZMKo/YkxbFJmfQ==')

WebUI.click(findTestObject('Object Repository/Page_Document/button_'))

WebUI.click(findTestObject('Object Repository/Page_Document/button_'))

WebUI.verifyTextPresent('สาขาวิศวกรรมซอฟต์แวร์ ยินดีต้อนรับ', false)

WebUI.closeBrowser()

