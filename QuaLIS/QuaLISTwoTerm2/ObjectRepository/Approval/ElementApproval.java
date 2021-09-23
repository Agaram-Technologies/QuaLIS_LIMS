package Approval;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import Config.ElementName;


public class ElementApproval extends ElementName {

	@FindBy(id = "iMenuID_2")
	public static WebElement transactionIcon;

	@FindBy(id = "iModuleID_12")
	public static WebElement approvalIcon;

	@FindBy(id = "ID_AP_ReCalc")
	public static WebElement Recalc;

	@FindBy(id = "ID_AP_ReTest")
	public static WebElement Retest;

	@FindBy(id = "iFormID_61")
	public static WebElement approvalApprovalIcon;

	@FindBy(id = "ID_JBS_ReciveLabbutton")
	public static WebElement jobAllocaitonReceivedInLab;

	@FindBy(id = "ID_ja_SampleCancel")
	public static WebElement jobAllocaitonCancel;

	@FindBy(xpath = "//*[@id=\"ID_AP_BindData\"]/div/div[1]/div[2]/p")
	public static List<WebElement> ARNumberList;

	@FindBy(xpath = "//*[@id=\"ID_AP_BindData\"]/div/div[2]")
	public static List<WebElement> checkBoxList;

	@FindBy(id = "ID_SR_SampleTypeCombo1")
	public static WebElement advancedFilterSampleType;

	@FindBy(id = "ID_JB_filter")
	public static WebElement advancedFilterIcon;

	@FindBy(xpath = "//*[@id=\"ID_JB_ActionMenu\"]/a")
	public static WebElement jobAllocationAction;;

	@FindBy(id = "ID_JB_sampletype")
	public static WebElement sampleTypeIcon;;

	@FindBy(id = "ID_AP_subsample1")
	public static WebElement sampleIcon;

	@FindBy(id = "ID_AP_testtab")
	public static WebElement testIcon;

	@FindBy(id = "ID_AP_Sampletype")
	public static WebElement filterSampleType;

	@FindBy(id = "ID_AP_Registrationtype")
	public static WebElement filterRegistrationType;

	@FindBy(id = "ID_AP_RegistrationSubtype")
	public static WebElement filterSubType;

	@FindBy(id = "ID_SR_FilterStatusCombo")
	public static WebElement filterSampleStatus;

	@FindBy(id = "ID_AP_FindSamples")
	public static WebElement filterFindRecord;

	@FindBy(id = "ID_AP_NeedFilterCheckbox")
	public static WebElement filterStatusCheckbox;

	@FindBy(id = "ID_AP_FilterStatus")
	public static WebElement filterFilterStatus;

	@FindBy(id = "AP_filtertype")
	public static WebElement filterIcon;

	@FindBy(id = "ID_SR_RegTypeCombo1")
	public static WebElement advancedFilterRegistrationType;

	@FindBy(id = "ID_SR_RegSubTypeCombo1")
	public static WebElement advancedFilterSubType;

	@FindBy(id = "ID_SR_FilterStatusCombo1")
	public static WebElement advancedFilterSampleStatus;

	@FindBy(id = "ID_SR_FindSample1")
	public static WebElement advancedFilterFindRecord;

	// ID_SR_FindSample

	@FindBy(id = "AP_Home")
	public static WebElement advancedFilterHomeIcon;

	@FindBy(xpath = "//*[@id=\"ID_APT_ActionMenu\"]/a")
	public static WebElement testAction;

	@FindBy(xpath = "//*[@id=\"ID_AP_ActionMenu\"]/a")
	public static WebElement sampleTypeAction;

	@FindBy(id = "ID_AP_Review")
	public static WebElement approvalReview;

	@FindBy(id = "ID_AP_Approve")
	public static WebElement approvalApprove;

	@FindBy(id = "ID_AP_Release")
	public static WebElement approvalRelease;

	@FindBy(id = "submitbtnAPsection")
	public static WebElement sectionSubmit;



	@FindBy(id = "ID_SR_subsampleins")
	public static WebElement sampleSampleIcon;


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
	public static WebElement sampleSample;

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

	@FindBy(id = "ID_SR_Cancel_Button")
	public static WebElement sampleSampleAddCancel;

	@FindBy(id = "ID_SR_Submit_Button")
	public static WebElement sampleSampleEditSubmit;

	@FindBy(id = "ID_SR_Cancel_Button")
	public static WebElement sampleSampleEditCancel;



	@FindBy(id = "ID_SR_SampleRegistrationTest")
	public static WebElement testTestIcon;

	@FindBy(id = "ID_SR_SampleRegTestParameter")
	public static WebElement testParameterIcon;


	@FindBy(id = "ID_SRT_TestComments")
	public static WebElement testCommentssIcon;

