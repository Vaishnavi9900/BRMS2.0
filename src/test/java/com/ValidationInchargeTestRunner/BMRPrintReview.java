package com.ValidationInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ValidationInchargePageObjects.BMRValidationInchargePrintReview;

public class BMRPrintReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRValidationInchargePrintReview val;
	
	@Test
	public void printReturntoExecutive() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRValidationInchargePrintReview(driver);
		
		as.userlogin(getvalidationincharge(), getpassword());
		val.printreqreviewtab();
		val.returnbutton();
		val.comments(getreturncomments());
		val.returnbutton();
		val.returntoexeactivity(getpassword());
	}
	
	@Test
	public void printReturntoIncharge() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRValidationInchargePrintReview(driver);
		
		as.userlogin(getvalidationincharge(), getpassword());
		val.printreqreviewtab();
		val.returnbutton();
		val.comments(getreturncomments());
		val.returnbutton();
		val.returntoinchargeactivity(getpassword());
	}
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRValidationInchargePrintReview(driver);
		
		as.userlogin(getvalidationincharge(), getpassword());
		val.printreqreviewtab();
		val.submit();
		val.commentsbatchtype(getapprovalcomments());
		val.submit();
		val.submitactivity(getpassword());
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRValidationInchargePrintReview(driver);
		
		as.userlogin(getvalidationincharge(), getpassword());
		val.reReview();
		val.submit();
		val.commentsbatchtype(getapprovalcomments());
		val.submit();
		val.submitactivity(getpassword());
	}


}
