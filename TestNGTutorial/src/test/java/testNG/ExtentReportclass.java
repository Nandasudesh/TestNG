package testNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class ExtentReportclass {
	    ExtentReports extent = new ExtentReports();
	    WebDriver driver;
	    @BeforeSuite
	    public void setup()
	    {
	        
	        ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");//type of report required, name of report
	            reporter.config().setReportName("Extent Report"); // name of report in html
	            
	            extent.attachReporter(reporter);//
//	            String path=System.getProperty("webdriver.chrome.driver",path+)
	            extent.setSystemInfo("company Name", "IGBEG pvt.ltd");     
	            extent.setSystemInfo("Author", " Nanda");
	            extent.setSystemInfo("Date", "02-02-2002");
	            
	            WebDriverManager.chromedriver().setup();
	            driver=new ChromeDriver();
	            
	        }
	     @Test
	     public void testtt() throws IOException
	     {
	    	 ExtentTest test=extent.createTest("screenshot","login details");//name of test and description
	         test.info("screenshot Test");
	         driver.get("https://qalegend.com/mobile_service/panel/login");
	         
	 		
	 		
	         driver.findElement(By.name("identity")).sendKeys("admin@admin.com");
	         driver.findElement(By.name("password")).sendKeys("passd");
	         driver.findElement(By.name("submit")).click();
	         
	         String actTitle=driver.getTitle();
	         String expTitle="Home";
	         
	      // for block selection : select and control+/
	       // Assert.assertEquals(actTitle, expTitle);
	        //test.pass("Test passed");
	        
	        if(actTitle.contentEquals(expTitle)) {
	        	test.log(Status.PASS, "test is pass");
	        }
	        else {
	        	String temp=ScreenShotUtility.getScreenshot(driver);
	        	test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		        test.addScreenCaptureFromPath(temp);
		        
	        	
	        }
	        extent.flush();
	        
	        
	         
	         //int a = 2;
	         //System.out.println(a/0);
	         
          /*   test.log(Status.INFO, "chrome launched");
//	         
	         test.info("Trying to open google");
	         driver.get("https://www.google.com/");
	         String title=driver.getTitle();
	         
	         if(title.contentEquals("Google")) {
	        	 test.pass("Test passed");
	         }
	         else {
	        	 test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		         test.addScreenCaptureFromPath("screenshot.png");
	         }*/
	         
	         
	        // extent.flush();//writing the test report
	     }
	    }


