package com.InitiatorPageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRProductDetails extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;
	
	static String mpr1=null;
	// Product Details: Blend

	@FindBy(how = How.XPATH, using = "//a[text()=' Product Details ']")
	WebElement productdetails;
	@FindBy(how = How.XPATH, using = "//a[text()='Blend']")
	WebElement blend;
	@FindBy(how = How.XPATH, using = "//button[text()='Create ']")
	WebElement create;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//div[text()=' Product Name is required ']")
	WebElement prodnamealert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Product Code is required ']")
	WebElement prodcodealert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Market is required ']")
	WebElement marketalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Dosage Form is required ']") 
	WebElement dosageformalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Strength is required ']")
	WebElement stregnthalert;
	@FindBy(how = How.XPATH, using = "(//div[text()=' UOM is required '])[1]")
	WebElement struomalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Shelf Life is required ']")
	WebElement shelflifealert;
	@FindBy(how = How.XPATH, using = "(//div[text()=' UOM is required '])[2]")
	WebElement shelflifeuomalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Batch Size is required ']")
	WebElement batchsizealert;
	@FindBy(how = How.XPATH, using = "(//div[text()=' UOM is required '])[3]")
	WebElement batchuomalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Block is required ']")
	WebElement blockalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Input as Pellets is required ']")
	WebElement ispelletsalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Location is required ']")
	WebElement locationalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Comments is required ']")
	WebElement commentsalert;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='productName']")
	WebElement productname;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='productCode']")
	WebElement productcode;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='marketId']")
	WebElement market;
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
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='batchSize']")
	WebElement batchsize;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='batchSizeUOMId']")
	WebElement batchsizeuom;
	@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-btn'])[1]")
	WebElement block;
	@FindBy(how = How.XPATH, using = "(//li[@class='multiselect-item-checkbox ng-star-inserted'])[2]")
	WebElement blocksel;
	@FindBy(how = How.XPATH, using = "//div[text()='Bottle packing Line']")
	WebElement blocksel2;
	@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-btn'])[2]")
	WebElement location;
	@FindBy(how = How.XPATH, using = "(//li[@class='multiselect-item-checkbox ng-star-inserted'])[7]")
	WebElement locsel;
	@FindBy(how = How.XPATH, using = "(//li[@class='multiselect-item-checkbox ng-star-inserted'])[8]")
	WebElement locsel2;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[1]")
	WebElement ispelletsYes;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
	WebElement ispelletsNo;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='productName_PM']")
	WebElement productnamepm;
	@FindBy(how = How.XPATH, using = "(//option[text()=' Common blend for Acetaminophen Suppositories Tablet 750 mg and 950 mg '])[2]")
	WebElement productnamepmsel;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='productCode_PM']")
	WebElement productcodepm;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[6]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "(//div[@class='ng-select-container'])[3]")
	WebElement bulkmprno;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[8]")
	WebElement bulkmprnosel;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='marketId_PM']")
	WebElement marketpm;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='blockId_PM']")
	WebElement blockpm;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='locationId_PM']")
	WebElement locationpm;
	@FindBy(how = How.XPATH, using = "//button[@class='btn outLineBtn']")
	WebElement refresh;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']") 
	WebElement Get;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[3]")
	WebElement blendpmselect;
	@FindBy(how = How.XPATH, using = "//button[@class='btn xsBtn']")
	WebElement delete;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[3]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//button[text()='Template']")
	WebElement template;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[4]")
	WebElement upload;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//a[text()=' Comments']")
	WebElement commentstab;
	@FindBy(how = How.XPATH, using = "//button[text()=' Re-Submit ']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
	WebElement add;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;

	// Product Details: Pellets
	@FindBy(how = How.XPATH, using = "//a[text()='Pellets']")
	WebElement pellets;

	// Product Details Bulk

	@FindBy(how = How.XPATH, using = "//a[text()='Bulk']")
	WebElement bulk;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='productTypeId']")
	WebElement producttype;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='marketId']")
	WebElement marketp;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='inputBlendCode']")
	WebElement inputblendcode;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='refBatchSize']")
	WebElement refbatchsize;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='refBatchSizeUOMId']")
	WebElement refbatchsizeuom;
	@FindBy(how = How.XPATH, using = "//img[@alt='review']")
	WebElement back;
	@FindBy(how = How.XPATH, using = "//*[@id=\"blendTable1\"]/table/tbody/tr/td[1]/input")
	WebElement bulkpmselect1;
	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[4]")
	WebElement bulkpmselect2;
	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[3]")
	WebElement bulkpmselect3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"DataTables_Table_9\"]/tbody/tr[1]/td[1]/span")
	WebElement mprpath;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/table/tbody/tr/td[1]/ul/li[2]")
	WebElement mpr;
	@FindBy(how = How.XPATH, using = "(//p[@class='submit-sub-text'])[2]")
	WebElement mprnumber;

	public BMRProductDetails(WebDriver driver) {

		PageFactory.initElements(driver, this);	
	}

	public void pelletsproductdetailsalertsvalidate() throws InterruptedException {
		javawait();
		javascript(productdetails);
		javawait();
		clickElement(create);
		clickElement(pellets);
		clickElement(submit);
		softassert.assertEquals(prodnamealert.getText(), "Product Name is required");
		softassert.assertEquals(prodcodealert.getText(), "Product Code is required");
		softassert.assertEquals(marketalert.getText(), "Market is required");
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form is required");
		softassert.assertEquals(stregnthalert.getText(), "Strength is required");
		softassert.assertEquals(struomalert.getText(), "UOM is required");
		softassert.assertEquals(shelflifealert.getText(), "Shelf Life is required");
		softassert.assertEquals(shelflifeuomalert.getText(), "UOM is required");
		softassert.assertEquals(batchsizealert.getText(), "Batch Size is required");
		softassert.assertEquals(batchuomalert.getText(), "UOM is required");
		softassert.assertEquals(blockalert.getText(), "Block is required");
		softassert.assertEquals(locationalert.getText(), "Location is required");
		softassert.assertEquals(commentsalert.getText(), "Comments is required");
	}

	public void pelletsinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 3; i < 4; i++) {
			productname(excelUtils.getCellData(i, 0));
			productcode(excelUtils.getCellData(i, 1));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}

	}
	public void setmpr() throws IOException {
			 mpr1 = mprnumber.getText();
		excelUtils.writecellvalue(excelFilePath,"Productdetails", mpr1);
	}

	

	public void pelletsReinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javascript(productdetails);
		//for (int i = 1; i < 2; i++) {
			textbox(search, mpr1);
			clickElement(createdrecord);
			clickElement(resubmit);
			softassert.assertEquals(commentsalert.getText(), "Comments is required");
		//}
		for (int i = 3; i < 4; i++) {
			javascript(productname);
			productname.clear();
			productname.sendKeys(excelUtils.getCellData(i, 0));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block1();
			location1();
			comments(excelUtils.getCellData(i, 10));
			clickElement(resubmit);
		}
	}

	public void blendproductdetailsalertsvalidate() throws InterruptedException {
		javascript(productdetails);
		javawait();
		clickElement(create);
		scrolldown(submit);
		clickElement(submit);
		softassert.assertEquals(prodnamealert.getText(), "Product Name is required");
		softassert.assertEquals(prodcodealert.getText(), "Product Code is required");
		softassert.assertEquals(marketalert.getText(), "Market is required");
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form is required");
		softassert.assertEquals(stregnthalert.getText(), "Strength is required");
		softassert.assertEquals(struomalert.getText(), "UOM is required");
		softassert.assertEquals(shelflifealert.getText(), "Shelf Life is required");
		softassert.assertEquals(shelflifeuomalert.getText(), "UOM is required");
		softassert.assertEquals(batchsizealert.getText(), "Batch Size is required");
		softassert.assertEquals(batchuomalert.getText(), "UOM is required");
		softassert.assertEquals(blockalert.getText(), "Block is required");
		softassert.assertEquals(locationalert.getText(), "Location is required");
		// softassert.assertEquals(ispelletsalert.getText(), "Input as Pellets is
		// required");
		softassert.assertEquals(commentsalert.getText(), "Comments is required");
	}

	public void blendinitiationwithoutpellets() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 1; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			javascript(productname);
			productname.sendKeys(excelUtils.getCellData(i, 0));
			productcode(excelUtils.getCellData(i, 1));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			javawait();
			clickElement(ispelletsNo);
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}
	}

	public void blendReinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javascript(productdetails);
		for (int i = 1; i < 2; i++) {
			textbox(search, excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(resubmit);
			softassert.assertEquals(commentsalert.getText(), "Comments is required");
		}
		for (int i = 2; i < 3; i++) {
			if (ispelletsNo.isSelected()) {
				productname.clear();
				productname.sendKeys(excelUtils.getCellData(i, 0));
				market(excelUtils.getCellData(i, 2));
				dosageform(excelUtils.getCellData(i, 3));
				strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
				shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
				batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
//				block1();
//				location1();
				clickElement(ispelletsYes);
				//clickElement(Get);
				//clickElement(refresh);
				javawait();
			for (int j = 1; j < 2; j++) {
				textbox(mprno, excelUtils.getCellData(j, 15));
				clickElement(Get);
				clickElement(delete);
				javawait();
				textbox(mprno, excelUtils.getCellData(j, 15));
				clickElement(Get);
//				clickElement(delete);
//				textbox(mprno, excelUtils.getCellData(i, 15));
//				clickElement(Get);
				//clickElement(productnamepmsel);
			   clickElement(blendpmselect);
				javawait();
//				List<WebElement> blendselect1=driver.findElements(By.xpath("//input[@type='radio']"));
//				int count=blendselect1.size();
//				blendselect1.get(count-1).click();
				comments(excelUtils.getCellData(i, 10));
				clickElement(resubmit);
		}
			}
			else if(ispelletsYes.isSelected()) {
				clickElement(No);
				javascript(productname);
				productname.sendKeys(excelUtils.getCellData(i, 0));
				market(excelUtils.getCellData(i, 2));
				dosageform(excelUtils.getCellData(i, 3));
				strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
				shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
				batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
				block1();
				location1();
				comments(excelUtils.getCellData(i, 10));
				clickElement(resubmit);
			}
		}
	}

	public void blendinitiationwithpellets() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 1; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			javascript(productname);
			productname.sendKeys(excelUtils.getCellData(i, 0));
			productcode(excelUtils.getCellData(i, 1));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			clickElement(ispelletsYes);
