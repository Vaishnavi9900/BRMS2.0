package com.InitiatorTestRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.ExcelUtils;
import com.InitiatorPageObjects.BMRProductDetails;

public class BMRProductDetailsInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductDetails bmr;
	
	@Test
	public void pelletsinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.pelletsproductdetailsalertsvalidate();
	    bmr.pelletsinitiation();
	    bmr.submitactivity();	
	}
	
	@Test
	public void blendinitiationwithoutpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendproductdetailsalertsvalidate();
		bmr.blendinitiationwithoutpellets();
		bmr.submitactivity();
	}
	@Test
	public void blendinitiationwithpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendproductdetailsalertsvalidate();
		bmr.blendinitiationwithpellets();
		bmr.submitactivity();
	}
	@Test
	public void bulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkproductdetailsalertsvalidate();
		bmr.bulkproductinitiation();
		bmr.submitactivity();
	}
	@Test
	public void bulkbilayerinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkproductdetailsalertsvalidate();
		bmr.bulkbilayerproductinitiation();
		bmr.submitactivity2();
	}
	@Test
	public void pelletsReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.pelletsReinitiation();
		bmr.submitactivity2();
	}
	@Test
	public void blendReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendReinitiation();
		bmr.submitactivity2();
	}
	@Test
	public void bulkReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkReinitiation();
		bmr.submitactivity2();
	}

}
