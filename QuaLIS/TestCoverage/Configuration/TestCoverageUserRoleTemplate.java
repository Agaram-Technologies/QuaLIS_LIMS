package Configuration;





import java.util.HashMap;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Attribute.AttributeUserRoleTemplate;
import Settings.ApprovalSubType;
import Settings.RegistrationTypeDetail;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageUserRoleTemplate extends BrowserOperation

{
		
	
	
	public static HashMap<String,String> userRoleTemplateAddTwoLevel(HashMap<String,String> input) throws InterruptedException
	{
		String approvalSubType=input.get(AttributeUserRoleTemplate.approvalSubType);
				
		String registrationType=input.get(AttributeUserRoleTemplate.registrationType);
		
		String registrationTypeIDS=input.get(AttributeUserRoleTemplate.registrationTypeIDS);
		
		String registrationSubType=input.get(AttributeUserRoleTemplate.registrationSubType);
		
		String registrationSubTypeIDS=input.get(AttributeUserRoleTemplate.registrationSubTypeIDS);
		
		String firstUserRole=input.get(AttributeUserRoleTemplate.firstUserRole);
				
		String secondUserRole=input.get(AttributeUserRoleTemplate.secondUserRole);
		
		String templateName=input.get(AttributeUserRoleTemplate.templateName);
		
		System.out.println(approvalSubType);

		System.out.println(registrationType);
		
		System.out.println(registrationTypeIDS);
		
		System.out.println(registrationSubType);
		
		System.out.println(registrationSubTypeIDS);
				
	    HashMap<String,String> output=new  HashMap<String,String> ();
		
		PageFactory.initElements(driver, ElementUserRoleTemplate.class);
				
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
				
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
			
		BrowserOperation.implicitWait(1);
		
		BasicOperation.selectByVisibleText(ElementUserRoleTemplate.userRoleTemplateFilterApprovalType, approvalSubType);

		if(approvalSubType.equals(ApprovalSubType.registrationApproval))
		{
			try 
			{
				BasicOperation.selectByVisibleText( ElementUserRoleTemplate.userRoleTemplateRegistrationType,registrationType);

			} 
			catch (Exception e) 
			{
				BasicOperation.selectByVisibleText( ElementUserRoleTemplate.userRoleTemplateRegistrationType,registrationTypeIDS);
			}
			
			try 
			{
				BasicOperation.selectByVisibleText( ElementUserRoleTemplate.userRoleTemplateRegistrationSubType,registrationSubType);

			} 
			catch (Exception e) 
			{
				BasicOperation.selectByVisibleText( ElementUserRoleTemplate.userRoleTemplateRegistrationSubType,registrationSubTypeIDS);
			}
			
			
		}
		
		ElementUserRoleTemplate.userRoleTemplateFilterFind.click();
		
		BrowserOperation.implicitWait(20);
		
		BasicOperation.exception(ElementUserRoleTemplate.userRoleTemplateTabIcon);

		BasicOperation.exception(ElementUserRoleTemplate.userRoleTemplateAction);
			
		ElementUserRoleTemplate.userRoleTemplateCreateVersion.click();
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys(templateName);
				
		BasicOperation.selectByVisibleText(ElementUserRoleTemplate.userRoleTemplateFirstRole, firstUserRole);
				
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		BasicOperation.selectByVisibleText(ElementUserRoleTemplate.userRoleTemplateSecondRole, secondUserRole);
		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		BasicOperation.wait(ElementUserRoleTemplate.userRoleTemplateAction);
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
		
		BasicOperation.wait(ElementUserRoleTemplate.userRoleTemplateAction);
	
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.homeIcon.click();
		
		return output;
	}
	
	public static HashMap<String,String> userRoleTemplateAddTwoLevelDomnica(HashMap<String,String> domnica, HashMap<String,String> instrument,HashMap<String,String> material) throws InterruptedException
	{
		HashMap<String,String> output=new HashMap<String,String>();
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(domnica);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(instrument);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(material);
		
		return output;
	}
	
	public static HashMap<String,String> userRoleTemplateAddTwoLevelHylands(HashMap<String,String> purifiedWater, HashMap<String,String> rawMaterial,HashMap<String,String> intermediate,HashMap<String,String> bulkProduct,HashMap<String,String> finishedGoods,HashMap<String,String> externallyManufactured,HashMap<String,String> stabilityStudies) throws InterruptedException
	{
		HashMap<String,String> output=new HashMap<String,String>();
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(purifiedWater);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(intermediate);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(rawMaterial);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(bulkProduct);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(finishedGoods);
		
		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(externallyManufactured);

		TestCoverageUserRoleTemplate.userRoleTemplateAddTwoLevel(stabilityStudies);

		return output;
	}
	
}