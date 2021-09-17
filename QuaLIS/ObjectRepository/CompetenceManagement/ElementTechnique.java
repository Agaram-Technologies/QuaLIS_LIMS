package CompetenceManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementTechnique extends ElementName{

	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_19")
	public static WebElement competenceManagementIcon;
	
	@FindBy(id = "iFormID_86")
	public static WebElement techniqueIcon;
	
	//*[@id=""]/div[2]/div
	@FindBy(xpath = "//*[@id=\"ID_TEC_TechniqueHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_TEC_TechniqueHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	

	

	@FindBy(xpath = "//*[@id=\"ID_TEC_TechniqueDesignBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> techniqueList;
	

	

	@FindBy(xpath = "//*[@id=\"ID_TEC_TechniqueDesignBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> techniqueDescriptionList;
	
	

	

	@FindBy(xpath = "//*[@id=\"ID_TEC_TechniqueDesignBind\"]/div/div[1]/div[3]/p")
	public static List<WebElement> techniqueCheckboxList;
	
	
	
	

	@FindBy(xpath = "//*[@id='ID_TEC_ActionMenu']/a")
	public static WebElement techniqueAction;
	
	@FindBy(id = "ID_TEC_TechniqueAddbutton")
	public static WebElement techniqueAdd ;

	@FindBy(id = "ID_TEC_TechniqueEditbutton")
	public static WebElement techniqueEdit;
	
	@FindBy(id = "ID_TEC_TechniqueDeletebutton")
	public static WebElement techniqueDelete;

	@FindBy(id = "ID_TEC_TechniqueName")
	public static WebElement technique ;
	
	
	
	@FindBy(id = "ID_TEC_TechniqueDescription")
	public static WebElement techniqueDescription;
	
	@FindBy(id = "ID_TEC_TechniqueADDSubmit")
	public static WebElement techniqueAddSubmit ;
	

	@FindBy(id = "ID_TEC_TechniqueCancel")
	public static WebElement techniqueAddCancel;
	
	@FindBy(id = "ID_TEC_TechniqueEditSubmit")
	public static WebElement techniqueEditSubmit;

	@FindBy(id = "ID_TEC_TechniqueCancel")
	public static WebElement techniqueEditCancel;
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_TEC_Technique")
	public static WebElement techniqueTabIcon;
				
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
			
		element.put(module, masterIcon);
		 
		element.put(subModule, competenceManagementIcon);
		 
		element.put(screen, techniqueIcon);
		 
		element.put(action, techniqueAction);
		 
		element.put(add,techniqueAdd );
		
		element.put(edit,techniqueEdit);
		
		element.put(delete,techniqueDelete);
		 
		element.put(nameValue, technique);
		 
		element.put(descriptionValue, techniqueDescription);
		 
		element.put(addSubmitButton, techniqueAddSubmit);
			
		element.put(editSubmitButton,techniqueEditSubmit);
		
		element.put(tabHeader, techniqueTabIcon);
		
		element.put(home, homeIcon);
		
		return element;
	}
	
	

	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, techniqueList);
		 
		 elements.put(descriptionList, techniqueDescriptionList);
		 
		 elements.put(checkBoxList, techniqueCheckboxList);
		 
		return elements;
	}
	
	
}
