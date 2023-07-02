package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderDemo {
	WebDriver driver;
	@Test(dataProvider="loginTest")

	public void loginTest(String username, String password) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[text()='End tour']")).click();
		
	}
	@Test(dataProvider="addUser")
	
	public void addUser(String surname, String firstname, String email, String user, String pw, String confirmPW, String percent) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("admin");
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("123456");
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
	@DataProvider(name="loginTest")
	public Object[][] loginTest() {
		Object[][] data=new Object[2][2]; //declaring array, array name=data
		data[0][0]="admin";
		data[0][1]="123456";
		
		data[1][0]="admin";
		data[1][1]="123";
		
		
		return data;
	}
	
	@DataProvider(name="addUser")
	public Object[][] addUser(){
		Object[][] userData=new Object[2][7];
		userData[0][0]="Mr";
		userData[0][1]="Sim";
		userData[0][2]="sim@gmail.com";
		userData[0][3]="sim123";
		userData[0][4]="sim123";
		userData[0][5]="sim123";
		userData[0][6]="21";
		
		userData[1][0]="Miss";
		userData[1][1]="Sima";
		userData[1][2]="sima@gmail.com";
		userData[1][3]="Sima123";
		userData[1][4]="Sima123";
		userData[1][5]="Sima123";
		userData[1][6]="3";
		
		return userData;
		
	}

}
