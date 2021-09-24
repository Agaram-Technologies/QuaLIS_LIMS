package UserManagement;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementUsers {
	

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
	
	
	

	@FindBy(id = "ID_US_UserData")
	public static WebElement usersTab;
	
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;

	@FindBy(id = "iFormID_3")
	public static WebElement usersIcon;
	
	
	

	@FindBy(id = "ID_US_Phno")
	public static WebElement userPhoneNumber;


	@FindBy(id = "ID_US_Initials")
	public static WebElement userEmployeeID;

	@FindBy(id = "ID_US_Qualification")
	public static WebElement usersQualification;

	@FindBy(id = "ID_US_BloodGroup")
	public static WebElement usersBloodGroup;

	@FindBy(id = "ID_US_Mobno")
	public static WebElement usersMobileNumber;


	@FindBy(xpath = "//*[@id=\"ID_US_UserActionMenu\"]/a")
	public static WebElement usersAction;
	

	@FindBy(id = "ID_US_UserAddbutton")
	public static WebElement usersAdd;

	@FindBy(id = "iFormID_70")
	public static WebElement usersDelete;
	

	@FindBy(id = "ID_US_DOF")
	public static WebElement usersDateOfJoin;

	

	@FindBy(id = "ID_US_UserEditbutton")
	public static WebElement usersEdit;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersRetire;

	@FindBy(id = "iFormID_70")
	public static WebElement usersRefresh;
	
	

	@FindBy(id = "iMenuID_1")
	public static WebElement usersPasswordReset;
	

	@FindBy(id = "ID_US_Loginid")
	public static WebElement usersloginID;

	@FindBy(id = "ID_US_Firstname")
	public static WebElement usersFirstName;
	
	

	@FindBy(id = "ID_US_Lastname")
	public static WebElement usersLastName;
	

	@FindBy(id = "ID_US_Email")
	public static WebElement usersMail;

	@FindBy(id = "ID_US_Department")
	public static WebElement usersDepartment;
	

	@FindBy(id = "ID_US_Designation")
	public static WebElement usersDesignation;
	

	@FindBy(id = "ID_US_JobDesc")
	public static WebElement usersJobInformation;

	@FindBy(id = "ID_US_Unlock")
	public static WebElement usersUnlock;
	


	@FindBy(id = "ID_US_CountryName")
	public static WebElement usersCountry;
	

	@FindBy(id = "ID_USR_UserRoleCombo")
	public static WebElement usersUserRole;
	
	@FindBy(id = "ID_US_Isactive")
	public static WebElement usersActive;
	

	@FindBy(id = "ID_US_Address1")
	public static WebElement usersAddressOne;

	@FindBy(id = "ID_US_Address2")
	public static WebElement usersAddressTwo;
	
	@FindBy(id = "ID_US_Address3")
	public static WebElement usersAddressThree;
	

	@FindBy(xpath = "//*[@id=\"ID_US_UserMasterDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> usersList;
	
	@FindBy(xpath = "//*[@id=\"ID_US_UserMasterDataBind\"]/div/div[2]")
	public static List<WebElement> usersCheckboxList;
	

	
	

	@FindBy(id = "ID_US_UserSubmitAdd")
	public static WebElement usersAddSubmit;

	@FindBy(id = "iFormID_70")
	public static WebElement usersAddCancel;
	


	@FindBy(id = "ID_US_UserSubmitEdit")
	public static WebElement usersEditSubmit;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersEditCancel;

	@FindBy(id = "ID_US_UserRole")
	public static WebElement usersUserRoleIcon;
	

	@FindBy(id = "ID_US_UserData")
	public static WebElement usersUsersIcon;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersDeputyUserIcon;

	@FindBy(xpath = "//*[@id=\"ID_US_UserActionMenu\"]/a")
	public static WebElement usersUserRoleAction;
	

	@FindBy(id = "ID_US_UserRoleAddbutton")
	public static WebElement usersUserRoleAdd;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersUserRoleEdit;

	@FindBy(id = "iFormID_70")
	public static WebElement usersUserRoleDelete;
	

	@FindBy(id = "ID_USR_UserRoleCombo")
	public static WebElement usersUserRoleUserRole;
	

	@FindBy(id = "ID_UR_Isactive")
	public static WebElement usersUserRoleUserRoleActive;

	@FindBy(id = "ID_US_UserRoleSubmitadd")
	public static WebElement usersUserRoleAddSubmit;
	

	@FindBy(id = "iMenuID_1")
	public static WebElement usersUserRoleAddCancel;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersUserRoleEditSubmit;

	@FindBy(id = "iFormID_70")
	public static WebElement usersUserRoleEditCancel;


	@FindBy(id = "iMenuID_1")
	public static WebElement usersDeputyUserAction;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersDeputyUserAdd;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersDeputyUserLoginID;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersDeputyUserUserRole;

	@FindBy(id = "iFormID_70")
	public static WebElement usersDeputyUserEdit;

	@FindBy(id = "iMenuID_1")
	public static WebElement usersDeputyUserActive;
	

	@FindBy(id = "iModuleID_3")
	public static WebElement usersDeputyUserAddCancel;

	@FindBy(id = "iFormID_70")
	public static WebElement usersDeputyUserAddSubmit;


}
