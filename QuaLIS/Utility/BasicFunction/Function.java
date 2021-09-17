package BasicFunction;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import Config.ElementName;
import Config.TestDataName;
import Utility.BrowserOperation;

public class Function extends ElementName {
	
	public static boolean preCondition( HashMap< String, WebElement> element) throws InterruptedException
	{
						
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		BrowserOperation.implicitWait(1);
		
		boolean screen=true;
		
		try {
			
			element.get(ElementName.screen).click();
		} catch (Exception e) {
			
			screen=false;
			// TODO: handle exception
		}
		
	
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
		
		element.get(ElementName.home).click();

		
		return screen;
	}
		
}
