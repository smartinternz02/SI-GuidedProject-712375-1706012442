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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/input_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/input_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/label_Facility'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    Facility, true)

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.verifyElementText(findTestObject('CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/label_Visit Date (Required)'), 
    'Visit Date (Required)')

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/td_17'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/div_Visit Date (Required)'))

WebUI.setText(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/textarea_comment'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/CURA_New_001/Buttons_Validation_OR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.closeBrowser()

