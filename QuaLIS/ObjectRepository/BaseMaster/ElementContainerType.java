package BaseMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementContainerType  extends ElementName {
	

	@FindBy(xpath = "//*[@id=\"ID_CT_ContainerTypeHead\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_CT_ContainerTypeHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_CT_ContainerTypeDesignBind\"]/div/div[1]/div[1]")
	public static List<WebElement> containerTypeList;
	
	@FindBy(xpath = "//*[@id=\"ID_CT_ContainerTypeDesignBind\"]/div/div[1]/div[2]")
	public static List<WebElement> containerTypeDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_CT_ContainerTypeHeaderDesign\"]/div/div[2]")
	public static List<WebElement> containerTypeCheckboxList;
	
	
	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_45")
	public static WebElement containerTypeIcon;

	@FindBy(xpath = "//*[@id='ID_CT_ContainerTypeActionMenu']/a")
	public static WebElement containerTypeAction;
	
	@FindBy(id = "ID_CT_ContainerTypeAddbutton")
	public static WebElement containerTypeAdd ;

	@FindBy(id = "ID_CT_ContainerTypeEditbutton")
	public static WebElement containerTypeEdit;
	
	@FindBy(id = "ID_CT_ContainerTypeDeletebutton")
	public static WebElement containerTypeDelete;

	@FindBy(id = "ID_CT_ContainerTypeRefreshbutton")
	public static WebElement containerTypeRefresh;

	
	@FindBy(id = "ID_CT_ContainerTypeName")
	public static WebElement containerType;

	@FindBy(id = "ID_CT_ContainerTypeDescription")
	public static WebElement containerTypeDescription;
	
	@FindBy(id = "ID_CT_ContainerTypeADDSubmit")
	public static WebElement containerTypeAddSubmit ;

	@FindBy(id = "ID_CT_ContainerTypeCancel")
	public static WebElement containerTypeAddCancel;
	
	@FindBy(id = "ID_CT_ContainerTypeEDITSubmit")
	public static WebElement containerTypeEditSubmit;

	@FindBy(id = "ID_CT_ContainerTypeCancel")
	public static WebElement containerTypeEditCancel;
	
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
		
	@FindBy(id = "ID_CT_ContainerTypeData")
	public static WebElement containerTypeTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, baseMasterIcon);
		
		element.put(screen, containerTypeIcon);
		
		element.put(action, containerTypeAction);
		
		element.put(add, containerTypeAdd);
		
		element.put(edit, containerTypeEdit);
		
		element.put(delete, containerTypeDelete);
		
		element.put(nameValue, containerType);
		
		element.put(descriptionValue, containerTypeDescription);
		
		element.put(addSubmitButton, containerTypeAddSubmit);
		
		element.put(editSubmitButton, containerTypeEditSubmit);
		
		element.put(tabHeader, containerTypeTabIcon);
		
		element.put(home, homeIcon);
			
		return element;
	}
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList,  containerTypeList);
		 
		 elements.put(descriptionList,  containerTypeDescriptionList);
		 
		 elements.put(checkBoxList,  containerTypeCheckboxList);
		 
		return elements;
	}
	

}