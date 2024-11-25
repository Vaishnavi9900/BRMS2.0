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
	
	

}
