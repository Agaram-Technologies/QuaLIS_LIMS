package CheckList;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementQBCategory extends ElementName{


	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	

@FindBy(id="iModuleID_13")
public static WebElement checkListManagementIcon;

//QB Category
@FindBy(id="iFormID_64")
public static WebElement QBCategoryIcon;

@FindBy(xpath="//*[@id='ID_QBC_ActionMenu']/a")
public static WebElement QBCategoryAction;



@FindBy(xpath = "//*[@id=\"ID_QBC_QBCategoryDesignBind\"]/div/div[1]/div[1]/p")
public static List<WebElement> QBCategoryList;

@FindBy(xpath = "//*[@id=\"ID_QBC_QBCategoryDesignBind\"]/div/div[1]/div[2]/p")
public static List<WebElement> QBCategoryDescriptionList;


@FindBy(xpath = "//*[@id=\"ID_QBC_QBCategoryDesignBind\"]/div/div[2]")
public static List<WebElement> QBCategoryCheckboxList;

@FindBy(id="ID_QBC_QBCategoryAddbutton")
public static WebElement QBCategoryAdd;

@FindBy(id="ID_QBC_QBCategoryEditbutton")
public static WebElement QBCategoryEdit;


@FindBy(id="ID_QBC_QBCategoryDeletebutton")
public static WebElement QBCategoryDelete;


@FindBy(id="ID_QBC_QBCategoryName")
public static WebElement QBCategory;

@FindBy(id="ID_QBC_QBCategoryDescription")
public static WebElement QBCategoryDescription;

@FindBy(id="ID_QBC_QBCategoryADDSubmit")
public static WebElement QBCategoryAddSubmit;


@FindBy(id="ID_QBC_QBCategoryEditSubmit")
public static WebElement QBCategoryEditSubmit;

@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
public static WebElement homeIcon;	

@FindBy(id = "ID_QBC_QBCategory")
public static WebElement QBCategoryTabIcon;
			
public static HashMap<String,WebElement> element()
{
	HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
	element.put(module, masterIcon);
	 
	element.put(subModule, checkListManagementIcon);
	 
	element.put(screen, QBCategoryIcon);
	 
	element.put(action, QBCategoryAction);
	 
	element.put(add,QBCategoryAdd);
	
	element.put(edit,QBCategoryEdit);
	
	element.put(delete,QBCategoryDelete);
	 
	element.put(nameValue, QBCategory);
	 
	element.put(descriptionValue, QBCategoryDescription);
	 
	element.put(addSubmitButton, QBCategoryAddSubmit);
		
	element.put(editSubmitButton,QBCategoryEditSubmit);
	
	element.put(tabHeader, QBCategoryTabIcon);
	
	element.put(home, homeIcon);
	
	return element;
}



public static HashMap<String, List<WebElement>> list()
{
	 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
	
	 elements.put(nameList, QBCategoryList);
	 
	 elements.put(descriptionList, QBCategoryDescriptionList);
	 
	 elements.put(checkBoxList, QBCategoryCheckboxList);
	 
	return elements;
}

}
