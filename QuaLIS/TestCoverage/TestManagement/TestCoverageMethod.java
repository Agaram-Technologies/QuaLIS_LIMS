package TestManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageMethod extends BrowserOperation {
	
	public static void methodAddAllField(String methodCategory, String method, String description) throws InterruptedException
	{
	
		BrowserOperation.implicitWait(2);
		try 
		{
			PageFactory.initElements(driver, ElementMethod.class);
			
			ElementMethod.masterIcon.click();
		}
		catch (Exception e) {
			
			System.out.println("not available");
			// TODO: handle exception
		}
		
		ElementMethod.testManagementIcon.click();
		
		
		ElementMethod.methodIcon.click();
		
		BasicOperation.exception(ElementMethod.methodTabIcon);
		
		BasicOperation.exception(ElementMethod.methodAction);
		
		System.out.println("done");
		
		ElementMethod.methodAdd.click();
		
		
		BasicOperation.exception(ElementMethod.method);
		
		BasicOperation.selectByVisibleText(ElementMethod.methodCategory, methodCategory);
		
		ElementMethod.method.sendKeys(method);
		
		ElementMethod.methodDescription.sendKeys(description);
	
		
		ElementMethod.methodAddSubmit.click();
		
		
		BasicOperation.wait(ElementMethod.methodAction);
		
		ElementMethod.testManagementIcon.click();
		
		ElementMethod.masterIcon.click();
	
		ElementMethod.homeIcon.click();
		

	}
	
}
