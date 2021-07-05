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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.google.com/mail/u/0/#inbox')

WebUI.setText(findTestObject('gmail login/Page_Gmail/input_to continue to Gmail_identifier'), 'tanzeeb.rubaiat@monstar-lab.com')

WebUI.doubleClick(findTestObject('gmail login/Page_Gmail/Page_Gmail/div__VfPpkd-RLmnJb'))

WebUI.setEncryptedText(findTestObject('null'), 'xe7ovo5gwNbxlDtOM4OYWA==')

WebUI.click(findTestObject('gmail login/Page_Gmail/input_Too many failed attempts_password'))

emailbody = WebUI.getText(findTestObject('null'))

index = emailbody.indexOf('URLが')

index = (index - 3)

tokenurl = emailbody.substring(83, index)

WebUI.navigateToUrl(tokenurl)

