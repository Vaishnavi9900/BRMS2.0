package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.ModeofPacking;

public class ModeofPackingTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public ModeofPacking mp;
	
	@Test
	public void mopcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.mopcreate();
		mp.createactivity(getpassword());
	}
	@Test
	public void existedmopcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.existedmopcreation();
	}
	@Test
	public void existedmopcreation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.existedconditionformopcreation();
	}
	@Test
	public void mopupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.mopupdate(getcomments());
		mp.updateactivity(getpassword());
	}
	@Test
	public void addmopinedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.addanothermopinedit(getcomments());
		mp.updateactivity(getpassword());
	}
	@Test
	public void mopdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.mopdisableenableZ(getcomments());
		mp.updateactivity(getpassword());
	}

}
