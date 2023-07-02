package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//used to give test data to test method
//parameter, excel, data provider

public class ParameterTest {
	
	WebDriver driver;
	@Test
	@Parameters({"url","username","passwd"})
	
	public void obsLoginTest(String url, String username,String password) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		userName.clear();
		userName.sendKeys(username);
		passWord.clear();
		passWord.sendKeys(password);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
	}
	

}
