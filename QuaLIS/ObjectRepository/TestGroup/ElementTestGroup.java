package TestGroup;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementTestGroup {


	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_6")
	public static WebElement testGroupManagementIcon;

	@FindBy(id = "iFormID_62")
	public static WebElement testGroupIcon;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TG_TreeView\"]/div")
	public static List< WebElement> testGroupTreeList;
	
	

	
	@FindBy(id = "ID_TG_SampleType")
	public static WebElement testGroupFilterSampleType;

	@FindBy(id = "ID_TG_SampleCategory")
	public static WebElement testGroupFilterSampleCategory;

	@FindBy(id = "ID_TG_Sample")
	public static WebElement testGroupFilterSample;

	@FindBy(id = "ID_TG_TemplateVers")
	public static WebElement testGroupFilterTemplateVersion;

	@FindBy(id = "ID_TG_Refresh")
	public static WebElement testGroupFilterFind;

	@FindBy(xpath = "//*[@id='ID_TG_TestGroupFilter']/a")
	public static WebElement testGroupFilterClose;
	
	@FindBy(id = "ID_TG_Mainfilter")
	public static WebElement testGroupFilterIcon;


	@FindBy(id = "ID_MD_testGroupDeletebutton")
	public static WebElement testGroupSpecificationIcon;


	@FindBy(id = "ID_TG_TestGroupDetails")
	public static WebElement testGroupTestDetailsIcon;
	

	@FindBy(id = "ID_TG_TestGroupFile")
	public static WebElement testGroupSpecificationFileIcon;
	
	@FindBy(xpath = "//*[@id='ID_TG_ActionMenu']/a")
	public static WebElement testGroupSpecificationAction;
	
	@FindBy(id = "ID_TG_AddSpec")
	public static WebElement testGroupSpecificationAdd;
	
	@FindBy(id = "ID_TG_EditSpec")
	public static WebElement testGroupSpecificationEdit;
	
	@FindBy(id = "ID_TG_VersionSpec")
	public static WebElement testGroupSpecificationVersionSpec;
	
	@FindBy(id = "ID_TG_DeleteSpec")
	public static WebElement testGroupSpecificationDelete;
	
	@FindBy(id = "ID_TG_CopySpec")
	public static WebElement testGroupSpecificationCopySpec;
	
	@FindBy(id = "ID_TG_CompleteSpec")
	public static WebElement testGroupSpecificationComplete;
	

	
	@FindBy(id = "ID_TreeLevelInput_0")
	public static WebElement testGroupSpecificationFirstValue;
	
	
	@FindBy(id = "ID_TG_TestGroupSpecName")
	public static WebElement testGroupSpecification;
	
	@FindBy(id = "ID_TG_SpecProjectID")
	public static WebElement testGroupSpecificationProjectID;
	
	@FindBy(id = "ID_TG_TestGroupComponentReq")
	public static WebElement testGroupSpecificationComponent;
	
	@FindBy(id = "ID_TG_TestGroupSpecAddSubmit")
	public static WebElement testGroupSpecificationAddSubmit;
	
	@FindBy(id = "ID_TG_TestGroupTreeCancel")
	public static WebElement testGroupSpecificationAddCancel;
	
	@FindBy(id = "ID_TG_TestGroupSpecEditSubmit")
	public static WebElement testGroupSpecificationEditSubmit;
	
	@FindBy(id = "ID_TG_TestGroupTreeCancel")
	public static WebElement testGroupSpecificationEditCancel;
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_TGS_SpecData\"]/div/div[1]/div[1]")
	public static List<WebElement> testGroupSpecificationList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TGS_SpecData\"]/div/div[2]")
	public static List<WebElement> testGroupSpecificationCheckboxList;
	
	
	
	
	
	
	
	
	@FindBy(id = "ID_TG_TestGroupDetails")
	public static WebElement testGroupTestDetailIcon;
	

	@FindBy(id = "ID_TG_TGSpecComponent")
	public static WebElement testGroupTestDetailComponentIcon;
	
	@FindBy(id = "ID_TG_TestGroupTest")
	public static WebElement testGroupTestDetailTestIcon;
	
	@FindBy(id = "ID_TG_TestParameter")
	public static WebElement testGroupTestDetailParameter;
	
	@FindBy(id = "ID_TG_TestParameterDet")
	public static WebElement testGroupTestDetailParameterDetails;
	
	@FindBy(id = "ID_TG_TestParameterFormula")
	public static WebElement testGroupTestDetailFormula;
	
	@FindBy(id = "ID_TG_TGMaterialTab")
	public static WebElement testGroupTestDetailTestGroupMaterial;
	
	@FindBy(xpath= "//*[@id='ID_TG_ActionMenu']/a")
	public static WebElement testGroupTestDetailComponentAction;
	


	@FindBy(id = "ID_TG_AddComponent")
	public static WebElement testGroupTestDetailComponentAdd;
	
	@FindBy(id = "ID_TG_EditComponent")
	public static WebElement testGroupTestDetailComponentEdit;;
	
	@FindBy(id = "ID_TG_DeleteComponent")
	public static WebElement testGroupTestDetailComponentDelete;
	
	@FindBy(id = "ID_TG_SpecComponent")
	public static WebElement testGroupTestDetailComponent;
	
	@FindBy(id = "ID_TG_SpecComponent")
	public static WebElement testGroupTestDetailComponentTestCategory;
	
	@FindBy(id = "ID_TG_TestCategoryCheckbox")
	public static WebElement testGroupTestDetailComponentTestCategoryFilter;
	
	@FindBy(xpath= "//*[@id='ID_TG_AvailListContainer']/button")
	public static WebElement testGroupTestDetailComponentTestsList;
	

	@FindBy(id = "ID_TG_SpecComponentAddSubmit")
	public static WebElement testGroupTestDetailComponentAddSubmit;
	
	@FindBy(id = "ID_TG_SpecComponentCancel")
	public static WebElement testGroupTestDetailComponentAddCancel;;
	
	@FindBy(id = "ID_TG_SpecComponentEditSubmit")
	public static WebElement testGroupTestDetailComponentEditSubmit;
	
	@FindBy(id = "ID_TG_SpecComponentCancel")
	public static WebElement testGroupTestDetailComponentEditCancel;
	
	@FindBy(xpath = "//*[@id='ID_TG_TestPopUp']/span/div/input")
	public static WebElement testGroupTestDetailComponentTestSearchField;
	
	@FindBy(xpath = "//*[@id='ID_TG_TestPopUp']/li")
	public static WebElement testGroupTestDetailComponentTestResult;
	
	

	@FindBy(xpath = "//*[@id='ID_TG_ActionMenu']/a")
	public static WebElement testGroupTestDetailTestAction;
	
	@FindBy(id = "ID_TG_AddSpecTest")
	public static WebElement testGroupTestDetailTestAdd;
	
	@FindBy(id = "ID_TG_EditTestDetails")
	public static WebElement testGroupTestDetailTestEdit;
	
	@FindBy(id = "ID_TG_DeleteTest")
	public static WebElement testGroupTestDetailTestDelete;
	
	@FindBy(id = "ID_TG_TestCategory")
	public static WebElement testGroupTestDetailTestTestCategory;
	
	@FindBy(id = "ID_TG_TestCategoryCheckbox")
	public static WebElement testGroupTestDetailTestTestCategoryFilter;
	

	@FindBy(id = "ID_TG_Subcontent")
	public static WebElement testGroupTestDetailTestTestBack;
	
	@FindBy(id = "selectall")
	public static WebElement testGroupTestDetailTestTestSelectAll;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TG_AvailListContainer\"]/button")
	public static WebElement testGroupTestDetailTestFind;
	
