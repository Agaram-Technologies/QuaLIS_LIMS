package Configuration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementEsignControl {
	
	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;

	
	@FindBy(id="iFormID_122")
    public static WebElement esignControlIcon;
	
	
	
	@FindBy(xpath="//*[@id=\"ID_ESN_EsignatureMastergetdiv\"]/div/div[2]")
    public static List<WebElement> screenCheckboxList;
	
	@FindBy(xpath="//*[@id=\"ID_ESN_EsignatureMastergetdiv\"]/div")
    public static List<WebElement> screenList;
	
	
	@FindBy(xpath="//*[@id=\"ID_ESN_FormControlData\"]/div/div[1]/div[2]/input")
    public static List<WebElement> controlCheckboxList;
	
	
	
	
	///html/body/div[4]/div[2]/div[7]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/input
	
	@FindBy(id="ID_FTP_FTPDefaultbutton")
    public static WebElement FTPSetDefault;
	
	
	@FindBy(id="ID_FTP_FTPEditbutton")
    public static WebElement FTPEdit;
	
	
	@FindBy(id="ID_FTP_FTPTestConnection")
    public static WebElement FTPTestConnection;

}
