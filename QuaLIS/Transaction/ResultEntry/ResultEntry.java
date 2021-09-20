package ResultEntry;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Transaction_Attachment;
import BasicFunction.Transaction_Comments;
import Config.RegistrationDetail;
import MyJobs.ElementMyJobs;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class ResultEntry extends BrowserOperation{
	
	public static void resultEntry(String registrationSubType, String ARNumber) throws InterruptedException, AWTException
	{
		
	String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
	
	
	PageFactory.initElements(driver, ResultEntryBySample.class);

	ResultEntryBySample.transactionIcon.click();

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.resultEntryBySampleIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.advancedFilterHomeIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.filterIcon.click();

	WebElement filterSampleType = ResultEntryBySample.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ResultEntryBySample.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	
	WebElement filterSubType = ResultEntryBySample.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ResultEntryBySample.filterCheckbox.click();

	WebElement filterStatus = ResultEntryBySample.filterStatus;

	Select filterStatusSelect = new Select(filterStatus);

	filterStatusSelect.selectByVisibleText("Accepted");

	ResultEntryBySample.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	List<WebElement> ARNumberList = ResultEntryBySample.ARNumberList;

	
	List<WebElement> checkBoxList = ResultEntryBySample.checkBoxList;

try {
		
		checkBoxList.get(0).click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	ResultEntryBySample.sampleIcon.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.filterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.filterIcon));

	ResultEntryBySample.testIcon.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	
	/*
	
	
	
	for(WebElement d:testCheckboxList)
	{
		String ii = d.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			d.click();
		}
	}
	*/
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_RBS_ResultEntryTestgetdiv\"]/div/div[2]"));

	

//	List<WebElement> testCheckboxList = ElementJobAllocationJobAllocationForensic.testCheckboxList;

	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			ch.click();
		}
	}
	
	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}
	
	

	/*		for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}
	*/
	

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(
			ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	
	
	
	
	
	
	Robot r=new Robot();
	
	for(int i=0; i<10;i++)
	{

		r.keyPress(KeyEvent.VK_PAGE_UP);
		
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}
	
	
	
	
	
	/*

	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}

	ResultEntryBySample.testInitiate.click();

	ResultEntryBySample.testInitiateComments.sendKeys("Initiated");

	ResultEntryBySample.testInitiateSubmit.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();

	}

	ResultEntryBySample.result.click();

	try {
		ResultEntryBySample.resultValue.click();

		
	} catch (Exception e) {
		Thread.sleep(3000);

		ResultEntryBySample.resultValue.click();

		// ResultEntryBySample.resultValue.sendKeys("100");
	}
	
	ResultEntryBySample.resultValue.sendKeys("100");

	ResultEntryBySample.resultSave.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));
	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}

	ResultEntryBySample.complete.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.transactionIcon.click();*/

}
	
	
	
	
	public static void recalc(String registrationSubType, String ARNumber) throws InterruptedException, AWTException
	{
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
	
	
	PageFactory.initElements(driver, ResultEntryBySample.class);

	ResultEntryBySample.transactionIcon.click();

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.resultEntryBySampleIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.advancedFilterHomeIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.filterIcon.click();

	WebElement filterSampleType = ResultEntryBySample.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ResultEntryBySample.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	
	WebElement filterSubType = ResultEntryBySample.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ResultEntryBySample.filterCheckbox.click();

	WebElement filterStatus = ResultEntryBySample.filterStatus;

	Select filterStatusSelect = new Select(filterStatus);

	filterStatusSelect.selectByVisibleText("ReCalc");

	ResultEntryBySample.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	List<WebElement> ARNumberList = ResultEntryBySample.ARNumberList;

	
	List<WebElement> checkBoxList = ResultEntryBySample.checkBoxList;

try {
		
		checkBoxList.get(0).click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	ResultEntryBySample.sampleIcon.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.filterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.filterIcon));

	ResultEntryBySample.testIcon.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	
	/*
	
	
	
	for(WebElement d:testCheckboxList)
	{
		String ii = d.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			d.click();
		}
	}
	*/
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_RBS_ResultEntryTestgetdiv\"]/div/div[2]"));

	

