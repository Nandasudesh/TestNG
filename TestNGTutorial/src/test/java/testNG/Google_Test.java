package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Google_Test {
	
	@Test
	public void googleTest() {
		
		System.setProperty("webDriver.edge.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
