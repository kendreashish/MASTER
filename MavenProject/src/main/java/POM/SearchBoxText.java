package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxText {

	@FindBy(name="q")
	private WebElement searchBox;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	
	public SearchBoxText(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void EnterText()
	{
		searchBox.click();
		searchBox.sendKeys("Selenium");
	}
	public void SubmitBtnClick() {
		submitBtn.click();
	}
	
	
	
}
