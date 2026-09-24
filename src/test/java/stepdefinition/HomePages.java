package stepdefinition;


import org.testng.Assert;
import BaseTest.basetest;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePages extends basetest {
	
	
   HomePage homepage = new HomePage();
	
	@When("verify the askmeoffers link")
	public void verify_the_askmeoffers_link() {
		homepage.askmeofferslinktext();
	}
	
	@When("user clicked on AboutUs link")
	public void user_clicked_on_About_us_link()  {
	    homepage.AboutUsLink();
    }
	
	@Then("user could be able to land in AboutUs page")
	public void user_could_be_able_to_land_in_about_us_page() {
		String expected = "About Us: Discover the World of Savings with AskmeOffers";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "page title doesn't match");
	}

	@When("user clicked on Health link")
	public void user_clicked_on_health_link()  {
	    homepage.healthLink();
	}
	
	@Then("user could be able to land in the Health page")
	public void user_could_be_able_to_land_in_the_Health_page() {
		String expected = "Health Coupon, Promo Codes & Offers";
		String actual = driver.getTitle();
	    Assert.assertEquals(actual, expected, "Page title doesn't match");
	}
	
	@When("user clicked on Our History link")
	public void user_clicked_on_Our_History_link()  {
		homepage.OurHistoryLink();
	
	}

	@Then("user could be able to land in the Our History page")
	public void user_could_be_able_to_land_in_the_Our_History_page() {
		String expected = "AskmeOffers History";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "Page title doesn't match");
	}
	
	@When("user clicked on Breaking News link")
	public void user_clicked_on_breaking_news_link()  {
		homepage.BreakingNewsLink();
	}
	
	@Then("user could be able to land in the Breaking News")
	public void user_could_be_able_to_land_in_the_Breaking_News() {
		String expected = "Breaking News Coupon, Promo Codes & Offers";
		String actual = driver.getTitle();
	    Assert.assertEquals(actual, expected, "Page title doesn't match");
	}

	@When("user clicked on Ecommerce News link")
	public void user_clicked_on_ecommerce_news_link()  {
	    homepage.EcommerceNewsLink();
	}
	
	@Then("user could be able to land in the Ecommerce News page")
	public void user_could_be_able_to_land_in_the_Ecommerce_News_page() {
		String expected = "Ecommerce News Coupon, Promo Codes & Offers";
		String actual = driver.getTitle();
	    Assert.assertEquals(actual, expected, "Page title doesn't match");
	}
	

	@When("user clicked on Tech link")
	public void user_clicked_on_tech_link()  {
	    homepage.Techlink();
	}
	
	@Then("user could be able to land in the Tech page")
	public void user_could_be_able_to_land_in_the_tech_page() {
		String expected = "Tech Coupon, Promo Codes & Offers";  
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "Page tile doesn't match");
	}

}

