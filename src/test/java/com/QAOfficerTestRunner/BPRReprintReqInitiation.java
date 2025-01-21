package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRQAOfficerRePrintReqInitiation;

public class BPRReprintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAOfficerRePrintReqInitiation reprint;
	
	@Test
	public void bprrePrintInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on RePrint Req. Initiation tab and open the record");
		reprint.bprreprintreqinitiationtab();
		LoggerUtil.logInfo("select select all pages");
		reprint.selectallpages();
		LoggerUtil.logInfo("select select specific pages");
		reprint.selectspecificpages1();
		LoggerUtil.logInfo("select select specific pages for format log and validate");
		//reprint.selectspecificpages2();
		reprint.selectallpages2();
		LoggerUtil.logInfo("select select specific range and validate");
		reprint.selectspecificrange1();
		LoggerUtil.logInfo("click on submit");
		reprint.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		reprint.comments();
		LoggerUtil.logInfo("click on submit");
		reprint.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		reprint.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR RePrint Req. Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprrePrintReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on RePrint Req. Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		reprint.bprreprintreqReinitiationtab();
		LoggerUtil.logInfo("select select all pages");
		reprint.selectallpages();
		LoggerUtil.logInfo("click on resubmit");
		reprint.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		reprint.reinitiationcomments();
		LoggerUtil.logInfo("click on resubmit");
		reprint.resubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		reprint.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR RePrint Req. ReInitiation Test is failed", e);
			Assert.fail();
		}
	}


}
