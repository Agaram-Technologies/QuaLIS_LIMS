package Organisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Config.ModuleName;
import Config.ScreenName;
import Config.SubModuleName;

public class ElementLab extends ElementName {
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_4")
	public static WebElement organisationManagementIcon;

	
	
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[2]/div")
	public static WebElement searchIcon;

	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[2]/div/i")
	public static WebElement searchClose;

	
	
	
	
	
	
	
	@FindBy(id = "iFormID_31")
	public static WebElement labIcon;
	
	@FindBy(xpath = "//*[@id='ID_LB_ActionMenu']/a")
	public static WebElement labAction;
	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> labList;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabDataBind\"]/divp")
	public static List<WebElement> labGridList;
	
	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> labDescriptionList;
	
	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabDataBind\"]/div/div[2]")
	public static List<WebElement> labCheckboxList;
	//*[@id="ID_LB_LabDataBind"]
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[2]/div/i")
	public static WebElement labSearchCloseIcon;
	
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[2]/div")
	public static WebElement labSearchIcon;
	
	

	@FindBy(id = "ID_LB_LabDataBind_Data")
	public static WebElement labSearchField;
	
	

	@FindBy(id = "ID_LB_LabAddbutton")
	public static WebElement labAdd;

	@FindBy(id = "ID_LB_LabEditbutton")
	public static WebElement labEdit;


	@FindBy(id = "ID_LB_LabDeletebutton")
	public static WebElement labDelete;

	@FindBy(id = "ID_LB_LabRefreshbutton")
	public static WebElement labRefresh;
	
	@FindBy(id = "ID_LB_LabName")
	public static WebElement lab;

	@FindBy(id = "ID_LB_LabDesc")
	public static WebElement labDescription;
	              //ID_LB_LabDesc
	
	@FindBy(id = "ID_LB_LabADDSubmit")
	public static WebElement labAddSubmit;


	@FindBy(id = "ID_LB_LabCancel")
	public static WebElement labAddCancel;

	@FindBy(id = "ID_LB_LabEDITSubmit")
	public static WebElement labEditSubmit;

	@FindBy(id = "ID_LB_LabCancel")
	public static WebElement labEditCancel;
	
	
	
	
	@FindBy(id = "idTabHeader")
	public static WebElement labHeading;

	@FindBy(id = "ID_LB_Lab")
	public static WebElement labSubHeading;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[1]/div[1]/p")
	public static WebElement labGridSubHeadingLabName;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabHeadermain\"]/div[1]/div[2]/p")
	public static WebElement labGridSubHeadingLabDescription;
	
	@FindBy(id = "ID_LB_LabCancel")
	public static WebElement labAddHeading;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabAddDesign\"]/div[2]/label")
	public static WebElement labAddName;;
	
	@FindBy(xpath="//*[@id=\"ID_LB_LabAddDesign\"]/div[3]/label")
	public static WebElement labAddDescription;
	
	@FindBy(id = "ID_LB_AddPopUpTitle")
	public static WebElement labEditHeading;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabAddDesign\"]/div[2]/label")
	public static WebElement labEditName;
	
	@FindBy(xpath = "//*[@id=\"ID_LB_LabAddDesign\"]/div[3]/label")
	public static WebElement labEditDescription;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_LB_Lab")
	public static WebElement labTabIcon;

	public static Object labNameField;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
			
		element.put(module, masterIcon);
		 
		element.put(subModule, organisationManagementIcon);
		 
		element.put(screen, labIcon);
		 
		element.put(action, labAction);
		 
		element.put(add,labAdd );
		
		element.put(edit,labEdit);
		
		element.put(delete,labDelete);
		 
		element.put(nameValue, lab);
		 
		element.put(descriptionValue, labDescription);
		 
		element.put(addSubmitButton, labAddSubmit);
		
		
		element.put(editSubmitButton,labEditSubmit);
		
		element.put(tabHeader, labTabIcon);
		
		element.put(home, homeIcon);
		
	
		return element;
	}
	

	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, labList);
		 
		 elements.put(descriptionList, labDescriptionList);
		 
		 elements.put(checkBoxList, labCheckboxList);
		 
		return elements;
	}
	

	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.lab);
		
		 menu.put(subModuleName, SubModuleName.organisation);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	
	
	

	
}
