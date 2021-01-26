package com.sag.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public static void CaptureScreenshot(WebDriver driver, String tc_name) throws IOException {
		
		//getting driver from BrosweInt class works like factory
		
	
		File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrShot, new File("C:\\Users\\Va185060\\eclipse-workspace\\CompleteTest\\src\\test\\resources\\screenshots\\" +tc_name +".png"));
		
		
	}

}
