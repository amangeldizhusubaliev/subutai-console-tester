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

WebUI.navigateToUrl('https://7eb3e3974a9f27b97f1dc99a93b5af2973cab446.peers.subutai.cloud:8443/')

WebUI.setText(findTestObject('BuildSingleEnvRep/input_login'), 'admin')

WebUI.setText(findTestObject('BuildSingleEnvRep/input_password'), 'PeerSuperSecret!')

WebUI.sendKeys(findTestObject('BuildSingleEnvRep/input_password'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('BuildSingleEnvRep/li_Environment'))

WebUI.click(findTestObject('BuildSingleEnvRep/span_Environment'))

WebUI.click(findTestObject('BuildSingleEnvRep/a_Environments'))

WebUI.delay(2)

WebUI.click(findTestObject('BuildSingleEnvRep/span_debian-stretch'))

WebUI.click(findTestObject('BuildSingleEnvRep/button_Apply'))

WebUI.delay(2)

WebUI.setText(findTestObject('BuildSingleEnvRep/input_env-name'), gen())

WebUI.click(findTestObject('BuildSingleEnvRep/button_Build'))

WebUI.waitForElementVisible(findTestObject('BuildSingleEnvRep/button_Close'), 100)

WebUI.click(findTestObject('BuildSingleEnvRep/button_Close'))

WebUI.closeBrowser()

String gen() {
	StringBuilder sb = new StringBuilder()
	Random rand = new Random()
	for (int i = 0; i < 10; i++) {
		sb.append('0')
	}
	for (int i = 0; i < 10; i++) {
		int x = rand.nextInt(3)
		if (x == 0) {
			sb.append((char) (48 + rand.nextInt(10)))
		} else if (x == 1) {
			sb.append((char) (65 + rand.nextInt(26)))
		} else if (x == 2) {
			sb.append((char) (97 + rand.nextInt(26)))
		}
	}
	return sb.toString()
}