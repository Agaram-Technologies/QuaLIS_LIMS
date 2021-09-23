package InstrumentManagement;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementInstrumentCategory {
	
	
	//Master
		@FindBy(id="iMenuID_1")
		public static WebElement masterIcon;
				
	//Instrument Management	
		@FindBy(id="iModuleID_7")
		public static WebElement instrumentManagementIcon;
		
		
	//Instrument Category
		@FindBy(id="iFormID_27")
		public static WebElement instrumentCategoryIcon;
		
		@FindBy(className="TM_StaticActionIcon")
		public static WebElement instrumentCategoryAction;
		
	//Add
		@FindBy(id="ID_IC_InstAddButton")
		public static WebElement instrumentCategoryAdd;
		
		@FindBy(id="ID_IC_InstCatName")
		public static WebElement instrumentCategory;
		
		@FindBy(id="ID_IC_InstDesc")
		public static WebElement instrumentCategoryDescription;
		
		@FindBy(id="ID_IC_InstTechnique")
		public static WebElement instrumentCategoryTechnique;
		
		@FindBy(id="ID_IC_InterfaceType")
		public static WebElement instrumentCategoryInterface;
		
		@FindBy(id="ID_IC_InstCalibrationReq")
		public static WebElement instrumentCategoryCalibrationRequired;
		
		@FindBy(id="ID_IC_InstCatBasedFlow")
		public static WebElement instrumentCategoryCategoryFlowBased;
		
		@FindBy(id="ID_IC_InstCatSubmitAdd")
		public static WebElement instrumentCategoryAddSubmit;
		
		
		@FindBy(id="ID_IC_InstEditButton")
		public static WebElement instrumentCategoryEdit;
		
		@FindBy(id="ID_IC_InstDeleteButton")
		public static WebElement instrumentCategoryDelete;
		
		
		
		
		public static List list()
		{
			 List<WebElement> aa=new ArrayList<WebElement>();
			 
			 aa.add(masterIcon);
			 
			 aa.add(instrumentManagementIcon);
			 
			 aa.add(instrumentCategoryIcon);
			 
			 aa.add(instrumentCategoryAction);
			 
			 aa.add(instrumentCategoryAdd);
			 
			 aa.add(instrumentCategoryEdit);
			 
			 aa.add(instrumentCategoryDelete);
			 
			 return aa;
		}
		

		

		@FindBy(xpath="//*[@id=\"ID_IC_InstCatData\"]/div")
		public static List<WebElement> instrumentCategoryList;
		
	}
