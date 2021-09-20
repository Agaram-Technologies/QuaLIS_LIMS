package MyJobs;

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
import JobAllocation.ElementJobAllocationMalaviInstrument;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class MyJobs extends BrowserOperation{
	
	
	public static void accept(String registrationSubType, String ARNumber) throws InterruptedException, AWTException
	{
		
	String registrationType=RegistrationDetail.registrationType(registrationSubType);
	
	PageFactory.initElements(driver, ElementMyJobs.class);

	ElementMyJobs.transactionIcon.click();
	
	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.myJobsIcon.click();

	ElementMyJobs.advancedFilterHomeIcon.click();

	ElementMyJobs.advancedFilterIcon.click();

	WebElement filterSampleType = ElementMyJobs.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ElementMyJobs.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	WebElement filterSubType = ElementMyJobs.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ElementMyJobs.filterCheckbox.click();

	WebElement filterStatusElement = ElementMyJobs.filterStatus;

	Select filterStatusElementSelect = new Select(filterStatusElement);

	filterStatusElementSelect.selectByVisibleText("Allotted");

	ElementMyJobs.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));

	List<WebElement> ARNumberList = ElementMyJobs.ARNumberList;

	List<WebElement> checkBoxList = ElementMyJobs.checkBoxList;
	
	
	
	try {
		
		checkBoxList.get(0).click();
		
		System.out.println(checkBoxList.size());
		
		System.out.println(	ARNumberList.get(0).getText());
		
		System.out.println("A");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
/*
	for (WebElement ch : checkBoxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}*/

	
	
	for (WebElement ARNum : ARNumberList)
	{
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);
			
			ARNum.click();
			
			Thread.sleep(2000);

			/*String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) 
			{
				ARNum.click();
			}*/
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));
	
	
	

	

	ElementMyJobs.sampleIcon.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));

	ElementMyJobs.testIcon.click();
	
	
	
																				
	
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_mjt_DynamicData\"]/div/div[2]"));

	
	System.out.println(testCheckboxList.size());
	
	testCheckboxList.get(0).click();
	
	

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
		

		wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.myJobsAction));

		wait11.until(
				ExpectedConditions.elementToBeClickable(ElementMyJobs.myJobsAction));

		
		
		
		
		
		
		Robot r=new Robot();
		
		for(int i=0; i<10;i++)
		{

			r.keyPress(KeyEvent.VK_PAGE_UP);
			
			r.keyRelease(KeyEvent.VK_PAGE_UP);
			
		}
		
		
		

	try {
		ElementMyJobs.myJobsAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementMyJobs.myJobsAction.click();
	}

	ElementMyJobs.testAccept.click();

	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.transactionIcon.click();

}
	
	
	
	
	
	

	public static void acceptAll(String registrationSubType, String ARNumber) throws InterruptedException, AWTException
	{
		
	String registrationType=RegistrationDetail.registrationType(registrationSubType);
	
	PageFactory.initElements(driver, ElementMyJobs.class);

	ElementMyJobs.transactionIcon.click();
	
	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.myJobsIcon.click();

	ElementMyJobs.advancedFilterHomeIcon.click();

	ElementMyJobs.advancedFilterIcon.click();

	WebElement filterSampleType = ElementMyJobs.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ElementMyJobs.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	WebElement filterSubType = ElementMyJobs.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ElementMyJobs.filterCheckbox.click();

	WebElement filterStatusElement = ElementMyJobs.filterStatus;

	Select filterStatusElementSelect = new Select(filterStatusElement);

	filterStatusElementSelect.selectByVisibleText("Allotted");

	ElementMyJobs.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));

	List<WebElement> ARNumberList = ElementMyJobs.ARNumberList;

	List<WebElement> checkBoxList = ElementMyJobs.checkBoxList;
	
	
	try {
		
		checkBoxList.get(0).click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
/*
	for (WebElement ch : checkBoxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}*/

	
	
	for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));
	
	
	

	

	ElementMyJobs.sampleIcon.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));

	ElementMyJobs.testIcon.click();
	
	
	
	
	
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_mjt_DynamicData\"]/div/div[2]"));

	testCheckboxList.get(0).click();
	
	

	//	List<WebElement> testCheckboxList = ElementJobAllocationJobAllocationForensic.testCheckboxList;

		for (WebElement ch : testCheckboxList) {

			ch.click();

			
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
		

		wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.myJobsAction));

		wait11.until(
				ExpectedConditions.elementToBeClickable(ElementMyJobs.myJobsAction));

		
		
		
		
		
		
		Robot r=new Robot();
		
		for(int i=0; i<10;i++)
		{

			r.keyPress(KeyEvent.VK_PAGE_UP);
			
			r.keyRelease(KeyEvent.VK_PAGE_UP);
			
		}
		
		
		

	try {
		ElementMyJobs.myJobsAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementMyJobs.myJobsAction.click();
	}

	ElementMyJobs.testAccept.click();

	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.transactionIcon.click();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void accept_Attachment_Comment(String registrationSubType, String ARNumber, String file) throws InterruptedException, AWTException
	{
		
	String registrationType=RegistrationDetail.registrationType(registrationSubType);
	
	PageFactory.initElements(driver, ElementMyJobs.class);

	ElementMyJobs.transactionIcon.click();

	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.myJobsIcon.click();

	ElementMyJobs.advancedFilterHomeIcon.click();

	ElementMyJobs.advancedFilterIcon.click();

	WebElement filterSampleType = ElementMyJobs.filterSampleType;

	Select filterSampleTypeSelect = new Select(filterSampleType);

	filterSampleTypeSelect.selectByVisibleText("Product");

	WebElement filterRegistrationType = ElementMyJobs.filterRegistrationType;

	Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

	filterRegistrationTypeSelect.selectByVisibleText(registrationType);

	WebElement filterSubType = ElementMyJobs.filterSubType;

	Select filterSubTypeSelect = new Select(filterSubType);

	filterSubTypeSelect.selectByVisibleText(registrationSubType);

	ElementMyJobs.filterCheckbox.click();

	WebElement filterStatusElement = ElementMyJobs.filterStatus;

	Select filterStatusElementSelect = new Select(filterStatusElement);

	filterStatusElementSelect.selectByVisibleText("Allotted");

	ElementMyJobs.filterFindRecord.click();

	WebDriverWait wait11 = new WebDriverWait(driver, 10);

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));

	List<WebElement> ARNumberList = ElementMyJobs.ARNumberList;

	List<WebElement> checkBoxList = ElementMyJobs.checkBoxList;
	
	
	try {
		
		checkBoxList.get(0).click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
/*
	for (WebElement ch : checkBoxList) {

		String ii = ch.getAttribute("checkboxselect");

		if (ii.equals("0")) {
			ch.click();
		}
	}*/

	
	
	for (WebElement ARNum : ARNumberList) {
		if (ARNum.getText().equals(ARNumber)) {
			int i = ARNumberList.indexOf(ARNum);

			String ii = checkBoxList.get(i).getAttribute("checkboxselect");

			if (ii.equals("0")) {
				ARNum.click();
			}
		}
	}

	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.advancedFilterIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.advancedFilterIcon));
	
	

	String[] data= {"My Jobs",file, "Des"};
	
	Transaction_Attachment.attachmentAdd(ElementMyJobs.sampleTypeAttachment(), data);
	
	Transaction_Comments.commentsAdd(ElementMyJobs.sampleTypeComments(), data);
	
		
	
	BasicOperation.exception(ElementMyJobs.sampleIcon);
	
	wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.sampleAttachmentIcon));

	wait11.until(ExpectedConditions.elementToBeClickable(ElementMyJobs.sampleAttachmentIcon));
	
	
	Transaction_Attachment.attachmentAdd(ElementMyJobs.sampleAttachment(), data);
	
	Transaction_Comments.commentsAdd(ElementMyJobs.sampleComments(), data);
	

	ElementMyJobs.testIcon.click();
	
	
	
	
	
	List<WebElement> testCheckboxList=driver.findElements(By.xpath("//*[@id=\"ID_mjt_DynamicData\"]/div/div[2]"));

	

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
		

		wait11.until(ExpectedConditions.visibilityOf(ElementMyJobs.myJobsAction));

		wait11.until(
				ExpectedConditions.elementToBeClickable(ElementMyJobs.myJobsAction));

		
		
		
		
		
		
		Robot r=new Robot();
		
		for(int i=0; i<10;i++)
		{

			r.keyPress(KeyEvent.VK_PAGE_UP);
			
			r.keyRelease(KeyEvent.VK_PAGE_UP);
			
		}
		
		
		

	try {
		ElementMyJobs.myJobsAction.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementMyJobs.myJobsAction.click();
	}

	ElementMyJobs.testAccept.click();
	
Transaction_Attachment.attachmentAdd(ElementMyJobs.testAttachment(), data);
	
	Transaction_Comments.commentsAdd(ElementMyJobs.testComments(), data);
		
	
	ElementMyJobs.jobAllocationIcon.click();

	ElementMyJobs.transactionIcon.click();

}
}