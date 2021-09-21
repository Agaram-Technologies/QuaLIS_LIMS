package Organisation;

import java.io.IOException;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Settings.ApprovalSubType;
import Settings.RegistrationTypeDetail;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageNestedFlowMapping extends BrowserOperation{
	
	
	public static void HYLANDS(String approver, String reviewer, String analyst) throws InterruptedException
	{
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsFinishedGoods, approver, reviewer, analyst);
		
		TestCoverageNestedFlowMapping.twoLevel(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies, approver, reviewer, analyst);
	}
	
	
	
	public static void UGANDA()
	{
		
	}
	

	
	
	public static void AARTI()
	{
		
	}
	
	public static void hylandsTwoLevel()
	{
		
	}
	
	public static void domnicaTwoLevel(String domnicaRoutine,String instrument, String material, String   approver, String reviewer, String analyst) throws InterruptedException
	{
		twoLevel(domnicaRoutine, approver, reviewer, analyst);
		
		twoLevel(instrument, approver, reviewer, analyst);
	 	
		twoLevel(material, approver, reviewer, analyst);
	}
	

	public static void twoLevel(String registrationSubType, String approver, String reviewer, String analyst)throws InterruptedException {


		String registrationType = RegistrationTypeDetail.registrationType(registrationSubType);
				
		String registrationTypeIDS = RegistrationTypeDetail.registrationTypeIDS(registrationSubType);
		
		String registrationSubTypeIDS = RegistrationTypeDetail.registrationSubTypeIDS(registrationSubType);
	
		
		PageFactory.initElements(driver, ElementNestedFlowMapping.class);

		ElementNestedFlowMapping.masterIcon.click();

		ElementNestedFlowMapping.organisationManagementIcon.click();
 
		ElementNestedFlowMapping.nestefFlowMappingIcon.click();
		
		BrowserOperation.implicitWait(2);
		
		BasicOperation.selectByIndex( ElementNestedFlowMapping.filterSite, 0);

		try 
		{
			BasicOperation.selectByVisibleText( ElementNestedFlowMapping.filterRegistrationType, registrationType);

		} catch (Exception e) 
		{
			BasicOperation.selectByVisibleText( ElementNestedFlowMapping.filterRegistrationType, registrationTypeIDS);
		}
		
		try 
		{
			BasicOperation.selectByVisibleText( ElementNestedFlowMapping.filterRegistrationSubType, registrationSubType);

		} catch (Exception e) 
		{
			BasicOperation.selectByVisibleText( ElementNestedFlowMapping.filterRegistrationSubType, registrationSubTypeIDS);
		}
		

		BasicOperation.selectByIndex( ElementNestedFlowMapping.filterVersion, 0);

		ElementNestedFlowMapping.filterFind.click();

		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingAction);
				
		
		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingViewUsers);
		
		System.out.println(approver);

		List<WebElement> userList = ElementNestedFlowMapping.userThirdLevelList;
		
		

		for (WebElement user : userList) 
		{
			System.out.println(approver);
			
			System.out.println(user.getText());
			if(user.getText().contains(approver)) 
			{
				user.click();
			}
		}
		
		
		Thread.sleep(10000);
		
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();
		
		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);


	    List<WebElement> gridUserNameThirdLevelList = ElementNestedFlowMapping.gridUserNameThirdLevelList;
	    
	    List<WebElement> gridUserNameSecondLevelList = ElementNestedFlowMapping.gridUserNameSecondLevelList;
	    
	    List<WebElement> userNameThirdLevelList = ElementNestedFlowMapping.userThirdLevelList;
	    
	    List<WebElement> userNameSecondLevelList = ElementNestedFlowMapping.userSecondLevelList;

	    List<WebElement> userNameFirstLevelList = ElementNestedFlowMapping.userFirstLevelList;

		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);
		
		BrowserOperation.implicitWait(1);
		
		
		try {
			
			gridUserNameThirdLevelList.get(0).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
					
		for (WebElement u : gridUserNameThirdLevelList) 
		{
			if (u.getText().contains(approver)) 
			{
				
				u.click();
				
			}
		}
		
		BrowserOperation.implicitWait(20);
		
		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);

		List<WebElement> userRoleList = ElementNestedFlowMapping.nestedFlowMappingUserRoleList;

		userRoleList.get(2).click();
		
		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);
		
		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingAction);
 

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingViewUsers);


		List<WebElement> userSecondLevelList = ElementNestedFlowMapping.userSecondLevelList;
		for (WebElement user : userSecondLevelList)
		{
			if (user.getText().contains(reviewer)) {
				user.click();
			}
		}
		
		
		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);

		BrowserOperation.implicitWait(2);
		
		
		try {
			
			gridUserNameSecondLevelList.get(0).click();
			
			System.out.println("unselected");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("selected--> not clicked");
		}

		BrowserOperation.implicitWait(1);
					
		for (WebElement u : gridUserNameSecondLevelList) 
		{
			
			
			if (u.getText().contains(reviewer)) 
			{
				
				u.click();
				
			}
			else
			{
				System.out.println("not match");
			}
		}
		
		BrowserOperation.implicitWait(20);
		
		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);

		userRoleList.get(3).click();

		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);

		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingAction);

		ElementNestedFlowMapping.nestedFlowMappingAdd.click();
		
		BasicOperation.exception(ElementNestedFlowMapping.nestedFlowMappingViewUsers);


		for (WebElement user : userNameFirstLevelList) {
			if (user.getText().contains(analyst)) {
				user.click();
			}
		}

		ElementNestedFlowMapping.nestedFlowMappingAddSubmit.click();

		BasicOperation.wait(ElementNestedFlowMapping.nestedFlowMappingAction);
			
		ElementNestedFlowMapping.organisationManagementIcon.click();
		
		ElementNestedFlowMapping.masterIcon.click();
		
		ElementNestedFlowMapping.homeIcon.click();
		
	}

	
}
	
	