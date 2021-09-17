package UserManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Utility.BrowserOperation;

public class ElementDesignation  extends ElementName {


	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	
	@FindBy(id = "iModuleID_3")
	public static WebElement userManagementIcon;


	@FindBy(id = "iFormID_36")
	public static WebElement designationIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_DN_DesignationHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_DN_DesignationHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_DN_DesignationDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> designationList;
	

	@FindBy(xpath = "//*[@id=\"ID_DN_DesignationDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> designationDescriptionList;
	

	@FindBy(xpath = "//*[@id=\"ID_DN_DesignationDesignBind\"]/div/div[2]")
	public static List<WebElement> designationCheckboxList;


	
	
	@FindBy(xpath = "//*[@id='ID_DN_ActionMenu']/a")
	public static WebElement designationAction;

	@FindBy(id = "ID_DN_DesignationAddbutton")
	public static WebElement designationAdd;

	@FindBy(id = "ID_DN_DesignationEditbutton")
	public static WebElement designationEdit;


	@FindBy(id = "ID_DN_DesignationDeletebutton")
	public static WebElement designationDelete;

	
	@FindBy(id = "ID_DN_DesignationRefreshbutton")
	public static WebElement designationsRefresh;
	
	@FindBy(id = "ID_DN_DesignationDefaultbutton")
	public static WebElement designationSetDefault;
	
	
	
	@FindBy(id = "ID_DN_DesignationName")
	public static WebElement designation;
	
	
	
	@FindBy(id = "ID_DN_DesignationDesc")
	public static WebElement description;
	
	
	
	@FindBy(id="ID_DN_DesignationADDSubmit")
	public static WebElement designationAddSubmit;

	@FindBy(id = "ID_DN_DesignationAddbutton")
	public static WebElement designationAddCancel;

	@FindBy(id = "ID_DN_DesignationEditSubmit")
	public static WebElement designationEditSubmit;


	@FindBy(id = "ID_DN_DesignationDeletebutton")
	public static WebElement designationsEditCancel;

	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_DN_Designation")
	public static WebElement designationTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		
		element.put(module, masterIcon);
		 
		element.put(subModule, userManagementIcon);
		 
		element.put(screen, designationIcon);
		 
		element.put(action, designationAction);
		 
		element.put(add,designationAdd );
		 
		element.put(delete,designationDelete );
		 
		element.put(edit,designationEdit);
		 
		element.put(nameValue, designation);
		 
		element.put(descriptionValue, description);
		 
		element.put(addSubmitButton, designationAddSubmit);
		
		
		element.put(editSubmitButton,designationEditSubmit);
		
		element.put(tabHeader, designationTabIcon);
		
		element.put(home, homeIcon);
		
		
		
		return element;
	}
	
	
	
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, designationList);
		 
		 elements.put(descriptionList, designationDescriptionList);
		 
		 elements.put(checkBoxList, designationCheckboxList);
		 
		return elements;
	}
	
	
	
}
