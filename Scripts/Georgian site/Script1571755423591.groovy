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

WebUI.openBrowser('https://docs.google.com/forms/d/e/1FAIpQLSfp7B7edWQu8HMPkRJnJJ-rdlbNkzOK0hEGPEB2q08hOSmYPw/viewform?vc=0&c=0&w=1&usp=mail_form_link')

WebUI.setText(findTestObject('Object Repository/Test1/Page_Event registration/input__entry2092238618'), Name)

WebUI.setText(findTestObject('Object Repository/Test1/Page_Event registration/input__entry1556369182'), Email)

WebUI.setText(findTestObject('Object Repository/Test1/Page_Event registration/input__entry479301265'), Org)

WebUI.click(findTestObject('Object Repository/Test1/Page_Event registration/div__quantumWizTogglePapercheckboxInnerBox _d31f3f'))

WebUI.click(findTestObject('Object Repository/Test1/Page_Event registration/div_Vegetarian_quantumWizTogglePaperradioOf_605807'))

WebUI.click(findTestObject('Object Repository/Test1/Page_Event registration/div__quantumWizTogglePapercheckboxInnerBox _d31f3f_1'))

WebUI.click(findTestObject('Object Repository/Test1/Page_Event registration/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Test1/Page_Event registration/div_We have received your registrationInsert other information hereSave the link below which can be used to edit your registration up until the registration closing date'), 
    0)

WebUI.closeBrowser()

