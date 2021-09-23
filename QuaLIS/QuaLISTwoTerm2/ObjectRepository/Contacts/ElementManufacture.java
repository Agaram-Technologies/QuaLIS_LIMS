package Contacts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementManufacture 

{
	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_MF_ManufactureMasterHeaderdiv\"]/div[2]/div")
	public static WebElement manufactureSearchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_MF_ManufactureMasterHeaderdiv\"]/div[2]/div/i")
	public static WebElement manufactureSearchClose;
	

	//Master
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
		    
	//Contacts	
			@FindBy(id="iModuleID_15")
			public static WebElement contactsIcon;
			
			@FindBy(id="ID_MF_ManfacturerData")
			public static WebElement manufactureManufactureIcon;

	//Manufacturer	
		@FindBy(id="iFormID_2")
		public static WebElement manufactureIcon;
		
		@FindBy(xpath="//*[@id=\"ID_MF_MANFACTURERTabs\"]/div[3]/a")
		public static WebElement manufactureSiteAction;
		

		@FindBy(xpath="//*[@id=\"ID_MF_MANFACTURERTabs\"]/div[3]/a")
		public static WebElement manufactureFileAction;
		

		@FindBy(xpath="//*[@id=\"ID_MF_MANFACTURERTabs\"]/div[3]/a")
		public static WebElement manufactureAction;
		

		@FindBy(xpath = "//*[@id=\"ID_MF_ManufactuterMastergetdiv\"]/div/div[1]/div[1]/p")
		public static List<WebElement> manufactureList;
		
		@FindBy(xpath = "//*[@id=\"ID_MF_ManufactuterMastergetdiv\"]/div/div[1]/div[2]/p")
		public static List<WebElement> manufactureDescriptionList;
		
		
		@FindBy(xpath = "//*[@id=\"ID_MF_ManufactuterMastergetdiv\"]/div/div[2]")
		public static List<WebElement> manufactureCheckboxList;
		
	//Add	
		@FindBy(id="ID_MF_ManfacturerAddbutton")
		public static WebElement manufactureAdd;
		
		@FindBy(id="ID_MF_MANUFName")
		public static WebElement manufacture;
		
		@FindBy(id="ID_MF_MANUFDescription")
		public static WebElement manufactureDescription;
		
		@FindBy(id="ID_MF_MANUFActive")
		public static WebElement manufactureActive;
		
		@FindBy(id="ID_MF_MAnufactureADDSubmit")
		public static WebElement manufactureAddSubmit;
	/*	
		@FindBy(xpath="//*[@id=\"ID_MF_MANFACTURERTabs\"]/div[3]/a")
		public static WebElement manufactureContactAction;
		
	*/	
		
		
	//Manufacture site
		@FindBy(id="ID_MF_ManfacturersiteData")
	    public static WebElement manufactureSiteIcon;
		
	//Add	
		@FindBy(id="ID_MF_MANUFACTURERSiteAddbutton")
	    public static WebElement manufactureSiteAdd;
		
		@FindBy(id="ID_MF_ManufacturerSiteName")
	    public static WebElement manufactureSite;
		
		@FindBy(id="ID_MF_ManufacturerSiteDoorno")
	    public static WebElement manufactureSiteDoorNumber;
		
		@FindBy(id="ID_MF_ManufacturerSiteStreet")
	    public static WebElement manufactureSiteStreet;
		
		@FindBy(id="ID_MF_ManufactuterSiteCity")
	    public static WebElement manufactureSiteCity;
		
		@FindBy(id="ID_MF_ManufacturerSiteState")
	    public static WebElement manufactureSiteState;
		
		@FindBy(id="ID_MF_ManufacturerSiteCountry")
	    public static WebElement manufactureSiteCountry;
		
		@FindBy(id="ID_MF_ManufacturerSiteZip")
	    public static WebElement manufactureZip;
		
		@FindBy(id="ID_MF_ManufacturerSitetelephone")
	    public static WebElement manufactureSiteTelephone;
		
		@FindBy(id="ID_MF_ManufacturerSitefax")
	    public static WebElement manufactureSiteFax;
		
		@FindBy(id="ID_MF_ManufacturerSiteemail")
	    public static WebElement manufactureSiteMail;
		
		@FindBy(id="ID_MF_ManufacturerSitewebsite")
	    public static WebElement manufactureSiteWebsite;
		
		@FindBy(id="ID_MF_ManufacturerSiteADDSubmit")
	    public static WebElement manufactureSiteAddSubmet;
		
	//Manufacture Contact	
		@FindBy(id="ID_MF_ManfacturerContactsData")
	    public static WebElement manufactureContactIcon;
		
		@FindBy(xpath="//li[@id='ID_MF_ManfacturerContactAddbutton']")
	    public static WebElement manufactureContactAdd;
		
		@FindBy(id="ID_MF_ManufacturerContactName")
	    public static WebElement manufactureContactName;
		
		@FindBy(id="ID_MF_ManufacturerContactDesig")
	    public static WebElement manufactureContactDesignation;
		
		@FindBy(id="ID_MF_ManufacturerContactmobile")
	    public static WebElement manufactureContactMobileNumber;
		
		@FindBy(id="ID_MF_ManufacturerContacttele")
	    public static WebElement manufactureContactTelephoneNumber;
		
		@FindBy(id="ID_MF_ManufacturerContactemail")
	    public static WebElement manufactureContactEmail;
		
		@FindBy(id="ID_MF_ManufacturerRemarks")
	    public static WebElement manufactureContactRemarks;
		
		@FindBy(xpath="//*[@id=\"ID_MF_ManufacturerContactADDSubmit\"]")
	    public static WebElement manufactureContactAddSubmit;
		
		@FindBy(xpath="//*[@id=\"ID_MF_MANFACTURERTabs\"]/div[3]/a")
	    public static WebElement manufactureContactAction;
		
		@FindBy(id="ID_MF_ManufactuterSubLeftMenu")
	    public static WebElement manufactureSiteBack;
		
	//File	
		@FindBy(id="ID_MF_ManufactuterFileData")
	    public static WebElement manufactureFileIcon;
		
	//Add	
		@FindBy(id="ID_MF_ManufactuterFileAddbutton")
	    public static WebElement manufactureFileAdd;
		
		@FindBy(id="ID_MF_ManufactuterAttachment")
	    public static WebElement manufactureFileUploadIcon;
		
		@FindBy(id="ID_MF_ManufactuterFileRemarks")
	    public static WebElement manufactureFileDescription;
		
		@FindBy(id="ID_MF_ManufactuterFileADDSubmit")
	    public static WebElement manufactureFileAddSubmit;
		

}
