package UserManagement;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import Utility.BrowserOperation;

public class ElementAuditTrail extends BrowserOperation {
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a/i")
	public static WebElement homeIcon;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMasterHeaderdiv\"]/div[2]/div")
	public static WebElement searchIcon;

	@FindBy(xpath = "///*[@id=\"ID_ADT_AudittrailData\"]")
	public static WebElement auditTrailTabHeader;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMasterHeaderdiv\"]/div[2]/div/i")
	public static WebElement searchClose;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div")
	public static WebElement gridList;

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;

	@FindBy(id = "iFormID_78")
	public static WebElement auditTrailIcon;

	@FindBy(id = "ID_ADT_FromDate")
	public static WebElement filterFrom;

	@FindBy(id = "ID_ADT_ToDate")
	public static WebElement filterTo;

	@FindBy(id = "ID_ADT_ModuleCombo")
	public static WebElement filterModule;

	@FindBy(id = "ID_ADT_ScreenCombo")
	public static WebElement filterScreen;

	@FindBy(id = "ID_ADT_FindTest")
	public static WebElement filterFind;

	@FindBy(id = "ID_Next_1500_7013")
	public static WebElement filterClose;

	@FindBy(id = "ID_ADT_ClearFilter")
	public static WebElement filterClear;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div")
	public static List<WebElement> dataList;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div/div[1]/div[1]/p")
	public static List<WebElement> screenList;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div")
	public static List<WebElement> auditTrailList;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> auditActionList;

	@FindBy(xpath = "//*[@id=\"ID_ADT_AudittrailMastergetdiv\"]/div/div[2]")
	public static List<WebElement> checkboxList;

	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_81_91_0\"]/dl/dt")
	public static List<WebElement> termsList;

	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_81_91_0\"]/dl/dd")
	public static List<WebElement> descriptionList;

	@FindBy(id = "ID_ADT_filter")
	public static WebElement filterIcon;

	@FindBy(xpath = "")
	public static WebElement sideViewModuleNameTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewScreenNameTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewActionTypeTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewAuditActionTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewCommentsTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewUserCommentsTerm;

	@FindBy(xpath = "")
	public static WebElement sideViewModuleNameValue;

	@FindBy(xpath = "")
	public static WebElement sideViewScreenNameValue;

	@FindBy(xpath = "")
	public static WebElement sideViewActionTypeValue;

	@FindBy(xpath = "")
	public static WebElement sideViewAuditActionValue;

	@FindBy(xpath = "")
	public static WebElement sideViewCommentsValue;

	@FindBy(xpath = "")
	public static WebElement sideViewUserCommentsValue;

	public static String baseMaster = "Base Master";

	public static String testManagement = "Test Management";

	public static String testGroupManagement = "Test Group Management";

	public static String instrumentManagement = "Instrument Management";

	public static String materialManagement = "Material Management";

	public static String component = "Component";

	public static String designation = "Designation";

	public static String department = "Department";

	public static String lab = "Lab";

	public static String section = "Section";

	public static String organisationManagement = "Organisation";

	public static String userManagement = "User Management";

	public static String orderAndSubOrder = "Order & SubOrder";
	public static String registration = "Registration";

	public static String resultEntry = "Result Entry";

	public static String approval = "Approval";

	public static String checkList = "Check List";

	public static String sampleManagement = "Sample";

	public static String contacts = "Contacts";

	public static String mail = "Mail";

	public static String reportConfig = "Report Config";

	public static String competenceManagement = "Competence Management";

	public static String dashBoard = "DashBoard";

	// public static String sampleStorage="Sample Storage";

	public static String configuration = "Configuration";

	public static String stabilityMaster = "Stability Master";

	// public static String stability="Stability";

	// public static String project="Project";

	public static String batch = "Batch";

	public static String unit = "Units of Measurement";

	public static String storageCondition = "Storage Condition";

	public static String storageLocation = "Storage Location";

	public static String samplingPointCategory = "Sampling Point Category";

	public static String containerType = "Container Type";

	public static String barCode = "Barcode";

	public static String samplingPoint = "Sampling Point";

	public static String sampleTestComments = "Sample Test Comments";

	public static String users = "Users";

	public static String screenRights = "Screen Rights";
	public static String controlRights = "Control Rights";
	public static String userRole = "User Role";

	public static String auditTrail = "Audit Trail";
	public static String hideScreenRights = "Hide Screen";
	public static String hideControlRights = "Hide ControlRights";

	public static String organisation = "Organisation";
	public static String nestedFlowMapping = "Nested Flow Mapping";
	public static String methodCategory = "Method Category";

	public static String method = "Method";
	public static String testCategory = "Test Category";
	public static String testMaster = "Test Master";
	public static String testMasterPricing = "Test Master Pricing";

	public static String instrumentCategory = "Instrument Category";
	public static String instrument = "Instrument";

	/*
	 * --------- Test Group Management
	 * 
	 * public static StringTest Group --------- Instrument Management
	 * 
	 * public static StringInstrument Category public static StringInstrument public
	 * static StringInstrument Data Log --------- Material Management
	 * 
	 * public static StringMaterial Category public static StringMaterial public
	 * static StringMaterial Grade --------- Order & SubOrder
	 * 
	 * --------- Registration
	 * 
	 * public static StringGeneric Registration --------- Result Entry
	 * 
	 * public static StringResult Entry By Sample --------- Approval
	 * 
	 * public static StringApproval --------- Check List
	 * 
	 * public static StringQB Category public static StringQB public static
	 * StringCheck List --------- Sample --------- Contacts --------- Mail
	 * 
	 * public static String="";Mail Host public static String="";Mail Template
	 * public static String="";Mail Config public static String="";Mail Status
	 * --------- Report Config
	 * 
	 * public static String="";Report Designer --------- Competence Management
	 * 
	 * public static String="Technique"; public static String="Training Category";
	 * public static String="";Training & Certification public static
	 * String="";Training Update public static String="";User View public static
	 * String="";Section User View public static String="";User Technique View
	 * public static String="";ReSchedule Log
	 * 
	 * public static String="";Dashboard Rights public static String="";Dashboard
	 * Types public static String="";Sql Builder public static String="";Alert
	 * Rights public static String="";DashBoard View
	 * 
	 */

	public static String technique = "Technique";
	public static String trainingCategory = "Training Category";

	public static String myJobs = "My Jobs";
	public static String jobAllocation = "Job Allocation";

	public static String scheduler = "Scheduler";

	public static String chainOfCustody = "Chain of Custody";
	public static String storageCategory = "Storage Category";
	public static String sampleStorage = "Sample Storage";

	public static String passwordPolicy = "Password Policy";
	public static String approvalConfiguration = "Approval Configuration";
	public static String userRoleTemplate = "User Role Template";
	public static String templateMaster = "Template Master";
	public static String ftpConfiguration = "FTP Config";
	public static String esignControl = "E-Sign Control";

	public static String stability = "Stability";

	public static String project = "Project";
	public static String projectViewDetails = "Project View Details";
	public static String proectType = "Project Type";

	public static String batchCreation = "Batch Creation";

	public static String manufacturer = "Manufacturer";
	public static String country = "Country";
	public static String supplierCategory = "Supplier Category";
	public static String supplier = "Supplier";
	public static String courier = "Courier";
	public static String client = "Client";
	public static String clientGroup = "Client Group";
	public static String clinicalTrail = "Clinical Trial";

	public static String sampleCategory = "Sample Category";
	public static String sample = "Sample Type";

	public static String materialCategory = "Material Category";

	public static String material = "Material";

	public static String materialGrade = "Material Grade";

	public static List list() {
		List<WebElement> aa = new ArrayList<WebElement>();

		aa.add(masterIcon);

		aa.add(userManagementIcon);

		aa.add(auditTrailIcon);

		/*
		 * aa.add(unitAction);
		 * 
		 * aa.add(unitAdd);
		 * 
		 * aa.add(unitEdit);
		 * 
		 * aa.add(unitDelete);
		 * 
		 * aa.add(unitRefresh);
		 * 
		 * aa.add(unitAddSubmit);
		 * 
		 * aa.add(unitEditSubmit);
		 */
		return aa;
	}

}
