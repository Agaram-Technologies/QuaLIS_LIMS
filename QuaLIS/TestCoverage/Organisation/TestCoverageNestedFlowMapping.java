package Organisation;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.RegistrationDetail;
import Utility.BrowserOperation;

public class TestCoverageNestedFlowMapping extends BrowserOperation{
	
	
	public static void HYLANDS(String approver, String reviewer, String analyst) throws InterruptedException
	{
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.purifiedWater, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.rawMaterial, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.intermediate, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.bulkProduct, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.finishedGoods, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.externallyManufactured, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.stabilityStudies, approver, reviewer, analyst);
	}
	
	
	public static void DOMNICA(String approver, String reviewer, String analyst) throws InterruptedException
	{
	//	TestCoverageNestedFlowMapping.twoLevel(RegistrationDetail.dominica, approver, reviewer, analyst);
		
			
	}
	
	public static void UGANDA()
	{
		
	}
	
	public static void PHILIPINES(String routine,String instrument, String material,String approver, String reviewer,String checker, String analyst) throws InterruptedException
	{
		TestCoverageNestedFlowMapping.philipinesRoutine(routine, approver, reviewer, checker,analyst);
		
		TestCoverageNestedFlowMapping.philipinesInstrument(instrument, approver, reviewer, checker,analyst);
		
		TestCoverageNestedFlowMapping.philipinesMaterial(material, approver, reviewer,checker, analyst);
		
		TestCoverageNestedFlowMapping.philipinesRoutine(routine, approver, reviewer, checker,analyst);
		
		TestCoverageNestedFlowMapping.philipinesInstrument(instrument, approver, reviewer, checker,analyst);
		
		TestCoverageNestedFlowMapping.philipinesMaterial(material, approver, reviewer,checker, analyst);
		
		TestCoverageNestedFlowMapping.philipinesMaterial(material, approver, reviewer,checker, analyst);
	}
	
	
	
	
	public static void AARTI()
	{
		
	}
	
	public static void philipinesRoutine(String routine,String approver, String reviewer,String checker, String analyst) throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Philippines");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Routine");
		
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");
		
		
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);
		
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(1000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		

		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(reviewer))
				{
					user.click();
				}
			}	
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(3).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(checker))
				{
					user.click();
				}
			}
			
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	

			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(checker))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(4).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(2000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(analyst))
				{
					user.click();
				}
			}
			
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
			
		
			ElementNestedFlowMapping.organisationManagementIcon.click();
			
			ElementNestedFlowMapping.masterIcon.click();
		
		
		
	}
	
	public static void philipindes() throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Philippines");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByIndex(0);
		/*
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");
		*/
		/*
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);
		*/
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		/*List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		*/
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
/*
		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		*/
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			/*
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			*/
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(3).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			
		/*	for(WebElement user:userList)
			{
				if(user.getText().contains(analyst))
				{
					user.click();
				}
			}
			*/
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
			ElementNestedFlowMapping.organisationManagementIcon.click();
			
			ElementNestedFlowMapping.masterIcon.click();
		
		
		
	}
	
	public static void philipinesInstrument(String instrument,String approver, String reviewer,String checker, String analyst) throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Philippines");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Instrument Samples");
		
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Instrument");
		
		
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(instrument);
		
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		

		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(reviewer))
				{
					user.click();
				}
			}	
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(3).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(checker))
				{
					user.click();
				}
			}
			
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			

			
			
			
			
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(checker))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				

				

			
			
			userRoleList.get(4).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(2000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(analyst))
				{
					user.click();
				}
			}
			
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
			
		
			ElementNestedFlowMapping.organisationManagementIcon.click();
			
			ElementNestedFlowMapping.masterIcon.click();
		
		
				
	}
	public static void philipinesMaterial(String material,String approver, String reviewer, String checker,String analyst) throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Philippines");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Material");
		
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Material");
		
		
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(material);
		
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		

		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			
			for(WebElement user:userList)
			{
				if(user.getText().contains(reviewer))
				{
					user.click();
				}
			}	
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			

				
				
				userRoleList.get(3).click();
				
				
				wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
					
					wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				

				try {
					ElementNestedFlowMapping.nestedFlowMappingAction.click();
				} catch (Exception e) {
					Thread.sleep(5000);

					ElementNestedFlowMapping.nestedFlowMappingAction.click();

				}
				
				ElementNestedFlowMapping.nestedFlowMappingAdd.click();
				
				

				try {
					ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				} catch (Exception e) {
					Thread.sleep(3000);

					ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

				}
				
				
				
				for(WebElement user:userList)
				{
					if(user.getText().contains(checker))
					{
						user.click();
					}
				}
				
				ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				

				

				
				
				
				
				
				

				for(WebElement u:gridUserList)
				{
					if(u.getText().contains(checker))
					{
						int i=gridUserList.indexOf(u);
						
						String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
						
						if(j.equals(0))
						{
							gridCheckboxList.get(i).click();
						}
						
						
					}
				}
				
				
				wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
					
					wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
					

					

				
				
				userRoleList.get(4).click();
				
				
				wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
					
					wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				

				try {
					ElementNestedFlowMapping.nestedFlowMappingAction.click();
				} catch (Exception e) {
					Thread.sleep(5000);

					ElementNestedFlowMapping.nestedFlowMappingAction.click();

				}
				
				ElementNestedFlowMapping.nestedFlowMappingAdd.click();
				
				

				try {
					ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

				}
				
				
				
				for(WebElement user:userList)
				{
					if(user.getText().contains(analyst))
					{
						user.click();
					}
				}
				
				ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
				
				
				
			
				ElementNestedFlowMapping.organisationManagementIcon.click();
				
				ElementNestedFlowMapping.masterIcon.click();
			
			
	}
	
	
	
	
	public static void philipinesInstrumentSelectAll() throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Instrument Samples");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByIndex(1);
		/*
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");
		*/
		/*
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);
		*/
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		/*List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		*/
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
/*
		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		*/
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			/*
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			*/
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(3).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			
		/*	for(WebElement user:userList)
			{
				if(user.getText().contains(analyst))
				{
					user.click();
				}
			}
			*/
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
			ElementNestedFlowMapping.organisationManagementIcon.click();
			
			ElementNestedFlowMapping.masterIcon.click();
		
		
		
	}
	
	public static void philipines() throws InterruptedException
	{
	
		
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		PageFactory.initElements(driver, ElementOrganisation.class);
		
		
		
		ElementOrganisation.organisationIcon.click();
		
		
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		
		
		
		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("Philippines");
		
		
		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");
		
		
		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByIndex(0);
		/*
		
		
		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");
		*/
		/*
		
		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);
		*/
		
		ElementNestedFlowMapping.filterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
	//	ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
		
		/*List<WebElement>userList=ElementNestedFlowMapping.userList;
		
		for(WebElement user:userList)
		{
			if(user.getText().contains(approver))
			{
				user.click();
			}
		}
		
		*/
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		
	wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
/*
		List<WebElement> gridUserList=ElementNestedFlowMapping.gridUserList;
		
		List<WebElement> gridCheckboxList=ElementNestedFlowMapping.gridCheckboxList;
		
		for(WebElement u:gridUserList)
		{
			if(u.getText().contains(approver))
			{
				int i=gridUserList.indexOf(u);
				
				String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
				
				if(j.equals(0))
				{
					gridCheckboxList.get(i).click();
				}
				
				
			}
		}
		*/
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
		
		
		
		
		
		
		
		
		
		List<WebElement> userRoleList=ElementNestedFlowMapping.nestedFlowMappingUserRoleList;
		
		
		userRoleList.get(2).click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
		
		
		
		
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
			
			
			
			/*
			
			

			for(WebElement u:gridUserList)
			{
				if(u.getText().contains(reviewer))
				{
					int i=gridUserList.indexOf(u);
					
					String j=gridCheckboxList.get(i).getAttribute("checkboxselect");
					
					if(j.equals(0))
					{
						gridCheckboxList.get(i).click();
					}
					
					
				}
			}
			
			*/
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			userRoleList.get(3).click();
			
			
			wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingAction.click();
			} catch (Exception e) {
				Thread.sleep(5000);

				ElementNestedFlowMapping.nestedFlowMappingAction.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingAdd.click();
			
			

			try {
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
			} catch (Exception e) {
				Thread.sleep(3000);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

			}
			
			ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();
			
		/*	for(WebElement user:userList)
			{
				if(user.getText().contains(analyst))
				{
					user.click();
				}
			}
			*/
			ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
			
			
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));	
			
			
		
			ElementNestedFlowMapping.organisationManagementIcon.click();
			
			ElementNestedFlowMapping.masterIcon.click();
		
		
		
	}
	
	
	
	
	
	public static void twoLevel(String registrationType, String approver, String reviewer, String analyst)throws InterruptedException {

	
		
		String registrationSubType=RegistrationDetail.registrationType(registrationType);
		
		
		String site="";
		
		
		
		if(registrationSubType.equals(RegistrationDetail.bulkProduct)||registrationSubType.equals(RegistrationDetail.rawMaterial)||registrationSubType.equals(RegistrationDetail.intermediate)||registrationSubType.equals(RegistrationDetail.purifiedWater)||registrationSubType.equals(RegistrationDetail.externallyManufactured)||registrationSubType.equals(RegistrationDetail.stabilityStudies)||registrationSubType.equals(RegistrationDetail.finishedGoods))
		{
			
			site="SHC Hylands";
			
		}
		
		
	
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();

		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.organisationIcon.click();

		ElementNestedFlowMapping.nestefFlowMappingIcon.click();

		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText(site);

		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");

		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);

		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText(registrationSubType);

		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(registrationType);

		ElementNestedFlowMapping.filterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		boolean add=false;
		
		for(int i=1; i>0; i++)
		{
			
			if(add==true)
			{
				break;
			}
			

			try
			{
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add=true;
				
				if(add==true)
				{
					break;
				}
				
				break;

				
				
			}
			catch (Exception e) 
			{
				Thread.sleep(100);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add=true;
				
				if(add==true)
				{
					break;
				}
				
				break;

			
			}
			
			
			
		}


		// ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();

		List<WebElement> userList = ElementNestedFlowMapping.userList;

		for (WebElement user : userList) {
			if (user.getText().contains(approver)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> gridUserList = ElementNestedFlowMapping.gridUserList;

		List<WebElement> gridCheckboxList = ElementNestedFlowMapping.gridCheckboxList;

	/*	for (WebElement u : gridUserList) {
			if (u.getText().contains(approver)) {
				
				u.click();
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}*/
		

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

boolean add1=false;
		
		for(int i=1; i>0; i++)
		{
			
			if(add1==true)
			{
				break;
			}
			

			try
			{
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add1=true;
				
				if(add1==true)
				{
					break;
				}
				
				break;

				
				
			}
			catch (Exception e) 
			{
				Thread.sleep(100);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add1=true;
				
				if(add1==true)
				{
					break;
				}
				
				break;

			
			}
			
			
			
		}

		for (WebElement user : userList) {
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		/*for (WebElement u : gridUserList) {
			if (u.getText().contains(reviewer)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}
*/
		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		userRoleList.get(3).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

boolean add2=false;
		
		for(int i=1; i>0; i++)
		{
			
			if(add2==true)
			{
				break;
			}
			

			try
			{
				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add2=true;
				
				if(add2==true)
				{
					break;
				}
				
				break;

				
				
			}
			catch (Exception e) 
			{
				Thread.sleep(100);

				ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
				
				add2=true;
				
				if(add2==true)
				{
					break;
				}
				
				break;

			
			}
			
			
			
		}

		for (WebElement user : userList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));


		
		PageFactory.initElements(driver, ElementDepartment.class);
		
		ElementDepartment.departmentIcon.click();
		
		
		ElementNestedFlowMapping.organisationManagementIcon.click();
		

		ElementNestedFlowMapping.masterIcon.click();
		
	}

	
	public static void HPCLFormulationAndRecipeManagement(String routine, String approver, String reviewer, String analyst)
			throws InterruptedException {

		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();

		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.organisationIcon.click();

		ElementNestedFlowMapping.nestefFlowMappingIcon.click();

		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("HPCL");

		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");

		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Routine");

		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Formulation and Recipe Mgt");

		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);

		ElementNestedFlowMapping.filterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(1000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		// ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();

		List<WebElement> userList = ElementNestedFlowMapping.userList;

		for (WebElement user : userList) {
			if (user.getText().contains(approver)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> gridUserList = ElementNestedFlowMapping.gridUserList;

		List<WebElement> gridCheckboxList = ElementNestedFlowMapping.gridCheckboxList;

		for (WebElement u : gridUserList) {
			if (u.getText().contains(approver)) {
				
				
				u.click();
				/*int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}*/

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		for (WebElement u : gridUserList) {
			if (u.getText().contains(reviewer)) {
				
				u.click();
				/*int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}
*/
			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		userRoleList.get(3).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		ElementNestedFlowMapping.organisationManagementIcon.click();

		ElementNestedFlowMapping.masterIcon.click();
	}
	public static void HPCLMethodProtocolDevelopment(String routine, String approver, String reviewer, String analyst)
			throws InterruptedException {

		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();

		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.organisationIcon.click();

		ElementNestedFlowMapping.nestefFlowMappingIcon.click();

		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("HPCL");

		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");

		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Routine");

		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Method/Protocol development");

		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText(routine);

		ElementNestedFlowMapping.filterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(1000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		// ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();

		List<WebElement> userList = ElementNestedFlowMapping.userList;

		for (WebElement user : userList) {
			if (user.getText().contains(approver)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> gridUserList = ElementNestedFlowMapping.gridUserList;

		List<WebElement> gridCheckboxList = ElementNestedFlowMapping.gridCheckboxList;

		for (WebElement u : gridUserList) {
			if (u.getText().contains(approver)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		for (WebElement u : gridUserList) {
			if (u.getText().contains(reviewer)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		userRoleList.get(3).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		ElementNestedFlowMapping.organisationManagementIcon.click();

		ElementNestedFlowMapping.masterIcon.click();
	
	
	
	
	}
	
	
	public static void HPCLInstrument(String routine, String approver, String reviewer, String analyst)
			throws InterruptedException {

		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();

		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.organisationIcon.click();

		ElementNestedFlowMapping.nestefFlowMappingIcon.click();

		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("HPCL");

		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");

		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Routine");

		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");

		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText("Routine Type");

		ElementNestedFlowMapping.filterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(1000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		// ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();

		List<WebElement> userList = ElementNestedFlowMapping.userList;

		for (WebElement user : userList) {
			if (user.getText().contains(approver)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> gridUserList = ElementNestedFlowMapping.gridUserList;

		List<WebElement> gridCheckboxList = ElementNestedFlowMapping.gridCheckboxList;

		for (WebElement u : gridUserList) {
			if (u.getText().contains(approver)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		for (WebElement u : gridUserList) {
			if (u.getText().contains(reviewer)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		userRoleList.get(3).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		ElementNestedFlowMapping.organisationManagementIcon.click();

		ElementNestedFlowMapping.masterIcon.click();
		
	}
	
	public static void HPCLMaterial(String routine, String approver, String reviewer, String analyst)
			throws InterruptedException {

		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();

		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.organisationIcon.click();

		ElementNestedFlowMapping.nestefFlowMappingIcon.click();

		WebElement filterSite = ElementNestedFlowMapping.filterSite;

		Select filterSiteSelect = new Select(filterSite);

		filterSiteSelect.selectByVisibleText("HPCL");

		WebElement filterApprovalSubType = ElementNestedFlowMapping.filterApprovalSubType;

		Select filterApprovalSubTypeSelect = new Select(filterApprovalSubType);

		filterApprovalSubTypeSelect.selectByVisibleText("Registration Approval");

		WebElement filterRegistrationType = ElementNestedFlowMapping.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText("Routine");

		WebElement filterRegistrationSubType = ElementNestedFlowMapping.filterRegistrationSubType;

		Select filterRegistrationSubTypeSelect = new Select(filterRegistrationSubType);

		filterRegistrationSubTypeSelect.selectByVisibleText("Routine");

		WebElement filterVersion = ElementNestedFlowMapping.filterVersion;

		Select filterVersionSelect = new Select(filterVersion);

		filterVersionSelect.selectByVisibleText("Routine Type");

		ElementNestedFlowMapping.filterFind.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(1000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		// ElementNestedFlowMapping.nestedFlowMappingSelectAll.click();

		List<WebElement> userList = ElementNestedFlowMapping.userList;

		for (WebElement user : userList) {
			if (user.getText().contains(approver)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> gridUserList = ElementNestedFlowMapping.gridUserList;

		List<WebElement> gridCheckboxList = ElementNestedFlowMapping.gridCheckboxList;

		for (WebElement u : gridUserList) {
			if (u.getText().contains(approver)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		for (WebElement u : gridUserList) {
			if (u.getText().contains(reviewer)) {
				int i = gridUserList.indexOf(u);

				String j = gridCheckboxList.get(i).getAttribute("checkboxselect");

				if (j.equals(0)) {
					gridCheckboxList.get(i).click();
				}

			}
		}

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		userRoleList.get(3).click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		try {
			ElementNestedFlowMapping.nestedFlowMappingAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementNestedFlowMapping.nestedFlowMappingAction.click();

		}

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();

		try {
			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();
		} catch (Exception e) {
			Thread.sleep(3000);

			ElementNestedFlowMapping.nestedFlowMappingViewUsers.click();

		}

		for (WebElement user : userList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementNestedFlowMapping.nestedFlowMappingAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementNestedFlowMapping.nestedFlowMappingAction));

		ElementNestedFlowMapping.organisationManagementIcon.click();

		ElementNestedFlowMapping.masterIcon.click();
	}
	}
	
	