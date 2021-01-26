package com.sag.dataprovider;

import org.testng.annotations.Test;

public class TestDataProvider {
	
	
	@Test(dataProvider="excelData" , dataProviderClass=com.sag.data.ExcelFunc.class)
	public void testExceldata(String user, String password) {
		
		
		System.out.println(user);
		System.out.println(password);
	}

}
