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

WebUI.callTestCase(findTestCase('CURA_Validations Of Test Cases/TC_CURA Healthcare Service_Login_002'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('CURA Appointment page is displayed')

WebUI.selectOptionByValue(findTestObject('CURA_New_001/page_appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/td_17'))

WebUI.setText(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/textarea_comment'), 
    'Testing')

WebUI.takeScreenshot()

WebUI.comment('Filling valid information in Appointment page to book Appointment')

WebUI.click(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

WebUI.verifyElementVisible(findTestObject('Object Repository/CURA_New_001/page_appointment/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'))

WebUI.comment('with this should be able to book a new appointment')

WebUI.takeScreenshot()

