package Configuration;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElementApprovalConfiguration {

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_31")
	public static WebElement configurationIcon;

	@FindBy(id = "iFormID_55")
	public static WebElement approvalConfigurationIcon;
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ApprovalConfiggetdiv\"]/div")
	public static List<WebElement> approvalConfigurationList;
	

	
	
	
	@FindBy(id = "ID_APC_ApprovalSubTypeCombo")//ID_APC_ApprovalSubTypeCombo
	public static WebElement approvalConfigurationFilterApprovalType;

	@FindBy(id = "ID_APC_ApprovalConfigFind")
	public static WebElement approvalConfigurationFilterFind;

	@FindBy(xpath = "//*[@id='ID_APC_ApprovalFilter']/a")
	public static WebElement approvalConfigurationFilterClose;
	
	@FindBy(id = "ID_APC_RegTypeCombo")
	public static WebElement approvalConfigurationRegistrationType;

	@FindBy(id = "ID_APC_RegSubTypeCombo")
	public static WebElement approvalConfigurationRegistrationSubType;
	
//	
	
	@FindBy(xpath = "//*[@id='ID_APC_ApprovalConfigFilter']")
	public static WebElement approvalConfigurationFilterIcon;

	@FindBy(xpath = "//*[@id='ID_APC_Tabs']/div[2]/a")
	public static WebElement approvalConfigurationAction;

	@FindBy(id = "ID_APC_ApprovalConfigAddbutton")
	public static WebElement approvalConfigurationCreateVersion;

	@FindBy(id = "ID_APC_ApprovalConfigEditbutton")
	public static WebElement approvalConfigurationEditVersion;
	
	
	@FindBy(id = "ID_APC_ApprovalConfigCopybutton")
	public static WebElement approvalConfigurationCopy;
	

	
	@FindBy(id = "ID_APC_VersionName")
	public static WebElement approvalConfiguration;
	
	@FindBy(id = "ID_APC_ApprovalConfigAppbutton")
	public static WebElement approvalConfigurationApprove;



	@FindBy(id = "ID_APC_VersionName")
	public static WebElement approvalConfigurationTestGroup;
	
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_ApprovalStatus')]")
	public static WebElement approvalConfigurationApprovalStatus;
	
	

	@FindBy(xpath = "//*[@id=\"selectall\"]/p")
	public static WebElement approvalConfigurationTestGroupFilterSelectAll;
	
	

	@FindBy(xpath = "//*[@id=\"ID_APC_FilterPopUp_1\"]/span/div/span/i")
	public static WebElement approvalConfigurationTestGroupFilterClose;
	

	@FindBy(xpath = "//*[@id=\"ID_APC_FilterPopUp_1\"]/span/div/span/i")
	public static WebElement approvalConfigurationTestGroupValidationStatusFind;
	
	
	

	@FindBy(xpath = "//*[@id=\"selectall\"]/p")
	public static WebElement approvalConfigurationTestGroupValidationSelectAll;



	
	@FindBy(id = "ID_APC_AprovalConfigADDSave")
	public static WebElement approvalConfigurationUserRoleSave;


					//ID_APC_AprovalConfigADDSave
	
	@FindBy(id = "ID_APC_AutoApproval")
	public static WebElement approvalConfigurationAutoApproval;

	@FindBy(id = "ID_APC_Joballocation")
	public static WebElement approvalConfigurationJobAllocation;

	
	@FindBy(id = "ID_APC_AutoJobAllot")
	public static WebElement approvalConfigurationAutoJobAllot;
	
	
	
	@FindBy(id = "ID_APC_AprovalConfigADDSave")
	public static WebElement approvalConfigurationVersionAddSave;


	
	@FindBy(id = "ID_APC_AprovalConfigCancel")
	public static WebElement approvalConfigurationVersionAddCancel;


	@FindBy(id = "ID_APC_RoleConfigTab")
	public static WebElement approvalConfigurationRoleConfigurationIcon;
	

	@FindBy(id = "ID_APC_NewVersionTab")
	public static WebElement approvalConfigurationCreateVersionIcon;


	
	

	
	@FindBy(id= "ID_APC_AprovalConfigADDSave")
	public static WebElement approvalConfigurationRoleConfigurationAddSubmit;
	
	@FindBy(id="ID_APC_AprovalConfigCancel")
	public static WebElement approvalConfigurationRoleConfigurationAddCancel;
	

	@FindBy(xpath= "//*[contains(@id,'ID_APC_PartialApproval')]")
	public static WebElement approvalConfigurationRegistrationPartialApprove;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_ReCalc')]")
	public static WebElement approvalConfigurationRegistrationReCalc;

	@FindBy(xpath= "//*[contains(@id,'ID_APC_Retest')]")
	public static WebElement approvalConfigurationRegistrationReTest;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_RecomRecalc')]")
	public static WebElement approvalConfigurationRegistrationRecommendReCalc;

	@FindBy(xpath= "//*[contains(@id,'ID_APC_RecomRetest')]")
	public static WebElement approvalConfigurationRegistrationRecommendReTest;
	
	@FindBy(xpath= "//*[@id=\"ID_Lims_AlertMsg_0\"]")
	public static WebElement approvalConfigurationRegistrationAlert;
	
	@FindBy(xpath= "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i")
	public static WebElement approvalConfigurationRegistrationAlertClose;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_OpenFilterPopUP')]/button")
	public static WebElement approvalConfigurationRegistrationFilterAdd;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_OpenValidPopUP')]/button")
	public static WebElement approvalConfigurationRegistrationValidationAdd;
	
	@FindBy(xpath= "//ul[contains(@id,'ID_APC_FilterPopUp')]/li")
	public static WebElement approvalConfigurationRegistrationFilterSelectAll;
	
	@FindBy(xpath= "//ul[contains(@id,'ID_APC_ValidPopUp')]/li")
	public static WebElement approvalConfigurationRegistrationValidationSelectAll;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_FilterPopUp')]/span/div/span/i")
	public static WebElement approvalConfigurationRegistrationFilterClose;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_ValidPopUp')]/span/div/span/i")
	public static WebElement approvalConfigurationRegistrationValidationClose;
	
	@FindBy(xpath= "//*[contains(@id,'ID_APC_Correction')]")
	public static WebElement approvalConfigurationCorrection;

	
	//*[@id="ID_Lims_SuccessAlertDiv_0"]
	
	
	@FindBy(xpath= "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]")
	public static WebElement approvalConfigurationRegistrationUserRoleAlert;
	
	@FindBy(xpath= "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i")
	public static WebElement approvalConfigurationRegistrationUserRoleAlertClose;
	
	
	
	@FindBy(xpath= "//*[@id=\"ID_APC_ConfigurationTabs\"]/a")
	public static List<WebElement> approvalConfigurationRegistrationUserRoleList;

	
	
	
	
	
	
	
	
	
	
	
	
}

