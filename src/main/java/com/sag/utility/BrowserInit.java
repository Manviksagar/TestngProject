package com.sag.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserInit {
	
	/*WebDriver driver;
	
	public WebDriver getdriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Va185060\\OneDrive - NCR Corporation\\Desktop\\sag\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		return  driver;
	}*/
	
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initialize_driver() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Va185060\\OneDrive - NCR Corporation\\Desktop\\sag\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

}
