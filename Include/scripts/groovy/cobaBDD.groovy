import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class cobaBDD {
	@Given("user login on the page")
	public void user_login_on_the_page() {
		//println "Kasih"
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		
	}

	@When("user input (.*) and (.*)")
	public void user_input_username_and_password(String username, String password) {
		//println "Kapan"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		
	}

	@And("user pressing login button")
	public void user_pressing_login_button() {
		//println "Dan"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
		
	}

	@Then("user directed to home page")
	public void user_directed_to_home_page() {
		WebUI.verifyTextPresent("PIM", false)
		WebUI.closeBrowser()
		//println "Selanjutnya"
	}
}
