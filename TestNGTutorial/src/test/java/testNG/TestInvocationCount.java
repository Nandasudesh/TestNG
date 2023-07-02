package testNG;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInvocationCount {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@Test(invocationCount = 2)
	public void verifyLinkedIn() {

		System.out.println("Test Case 1 with Thread Id - " + Thread.currentThread().getId());

		driver.manage().window().maximize();
		Boolean linkedInIcon = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img"))
				.isEnabled();
		assertTrue(linkedInIcon);
	}

	@Test(invocationCount = 2)
	public void validLoginTest() throws InterruptedException {

		System.out.println("Test Case 2 with Thread Id - " + Thread.currentThread().getId());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String expectedTitle = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//child::h6"))
				.getText();
		Assert.assertTrue(expectedTitle.contains("Dashboard"));
	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();

	}
}
