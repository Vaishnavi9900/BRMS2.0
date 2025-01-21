package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRAdditionalPageprintreqInitiation;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;

public class BPRAdditionalPagePrintReqInitiation extends ConfigurationReader{

	public Assignmenu as;
	public BMRBPRAdditionalPageprintreqInitiation add;
	public BMRPrintIssuanceInitiationandReceived received;
	
	@Test
	public void bpradditionalPageInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on additional print request initiation tab");
		add.bpradditionalprintreqinitiationtab();
		LoggerUtil.logInfo("select the selectall pages");
		add.selectallpages();
		LoggerUtil.logInfo("select the specic pages, validate and enter the page numbers");
		add.selectspecificpages1();
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		LoggerUtil.logInfo("click on submit");
		add.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		add.comments();
		LoggerUtil.logInfo("click on submit");
		add.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		add.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Additional Page Print Req. Initiation Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
	public void bpradditionalPageReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on additional print request initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		add.bpradditionalprintreqReinitiationtab();
		LoggerUtil.logInfo("select the selectall pages");
		add.selectallpages();
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		LoggerUtil.logInfo("click on resubmit");
		add.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		add.comments();
		LoggerUtil.logInfo("click on resubmit");
		add.resubmit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		add.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Additional Page Print Req. ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void additionalPageAcknowledgment() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		received = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on additional print request initiation tab");
		LoggerUtil.logInfo("click on Issued status tab and open the record");
		received.additioanlpageprintreceivedtab();
		LoggerUtil.logInfo("click on printreceived");
		received.additionalprintreceived();
		LoggerUtil.logInfo("validate comments and enter comments");
		received.additionalcomments();
		LoggerUtil.logInfo("click on printreceived");
		received.additionalprintreceived();
		LoggerUtil.logInfo("Enter password and submit the record");
		received.additionalprintreceivedsubmit(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Additional Page Print Acknowledgment Test is failed", e);
			Assert.fail();
		}
	}
}

