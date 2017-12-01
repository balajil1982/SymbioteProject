package Com.Symbiote.SymbioteProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SymbioteLandingPage extends SymbioteAbstractPage {

	public SymbioteLandingPage(WebDriver driver) {
		super(driver);
		
	}

	public SymbioteContactPage navigateToContactPage (String link){
		driver.findElement(By.id("contact_link")).click();
		return new SymbioteContactPage(driver);
	}
	
	
	
}
