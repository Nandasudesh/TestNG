package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(dataProvider="getData", dataProviderClass=ExcelData.class )

public class ExcelDataProvider {
	
	
	WebDriver driver;
	public void data(String eMail, String passWord, String fName, String lName, String companyName, String comment) {
		
		//System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement customers=driver.findElement(By.xpath("//ul[@data-widget='treeview']/li[4]/a/p"));
		customers.click();
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")).click();
		
		//add new
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys(eMail);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		pwd.sendKeys(passWord);
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys(fName);
		WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastName.sendKeys(lName);
		WebElement cName=driver.findElement(By.xpath("//input[@id='Company']"));
		cName.sendKeys(companyName);
		WebElement adminComment=driver.findElement(By.xpath("//input[@id='AdminComment']"));
		adminComment.sendKeys(comment);
		
		
		
		
		
		
		
	}

}
