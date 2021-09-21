package JobAllocation;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
public class ElementJobAllocation {

	
	 
	 @FindBy(xpath="//*[@id=\"MenuTree\"]/li[1]/a")
    public static WebElement homeIcon;
		
	
	@FindBy(id="iMenuID_2")
	public static WebElement transactionIcon;
	
 	@FindBy(id="iModuleID_28")
	public static WebElement jobAllocationIcon;
 	
 	
 	@FindBy(xpath="//*[@id=\"ID_jat_DynamicData\"]/div")
	public static List<WebElement> testGridTestList;
 	
	@FindBy(id="iFormID_110")
    public static WebElement jobJobAllocaitonIcon;
	
	@FindBy(id="ID_JBS_ReciveLabbutton")
    public static WebElement jobAllocaitonReceivedInLab;
	
	
	@FindBy(id="ID_ja_SampleCancel")
    public static WebElement jobAllocaitonCancel;
 	
	
	@FindBy(id="ID_SR_SampleTypeCombo1")
    public static WebElement advancedFilterSampleType;
	
	@FindBy(id="ID_JB_filter")
    public static WebElement advancedFilterIcon;
	
	
	@FindBy(id="ID_ja_filtrerstatuscheckbox")
    public static WebElement filterCheckbox;
 	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement jobAllocationAction;
	
	@FindBy(xpath="//*[@id=\"ID_jast_DynamicData\"]/div/div[1]/div[2]/p")
    public static List<WebElement> sampleTypeARNumberList;
	
	
	
 
	@FindBy(xpath="//*[@id=\"ID_JA_AdvancedView\"]/a")
    public static WebElement jobAllocationAdvancedFilterView;
 
	@FindBy(xpath="//*[@id=\"ID_JB_sampletype\"]")
    public static WebElement sampleTypeIcon;
	
 	
	@FindBy(id="ID_JB_sample")
    public static WebElement sampleIcon;
	
	@FindBy(id="ID_JA_test")
    public static WebElement testIcon;

	
	@FindBy(id="ID_ja_combobox_regtype")
    public static WebElement filterRegistrationType;
	
	@FindBy(id="ID_ja_combobox_regsubtype")
    public static WebElement filterSubType;
	
	@FindBy(id="ID_ja_combobox_filterstatus")
    public static WebElement filterSampleStatus;
	
	@FindBy(id="ID_ja_refresh")
    public static WebElement filterFindRecord;
	

	@FindBy(id="ID_ja_combobox_sampletype")
    public static WebElement filterSampleType;
	

	
	
	@FindBy(id="ID_SR_RegTypeCombo1")
    public static WebElement advancedFilterRegistrationType;
	
	@FindBy(id="ID_SR_RegSubTypeCombo1")
    public static WebElement advancedFilterSubType;
	
	@FindBy(id="ID_SR_FilterStatusCombo1")
    public static WebElement advancedFilterSampleStatus;
	
	@FindBy(id="ID_SR_FindSample1")
    public static WebElement advancedFilterFindRecord;
	
	//ID_SR_FindSample
	
	@FindBy(id="ID_JA_Home")
    public static WebElement advancedFilterHomeIcon;
	
	
	@FindBy(xpath="//*[@id=\"Actionbutton\"]/a")
    public static WebElement genericRegistrationInstrumentAction;
	
	
	
	@FindBy(id="Actionbutton")
    public static WebElement action;
	
	
	
	@FindBy(id="ID_SR_SampleRegistrationData")
    public static WebElement sampleTypeSampleTypeIcon;
	
	@FindBy(id="ID_BC_countryADDSubmit")
    public static WebElement sampleTypeSampleTypeAction;
	
	@FindBy(id="ID_JB_JoballocationFileData")
    public static WebElement sampleTypeAttachmentIcon;
	
	@FindBy(id="ID_JB_JoballocationCommentsData")
    public static WebElement sampleTypeCommentsIcon;
	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement sampleTypeAttachmentAction;
	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement sampleTypeCommentsAction;
	
	@FindBy(id="ID_JBS_JobAllocSampleTypeFileAddbutton")
    public static WebElement sampleTypeAttachmentAdd;
	
	@FindBy(id="ID_SR_Editattach")
    public static WebElement sampleTypeAttachmentEdit;
	

	@FindBy(id="ID_JobAllocation_Sample_uploadBtn")
    public static WebElement sampleTypeAttachmentFileUploadIcon;
	
