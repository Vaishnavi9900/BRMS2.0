package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBatchClosureInitiation;

public class BMRBatchClosureInitiationbyQAOfficer extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBatchClosureInitiation closure;
	
	@Test
	public void batchclosureInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Initiation tab and open the record");
		closure.batchclosureinitiation();
		LoggerUtil.logInfo("click on submit");
		closure.submit();
		LoggerUtil.logInfo("BMR Executed file uploads");
		closure.bmrexefileupload();
		LoggerUtil.logInfo("validate comments and enter comments");
		closure.comments();
		LoggerUtil.logInfo("click on submit");
		closure.submit();
		//closure.close();
		LoggerUtil.logInfo("Enter password and submit the record");
		closure.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Closure Initiation Test is failed", e);
			Assert.fail();
		}
	}
	//@Test
    public void batchclosureReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		closure.batchclosureReinitiation();
		//closure.submit();
		//closure.bmrexefileupload();
		LoggerUtil.logInfo("validate comments and enter comments");
		closure.comments();
		LoggerUtil.logInfo("click on resubmit");
		closure.resubmit();
		//closure.close();
		LoggerUtil.logInfo("Enter password and submit the record");
		closure.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Closure ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
