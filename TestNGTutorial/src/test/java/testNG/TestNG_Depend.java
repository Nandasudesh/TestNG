package testNG;

import org.testng.annotations.Test;

public class TestNG_Depend {
	
	@Test
	public void loginTest() {
		System.out.println("Login");
		int a=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Home Page");
	}
	
	

}
