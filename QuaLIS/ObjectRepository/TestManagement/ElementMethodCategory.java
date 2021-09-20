package TestManagement;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementMethodCategory  extends ElementName
	
{

	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_5")
	public static WebElement testManagementIcon;

	@FindBy(id = "iFormID_21")
	public static WebElement methodCategoryIcon;

	@FindBy(xpath = "//*[@id='ID_MC_ActionMenu']/a")
	public static WebElement methodCategoryAction;
	
	//*[@id=""]/div[2]/div
	

	@FindBy(xpath = "//*[@id=\"ID_MC_MethodCategoryHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_MC_MethodCategoryHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	@FindBy(xpath = "//*[@id=\"ID_MC_MethodCategoryDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> methodCategoryList;

	@FindBy(xpath = "//*[@id=\"ID_MC_MethodCategoryDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> methodCategoryDescriptionList;

	@FindBy(xpath = "//*[@id=\"ID_MC_MethodCategoryDesignBind\"]/div/div[2]/p")
	public static List<WebElement> methodCategoryCheckboxList;


	@FindBy(id = "ID_MC_MethodCategoryAddbutton")
	public static WebElement methodCategoryAdd;

	@FindBy(id = "ID_MC_MethodCategoryEditbutton")
	public static WebElement methodCategoryEdit;

	@FindBy(id = "ID_MC_MethodCategoryDeletebutton")
	public static WebElement methodCategoryDelete;

	@FindBy(id = "ID_MC_MethodCategoryRefreshbutton")
	public static WebElement methodCategoryRefresh;

	@FindBy(id = "ID_MC_MethodCategoryDefaultbutton")
	public static WebElement methodCategorySetAsDefault;

	@FindBy(id = "ID_MC_MethodCategoryName")
	public static WebElement methodCategory;
	
	
	@FindBy(id = "ID_MC_MethodCategoryDesc")
	public static WebElement methodCategoryDescription;

	@FindBy(id = "ID_MC_MethodCategoryADDSubmit")
	public static WebElement methodCategoryAddSubmit;

	@FindBy(id = "ID_MC_MethodCategoryCancel")
	public static WebElement methodCategoryAddCancel;

	@FindBy(id = "ID_MC_MethodCategoryEditSubmit")
	public static WebElement methodCategoryEditSubmit;
	
	
	@FindBy(id = "ID_MC_MethodCategoryCancel")
	public static WebElement methodCategoryEditCancel;

	
	
	@FindBy(className = "col-xl-1 col-lg-1 col-md-1 col-sm-1 col-xs-1")
	public static WebElement methodCategorySearchIcon;
	
	
	@FindBy(className= "fa fa-close")
	public static WebElement methodCategorySearchIconClose;
	
	@FindBy(id = "ID_MC_MethodCategory")
	public static WebElement methodCategoryTabIcon;

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static List<WebElement>  methodCategoryDescritionList;
	
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, testManagementIcon);
		
		element.put(screen, methodCategoryIcon);
		
		element.put(action, methodCategoryAction);
		
		element.put(add, methodCategoryAdd);
		
		element.put(edit, methodCategoryEdit);
		
		element.put(delete, methodCategoryDelete);
		
		element.put(nameValue, methodCategory);
		
		element.put(descriptionValue, methodCategoryDescription);
		
		element.put(addSubmitButton, methodCategoryAddSubmit);
		
		element.put(editSubmitButton, methodCategoryEditSubmit);
		
		element.put(tabHeader, methodCategoryTabIcon);
		
		element.put(home, homeIcon);
		
		
		return element;
	}
	
	public static List<List<WebElement>> list()
	{
		List<List<WebElement>> list=new ArrayList<List<WebElement>>();
		
		list.add(methodCategoryList);
		
		list.add(methodCategoryDescritionList);
		
		list.add(methodCategoryCheckboxList);		
		
		return list;
		
	}
	
		
}