//			clickElement(Get);
//			clickElement(refresh);
			javawait();
			textbox(mprno, excelUtils.getCellData(i, 15));
			clickElement(Get);
			clickElement(delete);
			javawait();
			textbox(mprno, excelUtils.getCellData(i, 15));
			clickElement(Get);
			//clickElement(blendpmselect);
//			List<WebElement> blendselect1=driver.findElements(By.xpath("//input[@type='radio']"));
//			int count=blendselect1.size();
//			blendselect1.get(count-1).click();
			clickElement(bulkpmselect3);
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}
		
	}

	public void productdetails() {
		javascript(productdetails);
	}

	public void productname(String name) {

		textboxc(productname, name);
	}

	public void productcode(String code) {
		textbox(productcode, code);
	}

	public void market(String mark) {
		textbox(market, mark);
	}

	public void dosageform(String dosage) {
		textbox(dosageform, dosage);
	}

	public void strength(String str, String struom) {
		textbox(strength, str);
		textbox(strengthuom, struom);
	}

	public void shelflife(String shelf, String uom) {
		textbox(shelflife, shelf);
		textbox(shelflifeuom, uom);
	}

	public void batchsize(String size, String uom) {
		textboxc(batchsize, size);
		textbox(batchsizeuom, uom);
	}

	public void block() {
		clickElement(block);
		clickElement(blocksel);
	}

	public void block1() {
		clickElement(block);
		clickElement(blocksel2);
	}

	public void location() {
		clickElement(location);
		clickElement(locsel);
	}

	public void location1() {
		clickElement(location);
		if (!(locsel2.isSelected()))
			clickElement(locsel2);
	}

	public void comments(String comm) {
	
		clickElement(comments);
		comments.sendKeys(comm);
	}

	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}

	public void submitactivity(String pass) throws InterruptedException, IOException {

		javawait();
		javascript(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("(//input[@placeholder='Password'])[1]"), 5));
