package MaterialManagement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMaterial {

	//Master
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
			
			@FindBy(id="ID_MT_MaterialTypeCombo")
			public static WebElement materialTypeType ;
		
			
			
			@FindBy(xpath="//*[@id=\"ID_MT_ActionMenu\"]/a")
			public static WebElement materialInventoryAction;
		
								
	//Material Management	
			@FindBy(id="iModuleID_8")
			public static WebElement materialManagementIcon;
						
	//Material
			@FindBy(id="iFormID_40")
			public static WebElement materialIcon;
				
	//Filter
			@FindBy(id="ID_MT_MaterialTypeCombo")
			public static WebElement materialFilterMaterialType;
				
			@FindBy(id="ID_MT_MaterialCategoryCombo")
			public static WebElement materialFilterMaterialCategory;
				
			@FindBy(id="ID_MT_FindMaterial")
			public static WebElement materialFilterFindMaterial;
				
			@FindBy(className="TM_StaticActionIcon")
			public static WebElement materialAction;
				
	//Add
			@FindBy(id="ID_MT_MatAddbutton")
			public static WebElement materialAdd;
				
			@FindBy(id="ID_MT_MaterialCatpopup")
			public static WebElement materialMaterialCategory;
				
			@FindBy(id="ID_MT_MaterialName")
			public static WebElement material;
				
			@FindBy(id="ID_MT_Basicuom")
			public static WebElement materialUnit;
				
			@FindBy(id="ID_MT_Materialprefix")
			public static WebElement materialPrefix;
				
			@FindBy(id="ID_MT_Materialquarantine")
			public static WebElement materialQuarantine;
				
			@FindBy(id="ID_MT_Materialreorderlvl")
			public static WebElement meterialReorder;
				
			@FindBy(id="ID_MT_Materialopenexp")
			public static WebElement materialOpenExpiry;
				
			@FindBy(id="ID_MT_Openexperiod")
			public static WebElement meterialOpenExpiryPeriod;
				
			@FindBy(id="ID_MT_Materialnxtvalidation")
			public static WebElement materialNextValidation;
				
			@FindBy(id="ID_MT_Nextvalperiod")
			public static WebElement materialNextValidationPeriod;
				
			@FindBy(id="ID_MT_MateriaExpirypolicy")
			public static WebElement materialExpiryDays;
				
			@FindBy(id="ID_MT_Expirypolicyperiod")
			public static WebElement materialExpiryDaysPeriod;
				
			@FindBy(id="ID_MT_MaterialRemarks")
			public static WebElement materialRemarks;
				
			@FindBy(id="ID_MT_MatAddSubmit")
			public static WebElement materialAddSubmit;
				
	//Material Section		
			@FindBy(id="ID_MT_MaterialSectionData")
			public static WebElement materialSectionIcon;
				
	//Add		
			@FindBy(id="ID_MTI_MaterialSecAddbutton")
			public static WebElement materialSectionAdd;
				
			@FindBy(id="ID_MTS_MaterialSection")
			public static WebElement MtrlsctnSctnSlctn;
				
			@FindBy(id="ID_MTS_Materialreorderlvl")
			public static WebElement MtrlsctnReorderLvl;
				
			@FindBy(id="ID_MTS_Sectionadd_submit")
			public static WebElement SbmtMtrlsctn;		
		
	//Material Inventory
			@FindBy(id="ID_MT_MaterialinventoryData")
			public static WebElement materialInventoryIcon;
				
	//Add		
			@FindBy(id="ID_MTI_MaterialInvAddbutton")
			public static WebElement materialInventoryAdd;
				
			@FindBy(id="ID_MTI_InternalRef")
			public static WebElement materialInventoryInternalRefrence;
				
			@FindBy(id="ID_MTI_BatchNo")
			public static WebElement materialInventoryBatchNumber;
				
			@FindBy(id="ID_MTI_MaterialLotNo")
			public static WebElement materialInventoryLotNumber;
				
			@FindBy(id="ID_MTI_MaterialRefereceNo")
			public static WebElement materialInventoryRefrenceNumber;
				
			@FindBy(id="ID_MTI_MaterialContainerid")
			public static WebElement materialInventoryContainerID;
		
			@FindBy(id="ID_MTI_StorageLocation")
			public static WebElement materialInventoryStorageLocation;
				
			@FindBy(id="ID_MTI_Supplier")
			public static WebElement materialInventorySupplier;
				
			@FindBy(id="ID_JQMTI_Projectid")
			public static WebElement materialInventoryProjectID;
				
			@FindBy(id="ID_JQMTI_Project")
			public static WebElement materialIventoryProjectName;
				
			@FindBy(id="ID_MTI_Manufacturer")
			public static WebElement materialInventoryManufacture;
				
			@FindBy(id="ID_MTI_Section")
			public static WebElement materialInventorySection;
				
			@FindBy(id="ID_MTI_Grade")
			public static WebElement materialInventoryGrade;
				
			@FindBy(id="ID_MTI_ReceivedDate")
			public static WebElement materialInventoryReceivedDate;
				
			@FindBy(id="ID_MTI_ExpiryDate")
			public static WebElement materialInventoryExpiryDate;
				
			@FindBy(id="ID_MT_MateriaQuantityReceived")
			public static WebElement materialInventoryQuantityReceived;
				
			@FindBy(id="ID_MTI_QtyUnit")
			public static WebElement materialInventoryQuantityUnit;
				
			@FindBy(id="ID_MTI_MaterialCost")
			public static WebElement materialInventoryCost;
				
			@FindBy(id="ID_MTI_MaterialInvRemarks")
			public static WebElement materialInventoryRemarks;

			@FindBy(id="ID_MTI_MatAddSubmit")
			public static WebElement materialInventoryAddSubmit;
			
			@FindBy(id="ID_MTI_MaterialInvReleasebutton")
			public static WebElement ReleaseMtrlInvntry;
			
	//Inventory Transaction
			@FindBy(id="ID_MTI_InventoryTransactionData")
			public static WebElement InvTrnsctn;
			
	//Quantity Transaction		
			@FindBy(id="ID_MTI_MaterialInvTransferQtybutton")
			public static WebElement InvTrnsctnQtityTrnsctn;
			
			@FindBy(id="ID_MTI_InventoryTransType")
			public static WebElement InvTrnsctnTyp;
			
			@FindBy(id="ID_MTI_TransactionType")
			public static WebElement InvTrnsctnTrnsTyp;
			
			@FindBy(id="ID_MTI_TransactionDate")
			public static WebElement InvTrnsctnTrnsDte;
			
			@FindBy(id="ID_MTI_TransSection")
			public static WebElement InvTrnsctnSctn;
			
			@FindBy(id="ID_MTI_Quantity")
			public static WebElement InvTrnsctnQtity;
			
			@FindBy(id="ID_MTI_TransQtyComments")
			public static WebElement InvTrnsctnCmmts;
			
			@FindBy(id="ID_MTI_TransferQtyCancel")
			public static WebElement InvTrnsctnCncl;
		
	//File
			@FindBy(id="ID_MTI_FileAttachmentData")
			public static WebElement FileInvTrnsctn;
		
	//Add		
			@FindBy(id="ID_MTI_MaterialInvFileAddbutton")
			public static WebElement AddFileInvTrnsctn;
					
			@FindBy(id="ID_MT_InventoryFileattachment")
			public static WebElement UpldFileInvTrnsctn;
					
			@FindBy(id="ID_MT_InventoryFile_attachdesc")
			public static WebElement FileDescInvTrnsctn;
					
			@FindBy(id="ID_MT_InventoryFile_AddSubmit_Button")
			public static WebElement SbmtFileInvTrnsctn;
			
	//ResultEntry Transaction		
			@FindBy(id="ID_MTI_ResultEntryTransData")
			public static WebElement ResultEntryTrnsctn;
		
			@FindBy(id="ID_MTI_MaterialInveSubLeftMenu")
			public static WebElement BckMtrlInvntry;
			
	//MSDS Attachment
			@FindBy(xpath="//a[@id='ID_MT_MaterialMSDSData']")
			public static WebElement MSDSAttchmnt;
			
	//Safety Instruction		
			@FindBy(id="ID_MT_MaterialNoflame")
			public static WebElement MSDSAttchmntSIInflmbl;
			
			@FindBy(id="ID_MT_MaterialKeepRef")
			public static WebElement MSDSAttchmntSIKpRfgrtd;
			
			@FindBy(id="ID_MT_MaterialNoAcids")
			public static WebElement MSDSAttchmntSINoAcds;
			
			@FindBy(id="ID_MT_MaterialNoBases")
			public static WebElement MSDSAttchmntSINoBses;
			
			@FindBy(id="ID_MT_MaterialNoOxidizer")
			public static WebElement MSDSAttchmntSINoOxdzr;
			
			@FindBy(id="ID_MT_Materialncorrosive")
			public static WebElement MSDSAttchmntSICrrsve;
			
			@FindBy(id="ID_MT_Materialnhazardous")
			public static WebElement MSDSAttchmntSIHzrds;
			
			@FindBy(id="ID_MT_Materialnavoidexposelight")
			public static WebElement MSDSAttchmntSIAvdExpsrLght;
			
			@FindBy(id="ID_MT_Materialnppe")
			public static WebElement MSDSAttchmntSIPrsnlPrctveEqpmt;
			
			@FindBy(id="ID_MT_MaterialKeepFrozen")
			public static WebElement MSDSAttchmntSIKpFrzn;
			
			@FindBy(id="ID_MT_MaterialKeepDesicated")
			public static WebElement MSDSAttchmntSIKpDsctd;
			
			@FindBy(id="ID_MT_MaterialClothing")
			public static WebElement MSDSAttchmntSIClthng;
			
			@FindBy(id="ID_MT_MaterialGoggles")
			public static WebElement MSDSAttchmntSIGggls;
			
			@FindBy(id="ID_MT_MaterialGloves")
			public static WebElement MSDSAttchmntSIGlvs;
			
			@FindBy(id="ID_MT_MaterialHealth")
			public static WebElement MSDSAttchmntSIHlth;
			
			@FindBy(id="ID_MT_MaterialReactivity")
			public static WebElement MSDSAttchmntSIRctvty;
			
			@FindBy(id="ID_MT_MaterialFlammable")
			public static WebElement MSDSAttchmntSIFlmmble;
			
			@FindBy(id="ID_MT_MaterialSpecific")
			public static WebElement MSDSAttchmntSISpcfc;
			
			@FindBy(id="ID_MT_MatSafetySubmit")
			public static WebElement SaveSI;
			
	//MSDS in MSDS Attachment
			@FindBy(id="ID_MT_MaterialInsideMSDSData")
			public static WebElement MSMSDSAttchmnt;
			
			
			@FindBy(xpath="//span[@class='TM_StaticActionIcon']")
			public static WebElement ActionMSDSAttchmnt;

	//Add File	
			@FindBy(id="ID_MTI_MaterialMSDSFileAddbutton")
			public static WebElement AddFileMSDSAttchmnt;
			
			@FindBy(id="ID_MT_MaterialFileattachment")
			public static WebElement UpldFileMSDSAttchmnt;
			
			@FindBy(id="ID_MT_MaterialFile_attachdesc")
			public static WebElement FileDescMSDSAttchmnt;
			
			@FindBy(id="ID_MT_MaterialFile_AddSubmit_Button")
			public static WebElement SbmtMSDSAttchmnt;
			
	//Properties
			@FindBy(id="ID_MT_MatProperty")
			public static WebElement Proprts;
			
			@FindBy(id="ID_MTP_StructuralFormula")
			public static WebElement ProprtsStrctrlFrml;
			
			@FindBy(id="ID_MTP_PhysicalDesc")
			public static WebElement ProprtsPhyDesc;
			
			@FindBy(id="ID_MTP_BoilingPoing")
			public static WebElement ProprtsBlngPt;
			
			@FindBy(id="ID_MTP_MeltingPoint")
			public static WebElement ProprtsMltngPt;
			
			@FindBy(id="ID_MTP_MolecularWeight")
			public static WebElement ProprtsMlclrWt;
			
			@FindBy(id="ID_MTP_StandardSpecficGravity")
			public static WebElement ProprtsStndrdSpcGrvty;
			
			@FindBy(id="ID_MTP_StandardPurity")
			public static WebElement ProprtsStdPrty;
			
			@FindBy(id="ID_MTP_StandardStength")
			public static WebElement ProprtsStdLngth;
			
			@FindBy(id="ID_MTP_GasNumber")
			public static WebElement ProprtsGasNum;
			
			@FindBy(id="ID_MTP_BulkDensity")
			public static WebElement ProprtsBlkDnsty;
			
			@FindBy(id="ID_MTP_DateOfStandardization")
			public static WebElement ProprtsDteOStndrdstn;
			
			@FindBy(id="ID_MTP_AsisBasisAssay")
			public static WebElement ProprtsAssyAsIsBsis;
			
			@FindBy(id="ID_MTP_DriedAndidrousAssay")
			public static WebElement ProprtsDrdBsis;
			
			@FindBy(id="ID_MTP_AsIsBasisPurity")
			public static WebElement ProprtsPrtyAsIsBsis;
			
			@FindBy(id="ID_MTP_DriedAndidrousPurity")
			public static WebElement ProprtsDrdBsis2;
			
			@FindBy(id="ID_MTP_DirectionOfUse")
			public static WebElement ProprtsDrctnOUse;
			
			@FindBy(id="ID_MTP_Comments")
			public static WebElement ProprtsCmmts;
			
			@FindBy(xpath="//*[@id=\"ID_MT_MatPropertySubmit\"]")
			public static WebElement SbmtProprts;		
		
			@FindBy(id="ID_MTI_MaterialMSDSSubLeftMenu")
			public static WebElement BckSftyInstrctn;		
			
	}