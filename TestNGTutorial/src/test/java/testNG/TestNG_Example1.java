package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_Example1 {
	WebDriver driver;
	//@BeforeMethod
	//public void 
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Launch chrome");
	}
	
	@Test(priority=3)
	public void test2() {
		int a=5/0;
		System.out.println("Login App");
	}
	
	@Test(priority=2)
	public void test3() {
		System.out.println("Search URL");
	}
	
	@AfterMethod
	public void close() {
		System.out.println("Close browser");
	}

}
