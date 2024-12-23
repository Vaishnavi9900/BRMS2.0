package com.IPQATestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.IPQAPageObjects.BPRUnusedqtyApprovalorRejection;

public class BPRUnusedQtyApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedqtyApprovalorRejection qty;
	
	@Test
	public void unusedqtyRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		as.userlogin(getIPQA(), getpassword());
		qty.unusedqtyApproval();
		qty.reject();
		qty.comments(getrejectedcomments());
		qty.reject();
		qty.rejectactivity(getpassword());
	}
	@Test
	public void unusedqtyApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		as.userlogin(getIPQA(), getpassword());
		qty.unusedqtyApproval();
		qty.submit();
		qty.comments(getapprovalcomments());
		qty.submit();
		qty.submitactivity(getpassword());
	}

}
