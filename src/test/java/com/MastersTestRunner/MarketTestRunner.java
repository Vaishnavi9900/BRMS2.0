package com.MastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.MasterPageObjects.Market;

public class MarketTestRunner extends ConfigurationReader {
	
	public  Assignmenu as;
	public Market mt;
	
	@Test
	public void Marketcreatewithspace() throws InterruptedException {
		
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.marketcreatewithspace();
	}
	
	@Test
	public void Marketcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.marketcreate();
		mt.createactivity();
	}
	
	@Test
	public void existedmarketcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.existedmarketcreation();
	
	}
	@Test
	public void updatemarketwithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.marketupdatewithspace();
	}
	
	@Test
	public void marketupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.marketupdate(getcomments());
		mt.updateactivity();
	}
	
	@Test
	public void marketdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		as.userlogin(getadmin(), getpassword());
		mt.marketdisableenable(getcomments());
		mt.updateactivity();
		
	}

}
