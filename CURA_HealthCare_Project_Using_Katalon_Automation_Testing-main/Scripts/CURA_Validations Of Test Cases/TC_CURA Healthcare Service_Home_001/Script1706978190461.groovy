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

WebUI.navigateToUrl(GlobalVariable.CURA_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/a_Home'))

WebUI.verifyElementText(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    'CURA Healthcare Service')

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/strong_CURA Healthcare Service'))

WebUI.waitForElementVisible(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/li_(678) 813-1KMS'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/li_infokatalon.com'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/i_fa fa-dribbble fa-fw fa-3x'))

WebUI.verifyElementText(findTestObject('Object Repository/CURA_New_001/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2024'), 
    'Copyright © CURA Healthcare Service 2024')

WebUI.takeScreenshot()

