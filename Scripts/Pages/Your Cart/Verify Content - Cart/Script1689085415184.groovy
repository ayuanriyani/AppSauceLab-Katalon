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

Mobile.verifyElementVisible(findTestObject('Your_Cart/button_back_product'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/button_checkout_Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/button_continue_shopping_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/button_remove_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/Title_your_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/title_Qty'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/Title_product_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/title_description'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/qty_product_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/price_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/description_product_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Your_Cart/price_cart'), 0)