/*	@FindBy(xpath = "//*[@id='ID_TG_TestPopUp']/span/div/input")
	public static WebElement testGroupTestDetailTestSearchField;
	*/
/*	
	@FindBy(xpath = "//*[@id='ID_TG_TestPopUp']/span/div/input")
	public static WebElement testGroupTestDetailTestSelectAll;
	//*[@id=""]/p
	
	*/                 //*[@id="ID_TG_TestPopUp"]/li	
	
	@FindBy(xpath = "//*[@id='ID_TG_TestPopUp']/li")
	public static WebElement testGroupTestDetailTestSearchResult;
	
	@FindBy(id = "ID_TG_ComponentTestAddSubmit")
	public static WebElement testGroupTestDetailTestAddSubmit;
	
	@FindBy(id = "ID_TG_ComponentTestCancel")
	public static WebElement testGroupTestDetailTestAddCancel;
	
	@FindBy(id = "ID_TG_TestDetailsSubmit")
	public static WebElement testGroupTestDetailTestEditSubmit;
	
	@FindBy(id = "ID_TG_TestDetailsCancel")
	public static WebElement testGroupTestDetailTestEditCancel;
	
	@FindBy(id = "ID_TG_Subcontent")
	public static WebElement testGroupTestDetailReturn;
	
	@FindBy(xpath = "//*[@id='ID_TG_ActionMenu']/a")
	public static WebElement testGroupSpecificationFileAction;
	
	@FindBy(id = "ID_TG_AddSpecFile")
	public static WebElement testGroupSpecificationFileAdd;
	
	@FindBy(id = "ID_TG_EditSpecFile")
	public static WebElement testGroupSpecificationFileEdit;
	
	@FindBy(id = "ID_TG_DeleteSpecFile")
	public static WebElement testGroupSpecificationFileDelete;
	
	@FindBy(id = "ID_SP_SupplierFile")
	public static WebElement testGroupSpecificationFileAttach;
	
	@FindBy(id = "ID_TG_AddSubmitSpecFile")
	public static WebElement testGroupSpecificationFileAddSubmit;
	
	@FindBy(id = "ID_TG_CancelSpecFile")
	public static WebElement testGroupSpecificationFileAddCancel; 
	
	@FindBy(id = "ID_TG_Subcontent")
	public static WebElement testGroupSpecificationFileEditSubmit;
	
	@FindBy(id = "ID_TG_Subcontent")
	public static WebElement testGroupSpecificationFileEditCancel;
	
	
	
	
	
	
	
	

}