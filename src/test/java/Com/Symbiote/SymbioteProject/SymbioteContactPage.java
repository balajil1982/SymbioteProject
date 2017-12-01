package Com.Symbiote.SymbioteProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SymbioteContactPage extends SymbioteAbstractPage{

	public SymbioteContactPage(WebDriver driver) {
		super (driver);
	}
   public SymbioteContactPage Namefield(String value){
	   driver.findElement(By.name("name_field")).sendKeys(value);
	   return new SymbioteContactPage (driver);
   }
   
public SymbioteContactPage RadioInformation(){
	 WebElement radioBtn = driver.findElement(By.id("rinfo"));
	 
	    radioBtn.click();
	    return new SymbioteContactPage (driver); 
   }

public SymbioteContactPage ZooVolunteercheckbox(){
	driver.findElement(By.id("cdona")).click();
	return new SymbioteContactPage (driver);
}

public SymbioteContactPage EmailCheckbox(){
	driver.findElement(By.id("cadop")).click();
	return new SymbioteContactPage (driver);
}

public SymbioteContactPage Addressfield(String value){
	 driver.findElement(By.name("address_field")).sendKeys(value);
	 return new SymbioteContactPage (driver);
	       
}

public SymbioteContactPage Postcodefield(String value){
	driver.findElement(By.name("postcode_field")).sendKeys(value);
	return new SymbioteContactPage (driver);
}

public SymbioteContactPage emailfield(String value){
	driver.findElement(By.name("email_field")).sendKeys(value);
	return new SymbioteContactPage (driver);
}

public SymbioteContactConfirmationPage Submitmessage(){
	driver.findElement(By.id("submit_message")).click();
	return new SymbioteContactConfirmationPage (driver);
}


	
	
}
	    


