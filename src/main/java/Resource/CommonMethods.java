package Resource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	
	public static void selectmethod(WebElement dropdown,int index ) {
		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}
	
	public static void softassert(String actualstring,String expectedstring) {
		
		SoftAssert assertion = new SoftAssert();
		String actual = actualstring;
		String expected = expectedstring;
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
	}

}
