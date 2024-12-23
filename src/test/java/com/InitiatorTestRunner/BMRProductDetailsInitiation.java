package com.InitiatorTestRunner;

import org.testng.annotations.Test;

import java.io.IOException;


import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
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
	    bmr.submitactivity2(getpassword());	
	}
	
	@Test
	public void blendinitiationwithoutpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendproductdetailsalertsvalidate();
		bmr.blendinitiationwithoutpellets();
		bmr.submitactivity2(getpassword());
	}
	@Test
	public void blendinitiationwithpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendproductdetailsalertsvalidate();
		bmr.blendinitiationwithpellets();
		bmr.submitactivity2(getpassword());
	}
	@Test
	public void standardbulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkproductdetailsalertsvalidate();
		bmr.bulkproductinitiation();
		bmr.submitactivity2(getpassword());
	}
	@Test
	public void commonbulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkproductdetailsalertsvalidate();
		bmr.bulkproductinitiationcommon();
		bmr.submitactivity2(getpassword());
	}
	@Test
	public void bulkbilayerinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkproductdetailsalertsvalidate();
		bmr.bulkbilayerproductinitiation();
		bmr.submitactivity2(getpassword());
	}
	@Test
	public void pelletsReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.pelletsReinitiation();
		bmr.resubmitactivity2(getpassword());
	}
	@Test
	public void blendReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.blendReinitiation();
		bmr.resubmitactivity2(getpassword());
	}
	@Test
	public void bulkReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bmr.bulkReinitiation();
		bmr.resubmitactivity2(getpassword());
	}

}
