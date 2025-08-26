package com.AdminPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasicData.BRMSCommonMethods;

public class SMTPandpassword extends BRMSCommonMethods {
	
	
	@FindBy(xpath = "//a[text()=' SMTP & Password ']") WebElement smtp;
	@FindBy(xpath = "select[id='SmtpSettingPlantList']") WebElement plant;
	@FindBy(xpath = "//button[text()=' Update']") WebElement update;
	@FindBy(xpath = "//button[text()='OK']") WebElement nochangesok;
	@FindBy(xpath = "//input[@formcontrolname=\"defaultPassword\"='defaultPassword']") WebElement defaultpass;
	@FindBy(xpath = "(//input[@type='radio'])[2]") WebElement random;
	@FindBy(xpath = "//input[@formcontrolname='sMTPServer']") WebElement smtpserver;
	@FindBy(xpath = "//input[@formcontrolname='sMTPPort']") WebElement smtpport;
	@FindBy(xpath = "//input[@formcontrolname='fromMailId']") WebElement mailid;
	@FindBy(xpath = "//input[@formcontrolname='sMTPUserName']") WebElement smtpusername;
	@FindBy(xpath = "//input[@formcontrolname='sMTPUserPassword']") WebElement smtppassword;
	@FindBy(xpath = "//input[@type='checkbox']") WebElement sslenable;
	
	
	public SMTPandpassword(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	public void defaultsettings(String plantse, String pass) throws InterruptedException {	
		clickElement(smtp);
		javawait();
		textbox(plant, plantse);
		javawait();
		clickElement(update);
		javawait();
		clickElement(nochangesok);
		javawait();
		textboxc(defaultpass, pass);
		javawait();
		clickElement(update);
	}
	
	public void randomsettings(String plantse,String server, String port, String mail, String name, String pass) throws InterruptedException {	
		clickElement(smtp);
		javawait();
		textbox(plant, plantse);
		javawait();
		clickElement(update);
		javawait();
		clickElement(nochangesok);
		javawait();
		radiobutton(random);
		javawait();
		textboxc(smtpserver, server);
		javawait();
		textboxc(smtpport, port);
		javawait();
		textboxc(mailid, mail);
		javawait();
		textboxc(smtpusername, name);
		javawait();
		textboxc(smtppassword, pass);
		javawait();
		clickElement(update);
	}
	

}
