package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckLogin {
	
	@Test
	public void checkValidUser() {
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://qalegend.com/mobile_service/panel/login");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class); //creating page object
		loginpage.login("admin@admin.com","password");
	}

}
