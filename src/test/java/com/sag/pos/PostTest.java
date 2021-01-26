package com.sag.pos;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sag.utility.BrowserInit;

public class PostTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = BrowserInit.getDriver();
	}

	@Test
	public void sale() {

		System.out.println(driver);

		driver.get("https://www.facebook.com/");

		System.out.println("Sale testing started");
	}

	@Test
	public void returnpos() {

		driver.get("https://www.facebook.com/");

		Assert.assertTrue(false);
	}

}
