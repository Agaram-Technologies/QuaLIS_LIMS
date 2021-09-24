package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Esign.ElementEsign;

public class ElementPasswordPolicy {
	
	//ElementEsign

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_31")
	public static WebElement configurationIcon;

	@FindBy(id = "iFormID_51")
	public static WebElement passwordPolicyIcon;
	
	
	
	@FindBy(id = "ID_PWD_UserRoleCombo")
	public static WebElement passwordPolicyFilterUserRole;

	@FindBy(id = "ID_PWD_FindTest")
	public static WebElement passwordPolicyFilterFind;

	@FindBy(xpath = "//*[@id='ID_PWD_PWDMasterFilter']/a")
	public static WebElement passwordPolicyFilterClose;
	
	
	@FindBy(id = "ID_PWD_filter")
	public static WebElement passwordPolicyFilterIcon;

	@FindBy(xpath = "//*[@id='ID_PWD_ActionMenu']/a")
	public static WebElement passwordPolicyAction;
	

	@FindBy(xpath = "//*[@id=\"ID_PWD_OpenFilterPopUP\"]/button")
	public static WebElement passwordPolicyCopyRole;
	

	@FindBy(xpath = "//*[@id=\"selectall\"]/p")
	public static WebElement passwordPolicyCopyRoleSelectAll;
	
	
	
	
	@FindBy(id = "ID_PWD_SubmitScreen_Button")
	public static WebElement passwordPolicyCopySubmit;

	@FindBy(id = "ID_PWD_PWDEditbutton")
	public static WebElement passwordPolicyCopyCancel;
	
	
	@FindBy(id = "ID_PWD_PWDAddbutton")
	public static WebElement passwordPolicyAdd;

	@FindBy(id = "ID_PWD_PWDEditbutton")
	public static WebElement passwordPolicyEdit;
	
	// 
	@FindBy(id = "ID_PWD_PWDDeletebutton")
	public static WebElement passwordPolicyDelete;
	
	
	@FindBy(id = "ID_PWD_PWDCopy")
	public static WebElement passwordPolicyCopy;

	@FindBy(id = "ID_PWD_PWDApprove")
	public static WebElement passwordPolicyApprove;


	@FindBy(id = "ID_PWD_PWDView")
	public static WebElement passwordPolicyView;
	
	@FindBy(id = "ID_PWD_PWDRefreshbutton")
	public static WebElement passwordPolicyRefresh;

	@FindBy(id = "ID_PWD_Policyname")
	public static WebElement passwordPolicy;

	
	@FindBy(id = "ID_PWD_minnumchar")
	public static WebElement passwordPolicyNumeric;

	@FindBy(id = "ID_PWD_minnolowchar")
	public static WebElement passwordPolicyLowerCase;


	@FindBy(id = "ID_PWD_minupper")
	public static WebElement passwordPolicyUpperCase;

	@FindBy(id = "ID_PWD_Specialcharr")
	public static WebElement passwordPolicySpecialCharacter;
	
	@FindBy(id = "ID_PWD_MinPassLength")
	public static WebElement passwordPolicyMinimumLength;

	@FindBy(id = "ID_PWD_MaxPassLength")
	public static WebElement passwordPolicyMaximumLength;
	
	@FindBy(id = "ID_PWD_Faileattempt")
	public static WebElement passwordPolicyFailedAttempt;


	@FindBy(id = "ID_PWD_Expirypolicyreq")
	public static WebElement passwordPolicyExpiredPolicy;
	
	@FindBy(id = "ID_PWD_Expirypolicy")
	public static WebElement passwordPolicyExpiredPolicyDays;

	
	@FindBy(id = "ID_PWD_Remainder")
	public static WebElement passwordPolicyAlertPolicyDays;

	
	@FindBy(id = "ID_PWD_scomments")
	public static WebElement passwordPolicyComments;

	              
	
	
	@FindBy(id = "ID_PWD_PWDSubmitADD")
	public static WebElement passwordPolicyAddSubmit;

	
	@FindBy(id = "ID_PWD_PWDCancel")
	public static WebElement passwordPolicyAddCancel;

	
	@FindBy(id = "ID_PWD_PWDSubmitEDIT")
	public static WebElement passwordPolicyEditSubmit;

	
	@FindBy(id = "ID_PWD_PWDCancel")
	public static WebElement passwordPolicyEditCancel;


}
