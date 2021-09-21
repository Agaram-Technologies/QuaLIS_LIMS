package UserManagement;

import java.awt.AWTException;


import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FlowMethod.MasterMethod;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageScreenRights extends ElementAuditTrail
{
	
	
	public static void screenRightsAddAll(String userRole) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementScreenRights.class);
	
		ElementScreenRights.masterIcon.click();
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.screenRightsIcon.click();
		
		BasicOperation.selectByVisibleText(ElementScreenRights.screenRightsFilterUserRole, userRole);
	 	
		ElementScreenRights.screenRightsFilterFind.click();
		
		
		BasicOperation.exception(ElementScreenRights.screenRightsTabIcon);

		BasicOperation.wait(ElementScreenRights.screenRightsAction);

		
		BasicOperation.exception(ElementScreenRights.screenRightsAction);
	 
		ElementScreenRights.screenRightsAddRights.click();
		
		BasicOperation.exception(ElementScreenRights.screenRightsSearchScreen);
 
		if(ElementScreenRights.screenRightsSelectAll.isDisplayed())
		{
			
			ElementScreenRights.screenRightsSelectAll.click();
		
			ElementScreenRights.screenRightsAddSubmit.click();

		}
		else
		{
			ElementScreenRights.screenRightsAddCancel.click();
		}
		
		BasicOperation.wait(ElementScreenRights.screenRightsAction);
 	
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.masterIcon.click();
		
		ElementScreenRights.homeIcon.click();
	}
	
	
	}
	
	

