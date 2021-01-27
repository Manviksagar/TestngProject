package com.sag.listen;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import com.sag.utility.BrowserInit;
import com.sag.utility.Screenshot;

import io.qameta.allure.Attachment;

public class TestListener implements ITestListener{

	
	public Screenshot shot;
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test starting "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		/*String tc_name =result.getName();
		System.out.println("On test Sucess "+ result.getName());
		
			try {
				Screenshot.CaptureScreenshot(BrowserInit.getDriver(), tc_name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
	
		
	}

	public void onTestFailure(ITestResult result) {
		String tc_name =result.getName();
		System.out.println("On test failure "+ result.getName());
		System.out.println(BrowserInit.getDriver());
		
			try {
				Screenshot.CaptureScreenshot(BrowserInit.getDriver(), tc_name);
				
				//allure report attachment methods are mentioned above
				saveFailureScreenShot(BrowserInit.getDriver());
				saveTextLog(tc_name + " failed and screenshot taken!");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
