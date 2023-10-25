package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Loginpageobject;
import Resource.Baseclass;
import Resource.CommonMethods;
import Resource.Constant;

public class Verifuloginpage extends Baseclass{
	@Test
public void login() throws IOException {
	
	Loginpageobject LPO=new Loginpageobject(driver);
	LPO.Enterusername().sendKeys(Constant.username);
	LPO.Enterpassword().sendKeys(Constant.lastname);
	LPO.clicklogin().click();
	String actualText=LPO.errorText().getText();
	String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	CommonMethods.handelassertion(LPO.errorText().getText(), expectedText, "err");
	
	/*SoftAssert assertion=new SoftAssert();
	assertion.assertEquals(actualText, expectedText, "Error msg");
	assertion.assertAll();*/
}
}
