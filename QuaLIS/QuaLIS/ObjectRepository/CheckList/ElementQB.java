package CheckList;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementQB extends ElementName{ 

	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	

		@FindBy(id="iModuleID_13")
		public static WebElement checkListManagementIcon;
		
	
		@FindBy(id="iFormID_65")
		public static WebElement QBIcon;
		
		@FindBy(xpath="//*[@id='ID_CQB_ActionMenu']/a")
		public static WebElement QBAction;


		@FindBy(xpath = "//*[@id=\"ID_CQB_CheckListQBDesignBind\"]/div/div[1]/div[2]/p")
		public static List<WebElement> QBList;
		
		
		@FindBy(xpath = "//*[@id=\"ID_CQB_CheckListQBDesignBind\"]/div/div[2]")
		public static List<WebElement> QBCheckboxList;
	
		@FindBy(id="ID_CQB_CheckListQBAddbutton")
		public static WebElement QBAdd;
		
		
		
		@FindBy(id="ID_CQB_CheckListQBEditbutton")
		public static WebElement QBEdit;
		
		
		@FindBy(id="ID_CQB_CheckListQBDeletebutton")
		public static WebElement QBDelete;
		
		
		@FindBy(id="ID_CQB_CheckListQBRefreshbutton")
		public static WebElement QBRefresh;
		
		
		@FindBy(id="ID_CQB_CheckListQBCategory")
		public static WebElement QBQBCategory;
		
		@FindBy(id="ID_CQB_CheckListQBQuestion")
		public static WebElement QB;
		
		@FindBy(id="ID_CQB_CheckListQBMandatory")
		public static WebElement QBMandatory;
		
		@FindBy(id="ID_CQB_CheckListQBComponent")
		public static WebElement QBComponent;
		
		@FindBy(id="ID_CQB_CheckListQBQuestiondata")
		public static WebElement QBDisplayValue;
		
		@FindBy(id="ID_CQB_CheckListQBADDSubmit")
		public static WebElement QBAddSubmit;
		
		
		
		@FindBy(id="ID_CQB_CheckListQBCancel")
		public static WebElement QBAddCancel;
		

@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
public static WebElement homeIcon;	

@FindBy(id = "ID_TRC_TrainingCategory")
public static WebElement QBCategoryTabIcon;
			
/*public static HashMap<String,WebElement> element()
{
	HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
	element.put(module, masterIcon);
	 
	element.put(subModule, checkListManagementIcon);
	 
	element.put(screen, QBIcon);
	 
	element.put(action, QBAction);
	 
	element.put(add,QBAdd);
	 
	element.put(nameValue, QB);
	 
	element.put(descriptionValue, QBDescription);
	 
	element.put(addSubmitButton, QBAddSubmit);
		
	element.put(editSubmitButton,QBEditSubmit);
	
	element.put(tabHeader, QBTabIcon);
	
	element.put(home, homeIcon);
	
	return element;
}*/

}
