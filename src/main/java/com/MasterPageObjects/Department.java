package com.MasterPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BasicData.BRMSCommonMethods;

public class Department extends BRMSCommonMethods {
	
	public String namealert = "Department Name is required";
	public String codealert = "Department Code is required";
	
	@FindBy(how = How.XPATH, using = "//a[text()=' Department ']") WebElement department;
	@FindBy(how = How.XPATH, using = "//button[text()=' Create']") WebElement create;
	@FindBy(how = How.XPATH, using = "//button[@class='close']") WebElement close;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']") WebElement submit;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]") WebElement departmentname;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]") WebElement departmentcode;
	@FindBy(how = How.XPATH, using = "//div[text()=' Department Name is required ']") WebElement deptnamealert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Department Code is required ']") WebElement deptcodealert;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//button[text()='OK']") WebElement alreadyexistok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(xpath = "//li[@class='navLink']")
	WebElement menu;
	@FindBy(how =How.XPATH, using ="//a[text()='Masters ']")
	WebElement masters;
	
	public Department(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void departmentcreatewithspace() throws InterruptedException {
		
	   mouseover(menu);
   	   javawait();
   	   mouseover(masters);
		clickElement(department);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(deptnamealert, namealert);
		Assert.assertEquals(deptcodealert, codealert);
		textbox(departmentname, " ");
		javawait();
		textbox(departmentcode, " ");
		javawait();
		clickElement(submit);
		javawait();
		if(deptnamealert.isDisplayed() && deptcodealert.isDisplayed()) {
			System.out.println("Validations are working fine with space");
			javawait();
			clickElement(close);
		}else throw new RuntimeException("Validations are not working with space");
		clickElement(No);
		javawait();
		clickElement(close);
		}
	
	public void departmentcreate(String name, String code) throws InterruptedException {
		clickElement(department);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(deptnamealert, namealert);
		Assert.assertEquals(deptcodealert, codealert);
		textbox(departmentname, name);
		javawait();
		textbox(departmentcode, code);
		javawait();
		clickElement(submit);
	}
	
	public void existeddeptcreation(String name, String code) throws InterruptedException {
		clickElement(department);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(deptnamealert, namealert);
		Assert.assertEquals(deptcodealert, codealert);
		textbox(departmentname, name);
		javawait();
		textbox(departmentcode, code);
		javawait();
		clickElement(submit);
		javawait();
		 if(alreadyexistok.isDisplayed()) {
    		 System.out.println("this record is already existed");
    		 clickElement(alreadyexistok);
    		 javawait();
    		 clickElement(close);
    	  }else throw new RuntimeException("already existed condition has been failed");
	}
	  public void submitactivity() throws InterruptedException {
			
			clickElement(No);
			javawait();
			clickElement(submit);
			javawait();
			clickElement(Yes);
			javawait();
			clickElement(ok);
		}
	    public void submitactivity2() throws InterruptedException {

		clickElement(Yes);
		javawait();
		clickElement(ok);
	     }

}
