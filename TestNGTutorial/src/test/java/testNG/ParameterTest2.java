package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest2 {
	@Test
	@Parameters({"url","username","passwd","surname","firstname","email","user","pw","confirmPW","percent"})
	public void addUser(String url, String username, String password, String surname, String firstname, String email, String user, String pw, String confirmPW, String percent) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
	userName.sendKeys(username);
	WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
	passWord.sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[text()='End tour']")).click();
	
	driver.findElement(By.xpath("//span[text()='User Management']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='title'])[2]")).click();
	
	
	driver.findElement(By.xpath("//*[@class='btn btn-block btn-primary']")).click();
	WebElement surName=driver.findElement(By.xpath("//*[@name='surname']"));
	surName.sendKeys(surname);
	WebElement firstName=driver.findElement(By.xpath("//*[@name='first_name']"));
	firstName.sendKeys(firstname);
	WebElement eMail=driver.findElement(By.xpath("//*[@name='email']"));
	eMail.sendKeys(email);
	WebElement useR=driver.findElement(By.xpath("//*[@name='username']"));
	useR.sendKeys(user);
	WebElement pass=driver.findElement(By.xpath("//*[@name='password']"));
	pass.sendKeys(pw);
	WebElement confirmPass=driver.findElement(By.xpath("//*[@name='confirm_password']"));
	confirmPass.sendKeys(confirmPW);
	WebElement per=driver.findElement(By.xpath("//*[@name='cmmsn_percent']"));
	per.sendKeys(percent);
	driver.findElement(By.xpath("//*[@id='select2-role-container']")).click();
	driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]")).sendKeys("Technician");
	driver.findElement(By.xpath("//li[text()='Technician']")).click();
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();


}
}