package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class javaForSelenium {

	
	@FindBy(xpath="//body[@class='vp-center']")
	private WebElement videoplayerFrame;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closeBox1;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playBtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takeThisCoursebtn;
	
	
	public javaForSelenium(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void ClosePromptBoxjava()
	{
		closeBox1.click();
	}
	

	public WebElement getVideoplayerFrame() {
		return videoplayerFrame;
	}
	
	public void clickPlayBtn()
	{
		playBtn.click();
	}
	
	public void clickPauseBtn()
	{
		pausebtn.click();
	}
	
	public void takethisCourseButton()
	{
		takeThisCoursebtn.click();
	}
	
}