//		password.sendKeys(pass);
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		setmpr();
		System.out.println(mpr1);
		javawait();
	}
	public void resubmitactivity(String pass) throws InterruptedException {

		javascript(No);
		clickElement(resubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void resubmitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}

	public void submitactivity2(String pass) throws InterruptedException, IOException {

		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		setmpr();
		System.out.println(mpr1);
		javawait();
	}

	public void bulkproductdetailsalertsvalidate() throws InterruptedException {
		javascript(productdetails);
		javawait();
		clickElement(create);
		clickElement(bulk);
		clickElement(submit);
		softassert.assertEquals(producttype.getText(), "Product Type is required");
		softassert.assertEquals(prodnamealert.getText(), "Product Name is required");
		softassert.assertEquals(prodcodealert.getText(), "Product Code is required");
		softassert.assertEquals(inputblendcode.getText(), "Input Blend Code is required");
		softassert.assertEquals(marketalert.getText(), "Market is required");
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form is required");
		softassert.assertEquals(stregnthalert.getText(), "Strength is required");
		softassert.assertEquals(struomalert.getText(), "UOM is required");
		softassert.assertEquals(shelflifealert.getText(), "Shelf Life is required");
		softassert.assertEquals(shelflifeuomalert.getText(), "UOM is required");
		softassert.assertEquals(batchsizealert.getText(), "Batch Size is required");
		softassert.assertEquals(batchuomalert.getText(), "UOM is required");
		softassert.assertEquals(refbatchsize.getText(), "Ref. Batch Size is required");
		softassert.assertEquals(refbatchsizeuom.getText(), "UOM is required");
		softassert.assertEquals(blockalert.getText(), "Block is required");
		softassert.assertEquals(locationalert.getText(), "Location is required");
		softassert.assertEquals(commentsalert.getText(), "Comments is required");
	}

	public void bulkproductinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 4; i < 5; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			javascript(productname);
			productname.sendKeys(excelUtils.getCellData(i, 0));
			clickElement(producttype);
			producttype.sendKeys("Standard");
			productcode(excelUtils.getCellData(i, 1));
			inputblendcode(excelUtils.getCellData(i, 11));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			refbatchsize(excelUtils.getCellData(i, 12), excelUtils.getCellData(i, 13));
//			javascript(Get);
//			clickElement(refresh);
//			clickElement(Get);
//			clickElement(delete);
			//clickElement(bulkpmselect1);
//			List<WebElement> blendselect1=driver.findElements(By.xpath("//input[@type='radio']"));
//			int count=blendselect1.size();
//			blendselect1.get(count-1).click();
		}
		for (int i = 1; i < 2; i++) {
			scrolldown(Get);
			javawait();
			clickElement(bulkmprno);
			javawait();
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 15),Keys.ENTER);
			javawait();
			clickElement(Get);
			scrolldown(bulkpmselect1);
			implicitwait();
			clickElement(bulkpmselect1);
			clickElement(add);
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 16),Keys.ENTER);
			javawait();
			clickElement(Get);
			javawait();
			javascript(bulkpmselect1);
			clickElement(add);
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}
	}
	public void bulkproductinitiationcommon() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 5; i < 6; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			javascript(productname);
			productname.sendKeys(excelUtils.getCellData(i, 0));
			clickElement(producttype);
			producttype.sendKeys("Common");
			productcode(excelUtils.getCellData(i, 1));
			inputblendcode(excelUtils.getCellData(i, 11));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			refbatchsize(excelUtils.getCellData(i, 12), excelUtils.getCellData(i, 13));
			//javascript(Get);
