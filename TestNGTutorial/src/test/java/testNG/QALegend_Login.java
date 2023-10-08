package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QALegend_Login {
	
	@Test
	@Parameters({"userName", "passWord"})

	public void logoTest(String userName, String passWord) {
		System.setProperty("webDriver.edge.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys(userName);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		

}
}
