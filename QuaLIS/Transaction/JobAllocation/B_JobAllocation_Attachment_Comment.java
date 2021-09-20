package JobAllocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Transaction_Attachment;
import BasicFunction.Transaction_Comments;
import Config.RegistrationDetail;
import GenericRegistration.ElementGenericRegistration;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class B_JobAllocation_Attachment_Comment extends BrowserOperation{
	
	
	public static void receivedInLabAssignJob(String registrationSubType,String ARNumber, String instrumentCategoty, String certifiedAnalyst, String file) throws InterruptedException
	{
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
		PageFactory.initElements(driver, ElementJobAllocationMalaviInstrument.class);
		
		ElementJobAllocationMalaviInstrument.transactionIcon.click();
		
		ElementJobAllocationMalaviInstrument.jobAllocationIcon.click();
		
		ElementJobAllocationMalaviInstrument.jobJobAllocaitonIcon.click();
		
		ElementJobAllocationMalaviInstrument.advancedFilterHomeIcon.click();
		
		ElementJobAllocationMalaviInstrument.advancedFilterIcon.click();
		
		
		WebElement filterSampleType = ElementJobAllocationMalaviInstrument.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementJobAllocationMalaviInstrument.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementJobAllocationMalaviInstrument.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);	
	 
	
		ElementJobAllocationMalaviInstrument.filterCheckbox.click();
		
					
		WebElement filterSampleStatus1 = ElementJobAllocationMalaviInstrument.filterSampleStatus;

		Select filterSampleStatus1Select = new Select(filterSampleStatus1);

		filterSampleStatus1Select.selectByVisibleText("Registered");
		
		ElementJobAllocationMalaviInstrument.filterFindRecord.click();
		

		WebDriverWait wait11= new WebDriverWait(driver,10);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAction));	
			
		try {
			ElementJobAllocationMalaviInstrument.jobAllocationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementJobAllocationMalaviInstrument.jobAllocationAction.click();

		}
		
		ElementJobAllocationMalaviInstrument.jobAllocaitonReceivedInLab.click();
		
		BasicOperation.wait(ElementJobAllocationMalaviInstrument.jobAllocationAction);
		
		String[] data= {"Job Allocation",file, "Des"};
		
		Transaction_Attachment.attachmentAdd(ElementJobAllocationMalaviInstrument.sampleTypeAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementJobAllocationMalaviInstrument.sampleTypeComments(), data);
		
		
		
		
		ElementJobAllocationMalaviInstrument.sampleIcon.click();
		
		BasicOperation.wait(ElementJobAllocationMalaviInstrument.advancedFilterIcon);
		
		
		Transaction_Attachment.attachmentAdd(ElementJobAllocationMalaviInstrument.sampleAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementJobAllocationMalaviInstrument.sampleComments(), data);
		
	
		
		
		
		
		
		
		
		ElementJobAllocationMalaviInstrument.testIcon.click();
		

		BasicOperation.exception(ElementJobAllocationMalaviInstrument.testSubTabIcon);
		
		BasicOperation.exception(ElementJobAllocationMalaviInstrument.jobAllocationAction);
	
		ElementJobAllocationMalaviInstrument.testAssignJob.click();
		
		WebElement certifiedAnalystElement= ElementJobAllocationMalaviInstrument.testAssignJobCertifiedAnalyst;
		
		Select certifiedAnalystElementSelect=new Select(certifiedAnalystElement);
		
		certifiedAnalystElementSelect.selectByVisibleText(certifiedAnalyst);
		
		
		ElementJobAllocationMalaviInstrument.testAssignJobSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAction));	
		
		Transaction_Attachment.attachmentAdd(ElementJobAllocationMalaviInstrument.testAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementJobAllocationMalaviInstrument.testComments(), data);
		
	
		
		
		
	
		
		ElementJobAllocationMalaviInstrument.jobAllocationIcon.click();
		
		ElementJobAllocationMalaviInstrument.transactionIcon.click();
	
	

}
	

	public static void retestAssignJob(String registrationSubType,String ARNumber, String instrumentCategoty, String certifiedAnalyst) throws InterruptedException
	{
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
		PageFactory.initElements(driver, ElementJobAllocationMalaviInstrument.class);
		
		ElementJobAllocationMalaviInstrument.transactionIcon.click();
		
		ElementJobAllocationMalaviInstrument.jobAllocationIcon.click();
		
		ElementJobAllocationMalaviInstrument.jobJobAllocaitonIcon.click();
		
		ElementJobAllocationMalaviInstrument.advancedFilterHomeIcon.click();
		
		ElementJobAllocationMalaviInstrument.advancedFilterIcon.click();
		
		
		WebElement filterSampleType = ElementJobAllocationMalaviInstrument.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementJobAllocationMalaviInstrument.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterSubType = ElementJobAllocationMalaviInstrument.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);	
	 
	
		ElementJobAllocationMalaviInstrument.filterCheckbox.click();
		
					
		WebElement filterSampleStatus1 = ElementJobAllocationMalaviInstrument.filterSampleStatus;

		Select filterSampleStatus1Select = new Select(filterSampleStatus1);

		filterSampleStatus1Select.selectByVisibleText("Received in Lab");
		
		ElementJobAllocationMalaviInstrument.filterFindRecord.click();
		

		WebDriverWait wait11= new WebDriverWait(driver,10);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAction));	
			
			
		ElementJobAllocationMalaviInstrument.sampleIcon.click();
		

		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAdvancedFilterView));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAdvancedFilterView));	
	
		
		ElementJobAllocationMalaviInstrument.testIcon.click();
		

		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAction));	
		
		try {
			ElementJobAllocationMalaviInstrument.jobAllocationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementJobAllocationMalaviInstrument.jobAllocationAction.click();

		}
	
		ElementJobAllocationMalaviInstrument.testAssignJob.click();
		
		WebElement certifiedAnalystElement= ElementJobAllocationMalaviInstrument.testAssignJobCertifiedAnalyst;
		
		Select certifiedAnalystElementSelect=new Select(certifiedAnalystElement);
		
		certifiedAnalystElementSelect.selectByVisibleText(certifiedAnalyst);
		
		
		ElementJobAllocationMalaviInstrument.testAssignJobSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementJobAllocationMalaviInstrument.jobAllocationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementJobAllocationMalaviInstrument.jobAllocationAction));	
		
		
		
		ElementJobAllocationMalaviInstrument.jobAllocationIcon.click();
		
		ElementJobAllocationMalaviInstrument.transactionIcon.click();
	
	

}






















}
