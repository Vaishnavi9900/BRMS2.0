package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;
import com.QADocCellPageObjects.BMRBPRQADoccellMasterEffective;

public class BPRMasterEffective extends ConfigurationReader{
	

	public Assignmenu as;
	public BMRBPRQADoccellMasterEffective ef;
	public BMRBPRProductionInchargeReview review;

	@Test
	public void bprmasterApprovalEffectivebyQADocCell() throws InterruptedException, IOException {
		

		as = new Assignmenu(driver);
		ef = new BMRBPRQADoccellMasterEffective(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		ef.bprmastereffectivetab();
		ef.effective();
		review.comments(getapprovalcomments());
		ef.effective();
		ef.effectiveactivity2(getpassword());
		
	}

}
