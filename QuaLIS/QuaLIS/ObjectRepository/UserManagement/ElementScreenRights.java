package UserManagement;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Utility.BrowserOperation;

public class ElementScreenRights  extends BrowserOperation{

	@FindBy(xpath = "//*[@id=\"ID_SCR_ScreenRightsData\"]")
	public static WebElement screenRightsTabIcon;	
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	
	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;

	@FindBy(id = "iFormID_52")
	public static WebElement screenRightsIcon;

	@FindBy(id = "ID_SCR_UserRoleCombo")
	public static WebElement screenRightsFilterUserRole;
	
	
	@FindBy(id = "ID_SCR_ScreenRightsFind")
	public static WebElement screenRightsFilterFind;
	
	@FindBy(xpath = "//*[@id='ID_SCR_MasterFilter']/a")
	public static WebElement screenRightsFilterClose;
	
	
	@FindBy(id = "ID_SCR_ScreenRightsFilter")
	public static WebElement screenRightsFilterIcon;
	

	@FindBy(xpath = "//*[@id='ID_SCR_Tabs']/div[2]/a")
	public static WebElement screenRightsAction;

	@FindBy(id = "ID_SCR_ScreenRightsAddbutton")
	public static WebElement screenRightsAddRights;
	
	@FindBy(xpath = "//*[@id='ID_SCR_OpenFilterPopUP']/button")
	public static WebElement screenRightsSearchScreen;
	

	@FindBy(id = "ID_SCR_SubmitScreen_Button")
	public static WebElement screenRightsAddSubmit;

	@FindBy(xpath = "//*[@id='ID_SCR_FilterPopUp1']/span/div/input")
	public static WebElement screenRightsSearchField;

	@FindBy(id = "ID_SCR_CancelScreen_Button")
	public static WebElement screenRightsAddCancel;

	@FindBy(id = "ID_SCR_ScreenRightsDeletebutton")
	public static WebElement screenRightsDeleteRights;

	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_52_0\"]/li")
	public static List< WebElement >screenRightsList;
			
	@FindBy(xpath = "//*[@id=\"ID_SCR_ScreenRightsgetdiv\"]/div/div[1]/div[2]")
	public static List< WebElement >screenList;
	
	@FindBy(id = "selectall")
	public static WebElement screenRightsSelectAll;
	
	
	public static HashMap<String, WebElement> element()
	{
		HashMap<String, WebElement> menu=new HashMap<String, WebElement>();
		
		menu.put(ElementName.module, masterIcon);
		
		menu.put(ElementName.subModule, userManagementIcon);
		
		menu.put(ElementName.home, homeIcon);
		
		menu.put(ElementName.screen, screenRightsIcon);
		
		return menu;
		
	}
	
	
}
