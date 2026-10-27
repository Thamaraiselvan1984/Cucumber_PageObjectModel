package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static final ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	public static Properties prop;
	
	public static void setDriver(String browser) {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\java\\Resources\\configpom.properties");
			prop.load(ip);
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium\\Chrome155\\chromedriver-win64\\chromedriver.exe");
				tldriver.set(new ChromeDriver());
			}
			String browserName = prop.getProperty("browser");
			String url = prop.getProperty("url");
			tldriver.get().get(url);
			tldriver.get().manage().window().maximize();
			tldriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			tldriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		} catch (SessionNotCreatedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	public static void quitDriver() {
		if(tldriver.get() != null) {
			tldriver.get().quit();
			tldriver.remove();
		}
	}
	
}
