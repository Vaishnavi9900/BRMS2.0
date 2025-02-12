package com.BasicData;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
		
		 // This is where you can set your report name dynamically
        String reportName = "MyCustomReport_" + System.currentTimeMillis();
        // Logic to generate report with the custom name
        System.out.println("Report Name: " + reportName);
	  }
	
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
	  }
	
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }
	
	public void onStart(ITestContext context) {
	    // not implemented
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
	  }
}
