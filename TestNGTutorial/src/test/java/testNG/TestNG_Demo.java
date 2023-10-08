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

public class TestNG_Demo {
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
		
		@Test
		public void googleSearchTest() {
			System.out.println("Google search");
		}
		
		@AfterMethod
		public void closeGoogle() {
			System.out.println("Google closed");
		}
		
		@AfterTest
		public void closeBrowser() {
			System.out.println("Browser closed");
		}
		
		@AfterClass
		public void downloadReport() {
			System.out.println("Report downloaded");
		}
		@AfterSuite
		public void sendReport() {
			System.out.println("Send Report");
		}

}
