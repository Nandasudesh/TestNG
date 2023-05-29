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


public class DemoProject1 {
	
	
	
	//preconditions
	
	@BeforeSuite
	public void setUp() {
		System.out.println("SetUp the system property @BeforeSuite");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome browser @BeforeClass");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login to the App @BeforeTest");
	}
	
	@BeforeMethod
	public void clickURL() {
		System.out.println("Clicked URL @BeforeMethod");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google title @Test1");
	}
	
	
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Deleted all cookies @AfterTest");
	}
	
	@Test
	public void googleSearch() {
		System.out.println("Google search test @Test2");
	}
	
	//post conditions
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app @AfterMethod");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser closed @AfterClass");
	}
	
	@AfterTest
	public void deleteCookiess() {
		System.out.println("Deleted cookies @AfterTest");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Report generated @AfterSuite");
	}
	
	

}
