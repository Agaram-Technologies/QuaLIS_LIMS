package TestManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementMethod extends ElementName {


	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_5")
	public static WebElement testManagementIcon;

	@FindBy(id = "iFormID_22")
	public static WebElement methodIcon;

	@FindBy(xpath = "//*[@id='ID_MD_ActionMenu']/a")
	public static WebElement methodAction;
	
	@FindBy(xpath = "//*[@id=\"ID_MD_MethodHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_MD_MethodHead\"]/div[2]/div/i")
	public static WebElement searchClose;

	//*[@id=""]/div[2]/div

	@FindBy(xpath = "//*[@id=\"ID_MD_MethodDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> methodList;
	

	

	@FindBy(xpath = "//*[@id=\"ID_MD_MethodDesignBind\"]/div/div[1]/div[3]/p")
	public static List<WebElement> methodDescriptionList;

	

	@FindBy(xpath = "//*[@id=\"ID_MD_MethodDesignBind\"]/div/div[2]/p")
	public static List<WebElement> methodCheckboxList;
	

	@FindBy(id = "ID_MD_MethodAddbutton")
	public static WebElement methodAdd;

	@FindBy(id = "ID_MD_MethodEditbutton")
	public static WebElement methodEdit;

	@FindBy(id = "ID_MD_MethodDeletebutton")
	public static WebElement methodDelete;

	@FindBy(id = "ID_MD_MethodRefreshbutton")
	public static WebElement methodRefresh;

	@FindBy(id = "ID_MD_MethodDefaultbutton")
	public static WebElement methodSetAsDefault;

	@FindBy(id = "ID_MD_Methodid")
	public static WebElement methodCategory;
	

	@FindBy(id = "ID_MD_MethodName")
	public static WebElement method;
	
	
	@FindBy(id = "ID_MD_MethodDesc")
	public static WebElement methodDescription;

	@FindBy(id = "ID_MD_MethodADDSubmit")
	public static WebElement methodAddSubmit;

	@FindBy(id = "ID_MD_MethodCancel")
	public static WebElement methodAddCancel;

	@FindBy(id = "ID_MD_MethodEditSubmit")
	public static WebElement methodEditSubmit;
	
	
	@FindBy(id = "ID_MD_MethodCancel")
	public static WebElement methodEditCancel;

	
	
	@FindBy(className = "col-xl-1 col-lg-1 col-md-1 col-sm-1 col-xs-1")
	public static WebElement methodSearchIcon;
	
	
	@FindBy(className= "fa fa-close")
	public static WebElement methodSearchIconClose;
	
	
	
	@FindBy(id = "ID_MD_Method")
	public static WebElement methodTabIcon;

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;

	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, testManagementIcon);
		
		element.put(screen, methodIcon);
		
		element.put(action, methodAction);
		
		element.put(add, methodAdd);
		
		element.put(edit, methodEdit);
		
		element.put(delete, methodDelete);
		
		element.put(nameValue, method);
		
		element.put(descriptionValue, methodDescription);
		
		element.put(addSubmitButton, methodAddSubmit);
		
		element.put(editSubmitButton, methodEditSubmit);
		
		element.put(tabHeader, testManagementIcon);
		
		element.put(home, homeIcon);
		
		
		return element;
	}
	
	public static List<List<WebElement>> list()
	{
		List<List<WebElement>> list=new ArrayList<List<WebElement>>();
		
		list.add(methodList);
		
		list.add(methodDescriptionList);
		
		list.add(methodCheckboxList);		
		
		return list;
		
	}
	
	
	
}
