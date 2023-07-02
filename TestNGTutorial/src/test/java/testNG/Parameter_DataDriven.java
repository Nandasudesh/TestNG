package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_DataDriven {
	WebDriver driver;
	@Test(dataProvider="loginTestData")
	
	public void obsLoginTest(String username,String password) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/billing/public/login");
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		userName.clear();
		userName.sendKeys(username);
		passWord.clear();
		passWord.sendKeys(password);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		driver.findElement(By.xpath("//button[text()='End tour']")).click();
		
	}
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData() {
		Object[][] data=new Object[3][2]; //declaring array, array name=data
		data[0][0]="admin";
		data[0][1]="123456";
		
		data[1][0]="admin";
		data[1][1]="123";
		
		data[2][0]="admin12";
		data[2][1]="123321";
		
		return data;
	}
	
	

}
