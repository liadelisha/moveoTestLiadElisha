package Tests;

import org.testng.annotations.Test;
import pageObjacte.CareersPage;
import pageObjacte.MainPage;
import pageObjacte.MenuPage;

public class ApplyForPositionTest extends BaseTest{
	
	@Test
	public void tc01_open_menu_tab() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openManu();
	}
	
	@Test
	public void tc02_click_on_creeres_teb() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.clickOnCreeresTab();
	}
	
	@Test
	public void tc03_fill_the_career_form() {
		CareersPage crPage = new CareersPage(driver);
		crPage.applyForPosition("TEST - automation candidate", "elishaliad@gmail.com", "522867736", "Thank you very much for the opportunity to do the test");
	}

}
