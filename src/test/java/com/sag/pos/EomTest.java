package com.sag.pos;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EomTest {
	
	@BeforeTest
	public void installation() {
		
		System.out.println("Builds installed sucessfully.....!");
	}
	
	
	@Test
	public void eom() {
		
		System.out.println("Eom testing started");
	}

}
