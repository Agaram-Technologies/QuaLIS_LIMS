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

public class ElementComponent extends ElementName {

	
	
	

	
	
	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_Component_ComponentHeaderDesign\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_Component_ComponentHeaderDesign\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	
	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_Component_ComponentDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> componentList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_Component_ComponentDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement>  componentDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_Component_ComponentDesignBind\"]/div/div[2]")
	public static List<WebElement>  componentCheckboxList;
	
	@FindBy(id = "iFormID_15")
	public static WebElement componentIcon;

	@FindBy(xpath = "//*[@id='ID_Component_ActionMenu']/a")
	public static WebElement componentAction;
	
	@FindBy(id = "ID_Component_ComponentAddbutton")
	public static WebElement componentAdd ;

	@FindBy(id = "ID_Component_ComponentEditbutton")
	public static WebElement componentEdit;
	
	@FindBy(id = "ID_Component_ComponentDeletebutton")
	public static WebElement componentDelete;
	
	
	@FindBy(id = "ID_Component_ComponentSetDefaultbutton")
	public static WebElement componentSetAsDefault;
	

	@FindBy(id = "ID_Component_Componentrefreshtbutton")
	public static WebElement componentRefresh;

	@FindBy(id = "ID_Component_ComponentImportbutton")
	public static WebElement componentImport;
	
	@FindBy(id = "ID_Component_ComponentExportPDFbutton")
	public static WebElement componentExportPDF;
	
	@FindBy(id = "ID_Component_ComponentExportXLSbutton")
	public static WebElement storageConditionExportXLS;

	@FindBy(id = "ID_Component_ComponentName")
	public static WebElement component ;
	
	
	
	@FindBy(id = "ID_Component_ComponentDescription")
	public static WebElement componentDescription;
	
	@FindBy(id = "ID_Component_ComponentADDSubmit")
	public static WebElement componentAddSubmit ;
	

	@FindBy(id = "ID_Component_ComponentCancel")
	public static WebElement componentAddCancel;
	
	@FindBy(id = "ID_Component_ComponentEDITSubmit")
	public static WebElement componentEditSubmit;

	@FindBy(id = "ID_Component_ComponentCancel")
	public static WebElement componentEditCancel;
	
	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(baseMasterIcon);
		 
		 aa.add(componentIcon);
		 
		 aa.add(componentAction);
		 
		 aa.add(componentAdd);
		 
		 aa.add(componentEdit);
		 
		 aa.add(componentDelete);
		 
		 return aa;
	}
	
	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.unit);
		
		 menu.put(subModuleName, SubModuleName.baseMaster);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	

}
