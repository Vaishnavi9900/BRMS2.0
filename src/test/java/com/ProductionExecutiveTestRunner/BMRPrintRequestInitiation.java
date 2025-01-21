package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;

public class BMRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRPrintIssuanceInitiationandReceived issuance;
	
	@Test
	public void printRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on print request initiation tab and open the record");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments();
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Blend record Print Request Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void standardbulkprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on print request initiation tab and open the record");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("Select the blend batchnumber");
		issuance.batchnumber("FD");
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments();
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		issuance.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Bulk-standard record Print Request Initiation Test is failed", e);
			Assert.fail();
		}
	}
	 @Test
	 public void commonbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("click on print request initiation tab and open the record");
			issuance.printreqinitiationtab();
			LoggerUtil.logInfo("Select the blend batchnumber");
			issuance.batchnumber("FD");
			LoggerUtil.logInfo("Enter the blend size");
			issuance.batchsize();
			LoggerUtil.logInfo("click on submit");
			issuance.submit();
			LoggerUtil.logInfo("validate comments and enter comments");
			issuance.comments();
			LoggerUtil.logInfo("click on submit");
			issuance.submit();
			LoggerUtil.logInfo("Enter password and submit the record");
			issuance.submitactivity(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BMR Bulk-common record Print Request Initiation Test is failed", e);
			}
		}
	 @Test
	 public void bilayerbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("click on print request initiation tab and open the record");
			issuance.printreqinitiationtab();
			//issuance.bulkbilayerbatchnumber("FD", "FD");
			LoggerUtil.logInfo("Select the blend batchnumbers");
			issuance.bulkbilayerbatchnumbersize("FD", "FD");
			LoggerUtil.logInfo("click on submit");
			issuance.submit();
			LoggerUtil.logInfo("validate comments and enter comments");
			issuance.comments();
			LoggerUtil.logInfo("click on submit");
			issuance.submit();
			LoggerUtil.logInfo("Enter password and submit the record");
			issuance.submitactivity(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BMR Bulk-bilayer record Print Request Initiation Test is failed", e);
				Assert.fail();
			}
			
		}
	@Test
    public void printRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on print request initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		issuance.printreqReinitiation();
		LoggerUtil.logInfo("click on resubmit");
		issuance.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments();
		LoggerUtil.logInfo("click on resubmit");
		issuance.resubmit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		issuance.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Request ReInitiation Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
    public void printRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on print request initiation tab");
		LoggerUtil.logInfo("click on Issued status tab and open the record");
		issuance.printreceivedtab();
		LoggerUtil.logInfo("click on print received");
		issuance.printreceived();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments();
		LoggerUtil.logInfo("click on print received");
		issuance.printreceived();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.printreceivedsubmit(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Acknowledgment Test is failed", e);
			Assert.fail();
		}
	}
	
	

}
