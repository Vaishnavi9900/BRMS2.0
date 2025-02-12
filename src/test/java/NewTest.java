
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.text.DateFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.shared.utils.Os;
import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import freemarker.template.SimpleDate;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

@Test
public class NewTest {
  
	public static WebDriver driver;
	public static Logger logger;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
    public static String reportpath;
    public static String subfoldername;
//	
//	@Parameters("browser")
//	@BeforeTest
//	public void setup(ITestContext context, @Optional("chrome") String browser) {
//		
//		logger = LogManager.getLogger(this.getClass());
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}else if(browser.equalsIgnoreCase("edge")) {
//			
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}else {
//			
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		
//		driver.manage().window().maximize();
//		driver.get("");
//
//		Capabilities capabilities =((RemoteWebDriver) driver).getCapabilities();
//		String device = capabilities.getBrowserName();
//		String author = context.getCurrentXmlTest().getParameter("author");
//	    test = reports.createTest(context.getName());
//	    test.assignDevice(device);
//	    test.assignAuthor(author);
//	}
//	@BeforeSuite
//	public void initializereports() {
//		String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
//		reportpath = "TestReports" + "/AllTestsreport_" +timestamp+ ".html";
//		spark = new ExtentSparkReporter(reportpath);
//		reports.attachReporter(spark);
//		reports.setSystemInfo("OS", System.getProperty(Os.OS_NAME));
//		reports.setSystemInfo("Java Version", System.getProperty("java.version"));
//		spark.config().setTheme(Theme.DARK);
//	}
//	
//	@AfterSuite
//	public void generatereports() throws IOException {
//		
//		reports.flush();
//		Desktop.getDesktop().browse(new File(reportpath).toURI());
//	}
//	
//	@AfterMethod
//	public void checkStatus(Method m, ITestResult result) throws IOException {
//		
//		if(result.getStatus()==ITestResult.FAILURE) {
//			
//			String screenshoTpath = null;
//			
//			screenshoTpath = capturescreenshot(result.getTestContext().getName()+ "" +result.getMethod().getMethodName());
//			test.addScreenCaptureFromPath(screenshoTpath);
//			test.fail(result.getThrowable());
//		}else if(result.getStatus()==ITestResult.SUCCESS) {
//			
//			test.pass(m.name() +" is passed");
//			
//		}
//		
//	}
//	
//	
//	public String capturescreenshot(String filename) throws IOException {
//		
//		if(subfoldername==null) {
//			
//			LocalDateTime local = LocalDateTime.now();
//			
//			DateTimeFormatter mydate = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
//			
//			subfoldername= local.format(mydate);
//		}
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		File destfile = new File(System.getProperty("user.dir")  +"/FailedScreenshots" +subfoldername+ " " +filename+ ".jpg" );
//		
//		FileUtils.copyFile(sourcefile, destfile);
//		
//		return System.getProperty("user.dir")  +"/FailedScreenshots" +subfoldername+ " " +filename+ ".jpg";
//	}
//	public void test1() throws AWTException {
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	}
//	
    @Test
    public void test() {
    	  
 		  for(int i=0;i<=5;i++) {
 		  float number = (float) Math.random();
 		  System.out.println(number);
 		  }
 	}
	
}
