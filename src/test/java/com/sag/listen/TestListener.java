package com.sag.listen;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import com.sag.utility.BrowserInit;
import com.sag.utility.Screenshot;

public class TestListener implements ITestListener{

	
	public Screenshot shot;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test starting "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String tc_name =result.getName();
		System.out.println("On test Sucess "+ result.getName());
		
			try {
				Screenshot.CaptureScreenshot(BrowserInit.getDriver(), tc_name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
