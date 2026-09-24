package hooks;

import BaseTest.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

	@Before(order = 0)
	public void launchBrowser() {
		DriverManager.setDriver("Chrome");
	}
	
	@After(order = 0)
	public void tearDown() {
		DriverManager.quitDriver();
	}
}
