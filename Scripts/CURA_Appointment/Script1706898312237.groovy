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

if (true) {
    WebUI.takeScreenshotAsCheckpoint('appointment page')

    WebUI.selectOptionByLabel(findTestObject('CURA_New_001/Page_CuraAppointment/lst_Facility'), 'Hongkong CURA Healthcare Center', 
        false)

    WebUI.check(findTestObject('CURA_New_001/Page_CuraAppointment/chk_Medicaid'))

    WebUI.check(findTestObject('CURA_New_001/Page_CuraAppointment/chk_Readmission'))

    WebUI.setText(findTestObject('CURA_New_001/Page_CuraAppointment/txt_VisitDate'), '27/12/2016')

    WebUI.setText(findTestObject('CURA_New_001/Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible.')

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('CURA_New_001/Page_CuraAppointment/btn_BookAppointment'))

    WebUI.verifyTextPresent('Appointment Confirmation', false)
}

if (true) {
    WebUI.verifyMatch('Hongkong CURA Healthcare Center', WebUI.getText(findTestObject('CURA_New_001/Page_CURA Healthcare Service/lbl_Facility')), 
        false)

    WebUI.verifyMatch('Yes', WebUI.getText(findTestObject('CURA_New_001/Page_CURA Healthcare Service/lbl_HospitalReadmission')), false)

    WebUI.verifyMatch('Medicaid', WebUI.getText(findTestObject('CURA_New_001/Page_CURA Healthcare Service/lbl_Program')), false)

    WebUI.verifyMatch('27/12/2016', WebUI.getText(findTestObject('CURA_New_001/Page_CURA Healthcare Service/lbl_VisitDate')), false)

    WebUI.verifyMatch('Please make appointment as soon as possible.', WebUI.getText(findTestObject('CURA_New_001/Page_CURA Healthcare Service/lbl_Comment')), 
        false)
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/a_History'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('CURA_New_001/page_Logout/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()

