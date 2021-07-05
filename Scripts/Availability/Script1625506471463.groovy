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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New Folder/Page_Brid-ci/a_'))

WebUI.setText(findTestObject('Object Repository/AvailabilityCreate/input__title'), 'availability create by automation script')

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/label_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AvailabilityCreate/select_'), '4', true)

WebUI.click(findTestObject('New Folder/Page_Brid-ci/label_'))

WebUI.selectAllOption(findTestObject('New Folder/Page_Brid-ci/select_', [('variable') : '東北']))

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/input__start_date'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AvailabilityCreate/select_202020212022202320242025202620272028_e65f0a'), 
    '2028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AvailabilityCreate/select_123456789101112'), '0', true)

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/div_6'))

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/input__end_date'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AvailabilityCreate/select_202820292030203120322033203420352036_65ed2c'), 
    '2029', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AvailabilityCreate/select_123456789101112'), '1', true)

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/div_2'))

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/label_3'))

WebUI.setText(findTestObject('Object Repository/AvailabilityCreate/textarea_testing'), 'testing')

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/button_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AvailabilityCreate/div_Close alert'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/AvailabilityCreate/input__title'), 'availability title edited with automation script')

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/AvailabilityCreate/button_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AvailabilityCreate/div_Close alert'), 0)

WebUI.closeBrowser()

