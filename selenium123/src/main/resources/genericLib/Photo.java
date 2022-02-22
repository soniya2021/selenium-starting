package genericLib;

import java.sql.Date;

import org.openqa.selenium.TakesScreenshot;

public class Photo {

	
	public void getPhoto(WebDriver driver,String name) {
		
		Date d = new Date();
		String Date = d.toString().replaceAll(":","-");
		
		TakesScreenshot ts = (TakeScreenShot)driver;
		File src = ts.getScreenshotAs(OutputType,FILE);
		File dest = new File(AutoConstant.photopath+date+name+".png");)
		File dest = newFile(src,dest);
	
	
	
	
	
	
	
	
}
