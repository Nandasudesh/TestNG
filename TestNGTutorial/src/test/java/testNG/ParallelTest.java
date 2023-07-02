package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	WebDriver driver;
	@Test
	public void firefoxTest() {
		System.out.println("Firefox Testing");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/webhp");
		WebElement logo=driver.findElement(By.className("lnXdpd"));
		if(logo.isDisplayed())
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		
	}
	@Test
	public void getURL() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		WebElement logo=driver.findElement(By.className("lnXdpd"));
		if(logo.isDisplayed())
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
	}

}
