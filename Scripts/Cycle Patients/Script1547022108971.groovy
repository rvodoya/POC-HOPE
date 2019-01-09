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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://staging.poc.netzon.se/patient/list')

List <WebElement> patients = driver.findElements(By.xpath('/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[1]/div[2]'))

int patientcount = patients.size()

//outerloop:
for(j=1; j>=patientcount; j++){
	println(j)
	if(j==1){
		driver.findElement(By.xpath("/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[1]/div[2]/div[1]")).click()
		WebUI.delay(5)
		driver.findElement(By.xpath("/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[2]/div[1]/div[1]/span[2]/img")).click()
		
		WebUI.click(findTestObject('Page_Professional/div_Type_mat-select-arrow (2) (1) (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/span_Blood Pressure (3) (1)'))
		
		WebUI.click(findTestObject('Page_Professional/button_Date_mat-icon-button cd (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/div_14 (1) (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/mat-icon_access_time (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/span_14 (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/span_Ok (1)'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Page_Professional/button_Add (3) (1)'))
		
		WebUI.delay(2)
		
	}
	else if(j==2){
		driver.findElement(By.xpath('/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/span')).click()
		WebUI.delay(5)
	}
	else if(j==3){
		driver.findElement(By.xpath('/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div[1]')).click()
		WebUI.delay(5)
	}
	else if(j==4){
		driver.findElement(By.xpath('/html/body/app-root/div/app-patient-list/div/div/div[2]/div/div/div[1]/div[2]/div[4]/div[2]/div[1]')).click()
		WebUI.delay(5)
	}
	else{
		break;
	}
}

