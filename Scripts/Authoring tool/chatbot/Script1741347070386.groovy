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

//random name generator
String randomName = RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('Object Repository/chatbot creation/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/chatbot creation/Page_CogniSpark - Login/input_OR_password'), 'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/a_AI Agents'))

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/a_AI Chatbots'))

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark - AI Chatbots AI Agents/a_Create AI Chatbots'))

WebUI.setText(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/input_(The title or identity of your AI Cha_23e70a'), 
    randomName)

WebUI.setText(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/input_(The primary objective your AI Chatbo_012db7'), 
    'understand concept')

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/button_Next'))

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/button_Next_1'))

WebUI.uploadFile(findTestObject('chatbot creation/Page_CogniSpark -/upload_file'), employee)

WebUI.setText(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/input_Fallback Response_asst_fallback_resp'), 
    'xzvfds')

WebUI.click(findTestObject('Object Repository/chatbot creation/Page_CogniSpark -/button_Submit'))

