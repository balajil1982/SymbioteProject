package Com.Symbiote.SymbioteProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SymbioteContactConfirmationPage extends SymbioteAbstractPage{

	public SymbioteContactConfirmationPage(WebDriver driver) {
		super (driver);
	}
	
		public String getPageTitle(){
			return driver.findElement(By.cssSelector(".content h1")).getText();
		
		}

	}


