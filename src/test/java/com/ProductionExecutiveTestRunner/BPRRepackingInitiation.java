package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BPRRePackingReqInitiation;

public class BPRRepackingInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRePackingReqInitiation repack;
	
	@Test
	public void bprRePackingreqInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		repack.repcakingqtyinitiation();
		repack.submit();
		repack.repackingdetails();
		repack.comments(getinitiatorcomments());
		repack.submit();
		repack.submitactivity(getpassword());
		
	}
	@Test
   public void bprRePackingreqReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		repack.repcakingqtyReinitiation();
		repack.submit();
		repack.repackingdetails();
		repack.comments(getinitiatorcomments());
		repack.submit();
		repack.submitactivity(getpassword());
		
	}

}
