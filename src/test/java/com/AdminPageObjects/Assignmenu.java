package com.AdminPageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BasicData.BRMSCommonMethods;

public class Assignmenu extends BRMSCommonMethods {

	@FindBy(xpath = "//button[text()='Login']")
	WebElement login;
	@FindBy(xpath = "//div[text()=' Please Enter UserId and Password ']")
	WebElement alert;
	@FindBy(xpath = "//input[@formcontrolname='loginId']")
	WebElement loginid;
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement password;
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	WebElement passwordview;
	@FindBy(xpath = "//li[@class='navLink']")
	WebElement menu;
	@FindBy(xpath = "//a[text()=' Assign Menu ']")
	WebElement assignmenu;
	@FindBy(xpath = "//button[@id='button-basic']")
	WebElement role;
	@FindBy(xpath = "//a[text()='MPR Initiator']")
	WebElement initiatorrole;
	@FindBy(xpath = "/html/body/app-root/div[1]/div/div/app-assign-menu/div/div/div[1]/nav/ol/li[1]/a")
	WebElement dashboardhyperlink;
	@FindBy(xpath = "//a[text()='MPR Initiator']")
	WebElement initiator;
	@FindBy(xpath = "//button[text()=' Update '] ")
	WebElement update;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement nochangesok;
	@FindBy(xpath = "//label[text()='Select All'] ")
	WebElement selectall;
	@FindBy(xpath = "(//input[@class='checkbox'])[2]")
	WebElement singleselect;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement updateok;
	@FindBy(xpath = "//p[text()='Termination']")
	WebElement termination;
	@FindBy(xpath = "//button[text()='Terminate Other Login']")
	WebElement terminateother;
	@FindBy(xpath = "//button[text()='Terminate This Login']")
	WebElement terminatethis;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement passwordd;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "(//div[text()='Unit-V ONCO'])[1]")
	WebElement onco;
	@FindBy(how = How.XPATH, using = "(//div[text()='Unit-V General'])[1]")
	WebElement general;
	

	public Assignmenu(WebDriver driver) {

		PageFactory.initElements(driver, this);	

	}

	public void userlogin(String id, String pass) throws InterruptedException {

		clickElement(login);
		implicitwait();
		Assert.assertEquals(alert.getText(), "Please Enter UserId and Password");
		implicitwait();
		textbox(loginid, id);
		javawait();
		textbox(password, pass);
		try {
		if (termination.isDisplayed()) {
			clickElement(terminateother);
			clickElement(onco);
		}else {
			clickElement(onco);
		}
		}catch (NoSuchElementException | StaleElementReferenceException e) {
		    // Fall back to checking if oncotext is displayed
			clickElement(onco);
		        System.out.println("Neither General nor Onco text is displayed.");
		        // Optionally: throw custom exception or log error
		    }
		}

	public void menu() {
		mouseover(menu);
	}

	public void update() {
		clickElement(update);
	}

	public void logout() throws InterruptedException {
		for (int i = 0; i <2; i++)
			{
				WebElement profile= driver.findElement(By.xpath("//a[@role='button']"));
				WebElement switchplant= driver.findElement(By.xpath("//a[@data-target='#changePlant']"));
				WebElement logout= driver.findElement(By.xpath("//a[@data-target='#logOutModal']"));
				WebElement yes= driver.findElement(By.xpath("(//a[text()='Yes'])[1]"));
				WebElement no= driver.findElement(By.xpath("(//button[text()=' No '])[1]"));
				javawait();
				clickElement(profile);
				Thread.sleep(500);
				clickElement(logout);
				if(i==0) {
				Thread.sleep(500);
				clickElement(no);
				}else {
				Thread.sleep(500);
				clickElement(yes);
				}
			}
	}
	public void assignMenuupdate() throws InterruptedException {

		javascript(assignmenu);
		javawait();
		javascript(role);
		javawait();
		clickElement(initiatorrole);
		javawait();
		clickElement(update);
		javawait();
		clickElement(nochangesok);
		javawait();
		scrolldown(singleselect);
		javawait();
		clickElement(singleselect);
		javawait();
		scrollup(update);
		javawait();
		javascript(update);

	}

	public void updateactivity(String pass) throws InterruptedException {

		javawait();
		clickElement(No);
		javawait();
		javascript(update);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(passwordd, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(updateok);
	}

}
