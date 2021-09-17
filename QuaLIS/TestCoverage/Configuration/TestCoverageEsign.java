package Configuration;


import java.io.IOException;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BrowserOperation;


public class TestCoverageEsign extends BrowserOperation {
	
	
	
	
	public static void esignDisable() throws IOException, InterruptedException 
	
	{
		
		
		
		
		PageFactory.initElements(driver, ElementEsignControl.class);
		
		ElementEsignControl.masterIcon.click();
		
		ElementEsignControl.configurationIcon.click();
		
		ElementEsignControl.esignControlIcon.click();
		
		List<WebElement> screenCheckboxList=ElementEsignControl.screenCheckboxList;
		
		List<WebElement> controlCheckboxList=ElementEsignControl.controlCheckboxList;
		
		List<WebElement> screenList=ElementEsignControl.screenList;
		
		
		

		
		
		
		
		
		int i=screenCheckboxList.size();
		
		for(int j=0; j<i; j++)
		{
			String d=screenCheckboxList.get(j).getAttribute("checkboxselect");
			
			if(d.equals("1"))
			{
			
			screenList.get(j).click();
			}
			
		}
		
		
		
		for(int j=0; j<i; j++)
		{
			screenList.get(j).click();
			
			int a=controlCheckboxList.size();
			
			for(int b=0; b<a; b++)
			{
				
				
				WebElement d=controlCheckboxList.get(b);
				
				try
				{

					if(d.isSelected()==true)
					{
						d.click();
					}
					
				}catch (Exception e) {
					
					Thread.sleep(3000);
					
					if(d.isSelected()==true)
					{
						d.click();
					}
					// TODO: handle exception
				}
				
				
				
				
				
				/*try
				{
					if(controlCheckboxList.get(b).isSelected())
					{
						controlCheckboxList.get(b).click();
					}
				}
				catch (Exception e)
				{
					Thread.sleep(3000);
					
					if(controlCheckboxList.get(b).isSelected())
					{
						controlCheckboxList.get(b).click();
					}
				}
				*/
			}
		}
		
		
		
		
		
		
		
		
	
			
			
			
			
	
		
		ElementEsignControl.configurationIcon.click();
		
		ElementEsignControl.masterIcon.click();
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