//			clickElement(refresh);
//			clickElement(Get);
//			clickElement(delete);
//			List<WebElement> blendselect1=driver.findElements(By.xpath("//input[@type='radio']"));
//			int count=blendselect1.size();
//			blendselect1.get(count-1).click();
			Thread.sleep(5000);
		}
		for (int i = 1; i < 2; i++) {
			scrolldown(Get);
			javawait();
			clickElement(bulkmprno);
			javawait();
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 15),Keys.ENTER);
			javawait();
			clickElement(Get);
			scrolldown(bulkpmselect1);
			implicitwait();
			clickElement(bulkpmselect1);
			clickElement(add);
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 16),Keys.ENTER);
			javawait();
			clickElement(Get);
			javawait();
			javascript(bulkpmselect1);
			clickElement(add);
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}
	}

	public void bulkReinitiation() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javascript(productdetails);
		for (int i = 1; i < 2; i++) {
			textbox(search, excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(resubmit);
			softassert.assertEquals(commentsalert.getText(), "Comments is required");
		}
		for (int i = 2; i < 3; i++) {
			javascript(productname);
			javawait();
			productname.clear();
			productname.sendKeys(excelUtils.getCellData(i, 0));
			if (producttype.getText().equalsIgnoreCase("BiLayer")) {
				inputblendcode(excelUtils.getCellData(i, 11));
				market(excelUtils.getCellData(i, 2));
//				dosageform(excelUtils.getCellData(i, 3));
//				strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
//				shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
//				batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
//				block1();
				//javawait();
				//location1();
				clickElement(refbatchsize);
				refbatchsize.clear();
				refbatchsize.sendKeys((excelUtils.getCellData(i, 12)));
//			javawait();
//			clickElement(refbatchsizeuom);
//			refbatchsizeuom.clear();
//			refbatchsizeuom.sendKeys((excelUtils.getCellData(i, 13)));
//				javascript(productnamepm);
//				productcodepm.sendKeys(excelUtils.getCellData(i, 1));
//				clickElement(Get);
//				clickElement(bulkpmselect1);
//				clickElement(add);
//				scrollup(bulkpmselect2);
//				if (bulkpmselect2.isDisplayed())
//					javascript(bulkpmselect2);
//				else
//					throw new RuntimeException("expected webelement is not displyed");
//				clickElement(add);
				comments(excelUtils.getCellData(i, 10));
				clickElement(resubmit);
			} else {
				javascript(productname);
				productname.clear();
				productname.sendKeys(excelUtils.getCellData(i, 0));
				inputblendcode(excelUtils.getCellData(i, 11));
//				market(excelUtils.getCellData(i, 2));
//				dosageform(excelUtils.getCellData(i, 3));
//				strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
//				shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
//				batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
//				block1();
//				javawait();
//				location1();
				clickElement(refbatchsize);
				refbatchsize.clear();
				refbatchsize.sendKeys((excelUtils.getCellData(i, 12)));
				// javawait();
//				clickElement(refbatchsizeuom);
//				refbatchsizeuom.clear();
//				refbatchsizeuom.sendKeys((excelUtils.getCellData(i, 13)));
//				scrolldown(Get);
//				clickElement(Get);
//				clickElement(bulkpmselect1);
				comments(excelUtils.getCellData(i, 10));
				clickElement(resubmit);
			}

		}
	}

	public void bulkbilayerproductinitiation() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 6; i < 7; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			javascript(productname);
			productname.sendKeys(excelUtils.getCellData(i, 0));
			producttype.sendKeys("BiLayer");
			productcode(excelUtils.getCellData(i, 1));
			inputblendcode(excelUtils.getCellData(i, 11));
			market(excelUtils.getCellData(i, 2));
			dosageform(excelUtils.getCellData(i, 3));
			strength(excelUtils.getCellData(i, 4), excelUtils.getCellData(i, 5));
			shelflife(excelUtils.getCellData(i, 6), excelUtils.getCellData(i, 7));
			batchsize(excelUtils.getCellData(i, 8), excelUtils.getCellData(i, 9));
			block();
			location();
			refbatchsize(excelUtils.getCellData(i, 12), excelUtils.getCellData(i, 13));
		}
		for (int i = 1; i < 2; i++) {
			scrolldown(Get);
			javawait();
			clickElement(bulkmprno);
			javawait();
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 15),Keys.ENTER);
			javawait();
			clickElement(Get);
			scrolldown(bulkpmselect1);
			implicitwait();
			clickElement(bulkpmselect1);
			clickElement(add);
			bulkmprnosel.sendKeys(excelUtils.getCellData(i, 16),Keys.ENTER);
			javawait();
			clickElement(Get);
			javawait();
			javascript(bulkpmselect1);
			clickElement(add);
			//clickElement(bulkpmselect2);	
