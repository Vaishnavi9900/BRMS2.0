package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRBatchClosureInitiation;

public class BPRBatchClosureInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBatchClosureInitiation closure;
	
	@Test
	public void bprbatchclosureInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		closure.bprbatchclosureinitiation();
		closure.bprsubmit();
		closure.bmrexefileupload();
		closure.comments();
		closure.bprsubmit();
		//closure.close();
		closure.bprsubmitactivity(getpassword());
		
	}
	@Test
    public void bprbatchclosureReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		closure.bprbatchclosureReinitiation();
		//closure.submit();
		//closure.bmrexefileupload();
		closure.resubmit();
		closure.comments();
		closure.resubmit();
		//closure.close();
		closure.submitactivity2(getpassword());
		
	}

}
