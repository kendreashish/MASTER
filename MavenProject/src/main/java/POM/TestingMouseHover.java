package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingMouseHover {

	@FindBy(xpath="//span[text()='Testing']")
	private WebElement testingMH;
	
	@FindBy(xpath="//a[text()='Automation Testing']")
	private WebElement automationTesting;
	
	
	
	public TestingMouseHover(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getTestingMH() {
		return testingMH;
	}
	
	public void clickOnAutomation()
	{
		automationTesting.click();
	}
	
	
}
