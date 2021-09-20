package Configuration;

import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Settings.ApprovalSubType;
import Settings.RegistrationTypeDetail;
import Settings.TestStatus;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageApprovalConfiguration extends BrowserOperation {

	public static void hylands(boolean autoJobAllot) throws InterruptedException {

		if (autoJobAllot == true) 
		{

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater, true, false, "a", "a",
					"a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial, true, false, "a", "a",
					"a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate, true, false, "a", "a",
					"a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct, true, false, "a", "a",
					"a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsFinishedGoods, true, false, "a", "a",
					"a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured, true, false,
					"a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies, true, false, "a",
					"a", "a");
	}
		else 
		{
			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater, false, false, "a", "a","a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial, false, false, "a", "a","a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate, false, false, "a", "a","a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct, false, false, "a", "a","a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsFinishedGoods, false, false, "a", "a","a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured, false, false,"a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies, false, false, "a",	"a", "a");

		}

	}

	public static void domnica(boolean autoJobAllot) throws InterruptedException 
	{

		if (autoJobAllot == true)
		{
			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine, true, false, "a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeInstrument, true, false, "a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeMaterial, true, false, "a", "a", "a");

		} 
		else 
		{

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine, false, false, "a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeInstrument, false, false, "a", "a", "a");

			TestCoverageApprovalConfiguration.userRoleTemplateAdd(RegistrationTypeDetail.registrationSubTypeMaterial, false, false, "a", "a", "a");	
		}

	}

	public static void userRoleTemplateAdd(String registrationSubType, boolean autoJobAllocation, boolean autoComplete,
			String filterStatus, String validationStatus, String approvalStatus) throws InterruptedException {
		
		String registrationType = RegistrationTypeDetail.registrationType(registrationSubType);
				
		String registrationTypeIDS = RegistrationTypeDetail.registrationTypeIDS(registrationSubType);
		
		String registrationSubTypeIDS = RegistrationTypeDetail.registrationSubTypeIDS(registrationSubType);
		
		System.out.println(registrationType);
	
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);

		ElementApprovalConfiguration.masterIcon.click();

		ElementApprovalConfiguration.configurationIcon.click();

		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		BrowserOperation.implicitWait(2);

		BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationFilterApprovalType,
				ApprovalSubType.registrationApproval);

		try 
		{
			
			BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationRegistrationType,registrationType);

			
		} 
		catch (Exception e) 
		{
			BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationRegistrationType,registrationTypeIDS);
		}

		try 
		{
			
			BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationRegistrationSubType,registrationSubType);

			
		} 
		catch (Exception e) 
		{
			BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationRegistrationSubType,registrationSubTypeIDS);
		}
				

		ElementApprovalConfiguration.approvalConfigurationFilterFind.click();

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationTabIcon);

		List<WebElement> list = ElementApprovalConfiguration.approvalConfigurationList;

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.approvalConfigurationCreateVersion.click();

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfiguration);

		ElementApprovalConfiguration.approvalConfiguration.sendKeys(registrationType);

		ElementApprovalConfiguration.approvalConfigurationJobAllocation.click();

		if (autoJobAllocation == true) {
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

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationUserRoleSave);

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

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationUserRoleSave);

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

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationAction);

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.approvalConfigurationApprove.click();

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.configurationIcon.click();

		ElementApprovalConfiguration.masterIcon.click();

		ElementApprovalConfiguration.homeIcon.click();

	}

	public static void testGroup(boolean autoApproval) throws InterruptedException {

		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		List<WebElement> userRoleList = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleList;

		

		ElementApprovalConfiguration.masterIcon.click();

		ElementApprovalConfiguration.configurationIcon.click();

		ElementApprovalConfiguration.approvalConfigurationIcon.click();

		BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationFilterApprovalType,
				ApprovalSubType.testGroupApproval);

		ElementApprovalConfiguration.approvalConfigurationFilterFind.click();

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationTabIcon);

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.approvalConfigurationCreateVersion.click();

		ElementApprovalConfiguration.approvalConfiguration.sendKeys("Test Group");

		if(autoApproval==true)
		{
			if (ElementApprovalConfiguration.approvalConfigurationAutoApproval.isSelected() == false) 
			{
				ElementApprovalConfiguration.approvalConfigurationAutoApproval.click();
			}
		}
		else
		{
			if (ElementApprovalConfiguration.approvalConfigurationAutoApproval.isSelected() ) 
			{
				ElementApprovalConfiguration.approvalConfigurationAutoApproval.click();
			}
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
		
		userRoleList.get(1).click();

		ElementApprovalConfiguration.approvalConfigurationCorrection.click();

		BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationApprovalStatus,
				TestStatus.reviewed);

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationFilterClose.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationAdd.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationSelectAll.click();

		ElementApprovalConfiguration.approvalConfigurationRegistrationValidationClose.click();

		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();

		WebElement userRoleAlert = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlert;

		WebElement userRoleAlertClose = ElementApprovalConfiguration.approvalConfigurationRegistrationUserRoleAlertClose;

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
		
		userRoleList.get(2).click();

		
		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationUserRoleSave);

		ElementApprovalConfiguration.approvalConfigurationCorrection.click();

		BasicOperation.selectByVisibleText(ElementApprovalConfiguration.approvalConfigurationApprovalStatus,
				TestStatus.approved);

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

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationAction);

		BasicOperation.exception(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.approvalConfigurationApprove.click();

		BasicOperation.wait(ElementApprovalConfiguration.approvalConfigurationAction);

		ElementApprovalConfiguration.configurationIcon.click();

		ElementApprovalConfiguration.masterIcon.click();

		ElementApprovalConfiguration.homeIcon.click();

		 
	}

}