//	List<WebElement> testCheckboxList = ElementJobAllocationJobAllocationForensic.testCheckboxList;

	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			ch.click();
		}
	}
	
	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}
	
	

	/*		for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}
	*/
	

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(
			ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	
	
	
	
	
	
	Robot r=new Robot();
	
	for(int i=0; i<10;i++)
	{

		r.keyPress(KeyEvent.VK_PAGE_UP);
		
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}
	
	
	
	
	
	

	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}



	ResultEntryBySample.result.click();

	try {
		ResultEntryBySample.resultValue.click();

		
	} catch (Exception e) {
		Thread.sleep(3000);

		ResultEntryBySample.resultValue.click();

		// ResultEntryBySample.resultValue.sendKeys("100");
	}
	
	ResultEntryBySample.resultValue.sendKeys("200");

	ResultEntryBySample.resultSave.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));
	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}

	ResultEntryBySample.complete.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.transactionIcon.click();

}

	
	public static void resultEntryAttachmentComment(String registrationSubType, String file, String sampleTestComments,String ARNumber) throws InterruptedException, AWTException
	{
		
	String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
	
	
	PageFactory.initElements(driver, ResultEntryBySample.class);

	ResultEntryBySample.transactionIcon.click();

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.resultEntryBySampleIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.advancedFilterHomeIcon.click();

	Thread.sleep(2000);

	ResultEntryBySample.filterIcon.click();

	WebElement filterSampleType = ResultEntryBySample.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ResultEntryBySample.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	
	WebElement filterSubType = ResultEntryBySample.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ResultEntryBySample.filterCheckbox.click();

	WebElement filterStatus = ResultEntryBySample.filterStatus;

	Select filterStatusSelect = new Select(filterStatus);

	filterStatusSelect.selectByVisibleText("Accepted");

	ResultEntryBySample.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	List<WebElement> ARNumberList = ResultEntryBySample.ARNumberList;

	
	List<WebElement> checkBoxList = ResultEntryBySample.checkBoxList;

try {
		
		checkBoxList.get(0).click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));
	
	
	

	String[] data= {"Result Entry By Sample",file, "Des"};
	
	Transaction_Attachment.attachmentAdd(ResultEntryBySample.sampleTypeAttachment(), data);
	
	Transaction_Comments.commentsAdd(ResultEntryBySample.sampleTypeComments(), data);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	ResultEntryBySample.sampleIcon.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.filterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.filterIcon));
	
	

	Transaction_Attachment.attachmentAdd(ResultEntryBySample.sampleAttachment(), data);
	
	Transaction_Comments.commentsAdd(ResultEntryBySample.sampleComments(), data);
	
	

	ResultEntryBySample.testIcon.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));
	
	
	Transaction_Attachment.attachmentAdd(ResultEntryBySample.testAttachment(), data);
	
	Transaction_Comments.commentsAdd(ResultEntryBySample.testComments(), data);

	BasicOperation.exception(ResultEntryBySample.testTaskIcon);
	
	BasicOperation.wait(ResultEntryBySample.testTaskAction);
	
	BasicOperation.exception(ResultEntryBySample.testTaskAction);
	
	ResultEntryBySample.testTaskAdd.click();
	
	BasicOperation.exception(ResultEntryBySample.testTaskPreAnalysisTime);
	
	ResultEntryBySample.testTaskPreAnalysisTime.sendKeys("100");
	
	ResultEntryBySample.testTaskPreparationTime.sendKeys("200");
	
	ResultEntryBySample.testTaskAnalysisTime.sendKeys("300");
	
	ResultEntryBySample.testTaskMiscellenceTime.sendKeys("400");
	
	ResultEntryBySample.testTaskComments.sendKeys("Task Initiated");
	
	ResultEntryBySample.testTaskAddSubmit.click();
	
	BasicOperation.wait(ResultEntryBySample.testTaskAction);
	
	BasicOperation.exception(ResultEntryBySample.testIcon);
	
	BasicOperation.wait(ResultEntryBySample.resultEntryBySampleAction);
	
	
	/*
	
	
	
	for(WebElement d:testCheckboxList)
	{
		String ii = d.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			d.click();
		}
	}
	*/
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_RBS_ResultEntryTestgetdiv\"]/div/div[2]"));

	

//	List<WebElement> testCheckboxList = ElementJobAllocationJobAllocationForensic.testCheckboxList;

	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("1")) {
			ch.click();
		}
	}
	
	for (WebElement ch : testCheckboxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}
	
	

	/*		for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}
	*/
	

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(
			ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	
	
	
	
	
	
	Robot r=new Robot();
	
	for(int i=0; i<10;i++)
	{

		r.keyPress(KeyEvent.VK_PAGE_UP);
		
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}
	
	
	
	
	
	

	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}

	ResultEntryBySample.testInitiate.click();

	ResultEntryBySample.testInitiateComments.sendKeys("Initiated");

	ResultEntryBySample.testInitiateSubmit.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();

	}

	ResultEntryBySample.result.click();

	try {
		ResultEntryBySample.resultValue.click();

		
	} catch (Exception e) {
		Thread.sleep(3000);

		ResultEntryBySample.resultValue.click();

		// ResultEntryBySample.resultValue.sendKeys("100");
	}
	
	ResultEntryBySample.resultValue.sendKeys("100");

	ResultEntryBySample.resultSave.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));
	try {
		ResultEntryBySample.resultEntryBySampleAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ResultEntryBySample.resultEntryBySampleAction.click();
	}

	ResultEntryBySample.complete.click();

	wait11.until(ExpectedConditions.visibilityOf(ResultEntryBySample.resultEntryBySampleAction));

	wait11.until(ExpectedConditions.elementToBeClickable(ResultEntryBySample.resultEntryBySampleAction));

	ResultEntryBySample.resultEntryIcon.click();

	ResultEntryBySample.transactionIcon.click();

}
}