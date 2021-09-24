package MaterialManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Config.ModuleName;
import Config.ScreenName;
import Config.SubModuleName;

public class ElementMaterialGrade  extends ElementName{ 

	// Master
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	// Material Management
	@FindBy(id = "iModuleID_8")
	public static WebElement materialManagementIcon;

	// Material Grade
	@FindBy(id = "iFormID_219")
	public static WebElement materialGradeIcon;

	@FindBy(className = "TM_StaticActionIcon")
	public static WebElement materialGradeAction;

	// Add
	@FindBy(id = "ID_MGrade_MaterialGradeAddbutton")
	public static WebElement materialGradeAdd;

	@FindBy(id = "ID_MGrade_MaterialGradeName")
	public static WebElement materialGrade;

	@FindBy(id = "ID_MGrade_MaterialGradeDesc")
	public static WebElement materialGradeDescription;

	@FindBy(id = "ID_MGrade_MaterialGradeADDSubmit")
	public static WebElement materialGradeAddSubmit;

	@FindBy(id = "ID_MGrade_MaterialGradeEditbutton")
	public static WebElement materialGradeEdit;

	@FindBy(id = "ID_MGrade_MaterialGradeDeletebutton")
	public static WebElement materialGradeDelete;

	@FindBy(xpath = "//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;

	@FindBy(id = "ID_MGrade_MaterialGrade")
	public static WebElement materialGradeTabIcon;
	
	@FindBy(id = "ID_MGrade_MaterialGradeEditSubmit")
	public static WebElement materialGradeEditSubmit;
	
	
	@FindBy(xpath = "//*[@id=\"ID_MGrade_MaterialGradeDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> materialGradeList;
	
	@FindBy(xpath = "//*[@id=\"ID_MGrade_MaterialGradeDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> materialGradeDescriptionList;
	
	@FindBy(xpath = "//*[@id=\"ID_MGrade_MaterialGradeDesignBind\"]/div/div[2]")
	public static List<WebElement> materialGradeCheckboxList;

	public static HashMap<String, WebElement> element() {
		HashMap<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(module, masterIcon);

		element.put(subModule, materialManagementIcon);

		element.put(screen, materialGradeIcon);

		element.put(action, materialGradeAction);

		element.put(add, materialGradeAdd);
		
		element.put(edit, materialGradeEdit);
	
		element.put(delete, materialGradeDelete);

		element.put(nameValue, materialGrade);

		element.put(descriptionValue, materialGradeDescription);

		element.put(addSubmitButton, materialGradeAddSubmit);

		element.put(editSubmitButton, materialGradeEditSubmit);

		element.put(tabHeader, materialGradeTabIcon);

		element.put(home, homeIcon);

		return element;
	}

	


	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, materialGradeList);
		 
		 elements.put(descriptionList, materialGradeDescriptionList);
		 
		 elements.put(checkBoxList, materialGradeCheckboxList);
		 
		return elements;
	}
	
	
	public static HashMap<String, String> menu()
	{		
		 HashMap<String,String> menu=new HashMap<String,String>();

		 menu.put(screenName, ScreenName.materialGrade);
		
		 menu.put(subModuleName, SubModuleName.materialManagement);
				
		 menu.put(moduleName, ModuleName.master);
		
		return menu;
		
	}
	

	
	
}