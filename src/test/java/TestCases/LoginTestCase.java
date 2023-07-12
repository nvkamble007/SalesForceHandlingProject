package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resource.BaseClass;
import Resource.CommonMethods;
import Resource.Constant;

public class LoginTestCase extends BaseClass {

	@Test
	public void method() throws IOException, InterruptedException {

		
		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.enterusername().sendKeys(Constant.username);
		LPO.enterpassword().sendKeys(Constant.password);
		LPO.clickonlogin().click();
		
		Thread.sleep(4000);
		//LPO.clickonforgotyourpass().click();

		// LPO.clickoncancel();
		// LPO.clickoncustomdomain().click();

		// LPO.clickontryfree().click();
		
		CommonMethods.softassert(LPO.errormessage().getText(), Constant.errormessage);
		CommonMethods.softassert(LPO.clickonforgotyourpass().getText(), Constant.forgotpassword);
		

	}

}
