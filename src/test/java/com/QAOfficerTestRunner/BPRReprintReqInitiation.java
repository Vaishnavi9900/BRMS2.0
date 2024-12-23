package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRBPRQAOfficerRePrintReqInitiation;

public class BPRReprintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAOfficerRePrintReqInitiation reprint;
	
	@Test
	public void bprrePrintInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		reprint.bprreprintreqinitiationtab();
		reprint.selectallpages();
		reprint.selectspecificpages1();
		//reprint.selectspecificpages2();
		reprint.selectallpages2();
		reprint.selectspecificrange1();
		reprint.submit();
		reprint.comments();
		reprint.submit();
		reprint.submitactivity2(getpassword());
	
	}
	@Test
	public void bprrePrintReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		reprint.bprreprintreqReinitiationtab();
		reprint.selectallpages();
		reprint.resubmit();
		reprint.reinitiationcomments();
		reprint.resubmit();
		reprint.resubmitactivity(getpassword());
	
	}


}
