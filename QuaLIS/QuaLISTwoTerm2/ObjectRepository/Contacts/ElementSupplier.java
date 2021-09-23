package Contacts;



	import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;



	public class ElementSupplier {
		
		
		
		
		
		
		//*[@id=""]/div[2]/div

		@FindBy(xpath = "//*[@id=\"ID_SP_SupplierHeaderdiv\"]/div[2]/div")
		public static WebElement supplierSearchIcon;
		
		@FindBy(xpath = "//*[@id=\"ID_SP_SupplierHeaderdiv\"]/div[2]/div/i")
		public static WebElement supplierSearchClose;
		

		
		
		
		
			//Master
				@FindBy(id="iMenuID_1")
				public static WebElement masterIcon;
			    
		//Contacts	
				@FindBy(id="iModuleID_15")
				public static WebElement contactsIcon;

		//Supplier	
			@FindBy(id="iFormID_48")
			public static WebElement supplierIcon;
			
			@FindBy(id="ID_SP_Suplier")
			public static WebElement supplierSupplierIcon;
			
			
			
			@FindBy(xpath="//*[@id='ID_SP_SupplierData']/div/div[1]/div[1]/p")
			public static List< WebElement >suppliers;
			
			

			@FindBy(xpath="//*[@id='ID_SP_SupplierData']/div/div[2]")
			public static List<WebElement> suppliersCheckBox;
			
			
			
			
			
			

			@FindBy(xpath="//*[@id='ID_Supplier_ActionMenu']/a")
			public static WebElement supplierAction;
			

			@FindBy(id="ID_SP_SupplierApprove")
			public static WebElement supplierApprove;
			
		//Add	
			@FindBy(id="ID_SP_Add_Supplier")
			public static WebElement supplierAdd;
			
			@FindBy(id="ID_SP_SupplierName")
			public static WebElement supplier;
			
			@FindBy(id="ID_SP_Street")
			public static WebElement supplierStreet;
			
			@FindBy(id="ID_SP_DoorNumber")
			public static WebElement supplierDoorNumber;
			
			@FindBy(id="ID_SP_ZipCode")
			public static WebElement supplierZip;
			
			@FindBy(id="ID_SP_City")
			public static WebElement supplierCity;
			
			@FindBy(id="ID_SP_State")
			public static WebElement supplierState;
			
			@FindBy(id="ID_SP_Country")
			public static WebElement supplierCountry;
			
			@FindBy(id="ID_SP_TelPhoneNumber")
			public static WebElement supplierTelePhoneNumber;
			
			@FindBy(id="ID_SP_PhoneNo")
			public static WebElement supplierPhoneNumber;
			
			@FindBy(id="ID_SP_Fax")
			public static WebElement supplierFax;
			
			@FindBy(id="ID_SP_Email")
			public static WebElement supplierMail;
			
			@FindBy(id="ID_SP_Website")
			public static WebElement supplierWebsite;

			@FindBy(id="ID_SP_AccountNumber")
			public static WebElement supplierAccountNumber;

			@FindBy(id="ID_SP_PasswordNumber")
			public static WebElement supplierPasswordNumber;

			@FindBy(id="ID_SP_Remarks")
			public static WebElement supplierDescription;

			@FindBy(id="ID_SP_ACTIVE")
			public static WebElement supplierActive;

			@FindBy(id="ID_SP_Supplier_Add_Submit")
			public static WebElement supplierAddSubmit;

		//Supplier Contacts
			@FindBy(id="ID_SP_SuplierContact")
			public static WebElement supplierContactIcon;

			@FindBy(xpath="//*[@id=\"ID_SupplierContact_ActionMenu\"]/a")
			public static WebElement supplierContactAction;

		//Add	
			@FindBy(id="ID_SP_Add_SupplierContacts")
			public static WebElement supplierContactAdd;

			@FindBy(id="ID_SP_ContactName")
			public static WebElement supplierContactName;

			@FindBy(id="ID_SP_Designation")
			public static WebElement supplierContactDesignation;

			@FindBy(id="ID_SP_CMOBILE")
			public static WebElement supplierContactMobileNumber;

			@FindBy(id="ID_SP_CTelephoneno")
			public static WebElement supplierContactTelephoneNumber;

			@FindBy(id="ID_SP_CEmail")
			public static WebElement supplierContactEmail;

			@FindBy(id="ID_SP_CRemarks")
			public static WebElement supplierContactRemarks;

			@FindBy(id="ID_SP_SuppContact_Add_Submit")
			public static WebElement supplierContactAddSubmit;

		//Supplier Category
			@FindBy(id="ID_SP_SupplierCategory")
			public static WebElement supplierSupplierCategoryIcon;

			@FindBy(xpath="//*[@id=\"ID_SupplierSC_ActionMenu\"]/a/span")
			public static WebElement supplierSupplierCategoryAction;

		//Add	
			@FindBy(id="ID_SP_Add_SupplierCategory")
			public static WebElement supplierSupplierCategoryAdd;

			@FindBy(xpath="//*[@id=\"ID_SP_SupplierCategoryAdd\"]/div/div[1]")
			public static List<WebElement> supplierSupplierCategoryList;
			
			@FindBy(xpath="//*[@id=\"ID_SP_SupplierCategoryAdd\"]/div/input")
			public static  List<WebElement>  supplierSupplierCategoryCheckBoxList;

			@FindBy(id="ID_SP_SupplierCategoryadd_submit")
			public static WebElement supplierSupplierCategoryAddSubmit;

		//Material category	
			@FindBy(id="ID_SP_MaterialCategory")
			public static WebElement supplierMaterialCategoryIcon;

			@FindBy(xpath="//*[@id=\"ID_SupplierMC_ActionMenu\"]/a/span")
			public static WebElement supplierMaterialCategoryAction;

		//Add
			@FindBy(id="ID_SP_AddMaterialCategory")
			public static WebElement supplierMaterialCategoryAdd;

			@FindBy(xpath="//*[@id=\"ID_SP_MaterialCategoryAdd\"]/div/div[1]")
			public static List<WebElement> supplierMaterialCategryList;

			@FindBy(xpath="//*[@id=\"ID_SP_MaterialCategoryAdd\"]/div/input")
			public static List<WebElement> supplierMaterialCategoryCheckboxList;
			

			@FindBy(id="ID_SP_MaterialCategoryadd_submit")
			public static WebElement supplierMaterialCategoryAddSubmit;

		//File	
			@FindBy(id="ID_SP_File")
			public static WebElement supplierFileIcon;
			
			@FindBy(xpath="//*[@id=\"ID_SupplierSF_ActionMenu\"]/a")
			public static WebElement supplierFileAction;


		//Add	
			@FindBy(id="ID_SP_AddATTACHMENT")
			public static WebElement supplierFileAdd;

			@FindBy(id="ID_SP_SupplierFile")
			public static WebElement supplierFileUpload;

			@FindBy(id="ID_SP_FileDesc")
			public static WebElement supplierFileDescription;

			@FindBy(id="ID_SP_SuppFile_Add_Submit")
			public static WebElement supplierFileAddSubmit;

		}


