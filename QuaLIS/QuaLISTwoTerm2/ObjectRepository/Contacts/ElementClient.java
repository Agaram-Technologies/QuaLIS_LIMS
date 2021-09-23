package Contacts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementClient {

//Master
	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	    
//Contacts	
	@FindBy(id="iModuleID_15")
	public static WebElement contactsIcon;

//Client	
	
	
	
	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_CL_ClientMasterHeaderdiv\"]/div[2]/div")
	public static WebElement clientSearchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_CL_ClientMasterHeaderdiv\"]/div[2]/div/i")
	public static WebElement clientSearchClose;
	

	
	
	
	
	
	
	@FindBy(id="iFormID_50")
    public static WebElement clientIcon;
	
	@FindBy(xpath="//*[@id=\"ID_CL_ClientActionMenu\"]/a")
    public static WebElement clientAction;

//Add	
	@FindBy(id="ID_CL_ClientAddbutton")
    public static WebElement clientAdd;

	@FindBy(id="ID_CL_ClientGroup")
    public static WebElement clientClientGroup;

	@FindBy(id="ID_CL_ClientName")
    public static WebElement client;

	@FindBy(id="ID_CL_ClientID")
    public static WebElement clientId;

	@FindBy(id="ID_TM_ClientDescription")
    public static WebElement clientDescription;

	@FindBy(id="ID_CL_ClientActive")
    public static WebElement clientActive;

	@FindBy(id="ID_CL_ClientADDSubmit")
    public static WebElement clientAddSubmit;

//Client Site	
	@FindBy(id="ID_CL_ClientsiteData")
    public static WebElement cilentSiteIcon;
	
	

	@FindBy(xpath="//*[@id=\"ID_CL_ClientActionMenu\"]/a")
    public static WebElement cilentSiteAction;
//Add	
	@FindBy(id="ID_CL_ClientSiteAddbutton")
    public static WebElement clientSiteAdd;

	@FindBy(id="ID_CL_ClientSiteName")
    public static WebElement clientSite;

	@FindBy(id="ID_CL_ClientSiteDoorno")
    public static WebElement clientSiteDoorNumber;

	@FindBy(id="ID_CL_ClientSiteStreet")
    public static WebElement clientSiteStreet;

	@FindBy(id="ID_CL_ClientSiteCity")
    public static WebElement clientSiteCity;

	@FindBy(id="ID_CL_ClientSiteState")
    public static WebElement clientState;

	@FindBy(id="ID_CL_ClientSiteCountry")
    public static WebElement clientCountry;

	@FindBy(id="ID_CL_ClientSiteZip")
    public static WebElement clientZip;

	@FindBy(id="ID_CL_ClientSitetelephone")
    public static WebElement clientSiteTelephone;

	@FindBy(id="ID_CL_ClientSitefax")
    public static WebElement clientSiteFax;

	@FindBy(id="ID_CL_ClientSiteemail")
    public static WebElement clientSiteEmail;

	@FindBy(id="ID_CL_ClientSitewebsite")
    public static WebElement clientSiteWebSite;

	@FindBy(id="ID_CL_ClientSiteADDSubmit")
    public static WebElement clientSiteAddSubmit;
	
	@FindBy(xpath="//*[@id=\"ID_CL_ClientActionMenu\"]/a")
    public static WebElement clientContactAction;
	
	
	@FindBy(xpath="///*[@id=\"ID_CL_ClientActionMenu\"]/a")
    public static WebElement clientFileAction;

	
	
//Client Contact
	@FindBy(id="ID_CL_ClientContactsData")
    public static WebElement clientSiteContactIcon;
	
//Add	
	@FindBy(xpath="//li[@id='ID_CL_ClientContactAddbutton']")
    public static WebElement clientSiteContactAdd;
	
	@FindBy(id="ID_CL_ClientContactName")
    public static WebElement clientSiteContactName;
	
	@FindBy(id="ID_CL_ClientContactDesig")
    public static WebElement clientSiteContactDesignation;
	
	@FindBy(id="ID_CL_ClientContactmobile")
    public static WebElement clientSiteContactMobileNumber;
	
	@FindBy(id="ID_CL_ClientContacttele")
    public static WebElement clientSiteContactTelephoneNumber;
	
	@FindBy(id="ID_CL_ClientContactemail")
    public static WebElement clientSiteContactMail;
	
	@FindBy(id="ID_CL_ClientRemarks")
    public static WebElement clientSiteContactRemarks;
	
	@FindBy(xpath="//*[@id=\"ID_CL_ClientContactADDSubmit\"]")
    public static WebElement clientSiteContactAddSubmit;
	
    @FindBy(id="ID_CL_ClientSiteSubLeftMenu")
    public static WebElement clientSiteBack;

//File    
    @FindBy(id="ID_CL_ClientFileData")
    public static WebElement clientFileIcon;

//Add    
    @FindBy(id="ID_CL_ClientFileAddbutton")
    public static WebElement clientFileAdd;

    @FindBy(id="ID_CL_FileAttachment")
    public static WebElement clientFileUploadIcon;

    @FindBy(id="ID_CL_ClientFileADDSubmit")
    public static WebElement clientFileAddSubmit;
    
    @FindBy(id="ID_CL_ClientData")
    public static WebElement clientClientIcon;
    
    @FindBy(xpath="//*[@id=\"ID_CL_ClientMastergetdiv\"]/div/div[1]/div[1]/p")
    public static List<WebElement> clientList;
    
    @FindBy(xpath="//*[@id=\"ID_CL_ClientMastergetdiv\"]/div/div[2]")
    public static List<WebElement> clientCheckboxList;
    
    
    
    
    

}