//			List<WebElement> blendselect1=driver.findElements(By.xpath("//input[@type='radio']"));
//			int count=blendselect1.size();
//			blendselect1.get(count-1).click();
//			clickElement(add);
//			scrolldown(Get);
//			clickElement(Get);
//			clickElement(bulkpmselect2);
//			clickElement(add);
//			if (bulkpmselect2.isDisplayed())
//				javascript(bulkpmselect2);
//			else
//				throw new RuntimeException("expected webelement is not displyed");
			comments(excelUtils.getCellData(i, 10));
			clickElement(submit);
		}
	}

	public WebElement getmprno() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
			clickElement(createdrecord);
			String mprno = mpr.getText();
		}
		return mprno;
	}

	public void ispelltsyes() {
		clickElement(ispelletsYes);
	}

	public void ispelltsno() {
		clickElement(ispelletsNo);
	}

	public void isInputsaspellets(String namep, String comm) throws InterruptedException {

		if (ispelletsYes.isSelected()) {

			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(refresh);
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(delete);
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(blendpmselect);
			textbox(comments, comm);
			clickElement(submit);

		} else {

			textbox(comments, comm);
			javawait();
			clickElement(submit);
		}
	}

	public void producttype(String prodtype) {
		textbox(producttype, prodtype);
	}
	public void productcodepm(String prodcode) {
		textbox(productcodepm, prodcode);
	}

	public void inputblendcode(String blendcode) {
		textboxc(inputblendcode, blendcode);
	}

	public void bulkmarket(String mark) {
		textbox(marketp, mark);
	}

	public void refbatchsize(String refsize, String uom) {
		textbox(refbatchsize, refsize);
		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textbox(refbatchsizeuom, uom);
	}

	public void blenddetails(String namep, String comm) throws InterruptedException {

		if (producttype.getText().equals("Bilayer")) {
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(refresh);
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(delete);
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(bulkpmselect1);
			clickElement(add);
			clickElement(bulkpmselect2);
			clickElement(add);
			textbox(comments, comm);
			clickElement(submit);

		} else {
			textbox(productcodepm, namep);
			clickElement(Get);
			clickElement(blendpmselect);
			textbox(comments, comm);
			clickElement(submit);
		}
	}

	public void search() {

		String mpr = mprpath.getText();
		textbox(search, mpr);
	}

	public void close() {
		clickElement(close);
	}

	public void createrecord() {
		clickElement(createdrecord);
	}
}
