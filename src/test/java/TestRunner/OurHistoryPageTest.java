package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"src\\test\\java\\Feature\\OurHistoryPage.feature"},
		glue = {"stepdefinition", "hooks"},
		plugin = {"pretty", "json:target/cucumber.json"},
		publish = true
	)

public class OurHistoryPageTest extends AbstractTestNGCucumberTests {

}
