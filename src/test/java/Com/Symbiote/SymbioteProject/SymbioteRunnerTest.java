package Com.Symbiote.SymbioteProject;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	format = {"pretty", "html:target/html/output.html"}, 
		//tags = {"@pageTitle,@AdoptionAnimal"},
		//format={"pretty","html:target/html/output.html","json:target/json/output.json"},
				features = { "src/test/resource/" },
				monochrome = true )


public class SymbioteRunnerTest {
}
