package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericLib.Photo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public propertyfile pdata = new propertyfile();
 public WebDriverUtilies Utilies = new WebDriverUtilies();
@BeforeMethod
public void OpenApp() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getPropertyData("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

@AfterMethod
public void CloseApp(ITestResult result )throws IOException {
	int status = result.getStatus();
	String name = result.getName();
	if(status==2) {
		Photo p = new Photo();
		p.getPhoto(driver,name);
	}
	driver.quit();
}
}
