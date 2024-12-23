package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;

public class BMRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRPrintIssuanceInitiationandReceived issuance;
	
	@Test
	public void printRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.printreqinitiationtab();
		issuance.submit();
		issuance.comments();
		issuance.submit();
		issuance.submitactivity(getpassword());
		
	}
	@Test
    public void standardbulkprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.printreqinitiationtab();
		issuance.batchnumber("FD");
		issuance.submit();
		issuance.comments();
		issuance.submit();
		issuance.submitactivity(getpassword());
		
	}
	 @Test
	 public void commonbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			as.userlogin(getprodexe(), getpassword());
			issuance.printreqinitiationtab();
			issuance.batchnumber("FD");
			issuance.batchsize();
			issuance.submit();
			issuance.comments();
			issuance.submit();
			issuance.submitactivity(getpassword());
			
		}
	 @Test
	 public void bilayerbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			as.userlogin(getprodexe(), getpassword());
			issuance.printreqinitiationtab();
			//issuance.bulkbilayerbatchnumber("FD", "FD");
			issuance.bulkbilayerbatchnumbersize("FD", "FD");
			issuance.submit();
			issuance.comments();
			issuance.submit();
			issuance.submitactivity(getpassword());
			
		}
	@Test
    public void printRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.printreqReinitiation();
		issuance.resubmit();
		issuance.comments();
		issuance.resubmit();
		issuance.resubmitactivity(getpassword());
		
	}
	@Test
    public void printRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		as.userlogin(getprodexe(), getpassword());
		issuance.printreceivedtab();
		issuance.printreceived();
		issuance.comments();
		issuance.printreceived();
		issuance.printreceivedsubmit(getpassword());
		
	}
	
	

}
