package com.InitiatorPageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BPRProductDetails extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelutils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath =file;
	

		@FindBy(how = How.XPATH, using = "//a[text()=' Product Details ']")
		WebElement productdetails;
		@FindBy(how = How.XPATH, using = "//a[text()=' BPR Product Details']")
		WebElement bprdetails;
		@FindBy(how = How.XPATH, using = "//button[text()='Create']")
		WebElement create;
		@FindBy(how = How.XPATH, using = "//div[text()=' PackStyle is required ']")
		WebElement packstylealert;
		@FindBy(how = How.XPATH, using = "//p[text()='Product Name is required']")
		WebElement prodnamealert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Product Code is required ']")
		WebElement prodcodealert;
		@FindBy(how = How.XPATH, using = "//div[text()=' SFG Code is required ']")
		WebElement sfgalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Market Code is required ']")
		WebElement marketalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Dosage Form is required ']")
		WebElement dosagealert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Strength is required ']")
		WebElement strengthalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' StrengthUOM is required ']")
		WebElement strengthuomalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' ShelfLife is required ']")
		WebElement shelflifealert;
		@FindBy(how = How.XPATH, using = "//div[text()=' ShelfLifeUOM is required ']")
		WebElement shelflifeuomalert;
		@FindBy(how = How.XPATH, using = "//p[text()='Batch Size is required']")
		WebElement batchsizealert;
		@FindBy(how = How.XPATH, using = "//div[text()=' BatchSizeUOM is required ']")
		WebElement batchsizeuomalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Block is required ']")
		WebElement blockalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' Location is required ']")
		WebElement locationalert;
		@FindBy(how = How.XPATH, using = "//div[text()=' CustomerBatch is required ']")
		WebElement customeralert;
		@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
		WebElement yes;
		@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
		WebElement no;
		@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
		WebElement password;
		@FindBy(how = How.XPATH, using = "//button[@type='submit']")
		WebElement submit2;
		@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
		WebElement ok;
		@FindBy(how = How.XPATH, using = "//div[text()=' Comments is required ']")
		WebElement commentsalert;
		@FindBy(how = How.XPATH, using = "(//button[@class='btn xsBtn'])[1]")
		WebElement delete;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='packStyleId']")
		WebElement packstyle;
		@FindBy(how = How.XPATH, using = "//input[@placeholder='Product Name']")
		WebElement productname;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='productCode']")
		WebElement productcode;
		@FindBy(how = How.XPATH, using = "//input[@formcontrolname='SFGCode']")
		WebElement sfgcode;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='marketId']")
		WebElement marketid;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='dosageFormId']")
		WebElement dosageform;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='strengthId']")
		WebElement strength;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='strengthUOMId']")
		WebElement strengthuom;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='shelfLifeId']")
		WebElement shelflife;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='shelfLifeUOMId']")
		WebElement shelflifeuom;
		@FindBy(how = How.XPATH, using = "(//input[@type='text'])[4]")
		WebElement batchsize;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='batchSizeUOMId']")
		WebElement batchsizeuom;
		@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-btn'])[1]")
		WebElement block;
		@FindBy(how = How.XPATH, using = "//div[text()='Blister Packing Line']")
		WebElement blocksel;
		@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-btn'])[2]")
		WebElement location;
		@FindBy(how = How.XPATH, using = "(//li[@class='multiselect-item-checkbox ng-star-inserted'])[10]")
		WebElement locsel;
		@FindBy(how = How.XPATH, using = "//select[@formcontrolname='customerBatchId']")
		WebElement customerbatch;
		@FindBy(how = How.XPATH, using = "//button[text()=' Product Mapping ']")
		WebElement productmapping;
		@FindBy(how = How.XPATH, using = "//ng-select[@placeholder='Product Name']")
		WebElement prodnamemap;
		@FindBy(how = How.XPATH, using = "(//input[@type='text'])[7]")
		WebElement prodcodemap;
		@FindBy(how = How.XPATH, using = "(//input[@type='text'])[8]")
		WebElement mprnomap;
		@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
		WebElement get;
		@FindBy(how = How.XPATH, using = "//input[@type='search']")
		WebElement search;
		@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
		WebElement checkbox;
		@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter your comments']")
		WebElement comments;
		@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
		WebElement submit;
		@FindBy(how = How.XPATH, using = "//button[text()='Add ']")
		WebElement add;
		@FindBy(how = How.XPATH, using = "//a[text()=' Blister Packing ']")
		WebElement blisterpacking;
		@FindBy(how = How.XPATH, using = "//a[text()=' Bottle Packing ']")
		WebElement bottlepacking;
		@FindBy(how = How.XPATH, using = "//modal-container[@class='modal fade show']")
		WebElement popupclick;
		@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
		WebElement createdrecord;
		@FindBy(how = How.XPATH, using = "(//div[@role='option'])[1]")
		WebElement prodcodesel;
		@FindBy(how = How.XPATH, using = "//button[@data-target='#confirmationBattlP']")
		WebElement resubmit;
		
		public BPRProductDetails(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void validatealerts() throws InterruptedException, IOException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 1; i < 2; i++) {
			javascript(productdetails);
			javawait();
			clickElement(bprdetails);
			javawait();
			clickElement(create);
			javawait();
			scrolldown(productmapping);
			clickElement(productmapping);
			javawait();
			mprnomap.click();
			mprnomap(excelutils.getCellData(i, 15));
		    clickElement(mprnomap);
			clickElement(get);
			javawait();
			List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count=checkbox.size();
			checkbox.get(count-1).click();
			javawait();
			clickElement(add);
			javawait();
			javascript(delete);
			clickElement(get);
			javawait();
			mprnomap.click();
			mprnomap(excelutils.getCellData(i, 15));
		    clickElement(mprnomap);
			clickElement(get);
			javawait();
			List<WebElement> checkbox1=driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count1=checkbox1.size();
			checkbox1.get(count1-1).click();
			javawait();
			clickElement(add);
			javawait();
			clickElement(submit);
			javawait();
			//clickElement(popupclick);
			softassert.assertEquals(commentsalert.getText(), "Comments is required");
			javawait();
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			softassert.assertEquals(packstylealert.getText(), "PackStyle is required");
			softassert.assertEquals(prodnamealert.getText(), "Product Name is required");
			softassert.assertEquals(prodcodealert.getText(), "Product Code is required");
			softassert.assertEquals(sfgalert.getText(), "SFG Code is required");
			softassert.assertEquals(marketalert.getText(), "Market Code is required");
			softassert.assertEquals(dosagealert.getText(), "Dosage Form is required");
			softassert.assertEquals(strengthalert.getText(), "Strength is required");
			softassert.assertEquals(strengthuomalert.getText(), "StrengthUOM is required");
			softassert.assertEquals(shelflifealert.getText(), "ShelfLife is required");
			softassert.assertEquals(shelflifeuomalert.getText(), "ShelfLifeUOM is required");
			softassert.assertEquals(batchsizealert.getText(), "Batch Size is required");
			softassert.assertEquals(batchsizeuomalert.getText(), "BatchSizeUOM is required");
			softassert.assertEquals(blockalert.getText(), "Block is required");
			softassert.assertEquals(locationalert.getText(), "Location is required");
			softassert.assertEquals(customeralert.getText(), "CustomerBatch is required");
			}
		}
			
		public void validatealerts1() throws InterruptedException, IOException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 1; i < 2; i++) {
			javascript(productdetails);
			javawait();
			clickElement(bprdetails);
			javawait();
			clickElement(create);
			javawait();
			clickElement(bottlepacking);
			javawait();
			scrolldown(productmapping);
			clickElement(productmapping);
			javawait();
			mprnomap.click();
			mprnomap(excelutils.getCellData(i, 15));
		    clickElement(mprnomap);
			clickElement(get);
			javawait();
			List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count=checkbox.size();
			checkbox.get(count-1).click();
			javawait();
			clickElement(add);
			javawait();
			javascript(delete);
			clickElement(get);
			javawait();
			mprnomap.click();
			mprnomap(excelutils.getCellData(i, 15));
		    clickElement(mprnomap);
			clickElement(get);
			javawait();
			List<WebElement> checkbox1=driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count1=checkbox1.size();
			checkbox1.get(count1-1).click();
			javawait();
			clickElement(add);
			javawait();
			clickElement(submit);
			javawait();
			//clickElement(popupclick);
			softassert.assertEquals(commentsalert.getText(), "Comments is required");
			javawait();
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			softassert.assertEquals(packstylealert.getText(), "PackStyle is required");
			softassert.assertEquals(prodnamealert.getText(), "Product Name is required");
			softassert.assertEquals(prodcodealert.getText(), "Product Code is required");
			softassert.assertEquals(sfgalert.getText(), "SFG Code is required");
			softassert.assertEquals(marketalert.getText(), "Market Code is required");
			softassert.assertEquals(dosagealert.getText(), "Dosage Form is required");
			softassert.assertEquals(strengthalert.getText(), "Strength is required");
			softassert.assertEquals(strengthuomalert.getText(), "StrengthUOM is required");
			softassert.assertEquals(shelflifealert.getText(), "ShelfLife is required");
			softassert.assertEquals(shelflifeuomalert.getText(), "ShelfLifeUOM is required");
			softassert.assertEquals(batchsizealert.getText(), "Batch Size is required");
			softassert.assertEquals(batchsizeuomalert.getText(), "BatchSizeUOM is required");
			softassert.assertEquals(blockalert.getText(), "Block is required");
			softassert.assertEquals(locationalert.getText(), "Location is required");
			softassert.assertEquals(customeralert.getText(), "CustomerBatch is required");
			}
		}
		public void bottlepackinginitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 1; i < 2; i++) {
				javawait();
				javascript(packstyle);
				packstyle.sendKeys(excelutils.getCellData(i, 0));
				productname(excelutils.getCellData(i, 1));
				productcode(excelutils.getCellData(i, 2));
				sfgcode(excelutils.getCellData(i, 3));
				market(excelutils.getCellData(i, 4));
				dosageform(excelutils.getCellData(i, 5));
				strength(excelutils.getCellData(i, 6), excelutils.getCellData(i, 7));
				shelflife(excelutils.getCellData(i, 8), excelutils.getCellData(i, 9));
				batchsize(excelutils.getCellData(i, 10),excelutils.getCellData(i, 11) );
				block();
				javawait();
				location();
				javawait();
				customerbatch(excelutils.getCellData(i, 12));
				javawait();
				comments(excelutils.getCellData(i, 13));

			}
		}
		public void blisterpackinginitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 3; i < 4; i++) {
				javawait();
				javascript(packstyle);
				packstyle.sendKeys(excelutils.getCellData(i, 0));
				productname(excelutils.getCellData(i, 1));
				productcode(excelutils.getCellData(i, 2));
				sfgcode(excelutils.getCellData(i, 3));
				market(excelutils.getCellData(i, 4));
				dosageform(excelutils.getCellData(i, 5));
				strength(excelutils.getCellData(i, 6), excelutils.getCellData(i, 7));
				shelflife(excelutils.getCellData(i, 8), excelutils.getCellData(i, 9));
				batchsize(excelutils.getCellData(i, 10),excelutils.getCellData(i, 11) );
				block();
				javawait();
				location();
				javawait();
				customerbatch(excelutils.getCellData(i, 12));
				javawait();
				comments(excelutils.getCellData(i, 13));

			}
		}
		
		public void blisterpackingReinitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 1; i <2 ; i++) {
				javascript(productdetails);
				javawait();
				clickElement(bprdetails);
				javawait();
				clickElement(search);
				javawait();
				search.sendKeys(excelutils.getCellData(i, 14));
				javawait();
				clickElement(createdrecord);
			}
			for (int i = 2; i < 3; i++) {
				javawait();
				clickElement(blisterpacking);
				javawait();
				batchsize(excelutils.getCellData(i, 10),excelutils.getCellData(i, 11) );
				comments(excelutils.getCellData(i, 13));
				clickElement(resubmit);
			}
		}
		public void bottlepackingReinitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			for (int i = 1; i <2 ; i++) {
				javascript(productdetails);
				javawait();
				clickElement(bprdetails);
				javawait();
				clickElement(search);
				javawait();
				search.sendKeys(excelutils.getCellData(i, 14));
				javawait();
				clickElement(createdrecord);
			}
			for (int i = 2; i < 3; i++) {
				javawait();
				batchsize(excelutils.getCellData(i, 10),excelutils.getCellData(i, 11) );
				comments(excelutils.getCellData(i, 13));
				clickElement(resubmit);
			}
		}
		public void packstyle(String style) throws InterruptedException {
			textboxc(packstyle, style);
		}
		public void mprnomap(String no) throws InterruptedException {
			textboxc(mprnomap, no);
		}

		public void productname(String name) throws InterruptedException {
			textboxc(productname, name);
		}
		public void productcode(String code) throws InterruptedException {
			textboxc(productcode, code);
		}
		public void sfgcode(String code) throws InterruptedException {
			textboxc(sfgcode, code);
		}
		public void market(String mark) throws InterruptedException {
			textbox(marketid, mark);
		}

		public void dosageform(String dosage) throws InterruptedException {
			textbox(dosageform, dosage);
		}

		public void customerbatch(String batch) throws InterruptedException {
			textbox(customerbatch, batch);
		}
		public void prodcodemap(String codemap) {
			clickElement(prodcodemap);
			prodcodemap.sendKeys(codemap);
		}

		public void strength(String str, String struom) throws InterruptedException {
			textbox(strength, str);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			textbox(strengthuom, struom);
		}

		public void shelflife(String shelf, String uom) throws InterruptedException {
			textbox(shelflife, shelf);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			textbox(shelflifeuom, uom);
		}

		public void batchsize(String size, String uom) throws InterruptedException {
			textboxc(batchsize, size);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			textbox(batchsizeuom, uom);
		}

		public void block() throws InterruptedException {
			clickElement(block);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement(blocksel);
		}
		public void location() throws InterruptedException {
			clickElement(location);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement(locsel);
		}
		public void comments(String comm) throws InterruptedException {
			textboxc(comments, comm);
		}

		public void submit() throws InterruptedException {
			javawait();
			clickElement(submit);
		}
		public void resubmit() throws InterruptedException {
			javawait();
			clickElement(resubmit);
		}

		public void submitactivity(String pass) throws InterruptedException {

			clickElement(no);
			javawait();
			clickElement(submit);
			javawait();
			clickElement(yes);
			javawait();
			textbox(password, pass);
			javawait();
			clickElement(submit2);
			javawait();
		}
		public void resubmitactivity(String pass) throws InterruptedException {

			javawait();
			clickElement(no);
			javawait();
			clickElement(resubmit);
			javawait();
			clickElement(yes);
			javawait();
			textbox(password, pass);
			javawait();
			clickElement(submit2);
			javawait();
		}

}
