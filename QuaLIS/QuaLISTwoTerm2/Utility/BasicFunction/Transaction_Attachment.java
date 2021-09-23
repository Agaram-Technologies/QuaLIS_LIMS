package BasicFunction;

import java.util.HashMap;

import java.util.Map;

import org.openqa.selenium.WebElement;

import Config.ElementName;
import Utility.BasicOperation;

public class Transaction_Attachment {
	
	
	public static void attachmentAdd(Map<String, WebElement> map,String[]data) throws InterruptedException
	{
		String screen=data[0];
		
		String file=data[1];
		
		String description=data[2];
		
		BasicOperation.exception(map.get(ElementName.attachmentIcon));
		
		BasicOperation.exception(map.get(ElementName.attachmentAction));
		
		map.get(ElementName.attachmentAdd).click();
		
		BasicOperation.exception(map.get(ElementName.attachmentDescription));
		
		
			
	/*	map.get(ElementName.attachment).sendKeys(file);
		
		map.get(ElementName.attachmentDescription).sendKeys(description);
	*/	
		map.get(ElementName.attachmentAddSubmit).click();
		
		BasicOperation.wait(map.get(ElementName.attachmentAction));
		
		BasicOperation.exception(map.get(ElementName.attachmentIcon));
		
	}
	
	public static void sampleTypeAttachmentEditName()
	{
		
	}
	
	public static void sampleTypeAttachmentEditDescription()
	{
		
	}
	
	public static void sampleTypeAttachmentDelete()
	{
		
	}

}
