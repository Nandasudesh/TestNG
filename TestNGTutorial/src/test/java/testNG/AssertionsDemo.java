package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//mechanism provided by TestNG for testing equalities
/*1. hard assertions or assert
 * assertEquals()
 * assertNotEquals()
 * assertTrue()
 * assertFalse()
 * assertNotNull()
 */
/*2. soft assertions or verify
 * 
 */
public class AssertionsDemo {
	WebDriver driver;
	
	@Test
	public void setUp() {
		
	System.setProperty("webDriver.edge.driver","C:\\Users\\nanda\\OneDrive\\Desktop\\Documents\\Nanda\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	
	String expTitle="gle";
	
	//Assert.assertEquals(actTitle,expTitle,"mismatch"); //compare Strings if false assertion error java.lang.AssertionError: expected [google] but found [Google]
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(expTitle, actTitle);
	softassert.assertAll();

	System.out.println("Test passed");
	}
	@Test
	public void demo() {
		System.out.println("Test passedd");
	}

}
