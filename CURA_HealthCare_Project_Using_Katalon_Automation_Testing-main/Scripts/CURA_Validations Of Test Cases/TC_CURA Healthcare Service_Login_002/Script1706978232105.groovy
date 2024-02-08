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

WebUI.callTestCase(findTestCase('CURA_Validations Of Test Cases/TC_CURA Healthcare Service_Home_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.comment('Login to CURA HealthCare Service_Application')

WebUI.comment('Given that the user has the valid login information')

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/a_Login'))

WebUI.takeScreenshotAsCheckpoint('login page')

WebUI.setText(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/button_Login'))

WebUI.comment('login successfully into CURA HealthCare Service Application')

WebUI.verifyElementText(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/div_Make Appointment'), 
    'Make Appointment')

landingPage = WebUI.verifyElementPresent(findTestObject('CURA_New_001/Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)

