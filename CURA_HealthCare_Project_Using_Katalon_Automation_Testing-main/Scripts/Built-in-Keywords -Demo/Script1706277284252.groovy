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

// Built-in-Keywords- Demo
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Maximize Window
WebUI.maximizeWindow()

// Captur your URL
String url = WebUI.getUrl()

System.out.println(url)

//Window number
System.out.println(WebUI.getWindowIndex())

// display title of window 
System.out.println(WebUI.getWindowTitle())

// delaying 6 seconds
WebUI.delay(6)

// Moving from one URL to other URL
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.delay(5)

// Take back to new tour demo(previous window)
WebUI.back()

WebUI.delay(5)

WebUI.forward()

WebUI.delay(5)

// get url of orangehrm
System.out.println(WebUI.getUrl())

int windowno = WebUI.getWindowIndex()

System.out.println(windowno)

System.out.println(WebUI.getWindowTitle())

// Close browser
WebUI.closeBrowser()

