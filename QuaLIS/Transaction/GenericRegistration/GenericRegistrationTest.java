package GenericRegistration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BasicOperation;
import Utility.BrowserOperation;

public class GenericRegistrationTest extends BrowserOperation{
	
	public static void testAdd(String [] test) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		WebDriverWait wait11 = new WebDriverWait(driver, 20);
		
		ElementGenericRegistration.testIcon.click();
		
		BasicOperation.wait(ElementGenericRegistration.testIcon);

		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));

		try {
			ElementGenericRegistration.genericRegistrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementGenericRegistration.genericRegistrationAction.click();

		}

		ElementGenericRegistration.testAdd.click();

		try {
			ElementGenericRegistration.testViewTestList.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementGenericRegistration.testViewTestList.click();

		}
		
		BrowserOperation.implicitWait(1);
		
		String a=test[0];
		
		System.out.println(a);
		
		try
		{
			
		
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		if(test[0]==null)
		{
			ElementGenericRegistration.testSelectAll.click();
		}
		else
		{
			int testCount=test.length;
			
			
			
			if(testCount>0)
			{
				ElementGenericRegistration.testViewList.click();
				
				if(test[0].equalsIgnoreCase("all"))
				{
					ElementGenericRegistration.testSelectAll.click();
					
					System.out.println("se");
				}
				else
				{
						
					System.out.println("No Select all");
					List<WebElement> testList=ElementGenericRegistration.testViewTestTestList;
					
					
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
								System.out.println(te.getText());
								
							}
						}
					}
					
				
				}
			}
					
		}
		
		
		BrowserOperation.implicitWait(20);
		

	

		ElementGenericRegistration.testAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));

	}

}
