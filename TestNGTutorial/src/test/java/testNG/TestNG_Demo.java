package testNG;

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

}
