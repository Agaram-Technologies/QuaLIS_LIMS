package TestManagement;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ElementTestMaster {


	
	
	

	@FindBy(xpath = "//*[@id=\"ID_TM_TestMastergetdiv\"]/div/div[1]/div[1]")
	public static List<WebElement >testList;


	@FindBy(xpath = "//*[@id=\"ID_TM_TestMastergetdiv\"]/div/div[1]/div[2]")
	public static List<WebElement > acreditedList;


	@FindBy(xpath = "//*[@id=\"ID_TM_TestMastergetdiv\"]/div/div[2]")
	public static List<WebElement > checkBoxList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TM_TestMasterHeaderdiv\"]/div[2]/div")
	public static WebElement  searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_TM_TestMasterHeaderdiv\"]/div[2]/div")
	public static WebElement  searchClose;
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
	
	
	
	
	
	
	
	
	
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_5")
	public static WebElement testManagementIcon;

	@FindBy(id = "iFormID_41")
	public static WebElement testIcon;
	
	@FindBy(id="//*[@id='ID_TM_TestMastergetdiv']/div/div[1]/div[1]/p")
	public static List<WebElement> testName;
	

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[1]/div[2]/p")
	public static List<WebElement> testStatus;
	

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testCheckBox;
	
	@FindBy(xpath="//*[@id='ID_InsideDiv_10_17_0']/dl[1]/dd/span")
	public static List<WebElement> testDetailTestCategory;
	
	@FindBy(xpath="//*[@id='ID_InsideDiv_10_17_0']/dl[2]/dd/span")
	public static List<WebElement> testDetailTestName;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestAbbreviation;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestProcedure;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestStatus;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestPrice;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestCheckList;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> testDetailTestActiveStatus;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> parameterDetailTestName;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> parameterDetailParameterName;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> parameterDetailParameterAbbreviation;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> parameterDetailParameterType;

	@FindBy(xpath="//*[@id='ID_TM_TestMastergetdiv']/div/div[2]")
	public static List<WebElement> parameterDetailParameterUnit;
	
	
	
	

	@FindBy(id = "ID_TM_TestCheckList")
	public static WebElement testFilterTestCopyCheckList;
	

	
	

	@FindBy(id = "ID_TM_ECTestName")
	public static WebElement testCopyTest;
	
	
	

	
	

	@FindBy(id = "ID_TM_ECTestSynonym")
	public static WebElement testCopyAbbreviation;
	
	
	

	@FindBy(id = "ID_TM_ECTestprocedure")
	public static WebElement testCopyProcedure;
	


	@FindBy(id = "ID_TM_ECTestCost")
	public static WebElement testCopyPrice;
	

	@FindBy(id = "ID_TM_ECTestaccredited")
	public static WebElement testCopyAccredited;
	

	@FindBy(id = "ID_TM_ECTesttransactionstatus")
	public static WebElement testCopyActive;
	

	@FindBy(id = "ID_TM_TestECSubmit")
	public static WebElement testCopySubmit;
	

	@FindBy(id = "ID_TM_TestCheckList")
	public static WebElement testCopyChecklist;

	
	
	
	
	

	
	@FindBy(id = "ID_TM_TestCategoryCombo")
	public static WebElement testFilterTestCategory;

	@FindBy(id = "ID_TM_FindTest")
	public static WebElement testFilterFindTest;

	@FindBy(xpath = "//*[@id='ID_TM_TestMasterFilter']/a")
	public static WebElement testFilterClose;
	

	@FindBy(id="ID_TM_filter")
	public static WebElement testFilteIcon;


	@FindBy(id = "ID_TM_ParameterData")
	public static WebElement testParameterIcon;

	@FindBy(id = "ID_TM_TestData")
	public static WebElement testTestIcon;

	@FindBy(id ="ID_TM_Section")
	public static WebElement testSectionIcon;

	@FindBy(id = "ID_TM_Method")
	public static WebElement testMethodIcon;
	
	@FindBy(xpath = "//*[@id='ID_TM_rightmenu']/a")
	public static WebElement testSectionAction;
	
	
	@FindBy(xpath = "//*[@id='ID_TMS_AddsectionPop']/div/div")
	public static List<WebElement> testSectionList;
	
	

	@FindBy(xpath = "//*[@id='ID_TMS_AddsectionPop']/div/input")
	public static List< WebElement> testSectionCheckBox;
	
	

	@FindBy(xpath = "//*[@id='ID_TMS_AddmethodPop']/div/div")
	public static List< WebElement> testMethodList;
	
	

	@FindBy(xpath = "//*[@id='ID_TMS_AddmethodPop']/div/input")
	public static List< WebElement> testMethodCheckBox;
	
	
	
	

	@FindBy(xpath = "//*[@id='ID_TMS_AddinstrumentPop']/div/div")
	public static List< WebElement> testInstrumentCategoryList;
	
	

	@FindBy(xpath = "//*[@id='ID_TMS_AddinstrumentPop']/div/input")
	public static List< WebElement> testInstrumentCategoryCheckBox;

	

	@FindBy(id = "ID_TMS_Instrumentadd_submit")
	public static WebElement instrumentAddSubmit;
	
	

	@FindBy(id = "ID_TMS_Methodadd_submit")
	public static WebElement methodAddSubmit;
	

	@FindBy(id = "ID_TMS_Sectionadd_submit")
	public static WebElement sectionAddSubmit;
	
	
	@FindBy(id = "ID_TM_File")
	public static WebElement testFileIcon;
	


	@FindBy(id = "ID_TM_Instrument")
	public static WebElement testInstrumentIcon;
	
	@FindBy(xpath = "//*[@id='ID_TM_ActionMenu']/a")
	public static WebElement testTestAction;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TMP_ActionMenu\"]/a")
	public static WebElement testParameterAction;
	
	
	
	@FindBy(id = "ID_TM_section_add")
	public static WebElement testSectionAdd;
	
	@FindBy(id = "ID_TMS_Sectionadd_delete")
	public static WebElement testSectionDelete;
	
	
	@FindBy(id = "ID_TM_section_default")
	public static WebElement testSectionSetAsDefault;
	
	
	

	@FindBy(id = "ID_TM_method_add")
	public static WebElement testMethodAdd;
	
	@FindBy(id = "ID_TMS_Methodadd_delete")
	public static WebElement testMethodDelete;
	
	
	@FindBy(id = "ID_TM_method_default")
	public static WebElement testMethodSetAsDefault;
	
	
	

	
	@FindBy(xpath = "//*[@id='ID_TM_rightmenu']/a")
	public static WebElement testInstrumentAction;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(id = "ID_TM_TestAddbutton")
	public static WebElement testAdd;

	@FindBy(id = "ID_TM_TestEditbutton")
	public static WebElement testEdit;

	@FindBy(id = "ID_TM_TestDeletebutton")
	public static WebElement testDelete;

	@FindBy(id = "ID_TM_TestCopybutton")
	public static WebElement testCopy;

	@FindBy(id = "ID_View_AdditionalInfo")
	public static WebElement testViewAdditionalInfo;
	

	@FindBy(id = "ID_TM_TestCategory")
	public static WebElement testCategory;
	
	@FindBy(id = "ID_TM_TestName")
	public static WebElement test;
	
	
	@FindBy(id = "ID_TM_TestSynonym")
	public static WebElement testAbbreviation;

	@FindBy(id = "ID_TM_Testprocedure")
	public static WebElement testProcedure;

	@FindBy(id = "ID_TM_TestCost")
	public static WebElement testPrice;

	@FindBy(id = "ID_TM_TestSection")
	public static WebElement testSection;
	
	
	@FindBy(id = "ID_TM_TestMethod")
	public static WebElement testMethod;

	
	@FindBy(id = "ID_TM_TestInstrument")
	public static WebElement testInstrument;
	
	@FindBy(id = "ID_TM_TestCheckList")
	public static WebElement testAdditionalInfo;
	
	
	@FindBy(id = "ID_TM_TestParamName")
	public static WebElement testParameter;

	@FindBy(id = "ID_TM_TestParamAbb")
	public static WebElement testParameterAbbreviation;

	@FindBy(id = "ID_TM_TestParamType")
	public static WebElement testParameterType;

	@FindBy(id = "ID_TM_TestParamRounding")
	public static WebElement testRoundingDigits;
	
	
	@FindBy(id = "ID_TM_TestUnit")
	public static WebElement testUnit;

	@FindBy(id = "ID_TM_TestCodedResultInput")
	public static WebElement testParameterCodedResult;

	@FindBy(xpath = "//*[@id=\"ID_TM_TestActualResult\"]")
	public static WebElement testParameterActualResult;
	
	
	@FindBy(id = "ID_TM_Testaccredited")
	public static WebElement testAccredited;

	
	@FindBy(id = "ID_TM_ECTesttransactionstatus")
	public static WebElement testActive;
	
	
	@FindBy(id = "ID_TM_TestSubmit")
	public static WebElement testAddSubmit;

	@FindBy(id = "ID_TM_TestCancel")
	public static WebElement testAddCancel;

	@FindBy(id = "ID_TM_TestECSubmit")
	public static WebElement testEditSubmit;

	@FindBy(id = "ID_TM_TestECCancel")
	public static WebElement testEditCancel;
	
	
	
	@FindBy(id = "ID_TM_TestActualResult")
	public static WebElement testParameterParameterIcon;
	
	
	@FindBy(id = "ID_TM_Testaccredited")
	public static WebElement testParameterFormulaIcon;

	
	@FindBy(id = "ID_TM_ECTesttransactionstatus")
	public static WebElement testParameterSpecificationIcon;
	
	
	@FindBy(xpath = "//*[@id='ID_TMP_ActionMenu']/a")
	public static WebElement testParameterParameterAction;

	@FindBy(id = "ID_TM_TP_AddTestParameter")
	public static WebElement testParameterParameterAdd;

	@FindBy(id = "ID_TM_TP_EditTestParameter")
	public static WebElement testParameterParameterEdit;

	@FindBy(id = "ID_TM_TP_DeleteTestParameter")
	public static WebElement testParameterParameterDelete;
	
	@FindBy(id = "ID_TM_TP_ParameterNameinput")
	public static WebElement testParameterParameter;

	@FindBy(id = "ID_TM_TP_ParameterAbreviation")
	public static WebElement testParameterParameterAbbreviation;

	
                	
	@FindBy(id = "ID_TM_TP_ParameterType")
	public static WebElement testParameterParameterParameterType;

	@FindBy(id = "ID_TM_TP_RoundingDigits")
	public static WebElement testParameterParameterRoundingDigit;
	
	@FindBy(id = "ID_TM_SubParamcontent")
	public static WebElement testParameterParameterBack;

	
	
	
	
	@FindBy(id = "ID_TM_TP_Unit")
	public static WebElement testParameterParameterUnit;;

	@FindBy(id = "ID_TM_TP_CodedResultinput")
	public static WebElement testParameterParameterCodedResult;

	@FindBy(id = "ID_TM_TP_ActualResult")
	public static WebElement testParameterParameterActualResult;

	@FindBy(id = "ID_TestParameterAddSubmit")
	public static WebElement testParameterParameterAddSubmit;
	
	@FindBy(id = "ID_TestParameterCancel")
	public static WebElement testParameterParameterAddCancel;

	@FindBy(id = "ID_TM_TP_AddTestParameter")
	public static WebElement testParameterParameterEditSubmit;

	@FindBy(id = "ID_TM_TP_EditTestParameter")
	public static WebElement testParameterParameterEditCancel;
