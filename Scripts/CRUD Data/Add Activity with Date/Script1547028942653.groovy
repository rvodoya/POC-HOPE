import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.poc.netzon.se/patient/list')

WebUI.click(findTestObject('Object Repository/Page_Professional/img_Activities_ng-tns-c1-0 (3) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Professional/div_Type_mat-select-arrow (2) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Professional/span_Blood Pressure (3)'))

WebUI.click(findTestObject('Object Repository/Page_Professional/button_Date_mat-icon-button cd'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Professional/div_14 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Professional/button_Add (3)'))

WebUI.delay(2)

WebUI.closeBrowser()

