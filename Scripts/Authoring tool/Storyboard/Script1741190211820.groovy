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
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Storyboard/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Storyboard/Page_CogniSpark - Login/input_OR_password'), 'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark - Home/a_Course Creator'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark - Course Creator/a_Create Course'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Generate Course'))

WebUI.setText(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/input_Remainingcharacters_title'), 'How to reduce stress')

WebUI.selectOptionByValue(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/select_NoviceAdvanced BeginnerCompetentProf_e0f65a'), 
    'Advanced Beginner', true)

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Generate Using AI'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Generate Using AI_1'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Save  Continue'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Generate Storyboard'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Customize Course'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/img_Theme_myImg'))

WebUI.click(findTestObject('Object Repository/Storyboard/Page_CogniSpark -/button_Generate Course_1'))