/*
	@FindBy(id = "ID_TM_TP_DeleteTestParameter")
	public static WebElement testParameterParameterDelete;
	*/
	
	@FindBy(xpath = "//*[@id='ID_TM_rightmenu']/a")
	public static WebElement testFileAction;

	@FindBy(id = "ID_TM_File_add")
	public static WebElement testFileAdd;

	@FindBy(id = "ID_TM_File_edit")
	public static WebElement testFileEdit;
	
	@FindBy(id = "ID_TM_File_default")
	public static WebElement testFileSetAsDefault;

	@FindBy(id = "ID_TMS_Fileadd_delete")
	public static WebElement testFileDelete;
	
	

	@FindBy(id = "ID_TM_fileattachment")
	public static WebElement testFileFileIcon;
	
	@FindBy(id = "ID_TM_File_attachdesc")
	public static WebElement testFileDescription;
	
	@FindBy(id = "ID_TMS_ADDFileSubmit_Button")
	public static WebElement testFileAddSubmit;
	
	@FindBy(id = "ID_TMS_ADDFileCancel_Button")
	public static WebElement testFileAddCancel;
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10_17_0\"]/dl/dt")
	public static List<WebElement> sideViewTestDetailTermsList;
	

	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10_17_0\"]/dl/dd")
	public static  List<WebElement> sideViewTestDetailDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_11_22_0\"]/dl/dt")
	public static  List<WebElement> sideViewParameterDetailTermsList;
	

	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_11_22_0\"]/dl/dd")
	public static  List<WebElement> sideViewParameterDetailDescriptionList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_12_18_0\"]/dl/dd")
	public static  List<WebElement> sideViewSectionDetailDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_12_18_0\"]/dl/dt")
	public static  List<WebElement> sideViewSectionDetailTermsList;
	

	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_13_19_0\"]/dl/dd")
	public static  List<WebElement> sideViewMethodDetailDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_13_19_0\"]/dl/dt")
	public static  List<WebElement> sideViewMethodDetailTermsList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_14_20_0\"]/dl/dd")
	public static  List<WebElement> sideViewInstrumentCategoryDetailDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_14_20_0\"]/dl/dt")
	public static  List<WebElement> sideViewInstrumentCategoryDetailTermsList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_15_21_0\"]/dl/dd")
	public static  List<WebElement> sideViewFileDetailDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_15_21_0\"]/dl/dt")
	public static  List<WebElement> sideViewFileDetailTermsList;
	

	
	
	
	
	
	
	
	
	
}