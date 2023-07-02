package testNG;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {
	ExtentReports extent=new ExtentReports();
	//dependencies added, jars added, new extent report object created
	WebDriver driver;
	
	public void setup() {
		ExtentSparkReporter reporter=new  ExtentSparkReporter("extent_report.xml");
		
		extent.attachReporter(reporter);//name of report
		//attach reporter function-- attach test 
		
		
	}

}
