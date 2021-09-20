package TestGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Settings.RegistrationCategory;
import TestManagement.ElementTestCategory;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageTestGroup extends BrowserOperation{
	
	
		
	public static void testGroupCategoryBasedFlowNo(String registrationCategory, String category, String specName, String fieldValue, String testCategory, String testAbbreviation) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTestGroup.class);

		ElementTestGroup.masterIcon.click();
				
		ElementTestGroup.testGroupManagementIcon.click();
				
		ElementTestGroup.testGroupIcon.click();
		
		BasicOperation.selectByVisibleText(ElementTestGroup.testGroupFilterRegistrationCategory, registrationCategory);
				
		BasicOperation.selectByVisibleText(ElementTestGroup.testGroupFilterCategory, category);

		ElementTestGroup.testGroupFilterFind.click();
		
		BasicOperation.exception(ElementTestGroup.testGroupSpecificationIcon);
		
		BasicOperation.exception(ElementTestGroup.testGroupSpecificationAction);

	
		ElementTestGroup.testGroupSpecificationAdd.click();
		
		BasicOperation.exception(ElementTestGroup.testGroupSpecification);
		
		ElementTestGroup.testGroupSpecificationFirstValue.sendKeys(fieldValue);
				
		ElementTestGroup.testGroupSpecification.sendKeys(specName);
				
		ElementTestGroup.testGroupSpecificationAddSubmit.click();
		
		BasicOperation.wait(ElementTestGroup.testGroupSpecificationAction);
		
		ElementTestGroup.testGroupTestDetailsIcon.click();
		
		BasicOperation.wait(ElementTestGroup.testGroupTestDetailTestAction);

		BasicOperation.exception(ElementTestGroup.testGroupTestDetailTestAction);
 
		ElementTestGroup.testGroupTestDetailTestAdd.click();
		
		BasicOperation.selectByVisibleText(ElementTestGroup.testGroupTestDetailTestTestCategory, testCategory);
					
		ElementTestGroup.testGroupTestDetailTestFind.click();
		
		BasicOperation.selectTextFromList(ElementTestGroup.testGroupTestDetailTestTestList, testAbbreviation);
			
		ElementTestGroup.testGroupTestDetailTestAddSubmit.click();
		
		ElementTestGroup.testGroupTestDetailTestTestBack.click();
		
		BasicOperation.wait(ElementTestGroup.testGroupSpecificationAction);
		
		BasicOperation.exception(ElementTestGroup.testGroupSpecificationAction);
		
		ElementTestGroup.testGroupSpecificationComplete.click();
			
		ElementTestGroup.testGroupManagementIcon.click();
		
		ElementTestGroup.masterIcon.click();
		
		ElementTestGroup.homeIcon.click();
			
	}
	}
