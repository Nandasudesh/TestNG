package testNG;

import org.testng.annotations.Test;

//priority and sequencing in testNG
//test-output-->index.html-->right click-->open with web browser ----- shows the default report

public class TestNG_Priority {
	@Test(priority=1,groups="Regression")
	public void googleTitleTest() {
		System.out.println("Test1");
	}
	
	@Test(priority=2,groups="Regression")
	public void googleURLTest() {
		System.out.println("Test2");
	}
	
	@Test(priority=4,groups="Sanity")
	public void googleLogoTest() {
		System.out.println("Test3");
	}
	@Test(priority=3,groups="BlackBoxTesting")
	public void googleSearchBoxTest() {
		System.out.println("Test4");
	}

}
