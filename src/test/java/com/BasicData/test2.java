package com.BasicData;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2
	{

		@Test
		public void test() throws IOException, InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
			Thread.sleep(3000);
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			for(WebElement link : links) {
				
				String url = link.getAttribute("href");
				verifylink(url);
			}
			
			Actions action = (Actions) driver;
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.CONTROL.SHIFT.DELETE).perform();
			
		}
		
		public static void verifylink(String url) throws IOException {
			URL link = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) link.openConnection();
			conn.setConnectTimeout(3000);
			conn.connect();
			
			if(conn.getResponseCode()==200)
				System.out.println(link+ "not a broken");
			else
				System.out.println(link+ "broken");
		}
	}
