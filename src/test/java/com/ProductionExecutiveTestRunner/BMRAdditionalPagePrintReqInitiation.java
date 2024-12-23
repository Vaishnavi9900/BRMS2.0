package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRBPRAdditionalPageprintreqInitiation;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;


public class BMRAdditionalPagePrintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRAdditionalPageprintreqInitiation add;
	public BMRPrintIssuanceInitiationandReceived received;
	
	@Test
	public void additionalPageInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		add.additionalprintreqinitiationtab();
		add.selectallpages();
		add.selectspecificpages1();
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.submit();
		add.comments();
		add.submit();
		add.submitactivity(getpassword());	
		
	}
	@Test
	public void additionalPageReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		add.additionalprintreqReinitiationtab();
		add.selectallpages();
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.resubmit();
		add.comments();
		add.resubmit();
		add.resubmitactivity(getpassword());
	}
	@Test
	public void additionalPageAcknowledgment() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		received = new BMRPrintIssuanceInitiationandReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		received.additioanlpageprintreceivedtab();
		received.additionalprintreceived();
		received.additionalcomments();
		received.additionalprintreceived();
		received.additionalprintreceivedsubmit(getpassword());
		
	}

}
