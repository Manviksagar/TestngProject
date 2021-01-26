package com.sag.pos;

import org.testng.annotations.Test;

import com.sag.base.BaseClass;

public class PostTest extends BaseClass {
	
	
	@Test
	public void sale() {
		driver.get("https://www.google.com/");
		
		System.out.println("Sale testing started");
	}

}
