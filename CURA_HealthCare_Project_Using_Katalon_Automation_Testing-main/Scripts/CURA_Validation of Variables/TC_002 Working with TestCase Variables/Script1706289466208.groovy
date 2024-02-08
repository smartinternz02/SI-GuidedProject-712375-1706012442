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

// define and initialize variable withput data type
// def expected_title = "Make Appointment"
def expected_title

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('CURA_New_001/variables/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('CURA_New_001/variables/Page_CURA Healthcare Service/input_username'), username)

WebUI.setText(findTestObject('CURA_New_001/variables/Page_CURA Healthcare Service/input_password'), password)

sleep(5000)

WebUI.click(findTestObject('CURA_New_001/variables/Page_CURA Healthcare Service/button_Login'))

// Initialize variable at run time
String actual_title = WebUI.getText(findTestObject('CURA_New_001/variables/Page_CURA Healthcare Service/h2_Make Appointment'))

// Initializing variable that is defined at the start of the code
expected_title = 'Make Appointment'

WebUI.verifyEqual(actual_title, expected_title)

WebUI.closeBrowser()

