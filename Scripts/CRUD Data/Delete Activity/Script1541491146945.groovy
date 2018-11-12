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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://poc.netzon.se/patient/list')

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/div_Michael Bay'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/div_Brie Larson'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/span_brie.larsonmailinator.com'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/div_Jessica Chastain'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/div_James Franco  james.franco'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/div_Show Graph_mat-checkbox-in'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/img_Activities_ng-tns-c1-0'))

WebUI.click(findTestObject('Object Repository/Page_Professional/Page_Professional/Page_Professional/button_Remove'))

WebUI.delay(2)

WebUI.closeBrowser()

