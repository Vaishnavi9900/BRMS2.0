package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRBPRBatchCompletionApproval;

public class BMRBatchCompletionApprovalbyQAOfficer extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRBatchCompletionApproval approval;
	
	@Test
	public void batchcoompletionReturntoipqa() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		approval.batchcompletionapprovaltab();
		approval.returnbutton();
		approval.comments(getreturncomments());
		approval.returnbutton();
		approval.selectreturntoipqa();
		approval.returntoipqaactivity(getpassword());
	}
	@Test
	public void batchcoompletionReturntoexe() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		approval.batchcompletionapprovaltab();
		approval.returnbutton();
		approval.comments(getreturncomments());
		approval.returnbutton();
		approval.selectreturntoexe();
		approval.returntoexeactivity(getpassword());
	}
	@Test
	public void batchcoompletionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		approval.batchcompletionapprovaltab();
		approval.submit();
		approval.comments(getapprovalcomments());
		approval.submit();
		approval.submitactivity(getpassword());
	}

}
