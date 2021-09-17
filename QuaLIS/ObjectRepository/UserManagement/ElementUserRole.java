package UserManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;


public class ElementUserRole extends ElementName{
	
	public static String approve="Approval_";
	
	public static String result ="Result_";
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_USRR_UserRoleMasterHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_USRR_UserRoleMasterHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;

	@FindBy(id = "iFormID_70")
	public static WebElement userRoleIcon;
	

	@FindBy(xpath = "//*[@id='ID_USRR_UserRoleMasterDataBind']/div/div[1]/div[2]/p")
	public static List<WebElement> userRoleDescriptionList;
	
	
	@FindBy(xpath = "//*[@id='ID_USRR_UserRoleActionMenu']/a")
	public static WebElement userRoleAction;
	
	@FindBy(xpath = "//*[@id='ID_USRR_UserRoleMasterDataBind']/div/div[1]/div[1]/p")
	public static List<WebElement> userRoleList;
	
	@FindBy(xpath = "//*[@id=\"ID_USRR_UserRoleMasterDataBind\"]/div/div[1]/div[3]/input")
	public static List<WebElement> userRoleApprovalFlowList;
	
	@FindBy(xpath = "//*[@id=\"ID_USRR_UserRoleMasterDataBind\"]/div/div[1]/div[4]/input")
	public static List<WebElement> userRoleResultEntryList;

	
	@FindBy(id = "ID_USRR_UserRoleAddbutton")
	public static WebElement userRoleCheckboxList;
	
	

	@FindBy(id = "ID_USRR_UserRoleAddbutton")
	public static WebElement userRoleAdd;
	
	
	@FindBy(id = "ID_USRR_UserRoleName")
	public static WebElement userRole;
	

	@FindBy(id = "ID_USRR_Desc")
	public static WebElement userRoleDescription;
	

	@FindBy(id = "ID_USRR_UserRoleEditbutton")
	public static WebElement userRoleEdit;


	@FindBy(id = "ID_USRR_UserRoleDeletebutton")
	public static WebElement userRoleDelete;

	@FindBy(id = "ID_USRR_UserRoleSavebutton")
	public static WebElement userRolePasswordReset;

	@FindBy(id = "ID_USRR_UserRoleRefreshbutton")
	public static WebElement userRoleRefresh;
	
	@FindBy(id = "ID_USRR_UserRoleSavebutton")
	public static WebElement userRoleSave;
	
	
	
	@FindBy(id = "ID_USRR_Add_Submit")
	public static WebElement userRoleAddSubmit;


	@FindBy(id = "ID_USRR_USRRCancel")
	public static WebElement userRoleAddCancel;

	@FindBy(id = "ID_USRR_EDIT_Submit")
	public static WebElement userRoleEditSubmit;

	@FindBy(id = "ID_USRR_USRRCancel")
	public static WebElement userRoleEditCancel;
	
	@FindBy(id = "ID_USRR_UserRoleSData")
	public static WebElement userRoleTabIcon;

	
	

	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, userManagementIcon);
		
		element.put(screen, userRoleIcon);
		
		element.put(action, userRoleAction);
		
		element.put(add, userRoleAdd);
		
		element.put(edit, userRoleEdit);
		
		element.put(delete, userRoleDelete);
		
		element.put(nameValue, userRole);
		
		element.put(descriptionValue, userRoleDescription);
		
		element.put(addSubmitButton, userRoleAddSubmit);
		
		element.put(editSubmitButton, userRoleEditSubmit);
		
		element.put(tabHeader, userRoleTabIcon);
		
		element.put(home, homeIcon);
	
		
		return element;
	}
	
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, userRoleList);
		 
		 elements.put(descriptionList, userRoleDescriptionList);
		 
	//	 elements.put(checkBoxList, userRoleCheckboxList);
		 
		return elements;
	}
	
	
	
	
	
}
