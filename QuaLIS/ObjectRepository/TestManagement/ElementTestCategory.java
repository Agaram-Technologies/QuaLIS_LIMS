package TestManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementTestCategory extends ElementName{
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_5")
	public static WebElement testManagementIcon;
	
	@FindBy(id = "iFormID_25")
	public static WebElement testCategoryIcon;

	@FindBy(xpath = "//*[@id=\"ID_SC_ActionMenu\"]/a")
	public static WebElement testCategoryAction;
	
	@FindBy(id = "ID_TC_TestCategoryAddbutton")
	public static WebElement testCategoryAdd;
	
	@FindBy(id = "ID_TC_TestCategoryAddbutton")
	public static WebElement testCategoryEdit;
	
	@FindBy(id = "ID_TC_TestCategoryAddbutton")
	public static WebElement testCategoryDelete;

	@FindBy(id = "ID_TC_TestCategoryName")
	public static WebElement testCategory;
	
	@FindBy(id = "ID_TC_TestCategoryDesignDescription")
	public static WebElement testCategoryDescription;

	@FindBy(id = "ID_TC_TestCategoryADDSubmit")
	public static WebElement testCategoryAddSubmit;
	
	@FindBy(id = "ID_TC_TestCategoryCancel")
	public static WebElement testCategoryAddCancel;

	@FindBy(id = "iModuleID_5")
	public static WebElement testCategoryEditSubmit;
	
	@FindBy(id = "ID_TC_TestCategory")
	public static WebElement testCategoryTabIcon;

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static List<WebElement> testCategoryList;
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static List<WebElement>  testCategoryDescritionList;
	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static List<WebElement>  testCategoryCheckboxList;
	
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, testManagementIcon);
		
		element.put(screen, testCategoryIcon);
		
		element.put(action, testCategoryAction);
		
		element.put(add, testCategoryAdd);
		
		element.put(edit, testCategoryEdit);
		
		element.put(delete, testCategoryDelete);
		
		element.put(nameValue, testCategory);
		
		element.put(descriptionValue, testCategoryDescription);
		
		element.put(addSubmitButton, testCategoryAddSubmit);
		
		element.put(editSubmitButton, testCategoryEditSubmit);
		
		element.put(tabHeader, testCategoryTabIcon);
		
		element.put(home, homeIcon);
		
		
		return element;
	}
	
	public static List<List<WebElement>> list()
	{
		List<List<WebElement>> list=new ArrayList<List<WebElement>>();
		
		list.add(testCategoryList);
		
		list.add(testCategoryDescritionList);
		
		list.add(testCategoryCheckboxList);		
		
		return list;
		
	}
	
		

	

}
