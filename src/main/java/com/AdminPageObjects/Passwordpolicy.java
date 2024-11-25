package com.AdminPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;

public class Passwordpolicy extends BRMSCommonMethods {

	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//a[text()=' Password Policy ']")
	WebElement passwordpolicy;
	@FindBy(xpath = "//select[@id='PasswordPolicyPlantList']")
	WebElement plant;
	@FindBy(xpath = "//button[text()=' Update']")
	WebElement update;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement nochangesok;
	@FindBy(xpath = "//input[@formcontrolname='expiryDays']")
	WebElement passwordexpiry;
	@FindBy(xpath = "//input[@formcontrolname='maxInvalidCount']")
	WebElement invalidattempts;
	@FindBy(xpath = "//input[@formcontrolname='expiryAlertDays']")
	WebElement expalertdays;
	@FindBy(xpath = "//input[@formcontrolname='length']")
	WebElement minlength;
	@FindBy(xpath = "//input[@formcontrolname='historyCount']")
	WebElement enforcepasshistory;
	@FindBy(xpath = "//input[@formcontrolname='uppercaseCount']")
	WebElement minuppercase;
	@FindBy(xpath = "//input[@formcontrolname='lowerCaseCount']")
	WebElement minlowercase;
	@FindBy(xpath = "//input[@formcontrolname='numericCount']")
	WebElement mindigits;
	@FindBy(xpath = "//input[@formcontrolname='specialCharactersCount']")
	WebElement minspecial;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement updateok;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;

	public Passwordpolicy(WebDriver driver) {

		driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void passwordpolicyinvalid(String invalid) throws InterruptedException {

		javascript(passwordpolicy);
		javawait();
		clickElement(plant);
		javawait();
		scrolldown(update);
		clickElement(update);
		javawait();
		if (nochangesok.isDisplayed()) {
			System.out.println("test is passed with validation");
			clickElement(nochangesok);
		} else {
			System.out.println("no changes done validation is not displaying");
		}
		javawait();
		clickElement(nochangesok);
		javawait();
		textbox(invalidattempts, invalid);
		clickElement(update);
	}

	public void passwordpolicyexpiryalert(String alert) throws InterruptedException {

		javascript(passwordpolicy);
		javawait();
		clickElement(plant);
		javawait();
		scrolldown(update);
		clickElement(update);
		javawait();
		if (nochangesok.isDisplayed()) {
			System.out.println("test is passed with validation");
			clickElement(nochangesok);
		} else {
			System.out.println("no changes done validation is not displaying");
		}
		javawait();
		clickElement(nochangesok);
		javawait();
		textbox(expalertdays, alert);
		clickElement(update);
	}

	public void passwordpolicyminlength(String length) throws InterruptedException {

		javascript(passwordpolicy);
		javawait();
		clickElement(plant);
		javawait();
		scrolldown(update);
		clickElement(update);
		javawait();
		if (nochangesok.isDisplayed()) {
			System.out.println("test is passed with validation");
			clickElement(nochangesok);
		} else {
			System.out.println("no changes done validation is not displaying");
		}
		javawait();
		clickElement(nochangesok);
		javawait();
		textbox(minlength, length);
		clickElement(update);
	}

	public void passwordexpiry(String exp) throws InterruptedException {

		javascript(passwordpolicy);
		implicitwait();
		textbox(plant, "Audree");
		javawait();
		scrolldown(update);
		javascript(update);
		javawait();
		javascript(passwordexpiry);
		passwordexpiry.clear();
		passwordexpiry.sendKeys(exp);
	}

	public void invalidattempts(String invalid) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(invalidattempts, invalid);

	}

	public void expalert(String alert) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(expalertdays, alert);
	}

	public void minlength(String length) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(minlength, length);
	}

	public void enforcepasshistory(String enforce) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textbox(enforcepasshistory, enforce);
	}

	public void minuupercase(String minup) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(minuppercase, minup);
	}

	public void minlowercase(String minlow) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(minlowercase, minlow);
	}

	public void mindigits(String digits) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(mindigits, digits);
	}

	public void minspecial(String special) {

		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textboxc(minspecial, special);

	}

	public void update() {
		clickElement(update);
	}

	public void passwordpolicyenforce(String enforce) throws InterruptedException {

		javascript(passwordpolicy);
		javawait();
		clickElement(plant);
		javawait();
		scrolldown(update);
		clickElement(update);
		javawait();
		if (nochangesok.isDisplayed()) {
			System.out.println("test is passed with validation");
			clickElement(nochangesok);
		} else {
			System.out.println("no changes done validation is not displaying");
		}
		javawait();
		clickElement(nochangesok);
		javawait();
		textbox(enforcepasshistory, enforce);
		clickElement(update);
	}

	public void passwordpolicycharacters(String minup, String minlow, String digits, String special)
			throws InterruptedException {

		javascript(passwordpolicy);
		javawait();
		clickElement(plant);
		javawait();
		scrolldown(update);
		clickElement(update);
		javawait();
		if (nochangesok.isDisplayed()) {
			System.out.println("test is passed with validation");
			clickElement(nochangesok);
		} else {
			System.out.println("no changes done validation is not displaying");
		}
		javawait();
		clickElement(nochangesok);
		javawait();
		textbox(minuppercase, minup);
		javawait();
		textbox(minlowercase, minlow);
		javawait();
		textbox(mindigits, digits);
		javawait();
		textbox(minspecial, special);
		javawait();
		clickElement(update);
	}

	public void updateactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		javascript(update);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		clickElement(updateok);
	}

	public void updateactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		clickElement(updateok);
	}

}
