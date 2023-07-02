package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test(dataProvider="getData", dataProviderClass=DatafromExcel.class)

public class DataProviderToExcel {
	

	WebDriver driver;
	public void data(String username, String password) {
	//System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qalegend.com/billing/public/login");
	
	WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
	userName.clear();
	userName.sendKeys(username);
	WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
	passWord.clear();
	passWord.sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

}
}
