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

WebUI.setText(findTestObject('Object Repository/image operations/Page_CogniSpark - Login/input_OR_email'), 'priyanka.test@paradiso.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/image operations/Page_CogniSpark - Login/input_OR_password'), 'in7GmIa9L6ESdofxqXkKev/Rqoz+a4wZHoIRYULSYOs=')

WebUI.click(findTestObject('Object Repository/image operations/Page_CogniSpark - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/image operations/Page_CogniSpark - Home/a_Course Creator'))

WebUI.click(findTestObject('Object Repository/image operations/Page_CogniSpark - Course Creator/img'))

WebUI.switchToWindowTitle('KATALON')

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/a_Request_phpdebugbar-close-btn'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/div_Media                                  _f11f23'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/div_Image'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/a_Upload                            Image'))

WebUI.uploadFile(findTestObject('image operations/Page_KATALON/Upload-image-button'), upload_image)

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/Add-image-to-slide'))

WebUI.click(findTestObject('image operations/Page_KATALON/click-on-image'))

//WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/img_Stop_sl-block-element'))
//WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/div_Indra AI Assist                        _b73f5a'))
//WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/div_Translate to_Cropanchor'))
//WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_Done'))
WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_H.Flip'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_H.Flip'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_V.Flip'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_V.Flip'))

WebUI.scrollToElement(findTestObject('image operations/Page_KATALON/scroller-vertical'), 5 // 5 is the timeout in seconds
    )

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_Appearance'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/input_Border_element-border'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/input_Color_element-border-color'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_d62828'))

WebUI.click(findTestObject('image operations/Page_KATALON/div_concat(id(, , clr-color-marker, , ))_cl_b70c39'))

WebUI.click(findTestObject('image operations/Page_KATALON/click-on-image'))

WebUI.setText(findTestObject('Object Repository/image operations/Page_KATALON/input_Width_element-border-width'), '1')

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/span_Width                                 _1909e1'))

WebUI.setText(findTestObject('Object Repository/image operations/Page_KATALON/input_Width_element-border-width'), '50')

WebUI.setText(findTestObject('Object Repository/image operations/Page_KATALON/input_Radius_element-border-radios'), '100')

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/img'))

WebUI.click(findTestObject('Object Repository/image operations/Page_KATALON/button_Delete'))

