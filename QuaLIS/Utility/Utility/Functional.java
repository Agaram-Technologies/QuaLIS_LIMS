package Utility;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import Basic.ElementFunction;

public class Functional extends ElementFunction
{
	
	public static void add(List<WebElement> nameList, Map<String,WebElement> element, String names, String descriptions) throws InterruptedException
	{
	//	BasicOperation.wait(element.get(action));
		
		Thread.sleep(2000);
		
		System.out.println("started");
		
		element.get(action).click();
		
		BasicOperation.exceptionAction(element.get(action), element.get(add));
		
		BasicOperation.exceptionInputHandling(element.get(name));
		
		element.get(name).sendKeys(names);
		
		element.get(description).sendKeys(descriptions);
		
		element.get(addSubmit).click();
		
		try {
			
			BasicOperation.wait(element.get(action));
			
		} catch (Exception e) {
			
			
			// TODO: handle exception
		}
		
		
	}
	
	public static void withoutEditAuditTrail(List<WebElement> element) throws InterruptedException
	{
		element.get(0).click();
		
		element.get(1).click();
		
		element.get(2).click();
		
		BasicOperation.wait(element.get(3));
		
		try {
			
			element.get(3).click();
			
		} catch (Exception e) {
			
			Thread.sleep(2000);
			element.get(3).click();
			
			// TODO: handle exception
		}
		
		element.get(5).click();
		
		if(element.get(9).isDisplayed())
		{
			element.get(9).click();
		}
		
		BasicOperation.wait(element.get(3));
		
		element.get(1).click();
		
		element.get(0).click();
		
		
	}
	
	public static void add(List<WebElement> list,String name, String description)
	{
		list.get(0).click();
		
		list.get(1).click();
		
		list.get(2).click();
		
		list.get(3).click();
		
		list.get(4).click();
		
		list.get(5).sendKeys(name);
		
		list.get(6).sendKeys(description);
		
		list.get(7).click();
		
		list.get(1).click();
		
		list.get(0).click();
	}
	
	
	

}
