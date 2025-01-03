package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.DosageForm;

public class DosageFormTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public DosageForm ds;
	
	@Test
	public void dosagecreatewithspace() throws InterruptedException {
		
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.dosageformcreatewithspace();
		
	}
	
	@Test
	public void dosageformcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.dosageformcreate();
		ds.createactivity(getpassword());
	}
	@Test
	public void existeddosagecreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.existeddosageform();
		ds.createactivity(getpassword());
	}
	
	@Test
	public void dosageupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.dosageupdatewithspace();
	}
	@Test
	public void dosageformupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.dosageupdate(getcomments());
		ds.updateactivity();
	}
	@Test
	public void dosagedisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		as.userlogin(getinitiator(), getpassword());
		ds.dosageenabledisable(getcomments());
		ds.updateactivity();
	}

}
