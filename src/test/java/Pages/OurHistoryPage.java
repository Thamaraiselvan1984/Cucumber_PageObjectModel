package Pages;

import java.sql.DriverAction;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import BaseTest.basetest;


public class OurHistoryPage extends basetest {
	
	@FindBy(xpath = "//a[@title='Our History']")
	WebElement OurHistoryLink;
	
	@FindBy(xpath = "//title[normalize-space()='AskmeOffers History']")
	WebElement title;
	
	@FindBy(xpath = "//h1[contains(text(),'AskmeOffers History: From Bookstore to Leading E-commerce Platform')]")
	WebElement header;

	@FindBy(xpath = "//a[normalize-space()='AI-driven extensions']")
	WebElement AIdriven;
	
	@FindBy(xpath = "/html/head/title/text()")
	WebElement AIdrivenTitle;
	
	public OurHistoryPage OurHistoryLink() {
		OurHistoryLink.click();
		return new OurHistoryPage();
	}
	
	public OurHistoryPage OurHistoryPageTitle() {
		String expected = "AskmeOffers History";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual, "OurHistory title not matching");
		return new OurHistoryPage();
	}
	
	public OurHistoryPage OurHistoryHeader() {
		String expected = "AskmeOffers History: From Bookstore to Leading E-commerce Platform";
		String actual = header.getText();
		Assert.assertEquals(expected, actual, "OurHistoryHeader");
		return new OurHistoryPage();
	}
	
	public OurHistoryPage AIdrivenExtention() {
		Actions act = new Actions(driver);
		act.moveToElement(AIdriven).build().perform();
		AIdriven.click();
		return new OurHistoryPage();
	}
	
	public OurHistoryPage AIdrivenTitle() 
    {
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(ChildWindow)) {
				String actual = driver.switchTo().window(ChildWindow).getTitle();
				String expected = "AskmeOffers AI: Automatically Applies Coupons, Promo Codes & Offers - Chrome Web Store";
			    Assert.assertEquals(expected, actual, "AIdrivenTitle not match");
			}
	    }
		return new OurHistoryPage();
    }
}
