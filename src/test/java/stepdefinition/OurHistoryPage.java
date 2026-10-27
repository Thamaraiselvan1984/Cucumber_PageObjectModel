package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurHistoryPage {
	
	Pages.OurHistoryPage ourhistory = new Pages.OurHistoryPage();
	
	@Given("click on OurHistoryPage link")
	public void click_on_our_history_page_link() {
		ourhistory.OurHistoryLink();
	}

	@When("verify the OurHistoryPage title")
	public void verify_the_our_history_page_title() {
		ourhistory.OurHistoryPageTitle();
	}

	@Then("verify the OurHistoryPage Header")
	public void verify_the_our_history_page_header() {
		ourhistory.OurHistoryHeader();
	}

	@And("click on AI-Driven extension")
	public void click_on_ai_driven_extension() {
		ourhistory.AIdrivenExtention();
	}

	@And("verify the page tile of AI-Driven extension")
	public void verify_the_page_tile_of_ai_driven_extension() {
		ourhistory.AIdrivenTitle();
	}

}
