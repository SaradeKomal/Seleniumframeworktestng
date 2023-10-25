package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.Loginpageobject;
import PageObjectModel.Signuppageobject;
import Resource.Baseclass;
import Resource.CommonMethods;
import Resource.Constant;

public class VerifySignuppage extends Baseclass {
	@Test
	public void signup() throws IOException {
		
		Loginpageobject LPO=new Loginpageobject(driver);
		LPO.tryforFree().click();
		
		Signuppageobject SPO=new Signuppageobject(driver);
		SPO.firstName().sendKeys(Constant.firstname);
		SPO.lastName().sendKeys(Constant.lastname);
		CommonMethods.handeldropdown(SPO.Employee(), 1);
		//Select s=new Select(SPO.Employee());
		//s.selectByIndex(1);
	}

}
