package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
		features = {"src\\test\\java\\Feature\\HomePageFeature.feature"},
		glue = {"stepdefinition", "hooks"},
		plugin = {"pretty", "json:target/cucumber.json"},
		publish = true
	)

public class HomePageTest extends AbstractTestNGCucumberTests {

}
