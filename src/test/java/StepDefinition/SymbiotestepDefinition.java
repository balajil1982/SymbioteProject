package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Com.Symbiote.SymbioteProject.SymbioteContactConfirmationPage;
import Com.Symbiote.SymbioteProject.SymbioteContactPage;
import Com.Symbiote.SymbioteProject.SymbioteLandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SymbiotestepDefinition  {
	
	public static WebDriver obj = null;
	


	 
	 SymbioteLandingPage landingPage;
	 SymbioteContactPage contactPage;
	 SymbioteContactConfirmationPage contactConfirmationPage;
     
	@Given("^I am on Zoo site page$")
	public void I_am_on_Zoo_site_page() throws Throwable {
		//driver.navigate().to("http://www.thetestroom.com/webapp/index.html");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1034519\\workspace\\BudgetPOC\\lib\\chromedriver_win32\\chromedriver.exe");
		obj = new ChromeDriver();
		landingPage = new SymbioteLandingPage(obj);
		landingPage.navigateToWebApp();
	}

	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String link) throws Throwable {
		//driver.findElement(By.id("contact_link")).click();
		contactPage = landingPage.navigateToContactPage(link);
	}

	@And("^I enter \"([^\"]*)\" into the name text box$")
	public void i_enter_into_the_name_text_box(String value) throws Throwable {
		//driver.findElement(By.name("name_field")).sendKeys(value);
	    contactPage.Namefield(value);
	}

	@And("^I select Information radio button$")
	public void i_select_Information_radio_button() throws Throwable {
	
//    WebElement radioBtn = driver.findElement(By.id("rinfo"));
// 
//    radioBtn.click();
		
		contactPage.RadioInformation();
	}

	@And("^I select Zoo Volunteer check box$")
	public void i_select_Zoo_Volunteer_check_box() throws Throwable {
		 //driver.findElement(By.id("cdona")).click();
		contactPage.ZooVolunteercheckbox();
	}

	@And("^I select Email Newsletter check box$")
	public void i_select_Email_Newsletter_check_box() throws Throwable {
		 //driver.findElement(By.id("cadop")).click();
		contactPage.EmailCheckbox();
	}

	@And("^I enter \"([^\"]*)\" into the address text box$")
	public void i_enter_into_the_address_text_box(String value) throws Throwable {
		 //driver.findElement(By.name("address_field")).sendKeys(value);
		contactPage.Addressfield(value);
	}

	@And("^I enter \"([^\"]*)\" into the postcode text box$")
	public void i_enter_into_the_postcode_text_box(String value) throws Throwable {
		 //driver.findElement(By.name("postcode_field")).sendKeys(value);
		contactPage.Postcodefield(value);
	}

	@And("^I enter \"([^\"]*)\" into the email text box$")
	public void i_enter_into_the_email_text_box(String value) throws Throwable {
		//driver.findElement(By.name("email_field")).sendKeys(value);
		contactPage.emailfield(value);
	}

	@And("^I click on Send button$")
	public void i_click_on_Send_button() throws Throwable {
		//driver.findElement(By.id("submit_message")).click();
		contactConfirmationPage = contactPage.Submitmessage();
	}

	@Then("^I am on the confirmation page$")
	public void i_am_on_the_confirmation_page() throws Throwable {
		//Assert.assertTrue(driver.findElement(By.cssSelector(".content h1")).getText().contains("We have your message"));
		Assert.assertTrue(contactConfirmationPage.getPageTitle().contains("We have your message"));
	}
	
	

}
