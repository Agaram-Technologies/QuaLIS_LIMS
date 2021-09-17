package Configuration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementFTPConfiguration {
	

	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;

/*
	@FindBy(xpath="//*[@id=\"ID_Lims_AlertDiv_0\"]")
	public static WebElement alert;*/
	
 	@FindBy(xpath="//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]")
	public static WebElement successAlert;


	@FindBy(xpath= "//*[contains(@id,'Alert')]")
	public static WebElement alert;


	@FindBy(xpath= "//*[contains(@id,'Alert')]/div/span/i")
	public static WebElement alertClose;

	
 	@FindBy(xpath="//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i")
	public static WebElement successAlertClose;

 	
	
	@FindBy(id="iFormID_111")
    public static WebElement FTPConfigurationIcon;
	
	@FindBy(xpath="//*[@id=\"ID_FTP_ActionMenu\"]/a")
    public static WebElement FTPAction;
	
	
	@FindBy(xpath="//*[@id=\"ID_FTP_FTPMasterDataBind\"]/div/div[1]/div[2]/p")
    public static List<WebElement> FTPHostList;
	
	@FindBy(xpath="//*[@id=\"ID_FTP_FTPMasterDataBind\"]/div")
    public static List<WebElement> FTPList;
	
	
	@FindBy(id="ID_FTP_FTPAddbutton")
    public static WebElement FTPAdd;
	
	
	@FindBy(id="ID_FTP_FTPDeletebutton")
    public static WebElement FTPDelete;
	
	
	@FindBy(id="ID_FTP_FTPDefaultbutton")
    public static WebElement FTPSetDefault;
	
	
	@FindBy(id="ID_FTP_FTPEditbutton")
    public static WebElement FTPEdit;
	
	
	@FindBy(id="ID_FTP_FTPTestConnection")
    public static WebElement FTPTestConnection;
	
	
	@FindBy(id="ID_FTP_FTPRefreshbutton")
    public static WebElement FTPRefresh;
	
	
	@FindBy(id="ID_FTP_UserName")
    public static WebElement FTPUserName;
	
	@FindBy(id="ID_FTP_FTPPassword")
    public static WebElement FTPPassword;
	
	@FindBy(id="ID_FTP_SiteCombo")
    public static WebElement FTPSiteName;
	
	@FindBy(id="ID_FTP_Host")
    public static WebElement FTPHostName;
	

	@FindBy(id="ID_FTP_PortNo")
    public static WebElement FTPPortNumber;
	
	@FindBy(id="ID_FTP_PhysicalPath")
    public static WebElement FTPPhysicalPath;
	
	@FindBy(id="ID_FTP_Ssl")
    public static WebElement FTPSSL;
	
	

	@FindBy(id="ID_FTP_FTPEDITSubmit")
    public static WebElement FTPEditSubmit;
	

	@FindBy(id="ID_FTP_FTPADDSubmit")
    public static WebElement FTPAddSubmit;
	
	@FindBy(id="ID_FTP_FTPCancel")
    public static WebElement FTPAddCancel;
	
	

	@FindBy(id="ID_FTP_FTPCancel")
    public static WebElement FTPEditCancel;
	

}
