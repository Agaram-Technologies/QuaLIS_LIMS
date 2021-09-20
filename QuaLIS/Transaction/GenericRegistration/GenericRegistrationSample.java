package GenericRegistration;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Config.OutsourceStatus;
import Config.RegistrationDetail;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class GenericRegistrationSample extends BrowserOperation
{	
	public static void samplePreCondition(String preRegisterNumber,String registrationSubType) throws InterruptedException
	{
		
		System.out.println(preRegisterNumber);
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		BasicOperation.wait(ElementGenericRegistration.sampleTypeIcon);
		
		BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);
		
		List<WebElement> elements;
		
		if(registrationSubType.equals(RegistrationDetail.claimTestKorean))
		{
			System.out.println("locked");
			
			PageFactory.initElements(driver, ElementJPDCClaimTest.class);
			
			elements=ElementJPDCClaimTest.preRegisterNumberList;
			
			try 
			{
				elements.get(0).click();
				
				System.out.println("unselected");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			for(WebElement element:elements)
			{
				System.out.println(preRegisterNumber);
				
				if(element.getText().equals(preRegisterNumber))
				{
					element.click();
				}
				else
				{
					System.out.println(element.getText());
				}
			}					
		}
		
		
		ElementGenericRegistration.sampleIcon.click();
				
		BasicOperation.wait(ElementGenericRegistration.sampleSampleIcon);
		
		BasicOperation.exception(ElementGenericRegistration.sampleSampleIcon);
			
	}
	
	
	
	
	public static void sampleAdd(String sample, String quantity, String unit, boolean outSource,String remark,String[]test) throws InterruptedException, AWTException
	{
		
		
		System.out.println(unit);
		
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		BasicOperation.wait(ElementGenericRegistration.sampleSampleIcon);
		
		BasicOperation.exception(ElementGenericRegistration.genericRegistrationAction);
		
		ElementGenericRegistration.sampleSampleAdd.click();
		
		BasicOperation.exception(ElementGenericRegistration.sampleSampleName);
		
		BasicOperation.sendKeys(ElementGenericRegistration.sampleSampleName, sample);
		
	
		if(quantity.equals(null))
		{
			quantity="100";
		}
		
		BasicOperation.sendKeys(ElementGenericRegistration.sampleSampleQuanity, quantity);
		
		try {
			BasicOperation.select(ElementGenericRegistration.sampleSampleUnit, unit);
			
			System.out.println("selected "+unit);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			BasicOperation.selectByIndex(ElementGenericRegistration.sampleSampleUnit, 0);
		}
		
		
		BasicOperation.sendKeys(ElementGenericRegistration.sampleSampleRemarks, remark);
		
		
		if(outSource==true)
		{
			BasicOperation.select(ElementGenericRegistration.sampleOutsource, OutsourceStatus.yes);
		}
		else
		{
			try 
			{
				BasicOperation.select(ElementGenericRegistration.sampleOutsource, OutsourceStatus.No);
				
			} 
			catch (Exception e) 
			{
				
			}

		}
		
		int testCount=test.length;
		
		
		
		if(testCount>0)
		{
			ElementGenericRegistration.sampleSampleViewTestList.click();
			
			if(test[0].equalsIgnoreCase("all"))
			{
				ElementGenericRegistration.sampleSampleTestSelectAll.click();
				
				System.out.println("se");
			}
			else
			{
					
				System.out.println("No Select all");
				List<WebElement> testList=ElementGenericRegistration.sampleSampleTestList;
				
				
				for(WebElement te:testList)
				{
					for(int i=0; i<test.length;i++)
					{
						if(te.getText().contains(test[i]))
						{
							te.click();
						}
						else
						{
							te.click();
							
							System.out.println(te.getText());
							
						}
					}
				}
				
			
			}
		}
				
		JavascriptExecutor  a=(JavascriptExecutor)driver;
		
		
		a.executeScript("window.scroll(0,0)", "");
	
		
		BasicOperation.click(ElementGenericRegistration.sampleSampleAddSubmit);
		
		
	}
	
	
	public static void sampleAddPostConditionToTest() throws InterruptedException
	{
					
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		BasicOperation.wait(ElementGenericRegistration.sampleIcon);
		
		BasicOperation.exception(ElementGenericRegistration.sampleIcon);
		
		BasicOperation.wait(ElementGenericRegistration.sampleIcon);
			
		BasicOperation.exception(ElementGenericRegistration.testIcon);
		
	}

	public static void sampleAddPostConditionToSampleType() throws InterruptedException
	{
					
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		BasicOperation.wait(ElementGenericRegistration.sampleIcon);
		
		BasicOperation.exception(ElementGenericRegistration.sampleIcon);
		
		BasicOperation.wait(ElementGenericRegistration.sampleTypeIcon);
			
		BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);
		
	}


}




















