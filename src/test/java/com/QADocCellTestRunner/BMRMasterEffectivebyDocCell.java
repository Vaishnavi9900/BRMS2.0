package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;
import com.QADocCellPageObjects.BMRQADoccellMasterEffective;


public class BMRMasterEffectivebyDocCell extends ConfigurationReader {

	public Assignmenu as;
	public BMRQADoccellMasterEffective ef;
	public BMRProductionInchargeReview review;

	@Test
	public void masterApprovalEffectivebyQADocCell() throws InterruptedException, IOException {
		

		as = new Assignmenu(driver);
		ef = new BMRQADoccellMasterEffective(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		ef.mastereffectivetab();
		ef.effective();
		review.comments(getapprovalcomments());
		ef.effective();
		ef.effectiveactivity2(getpassword());
		
	}
	
}
