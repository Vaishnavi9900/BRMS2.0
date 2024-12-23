package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.Strength;

public class StrengthTestRunner extends ConfigurationReader {
	public Assignmenu as;
	public Strength st;
	
	@Test
	public void strengthcreatewithspace() throws InterruptedException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.strengthcreatewithspace();
		
	}
	@Test
	public void strengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.strengthcreate();
		st.createactivity(getpassword());
	}
	@Test
	public void existedstrengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.existedstrengthcreate();
	}
	@Test
	public void strengthupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.strengthupdatewithspace();
	}
	@Test
	public void strengthupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.strengthupdate(getcomments());
		st.updateactivity(getpassword());
	}
	@Test
	public void strengthdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getinitiator(), getpassword());
		st.stregnthdisableenable(getcomments());
		st.updateactivity(getpassword());
	}

}
