package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BPRUnusedqtyApprovalorRejection;

public class BPRUnusedQtyApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedqtyApprovalorRejection qty;
	
	@Test
	public void unusedqtyRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BPR Unused Qty approval tab and open the record");
		qty.unusedqtyApproval();
		LoggerUtil.logInfo("click on reject");
		qty.reject();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		qty.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		qty.reject();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		qty.rejectactivity(getpassword());
		}
        catch (Exception e) {
			
			LoggerUtil.logError("BPR Unused Qty Rejection by IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void unusedqtyApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BPR Unused Qty approval tab and open the record");
		qty.unusedqtyApproval();
		LoggerUtil.logInfo("click on submit");
		qty.submit();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		qty.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		qty.submit();
		LoggerUtil.logInfo("Enter the passowrd and approve the record");
		qty.submitactivity(getpassword());
		}
        catch (Exception e) {
			
			LoggerUtil.logError("BPR Unused Qty Approval by IPQA Test is failed", e);
			Assert.fail();
		}
	}

}
