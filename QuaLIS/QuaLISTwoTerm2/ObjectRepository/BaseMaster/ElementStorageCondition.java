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

public class ElementStorageCondition extends ElementName
{
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_34")
	public static WebElement storageConditionIcon;
	
	
	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_SC_StorageCondHeadermain\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_SC_StorageCondHeadermain\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_SC_StorageCondDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> storageConditionList;
	
	@FindBy(xpath = "//*[@id=\"ID_SC_StorageCondDataBind\"]/div/div[1]/div[2]/p")
	public static  List<WebElement> storageConditionDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_SC_StorageCondDataBind\"]/div/div[2]")
	public static  List<WebElement> storageConditionCheckboxList;
	
	
	

	@FindBy(xpath = "//*[@id='ID_SC_ActionMenu']/a")
	public static WebElement storageConditionAction;
	
	@FindBy(id = "ID_SC_StorageConditionAddbutton")
	public static WebElement storageConditionAdd ;

	@FindBy(id = "ID_SC_StorageConditionEditbutton")
	public static WebElement storageConditionEdit;
	
	@FindBy(id = "ID_SC_StorageConditionDeletebutton")
	public static WebElement storageConditionDelete;

	@FindBy(id = "ID_SC_StorageConditionRefreshbutton")
	public static WebElement storageConditionRefresh;

	@FindBy(id = "ID_SC_StorageConditionImportbutton")
	public static WebElement storageConditionImport;
	
	@FindBy(id = "ID_SC_StorageConditionExportPDFbutton")
	public static WebElement storageConditionExportPDF;
	
	@FindBy(id = "ID_SC_StorageConditionExportXLSbutton")
	public static WebElement storageConditionExportXLS;

	@FindBy(id = "ID_SC_StorageConditionName")
	public static WebElement storageCondition ;
	
	
	
	@FindBy(id = "ID_SC_StorageConditionDesc")
	public static WebElement storageConditionDescription;
	
	@FindBy(id = "ID_SC_StorageConditionADDSubmit")
	public static WebElement storageConditionAddSubmit ;
	

	@FindBy(id = "ID_SC_StorageConditionCancel")
	public static WebElement storageConditionAddCancel;
	
	@FindBy(id = "ID_SC_StorageConditionEDITSubmit")
	public static WebElement storageConditionEditSubmit;

	@FindBy(id = "ID_SC_StorageConditionCancel")
	public static WebElement storageConditionEditCancel;
	
	

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
		
	@FindBy(id = "ID_SC_StorageCondition")
	public static WebElement storageConditionTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, baseMasterIcon);
		
		element.put(screen, storageConditionIcon);
		
		element.put(action, storageConditionAction);
		
		element.put(add, storageConditionAdd);
		
		element.put(edit, storageConditionEdit);
		
		element.put(delete, storageConditionDelete);
		
		element.put(nameValue, storageCondition);
		
		element.put(descriptionValue, storageConditionDescription);
		
		element.put(addSubmitButton, storageConditionAddSubmit);
		
		element.put(editSubmitButton, storageConditionEditSubmit);
		
		element.put(tabHeader, storageConditionTabIcon);
		
		element.put(home, homeIcon);
			
		return element;
	}
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, storageConditionList);
		 
		 elements.put(descriptionList, storageConditionDescriptionList);
		 
		 elements.put(checkBoxList, storageConditionCheckboxList);
		 
		return elements;
	}
		
	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.storageCondition);
		
		 menu.put(subModuleName, SubModuleName.baseMaster);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	
	

}
