package com.AdminPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BasicData.BRMSCommonMethods;

public class Usercontrol extends BRMSCommonMethods {
	
	@FindBy(xpath = "//a[text()=' User Control ']") WebElement usercontrol;
	
}
