package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public void test() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: "+driver.getTitle());
	}
	
	@Test
	public void firefoxTest() {
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: "+driver.getTitle());
	}
	
	@Test
	public void edgeTest() {
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: "+driver.getTitle());
	}


}
