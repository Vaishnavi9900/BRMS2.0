package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BPRUnusedQuantityInitiation;

public class BPRUnUsedQunatityInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedQuantityInitiation qty;
	
	@Test
	public void unusedqtyInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedQuantityInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		qty.unusedqtyInitiation();
		qty.submit();
		qty.unusedqtydetails();
		qty.comments();
		qty.submit();
		qty.submitactivity(getpassword());
	}
	

}
