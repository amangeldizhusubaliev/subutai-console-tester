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

File asd = new File("PeerUpdateLogs.txt")

PrintWriter pw = new PrintWriter(asd)

try {	
	WebUI.openBrowser('')
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('https://267a3e9423fd7e820fd54fbf027c73c4d5f3b6b3.peers.subutai.cloud:8443/')
	
	WebUI.setText(findTestObject('UpdatePeerRep/input_login'), 'admin')
	
	WebUI.setText(findTestObject('UpdatePeerRep/input_password'), 'PeerSuperSecret!')
	
	WebUI.sendKeys(findTestObject('UpdatePeerRep/input_password'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('UpdatePeerRep/span_Console'))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('UpdatePeerRep/li_Peer'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('UpdatePeerRep/span_spls'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(null, Keys.chord('s'))
	
	WebUI.sendKeys(null, Keys.chord(Keys.ENTER))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('UpdatePeerRep/div_46FB2BCE11F8FB707430BA4F23'))
	
	printString('subutai update management')
	
	WebUI.sendKeys(null, Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)
	
	printString('subutai update rh')
	
	WebUI.sendKeys(null, Keys.chord(Keys.ENTER))
	
	WebUI.delay(20)
	
	WebUI.closeBrowser()
} catch (Exception e) {
	pw.println(e.getMessage())
} finally {
	pw.close()
}

void printString(String s) {
	for (int i = 0; i < s.length(); i++) {
		String t = "" + s.charAt(i)
		WebUI.sendKeys(null, t)
	}
}