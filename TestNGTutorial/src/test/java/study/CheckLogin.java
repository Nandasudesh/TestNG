package study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckLogin {

	@Test
	public void checkValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://qalegend.com/mobile_service/panel/login");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class); // We create an instance of LoginPage
																					// class and use it to refer its
																					// objects
		loginpage.login("admin@admin.com", "password");
	}

}
