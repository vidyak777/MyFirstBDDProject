package Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws Throwable {

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");

		Properties prop = new Properties();
		prop.load(ip);

		String url = prop.getProperty("QAUrl");

		if (driver == null) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
		}		
	
			return driver;
		
	}}
		

