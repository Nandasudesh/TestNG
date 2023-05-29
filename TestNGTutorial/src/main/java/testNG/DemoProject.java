package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoProject {
	
	
	
	//preconditions
	
	@BeforeSuite
	public void setUp() {
		System.out.println("SetUp the system property");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login to the App");
	}
	
	@BeforeMethod
	public void clickURL() {
		System.out.println("Clicked URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google title");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Logout from APP");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Deleted all cookies");
	}
	
	@Test
	public void googleSearch() {
		System.out.println("Google search test");
	}
	
	//post conditions
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
	
	@AfterTest
	public void deleteCookiess() {
		System.out.println("Deleted cookies");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Report generated");
	}
	
	

}
