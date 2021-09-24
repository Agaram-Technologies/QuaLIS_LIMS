package MaterialManagement;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ElementMaterialCategory {

//Master
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
							
	//Material Management	
			@FindBy(xpath="//*[@id=\"ID_MC_MaterialCatData\"]/div")
			public static List<WebElement> materialCategoryList;
			
			
			
			@FindBy(id="iModuleID_8")
			public static WebElement materialManagementIcon;
			
			
	//Material Category
			@FindBy(id="iFormID_23")
			public static WebElement materialCategoryIcon;
			
			@FindBy(className="TM_StaticActionIcon")
			public static WebElement materialCategoryAction;
			
			@FindBy(id="ID_MC_AddButton")
			public static WebElement materialCategoryAdd;
			
			
			@FindBy(id="ID_MC_EditButton")
			public static WebElement materialCategoryEdit;
			
			@FindBy(id="ID_MC_DeleteButton")
			public static WebElement materialCategoryDelete;
			
			@FindBy(id="ID_MC_MaterialTypeName")
			public static WebElement materialCategoryType;
			
			@FindBy(id="ID_MC_MaterialCatName")
			public static WebElement materialCategory;
			
			@FindBy(id="ID_MC_UserRole")
			public static WebElement materialCategoryUserRole;
			
			@FindBy(id="ID_MC_BarcodeName")
			public static WebElement materialCategoryBarCode;
			
			@FindBy(id="ID_MC_MCCatBasedFlow")
			public static WebElement materialCategoryCategoryBasedFlow;
			
			@FindBy(id="ID_MC_MaterialCatSubmitAdd")
			public static WebElement materialCategoryAddSubmit;
			
			@FindBy(id="ID_MC_MaterialCatSubmitAdd")
			public static WebElement materialCategoryRefresh;
			
			@FindBy(id="ID_MC_MaterialCatSubmitEdit")
			public static WebElement materialCategoryEditSubmit;
			
			
			public static List list()
			{
				 List<WebElement> elements=new ArrayList<WebElement>();
				 
				 elements.add(masterIcon);
				 
				 elements.add(materialManagementIcon);
				 
				 elements.add(materialCategoryIcon);
				 
				 elements.add(materialCategoryAction);
				 
				 elements.add(materialCategoryAdd);
				 
				 elements.add(materialCategoryEdit);
				 
				 elements.add(materialCategoryDelete);
				 
				 elements.add(materialCategoryRefresh);
				 
				 elements.add(materialCategoryAddSubmit);
				 
				 elements.add(materialCategoryEditSubmit);
				 
				 return elements;
			}
			

				
	}
