package study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// this is page object model. using object
	// WebElement username=driver.findElement(By.name="identity") //
	// @FindBy(locator="value")
	@FindBy(name = "identity")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "submit")
	WebElement submit;

	public void login(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		submit.click();

	}
}
