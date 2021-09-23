		
package BasicFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Config.ElementName;
import Config.ScreenName;
import Organisation.*;
import UserManagement.*;
import Utility.BasicOperation;

public class BasicMethod extends ElementName
{
	

	
	public static HashMap<String, String> add(String screenName, HashMap< String, WebElement> element,HashMap<String, List<WebElement>>list, String[]value )
	{
		PageFactory.initElements(driver, ElementDesignation.class);

		boolean actionStatus=false;
		
		boolean increaseStatus=false;
		
		boolean firstIndex=false;
		
		boolean gridNameStatus=false;
		
		boolean gridDescriptionStatus=false;
		
	
		String name=value[0];
		
		String description=value[1];
		
		
		System.out.println("Test Data Name            -----> "+name);
		
		System.out.println("Test Data Description     -----> "+description);
	
		
		element.get(module).click();
		
		element.get(subModule).click();
		
		element.get(screen).click();
		
		List<WebElement> nameListGrid=list.get(nameList);
		
		List<WebElement> descriptionListGrid=list.get(descriptionList);
		
		List<WebElement> checkboxListGrid=list.get(checkBoxList);
		
		
		int a=nameListGrid.size();
		
		System.out.println("Number of Data Before Add -----> "+a);
		
	
		element.get(action).click();
		
		element.get(add).click();
		
		element.get(ElementName.nameValue).sendKeys(name);
		
		element.get(ElementName.descriptionValue).sendKeys(description);
		
		element.get(addSubmitButton).click();
		
		
		try
		{
			BasicOperation.wait(element.get(action));
			
			actionStatus=true;
		}
		
		catch (Exception e)
		{
			actionStatus=false;
		}
			
	
		int b=nameListGrid.size();
		
		
		System.out.println("Number of Data After Add  -----> "+b);
		
	
		
		HashMap<String, String> status=new HashMap<String, String>();
		
		/*System.out.println(a);
		
		System.out.println(b);
		*/	
		
		int c=a+1;
		
		if(b==c)
		{
			increaseStatus=true;
			
			
		}
		else if(b==a)
		{
			
			
			increaseStatus=false;
		}
		else
		{
			
		}
		
		
		
		
		
		String firstIndexName=nameListGrid.get(0).getText();
		
		String firstIndexDescription=descriptionListGrid.get(0).getText();
		
			
		if(firstIndexName.equals(name))
		{
			firstIndex=true;
				
			
			System.out.println("Added Data shown in       -----> First Index");
		}
		else
		{
			
			
			System.out.println("Added Data shown in       -----> other than First Index");
		}
		
	
		System.out.println("Name in First Grid        -----> "+firstIndexName);
		
		System.out.println("Description in First Grid -----> "+firstIndexDescription);


		
		
		element.get(subModule).click();
		
		element.get(module).click();
		
	
		status.put("actionStatus",String.valueOf(actionStatus));
		
		status.put("increaseStatus",String.valueOf(increaseStatus));
		
		status.put("firstIndex",String.valueOf(firstIndex));
		
		
		
		
		
		return status;
		
				
	}
	
	public static void adda(String designation,List<WebElement> element, String[]value )
	{		

		String name=value[0];
		
		String description=value[1];
		
		element.get(0).click();
				
	}
	
	
	public static void pageFacturyClass(String screen)
	{
	/*	
		if(screen.equals(ScreenName.designation))
		{
			
			
			PageFactory.initElements(driver, ElementDesignation.class);
			
			System.out.println("des");
		}
		else if (screen.equals(ScreenName.department)) {
			
			PageFactory.initElements(driver, ElementDepartment.class);
			
		}
		*/
		
		
	}
	

}
