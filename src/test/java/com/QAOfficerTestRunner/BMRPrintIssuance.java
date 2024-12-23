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
	public void issue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issuance.printissuancetab();
		issuance.issue();
		issuance.printcopydetails();
		issuance.comments(getissuedcomments());
		issuance.issue();
		issuance.issueactivity2(getpassword());
	}
	@Test
	public void bulkissue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issuance.printissuancetab();
		issuance.issue();
		issuance.bulkprintcopydetails();
		issuance.comments(getissuedcomments());
		issuance.issue();
		issuance.issueactivity2(getpassword());
	}
	@Test
	public void print() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issuance.printissuancetab();
		issuance.print();
		issuance.comments(getprintcomments());
		issuance.print();
		issuance.printactivity(getpassword());
	}
	

}
