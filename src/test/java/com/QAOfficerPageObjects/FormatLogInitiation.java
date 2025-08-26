package com.QAOfficerPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class FormatLogInitiation extends BRMSCommonMethods
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
		@FindBy(how = How.XPATH, using = "//span[text()='Format Log Initiation']")
		WebElement formatlogInitiation;
		@FindBy(how = How.XPATH, using = "(//button[@TYPE='button'])[2]")
		WebElement upload;
		@FindBy(how = How.XPATH, using = "(//input[@TYPE='radio'])[1]")
		WebElement newradio;
		@FindBy(how = How.XPATH, using = "(//input[@TYPE='radio'])[2]")
		WebElement revise;
		@FindBy(how = How.XPATH, using = "(//button[@data-toggle='modal'])[2]")
		WebElement submit;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='processTypeId']")
		WebElement processtype;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='formatGroup']")
		WebElement formatgroup;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='formatTitle']")
		WebElement formattitle;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='formatNumber']")
		WebElement formatnumber;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='numberOfCopies']")
		WebElement noofcopies;
		@FindBy(how = How.XPATH, using = "//label[@for='executedBMRInput']")
		WebElement clicktoupload;
		@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn']")
		WebElement add;
		@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
		WebElement comments;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[2]")
		WebElement processtypealert;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[3]")
		WebElement formatgroupalert;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[4]")
		WebElement formattitlealert;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[5]")
		WebElement formatnumberalert;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[6]")
		WebElement noofcopiesalert;
		@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mt-2 ng-star-inserted']")
		WebElement fileuploadalert;
		@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mt-2 ng-star-inserted']")
		WebElement commentsalert;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
		WebElement no;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
		WebElement yes;
		@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
		WebElement password;
		@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
		WebElement submit2;
		@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted odd'])[1]")
		WebElement createdrecord;
		@FindBy(how = How.XPATH, using = "//button[@class='btn xsBtn minus othersedit']")
		WebElement removefile;
		@FindBy(how = How.XPATH, using = "//modal-container[@class='modal fade show']")
		WebElement screenclick;
		
        public FormatLogInitiation(WebDriver driver) {
			
			PageFactory.initElements(driver, this);	
		}
        
        public void formatlog() throws InterruptedException{
        	
        	javawait();
        	//clickElement(tab2);
       // 	clickElement(tab);
        	clickElement(formatlogInitiation);
        	clickElement(upload);
        	clickElement(newradio);
//        	textbox(processtype,type);
//        	clickElement(revise);
//        	clickElement(newradio);
//        	textbox(processtype,type);
        }
        
        public void validateAlerts() {
        	
        	softassert.assertEquals(processtypealert.getText(), "Process Type is required");
        	softassert.assertEquals(formatgroupalert.getText(), "Format Group is required");
        	softassert.assertEquals(formattitlealert.getText(), "Format Title is required");
        	softassert.assertEquals(formatnumberalert.getText(), "Format Number is required");
        	softassert.assertEquals(noofcopiesalert.getText(), "No.Of Copies is required");
        	softassert.assertEquals(fileuploadalert.getText(), "Please Upload Document");
        	softassert.assertEquals(commentsalert.getText(), "Comments is required");
        }
        
        public void processtype(String type) throws InterruptedException {
        	Thread.sleep(2000);
        	textbox(processtype,type);
        }
        
        public void formatgroup(String group) throws InterruptedException {
        	Thread.sleep(2000);
        	clickElement(formatgroup);
        	formatgroup.sendKeys(group);
        	
        }
        
        public void formattitle(String title) throws InterruptedException {
        	Thread.sleep(2000);
        	clickElement(formattitle);
        	formattitle.sendKeys(title);
        	
        }
        public void formatnumber(String number) throws InterruptedException {
        	Thread.sleep(2000);
        	clickElement(formatnumber);
        	formatnumber.sendKeys(number);
        	
        }
        public void noofcopies(String copies) throws InterruptedException {
        	Thread.sleep(2000);
        	clickElement(noofcopies);
        	noofcopies.sendKeys(copies);
        }
        
        public void comments(String comm) throws InterruptedException {  	
        	Thread.sleep(2000);
        	clickElement(comments);
        	comments.sendKeys(comm);
        }
        
        public void removefile() {
        	
        	clickElement(removefile);
        }
        public void add() {
        	
        	clickElement(add);
        }
        
        public void fileupload() throws AWTException, InterruptedException {
        	
        	Robot robot = new Robot();
    		clicktoupload.click();
    		Thread.sleep(5000);
    		 String filePath = "C:\\Users\\Vaishnavi.T\\Downloads\\FORMATS (4).pdf";
    		 // Press 'Ctrl' + 'V' to paste the file path;
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            // Press 'Enter' to confirm the file selection
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        
        public void isEnabled() {
        	
        	boolean type = processtype.isEnabled();
        	boolean group =formatgroup.isEnabled();
        	boolean title = formattitle.isEnabled();
        	boolean number = formatnumber.isEnabled();
        	boolean remove = removefile.isDisplayed();
        }
        public void submit() {
        	
        	clickElement(submit);
        }
        public void screenclick() {
        	
        	clickElement(screenclick);
        }
        
        public void createdrecord() {
        	
        	clickElement(createdrecord);
        }
        
        public void formatlogReInitiation() throws InterruptedException {
        	
        	javawait();
        //	clickElement(tab2);
        	clickElement(formatlogInitiation);
        	clickElement(createdrecord);
        }
        
        public void validateCommentsAlert() {
        	
        	softassert.assertEquals(commentsalert.getText(), "Comments is required");
        }
        
        public void submitactivity(String pass) throws InterruptedException {
        	Thread.sleep(3000);
        	clickElement(no);
        	javawait();
			clickElement(submit);
			javawait();
			clickElement(yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
			refresh();
        }
		
	}