	@FindBy(id="ID_JobAllocation_SampleFile_attachdesc")
    public static WebElement sampleTypeAttachmentDescription;
	
	
	@FindBy(id="ID_SRT_DeleteAttach")
    public static WebElement sampleTypeAttachmentDelete;
	
	@FindBy(id="ID_JobAllocation_SampleFileAddSubmit")
    public static WebElement sampleTypeAttachmentAddSubmit;
	
	@FindBy(id="ID_SampleRegistration_SampleFileCancel")
    public static WebElement sampleTypeAttachmentAddCancel;
	
	
	

	@FindBy(id="ID_JBS_JobAllocSampleTypeCommentsAddbutton")
    public static WebElement sampleTypeCommentsAdd;
	

	@FindBy(id="ID_JBS_JobAllocSampleTypeCommentsEditbutton")
    public static WebElement sampleTypeCommentsEdit;
	

	@FindBy(id="ID_JBS_JobAllocSampleTypeCommentsDeletebutton")
    public static WebElement sampleTypeCommentsDelete;
	

	@FindBy(id="ID_SC_JobAllocation_Comments_desc")
    public static WebElement sampleTypeComments;

	

	@FindBy(id="ID_JobAllocation_SampleCommentsAddSubmit")
    public static WebElement sampleTypeCommentsAddSubmit;
	

	@FindBy(id="ID_SampleRegistration_SampleCommentsAddCancel")
    public static WebElement sampleTypeCommentsAddCancel;
	
	

	@FindBy(id="ID_SampleRegistration_SampleCommentsEditSubmit")
    public static WebElement sampleTypeCommentsEditSubmit;
	

	@FindBy(id="ID_SampleRegistration_SampleCommentsEditCancel")
    public static WebElement sampleTypeCommentsEditCancel;
	
	
	
	
	 	
	
	
	
	
	
	@FindBy(id="ID_SR_subsampleins")
    public static WebElement sampleSampleIcon;
	
	/*@FindBy(id="ID_BC_countryADDSubmit")
    public static WebElement sampleTypeSampleTypeAction;
    
    
    
    
	*/
	
	
    @FindBy(id="ID_SR_test_addsample")
    public static WebElement sampleSampleAdd;
    
    @FindBy(id="ID_SR_Editsubsample")
    public static WebElement sampleSampleEdit;
    
    @FindBy(id="ID_SSR_CancelReject")
    public static WebElement sampleSampleCancelOrReject;
    
    @FindBy(id="ID_SSR_SampleCopy")
    public static WebElement sampleSampleCopy;
    
    @FindBy(id="ID_SSR_printbarcode")
    public static WebElement sampleSamplePrintBarcode;
    
    @FindBy(id="ID_SUB_Printbarcode")
    public static WebElement sampleSamplePrintBarcodeNew;
    
    
    
    
    
    
    
    @FindBy(id="ID_SR_Samples_ID")
    public static WebElement sampleSample;
    
    
    @FindBy(id="ID_SR_SamplesQUANTITY_ID")
    public static WebElement sampleSampleQuanity;
    
    @FindBy(id="ID_SR_SubSampleUnit")
    public static WebElement sampleSampleUnit;

    @FindBy(id="ID_SR_Remarks")
    public static WebElement sampleSampleRemarks;
    
    @FindBy(xpath="//*[@id=\"ID_SSR_OpenFilterPopUP\"]/button")
    public static WebElement sampleSampleViewTestList;
    
    @FindBy(id="selectall")
    public static WebElement sampleSampleTestSelectAll;
    
    @FindBy(xpath="//*[@id=\"ID_APC_ListDiv_43_0\"]/li")
    public static WebElement sampleSampleTestList;
    
    
    
    
    
	@FindBy(id="ID_JBS_JoballsampleFileAttachmentData")
    public static WebElement sampleAttachmentIcon;
	
	@FindBy(id="ID_JBS_JoballsampleCommentsData")
    public static WebElement sampleCommentsIcon;
	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement sampleAttachmentAction;
	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement sampleCommentsAction;
	
	
	@FindBy(id="ID_JBS_JobAllocFileAddbutton")
    public static WebElement sampleAttachmentAdd;
	
	@FindBy(id="ID_SRR_EDITtestattach")
    public static WebElement sampleAttachmentEdit;
	
	
	@FindBy(id="ID_JobAllocation_SubSample_uploadBtn")
    public static WebElement sampleAttachmentFileUploadIcon;
	

	@FindBy(id="ID_JobAllocation_SubSampleFile_attachdesc")
    public static WebElement sampleAttachmentDescription;
	
	
	@FindBy(id="ID_SRR_DELETEtestattach")
    public static WebElement sampleAttachmentDelete;
	
	
	
