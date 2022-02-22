package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilies {

	
	public void DropDown(WebElement ele,String text) {
		Select s = new Select(ele);
	s.SelectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElemen(ele).perform();
			 
	public void doubleClick(WebDriver driver,WebElement ele){
		Actions a = new Action(driver);
		a.doubleClick(ele).perform();
	}
	
	
	public void SwitchFrame(WebDriver driver) {
		driver.SwitchTo().frame(0);
		
	}
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
	
public void alertPopupOk()	
	

	}
	
	
	
	
	
}
