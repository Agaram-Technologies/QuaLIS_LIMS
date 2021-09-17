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
	
	static int beforeCount;
	
	static int screenGridCount;
	public static void main(String[] args) throws IOException, InterruptedException, HeadlessException, AWTException, URISyntaxException {
		
		
		//BrowserOperation.launchLIMS();
		
		auditTrailAdd();
		
	/*	String userRole=BasicOperation.timeValue();
		
		FlowMethod.userRole(userRole, "des");
		
		
		
		PageFactory.initElements(driver, ElementScreenRights.class);
		
		ElementScreenRights.masterIcon.click();
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.screenRightsIcon.click();
		
		WebElement screenRightsFilterUserRole=ElementScreenRights.screenRightsFilterUserRole;

		Select screenRightsFilterUserRoleSelect=new Select(screenRightsFilterUserRole);
		
		screenRightsFilterUserRoleSelect.selectByVisibleText(userRole);
		
		ElementScreenRights.screenRightsFilterFind.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));

		try {
			ElementScreenRights.screenRightsAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsAction.click();
		}
		ElementScreenRights.screenRightsAddRights.click();
		

		try {
			ElementScreenRights.screenRightsSearchScreen.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsSearchScreen.click();
		}
		if(ElementScreenRights.screenRightsSelectAll.isDisplayed())
		{
			
		ElementScreenRights.screenRightsSelectAll.click();
		
		for(WebElement sc:ElementScreenRights.screenRightsList)
		{
			System.out.println(sc.getText());
			
		}
		
		ElementScreenRights.screenRightsAddSubmit.click();

		}
		else
		{
			ElementScreenRights.screenRightsAddCancel.click();
		}
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.masterIcon.click();*/

	}
	
	public static void auditTrailAdd() throws IOException, InterruptedException, HeadlessException, AWTException, URISyntaxException
	{
		
		BrowserOperation.launchLIMS();
		
		String userRole=BasicOperation.timeValue();
		
		MasterMethod.userRole(userRole, "des");
		
		beforeCount=TestCoverageAuditTrail.auditTrailBeforeCount( screenRights);
		
		
		System.out.println(beforeCount);
		int screenList = 0;
		
		PageFactory.initElements(driver, ElementScreenRights.class);
		
		ElementScreenRights.masterIcon.click();
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.screenRightsIcon.click();
		
		WebElement screenRightsFilterUserRole=ElementScreenRights.screenRightsFilterUserRole;

		Select screenRightsFilterUserRoleSelect=new Select(screenRightsFilterUserRole);
		
		screenRightsFilterUserRoleSelect.selectByVisibleText(userRole);
		
		ElementScreenRights.screenRightsFilterFind.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));

		try {
			ElementScreenRights.screenRightsAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsAction.click();
		}
		ElementScreenRights.screenRightsAddRights.click();
		

		try {
			ElementScreenRights.screenRightsSearchScreen.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsSearchScreen.click();
		}
		if(ElementScreenRights.screenRightsSelectAll.isDisplayed())
		{
			
		ElementScreenRights.screenRightsSelectAll.click();
		
		screenList=ElementScreenRights.screenRightsList.size();
		
		
		
		ElementScreenRights.screenRightsAddSubmit.click();

		}
		else
		{
			ElementScreenRights.screenRightsAddCancel.click();
		}
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));
		
		
		 screenGridCount=ElementScreenRights.screenList.size();
		 
		 System.out.println(screenGridCount);
		
		if(screenList==screenGridCount)
		{
			System.out.println("Screen count matched in grid");
			
		}
		else
		{
			System.out.println("Screen count Not matched in grid");
		}
		
	
		
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.masterIcon.click();

		
		
		
//		TestCoverageAuditTrail.auditTrailAfterScreenRights(screenRights);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

	}
	
	

