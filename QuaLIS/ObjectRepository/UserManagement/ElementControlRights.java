package UserManagement;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementControlRights {
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	
	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;
	
	@FindBy(id = "ID_Prev_1500_7013")
	public static WebElement controlRightsSideViewPrevious;
	
	@FindBy(id = "ID_TotalData_1500_7013")
	public static WebElement userManagementSideViewCount;
	
	@FindBy(id = "ID_Next_1500_7013")
	public static WebElement controlRightsSideViewNext;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_1500_7013_0\"]/dl[3]/dd/span")
	public static WebElement controlRightsSideViewName;
	

	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_53_0\"]/li")
	public static List<WebElement> controlList;
	
	



	@FindBy(id = "iFormID_53")
	public static WebElement controlRightsIcon;

	@FindBy(id = "ID_CTRL_UserRoleCombo")
	public static WebElement controlRightsFilterUserRole;
	
	
	@FindBy(id = "ID_CTRL_MasterConfigFind")
	public static WebElement controlRightsFilterFind;
	
	@FindBy(xpath = "//*[@id='ID_CTRL_MasterFilter']/a")
	public static WebElement controlRightsFilterClose;
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_53_0\"]/li")
	public static List<WebElement> controlRightsControlList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SCRCTRL_ControlRightsgetdiv\"]/div/div[1]/div[1]/p")
	public static List<WebElement> controlRightsScreenList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SCRCTRL_ControlRightsgetdiv\"]/div/div[2]")
	public static List<WebElement> controlRightsScreenCheckboxList;
	
	
	@FindBy(id = "ID_CTRL_ControlRightsFilter")
	public static WebElement controlRightsFilterIcon;
	

	@FindBy(id = "ID_CTRL_SCRControlRightsData")
	public static WebElement controlRightsScreen;


	@FindBy(id = "ID_CTRL_ControlRightsData")
	public static WebElement controlRightsScreenControls;


	@FindBy(id = "selectall")
	public static WebElement controlRightsSelectAll;

	@FindBy(xpath = "//*[@id=\"ID_CTRL_ControlRightsgetdiv\"]/div")
	public static List<WebElement> controlRightsScreenControlList;

	

	@FindBy(xpath = "//*[@id='ID_CTRL_ActionMenu']/a")
	public static WebElement controlRightsAction;

	@FindBy(id = "ID_CTRL_ControlRightsAddbutton")
	public static WebElement controlRightsAddRights;
	
	@FindBy(xpath = "//*[@id='ID_CRTL_OpenFilterPopUP']/button")
	public static WebElement controlRightsSearchControl;
	
	
	@FindBy(xpath = "//*[@id='ID_APC_ListDiv_53_0']/li")
	public static List< WebElement >controlRightsList;
	
	
	@FindBy(id = "ID_CTRL_SubmitScreen_Button")
	public static WebElement controlRightsAddSubmit;


	@FindBy(id = "ID_CTRL_CancelScreen_Button")
	public static WebElement controlRightsAddCancel;
	
	

}
