package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRBatchClosureInitiation;

public class BMRBatchClosureInitiationbyQAOfficer extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBatchClosureInitiation closure;
	
	@Test
	public void batchclosureInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		closure.batchclosureinitiation();
		closure.submit();
		closure.bmrexefileupload();
		closure.comments();
		closure.submit();
		//closure.close();
		closure.submitactivity2(getpassword());
		
	}
	@Test
    public void batchclosureReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		closure.batchclosureReinitiation();
		//closure.submit();
		//closure.bmrexefileupload();
		closure.comments();
		closure.resubmit();
		//closure.close();
		closure.submitactivity2(getpassword());
		
	}

}
