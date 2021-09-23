package Organisation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementOrganisation {

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_4")
	public static WebElement organisationManagementIcon;

	@FindBy(id = "iFormID_54")
	public static WebElement organisationIcon;
	
	
	
	@FindBy(id = "ID_OR_SiteCombo")
	public static WebElement organisationFilterSite;
	

	@FindBy(id = "ID_OR_FindOrganisationSite")
	public static WebElement organisationFilterFind;
	
	
	
	@FindBy(id="ID_OR_OrganisationDepartment")
	public static WebElement organisationDepartmentIcon;

	@FindBy(id = "ID_OR_OrganisationLab")
	public static WebElement organisationLabIcon;

	@FindBy(id = "ID_OR_OrganisationSection")
	public static WebElement organisationSectionIcon;
	

	
	
	
	@FindBy(xpath = "//*[@id='ID_APC_ListDiv_54_0']/li/p")
	public static List< WebElement> usersList;
	


	@FindBy(xpath = "//*[@id='ID_Organisation2Users_DesignBind']/div/div[1]/div/p")
	public static List< WebElement> users;
	


	@FindBy(xpath = "//*[@id='ID_Organisation2Users_DesignBind']/div/div[2]")
	public static List< WebElement> usersCheckBox;
	
	
	
	@FindBy(xpath = "//*[@id='ID_APC_ListDiv_54_0']/li/p")
	public static List< WebElement> sectionList;
	


	@FindBy(xpath = "//*[@id='ID_Organisation2_DesignBind']/div/div[1]/div/p")
	public static List< WebElement> sections;
	


	@FindBy(xpath = "//*[@id='ID_Organisation2_DesignBind']/div/div[2]")
	public static List< WebElement> sectionsCheckBox;
	
		

	@FindBy(xpath = "//*[@id='ID_APC_ListDiv_54_0']/li/p")
	public static List< WebElement> labsLIst;
	

	@FindBy(xpath = "//*[@id='ID_OR1_OrganisationLabdiv']/div/div[1]/div/p")
	public static List< WebElement> labs;
	


	@FindBy(xpath = "//*[@id='ID_OR1_OrganisationLabdiv']/div/div[2]")
	public static List< WebElement> labCheckBox;
	
	
	
	@FindBy(xpath = "//*[@id='ID_Organisation1_DesignBind']/div/div[1]/div/p")
	public static List< WebElement> departments;
	

	

	@FindBy(xpath = "//*[@id='ID_Organisation1_DesignBind']/div/div[2]")
	public static List< WebElement> departmentCheckBox;

	
	
	
	@FindBy(xpath = "//*[@id='ID_APC_ListDiv_54_0']/li/p")
	public static List< WebElement> departmentList;
	
	

	@FindBy(id = "ID_OR_OrganisationUsers")
	public static WebElement organisationUsersIcon;
	


	@FindBy(xpath = "//*[@id='ID_OR1_ActionMenu']/a")
	public static WebElement organisationDepartmentAction;
	
	@FindBy(id = "ID_OR_DeptAddbutton")
	public static WebElement organisationDepartmentAdd;

	@FindBy(id = "ID_OR_DeptDeletebutton")
	public static WebElement organisationDepartmentDelete;
	
	
	@FindBy(xpath = "//*[@id='ID_ORD_OpenFilterPopUP']/button")
	public static WebElement organisationDepartmentSearch;
	
	
	


	@FindBy(xpath= "//*[@id='ID_ORD_FilterPopUp1']/span/div/input")
	public static WebElement organisationDepartmentSearchDepartmentField;

	
	@FindBy(xpath = "//*[@id='ID_ORD_FilterPopUp1']/li")
	public static WebElement organisationDepartmentSelect;
	
	


	@FindBy(id = "ID_ORD_Submit")
	public static WebElement organisationDepartmentAddSubmit;

	
	@FindBy(id = "ID_ORD_Cancel")
	public static WebElement organisationDepartmentAddCancel;

	

	@FindBy(xpath = "//*[@id='ID_OR1_ActionMenu']/a")
	public static WebElement organisationLabAction;
	
	@FindBy(id = "ID_OR_LabAddbutton")
	public static WebElement organisationLabAdd;

	@FindBy(id = "ID_OR_LabDeletebutton")
	public static WebElement organisationLabDelete;
	
	
	@FindBy(xpath= "//*[@id='ID_ORL_OpenFilterPopUP']/button")
	public static WebElement organisationLabSearch;
	

	@FindBy(xpath= "//*[@id='ID_ORL_FilterPopUp1']/span/div")
	public static WebElement organisationLabSearchLabField;

	
	@FindBy(xpath = "//*[@id='ID_ORL_FilterPopUp1']/li")
	public static WebElement organisationLabSelectAll;
	
	


	@FindBy(id = "ID_ORL_Submit")
	public static WebElement organisationLabAddSubmit;

	
	@FindBy(id = "ID_ORL_Cancel")
	public static WebElement organisationLabAddCancel;
	
	////////

	@FindBy(xpath = "//*[@id='ID_OR1_ActionMenu']/a")
	public static WebElement organisationUsersAction;
	
	@FindBy(id = "ID_OR_UserAddbutton")
	public static WebElement organisationUsersAdd;

	@FindBy(id = "ID_OR_UserDeletebutton")
	public static WebElement organisationUsersDelete;
	
	
	@FindBy(xpath= "//*[@id='ID_ORU_OpenFilterPopUP']/button")
	public static WebElement organisationUsersSearch;
	

	@FindBy(xpath= "//*[@id='ID_ORU_FilterPopUp1']/span/div/input")
	public static WebElement organisationUserSearchUserField;

	
	@FindBy(xpath = "//*[@id='ID_ORU_FilterPopUp1']/li")
	public static WebElement organisationUserSelectAll;
	
	


	@FindBy(id = "ID_ORU_Submit")
	public static WebElement organisationUsersAddSubmit;

	
	@FindBy(id = "ID_ORU_Cancel")
	public static WebElement organisationUsersAddCancel;

	
	
	/////
	

	@FindBy(xpath = "//*[@id='ID_OR1_ActionMenu']/a")
	public static WebElement organisationSectionAction;
	
	@FindBy(id = "ID_OR_SectionAddbutton")
	public static WebElement organisationSectionAdd;

	@FindBy(id = "ID_OR_SectionDeletebutton")
	public static WebElement organisationSectionDelete;
	
	
	@FindBy(xpath= "//*[@id='ID_ORS_OpenFilterPopUP']/button")
	public static WebElement organisationSectionSearch;

	@FindBy(xpath= "//*[@id='ID_ORS_FilterPopUp1']/span/div/input")
	public static WebElement organisationSectionSearchField;

	
	@FindBy(xpath = "//*[@id='ID_ORS_FilterPopUp1']/li")
	public static WebElement organisationSectionSelect;
	
	


	@FindBy(id = "ID_ORS_Submit")
	public static WebElement organisationSectionAddSubmit;

	
	@FindBy(id = "ID_ORS_Cancel")
	public static WebElement organisationSectionAddCancel;

	

}
