package com.AdminPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasicData.BRMSCommonMethods;

public class Usercontrol extends BRMSCommonMethods {
	
	public Usercontrol(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()=' User Control ']") WebElement usercontrol;
	
}
