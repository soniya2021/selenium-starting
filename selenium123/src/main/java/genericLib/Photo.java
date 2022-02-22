package genericLib;


import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {

	private static final OutputType OutputType = null;
	private static final String Date = null;
	private static final String Name = null;
	private TakesScreenshot driver;
	public void getPhoto(WebDriver driver,String name)throws IOException {
		
		
	Date d = new Date(0);
	String date = d.toString().replaceAll(":","-");	
	}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photopath+ Date + Name +".png");
	//	FileUtils.copyFile(src,dest);
		}	
	

