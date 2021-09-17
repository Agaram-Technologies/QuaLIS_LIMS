package CompetenceManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementTrainingCategory extends ElementName{
	


	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_19")
	public static WebElement competenceManagementIcon;
	
	@FindBy(id = "iFormID_87")
	public static WebElement trainingCategoryIcon;
	
	
	@FindBy(xpath = "//*[@id=\"ID_TRC_TrainingCategoryHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_TRC_TrainingCategoryHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	//*[@id=""]/div[2]/div
	
	

	@FindBy(xpath = "//*[@id=\"ID_TRC_TrainingCategoryDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> trainingCategoryList;
	

	

	@FindBy(xpath = "//*[@id=\"ID_TRC_TrainingCategoryDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> trainingCategoryDescriptionList;
	
	

	

	@FindBy(xpath = "//*[@id=\"ID_TRC_TrainingCategoryDesignBind\"]/div/div[2]/p")
	public static List<WebElement> trainingCategoryCheckboxList;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id='ID_TRC_ActionMenu']/a")
	public static WebElement trainingCategoryAction;
	
	@FindBy(id = "ID_TRC_TrainingCategoryAddbutton")
	public static WebElement trainingCategoryAdd ;

	@FindBy(id = "ID_TRC_TrainingCategoryEditbutton")
	public static WebElement trainingCategoryEdit;
	
	@FindBy(id = "ID_TRC_TrainingCategoryDeletebutton")
	public static WebElement trainingCategoryDelete;

	@FindBy(id = "ID_TRC_TrainingCatRefresh")
	public static WebElement trainingCategoryRefresh;

	@FindBy(id = "ID_TRC_TrainingCategoryName")
	public static WebElement trainingCategory ;
	
	
	
	@FindBy(id = "ID_TRC_TrainingCategoryDescription")
	public static WebElement trainingCategoryDescription;
	
	@FindBy(id = "ID_TRC_TrainingCategoryADDSubmit")
	public static WebElement trainingCategoryAddSubmit ;
	

	@FindBy(id = "ID_TRC_TrainingCategoryCancel")
	public static WebElement trainingCategoryAddCancel;
	
	@FindBy(id = "ID_TRC_TrainingCategoryEditSubmit")
	public static WebElement trainingCategoryEditSubmit;

	@FindBy(id = "ID_TRC_TrainingCategoryCancel")
	public static WebElement trainingCategoryEditCancel;

	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_TRC_TrainingCategory")
	public static WebElement trainingCategoryTabIcon;
				
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
			
		element.put(module, masterIcon);
		 
		element.put(subModule, competenceManagementIcon);
		 
		element.put(screen, trainingCategoryIcon);
		 
		element.put(action, trainingCategoryAction);
		 
		element.put(add,trainingCategoryAdd );
		
		element.put(edit, trainingCategoryEdit);
		 
		element.put(delete,trainingCategoryDelete);
		 
		element.put(nameValue, trainingCategory);
		 
		element.put(descriptionValue, trainingCategoryDescription);
		 
		element.put(addSubmitButton, trainingCategoryAddSubmit);
			
		element.put(editSubmitButton,trainingCategoryEditSubmit);
		
		element.put(tabHeader, trainingCategoryTabIcon);
		
		element.put(home, homeIcon);
		
		return element;
	}
	
	
	

	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, trainingCategoryList);
		 
		 elements.put(descriptionList, trainingCategoryDescriptionList);
		 
		 elements.put(checkBoxList, trainingCategoryCheckboxList);
		 
		return elements;
	}
	
	
}
