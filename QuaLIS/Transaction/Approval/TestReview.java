package Approval;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.ApprovalStatus;
import Config.RegistrationDetail;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestReview extends BrowserOperation{
	
	public static void approvalReview(String registrationSubType, String ARNumber) throws InterruptedException, IOException {
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		PageFactory.initElements(driver, ElementApproval.class);

		ElementApproval.transactionIcon.click();

		ElementApproval.approvalIcon.click();

		ElementApproval.approvalApprovalIcon.click();

		Thread.sleep(2000);

		ElementApproval.advancedFilterHomeIcon.click();

		Thread.sleep(2000);

		ElementApproval.filterIcon.click();

		WebElement filterSampleType = ElementApproval.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementApproval.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementApproval.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementApproval.filterStatusCheckbox.click();

		WebElement filterFilterStatus = ElementApproval.filterFilterStatus;

		Select filterFilterStatusSelect = new Select(filterFilterStatus);

		filterFilterStatusSelect.selectByVisibleText("Completed");

		ElementApproval.filterFindRecord.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));

		List<WebElement> ARNumberList = ElementApproval.ARNumberList;

		List<WebElement> checkBoxList = ElementApproval.checkBoxList;

		for (WebElement ch : checkBoxList) {

			String ii = ch.getAttribute("checkboxselect");

			if (ii.equals("1")) {
				ch.click();
			}
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

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));
		
		Thread.sleep(2000);

		ElementApproval.sampleIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		ElementApproval.testIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testAction));

		try {
			ElementApproval.testAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApproval.testAction.click();
		}

		try {
			ElementApproval.approvalReview.click();
			
		} catch (Exception e) {
			
			ElementApproval.testAction.click();
			
			ElementApproval.approvalReview.click();
			// TODO: handle exception
		}
		

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		ElementApproval.approvalApprovalIcon.click();

		ElementApproval.transactionIcon.click();

	}
	
	public static void approval(String registrationSubType,String ARNumber, String approvalStatus) throws InterruptedException, IOException {
		
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
		
		String filterTestStatus="";
		
		if(approvalStatus.equals(ApprovalStatus.review)||approvalStatus.equals(ApprovalStatus.Recalc)||approvalStatus.equals(ApprovalStatus.Retest))
		{
			filterTestStatus="Completed";
		}
		else if(approvalStatus.equals(ApprovalStatus.approve))
		{
			filterTestStatus="Reviewed";
		}
		
		

		PageFactory.initElements(driver, ElementApproval.class);

		ElementApproval.transactionIcon.click();

		ElementApproval.approvalIcon.click();

		ElementApproval.approvalApprovalIcon.click();

		Thread.sleep(2000);

		ElementApproval.advancedFilterHomeIcon.click();

		Thread.sleep(2000);

		ElementApproval.filterIcon.click();

		WebElement filterSampleType = ElementApproval.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementApproval.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementApproval.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementApproval.filterStatusCheckbox.click();

		WebElement filterFilterStatus = ElementApproval.filterFilterStatus;

		Select filterFilterStatusSelect = new Select(filterFilterStatus);

		filterFilterStatusSelect.selectByVisibleText(filterTestStatus);

		ElementApproval.filterFindRecord.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));

		List<WebElement> ARNumberList = ElementApproval.ARNumberList;

		List<WebElement> checkBoxList = ElementApproval.checkBoxList;

		for (WebElement ch : checkBoxList) {

			String ii = ch.getAttribute("checkboxselect");

			if (ii.equals("1")) {
				ch.click();
			}
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

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));
		
		Thread.sleep(1000);

		ElementApproval.sampleIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));
		
		Thread.sleep(1000);

		ElementApproval.testIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		try {
			ElementApproval.testAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApproval.testAction.click();
		}
		
		
		if(approvalStatus.equals(ApprovalStatus.approve))
		{
			
			
			try {
				ElementApproval.approvalApprove.click();
			} catch (Exception e) {
				
				Thread.sleep(2000);

				ElementApproval.testAction.click();
				
				ElementApproval.approvalApprove.click();
			}
		}
		else if(approvalStatus.equals(ApprovalStatus.review))
		{

			
			try {
				ElementApproval.approvalReview.click();
			} catch (Exception e) {
				
				Thread.sleep(2000);

				ElementApproval.testAction.click();
				
				ElementApproval.approvalReview.click();
			}
		}
		
		else if (approvalStatus.equals(ApprovalStatus.Recalc)) {
					
			try {
				ElementApproval.Recalc.click();
			} catch (Exception e) {
				
				Thread.sleep(2000);

				ElementApproval.testAction.click();
				
				ElementApproval.Recalc.click();
			}
		}

		else if (approvalStatus.equals(ApprovalStatus.Retest)) {
			
			try {
				ElementApproval.Retest.click();
			} catch (Exception e) {
				
				Thread.sleep(2000);

				ElementApproval.testAction.click();
				
				ElementApproval.Retest.click();
			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		ElementApproval.approvalApprovalIcon.click();

		ElementApproval.transactionIcon.click();

	}

	public static void approvalRelease(String registrationSubType,String ARNumber) throws InterruptedException {
		

		String registrationType=RegistrationDetail.registrationType(registrationSubType);

		PageFactory.initElements(driver, ElementApproval.class);

		ElementApproval.transactionIcon.click();

		ElementApproval.approvalIcon.click();

		ElementApproval.approvalApprovalIcon.click();

		Thread.sleep(2000);

		ElementApproval.advancedFilterHomeIcon.click();

		Thread.sleep(2000);

		ElementApproval.filterIcon.click();

		WebElement filterSampleType = ElementApproval.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementApproval.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementApproval.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementApproval.filterStatusCheckbox.click();

		WebElement filterFilterStatus = ElementApproval.filterFilterStatus;

		Select filterFilterStatusSelect = new Select(filterFilterStatus);

		filterFilterStatusSelect.selectByVisibleText("Approved");

		ElementApproval.filterFindRecord.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 10);

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.sampleTypeAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.sampleTypeAction));

		
		List<WebElement> ARNumberList = ElementApproval.ARNumberList;

		List<WebElement> checkBoxList = ElementApproval.checkBoxList;

		for (WebElement ch : checkBoxList) {

			String ii = ch.getAttribute("checkboxselect");

			if (ii.equals("1")) {
				ch.click();
			}
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

		try {

			ElementApproval.sampleTypeAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementApproval.sampleTypeAction.click();
		}

		ElementApproval.approvalRelease.click();

		BasicOperation.esign("approved");
		
		ElementApproval.sectionSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.sampleTypeAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.sampleTypeAction));

		ElementApproval.approvalIcon.click();

		ElementApproval.transactionIcon.click();
		
		
		
		

	}
	
