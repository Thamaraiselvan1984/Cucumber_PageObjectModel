package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static Properties prop;
	public static WebDriver driver;
	
	public void Readprop() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
			System.getProperty("user.dir") + "src\\test\\java\\Resources\\configpom.properties");
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void BrowerSetup() {
	String browser = prop.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium\\Chrome151\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
  }
}
