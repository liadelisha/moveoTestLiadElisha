package pageObjacte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BasePage{

	@FindBy(css = "div.menu-all-links > a:nth-child(5)") private WebElement careersBtn;

	public MenuPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreeresTab() {
		click(careersBtn);	
	}

}
