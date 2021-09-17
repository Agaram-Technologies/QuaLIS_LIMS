package BasicFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class Date {
	

public static void dateEnter(WebElement a) throws AWTException {
		
		a.click();
		
		Robot rob = new Robot();
		
		
		
		rob.keyPress(KeyEvent.VK_ENTER);

		rob.keyRelease(KeyEvent.VK_ENTER);
		// TODO Auto-generated method stub
		
	}

}
