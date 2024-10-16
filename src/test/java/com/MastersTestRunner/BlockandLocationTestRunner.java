package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.BlockandLocation;

public class BlockandLocationTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public BlockandLocation bc;
	
	@Test
	public void blocklocationcreation() throws InterruptedException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		
			as.userlogin(getadmin(), getpassword());	

			bc.blocklocationcreate();
		
			bc.createactivity();
		
	}
	
	@Test()
	public void existedblocklocationcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		as.userlogin(getadmin(), getpassword());	
		bc.existedblockloactioncreation();
		
	}
	@Test
	public void existedblocklocationcreation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		as.userlogin(getadmin(), getpassword());	
		bc.existedconditionforblockcreation();
		
	}
	
	@Test
	public void blocklocationedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		as.userlogin(getadmin(), getpassword());
		bc.blocklocationedit(getcomments());
		bc.updateactivity();
	}
	@Test
	public void addblocklocationinedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		as.userlogin(getadmin(), getpassword());
		bc.addanotherblockinedit(getcomments());
		bc.updateactivity();
	}
	
	
	@Test
	public void blocklocationdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		as.userlogin(getadmin(), getpassword());
		bc.blocklocationdisableenable(getcomments());
		bc.updateactivity();
	}

}
