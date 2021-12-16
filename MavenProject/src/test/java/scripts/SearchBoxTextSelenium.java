package scripts;

import org.testng.annotations.Test;

import POM.SearchBoxText;
import POM.SeleniumPage;
import POM.TestingMouseHover;
import POM.javaForSelenium;
import genericLiab.BaseClass;

public class SearchBoxTextSelenium extends BaseClass{
	
	@Test
	public void Tc2()
	{
		SearchBoxText sb=new SearchBoxText(driver);
		sb.EnterText();
		sb.SubmitBtnClick();
		
		TestingMouseHover t=new TestingMouseHover(driver);
	
		utilities.mouseHover(driver,t.getTestingMH());
		t.clickOnAutomation();
		
		
		SeleniumPage s=new SeleniumPage(driver);
		s.ClosePromptBox();
		s.clickOnCorejava();
		
		javaForSelenium j=new javaForSelenium(driver);
		j.ClosePromptBoxjava();
		utilities.switchFrame(driver);
		j.clickPlayBtn();
		j.clickPauseBtn();
		utilities.switchToDefaultFrame(driver);
		j.takethisCourseButton();
		
	}

}
