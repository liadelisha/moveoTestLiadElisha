package pageObjacte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

	@FindBy(css = "div.menu-button.home > div > svg")
	private WebElement hamburgerBtn;
	
	@FindBy(css = ".cc-compliance [role=\'button\']")
	private WebElement cookiesBtn;

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void openMenu() {
		click(cookiesBtn);
		click(hamburgerBtn);
	}
	
}
