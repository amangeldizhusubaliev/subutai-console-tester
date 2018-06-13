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

WebUI.setText(findTestObject('Page_Subutai (11)/input_login'), 'admin')

WebUI.setText(findTestObject('Page_Subutai (11)/input_password'), 'secret1')

WebUI.sendKeys(findTestObject('Page_Subutai (11)/input_password'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Subutai (11)/span_Console'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Subutai (11)/li_Peer'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Subutai (11)/li_stfu_fuck'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Subutai (11)/select_Select Hostsubutai (LOC'), '46FB2BCE11F8FB707430BA4F232B85D22467CBBA', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Subutai (11)/console_object'))

//WebUI.setText(findTestObject('Page_Subutai (11)/console_object'), 'subutai update management')
printString('subutai update management')

//WebUI.sendKeys(findTestObject('Page_Subutai (11)/console_object'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(null, Keys.chord(Keys.ENTER))


//WebUI.setText(findTestObject('Page_Subutai (11)/console_object'), 'subutai update rh')
printString('subutai update rh')

//WebUI.sendKeys(findTestObject('Page_Subutai (11)/console_object'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(null, Keys.chord(Keys.ENTER))

WebUI.delay(20)

WebUI.closeBrowser()

void printString(String s) {
	for (int i = 0; i < s.length(); i++) {
		String t = "" + s.charAt(i);
		//WebUI.sendKeys(findTestObject('Page_Subutai (11)/console_object'), t)
		WebUI.sendKeys(null, t)
	}
}
