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

WebUI.navigateToUrl('https://dev.cognispark.ai/login')

WebUI.setText(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Login/div_Login with Google                      _cecd6e'))

WebUI.setEncryptedText(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Login/input_OR_password'), 
    'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Home/a_Course Creator'))

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark - Course Creator/a_Create Course'))

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark -/button_Import'))

WebUI.uploadFile(findTestObject('Editable PPT import/Page_CogniSpark -/span_upload a file'), anatomy)

WebUI.click(findTestObject('Object Repository/Editable PPT import/Page_CogniSpark -/button_Import_1'))

