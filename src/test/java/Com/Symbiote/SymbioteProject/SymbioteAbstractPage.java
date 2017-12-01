package Com.Symbiote.SymbioteProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Symbiote.SymbioteProject.SymbioteLandingPage;

public abstract class SymbioteAbstractPage {

	public static WebDriver driver;

	public SymbioteAbstractPage(WebDriver driver) {
		
		this.driver = driver;

	}

	public SymbioteLandingPage navigateToWebApp() {
	
		driver.navigate().to("http://www.thetestroom.com/webapp");

		return new SymbioteLandingPage(driver);
	}

}
