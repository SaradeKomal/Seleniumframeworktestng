package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
	By username=By.xpath("//input[@id='username']");
	By password= By.xpath("//input[@id='password']");
	By login= By.xpath("//input[@id='Login']");
	By tryforfree=By.xpath("//a[@id='signup_link']");
	By errortext=By.xpath("//div[@id='error']");
	
	
	
	public Loginpageobject(WebDriver driver2) {
this.driver=driver2;	}
	public WebElement Enterusername() {
		return driver.findElement(username);
	}
	public WebElement Enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	public WebElement tryforFree() {
		return driver.findElement(tryforfree);
	}
	public WebElement errorText() {
		return driver.findElement(errortext);
	}

}
