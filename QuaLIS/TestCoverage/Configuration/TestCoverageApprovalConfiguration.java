package Configuration;

import java.io.IOException;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.RegistrationDetail;
import Utility.BrowserOperation;

public class TestCoverageApprovalConfiguration extends BrowserOperation
{
	
	
	
	public static void hylands(boolean autoJobAllot) throws InterruptedException
	{
		
		
		
		
		if(autoJobAllot==true)
		{
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.purifiedWater, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.rawMaterial, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.intermediate, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.bulkProduct, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.finishedGoods, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.externallyManufactured, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.stabilityStudies, true, false, "a", "a", "a");
		}
		else
		{
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.purifiedWater, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.rawMaterial, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.intermediate, false, false, "a", "a", "a");
		
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.bulkProduct, false, false, "a", "a", "a");

			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.finishedGoods, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.externallyManufactured, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.stabilityStudies, false, false, "a", "a", "a");
	
		
		}
		
	}
	/*	public static void domnica(boolean autoJobAllot) throws InterruptedException
	{
		
		
		
		
		if(autoJobAllot==true)
		{
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail., true, false, "a", "a", "a");
			
			}
		else
		{
				
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.dominica, false, false, "a", "a", "a");
	
		
		}
		
	}
	
		*/

	/*public static void JPDC(boolean autoJobAllot) throws InterruptedException
	{
		
	
		if(autoJobAllot==true)
		{
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.requestType, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.claimTest, true, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.specialTest, true, false, "a", "a", "a");
			
		}
		else
		{
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.requestType, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.claimTest, false, false, "a", "a", "a");
			
			TestCoverageApprovalConfiguration.registrationType(RegistrationDetail.specialTest, false, false, "a", "a", "a");
			
	
		}
		
	}*/
	
	
	
	public static void registrationType(String registrationType, boolean autoJobAllocation, boolean autoComplete, String filterStatus, String validationStatus, String approvalStatus ) throws InterruptedException {

		String registrationSubType=RegistrationDetail.registrationType(registrationType);
		
		String dropValue="";
		
		if(registrationType.equals(RegistrationDetail.purifiedWater))
		{
			dropValue="20";
		}
		else if (registrationType.equals(RegistrationDetail.rawMaterial)) {
			dropValue="21";
		}
		
		else if (registrationType.equals(RegistrationDetail.intermediate)) {
			dropValue="22";
		}
		
		else if (registrationType.equals(RegistrationDetail.bulkProduct)) {
			dropValue="23";
		}
		
		else if (registrationType.equals(RegistrationDetail.finishedGoods)) {
			dropValue="24";
		}
		
		else if (registrationType.equals(RegistrationDetail.stabilityStudies)) {
			dropValue="25";
		}
		
		else if (registrationType.equals(RegistrationDetail.externallyManufactured)) {
			dropValue="26";
		}
		
		
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);

		ElementApprovalConfiguration.masterIcon.click();

		ElementApprovalConfiguration.configurationIcon.click();

		PageFactory.initElements(driver, ElementUserRoleTemplate.class);

		ElementUserRoleTemplate.userRoleTemplateIcon.click();

		ElementApprovalConfiguration.approvalConfigurationIcon.click();

		WebElement approvalConfigurationFilterApprovalType = ElementApprovalConfiguration.approvalConfigurationFilterApprovalType;

		Select approvalConfigurationFilterApprovalTypeSelect = new Select(approvalConfigurationFilterApprovalType);

		approvalConfigurationFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");

		WebElement approvalConfigurationRegistrationType = ElementApprovalConfiguration.approvalConfigurationRegistrationType;

		Select approvalConfigurationRegistrationTypeSelect = new Select(approvalConfigurationRegistrationType);

	
		
		try {
			
				approvalConfigurationRegistrationTypeSelect.selectByVisibleText(registrationType);
			
		} catch (Exception e) {
			
				approvalConfigurationRegistrationTypeSelect.selectByValue(dropValue);
			// TODO: handle exception
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement approvalConfigurationRegistrationSubType = ElementApprovalConfiguration.approvalConfigurationRegistrationSubType;

		Select approvalConfigurationRegistrationSubTypeSelect = new Select(approvalConfigurationRegistrationSubType);
		
		/*try {
			
			approvalConfigurationRegistrationSubTypeSelect.selectByVisibleText(registrationSubType);
		
	} catch (Exception e) {
		
		approvalConfigurationRegistrationSubTypeSelect.selectByValue(dropValue);
		// TODO: handle exception
	}
*/

		

		ElementApprovalConfiguration.approvalConfigurationFilterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 10);

		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));

		List<WebElement> list = ElementApprovalConfiguration.approvalConfigurationList;

		try {
			ElementApprovalConfiguration.approvalConfigurationAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApprovalConfiguration.approvalConfigurationAction.click();

		}

		ElementApprovalConfiguration.approvalConfigurationCreateVersion.click();

		ElementApprovalConfiguration.approvalConfiguration.sendKeys(registrationType);
		
		ElementApprovalConfiguration.approvalConfigurationJobAllocation.click();
		
		if(autoJobAllocation==true)
		{
			ElementApprovalConfiguration.approvalConfigurationAutoJobAllot.click();
		}
		

		

		ElementApprovalConfiguration.approvalConfigurationVersionAddSave.click();

		WebElement alert = ElementApprovalConfiguration.approvalConfigurationRegistrationAlert;

		WebElement alertClose = ElementApprovalConfiguration.approvalConfigurationRegistrationAlertClose;

		try {
			if (alert.isDisplayed()) {
				alertClose.click();
			}

		}

		catch (Exception e) {
			ElementApprovalConfiguration.approvalConfigurationVersionAddSave.click();
			if (alert.isDisplayed()) {
				alertClose.click();
			}
		}

		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationUserRoleSave));

		wait11.until(ExpectedConditions
				.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationUserRoleSave));

		List<WebElement> userRoleList = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleList;

		userRoleList.get(1).click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationPartialApprove.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationReCalc.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationRecommendReCalc.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationRecommendReTest.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationReTest.click();

		WebElement approvalConfigurationApprovalStatus = ElementApprovalConfiguration.approvalConfigurationApprovalStatus;

		Select approvalConfigurationApprovalStatusSelect = new Select(approvalConfigurationApprovalStatus);

		approvalConfigurationApprovalStatusSelect.selectByVisibleText("Reviewed");

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterClose.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationClose.click();

		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();

		WebElement userRoleAlert = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlert;

		WebElement userRoleAlertClose = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlertClose;

		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		try {
			if (userRoleAlert.isDisplayed()) {
				userRoleAlertClose.click();
			}

		}

		catch (Exception e) {
			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();
			if (userRoleAlert.isDisplayed()) {
				userRoleAlertClose.click();
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationUserRoleSave));

		wait11.until(ExpectedConditions
				.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationUserRoleSave));

		ElementApprovalConfiguration.approvalConfigurationRegistrationPartialApprove.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationReCalc.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationRecommendReCalc.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationRecommendReTest.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationReTest.click();

		approvalConfigurationApprovalStatusSelect.selectByVisibleText("Approved");

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterClose.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationClose.click();

		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();

		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		try {
			if (userRoleAlert.isDisplayed()) {
				userRoleAlertClose.click();
			}

		}

		catch (Exception e) {
			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();
			if (userRoleAlert.isDisplayed()) {
				userRoleAlertClose.click();
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		try {

			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));

		ElementApprovalConfiguration.approvalConfigurationAction.click();

		ElementApprovalConfiguration.approvalConfigurationApprove.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));

		ElementApprovalConfiguration.configurationIcon.click();

		ElementApprovalConfiguration.masterIcon.click();

	}
	
	public static void testGroup() throws InterruptedException
	{
		
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementApprovalConfiguration.masterIcon.click();
		
		ElementApprovalConfiguration.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		
		try
		{
			WebElement approvalConfigurationFilterApprovalType = ElementApprovalConfiguration.approvalConfigurationFilterApprovalType;

			Select approvalConfigurationFilterApprovalTypeSelect = new Select(approvalConfigurationFilterApprovalType);

			approvalConfigurationFilterApprovalTypeSelect.selectByVisibleText("Test Group Approval");
			
		}
		
		catch(Exception e)
		{
			ElementApprovalConfiguration.approvalConfigurationFilterIcon.click();
			
			WebElement approvalConfigurationFilterApprovalType = ElementApprovalConfiguration.approvalConfigurationFilterApprovalType;

			Select approvalConfigurationFilterApprovalTypeSelect = new Select(approvalConfigurationFilterApprovalType);

			approvalConfigurationFilterApprovalTypeSelect.selectByVisibleText("Test Group Approval");
			
		}
		
		ElementApprovalConfiguration.approvalConfigurationFilterFind.click();
		
	
		

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));		
		
		List<WebElement> list=ElementApprovalConfiguration.approvalConfigurationList;
		
		
	
	

		try {
			ElementApprovalConfiguration.approvalConfigurationAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApprovalConfiguration.approvalConfigurationAction.click();

		}
		
		
		
		ElementApprovalConfiguration.approvalConfigurationCreateVersion.click();
		
		ElementApprovalConfiguration.approvalConfiguration.sendKeys("Test Group");
		
		if(ElementApprovalConfiguration.approvalConfigurationAutoApproval.isSelected()==false)
		{
		ElementApprovalConfiguration.approvalConfigurationAutoApproval.click();
		}
		
		
		ElementApprovalConfiguration.approvalConfigurationVersionAddSave.click();
		
		

		WebElement alert=ElementApprovalConfiguration.approvalConfigurationRegistrationAlert;
		
		WebElement alertClose=ElementApprovalConfiguration.approvalConfigurationRegistrationAlertClose;
	
		try 
		{
			if(alert.isDisplayed())
			{
				alertClose.click();
			}
			
		}
		
		catch(Exception e)
		{
			ElementApprovalConfiguration.approvalConfigurationVersionAddSave.click();
			if(alert.isDisplayed())
			{
				alertClose.click();
			}
		}
		
		
		
		
		
		
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationIcon.click();
		
	
		
		ElementApprovalConfiguration.approvalConfigurationCorrection.click();
	
		
		
		
		
	WebElement	approvalConfigurationTestGroupFirstApprovalStatus=ElementApprovalConfiguration.approvalConfigurationApprovalStatus;
		
		Select approvalStatusElement=new Select(approvalConfigurationTestGroupFirstApprovalStatus);
		
		approvalStatusElement.selectByVisibleText("Approved");
		
		
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterAdd.click();
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterSelectAll.click();
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterClose.click();
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationAdd.click();
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationSelectAll.click();
		
		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationClose.click();
	
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();
		
		WebElement userRoleAlert=ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlert;
		
		WebElement userRoleAlertClose=ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlertClose;
		
		try 
		{
			if(userRoleAlert.isDisplayed())
			{
				userRoleAlertClose.click();
			}
			
		}
		
		catch(Exception e)
		{
			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();
			if(userRoleAlert.isDisplayed())
			{
				userRoleAlertClose.click();
			}
		}
		
		
		
		
		try {
		
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		}
		catch(Exception e)
		{
			Thread.sleep(5000);
			

			
			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		}
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));	
		
		ElementApprovalConfiguration.approvalConfigurationAction.click();
		
		ElementApprovalConfiguration.approvalConfigurationApprove.click();
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));	
	
		
		ElementApprovalConfiguration.configurationIcon.click();
		
		ElementApprovalConfiguration.masterIcon.click();
	}
	
	


}