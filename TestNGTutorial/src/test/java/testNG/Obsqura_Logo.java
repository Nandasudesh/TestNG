package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Obsqura_Logo {
	
	@Test
	public void logoTest() {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement logo=driver.findElement(By.xpath("//div[@class='top-logo']//descendant::a/img"));
		if(logo.isDisplayed()) {
			System.out.println("Logo present");
		}
		else {
			System.out.println("Logo not present");
		}
		driver.close();
	}

}
