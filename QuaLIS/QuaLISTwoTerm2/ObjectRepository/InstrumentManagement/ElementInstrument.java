package InstrumentManagement;



import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ElementInstrument {
	
	//Master
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
					
	//Instrument Management	
			@FindBy(id="iModuleID_7")
			public static WebElement instrumentManagementIcon;
			
	//Instrument
			@FindBy(id="iFormID_28")
			public static WebElement instrumentIcon;
			
			
			
			//*[@id="ID_IN_InstrumentDesignBind"]
			
			@FindBy(xpath="//*[@id=\"ID_IN_InstrumentDesignBind\"]/div/div[1]/div[1]/p")
			public static  List<WebElement> instrumentIDList;
			
			@FindBy(xpath="//*[@id=\"ID_IN_InstrumentDesignBind\"]/div/div[2]")
			public static  List<WebElement> checkboxList;
			
			@FindBy(xpath="//*[@id=\"ID_IN_InstumentValidationBind\"]/div")
			public static  List<WebElement> validationList;
			
			
			
			
			@FindBy(xpath="//*[@id=\"MenuTree\"]/li[1]/a")
			public static  WebElement homeIcon;
			
			
			
			
			
			
			
	//Filter		
			@FindBy(id="ID_IN_InstrumentCategoryCombo")
			public static WebElement instrumentFilterInstrumentCategory;
			
			@FindBy(id="ID_IN_FindInstrument")
			public static WebElement instrumentFilterFindInstrument;
			
			@FindBy(xpath="//*[@id=\"ID_IN_ActionMenu\"]/a")
			public static WebElement instrumentAction;
			
			@FindBy(xpath="//*[@id=\"ID_IN_ActionMenu\"]/a")
			public static WebElement instrumentValidationAction;
			
			@FindBy(xpath="//*[@id=\"ID_IN_ActionMenu\"]/a")
			public static WebElement instrumentCalibrationAction;
			
			@FindBy(xpath="//*[@id=\"ID_IN_ActionMenu\"]/a")
			public static WebElement instrumentMaintananceAction;
			
	//Add	
			@FindBy(id="ID_IN_InstrumentAddbutton")
			public static WebElement instrumentAdd;
			
			@FindBy(id="ID_IN_InstrumentCategoryaddCombo")
			public static WebElement instrumentCategory;
			
			@FindBy(id="ID_IN_Instrumentid")
			public static WebElement instrumentID;
			
			@FindBy(id="ID_IN_InstrumentName")
			public static WebElement instrumentName;
			
			@FindBy(id="ID_IN_suppliername")
			public static WebElement instrumentSupplier;
			
			@FindBy(id="ID_IN_Instrumentserialno")
			public static WebElement instrumentSerialNumber;
			
			@FindBy(id="ID_IN_Instrumentmodelno")
			public static WebElement instrumentModelNumber;
			
			@FindBy(id="ID_IN_manufacturename")
			public static WebElement instrumentManufactureName;
			
			@FindBy(id="ID_IN_Instrumentpono")
			public static WebElement instrumentPocketNumber;
			
			@FindBy(id="ID_IN_ManufactureDate")
			public static WebElement instrumentManufactureDate;
			
			Date d=Calendar.getInstance().getTime();
			
//			System.out.println(d);
			
			
			String dd=""+d;
			
			char[] arr=dd.toCharArray();
			
			char a=arr[8];
			
			char b=arr[9];
			String ab=a+""+b;

			
			@FindBy(xpath="//td[contains(text(),'27')]")
			public static WebElement instrumentManufactureDateValue;
			
			
			
			
			@FindBy(id="ID_IN_PODate")
			public static WebElement instrumentPocketDate;
			
			@FindBy(id="ID_IN_ReceivedDate")
			public static WebElement instrumentReceivedDate;
			
			@FindBy(id="ID_IN_InstallationDate")
			public static WebElement instrumentInstallationDate;
			
			@FindBy(id="ID_IN_WarrantyExpiryDate")
			public static WebElement instrumentWarrantyExpireDate;
			
			@FindBy(id="ID_IN_Serviceby")
			public static WebElement instrumentServicedBy;
			
			@FindBy(id="ID_IN_SectionComboname")
			public static WebElement instrumentSection;
			
			@FindBy(id="ID_IN_User")
			public static WebElement instrumentIncharge;
			
			@FindBy(id="ID_IN_Instrumentstatus")
			public static WebElement instrumentStatus;
			
			@FindBy(id="ID_IN_Windowperiodminustext")
			public static WebElement instrumentWindowPeriodFrom;
			
			@FindBy(id="ID_IN_Windowperiodminus")
			public static WebElement instrumentWindowPeriodFromUnit;
			
			@FindBy(id="ID_IN_Windowperiodplustext")
			public static WebElement instrumentWindowPeriodTo;
			
			@FindBy(id="ID_IN_Windowperiodplus")
			public static WebElement instrumentWindowPeriodToUnit;
			
			@FindBy(id="ID_TM_Instrumentremarks")
			public static WebElement instrumentRemarks;
			
			@FindBy(id="ID_IN_InstrumentADDSubmit")
			public static WebElement instrumentAddSubmit;
			
	//Parts		
			@FindBy(id="ID_IN_Parts")
			public static WebElement InstrmntPrts;
		
	//Add		
			@FindBy(id="ID_IN_Parts_add")
			public static WebElement AddInstrmntPrts;
					
			@FindBy(id="ID_IN_InstrumentPartsId")
			public static WebElement InstrmntPrtsID;
					
			@FindBy(id="ID_IN_InstrumentPartsNames")
			public static WebElement InstrmntPrtsNme;
					
			@FindBy(id="ID_IN_Instrumentpartsremarks")
			public static WebElement InstrmntPrtsRmrks;
					
			@FindBy(className="IN_InstrumentPartSubmitCss")
			public static WebElement InstrmntPrtsCllbrtnReq;
					
			@FindBy(id="ID_IN_PartsAdd_submit")
			public static WebElement SbmtInstrmntPrts;
					
	//Attribute		
			@FindBy(id="ID_IN_PartAttribute")
			public static WebElement InstrmntAttrbte;
		
	//Add		
			@FindBy(id="ID_IN_PartsAttr_add")
			public static WebElement AddInstrmntAttrbte;
		
			@FindBy(id="ID_INPA_PartAttributeName")
			public static WebElement InstrmntAttrbteNme;
		
			@FindBy(id="ID_INPA_PartAttributeDescription")
			public static WebElement InstrmntAttrbteVle;
		
			@FindBy(id="ID_IN_PartAttributeAdd_submit")
			public static WebElement SbmtInstrmntAttrbte;
		
			@FindBy(id="ID_IN_PartSubcontent")
			public static WebElement BckInstrmntPrts;
		
	//Section		
			@FindBy(id="ID_IN_SectionSubtab")
			public static WebElement InstrmntSctn;
		
	//Add		
			@FindBy(id="ID_IN_section_add")
			public static WebElement AddInstrmntSctn;
		
			@FindBy(id="ID_IN_Sectionaddcombo")
			public static WebElement InstrmntSctnSlctn;
		
			@FindBy(id="ID_IN_Sectionaddusercombo")
			public static WebElement InstrmntSctnInChrg;
		
			@FindBy(id="ID_IN_Sectionadd_submit")
			public static WebElement SbmtInstrmntSctn;
		
	//Validation		
			@FindBy(id="ID_IN_Validation")
			public static WebElement instrumentValidationIcon;
		
	//Add		
			@FindBy(id="ID_IN_validation_add")
			public static WebElement instrumentValidationAdd;
		
			@FindBy(id="ID_IN_ValidationDate")
			public static WebElement InstrmntVldtnDte;
		
			@FindBy(id="ID_IN_ValidationStatus")
			public static WebElement instrumentValidationStatus;
		
			@FindBy(id="ID_IN_Instrumentvalidationremarks")
			public static WebElement InstrmntVldtnRmrks;
		
			@FindBy(id="ID_IN_ValidationADD_submit")
			public static WebElement instrumentValidationAddSubmit;
		
	//File		
			@FindBy(id="ID_IN_ValidationFileSubtab")
			public static WebElement FileInstrmntVldtn;
		
	//Add		
			@FindBy(id="ID_IN_validationfile_add")
			public static WebElement AddFileInstrmntVldtn;
		
			@FindBy(id="ID_IN_validation_fileattachment")
			public static WebElement UpldFileInstrmntVldtn;
		
			@FindBy(id="ID_IN_validationfile_attachdesc")
			public static WebElement FileDescInstrmntVldtn;
		
			@FindBy(id="ID_IN_validationfile_AddFileSubmit_Button")
			public static WebElement SbmtFileInstrmntVldtn;
		
			@FindBy(id="ID_IN_Subvalidationcontent")
			public static WebElement instrumentValidationBack;
		
	//Callibration
			@FindBy(id="ID_IN_Calibration")
			public static WebElement intrumentCalibraitonIcon;
			
	//Add		
			@FindBy(id="ID_IN_calibration_add")
			public static WebElement instrumetCalibrationAdd;
			
			@FindBy(id="ID_IN_CalibrationLastDate")
			public static WebElement InstrmntCllbrtnLstDte;
			
			@FindBy(id="ID_IN_CalibrationdueDate")
			public static WebElement InstrmntCllbrtnDueDte;
			
			@FindBy(id="ID_IN_CalibrationAddStatus")
			public static WebElement instrumentCalibrationStatus;
			
			@FindBy(id="ID_IN_addcalibration_submit")
			public static WebElement instrumentCalibrationAddSubmit;
			
	//File
			@FindBy(id="ID_IN_CalibrationFileSubtab")
			public static WebElement FileInstrmntCllbrtn;
			
	//Add		
			@FindBy(id="ID_IN_calibrationfile_add")
			public static WebElement AddFileInstrmntCllbrtn;
			
			@FindBy(id="ID_IN_calibration_fileattachment")
			public static WebElement UpldFileInstrmntCllbrtn;
			
			@FindBy(id="ID_IN_calibrationfile_attachdesc")
			public static WebElement FileDescInstrmntCllbrtn;
			
			@FindBy(id="ID_IN_calibrationfile_AddFileSubmit_Button")
			public static WebElement SbmtFileInstrmntCllbrtn;
			
			@FindBy(id="ID_IN_Subcalibrationcontent")
			public static WebElement instrumentCalibrationBack;
			
	//Maintenance
			@FindBy(id="ID_IN_Maintanence")
			public static WebElement instrumentMaintanceIcon;
			
	//Add		
			@FindBy(id="ID_IN_maintanence_add")
			public static WebElement instrumentMaintananceAdd;
			
			@FindBy(id="ID_IN_MaintenanceLastDate")
			public static WebElement InstrmntMaintenanceLstDte;
			
			@FindBy(id="ID_IN_MaintenancedueDate")
			public static WebElement InstrmntMaintenanceDueDte;
			
			@FindBy(id="ID_IN_MaintenanceAddStatus")
			public static WebElement instrumentMaintananceStatus;
			
			@FindBy(id="ID_IN_addmaintanance_submit")
			public static WebElement instrumentMaintananceAddSubmit;
			
	//File
			@FindBy(id="ID_IN_MaintenanceFileSubtab")
			public static WebElement FileInstrmntMaintenance;
			
	//Add		
			@FindBy(id="ID_IN_maintenancefile_add")
			public static WebElement AddFileInstrmntMaintenance;
			
			@FindBy(id="ID_IN_maintenance_fileattachment")
			public static WebElement UpldFileInstrmntMaintenance;
			
			@FindBy(id="ID_IN_maintenancefile_attachdesc")
			public static WebElement FileDescInstrmntMaintenance;
			
			@FindBy(id="ID_IN_maintenancefile_AddFileSubmit_Button")
			public static WebElement SbmtFileInstrmntMaintenance;
					
			@FindBy(id="ID_IN_addmaintanance_submit")
			public static WebElement instrumentMaintanaceAddSubmit;
					
	}