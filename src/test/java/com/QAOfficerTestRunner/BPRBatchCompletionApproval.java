package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchCompletionApproval;

public class BPRBatchCompletionApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRBatchCompletionApproval approval;
	
	@Test
	public void batchcoompletionReturntoipqa() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Completion Approval tab and open the record");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("click on return");
		approval.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		approval.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		approval.returnbutton();
		LoggerUtil.logInfo("select the return to as IPQA");
		approval.selectreturntoipqa();
		LoggerUtil.logInfo("Enter password and submit the record");
		approval.returntoipqaactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Completion Return to IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void batchcoompletionReturntoexe() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Completion Approval tab and open the record");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("click on return");
		approval.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		approval.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		approval.returnbutton();
		LoggerUtil.logInfo("select the return to as Production Exe");
		approval.selectreturntoexe();
		LoggerUtil.logInfo("Enter password and submit the record");
		approval.returntoexeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Completion Return to Production Exe Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void batchcoompletionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Completion Approval tab and open the record");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("click on submit");
		approval.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		approval.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		approval.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		approval.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Completion Approval Test is failed", e);
			Assert.fail();
		}
	}


}
