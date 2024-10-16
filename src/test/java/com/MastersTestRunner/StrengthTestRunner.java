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
		
		as.userlogin(getadmin(), getpassword());
		st.strengthcreatewithspace();
		
	}
	@Test
	public void strengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getadmin(), getpassword());
		st.strengthcreate();
		st.createactivity();
	}
	@Test
	public void existedstrengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getadmin(), getpassword());
		st.existedstrengthcreate();
	}
	@Test
	public void strengthupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getadmin(), getpassword());
		st.strengthupdatewithspace();
	}
	@Test
	public void strengthupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getadmin(), getpassword());
		st.strengthupdate(getcomments());
		st.updateactivity();
	}
	@Test
	public void strengthdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		as.userlogin(getadmin(), getpassword());
		st.stregnthdisableenable(getcomments());
		st.updateactivity();
	}

}
