package Resource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	public static void handeldropdown(WebElement a,int index ) {
		Select s=new Select(a);
		s.selectByIndex(index);
		
	}
	public static void handelassertion(String at,String et ,String message ) {
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals(at, et, message);
		
	}

}
