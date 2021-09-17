package Organisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementSection extends ElementName{

	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_4")
	public static WebElement organisationManagementIcon;
	
	

	@FindBy(xpath = "//*[@id=\"ID_ST_SecHeadermain\"]/div[2]/div")
	public static WebElement searchIcon;

	

	@FindBy(xpath = "//*[@id=\"ID_ST_SecHeadermain\"]/div[2]/div/i")
	public static WebElement searchClose;

	

	@FindBy(xpath = "//*[@id=\"ID_ST_SecDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> sectionList;
	


	@FindBy(xpath = "//*[@id=\"ID_ST_SecDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement>  sectionDescriptionList;
	


	@FindBy(xpath = "//*[@id=\"ID_ST_SecDataBind\"]/div/div[2]/p")
	public static List<WebElement>  sectionCheckboxList;
	
		
	

	@FindBy(id = "iFormID_32")  
	public static WebElement sectionIcon;
	
	@FindBy(xpath = "//*[@id='ID_ST_ActionMenu']/a")
	public static WebElement sectionAction;

	@FindBy(id = "ID_ST_SecAddbutton")
	public static WebElement sectionAdd;

	@FindBy(id = "ID_ST_SecEditbutton")
	public static WebElement sectionEdit;


	@FindBy(id = "ID_ST_SecDeletebutton")
	public static WebElement sectionDelete;

	@FindBy(id = "ID_ST_SecRefreshbutton")
	public static WebElement sectionRefresh;
	
	@FindBy(id = "ID_ST_SecName")
	public static WebElement section;

	@FindBy(id = "ID_ST_SecDesc")
	public static WebElement sectionDescription;
	
	
	@FindBy(id = "ID_ST_SecADDSubmit")
	public static WebElement sectionAddSubmit;


	@FindBy(id = "ID_ST_SecCancel")
	public static WebElement sectionAddCancel;

	@FindBy(id = "ID_ST_SecEDITSubmit")
	public static WebElement sectionEditSubmit;

	@FindBy(id = "ID_ST_SecCancel")
	public static WebElement sectionEditCancel;
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_ST_Section")
	public static WebElement sectionTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
			
		element.put(module, masterIcon);
		 
		element.put(subModule, organisationManagementIcon);
		 
		element.put(screen, sectionIcon);
		 
		element.put(action, sectionAction);
		 
		element.put(add,sectionAdd);
		
		element.put(edit,sectionEdit);
		
		element.put(delete,sectionDelete);
		 
		element.put(nameValue, section);
		 
		element.put(descriptionValue, sectionDescription);
		 
		element.put(addSubmitButton, sectionAddSubmit);
			
		element.put(editSubmitButton,sectionEditSubmit);
		
		element.put(tabHeader, sectionTabIcon);
		
		element.put(home, homeIcon);
		
		return element;
	}

	

	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, sectionList);
		 
		 elements.put(descriptionList, sectionDescriptionList);
		 
		 elements.put(checkBoxList, sectionCheckboxList);
		 
		return elements;
	}
	

}
