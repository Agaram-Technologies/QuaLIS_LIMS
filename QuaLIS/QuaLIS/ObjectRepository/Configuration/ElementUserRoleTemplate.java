package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementUserRoleTemplate {

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	

	 
	@FindBy(xpath="//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;

	@FindBy(id = "iModuleID_31")
	public static WebElement configurationIcon;

	@FindBy(id = "iFormID_58")
	public static WebElement userRoleTemplateIcon;
 
	
	@FindBy(xpath = "//*[@id=\"ID_URT_TemplateMasterData\"]")
	public static WebElement userRoleTemplateTabIcon;
	
	@FindBy(id = "ID_URT_ApprovalSubTypeCombo")
	public static WebElement userRoleTemplateFilterApprovalType;

	@FindBy(id = "ID_URT_MasterConfigFind")
	public static WebElement userRoleTemplateFilterFind;

	@FindBy(xpath = "//*[@id='ID_URT_MasterFilter']/a")
	public static WebElement userRoleTemplateFilterClose;
	
	@FindBy(id = "ID_URT_RegTypeCombo")
	public static WebElement userRoleTemplateRegistrationType;

	@FindBy(id = "ID_URT_RegSubTypeCombo")
	public static WebElement userRoleTemplateRegistrationSubType;
	
	
	
	@FindBy(xpath = "//*[@id='ID_URT_TemplateMasterFilter']")
	public static WebElement userRoleTemplateFilterIcon;

	@FindBy(xpath = "//*[@id='ID_URT_Tabs']/div[2]/a")
	public static WebElement userRoleTemplateAction;

	@FindBy(id = "ID_URT_UserroleTemplateAddbutton")
	public static WebElement userRoleTemplateCreateVersion;

	@FindBy(id = "ID_URT_UserroleTemplateEditbutton")
	public static WebElement userRoleTemplateEditVersion;
	
	
	@FindBy(id = "ID_URT_UserroleTemplateDeletebutton")
	public static WebElement userRoleTemplateDelete;
	
	
	@FindBy(id = "ID_URT_UserroleTemplateAppbutton")
	public static WebElement userRoleTemplateApprove;


	@FindBy(id = "ID_URT_versionName")
	public static WebElement userRoleTemplate;
	
	@FindBy(id = "ID_DynamicInputTemplate_0")
	public static WebElement userRoleTemplateFirstRole;
	
	
	@FindBy(id = "ID_DynamicInputTemplate_1")
	public static WebElement userRoleTemplateSecondRole;

	

	@FindBy(id = "ID_DynamicInputTemplate_2")
	public static WebElement userRoleTemplateThirdRole;

	//ID_DynamicTemplateButton_0
	

	@FindBy(xpath = "//*[@id='ID_DynamicTemplateButton_0']")
	public static WebElement userRoleTemplateAddRoleOne;



	@FindBy(xpath = "//*[@id='ID_DynamicTemplateButton_1']")
	public static WebElement userRoleTemplateAddRoleTwo;

	
	@FindBy(id = "ID_URT_UserroleTemplateADDSubmit")
	public static WebElement userRoleTemplateAddSubmit;
	
	@FindBy(id = "ID_URT_UserroleTemplateCancel")
	public static WebElement userRoleTemplateAddCancel;


	@FindBy(id = "ID_URT_UserroleTemplateEDITSubmit")
	public static WebElement userRoleTemplateEditSubmit;

	
	@FindBy(id = "ID_URT_UserroleTemplateCancel")
	public static WebElement userRoleTemplateEditCancel;

}