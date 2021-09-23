package ResultEntry;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementBatchRunCreation {
	
	@FindBy(id="iMenuID_2")
	public static WebElement transactionIcon;
	
 	@FindBy(id="iModuleID_11")
	public static WebElement resultEntryIcon;

	
	@FindBy(id="iFormID_227")
    public static WebElement batchRunCreationIcon;
	
	
	
	@FindBy(id="ID_BRC_BRCBATCHRUNCREATION")
    public static WebElement batchRunCreationTab;
	
	@FindBy(id="ID_BRC_BRCRUNSamples")
    public static WebElement sampleTab;
	
	
	@FindBy(id="ID_BRC_BRCINSTRUMENT")
    public static WebElement instrumentTab;
	
	
	@FindBy(id="ID_BRC_BRCMATERIAL")
    public static WebElement materialTab;
	
	

	@FindBy(id="ID_BRC_BRCfiltertype")
	public static WebElement filterIcon;
	

	
	@FindBy(id="ID_BRC_BRCRegtype")
    public static WebElement filterRegistrationType;
	
	@FindBy(id="ID_RBS_RegistrationSubtype")
    public static WebElement filterRegistrationSubType;
	
	
 	@FindBy(id="ID_BRC_filterstatus")
	public static WebElement filterStatus;
 	
 	

 	@FindBy(id="ID_BRC_statuscheckbox")
	public static WebElement filterStatusCheckbox;
 	
 	

 	@FindBy(id="ID_BRC_BRCFindintialSamples")
	public static WebElement filterFind;
 	
	
	@FindBy(xpath="//*[@id=\"ID_RBS_ResultEntryMaingetdiv\"]/div/div[2]")
	public static List<WebElement> checkBoxList;
	
	
	@FindBy(xpath="//*[@id=\"ID_BRC_BRCActionMenu\"]/a")
	public static WebElement batchRunCreationAction;
	
	
 	@FindBy(id="ID_BRC_Createbutton")
	public static WebElement batchRunCreationAdd;
	
 	@FindBy(id="ID_BRC_Deletebutton")
	public static WebElement batchRunCreationDelete;
	
 	@FindBy(id="ID_BRC_Editbutton")
	public static WebElement batchRunCreationEditRemark;
	
 	@FindBy(id="ID_BRC_ViewResultsbutton")
	public static WebElement batchRunCreationViewResult;
	
 	@FindBy(id="ID_BRC_Initiatebutton")
	public static WebElement batchRunCreationInitiate;
	
 	@FindBy(id="ID_batchrun_exportbutton")
	public static WebElement batchRunCreationExportToCSV;
	
 	@FindBy(id="ID_BRC_BRCCOMPLETE")
	public static WebElement batchRunCreationComplete;
 	
	@FindBy(id="ID_BRC_BRCCOMPLETE")
	public static WebElement batchRunCreationCompleteCancel;
	
 	@FindBy(id="ID_BRC_EDITBRCRemarks")
	public static WebElement batchRunCreationEditRemarkRemark;
	
 	@FindBy(id="ID_BRCEditSubmit")
	public static WebElement batchRunCreationEditRemarkSubmit;
	
	
 	@FindBy(id="ID_BRC_BRCEditCancel")
	public static WebElement batchRunCreationEditRemarkCancel;
	
	
	
	@FindBy(xpath="//*[@id=\"ID_BRC_BRCActionMenu\"]/a")
	public static WebElement sampleAction;
	
	@FindBy(xpath="//*[@id=\"ID_BRC_BRCActionMenu\"]/a")
	public static WebElement instrumentAction;
	
	
	@FindBy(xpath="//*[@id=\"ID_BRC_BRCActionMenu\"]/a")
	public static WebElement materialAction;
	
	
	@FindBy(id="ID_BRC_BRCTestName")
	public static WebElement testName;
	
	@FindBy(id="ID_BRC_BRCInstCat")
	public static WebElement instrumentCategory;
	
	@FindBy(id="ID_BRC_BRCInstID")
	public static WebElement instrument;
	
	@FindBy(id="ID_BRC_BRCProduct")
	public static WebElement sampleType;
	
	@FindBy(id="ID_BRC_BRCRemarks")
	public static WebElement remark;
	
	@FindBy(id="ID_BRC_BRCCreateFindSample")
	public static WebElement find;
	
	@FindBy(id="ID_BRC_CreateBatchRunsubmit")
	public static WebElement batchRunCreationAddSubmit;
	
	@FindBy(id="ID_BRC_BatchRunCancel")
	public static WebElement batchRunCreationAddCancel;
	
	
	@FindBy(xpath="//*[@id=\"447c9c84-140f-486f-b41d-8e6f133c1ff2\"]/input")
	public static WebElement selectAllSample;
	
	@FindBy(xpath="//*[@id=\"ID_RBS_DropDown\"]/a")
	public static List<WebElement> sampleList;
	 
	
	@FindBy(xpath="//input[@type='checkbox'])[17]")
	public static WebElement sampleOne;
	
	
	

	@FindBy(id="ID_BRC_AddANbutton")
	public static WebElement sampleAdd;
	

	@FindBy(id="ID_BRC_ANDelete")
	public static WebElement sampleDelete;

	
	@FindBy(id="ID_BRC_MaterialAddbutton")
	public static WebElement materialAdd;
	
	@FindBy(id="ID_BRC_MaterialEditbutton")
	public static WebElement materialEdit;
	
	@FindBy(id="ID_BRC_MaterialDeletebutton")
	public static WebElement materialDelete;
	
	@FindBy(id="ID_BRC_TestMatEditSubmit")
	public static WebElement materialEditSubmit;
	
	
	
	
	@FindBy(id="ID_BRC_TestMatType")
	public static WebElement standardType;
	
	@FindBy(id="ID_BRC_TestMatCat")
	public static WebElement materialCategory;
	
	@FindBy(id="ID_BRC_TestMaterial")
	public static WebElement material;
	
	@FindBy(id="ID_BRC_TestMatInv")
	public static WebElement inventoryID;
	
	@FindBy(id="ID_BRC_UsedQty")
	public static WebElement usedQuantity;
	
	@FindBy(id="ID_BRC_MobilePhase")
	public static WebElement mobilePhase;
	
	@FindBy(id="ID_BRC_CarrierGas")
	public static WebElement CarierGas;
	
	@FindBy(id="ID_BRC_MatRemarks")
	public static WebElement materialRemark;
	
	@FindBy(id="ID_BRC_TestMatAddSubmit")
	public static WebElement materialAddSubmit;
	
	
	
	
	

	@FindBy(id="ID_BRC_InstrumentAddbutton")
	public static WebElement instrumentAdd;
	
	@FindBy(id="ID_BRC_InstrumentEditbutton")
	public static WebElement instrumentEdit;
	
	@FindBy(id="ID_BRC_InstrumentDeletebutton")
	public static WebElement instrumentDelete;
	
	@FindBy(id="ID_BRC_TestInstCat")
	public static WebElement instrumentInstrumentCategory;
	
	@FindBy(id="ID_BRC_TestInstid")
	public static WebElement instrumentInstrumentID;
	
	@FindBy(id="ID_BRC_InstFromDate")
	public static WebElement instrumentFromDate;
	
	@FindBy(id="ID_BRC_InstFromTime")
	public static WebElement instrumentFromTime;
	
	
	@FindBy(id="ID_BRC_InstToDate")
	public static WebElement instrumentToDate;
	
	@FindBy(id="ID_BRC_InstToTime")
	public static WebElement instrumentToTime;
	
	
	
}
	
