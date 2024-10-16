package com.AdminTestRunner;

import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;

public class AssignMenuTestRunner extends ConfigurationReader {
	
	
	public Assignmenu as;
	
	@Test
	public void assignmenutest() {
		
		 as = new Assignmenu(driver);
		
	    try {
			as.userlogin(getadmin(), getpassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    as.menu();
	    try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    try {
			as.assignMenuupdate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    try {
			as.updateactivity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

}
