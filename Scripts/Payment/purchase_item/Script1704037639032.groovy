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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/purchase_item/purchase_item_page/btn_cart'))

WebUI.click(findTestObject('Object Repository/purchase_item/purchase_item_page/btn_place_order'))

WebUI.setText(findTestObject('purchase_item/purchase_item_page/field_name'), GlobalVariable.name)

WebUI.setText(findTestObject('Object Repository/purchase_item/purchase_item_page/field_country'), GlobalVariable.country)

WebUI.setText(findTestObject('Object Repository/purchase_item/purchase_item_page/field_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Repository/purchase_item/purchase_item_page/field_credit_card'), GlobalVariable.credit_card)

WebUI.setText(findTestObject('Object Repository/purchase_item/purchase_item_page/field_month'), GlobalVariable.month)

WebUI.setText(findTestObject('Object Repository/purchase_item/purchase_item_page/field_year'), GlobalVariable.year)

WebUI.click(findTestObject('Object Repository/purchase_item/purchase_item_page/btn_purchase'))

WebUI.click(findTestObject('Object Repository/purchase_item/purchase_item_page/title_thank_you_for_your_purchase'))

WebUI.click(findTestObject('Object Repository/purchase_item/purchase_item_page/btn_ok'))

WebUI.closeBrowser()

