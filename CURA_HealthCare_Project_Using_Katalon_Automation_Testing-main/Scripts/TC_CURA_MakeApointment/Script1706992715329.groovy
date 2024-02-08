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

CustomKeywords.'example.MyKeywords.AppLogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/ddlHealthcareCenter                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
        1)

    WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/cbReadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/cbMedicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/cbMedicaid'))
    } else {
        WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/cbMedicaid'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/txtVisitDate'), '02/09/2022')

    WebUI.setText(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/txtComment'), 'Test Katalon')

    WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/txtBookAppointment2'))

    WebUI.verifyElementPresent(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/h2Appointment Confirmation'), 3)

    WebUI.click(findTestObject('CURA_New_001/healthCenter/Page_CURA Healthcare Service/btnGotoHomepage'))

    CustomKeywords.'example.MyKeywords.Congrats'('You')
}

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/a_History'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/CURA_New_001/Page_History/Page_CURA Healthcare Service/h2_History'), 
    'History')

WebUI.closeBrowser()

