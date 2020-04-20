package com.helper.loginpage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Alert
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Utils {

	@Keyword
	public void launchApplication(String URL){
		WebUI.openBrowser(URL)
		WebUI.maximizeWindow()
	}

	@Keyword
	public void login(String UEN,String CorPassId,String Password){

		WebUI.setText(findTestObject('Object Repository/LoginPage/UEN'), UEN)
		WebUI.setText(findTestObject('Object Repository/LoginPage/CorPass'), CorPassId)
		WebUI.setText(findTestObject('Object Repository/LoginPage/Password'), Password)
		WebUI.click(findTestObject('Object Repository/LoginPage/logBtn'))
		WebUI.waitForPageLoad(5)
	}

	@Keyword
	public void navigationtoEnrolmentpage(){
		WebUI.click(findTestObject('HomePage/Enrolment'))
		//WebUI.click(findTestObject('HomePage/Logouticon'))
		WebUI.delay(5)
		//WebUI.click(findTestObject('HomePage/Logout'))
	}
}
