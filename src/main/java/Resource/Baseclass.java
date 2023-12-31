package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
public WebDriver driver;
public Properties prop;
	public void initializeDriver() throws IOException {
	//access file
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.properties");

	//read properties file
	Properties prop=new Properties();
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox")) {
	 driver=new FirefoxDriver();
	} else if(browserName.equalsIgnoreCase("Edge")) {
		 driver=new EdgeDriver();
	} else {
		System.out.println("please add valid browser");
	}
	}
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initializeDriver();
	//String url=	prop.getProperty("url");
	//driver.get(url);
		driver.get("https://login.salesforce.com/");
	}
	@AfterMethod
	public void Quitbrowser() {
		driver.quit();
	}
}