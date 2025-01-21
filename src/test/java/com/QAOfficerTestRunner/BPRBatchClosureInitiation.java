package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBatchClosureInitiation;

public class BPRBatchClosureInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBatchClosureInitiation closure;
	
	@Test
	public void bprbatchclosureInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Initiation tab and open the record");
		closure.bprbatchclosureinitiation();
		LoggerUtil.logInfo("click on submit");
		closure.bprsubmit();
		LoggerUtil.logInfo("BMR Executed file uploads");
		closure.bmrexefileupload();
		LoggerUtil.logInfo("validate comments and enter comments");
		closure.comments();
		LoggerUtil.logInfo("click on submit");
		closure.bprsubmit();
		//closure.close();
		LoggerUtil.logInfo("Enter password and submit the record");
		closure.bprsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Closure Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprbatchclosureReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		closure.bprbatchclosureReinitiation();
		//closure.submit();
		//closure.bmrexefileupload();
		LoggerUtil.logInfo("click on resubmit");
		closure.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		closure.comments();
		LoggerUtil.logInfo("click on resubmit");
		closure.resubmit();
		//closure.close();
		LoggerUtil.logInfo("Enter password and submit the record");
		closure.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Closure ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
