package BaseTest;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basetest {
	String ScreenshotSubFolderName;
    public static Properties prop;
    protected static WebDriver driver;
	
	public basetest() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
	}
	
}