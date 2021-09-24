package BasicFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class copy {
	
	public static void datePicker(WebElement element, String a) throws AWTException
	
	
	{
		
		
		StringSelection fileLocationString = new StringSelection(a);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocationString, null);
		
		Robot rob = new Robot();
		
		

		rob.keyPress(KeyEvent.VK_CONTROL);

		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_CONTROL);
	}


}
