package SampleManagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
import Configuration.ElementApprovalConfiguration;

public class ElementSampleCategory  extends ElementName{

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	
	
	//*[@id="ID_Lims_SuccessAlertDiv_0"]/div/span/i

	@FindBy(xpath= "//*[@id=\"ID_Lims_AlertMsg_0\"]")
	public static WebElement alertTwo;
	
	@FindBy(xpath = "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]")
	public static WebElement alertOne;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[2]/div/i")
	public static WebElement searchClose;
	

	@FindBy(xpath= "//*[@id=\"ID_SCY_SampleCategoryBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> sampleCategoryList;


	@FindBy(xpath= "//*[@id=\"ID_SCY_SampleCategoryBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> sampleCategoryDescriptionList;
	

	@FindBy(xpath= "//*[@id=\"ID_SCY_SampleCategoryBind\"]/div/div[2]")
	public static List<WebElement> sampleCategoryCheckboxList;
	

	@FindBy(xpath= "//*[@id=\"ID_SCY_SampleCategoryBind\"]/div/div[1]/div[3]/p")
	public static List<WebElement> sampleCategoryCategoryFlowBasedStatus;
	
	
	@FindBy(id = "iModuleID_14")
	public static WebElement sampleManagementIcon;
	
	@FindBy(id = "iFormID_24")
	public static WebElement sampleCategoryIcon;
	
	@FindBy(id = "ID_SCY_AddPopUpTitle")
	public static WebElement sampleCategoryAddHeading;


	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[4]/label")
	public static WebElement sampleCategoryAddCategoryFlowBased;

	@FindBy(id = "ID_SCY_AddPopUpTitle")
	public static WebElement sampleCategoryEditHeading;
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[2]/label")
	public static WebElement sampleCategoryAddName;

	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[3]/label")
	public static WebElement sampleCategoryAddDescription;

	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[2]/label")
	public static WebElement sampleCategoryEditName;

	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[3]/label")
	public static WebElement sampleCategoryEditDescription;
	

	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryAddDesign\"]/div[4]/label")
	public static WebElement sampleCategoryEditCategoryFlowBased;
	
	


	@FindBy(id = "ID_SCY_SampleCategory")
	public static WebElement sampleCategoryHeading;
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[1]/div[1]/p")
	public static WebElement sampleCategorySubHeadingName;
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[1]/div[2]/p")
	public static WebElement sampleCategorySubHeadingDescription;
	

	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[1]/div[3]/p")
	public static WebElement sampleCategorySubHeadingCategoryFlow;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SCY_SampleCategoryHeaderDesign\"]/div[2]/div")
	public static WebElement sampleCategorySearchIcon;
	
	
	@FindBy(id= "ID_SCY_SampleCategoryBind_Data")
	public static WebElement sampleCategorySearch;
	
	
	@FindBy(xpath = "//*[@id='ID_SC_ActionMenu']/a")
	public static WebElement sampleCategoryAction;

	@FindBy(id = "ID_SCY_SampleCategoryAddbutton")
	public static WebElement sampleCategoryAdd;

	@FindBy(id = "ID_SCY_SampleCategoryEditbutton")
	public static WebElement sampleCategoryEdit;

	@FindBy(id = "ID_SCY_SampleCategoryDeletebutton")
	public static WebElement sampleCategoryDelete;

	@FindBy(id = "ID_SCY_SampleCategoryRefreshbutton")
	public static WebElement sampleCategoryRefresh;

	@FindBy(id = "ID_SCY_SampleCategoryDefaultbutton")
	public static WebElement sampleCategorySetDefault;
                   
	@FindBy(id = "ID_SCY_SampleCategoryName")
	public static WebElement sampleCategory;

	@FindBy(id = "ID_SCY_SampleCategoryDesignDescription")
	public static WebElement sampleCategoryDescription;
	
	@FindBy(id = "ID_SCY_SCYCatBasedFlow")
	public static WebElement sampleCategoryCategoryFlowBased;

	@FindBy(id = "ID_SCY_SampleCategoryADDSubmit")
	public static WebElement sampleCategoryAddSubmit;

	@FindBy(id = "ID_SCY_SampleCategoryCancel")
	public static WebElement sampleCategoryAddCancel;

	@FindBy(id = "ID_SCY_SampleCategoryEDITSubmit")
	public static WebElement sampleCategoryEditSubmit;

	@FindBy(id = "ID_SCY_SampleCategoryCancel")
	public static WebElement sampleCategoryEditCancel;
	
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;	
	
	@FindBy(id = "ID_SCY_SampleCategory")
	public static WebElement sampleCategoryTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		
		element.put(module, masterIcon);
		 
		element.put(subModule, sampleManagementIcon);
		 
		element.put(screen, sampleCategoryIcon);
		 
		element.put(action, sampleCategoryAction);
		 
		element.put(add,sampleCategoryAdd );
		
		element.put(edit,sampleCategoryEdit );
		
		element.put(delete,sampleCategoryDelete);
		 
		element.put(nameValue, sampleCategory);
		 
		element.put(descriptionValue, sampleCategoryDescription);
		 
		element.put(addSubmitButton, sampleCategoryAddSubmit);
		
		
		element.put(editSubmitButton,sampleCategoryEditSubmit);
		
		element.put(tabHeader, sampleCategoryTabIcon);
		
		element.put(home, homeIcon);
		
	
		return element;
	}
	
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, sampleCategoryList);
		 
		 elements.put(descriptionList, sampleCategoryDescriptionList);
		 
		 elements.put(checkBoxList, sampleCategoryCheckboxList);
		 
		return elements;
	}
	
	
	
}
