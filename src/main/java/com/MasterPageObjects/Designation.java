package com.MasterPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BasicData.BRMSCommonMethods;

public class Designation extends BRMSCommonMethods {

	public String namealert = "Designation Name is required";
	
	@FindBy(how = How.XPATH, using = "//a[text()=' Designation ']") WebElement designation;
	@FindBy(how = How.XPATH, using = "//button[text()=' Create']") WebElement create;
	@FindBy(how = How.XPATH, using = "//button[@class='close']") WebElement close;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']") WebElement submit;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]") WebElement designationname;
	@FindBy(how = How.XPATH, using = "//div[text()=' Designation Name is required ']") WebElement designamealert;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//button[text()='OK']") WebElement alreadyexistok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	
	public Designation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void designationcreatewithspace() throws InterruptedException {
		clickElement(designation);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(designamealert, namealert);
		textbox(designationname, " ");
		javawait();
		clickElement(submit);
		javawait();
		if(designamealert.isDisplayed()) {
			System.out.println("Validations are working fine with space");
			javawait();
			clickElement(close);
		}else throw new RuntimeException("Validations are not working with space");
		clickElement(No);
		javawait();
		clickElement(close);
		}
	
	public void designationcreate(String name) throws InterruptedException {
		clickElement(designation);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(designamealert, namealert);
		javawait();
		textbox(designationname, name);
		javawait();
		clickElement(submit);
	}
	public void existeddesignationcreate(String name) throws InterruptedException {
		clickElement(designation);
		javawait();
		clickElement(create);
		javawait();
		clickElement(submit);
		javawait();
		Assert.assertEquals(designamealert, namealert);
		textbox(designationname, name);
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
		clickElement(submit);
		clickElement(Yes);
		clickElement(ok);
	}
    public void submitactivity2() throws InterruptedException {

	clickElement(Yes);
	clickElement(ok);
     }
	
	}

	

