package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPageObject {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By jobtitle = By.xpath("//input[@name='UserTitle']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	private By phone = By.xpath("//input[@name='UserPhone']");
	private By country = By.xpath("//Select[@name='CompanyCountry']");
	private By agreement = By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By starttrial = By.xpath("//button[@name='start my free trial']");

	public SignUpPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement clickonfirstname() {
		return driver.findElement(firstname);
	}

	public WebElement clickonlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enterjobtitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement clickonemail() {
		return driver.findElement(email);
	}

	public WebElement clickoncompany() {
		return driver.findElement(company);
	}

	public WebElement enteremployees() {
		return driver.findElement(employees);
	}

	public WebElement clickonphone() {
		return driver.findElement(phone);
	}

	public WebElement clickoncountry() {
		return driver.findElement(country);
	}

	public WebElement clickonagree() {
		return driver.findElement(agreement);
	}

	public WebElement clickonstarttrial() {
		return driver.findElement(starttrial);

	}
}
