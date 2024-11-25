package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRQAOfficerIssuanceandPrint;

public class BMRPrintIssuance extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAOfficerIssuanceandPrint issuance;
	
	@Test
	public void issueandPrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issuance.printissuancetab();
		issuance.comments2(getissuedcomments());
		issuance.issue();
		//issuance.comments();
		//issuance.issue();
		issuance.issueactivity2(getpassword());
		
		issuance.printissuancetab();
		issuance.comments2(getprintcomments());
		issuance.print();
		//issuance.comments();
		//.print();
		issuance.printactivity(getpassword());
	}
	

}