	@FindBy(id="ID_JobAllocation_SubSampleFileAddSubmit")
    public static WebElement sampleAttachmentAddSubmit;
	
	@FindBy(id="ID_SampleRegistration_SubSampleFileCancel")
    public static WebElement sampleAttachmentAddCancel;
	
	
	

	@FindBy(id="ID_JBS_JobAllocSampleCommentsAddbutton")
    public static WebElement sampleCommentsAdd;
	

	@FindBy(id="ID_SRR_EDITtestComments")
    public static WebElement sampleCommentsEdit;
	

	@FindBy(id="ID_SRR_DELETEtestCommentsID_SRR_DELETEtestComments")
    public static WebElement sampleCommentsDelete;
	

	@FindBy(id="ID_SSC_JobAllocation_Comments_desc")
    public static WebElement sampleComments;

	

	@FindBy(id="ID_JobAllocation_SubSampleCommentsAddSubmit")
    public static WebElement sampleCommentsAddSubmit;
	

	@FindBy(id="ID_SampleRegistration_SubSampleCommentsAddCancel")
    public static WebElement sampleCommentsAddCancel;
	
	

	@FindBy(id="ID_SampleRegistration_SubSampleCommentsEditSubmit")
    public static WebElement sampleCommentsEditSubmit;
	

	@FindBy(id="ID_SampleRegistration_SubSampleCommentsEditCancel")
    public static WebElement sampleCommentsEditCancel;
	
	
	
	
	

	

	@FindBy(id="ID_SR_SampleRegistrationTest")
    public static WebElement testTestIcon;
	

	@FindBy(id="ID_SR_SampleRegTestParameter")
    public static WebElement testParameterIcon;
	


	@FindBy(id="ID_JBS_JoballocTestFileAttachmentData")
    public static WebElement testAttachmentIcon;
	


	@FindBy(id="ID_JBS_JoballocTestCommentsData")
    public static WebElement testCommentsIcon;
	

	@FindBy(id="ID_SRT_CheckList")
    public static WebElement testAdditionalInformationIcon;
	

	@FindBy(id="ID_JBS_JobAllocAssignJob")
    public static WebElement testAssignJob;
	

	@FindBy(id="ID_ja_test_reschedule")
    public static WebElement testAllotAnotherUser;
	
	@FindBy(id="ID_ja_combobox_analyst")
    public static WebElement testAssignJobCertifiedAnalyst;
	
	
	
	

	@FindBy(id="ID_ja_test_reschedule")
    public static WebElement testReshedule;
	

	@FindBy(id="ID_ja_view_instrumentschedule")
    public static WebElement testAnalystCalender;
	
	
	//*[@id="ID_SST_OpenFilterPopUP"]/button
	
	@FindBy(xpath="//*[@id=\"ID_SST_OpenFilterPopUP\"]/button")
    public static WebElement testViewTest;
	
	@FindBy(id="selectall")
    public static WebElement testSelectAll;
	
	@FindBy(xpath="//*[@id=\"ID_APC_ListDiv_43_0\"]/li")
    public static WebElement testTestList;
	
	@FindBy(id="ID_SR_SubmitTest_Button")
    public static WebElement testAddSubmit;
	
	@FindBy(xpath="//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/input")
    public static WebElement testViewSearchField;
	
	@FindBy(xpath="//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/span/i")
    public static WebElement testViewSearchClose;
	
	@FindBy(id="ID_ja_allot_submit")
    public static WebElement testAssignJobSubmit;
	
	
	
	
	
	
	@FindBy(id="ID_TS_Section")
    public static WebElement testEditSectionSection;
	

	@FindBy(id="ID_SR_TestSubmit")
    public static WebElement testEditSectionSubmit;
	

	@FindBy(id="ID_SR_TestCancel")
    public static WebElement testEditSectionCancel;
	

	@FindBy(id="ID_SST_AdhocTest")
    public static WebElement testAdhocTestAdhocTest;
	

	@FindBy(id="ID_SR_SubmitAdhocTest_Button")
    public static WebElement testAdhocAddSubmit;
	

	@FindBy(id="ID_SR_CancelAdhocTest_Button")
    public static WebElement testAdhocAddCancel;
	

	
	

	@FindBy(id="ID_SR_EditParameter")
    public static WebElement testParameterEditSpecification;
	

	@FindBy(id="ID_SR_MinA")
    public static WebElement testParameterEditSpecificationInnerMinA;
	

