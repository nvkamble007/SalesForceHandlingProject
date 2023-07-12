package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	public WebDriver driver;

	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='Login']");
	By forgotyourpass = By.xpath("//a[@id='forgot_password_link']");
	By cancel = By.xpath("//input[@name='cancel']");
	By clickoncustomdomain = By.xpath("//a[@id='mydomainLink']");
	By clickontryforfree = By.xpath("//a[@id='signup_link']");
	By errormessage=By.xpath("//div[@id='error']");

	public LoginPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement clickonlogin() {
		return driver.findElement(login);
	}

	public WebElement clickonforgotyourpass() {
		return driver.findElement(forgotyourpass);
	}

	public WebElement clickoncancel() {
		return driver.findElement(cancel);
	}

	public WebElement clickoncustomdomain() {
		return driver.findElement(clickoncustomdomain);
	}

	public WebElement clickontryfree() {
		return driver.findElement(clickontryforfree);
	}
	public WebElement errormessage() {
		return driver.findElement(errormessage);
	}
	
}
