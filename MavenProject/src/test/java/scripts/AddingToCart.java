package scripts;

import org.testng.annotations.Test;

import POM.AddtocartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericLiab.BaseClass;


public class AddingToCart extends BaseClass{
	
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapplication();
		utilities.SwitchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, d.getCourseTab());
		d.seleniumTrainingbtn();
		
		AddtocartPage a=new AddtocartPage(driver);
		utilities.doubleclick(driver,a.getAddbtn());
		a.addtocartBtn();
		
		utilities.aletPopupOk(driver);
		
		
		
		
	}
	
	
}