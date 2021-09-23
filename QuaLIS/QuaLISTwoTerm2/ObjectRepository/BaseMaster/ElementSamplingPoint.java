package BaseMaster;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementSamplingPoint {
	


	@FindBy(xpath = "//*[@id=\"ID_SP_SPMasterHead\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_SP_SPMasterHead\"]/div[2]/div/i")
	public static WebElement searchClose;

	//*[@id=""]/div[2]/div

	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_132")
	public static WebElement samplingPointIcon;

	@FindBy(xpath = "//*[@id=\"ID_SP_SPMasterDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> samplingPointList;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SPMasterDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> samplingPointDescriptionList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SPMasterDataBind\"]/div/div[2]")
	public static List<WebElement> samplingPointCheckboxList;
	
	
	@FindBy(xpath = "//*[@id='ID_SP_SpActionMenu']/a")
	public static WebElement samplingPointAction;
	
	@FindBy(id = "ID_SP_SpAddbutton")
	public static WebElement samplingPointAdd ;

	@FindBy(id = "ID_SP_SpEditbutton")
	public static WebElement samplingPointEdit;
	
	@FindBy(id = "ID_SP_SpDeletebutton")
	public static WebElement samplingPointDelete;

	@FindBy(id = "ID_SP_SpRefreshbutton")
	public static WebElement samplingPointRefresh;

	@FindBy(id = "ID_SP_SPName")
	public static WebElement samplingPoint ;
	
	
	@FindBy(id = "ID_SP_SampCat")
	public static WebElement samplingPointCategory ;
	
	
	
		@FindBy(xpath="//*[@id=\"ID_SP_SampCat\"]/option")
		public static List< WebElement> samplingPointCategoryList;
		
		
	
	
	@FindBy(id = "ID_SP_SPDesc")
	public static WebElement samplingPointDescription;
	
	@FindBy(id = "ID_SP_SPSubmitAdd")
	public static WebElement samplingPointAddSubmit ;
	

	@FindBy(id = "ID_SP_SPCancel")
	public static WebElement samplingPointAddCancel;
	
	@FindBy(id = "ID_SP_SPSubmitEDIT")
	public static WebElement samplingPointEditSubmit;

	@FindBy(id = "ID_SP_SPCancel")
	public static WebElement samplingPointEditCancel;
	
	
	

	
	

}
