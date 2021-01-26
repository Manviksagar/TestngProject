package com.sag.pos;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sag.base.BaseClass;
import com.sag.utility.Screenshot;

public class EomTest extends BaseClass {
	

	//WebDriver driver;
	Screenshot shot = new Screenshot();;
	@Parameters("browser")
	@Test
	public void eom(String browser) throws IOException {
		driver.get("https://www.google.com/");
		
		//shot.CaptureScreenshot(driver);
		
		System.out.println("Eom testing started" + browser);
		
		System.out.println(System .getProperty("user.dir"));
		//driver.quit();
	}

}
