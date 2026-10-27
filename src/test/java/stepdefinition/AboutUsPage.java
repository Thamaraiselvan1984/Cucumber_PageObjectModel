package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsPage {
	
	Pages.AboutUsPage aboutuspage = new Pages.AboutUsPage();

	@Given("user is on the About Us page")
	public void user_is_on_the_About_Us_page() {
		aboutuspage.AboutUsPageTest();
	}
	
    @When("verify the title in About Us page")
    public void verify_the_title_in_About_Us_page() {
    	aboutuspage.Header();
    }
    
    @Then("click on Contact us link")
    public void click_on_Contact_us_link() {
    	aboutuspage.ContactUsPage();
    }
    
	@And("verify the email address")
	public void verify_the_email_address() {
		aboutuspage.email();
	}
	  
	@Then("verify the Talk to Us")
	public void verify_the_Talk_to_Us() {
		aboutuspage.PhoneNumber();
	}

}
