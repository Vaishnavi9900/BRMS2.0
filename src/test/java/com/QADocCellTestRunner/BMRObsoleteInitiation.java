package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QADocCellPageObjects.BMRBPRObsoleteInitiation;

public class BMRObsoleteInitiation extends ConfigurationReader {

	public Assignmenu as;
	public BMRBPRObsoleteInitiation obs;

	@Test
	public void obsoleteInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		as.userlogin(getQADoccell(), getpassword());
		obs.obsoleteInitiation();
		obs.submit();
		obs.comments(getinitiatorcomments());
		obs.submit();
		obs.submitactivity2(getpassword());
	}
	@Test
	public void obsoleteReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		as.userlogin(getQADoccell(), getpassword());
		obs.obsoleteReInitiation();
		obs.resubmit();
		obs.comments(getinitiatorcomments());
		obs.resubmit();
		obs.submitactivity2(getpassword());
	}
	@Test
	public void finalobsolete() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		as.userlogin(getQADoccell(), getpassword());
		obs.finalobsolete();
		obs.obsolete();
		obs.comments(getapprovalcomments());
		obs.obsolete();
		obs.obsoleteactivity(getpassword());
	}

}
