package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BPRPrintIssuanceInitiationReceived;


public class BPRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintIssuanceInitiationReceived issuance;
	
	@Test
	public void bprprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.bprprintreqinitiationtab();
		issuance.submit();
		issuance.batchnumberdateformats("DD/MM/YYYY", "15-12-2024", "26-10-2025", "FD");
		issuance.batchsize();
		issuance.comments(getinitiatorcomments());
		issuance.submit();
		issuance.submitactivity(getpassword());
		
	}
	@Test
    public void bprprintRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.bprprintreqReinitiation();
		issuance.submit();
		issuance.batchsize();
		issuance.comments(getinitiatorcomments());
		issuance.submit();
		issuance.submitactivity(getpassword());
		
	}
	@Test
    public void bprprintRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.printreceivedtab();
		issuance.printreceived();
		issuance.comments("Print Received successfully.");
		issuance.printreceived();
		issuance.printreceivedsubmit(getpassword());
		
	}

}
