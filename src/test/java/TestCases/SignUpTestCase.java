package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resource.BaseClass;
import Resource.CommonMethods;
import Resource.Constant;

@Test
public class SignUpTestCase extends BaseClass {

	public void method() throws IOException, InterruptedException {

		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.clickontryfree().click();

		Thread.sleep(4000);
		SignUpPageObject SPO = new SignUpPageObject(driver);

		SPO.clickonfirstname().sendKeys(Constant.firstname);
		SPO.clickonlastname().sendKeys(Constant.lastname);
		SPO.clickonemail().sendKeys(Constant.email);

		//CommonMethods.selectmethod(SPO.enterjobtitle(), 7);
		
		SPO.clickoncompany().sendKeys(Constant.companyname);

		CommonMethods.selectmethod(SPO.enteremployees(), 2);

		SPO.clickonphone().sendKeys(Constant.phonenumber);
		SPO.clickonagree().click();
		Thread.sleep(3000);
		//SPO.clickonstarttrial().click();

	}
}
