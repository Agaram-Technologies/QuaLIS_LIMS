package BasicFunction;

import java.util.HashMap;

import java.util.Map;

import org.openqa.selenium.WebElement;

import Config.ElementName;
import Utility.BasicOperation;
public class Transaction_Comments {
	
	public static void commentsAdd(Map<String,WebElement>element,String[]data) throws InterruptedException
	{
		String screen=data[0];
		
		String comment=data[1];
			
		BasicOperation.exception(element.get(ElementName.commentsIcon));
		
		BasicOperation.wait(element.get(ElementName.commentsAction));
		
		BasicOperation.exception(element.get(ElementName.commentsAction));
		
		element.get(ElementName.commentsAdd).click();
		
		BasicOperation.exception(element.get(ElementName.comments));
			
		element.get(ElementName.comments).sendKeys(comment);
		
		element.get(ElementName.commentsAddSubmit).click();
		
		BasicOperation.wait(element.get(ElementName.commentsAction));
		
		BasicOperation.exception(element.get(ElementName.commentsIcon));
		
	}

}