	@FindBy(id = "ID_SRT_CheckList")
	public static WebElement testAdditionalInformationIcon;

	@FindBy(id = "ID_JBS_JobAllocAssignJob")
	public static WebElement testAssignJob;

	@FindBy(id = "ID_ja_test_reschedule")
	public static WebElement testAllotAnotherUser;

	@FindBy(id = "ID_ja_combobox_analyst")
	public static WebElement testAssignJobCertifiedAnalyst;

	@FindBy(id = "ID_ja_view_userschedule")
	public static WebElement testReshedule;

	@FindBy(id = "ID_ja_view_instrumentschedule")
	public static WebElement testAnalystCalender;

	// *[@id="ID_SST_OpenFilterPopUP"]/button

	@FindBy(xpath = "//*[@id=\"ID_SST_OpenFilterPopUP\"]/button")
	public static WebElement testViewTest;

	@FindBy(id = "selectall")
	public static WebElement testSelectAll;

	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_43_0\"]/li")
	public static WebElement testTestList;

	@FindBy(id = "ID_SR_SubmitTest_Button")
	public static WebElement testAddSubmit;

	@FindBy(xpath = "//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/input")
	public static WebElement testViewSearchField;

	@FindBy(xpath = "//*[@id=\"ID_SST_FilterPopUp1\"]/span/div/span/i")
	public static WebElement testViewSearchClose;

	@FindBy(id = "ID_ja_allot_submit")
	public static WebElement testAssignJobSubmit;

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



	@FindBy(id = "ID_SR_SubmitTestCheckList")
	public static WebElement testAdditionalInformationSave;

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

	@FindBy(xpath = "//*[@id=\"ID_APT_ActionMenu\"]/a")
	public static WebElement testAttachmentAction;

	@FindBy(xpath = "//*[@id=\"ID_APT_ActionMenu\"]/a")
	public static WebElement testCommentsAction;

	@FindBy(id = "ID_Approval_Test_uploadBtn")
	public static WebElement testAttachmentFileUploadIcon;

	@FindBy(id = "ID_Approval_SampleFileType_Combo")
	public static WebElement sampleTypeAttachmentType;

	@FindBy(id = "ID_Approval_SubSampleFileType_Combo")
	public static WebElement sampleAttachmentType;

	@FindBy(id = "ID_Approval_TestFileType_Combo")
	public static WebElement testAttachmentType;

	@FindBy(id = "ID_Approvalmainsample")
	public static WebElement sampleTypeSampleTypeIcon;

	@FindBy(id = "ID_AP_SampleAttachment")
	public static WebElement sampleTypeAttachmentIcon;

	@FindBy(id = "ID_AP_SampleComments")
	public static WebElement sampleTypeCommentsIcon;

	@FindBy(xpath = "//*[@id=\"ID_AP_ActionMenu\"]/a")
	public static WebElement sampleTypeAttachmentAction;

	@FindBy(id = "ID_APST_AddFile")
	public static WebElement sampleTypeAttachmentAdd;

	@FindBy(id = "ID_APST_EditFile")
	public static WebElement sampleTypeAttachmentEdit;

	@FindBy(id = "ID_Approval_Sample_uploadBtn")
	public static WebElement sampleTypeAttachmentFileUploadIcon;

	@FindBy(id = "ID_Approval_SampleFile_attachdesc")
	public static WebElement sampleTypeAttachmentDescription; // done

	@FindBy(id = "ID_APST_DeleteFile")
	public static WebElement sampleTypeAttachmentDelete; // done

	@FindBy(id = "ID_Approval_SampleFileAddSubmit")
	public static WebElement sampleTypeAttachmentAddSubmit; // done

	@FindBy(id = "ID_Approval_SampleFileEditSubmit")
	public static WebElement sampleTypeAttachmentEditSubmit; // done

	@FindBy(id = "ID_Approval_SampleFileCancel")
	public static WebElement sampleTypeAttachmentAddCancel; // done

	@FindBy(id = "//*[@id=\"ID_AP_ActionMenu\"]/a")
	public static WebElement sampleTypeCommentsAction; // done

	@FindBy(id = "ID_APST_AddComments")
	public static WebElement sampleTypeCommentsAdd; // done

	@FindBy(id = "ID_APST_EditComments")
	public static WebElement sampleTypeCommentsEdit; // done

	@FindBy(id = "ID_SRT_Deletecomments")
	public static WebElement sampleTypeCommentsDelete; // done

	@FindBy(id = "ID_SC_Approval_Comments_desc")
	public static WebElement sampleTypeComments; // done

	@FindBy(id = "ID_Approval_SampleCommentsAddSubmit")
	public static WebElement sampleTypeCommentsAddSubmit; // done

	@FindBy(id = "ID_Approval_SampleCommentsAddCancel")
	public static WebElement sampleTypeCommentsAddCancel; // done

	@FindBy(id = "ID_Approval_SampleCommentsEditSubmit")
	public static WebElement sampleTypeCommentsEditSubmit; // done

	@FindBy(id = "ID_Approval_SampleCommentsEditCancel")
	public static WebElement sampleTypeCommentsEditCancel; // done

	@FindBy(id = "ID_AP_SubAttachment")
	public static WebElement sampleAttachmentIcon; // done

	@FindBy(id = "ID_AP_SubComments")
	public static WebElement sampleCommentsIcon; // done

	@FindBy(xpath = "//*[@id=\"ID_AP_ActionMenu\"]/a") // done
	public static WebElement sampleAttachmentAction;

	@FindBy(id = "ID_APST_AddSubFile")
	public static WebElement sampleAttachmentAdd; // done

	@FindBy(id = "ID_APST_EditSubFile")
	public static WebElement sampleAttachmentEdit; // done

	@FindBy(xpath = "ID_Approval_SubSample_uploadBtn")
	public static WebElement sampleAttachmentFileUploadIcon; // done

	@FindBy(id = "ID_Approval_SubSampleFile_attachdesc")
	public static WebElement sampleAttachmentDescription; // done

	@FindBy(id = "ID_SRR_DELETEtestattach")
	public static WebElement sampleAttachmentDelete; // done

	@FindBy(id = "ID_Approval_SubSampleFileAddSubmit")
	public static WebElement sampleAttachmentAddSubmit; // done

	@FindBy(id = "ID_Approval_SubSampleFileCancel")
	public static WebElement sampleAttachmentAddCancel; // done

	@FindBy(id = "ID_Approval_SubSampleFileEditSubmit")
	public static WebElement sampleAttachmentEditSubmit; // done

	@FindBy(id = "ID_APST_AddSubComments")
	public static WebElement sampleCommentsAdd; // done

	@FindBy(id = "ID_APST_EditSubComments")
	public static WebElement sampleCommentsEdit; // done

	@FindBy(id = "ID_APST_DeleteSubComments")
	public static WebElement sampleCommentsDelete; // done

	@FindBy(id = "ID_SSC_Approval_Comments_desc")
	public static WebElement sampleComments; // done

	@FindBy(id = "ID_Approval_SubSampleCommentsAddSubmit") // done
	public static WebElement sampleCommentsAddSubmit;

	@FindBy(id = "ID_Approval_SubSampleCommentsAddCancel") // done
	public static WebElement sampleCommentsAddCancel;

	@FindBy(id = "ID_Approval_SubSampleCommentsEditSubmit") // Done
	public static WebElement sampleCommentsEditSubmit;

	@FindBy(id = "ID_Approval_SubSampleCommentsEditCancel") // done
	public static WebElement sampleCommentsEditCancel;

	@FindBy(id = "ID_AP_testAttachment")
	public static WebElement testAttachmentIcon; // Done

	@FindBy(id = "ID_AP_testComments")
	public static WebElement testCommentsIcon; // Done

	@FindBy(id = "ID_APST_AddTestFile")
	public static WebElement testAttachmentAdd; // Done

	@FindBy(id = "ID_APST_EditTestFile")
	public static WebElement testAttachmentEdit; // Done

	@FindBy(id = "ID_Approval_TestFile_attachdesc")
	public static WebElement testAttachmentDescription;

	@FindBy(id = "ID_APST_DeleteTestFile")
	public static WebElement testAttachmentDelete; // Done

	@FindBy(id = "ID_Approval_TestFileAddSubmit")
	public static WebElement testAttachmentAddSubmit; // done

	@FindBy(id = "ID_Approval_TestFileCancel")
	public static WebElement testAttachmentAddCancel; // Done

	@FindBy(id = "ID_Approval_TestFileEditSubmit")
	public static WebElement testAttachmentEditSubmit;

	@FindBy(id = "ID_Approval_TestFileCancel")
	public static WebElement testAttachmentEditCancel;

	@FindBy(id = "ID_APST_AddTestComments")
	public static WebElement testCommentsAdd; // done

	@FindBy(id = "ID_APST_EditTestComments")
	public static WebElement testCommentsEdit; // done

	@FindBy(id = "ID_APST_DeleteTestComments")
	public static WebElement testCommentsDelete;

	@FindBy(id = "ID_AP_testComments")
	public static WebElement testComments;

	@FindBy(id = "ID_Approval_TestCommentsAddSubmit")
	public static WebElement testCommentsAddSubmit;

	@FindBy(id = "ID_Approval_TestCommentsCancel")
	public static WebElement testCommentsAddCancel;

	@FindBy(id = "ID_Approval_TestCommentsEditSubmit")
	public static WebElement testCommentsEditSubmit;

	@FindBy(id = "ID_Approval_TestCommentsCancel")
	public static WebElement testCommentsEditCancel;

	@FindBy(xpath = "//*[@id=\"ID_AP_ActionMenu\"]/a")
	public static WebElement sampleCommentsAction;

	public static Map<String, WebElement> sampleTypeAttachment() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.attachmentIcon, sampleTypeAttachmentIcon);

		element.put(ElementName.attachmentAction, sampleTypeAttachmentAction);

		element.put(ElementName.attachmentAdd, sampleTypeAttachmentAdd);

		element.put(ElementName.attachment, sampleTypeAttachmentFileUploadIcon);

		element.put(ElementName.attachmentEdit, sampleTypeAttachmentEdit);

		element.put(ElementName.attachmentDelete, sampleTypeAttachmentDelete);

		element.put(ElementName.attachmentDescription, sampleTypeAttachmentDescription);

		element.put(ElementName.attachmentAddSubmit, sampleTypeAttachmentAddSubmit);

		element.put(ElementName.attachmentEditSubmit, sampleTypeAttachmentEditSubmit);

		return element;
	}

	public static Map<String, WebElement> sampleAttachment() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.attachmentIcon, sampleAttachmentIcon);

		element.put(ElementName.attachmentAction, sampleAttachmentAction);

		element.put(ElementName.attachmentAdd, sampleAttachmentAdd);

		element.put(ElementName.attachment, sampleAttachmentFileUploadIcon);

		element.put(ElementName.attachmentEdit, sampleAttachmentEdit);

		element.put(ElementName.attachmentDelete, sampleAttachmentDelete);

		element.put(ElementName.attachmentDescription, sampleAttachmentDescription);

		element.put(ElementName.attachmentAddSubmit, sampleAttachmentAddSubmit);

		element.put(ElementName.attachmentEditSubmit, sampleAttachmentEditSubmit);

		return element;
	}

	public static Map<String, WebElement> testAttachment() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.attachmentIcon, testAttachmentIcon);

		element.put(ElementName.attachmentAction, testAttachmentAction);

		element.put(ElementName.attachmentAdd, testAttachmentAdd);

		element.put(ElementName.attachment, testAttachmentFileUploadIcon);

		element.put(ElementName.attachmentEdit, testAttachmentEdit);

		element.put(ElementName.attachmentDelete, testAttachmentDelete);

		element.put(ElementName.attachmentDescription, testAttachmentDescription);

		element.put(ElementName.attachmentAddSubmit, testAttachmentAddSubmit);

		element.put(ElementName.attachmentEditSubmit, testAttachmentEditSubmit);

		return element;
	}

	public static Map<String, WebElement> testComments() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.commentsIcon, testCommentsIcon);

		element.put(ElementName.commentsAction, testCommentsAction);

		element.put(ElementName.commentsAdd, testCommentsAdd);

		element.put(ElementName.comments, testComments);

		element.put(ElementName.commentsEdit, testCommentsEdit);

		element.put(ElementName.commentsDelete, testCommentsDelete);

		element.put(ElementName.commentsAddSubmit, testCommentsAddSubmit);

		element.put(ElementName.commentsEditSubmit, testCommentsEditSubmit);

		return element;
	}

	public static Map<String, WebElement> sampleComments() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.commentsIcon, sampleCommentsIcon);

		element.put(ElementName.commentsAction, sampleCommentsAction);

		element.put(ElementName.commentsAdd, sampleCommentsAdd);

		element.put(ElementName.comments, sampleComments);

		element.put(ElementName.commentsEdit, sampleCommentsEdit);

		element.put(ElementName.commentsDelete, sampleCommentsDelete);

		element.put(ElementName.commentsAddSubmit, sampleCommentsAddSubmit);

		element.put(ElementName.commentsEditSubmit, sampleCommentsEditSubmit);

		return element;
	}

	public static Map<String, WebElement> sampleTypeComments() {
		Map<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(ElementName.commentsIcon, sampleTypeCommentsIcon);

		element.put(ElementName.commentsAction, sampleTypeCommentsAction);

		element.put(ElementName.commentsAdd, sampleTypeCommentsAdd);

		element.put(ElementName.comments, sampleTypeComments);

		element.put(ElementName.commentsEdit, sampleTypeCommentsEdit);

		element.put(ElementName.commentsDelete, sampleTypeCommentsDelete);

		element.put(ElementName.commentsAddSubmit, sampleTypeCommentsAddSubmit);

		element.put(ElementName.commentsEditSubmit, sampleTypeCommentsEditSubmit);

		return element;
	}

}
