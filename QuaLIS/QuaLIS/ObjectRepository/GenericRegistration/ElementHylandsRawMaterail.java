package GenericRegistration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHylandsRawMaterail extends ElementGenericRegistration{
	@FindBy(id = "iMenuID_2")
	public static WebElement transactionIcon;

	@FindBy(id = "iModuleID_10")
	public static WebElement registrationIcon;

	@FindBy(id = "iFormID_43")
	public static WebElement genericRegistrationIcon;

	@FindBy(id = "ID_SR_SampleTypeCombo1")
	public static WebElement advancedFilterSampleType;

	@FindBy(xpath = "//*[@id=\"ID_SampleRegistration_AdvancedView\"]/a")
	public static WebElement advancedFilterIcon;

	@FindBy(xpath = "//*[@id=\"ID_SR_SampleRegistrationInstgetdiv\"]/div/div[2]")
	public static List<WebElement> testCheckboxList;

	@FindBy(id = "ID_SRD_checkInput_00")
	public static WebElement checkList1;

	@FindBy(id = "ID_SRD_checkInput_01")
	public static WebElement checkList2;

	@FindBy(id = "ID_SRD_checkInput_02")
	public static WebElement checkList3;

	@FindBy(xpath = "//*[contains(@id,'ID_SRD_TextInput')]")
	public static WebElement additionalInfoTextInput;

	@FindBy(xpath = "//*[contains(@id,'ID_SRD_TextArea')]")
	public static WebElement additionalInfoTextArea;

	@FindBy(id = "ID_SampleRegistration_SampleFileType_Combo")
	public static WebElement sampleTypeAttachmentType;

	@FindBy(id = "ID_SampleRegistration_SubSampleFileType_Combo")
	public static WebElement sampleAttachmentType;

	@FindBy(id = "ID_SampleRegistration_TestFileType_Combo")
	public static WebElement testAttachmentType;

	@FindBy(id = "ID_SR_SampleRegistrationFilterIcon")
	public static WebElement filterIcon;

	@FindBy(xpath = "//*[@id=\"selectall\"]/p")
	public static WebElement testSelectAll1;

	@FindBy(id = "ID_SR_RegTypeCombo")
	public static WebElement filterRegistrationType;

	@FindBy(id = "ID_SR_RegSubTypeCombo")
	public static WebElement filterSubType;

	@FindBy(id = "ID_SR_FilterStatusCombo")
	public static WebElement filterSampleStatus;

	@FindBy(id = "ID_SR_FindSample")
	public static WebElement filterFindRecord;

	@FindBy(id = "ID_SR_SampleTypeCombo")
	public static WebElement filterSampleType;

	@FindBy(id = "ID_SR_RegTypeCombo1")
	public static WebElement advancedFilterRegistrationType;

	@FindBy(id = "ID_SR_RegSubTypeCombo1")
	public static WebElement advancedFilterSubType;

	@FindBy(id = "ID_SR_FilterStatusCombo1")
	public static WebElement advancedFilterSampleStatus;

	@FindBy(id = "ID_SR_FindSample1")
	public static WebElement advancedFilterFindRecord;

	// ID_SR_FindSample

	@FindBy(id = "SR_Home")
	public static WebElement advancedFilterHomeIcon;

	@FindBy(id = "ID_SR_sampletype")
	public static WebElement sampleTypeIcon;

	@FindBy(xpath = "//*[@id=\"Actionbutton\"]/a")
	public static WebElement genericRegistrationAction;
	
	
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_SR_SampleRegistrationHeaderdiv\"]/div[2]/div[1]")
	public static WebElement genericRegistrationMainGridSearch;
	

	@FindBy(id = "ID_SR_AddSampleTypeTest")
	public static WebElement sampleTypeAddTest;

	@FindBy(xpath = "//*[@id=\"ID_SST_OpenFilterPopUP\"]/button")
	public static WebElement sampleTypeAddTestViewTestList;

	@FindBy(xpath = "//*[@id=\"selectall\"]")
	public static WebElement sampleTypeAddTestSelectAll;

	@FindBy(id = "ID_SR_Dynamic_11001")
	public static WebElement sampleCategory;

	@FindBy(id = "ID_SR_Dynamic_11002")
	public static WebElement sample;

	@FindBy(id = "ID_SR_Dynamic_11005")
	public static WebElement itemCode;

	@FindBy(id = "ID_SR_Dynamic_11006")
	public static WebElement supplierOrManufacturer;

	@FindBy(id = "ID_SR_Dynamic_11007")
	public static WebElement supplier;
	
	@FindBy(id = "ID_SR_Dynamic_11008")
	public static WebElement materialDescription;

	@FindBy(id = "ID_SR_Dynamic_11009")
	public static WebElement SHCLotNo;

	@FindBy(id = "ID_SR_Dynamic_11010")
	public static WebElement batchNumber;
	
	
	@FindBy(id = "ID_SR_Dynamic_11011")
	public static WebElement supplierLotNumber;

	@FindBy(id = "ID_SR_Dynamic_11010")
	public static WebElement expirationDate;

	@FindBy(id = "ID_SR_Dynamic_11011")
	public static WebElement manufacturerDate;

	@FindBy(id = "ID_SR_Dynamic_11015")
	public static WebElement storageCodition;

	@FindBy(id = "ID_SR_Dynamic_11016")
	public static WebElement numberOfContainer;

	@FindBy(id = "ID_SR_Dynamic_11017")
	public static WebElement containerType;

	@FindBy(id = "ID_SR_Dynamic_11018")
	public static WebElement lotQuantity;

	@FindBy(id = "ID_SR_Dynamic_11019")
	public static WebElement containerQuantity;

	@FindBy(id = "ID_SR_Dynamic_11020")
	public static WebElement testingType;

	@FindBy(id = "ID_SR_Dynamic_11021")
	public static WebElement totalQuantity;

	@FindBy(id = "ID_SR_Dynamic_11022")
	public static WebElement totalQuantityUnit;
	
	@FindBy(id = "ID_SR_Dynamic_11023")
	public static WebElement priority;

	@FindBy(id = "ID_SR_Dynamic_11024")
	public static WebElement remarks;

	@FindBy(id = "ID_SR_Submit")
	public static WebElement preRegisterSubmit;

	@FindBy(id = "ID_SR_Cancel")
	public static WebElement preRegisterCancel;

	@FindBy(id = "ID_SR_Import")
	public static WebElement preRegisterImport;

	@FindBy(id = "ID_SR_SampleRegistrationData")
	public static WebElement sampleTypeSampleTypeIcon;

	@FindBy(id = "ID_BC_countryADDSubmit")
	public static WebElement sampleTypeSampleTypeAction;

	@FindBy(id = "ID_SR_MainSample_Attachment")
	public static WebElement sampleTypeAttachmentIcon;

	@FindBy(id = "ID_SR_MainSample_Comments")
	public static WebElement sampleTypeCommentsIcon;

	@FindBy(xpath = "//*[@id=\"Actionbutton\"]/a")
	public static WebElement sampleTypeAttachmentAction;

	@FindBy(id = "ID_SR_addattach")
	public static WebElement sampleTypeAttachmentAdd;

	@FindBy(id = "ID_SR_Editattach")
	public static WebElement sampleTypeAttachmentEdit;

	@FindBy(id = "ID_SampleRegistration_Sample_uploadBtn")
	public static WebElement sampleTypeAttachmentFileUploadIcon;

	@FindBy(id = "ID_SampleRegistration_SampleFile_attachdesc")
	public static WebElement sampleTypeAttachmentDescription;

	@FindBy(id = "ID_SRT_DeleteAttach")
	public static WebElement sampleTypeAttachmentDelete;

	@FindBy(id = "ID_SampleRegistration_SampleFileAddSubmit")
	public static WebElement sampleTypeAttachmentAddSubmit;

	@FindBy(id = "ID_SampleRegistration_SampleFileCancel")
	public static WebElement sampleTypeAttachmentAddCancel;

	@FindBy(id = "ID_SR_addcomments")
	public static WebElement sampleTypeCommentsAdd;

	@FindBy(id = "ID_SR_Editcomments")
	public static WebElement sampleTypeCommentsEdit;

	@FindBy(id = "ID_SRT_Deletecomments")
	public static WebElement sampleTypeCommentsDelete;

	@FindBy(id = "ID_SC_SampleRegistration_Comments_desc")
	public static WebElement sampleTypeComments;

	@FindBy(id = "ID_SampleRegistration_SampleCommentsAddSubmit")
	public static WebElement sampleTypeCommentsAddSubmit;

	@FindBy(id = "ID_SampleRegistration_SampleCommentsAddCancel")
	public static WebElement sampleTypeCommentsAddCancel;

	@FindBy(id = "ID_SampleRegistration_SampleCommentsEditSubmit")
	public static WebElement sampleTypeCommentsEditSubmit;

	@FindBy(id = "ID_SampleRegistration_SampleCommentsEditCancel")
	public static WebElement sampleTypeCommentsEditCancel;

	@FindBy(id = "ID_SR_subsampleins")
	public static WebElement sampleSampleIcon;

	/*
	 * @FindBy(id="ID_BC_countryADDSubmit") public static WebElement
	 * sampleTypeSampleTypeAction;
	 * 
	 */

	@FindBy(id = "ID_SR_SampleRegistrationSample")
	public static WebElement sampleIcon;

	@FindBy(id = "ID_SR_test_addsample")
	public static WebElement sampleSampleAdd;

	@FindBy(id = "ID_SR_Editsubsample")
	public static WebElement sampleSampleEdit;

	@FindBy(id = "ID_SSR_CancelReject")
	public static WebElement sampleSampleCancelOrReject;

	@FindBy(id = "ID_SSR_SampleCopy")
	public static WebElement sampleSampleCopy;

	@FindBy(id = "ID_SSR_printbarcode")
	public static WebElement sampleSamplePrintBarcode;

	@FindBy(id = "ID_SUB_Printbarcode")
	public static WebElement sampleSamplePrintBarcodeNew;

	@FindBy(id = "ID_SR_Samples_ID")
	public static WebElement sampleSampleName;

	@FindBy(id = "ID_SR_SamplesQUANTITY_ID")
	public static WebElement sampleSampleQuanity;

	@FindBy(id = "ID_SR_SubSampleUnit")
	public static WebElement sampleSampleUnit;

	@FindBy(id = "ID_SR_Remarks")
	public static WebElement sampleSampleRemarks;

	@FindBy(xpath = "//*[@id=\"ID_SSR_OpenFilterPopUP\"]/button")
	public static WebElement sampleSampleViewTestList;

	@FindBy(id = "selectall")
	public static WebElement sampleSampleTestSelectAll;

	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_43_0\"]/li")
	public static WebElement sampleSampleTestList;

	@FindBy(id = "ID_SR_Submit_Button")
	public static WebElement sampleSampleAddSubmit;

	// *[@id="ID_SST_OpenFilterPopUP"]/button

	@FindBy(id = "ID_SR_Cancel_Button")
	public static WebElement sampleSampleAddCancel;

	@FindBy(id = "ID_SR_Submit_Button")
	public static WebElement sampleSampleEditSubmit;

	@FindBy(id = "ID_SR_Cancel_Button")
	public static WebElement sampleSampleEditCancel;

	@FindBy(id = "ID_SR_subAttachment")
	public static WebElement sampleAttachmentIcon;

	@FindBy(id = "ID_SR_subComments")
	public static WebElement sampleCommentsIcon;

	@FindBy(xpath = "//*[@id=\"Actionbutton\"]/a")
	public static WebElement sampleAttachmentAction;

	@FindBy(id = "ID_SRR_ADDtestattach")
	public static WebElement sampleAttachmentAdd;

	@FindBy(id = "ID_SRR_EDITtestattach")
	public static WebElement sampleAttachmentEdit;

	@FindBy(id = "ID_SampleRegistration_SubSample_uploadBtn")
	public static WebElement sampleAttachmentFileUploadIcon;

	@FindBy(id = "ID_SampleRegistration_SubSampleFile_attachdesc")
	public static WebElement sampleAttachmentDescription;

	@FindBy(id = "ID_SRR_DELETEtestattach")
	public static WebElement sampleAttachmentDelete;

	@FindBy(id = "ID_SampleRegistration_SubSampleFileAddSubmit")
	public static WebElement sampleAttachmentAddSubmit;

	@FindBy(id = "ID_SampleRegistration_SubSampleFileCancel")
	public static WebElement sampleAttachmentAddCancel;

	@FindBy(id = "ID_SRR_ADDtestComments")
	public static WebElement sampleCommentsAdd;

	@FindBy(id = "ID_SRR_EDITtestComments")
	public static WebElement sampleCommentsEdit;

	@FindBy(id = "ID_SRR_DELETEtestCommentsID_SRR_DELETEtestComments")
	public static WebElement sampleCommentsDelete;

	@FindBy(id = "ID_SSC_SampleRegistration_Comments_desc")
	public static WebElement sampleComments;

	@FindBy(id = "ID_SampleRegistration_SubSampleCommentsAddSubmit")
	public static WebElement sampleCommentsAddSubmit;

	@FindBy(id = "ID_SampleRegistration_SubSampleCommentsAddCancel")
	public static WebElement sampleCommentsAddCancel;

	@FindBy(id = "ID_SampleRegistration_SubSampleCommentsEditSubmit")
	public static WebElement sampleCommentsEditSubmit;

	@FindBy(id = "ID_SampleRegistration_SubSampleCommentsEditCancel")
	public static WebElement sampleCommentsEditCancel;

	@FindBy(id = "ID_SR_test")
	public static WebElement testIcon;

	@FindBy(id = "ID_SR_SampleRegistrationTest")
	public static WebElement testTestIcon;

	@FindBy(id = "ID_SR_SampleRegTestParameter")
	public static WebElement testParameterIcon;

	@FindBy(id = "ID_SRT_TestAttachment")
	public static WebElement testAttachmentIcon;

	@FindBy(id = "ID_SRT_TestComments")
	public static WebElement testCommentssIcon;

	@FindBy(id = "ID_SRT_CheckList")
	public static WebElement testAdditionalInformationIcon;

	@FindBy(id = "ID_SRT_addtest")
	public static WebElement testAdd;

	@FindBy(id = "ID_SR_Register")
	public static WebElement sampleTypeRegister;

	@FindBy(xpath = "//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> ARNumberList;

	/*
	 * @FindBy(id="ID_SR_Register") public static WebElement sampleTypeRegister;
	 */

	@FindBy(id = "ID_SR_testCancel")
	public static WebElement testCancel;

	@FindBy(id = "ID_SR_EDITSECTION")
	public static WebElement testEditSection;

	@FindBy(id = "ID_SR_AdhocTest")
	public static WebElement testAdhocTest;

	// *[@id="ID_SST_OpenFilterPopUP"]/button

	@FindBy(xpath = "//*[@id=\"ID_SST_OpenFilterPopUP\"]/button")
	public static WebElement testViewTestList;

	@FindBy(id = "ID_SR_SubmitTest_Button")
	public static WebElement testAddSubmit;

	@FindBy(xpath = "//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/input")
	public static WebElement testViewSearchField;

	@FindBy(xpath = "//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/span/i")
	public static WebElement testViewSearchClose;

	@FindBy(id = "ID_SR_CancelTest_Button")
	public static WebElement testAddCancel;

	@FindBy(id = "ID_TS_Section")
	public static WebElement testEditSectionSection;

	@FindBy(id = "ID_SR_TestSubmit")
	public static WebElement testEditSectionSubmit;

	@FindBy(id = "ID_SR_TestCancel")
	public static WebElement testEditSectionCancel;

	@FindBy(id = "ID_SST_AdhocTest")
	public static WebElement testAdhocTestAdhocTest;

	@FindBy(id = "ID_SR_SubmitAdhocTest_Button")
	public static WebElement testAdhocAddSubmit;

	@FindBy(id = "ID_SR_CancelAdhocTest_Button")
	public static WebElement testAdhocAddCancel;

	@FindBy(id = "ID_SR_EditParameter")
	public static WebElement testParameterEditSpecification;

	@FindBy(id = "ID_SR_MinA")
	public static WebElement testParameterEditSpecificationInnerMinA;

	@FindBy(id = "ID_SR_MAXA")
	public static WebElement testParameterEditSpecificationInnerMaxA;

	@FindBy(id = "ID_SR_MinB")
	public static WebElement testParameterEditSpecificationOuterMinB;

	@FindBy(id = "ID_SR_MaxB")
	public static WebElement testParameterEditSpecificationOuterMaxB;

	@FindBy(id = "ID_SR_ParameterSubmit")
	public static WebElement testParameterEditSpecificationSubmit;

	@FindBy(id = "ID_SR_ParameterCancel")
	public static WebElement testParameterEditSpecificationCancel;

	@FindBy(id = "ID_SRR_test_addattach")
	public static WebElement testAttachmentAdd;

	@FindBy(id = "ID_SRR_test_Editattach")
	public static WebElement testAttachmentEdit;

	@FindBy(id = "ID_SampleRegistration_Test_uploadBtn")
	public static WebElement testAttachmentFileUploadIcon;

	@FindBy(id = "ID_SampleRegistration_TestFile_attachdesc")
	public static WebElement testAttachmentDescription;

	@FindBy(id = "ID_SRT_Test_DeleteAttach")
	public static WebElement testAttachmentDelete;

	@FindBy(id = "ID_SampleRegistration_TestFileAddSubmit")
	public static WebElement testAttachmentAddSubmit;

	@FindBy(id = "ID_SampleRegistration_TestFileCancel")
	public static WebElement testAttachmentAddCancel;

	@FindBy(id = "ID_SRT_ADDtestComments")
	public static WebElement testCommentsAdd;

	@FindBy(id = "ID_SRR_EDITtestComments")
	public static WebElement testCommentsEdit;

	@FindBy(id = "ID_SRR_DELETEtestCommentsID_SRR_DELETEtestComments")
	public static WebElement testCommentsDelete;

	@FindBy(id = "ID_TC_SampleRegistration_Comments_desc")
	public static WebElement testComments;

	@FindBy(id = "ID_SampleRegistration_TestCommentsAddSubmit")
	public static WebElement testCommentsAddSubmit;

	@FindBy(id = "ID_SampleRegistration_TestCommentsCancel")
	public static WebElement testCommentsAddCancel;

	@FindBy(id = "ID_SampleRegistration_TestCommentsEditSubmit")
	public static WebElement testCommentsEditSubmit;

	@FindBy(id = "ID_SampleRegistration_TestCommentsCancel")
	public static WebElement testCommentsEditCancel;

	@FindBy(id = "ID_SR_SubmitTestCheckList")
	public static WebElement testAdditionalInformationSave;

	@FindBy(id = "ID_Lims_AlertDiv_0")
	public static WebElement testAdditionalInformationSaveAlert;

	@FindBy(xpath = "//*[@id=\"ID_Lims_AlertDiv_0\"]/div/span/i")
	public static WebElement testAdditionalInformationSaveAlertClose;

	@FindBy(id = "ID_SR_Preregister")
	public static WebElement sampleTypePreRegister;

	@FindBy(id = "ID_SR_Dynamic_6607")
	public static WebElement sampleTypePreRegisterProjectCode;

	@FindBy(id = "ID_SR_Dynamic_6608")
	public static WebElement sampleTypePreRegisterProjectName;

	@FindBy(id = "ID_SR_Dynamic_6601")
	public static WebElement sampleTypePreRegisterInstrumentCategory;

	@FindBy(id = "ID_SR_Dynamic_6602")
	public static WebElement sampleTypePreRegisterInstrumentID;

	@FindBy(id = "ID_SR_Dynamic_6603")
	public static WebElement sampleTypePreRegisterInstrument;

	@FindBy(id = "ID_SR_Dynamic_6605")
	public static WebElement sampleTypePreRegisterInstrumentSpecification;

	@FindBy(id = "ID_SR_Import")
	public static WebElement sampleTypePreRegisterInstrumentImport;

	@FindBy(id = "ID_SR_Submit")
	public static WebElement sampleTypePreRegisterInstrumentSubmit;

	@FindBy(id = "ID_SR_Cancel")
	public static WebElement sampleTypePreRegisterInstrumentCancel;

	@FindBy(xpath = "//*[@id=\"ID_SR_SampleRegistrationHeaderdiv\"]/div[2]/div[2]")
	public static WebElement sampleTypeMultiSelect;

	@FindBy(xpath = "//*[@id=\"ID_SST_OpenFilterPopUP\"]/button")
	public static WebElement testViewList;

	@FindBy(xpath = "//*[@id=\"ID_SST_FilterPopUp1\"]/li")
	public static WebElement testSelectAll;

}
