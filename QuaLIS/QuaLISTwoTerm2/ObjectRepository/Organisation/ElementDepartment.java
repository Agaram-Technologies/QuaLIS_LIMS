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
public class ElementDepartment extends ElementName{
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	

	@FindBy(xpath = "//*[@id=\"ID_DE_DepartmentCondHeadermain\"]/div[2]/div")
	public static WebElement searchIcon;

	

	@FindBy(xpath = "//*[@id=\"ID_DE_DepartmentCondHeadermain\"]/div[2]/div/i")
	public static WebElement searchClose;


	
	
	@FindBy(id = "iModuleID_4")
	public static WebElement organisationManagementIcon;

	@FindBy(id = "iFormID_30")
	public static WebElement departmentIcon;
	

	@FindBy(xpath = "//div[@class='TM_FilterStyle glyphicon glyphicon-filter Lims_FilterData DE_FilterRemoveData']")
	public static WebElement departmentSearchIcon;
	
	


	@FindBy(id = "ID_DE_DepartmentDataBind_Data")
	public static WebElement departmentSearchField;
	
	
	
	
	
	@FindBy(xpath = "//*[@id='ID_DE_ActionMenu']/a")
	public static WebElement departmentAction;
	


	@FindBy(xpath = "//*[@id=\"ID_DE_DepartmentDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> departmentList;
	
	@FindBy(xpath = "//*[@id=\"ID_DE_DepartmentDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> departmentDescriptionList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_DE_DepartmentDataBind\"]/div/div[2]")
	public static List<WebElement> departmentCheckboxList;
	
	

	@FindBy(id = "ID_DE_DepartmentAddbutton")
	public static WebElement departmentAdd;

	@FindBy(id = "ID_DE_DepartmentEditbutton")
	public static WebElement departmentEdit;


	@FindBy(id = "ID_DE_DepartmentDeletebutton")
	public static WebElement departmentDelete;

	@FindBy(id = "ID_DE_DepartmentRefreshbutton")
	public static WebElement departmentRefresh;
	
                	
	
	@FindBy(id = "ID_DE_DepartmentName")
	public static WebElement department;
	
	@FindBy(id = "ID_DE_DepartmentName")
	public static WebElement departmentEditField;
	
	

	@FindBy(id = "ID_DE_DepartmentDesc")
	public static WebElement departmentDescription;
	
	
	@FindBy(id = "ID_DE_DepartmentADDSubmit")
	public static WebElement departmentAddSubmit;


	@FindBy(id = "ID_DE_DepartmentCancel")
	public static WebElement departmentAddCancel;

	@FindBy(id = "ID_DE_DepartmentEDITSubmit")
	public static WebElement departmentEditSubmit;

	@FindBy(id = "ID_DE_DepartmentCancel")
	public static WebElement departmentEditCancel;
	
	
	
	
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_DE_Department")
	public static WebElement departmentTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		
		element.put(module, masterIcon);
		 
		element.put(subModule, organisationManagementIcon);
		 
		element.put(screen, departmentIcon);
		 
		element.put(action, departmentAction);
		 
		element.put(add,departmentAdd );
		
		element.put(edit,departmentEdit);
		
		element.put(delete,departmentDelete);
		 
		element.put(nameValue, department);
		 
		element.put(descriptionValue, departmentDescription);
		 
		element.put(addSubmitButton, departmentAddSubmit);	
		
		element.put(editSubmitButton,departmentEditSubmit);
		
		element.put(tabHeader, departmentTabIcon);
		
		element.put(home, homeIcon);
		
	
		return element;
	}
	
	
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, departmentList);
		 
		 elements.put(descriptionList, departmentDescriptionList);
		 
		 elements.put(checkBoxList, departmentCheckboxList);
		 
		return elements;
	}
	
 	
	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.department);
		
		 menu.put(subModuleName, SubModuleName.organisation);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
