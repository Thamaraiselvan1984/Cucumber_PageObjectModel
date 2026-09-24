package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.basetest;

public class HomePage extends basetest {
	
	@FindBy(xpath = "//a[normalize-space()='askmeoffers.com']")
    WebElement askmeofferslinktext; 	

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement homelink;
	
	@FindBy(xpath = "//a[@title='About Us']")
	WebElement AboutUsLink;
	
	@FindBy(xpath = "//a[@title='Our History']")
	WebElement OurHistoryLink;
	
	@FindBy(xpath = "//a[normalize-space()='Breaking News']")
	WebElement BreakingNewsLink;
	
	@FindBy(xpath = "//a[normalize-space()='Ecommerce News']")
	WebElement EcommerceNewsLink;
	
	@FindBy(xpath = "//a[normalize-space()='Health']")
    WebElement healthLink;
	
	@FindBy(xpath = "//a[normalize-space()='Tech']")
	WebElement Techlink; 
	
	
	public void askmeofferslinktext() {
		askmeofferslinktext.isDisplayed();
	}
	
	public AboutUsPage AboutUsLink() {
		AboutUsLink.click();
		return new AboutUsPage();
	}
	
	public OurHistoryPage OurHistoryLink() {
		OurHistoryLink.click();
		return new OurHistoryPage();
	}
	
	public BreakingNewsPage BreakingNewsLink() {
		BreakingNewsLink.click();
		return new BreakingNewsPage();
	}
	
	public EcommerceNewsPage EcommerceNewsLink() {
		EcommerceNewsLink.click();
		return new EcommerceNewsPage();
	}
	
	public healthLinkPage healthLink() {
		healthLink.click();
		return new healthLinkPage();
	}
	
	public TechlinkPage Techlink() {
		Techlink.click();
		return new TechlinkPage();
	}
}
