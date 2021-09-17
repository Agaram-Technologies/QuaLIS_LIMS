package BasicFunction;

import java.io.IOException;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BaseMaster.ElementUnit;
import Config.ElementName;
import Config.TestDataName;
import Organisation.ElementDepartment;
import UserManagement.ElementDesignation;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class FunctionAdd extends ElementName {
	

	
	public static void addAllField(HashMap <String, String> value, HashMap< String, WebElement> element) throws InterruptedException
	{
		
				
		String name=value.get(TestDataName.nameAdd);
		
		String description=value.get(TestDataName.descriptionAdd);
	
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		
		   element.get(ElementName.tabHeader).click();
			
			BasicOperation.exception(element.get(ElementName.action));
			
			element.get(ElementName.add).click();
			
			BasicOperation.exception(element.get(ElementName.nameValue));
					
			element.get(ElementName.nameValue).sendKeys(name);
			
			element.get(ElementName.descriptionValue).sendKeys(description);
			
			element.get(ElementName.addSubmitButton).click();
			
			BasicOperation.wait(element.get(ElementName.action));
			
			element.get(ElementName.home).click();
			
			element.get(ElementName.subModule).click();

			element.get(ElementName.module).click();
	  
		
		
	}
	
	public static void addMandatoryField(HashMap <String, String> value, HashMap< String, WebElement> element) throws InterruptedException
	{
		String name=value.get(TestDataName.nameAddMandatory);
	
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		element.get(ElementName.tabHeader).click();
		
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.add).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.nameValue).sendKeys(name);
				
		element.get(ElementName.addSubmitButton).click();
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}


	
}
