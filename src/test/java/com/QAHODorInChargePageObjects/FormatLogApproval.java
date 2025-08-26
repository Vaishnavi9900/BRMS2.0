package com.QAHODorInChargePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class FormatLogApproval extends BRMSCommonMethods
	{

		SoftAssert softassert = new SoftAssert();
		static ExcelUtils excelUtils = new ExcelUtils();

		// using the Constants class values for excel file path
		static String excelFilePath = file;

		@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
		WebElement bpr;
		@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
		WebElement tab;
		@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
		WebElement tab2;
		@FindBy(how = How.XPATH, using = "//span[text()='Format Log Approval']")
		WebElement formatlogApproval;
		@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted odd'])[1]")
		WebElement createdrecord;
		@FindBy(how = How.XPATH, using = "(//a[@id='Comments-tab'])[1]")
		WebElement commentstab;
		@FindBy(how = How.XPATH, using = "(//textarea[@placeholder='Add your comments here..'])[1]")
		WebElement comments;
		@FindBy(how = How.XPATH, using = "(//button[@data-toggle='modal'])[1]")
		WebElement returnbutton;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
		WebElement no;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
		WebElement yes;
		@FindBy(how = How.XPATH, using = "(//button[@data-toggle='modal'])[2]")
		WebElement submit;
		@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
		WebElement password;
		@FindBy(how = How.XPATH, using = "//button[@type='submit']")
		WebElement submit2;
		
		public FormatLogApproval(WebDriver driver) {
			
			PageFactory.initElements(driver, this);	
		}
		
		public void formatlogApproval() throws InterruptedException {
			
			javawait();
		//	clickElement(tab);
			//clickElement(tab2);
        	clickElement(formatlogApproval);
        	clickElement(createdrecord);
		}
		
		public void comments(String comm) throws InterruptedException {  	
        	Thread.sleep(2000);
        	textbox(comments, comm);
        }
		
		 
        public void submit() {
        	
        	clickElement(submit);
        }
        
        
        public void returnrbutton() {
        	
        	clickElement(returnbutton);
        }
        public void submitactivity(String pass) throws InterruptedException {
        	clickElement(no);
			clickElement(submit);
			clickElement(yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
			refresh();
        }
        public void returnactivity(String pass) throws InterruptedException {
        	clickElement(no);
			clickElement(returnbutton);
			clickElement(yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
			refresh();
        }
	}
