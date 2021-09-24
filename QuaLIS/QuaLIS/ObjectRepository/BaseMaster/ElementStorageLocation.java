package BaseMaster;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Config.ModuleName;
import Config.ScreenName;
import Config.SubModuleName;

public class ElementStorageLocation extends ElementName {
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_SL_StorageLocationHead\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_SL_StorageLocationHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	//*[@id=""]/div[2]/div
	
	
	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_35")
	public static WebElement storageLocationIcon;

	@FindBy(xpath = "//*[@id='ID_SL_ActionMenu']/a")
	public static WebElement storageLocationAction;
	
	@FindBy(xpath = "//*[@id=\"ID_SL_StorageLocationDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> storageLocationList;
	
	@FindBy(xpath = "//*[@id=\"ID_SL_StorageLocationDesignBind\"]/div/div[1]/div[2]/p")
	public static  List<WebElement> storageLocationDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_SL_StorageLocationDesignBind\"]/div/div[2]")
	public static  List<WebElement> storageLocationCheckboxList;
	
	@FindBy(id = "ID_SL_StorageLocationAddbutton")
	public static WebElement storageLocationAdd ;

	@FindBy(id = "ID_SL_StorageLocationEditbutton")
	public static WebElement storageLocationEdit;
	
	@FindBy(id = "ID_SL_StorageLocationDeletebutton")
	public static WebElement storageLocationDelete;

	@FindBy(id = "ID_SL_StorageLocationRefreshbutton")
	public static WebElement storageLocationRefresh;

	@FindBy(id = "ID_SL_StorageLocationDefaultbutton")
	public static WebElement storageLocationSetAsDefault;
	
	/*@FindBy(id = "ID_SC_StorageLocationExportPDFbutton")
	public static WebElement storageLocationExportPDF;
	
	@FindBy(id = "ID_SC_StorageLocationExportXLSbutton")
	public static WebElement storageLocationExportXLS;
*/
	@FindBy(id = "ID_SL_StorageLocationName")
	public static WebElement storageLocation ;
	
	
	
	@FindBy(id = "ID_SL_StorageLocationDesc")
	public static WebElement storageLocationDescription;
	
	@FindBy(id = "ID_SL_StorageLocationADDSubmit")
	public static WebElement storageLocationAddSubmit ;
	

	@FindBy(id = "ID_SL_StorageLocationCancel")
	public static WebElement storageLocationAddCancel;
	
	@FindBy(id = "ID_SL_StorageLocationEditSubmit")
	public static WebElement storageLocationEditSubmit;

	@FindBy(id = "ID_SL_StorageLocationCancel")
	public static WebElement storageLocationEditCancel;
	
	

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
		
	@FindBy(id = "ID_SL_StorageLocation")
	public static WebElement storageLocationTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> a=new HashMap<String, WebElement>();
		
		a.put(module, masterIcon);
		
		a.put(subModule, baseMasterIcon);
		
		a.put(screen, storageLocationIcon);
		
		a.put(action, storageLocationAction);
		
		a.put(add, storageLocationAdd);
		
		a.put(edit, storageLocationEdit);
		
		a.put(delete, storageLocationDelete);
		
		a.put(nameValue, storageLocation);
		
		a.put(descriptionValue, storageLocationDescription);
		
		a.put(addSubmitButton, storageLocationAddSubmit);
		
		a.put(editSubmitButton, storageLocationEditSubmit);
		
		a.put(tabHeader, storageLocationTabIcon);
		
		a.put(home, homeIcon);
			
		return a;
	}
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, storageLocationList);
		 
		 elements.put(descriptionList, storageLocationDescriptionList);
		 
		 elements.put(checkBoxList, storageLocationCheckboxList);
		 
		return elements;
	}
	
	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.storageLocation);
		
		 menu.put(subModuleName, SubModuleName.baseMaster);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	

}