public static void approvalRecalc(String registrationSubType, String ARNumber) throws InterruptedException, IOException {
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		PageFactory.initElements(driver, ElementApproval.class);

		ElementApproval.transactionIcon.click();

		ElementApproval.approvalIcon.click();

		ElementApproval.approvalApprovalIcon.click();

		Thread.sleep(2000);

		ElementApproval.advancedFilterHomeIcon.click();

		Thread.sleep(2000);

		ElementApproval.filterIcon.click();

		WebElement filterSampleType = ElementApproval.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementApproval.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementApproval.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementApproval.filterStatusCheckbox.click();

		WebElement filterFilterStatus = ElementApproval.filterFilterStatus;

		Select filterFilterStatusSelect = new Select(filterFilterStatus);

		filterFilterStatusSelect.selectByVisibleText("Completed");

		ElementApproval.filterFindRecord.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));

		List<WebElement> ARNumberList = ElementApproval.ARNumberList;

		List<WebElement> checkBoxList = ElementApproval.checkBoxList;

		for (WebElement ch : checkBoxList) {

			String ii = ch.getAttribute("checkboxselect");

			if (ii.equals("1")) {
				ch.click();
			}
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

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.filterIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.filterIcon));

		ElementApproval.sampleIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		ElementApproval.testIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testAction));

		try {
			ElementApproval.testAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApproval.testAction.click();
		}

		ElementApproval.Recalc.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApproval.testIcon));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApproval.testIcon));

		ElementApproval.approvalApprovalIcon.click();

		ElementApproval.transactionIcon.click();

	}

}
