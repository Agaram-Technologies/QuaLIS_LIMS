package BasicFunction;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;

import Config.ElementName;
import Config.TestDataName;
import Utility.BasicOperation;

public class FunctionEdit  extends ElementName
{
	
	
	public static void editName(HashMap<String, String> value, HashMap< String, WebElement> element, HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String oldName=value.get(TestDataName.nameAdd);
		
		String newName=value.get(TestDataName.nameEdit);
		
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);
		
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		BasicOperation.implicitWait(1);
		
		try 
		{
			nameList.get(0).click();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		BasicOperation.implicitWait(10);
		
		for(WebElement a:nameList)
		{
			String aa=a.getText();
			
			if(aa.equals(oldName))
			{
				a.click();
			}
		}
		
			
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.edit).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.nameValue).clear();
		
		element.get(ElementName.nameValue).sendKeys(newName);
				
		element.get(ElementName.editSubmitButton).click();
		
		BasicOperation.esign("edited");
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}

	public static void editDescription(HashMap<String, String> value, HashMap< String, WebElement> element,HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameEdit);
		
		String description=value.get(TestDataName.descriptionEdit);
				
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);
		
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		BasicOperation.implicitWait(1);
		
		try 
		{
			nameList.get(0).click();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		BasicOperation.implicitWait(10);
		
		for(WebElement a:nameList)
		{
			String aa=a.getText();
			
			if(aa.equals(name))
			{
				a.click();
			}
		}
		
			
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.edit).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.descriptionValue).clear();
		
		element.get(ElementName.descriptionValue).sendKeys(description);
				
		element.get(ElementName.editSubmitButton).click();
		
		BasicOperation.esign("edited");
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}

	
	public static void editDescriptionNullToValue(HashMap<String, String> value, HashMap< String, WebElement> element, HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameEdit);
		
		String description=value.get(TestDataName.descriptionEdit);
				
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);

		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		BasicOperation.implicitWait(1);
		
		try 
		{
			nameList.get(0).click();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		BasicOperation.implicitWait(10);
		
		for(WebElement a:nameList)
		{
			String aa=a.getText();
			
			if(aa.equals(name))
			{
				a.click();
			}
		}
		
			
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.edit).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.descriptionValue).clear();
		
		element.get(ElementName.descriptionValue).sendKeys(description);
				
		element.get(ElementName.editSubmitButton).click();
		
		BasicOperation.esign("edited");
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}
	
	public static void editDescriptionValueToNull(HashMap<String, String> value, HashMap< String, WebElement> element,HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameEdit);
		
		String description=value.get(TestDataName.descriptionEdit);
				
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);

		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		BasicOperation.implicitWait(1);
		
		try 
		{
			nameList.get(0).click();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		BasicOperation.implicitWait(10);
		
		for(WebElement a:nameList)
		{
			String aa=a.getText();
			
			if(aa.equals(name))
			{
				a.click();
			}
		}
		
			
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.edit).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.descriptionValue).clear();
		
		element.get(ElementName.editSubmitButton).click();
		
		BasicOperation.esign("edited");
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}

	public static void delete(String screen,String[]name,  HashMap< String, WebElement> element,HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		
				
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);

		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		BasicOperation.implicitWait(1);
		
		try 
		{
			nameList.get(0).click();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		BasicOperation.implicitWait(20);
		
		for(int i=0; i<name.length; i++)
		{
			for(WebElement namea:nameList)
			{
				if(namea.getText().equals(name[i]))
				{
					namea.click();
					
					BasicOperation.exception(element.get(ElementName.action));
					
					element.get(ElementName.delete).click();
					
					BasicOperation.wait(element.get(ElementName.action));
					
					BasicOperation.exception(element.get(ElementName.tabHeader));
					
				}
			}
		}
		
	
		
		element.get(ElementName.subModule).click();
		
		
		element.get(module).click();
		
		
		
		
		
	}
	
}
