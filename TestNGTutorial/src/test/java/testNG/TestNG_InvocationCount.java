package testNG;

import org.testng.annotations.Test;

//to run a test case multiple count
public class TestNG_InvocationCount {
	
	@Test(invocationCount=10)
	public void loginTest() {
		System.out.println("Login");
	
	}
	
	
	
}
