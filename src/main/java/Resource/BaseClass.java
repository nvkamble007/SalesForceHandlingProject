package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void browserinitialise() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\file.properties"); // System.getProperty("user.dir")+
																						// code used for prop file location
																		

		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty("chrome");
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			// driver.get("https://login.salesforce.com/?locale=in");

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriver driver=new FirefoxDriver();
		} else {
			System.out.println("broswer is invalid");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {
		browserinitialise();
		driver.get("https://login.salesforce.com/?locale=in");
		
	}

}
