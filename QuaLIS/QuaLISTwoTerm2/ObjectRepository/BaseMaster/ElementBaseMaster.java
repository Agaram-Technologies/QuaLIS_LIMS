package BaseMaster;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementBaseMaster  {
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;

}
