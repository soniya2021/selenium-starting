package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {

	
	public void DropDown(WebElement ele,String text) {
		Select s = new Select(ele);
	s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
	}	 
	
	public void doubleClick(WebDriver driver,WebElement ele){
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void SwitchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
	
    public void alertPopupOk(WebDriver driver) {
    	driver.switchTo().alert().accept();
    	
    } 	
     
    public void alertPopupCancel(WebDriver driver) {
    driver.switchTo(). alert().dismiss();
    
    }
    
    public void switchTabs(WebDriver driver) {
    	Set<String> Child = driver .getWindowHandles();
    	for(String b : Child) {
    		driver.switchTo().window(b);
    	}
    }
    public void scrollBar(WebDriver driver, int x, int y) { 
    	JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("windows.scrollBy("+ x +","+ y +")");
    }
    
    		}	
	
