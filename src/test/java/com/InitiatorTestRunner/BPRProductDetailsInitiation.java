package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BPRProductDetails;

public class BPRProductDetailsInitiation extends ConfigurationReader{

	public Assignmenu as;
	
	public BPRProductDetails bpr;
	
	@Test
	public void bottleproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bpr.validatealerts1();
		bpr.bottlepackinginitiation();
		bpr.submit();
		bpr.submitactivity(getpassword());
	}
	@Test
    public void blisterproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bpr.validatealerts();
		bpr.blisterpackinginitiation();
		bpr.submit();
		bpr.submitactivity(getpassword());
	}
	@Test
	public void bottleproductReInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			bpr = new BPRProductDetails(driver);
			
			as.userlogin(getinitiator(), getpassword());
			bpr.bottlepackingReinitiation();
			//bpr.comments(getinitiatorcomments());
			bpr.resubmitactivity(getpassword());
		}
	public void blisterproductReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bpr.blisterpackingReinitiation();
//		bpr.resubmit();
//		bpr.comments(getinitiatorcomments());
		bpr.resubmitactivity(getpassword());
	}
}
