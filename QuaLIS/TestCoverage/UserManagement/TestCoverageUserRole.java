package UserManagement;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseMaster.ElementUnit;
import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import Utility.BrowserOperation;


public class TestCoverageUserRole extends BrowserOperation{
	
	public static void twoFieldTestCase() throws InterruptedException
	{
	TestCoverageUserRole.userRoleAddAllField(TestDataHylands.userRole());
	
	TestCoverageUserRole.userRoleDeleteAllField(TestDataHylands.userRole());		
	
	TestCoverageUserRole.userRoleAddMandatoryField(TestDataHylands.userRole());
	
	TestCoverageUserRole.userRoleDeleteMandatoryField(TestDataHylands.userRole());
	
	TestCoverageUserRole.userRoleAddAllField(TestDataHylands.userRole());
	
	TestCoverageUserRole.userRoleEditName(TestDataHylands.userRole());
	
	// Description value to value
	TestCoverageUserRole.userRoleEditDescription(TestDataHylands.userRole());
	
	// Description value to null
	TestCoverageUserRole.userRoleEditDescriptionValueToNull(TestDataHylands.userRole());
			
	// Description null to value
	TestCoverageUserRole.userRoleEditDescriptionNullToValue(TestDataHylands.userRole());
		
	
//	TestCoverageUserRole.userRoleDeleteAll(TestDataHylands.userRole());	
	}
	
	
	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		 boolean screen=Function.preCondition( ElementUserRole.element());
		
		return screen;
	}
	
	

	
	public static void userRoleAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
			
		FunctionAdd.addAllField(value, ElementUserRole.element());
	}
	
	public static void userRoleAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionAdd.addMandatoryField(value, ElementUserRole.element());
	}
	
	public static void userRoleEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editName(value, ElementUserRole.element(), ElementUserRole.list());
		
		
	}
	
	public static void userRoleEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescription(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	public static void userRoleEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	public static void userRoleEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	
	
	public static void userRoleDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.delete(value, ElementUserRole.element(), ElementUserRole.list());		
	}
	
	public static void userRoleDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.deleteAll(value, ElementUserRole.element(), ElementUserRole.list());		
	}
	
	public static void userRoleDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.deleteMandatory(value, ElementUserRole.element(), ElementUserRole.list());		
	}

	public static void userRoleAdd(String userRole, String description) throws IOException, InterruptedException {
		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		try {
			ElementUserRole.userRoleAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementUserRole.userRoleAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAdd));

		ElementUserRole.userRoleAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementUserRole.userRoleAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementUserRole.class);

				ElementUserRole.masterIcon.click();

				ElementUserRole.userManagementIcon.click();

				ElementUserRole.userRoleIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

				try {
					ElementUserRole.userRoleAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementUserRole.userRoleAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAdd));

				ElementUserRole.userRoleAdd.click();

			}
		}

		ElementUserRole.userRole.sendKeys(userRole);

		ElementUserRole.userRoleDescription.sendKeys(description);

		ElementUserRole.userRoleAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));
/*
		FileInputStream s = new FileInputStream("flow.properties");

		Properties properties = new Properties();

		properties.load(s);

		String userRoleScreenshot = properties.getProperty("userRole");
*/
		// BasicOperation.screenshot(userRoleScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.masterIcon.click();
	}

	public static void userRoleResultEntry(String userRole) throws InterruptedException {
		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		// System.out.println(ElementUserRole.analyst);

		List<WebElement> userRoleList = ElementUserRole.userRoleList;

		List<WebElement> userRoleDescriptionList = ElementUserRole.userRoleDescriptionList;

		List<WebElement> userRoleApprovalFlow = ElementUserRole.userRoleApprovalFlowList;

		List<WebElement> userRoleResultEntry = ElementUserRole.userRoleResultEntryList;

		try
		{
			for (WebElement resultEntry : userRoleResultEntry) 
			{
				if (resultEntry.isSelected()) 
				{
					resultEntry.click();
				}
			}
		}
		catch (Exception e) 
		{
			Thread.sleep(3000);
			
			for (WebElement resultEntry : userRoleResultEntry) 
			{
				if (resultEntry.isSelected()) 
				{
					resultEntry.click();
				}
			}
		}
		
		

		ElementUserRole.userRoleAction.click();

		ElementUserRole.userRoleSave.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		
		for (WebElement userRoleInList : userRoleList)
		{
			if (userRoleInList.getText().equals(userRole))
			{
				
				String nm=userRoleInList.getText();
				
				int i=userRoleList.indexOf(userRoleInList);
				
				WebElement d=userRoleResultEntry.get(i);
				
				try {
				
				d.click();
				}
				
				catch(Exception e)
				{
					Thread.sleep(3000);
				}
				
				
				
				//System.out.println(nm);
				
				
				
			}
			
		}
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userRoleAction.click();
		
		ElementUserRole.userRoleSave.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();
		
		ElementUserRole.masterIcon.click();
	}
	

	
	public static void userRoleApprovalFlow(String userRole) throws InterruptedException {

		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));


		List<WebElement> userRoleList = ElementUserRole.userRoleList;

		List<WebElement> userRoleDescriptionList = ElementUserRole.userRoleDescriptionList;

		List<WebElement> userRoleApprovalFlow = ElementUserRole.userRoleApprovalFlowList;

		List<WebElement> userRoleResultEntry = ElementUserRole.userRoleResultEntryList;

		
		try
		{
			for (WebElement approvalUserRole : userRoleList) {
				if (approvalUserRole.getText().equals(userRole)) {
					int i = userRoleList.indexOf(approvalUserRole);

					WebElement approvalFlow = userRoleApprovalFlow.get(i);

					if (approvalFlow.isSelected() == false) {
						approvalFlow.click();
					}

				}

			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			Thread.sleep(3000);
			
			for (WebElement approvalUserRole : userRoleList) {
				if (approvalUserRole.getText().equals(userRole)) {
					int i = userRoleList.indexOf(approvalUserRole);

					WebElement approvalFlow = userRoleApprovalFlow.get(i);

					if (approvalFlow.isSelected() == false) {
						approvalFlow.click();
					}

				}

			}
			
		}
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));
		

		ElementUserRole.userRoleAction.click();
		
		ElementUserRole.userRoleSave.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();
		
		ElementUserRole.masterIcon.click();

	}
}
