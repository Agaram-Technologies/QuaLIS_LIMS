package BasicFunction;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Alert.ElementAlert;
import BaseMaster.ElementUnit;
import Config.ElementName;
import Config.TestDataName;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class FunctionDelete  extends BrowserOperation
{	
	
	
	public static void delete(HashMap<String, String> value, HashMap< String, WebElement> element,HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameAdd);
						
		
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);
		
		element.get(ElementName.module).click();
		
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
		
		element.get(ElementName.delete).click();
		
		BasicOperation.esign("deleted");
	
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}
	

	public static void deleteMandatory(HashMap<String, String> value, HashMap< String, WebElement> element, HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameAddMandatory);
						
		
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);
		
		element.get(ElementName.module).click();
		
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
		
		element.get(ElementName.delete).click();
		
		BasicOperation.esign("deleted");
	
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}
	

	public static void deleteAll(HashMap<String, String> value, HashMap< String, WebElement> element, HashMap<String, List<WebElement>> list) throws InterruptedException
	{
		String name=value.get(TestDataName.nameEdit);
						
		
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		List<WebElement> checkBoxList=list.get(ElementName.checkBoxList);
		
		element.get(ElementName.module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		BasicOperation.exception(element.get(ElementName.tabHeader));
		
		
		for(int i=1; i>0; i++)
		{
			BasicOperation.exception(element.get(ElementName.action));
			
			element.get(ElementName.delete).click();
			
			BasicOperation.esign("deleted");
		
			try
			{
				BasicOperation.implicitWait(1);
				
				if(driver.findElement(By.id("ID_Lims_AlertMsg_0")).isDisplayed())
				{
					String a=driver.findElement(By.id("ID_Lims_AlertMsg_0")).getText();
					
					System.out.println(a);
					
					driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i")).click();
					
					BasicOperation.implicitWait(10);
					
					break;
					
					
				}
				
				
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			
			System.out.println("a");
			
		}
		
	
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
				
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}


		
	

}
