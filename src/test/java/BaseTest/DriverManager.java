package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static final ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	public static Properties prop;
	private static WebDriver driver;
	
	
	public static synchronized void setDriver(String browser) {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\java\\Resources\\configpom.properties");
			prop.load(ip);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium\\Chrome153\\chromedriver-win64\\chromedriver.exe");
			tldriver.set(new ChromeDriver());
		}
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		tldriver.get().get(url);
		tldriver.get().manage().window().maximize();
		tldriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		tldriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
	
	public static synchronized void quitDriver() {
		if(tldriver.get() != null) {
			tldriver.get().quit();
			tldriver.remove();
		}
	}
	
}
