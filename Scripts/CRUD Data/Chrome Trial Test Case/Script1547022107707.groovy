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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://staging.poc.netzon.se/patient/list')

WebUI.click(findTestObject('Page_Professional/img_Activities_ng-tns-c1-0'))

WebUI.doubleClick(findTestObject('Page_Professional/div_Blood Pressure_mat-select-'))

WebUI.click(findTestObject('Page_Professional/span_Blood Pressure'))

WebUI.delay(2)

driver.findElement(By.xpath('//*[@id="mat-dialog-0"]/app-activity-add/div/div[2]/div[2]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button')).click()

WebUI.delay(2)

driver.findElement(By.xpath('//div[text()=\'9\']')).click()

WebUI.delay(2)

WebUI.closeBrowser()

