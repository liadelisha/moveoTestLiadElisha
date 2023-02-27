package pageObjacte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends BasePage{

	@FindBy(css = "#answer-name [aria-labelledby=\'name\']")
	private WebElement nameField;

	@FindBy(css = ".dropzone")
	private WebElement cvField;

	@FindBy(css = "#answer-status5 [role='button']")
	private WebElement positionBtn;

	@FindBy(css = "#react-select-2-option-3")
	private WebElement positionSelect;

	@FindBy(css = "#answer-status_1 [role='button']")
	private WebElement aboutUsBtn;

	@FindBy(css = "#react-select-3-option-2")
	private WebElement aboutUsLinkedIn;

	@FindBy(css = ".form-input.email-form-input")
	private WebElement emailField;

	@FindBy(css = ".Select-arrow")
	private WebElement countryPhoneBtn;

	@FindBy(css = "#react-select-2--option-232 > div > div.prefix")
	private WebElement countryPhoneIsrael;

	@FindBy(css = "[type='tel']")
	private WebElement phoneNumberField;

	@FindBy(xpath = "//*[@id=\"answer-check\"]/label")
	private WebElement privacyPolicyCheckBox;

	@FindBy(css = ".form-input.update-form-input")
	private WebElement commentsField;

	@FindBy(css = ".rc-anchor-center-item.rc-anchor-checkbox-holder")
	private WebElement recaptchaBtn;

	@FindBy(xpath = "//*[@id=\"surveyModeScrollElement\"]/div[9]/button")
	private WebElement submitBtn;

	@FindBy(css = "[title='application form']")
	private WebElement formFram;

	@FindBy(css = "[title='reCAPTCHA']")
	private WebElement reCaptchaFram;

	String file;
	String cv = "/Users/user/eclipse-workspace/AutomationTestMoveo/Liad Elisha CV.pdf‬‬";

	public CareersPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		file = System.getProperty("user.dir") + "\\Files\\LiadElishaCV.pdf";
	}

	public void applyForPosition(String name, String email, String phoneNumber, String comments) {

		driver.switchTo().frame(formFram);
		fillText(nameField, name);	
		//cvField.sendKeys(file);	
		click(positionBtn);
		sleep(1000);
		click(positionSelect);
		click(aboutUsBtn);
		click(aboutUsLinkedIn);
		fillText(emailField, email);
		fillText(phoneNumberField, phoneNumber);
		click(countryPhoneBtn);
		click(countryPhoneIsrael);
		click(privacyPolicyCheckBox);
		fillText(commentsField, comments);
		driver.switchTo().frame(reCaptchaFram);
		click(recaptchaBtn);
		sleep(15000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(formFram);
		click(submitBtn);
		driver.switchTo().defaultContent();
	}

}
