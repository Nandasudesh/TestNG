package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility{
	
	public static String getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
 		File src=ts.getScreenshotAs(OutputType.FILE);
 		String path=System.getProperty("user.dir")+"/Screenshot/"+
 		System.currentTimeMillis()+".png";
 		File des=new File(path);
 		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Capture failed"+e);
			//e.printStackTrace();
		}
		return path;
		
	}
	

}
