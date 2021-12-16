package genericLiab;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities
{
	
	public void dropDown(WebElement ele,String txt) 
	{
		Select s=new Select(ele);
		s.selectByVisibleText(txt);
		
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) 
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick();
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchToDefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	
	public void aletPopupOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	public void alertPopupCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void SwitchTabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		
		for(String b:child)
		{
			
			driver.switchTo().window(b);
		}
	}
	
	public void scollBar(WebDriver driver,int x,int y )
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
	}
	
}
