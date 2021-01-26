package com.sag.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.sag.utility.BrowserInit;
import com.sag.utility.Screenshot;

public class BaseClass extends BrowserInit {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void installation() throws IOException {
		 driver=initialize_driver();
		 
		
		System.out.println("Builds installed sucessfully.....!");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
		System.out.println("Shutdown  sucessfully.....!");
	}

}
