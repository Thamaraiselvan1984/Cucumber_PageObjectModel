package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseTest.basetest;

public class AboutUsPage extends basetest {
 
	@FindBy(xpath = "//a[@title='About Us']")
	WebElement AboutUslink;
	
	@FindBy(xpath = "//h1[contains(text(),'About Us – World’s Largest AI-Powered Coupon System')]")
	WebElement header;
	
	@FindBy(xpath = "//title[contains(text(),'About Us: Discover the World of Savings with AskmeOffers')]")
    WebElement title;
	
	@FindBy(xpath = "//a[@rel='noreferrer noopener']")
	WebElement ContactUs;
	
	@FindBy(xpath = "//a[normalize-space()='support@askmeoffers.com']")
	WebElement email;

	@FindBy(xpath = "//strong[normalize-space()='+91 8095196052']")
	WebElement PhoneNumber;
	
	
	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AboutUsPage AboutUsPageTest() {
			AboutUslink.click();
			String expected = "About Us: Discover the World of Savings with AskmeOffers";
			String actual = driver.getTitle();
			Assert.assertEquals(expected, actual);
	  return new AboutUsPage();
	}
	
	public AboutUsPage Header() {
		String expected = "About Us – World’s Largest AI-Powered Coupon System";
		String actual = header.getText();
		Assert.assertEquals(expected, actual, "header not matching");
		return new AboutUsPage();
	}
	
	public AboutUsPage ContactUsPage() {
		Actions act = new Actions(driver);
		act.moveToElement(ContactUs).build().perform();
		ContactUs.click();
		return new AboutUsPage();
	}
	
	public AboutUsPage email() {
		String expected = "support@askmeoffers.com";
		String actual = email.getAccessibleName();
		Assert.assertEquals(expected, actual, "email not matching");
		return new AboutUsPage();
	}
	
	public AboutUsPage PhoneNumber() {
		String expected = "+91 8095196052";
		String actual = PhoneNumber.getText();
		Assert.assertEquals(expected, actual, "Phone number not matching");
		return new AboutUsPage();
	}
	
}
