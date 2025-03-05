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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.cognispark.ai/login')
WebUI.maximizeWindow()
//generate random name
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.setText(findTestObject('Object Repository/create course from scratch/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/create course from scratch/Page_CogniSpark - Login/input_OR_password'), 
    'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/create course from scratch/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/create course from scratch/Page_CogniSpark - Home/a_Course Creator'))

WebUI.click(findTestObject('Object Repository/create course from scratch/Page_CogniSpark - Course Creator/a_Create Course'))

WebUI.click(findTestObject('Object Repository/create course from scratch/Page_CogniSpark -/button_Start From Scratch'))

WebUI.setText(findTestObject('Object Repository/create course from scratch/Page_CogniSpark -/input_Title_title'), randomName)

WebUI.click(findTestObject('Object Repository/create course from scratch/Page_CogniSpark -/button_Next'))

