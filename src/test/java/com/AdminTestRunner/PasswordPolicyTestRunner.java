package com.AdminTestRunner;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.AdminPageObjects.Passwordpolicy;
import com.BasicData.ConfigurationReader;

public class PasswordPolicyTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public Passwordpolicy ps;
	
	@Test
	public void passwordpolicytest() throws InterruptedException {
		
		as = new Assignmenu(driver);
		ps = new Passwordpolicy(driver);
		
		try {
			as.userlogin(getadmin(), getpassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.passwordexpiry(getpasswordexp());
		
		javawait();
		
		ps.invalidattempts(getinvalidattempts());
		javawait();
		
		ps.expalert(getpasswordexpalert());
		javawait();
		ps.minlength(getminlength());
		javawait();
		ps.enforcepasshistory(getenforcepasswordhistory());
		javawait();
		ps.updateactivity(getpassword());
		
	}
	
	

}
