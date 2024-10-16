package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.UnitOfMeasurement;

public class UnitOfMeasurementTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public UnitOfMeasurement uom;
	
	@Test
	public void uomcreationwithspace() throws InterruptedException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.uomcreatewithspace();
	}
	@Test
	public void uomcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.uomcreate();
		uom.createactivity();
	}
	@Test
	public void existeduomcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.existeduomcreate();
	}
	@Test
	public void uomupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.uomupdatewithspace();
	}
	@Test
	public void uomupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.uomupdate(getcomments());
		uom.updateactivity();
	}
	@Test
	public void uomdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		as.userlogin(getadmin(), getpassword());
		uom.uomdisableenable(getcomments());
		uom.updateactivity();
	}

}
