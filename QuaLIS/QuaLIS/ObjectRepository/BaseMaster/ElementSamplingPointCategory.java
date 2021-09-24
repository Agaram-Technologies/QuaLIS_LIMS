package BaseMaster;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementSamplingPointCategory {
	
	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_Spc_SPCMasterHead\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_Spc_SPCMasterHead\"]/div[2]/div/i")
	public static WebElement searchClose;


	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_44")
	public static WebElement samplingPointCategoryIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_Spc_SPCMasterDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> samplingPointCategoryList;

	@FindBy(xpath = "//*[@id=\"ID_Spc_SPCMasterDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> samplingPointCategoryDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_Spc_SPCMasterDataBind\"]/div/div[2]")
	public static List<WebElement> samplingPointCategoryCheckboxList;

	@FindBy(xpath = "//*[@id='ID_SPC_SpcActionMenu']/a")
	public static WebElement samplingPointCategoryAction;
	
	@FindBy(id = "ID_SPC_SPCAddbutton")
	public static WebElement samplingPointCategoryAdd ;

	@FindBy(id = "ID_SPC_SPCEditbutton")
	public static WebElement samplingPointCategoryEdit;
	
	@FindBy(id = "ID_SPC_SPCDeletebutton")
	public static WebElement samplingPointCategoryDelete;

	@FindBy(id = "ID_SPC_SPCRefreshbutton")
	public static WebElement samplingPointCategoryRefresh;

	
	@FindBy(id = "ID_SPC_SPCName")
	public static WebElement samplingPointCategory;

	@FindBy(id = "ID_SPC_SPCDesc")
	public static WebElement samplingPointCategoryDescription;
	
	@FindBy(id = "SPC_SPCSubmitAdd")
	public static WebElement samplingPointCategoryAddSubmit ;

	@FindBy(id = "ID_SPC_SPCCancel")
	public static WebElement samplingPointCategoryAddCancel;
	
	@FindBy(id = "SPC_SPCSubmitEDIT")
	public static WebElement samplingPointCategoryEditSubmit;

	@FindBy(id = "ID_SPC_SPCCancel")
	public static WebElement samplingPointCategoryEditCancel;

	

}
