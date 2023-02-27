package pageObjacte;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	WebDriver driver;
	JavascriptExecutor jsExecutor;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		jsExecutor=(JavascriptExecutor)driver; 
	}

	public void fillText(WebElement el,String text) {
		//Highlight element
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", el);  
		sleep(700);
		//Clear the text field
		el.clear();
		//Fill the text field with the text that the method is providing
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		//Highlight element
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", el);  
		sleep(300);
		//Click on the element that the method is providing
		el.click();
	}

	public String getText(WebElement el) {
		//Highlight element
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", el);  
		sleep(700);
		//The method is return the text of the element
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
