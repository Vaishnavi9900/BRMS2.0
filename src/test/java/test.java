import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test{
	
	
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(test.class.getName());
	
	@Test(dataProvider = "jsonData")
	public static void test(Map<String, String> data) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.16.5.90:7799/");
		
		WebElement userid = driver.findElement(By.xpath("//input[@formcontrolname='loginId']"));
		WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		
		
		userid.click();
		userid.sendKeys(data.get("userid"));
		password.click();
		password.sendKeys(data.get("password"));
		login.click();
		Thread.sleep(3000);
		

		
		try {
			WebElement termination = driver.findElement(By.xpath("//p[text()='Termination']"));
		if(termination.isDisplayed()) {
			System.out.println("successfully login to the application");
			driver.quit();
		}
		}catch(Exception e) {
			
			logger.info("test has been failed");
		}
		
	
		}
	
//	@DataProvider(indices = {0,2})
//	public Object[][] testdata(){
//		
//		
//		return new Object[][] {
//		
//				{"100246", "12"},
//				{"100004", "123"},
//				{"100003", "12"}
//		};
//		
//	}
	
	 @DataProvider(name = "jsonData")
	    public Iterator<Object[]> getJsonData() throws IOException {
	        List<Map<String, String>> testData = JsonUtils1.getTestData("testdata.json");
	        return testData.stream().map(data -> new Object[]{data}).iterator();
	    }
		
	    

}
