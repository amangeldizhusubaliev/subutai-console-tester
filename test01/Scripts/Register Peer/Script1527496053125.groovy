import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://192.168.66.63:8443/#/login')

WebUI.setText(findTestObject('RegisterRep/input_login'), 'admin')

WebUI.setText(findTestObject('RegisterRep/input_password'), 'secret1')

WebUI.sendKeys(findTestObject('RegisterRep/input_password'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('RegisterRep/span_Register Peer'))

WebUI.delay(2)

WebUI.setText(findTestObject('RegisterRep/input_b-form-input b-form-inpu'), 'azhusubaliev@optimal-dynamics.com')

WebUI.setText(findTestObject('RegisterRep/input_b-form-input b-form-inpu_1'), 'XSCode666cerf')

WebUI.setText(findTestObject('RegisterRep/input_b-form-input b-form-inpu_2'), 'AmansPeer')

WebUI.click(findTestObject('RegisterRep/button_Register'))

WebUI.delay(10)

WebUI.closeBrowser()

