package com.QAOfficerTestRunner;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.QAOfficerPageObjects.FormatLogInitiation;
import com.aventstack.extentreports.Status;

public class FormatLogInitiationTestRunner extends ConfigurationReader
	{

		public Assignmenu as;
		public FormatLogInitiation log;
		
		@Test
		public void formatLogInitiation() throws InterruptedException, AWTException {
			
			as = new Assignmenu(driver);
			log = new FormatLogInitiation(driver);
			
			try {
			as.userlogin(getQAOfficer(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA Officer UserId and Password");
			extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
			log.formatlog();
			LoggerUtil.logInfo("Clicked on Block, Format Log Initiation Tab and New Radio button");
			extenttest.log(Status.PASS, "Clicked on Block, Format Log Initiation Tab and New Radio button");
			log.submit();
			LoggerUtil.logInfo("Clicked on submit");
			extenttest.log(Status.PASS, "Clicked on submit");
			log.validateAlerts();
			LoggerUtil.logInfo("Validated the Validation Alerts");
			extenttest.log(Status.PASS, "Validated the Validation Alerts");
			log.processtype(getprocesstype());
			LoggerUtil.logInfo("Selected the Process Type");
			extenttest.log(Status.PASS, "Selected the Process Type");
			log.formatgroup(getformatgroup());
			LoggerUtil.logInfo("Entered the Format Group");
			extenttest.log(Status.PASS, "Entered the Format Group");
			log.formattitle(getformattitle());
			LoggerUtil.logInfo("Entered the Format Title");
			extenttest.log(Status.PASS, "Entered the Format Title");
			log.formatnumber(getformatnumber1());
			LoggerUtil.logInfo("Entered the Format Number");
			extenttest.log(Status.PASS, "Entered the Format Number");
			log.noofcopies("1");
			LoggerUtil.logInfo("Entered the Number of Copies");
			extenttest.log(Status.PASS, "Entered the Number of Copies");
			log.fileupload();
			LoggerUtil.logInfo("Uploaded the Format File template");
			extenttest.log(Status.PASS, "Uploaded the Format File template");
			log.add();
			LoggerUtil.logInfo("clicked on add");
			extenttest.log(Status.PASS, "clicked on add");
			log.comments(getcomments());
			LoggerUtil.logInfo("Entered the Comments");
			extenttest.log(Status.PASS, "Entered the Comments");
			log.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			log.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered the password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			log.screenclick();
			LoggerUtil.logInfo("Closed the popup");
			extenttest.log(Status.PASS, "Closed the popup");
			log.createdrecord();
			log.isEnabled();
			LoggerUtil.logInfo("Verified the fields are enabled or not");
			extenttest.log(Status.PASS, "Verified the fields are enabled or not");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch(Exception e) {
				
				LoggerUtil.logError("Format Log Initiation Test is failed", e);
				extenttest.fail("Test failed" +e.getMessage());
				extenttest.fail(e);
				throw e;
			}
			
		}
		
		@Test
		public void formatLogReInitiation() throws InterruptedException, AWTException {
			
			as = new Assignmenu(driver);
			log = new FormatLogInitiation(driver);
			
			try {
			as.userlogin(getQAOfficer(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA Officer UserId and Password");
			extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
			log.formatlogReInitiation();
			LoggerUtil.logInfo("Clicked on Format Log Initiation Tab and Returned Record");
			extenttest.log(Status.PASS, "Clicked on Format Log Initiation Tab and Returned Record");
			log.submit();
			LoggerUtil.logInfo("Clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			log.validateCommentsAlert();
			LoggerUtil.logInfo("Validated the Validation Alerts");
			extenttest.log(Status.PASS, "Validated the Validation Alerts");
			log.formatnumber(getformatnumber());
			LoggerUtil.logInfo("Modified the formatnumber");
			extenttest.log(Status.PASS, "Modified the formatnumber");
			log.removefile();
			LoggerUtil.logInfo("Removed the uploaded file");
			extenttest.log(Status.PASS, "Removed the uploaded file");
			log.fileupload();
			LoggerUtil.logInfo("Uploaded the new file");
			extenttest.log(Status.PASS, "Uploaded the new file");
			log.submit();
			LoggerUtil.logInfo("Clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			log.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered the password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
            catch(Exception e) {
				
				LoggerUtil.logError("Format Log ReInitiation Test is failed", e);
				extenttest.fail("Test failed" +e.getMessage());
				extenttest.fail(e);
				throw e;
			}
		}
		
		
	}