	@FindBy(id="ID_SR_MAXA")
    public static WebElement testParameterEditSpecificationInnerMaxA;
	

	@FindBy(id="ID_SR_MinB")
    public static WebElement testParameterEditSpecificationOuterMinB;
	

	@FindBy(id="ID_SR_MaxB")
    public static WebElement testParameterEditSpecificationOuterMaxB;
	

	@FindBy(id="ID_SR_ParameterSubmit")
    public static WebElement testParameterEditSpecificationSubmit;
	

	@FindBy(id="ID_SR_ParameterCancel")
    public static WebElement testParameterEditSpecificationCancel;
	

	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement testAttachmentAction;
	
	
	@FindBy(xpath="//*[@id=\"ID_JB_ActionMenu\"]/a")
    public static WebElement testCommentsAction;
	
	
	@FindBy(id="ID_JBS_JobAllocTestFileAddbutton")
    public static WebElement testAttachmentAdd;
	
	@FindBy(id="ID_SRR_test_Editattach")
    public static WebElement testAttachmentEdit;
	
	
	@FindBy(id="ID_JobAllocation_Test_uploadBtn")
    public static WebElement testAttachmentFileUploadIcon;
	

	@FindBy(id="ID_JobAllocation_TestFile_attachdesc")
    public static WebElement testAttachmentDescription;
	
	
	@FindBy(id="ID_SRT_Test_DeleteAttach")
    public static WebElement testAttachmentDelete;
	
	
	
	@FindBy(id="ID_JobAllocation_TestFileAddSubmit")
    public static WebElement testAttachmentAddSubmit;
	
	@FindBy(id="ID_SampleRegistration_TestFileCancel")
    public static WebElement testAttachmentAddCancel;
	


	@FindBy(id="ID_JBS_JobAllocTestCommentsAddbutton")
    public static WebElement testCommentsAdd;
	

	@FindBy(id="ID_SRR_EDITtestComments")
    public static WebElement testCommentsEdit;
	

	@FindBy(id="ID_SRR_DELETEtestCommentsID_SRR_DELETEtestComments")
    public static WebElement testCommentsDelete;
	

	@FindBy(id="ID_TC_JobAllocation_Comments_desc")
    public static WebElement testComments;

	

	@FindBy(id="ID_JobAllocation_TestCommentsAddSubmit")
    public static WebElement testCommentsAddSubmit;
	

	@FindBy(id="ID_SampleRegistration_TestCommentsCancel")
    public static WebElement testCommentsAddCancel;
	
	

	@FindBy(id="ID_SampleRegistration_TestCommentsEditSubmit")
    public static WebElement testCommentsEditSubmit;
	

	@FindBy(id="ID_SampleRegistration_TestCommentsCancel")
    public static WebElement testCommentsEditCancel;
	
	@FindBy(id="ID_SR_SubmitTestCheckList")
    public static WebElement testAdditionalInformationSave;
	
	
	
	
	
	
	@FindBy(id="ID_SR_Preregister")
    public static WebElement sampleTypePreRegister;
	
	@FindBy(id="ID_SR_Dynamic_6607")
    public static WebElement sampleTypePreRegisterProjectCode;
	
	@FindBy(id="ID_SR_Dynamic_6608")
    public static WebElement sampleTypePreRegisterProjectName;
	
	
	@FindBy(id="ID_SR_Dynamic_6601")
    public static WebElement sampleTypePreRegisterInstrumentCategory;
	
	@FindBy(id="ID_SR_Dynamic_6602")
    public static WebElement sampleTypePreRegisterInstrumentID;
	
	@FindBy(id="ID_SR_Dynamic_6603")
    public static WebElement sampleTypePreRegisterInstrument;
	
	@FindBy(id="ID_SR_Dynamic_6605")
    public static WebElement sampleTypePreRegisterInstrumentSpecification;
	
	
	@FindBy(id="ID_SR_Import")
    public static WebElement sampleTypePreRegisterInstrumentImport;
	

	@FindBy(id="ID_SR_Submit")
    public static WebElement sampleTypePreRegisterInstrumentSubmit;
	

	@FindBy(id="ID_SR_Cancel")
    public static WebElement sampleTypePreRegisterInstrumentCancel;
	
	
	
	@FindBy(xpath="//*[@id=\"ID_SR_SampleRegistrationHeaderdiv\"]/div[2]/div[2]")
    public static WebElement sampleTypeMultiSelect;
	
	
	
	
	
	
	
	
	
	
	
}
