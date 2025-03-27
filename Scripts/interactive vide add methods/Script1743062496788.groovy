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

WebUI.setText(findTestObject('Object Repository/interactive video add/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/interactive video add/Page_CogniSpark - Login/input_OR_password'), 
    'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/interactive video add/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_CogniSpark -/a_Course Creator'))
WebUI.navigateToUrl('https://dev.cognispark.ai/course/6sbfybBbiOEl9qdK/edit')
//WebUI.openBrowser('https://dev.cognispark.ai/course/6sbfybBbiOEl9qdK/edit')

//WebUI.setText(findTestObject('Object Repository/interactive video add/Page_CogniSpark - Course Creator/input_User_search-input'), 
//    'katalon')

//WebUI.click(findTestObject('Object Repository/interactive video add/Page_CogniSpark - Course Creator/img'))

//WebUI.switchToWindowTitle('KATALON')

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Media                                  _f11f23'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Interactive Video'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/label_Click to upload Video                _338039'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/i_Insert Video_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/img_KATALON_add-slide'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Media                                  _f11f23'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Interactive Video'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/a_Search'))

WebUI.setText(findTestObject('Object Repository/interactive video add/Page_KATALON/input_Insert Video_form-control search-video-input'), 
    'car')

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/button_Search'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/i_Pixabay_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/img_KATALON_add-slide'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Media                                  _f11f23'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/div_Interactive Video'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/a_My videos'))

WebUI.click(findTestObject('Object Repository/interactive video add/Page_KATALON/i_Untitled Project_fa fa-plus-circle'))

