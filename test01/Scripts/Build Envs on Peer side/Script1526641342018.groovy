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

WebUI.navigateToUrl('https://bd07d037b2ef417cd2676fbe3354810f037827fd.peers.subutai.cloud:45988/#/login')

WebUI.setText(findTestObject('BuildAndDeleteSeveralEnvsRep/input_login'), 'admin')

WebUI.setText(findTestObject('BuildAndDeleteSeveralEnvsRep/input_password'), 'b26uamzQePYEh8A')

WebUI.sendKeys(findTestObject('BuildAndDeleteSeveralEnvsRep/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/span_Environment'))

WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/a_Environments'))

for (int it = 0; it < 10; it++) {
    WebUI.delay(15)

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/span_debian-stretch'))

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/button_Apply'))

    WebUI.setText(findTestObject('BuildAndDeleteSeveralEnvsRep/input_env-name'), gen())

    WebUI.delay(5)

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/button_Build'))

    WebUI.delay(80)

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/button_Close'))

    WebUI.delay(5)

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/a_b-icon b-icon_remove ng-scop'))

    WebUI.delay(5)

    WebUI.click(findTestObject('BuildAndDeleteSeveralEnvsRep/button_Delete'))
}

WebUI.delay(10)

WebUI.closeBrowser()

static String gen() {
    Random rnd = new Random()

    StringBuilder sb = new StringBuilder()
	
	for (int i = 0; i < 10; i++) {
		sb.append('0')
	}
	
    for (int i = 0; i < 10; i++) {
        int x = rnd.nextInt(3)

        if (x == 0) {
            sb.append(((65 + rnd.nextInt(26)) as char))
        } else if (x == 1) {
            sb.append(((97 + rnd.nextInt(26)) as char))
        } else {
            sb.append(((48 + rnd.nextInt(10)) as char))
        }
    }
    
    return sb.toString()
}

