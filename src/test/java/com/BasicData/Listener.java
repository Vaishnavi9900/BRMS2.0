//package com.BasicData;
//
//import java.awt.Desktop;
//import java.io.File;
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
////public class Listener{
//	
//	public class Listener extends BRMSCommonMethods implements ITestListener{
//	public static String screenshotpath;
//	
// 	public Listener() {
//         extentreports = new ExtentReports();
//     }
// 	
// 	@Override
// 	public void onTestStart(ITestResult result) {
// 	    extenttest = extentreports.createTest(result.getName());
//
// 	    if (driver != null) {
// 	        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
// 	        String device = capabilities.getBrowserName();
// 	        extenttest.assignDevice(device);
// 	    }
//
// 	    String author = result.getTestContext().getCurrentXmlTest().getParameter("author");
// 	    extenttest.assignAuthor(author);
// 	}
//
// 	@Override
// 	public void onTestSuccess(ITestResult result) {
// 	    extenttest.log(Status.PASS, result.getName() + " is passed");
// 	}
//
// 	@Override
// 	public void onTestFailure(ITestResult result) {
// 	    //extenttest.log(Status.FAIL, result.getName() + " is failed");
// 	    String screenshotpath = CaptureScreenshot(result.getTestContext().getName() + "_" + result.getMethod().getMethodName());
// 	    extenttest.addScreenCaptureFromPath(screenshotpath);
// 	    extenttest.fail(result.getThrowable());
// 	}
//
// 	@Override
// 	public void onTestSkipped(ITestResult result) {
// 	    extenttest.log(Status.SKIP, result.getName() + " is skipped");
// 	}
// 	//@Override
//    public void onStart(ITestContext context) {
//    	String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
//		reportPath = "TestReports" + "/AllTestsextentReport_" + timestamp + ".html";
//		sparkReporter_all = new ExtentSparkReporter(reportPath);
//		//ExtentSparkReporter failurereport = new ExtentSparkReporter("Failuretests.html");
//		extentreports = new ExtentReports();
//		extentreports.attachReporter(sparkReporter_all);
//		extentreports.setSystemInfo("OS", System.getProperty("os.name"));
//		extentreports.setSystemInfo("Java Version", System.getProperty("java.version"));
//		sparkReporter_all.config().setTheme(Theme.DARK);
//		// Set the report name (appears on the header section of the HTML report)
//		// This sets the report name visible in the report
//		sparkReporter_all.config().setReportName("BRMS2.0 Formulations Report");
//    }
// 	@Override
// 	public void onFinish(ITestContext context) {
// 	    // not implemented
// 		
// 		extentreports.flush();
// 		try {
// 			Desktop.getDesktop().browse(new File(reportPath).toURI());
// 		} catch (IOException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		
// 	  }
//}
