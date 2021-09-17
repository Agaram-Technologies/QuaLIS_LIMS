package Contacts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;


public class ElementSupplierCategory extends ElementName{
	

	

	@FindBy(xpath = "//*[@id=\"ID_SupCat_SupplierCategoryHeaderDesign\"]/div[2]/div")
	public static WebElement SearchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_SupCat_SupplierCategoryHeaderDesign\"]/div[2]/div/i")
	public static WebElement SearchClose;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SupCat_SupplierCategoryBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> supplierCategoryList;

	@FindBy(xpath = "//*[@id=\"ID_SupCat_SupplierCategoryBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> supplierCategoryDescriptionList;
	

	@FindBy(xpath = "//*[@id=\"ID_SupCat_SupplierCategoryBind\"]/div/div[2]")
	public static List<WebElement> supplierCategoryCheckboxList;
	


	
	@FindBy(id="ID_SupCat_SupplierCategoryEditbutton")
	public static WebElement supplierCategoryEdit;
	
	@FindBy(id="ID_SupCat_SupplierCategoryDeletebutton")
	public static WebElement supplierCategoryDelete;
	
	
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
		    
		//Contacts	
			@FindBy(id="iModuleID_15")
			public static WebElement contactsIcon;

	//Supplier Category	
		@FindBy(id="iFormID_47")
		public static WebElement supplierCategoryIcon;

		@FindBy(xpath="//*[@id=\"ID_SupCat_ActionMenu\"]/a")
		public static WebElement supplierCategoryAction;

	//Add	
		@FindBy(id="ID_SupCat_SupplierCategoryAddbutton")
		public static WebElement supplierCategoryAdd;

		@FindBy(id="ID_SupCat_SupplierCategoryName")
		public static WebElement supplierCategory;

		@FindBy(id="ID_SupCat_SupplierCategoryDesignDescription")
		public static WebElement supplierCategoryDescription;

		@FindBy(id="ID_SupCat_SupplierCategoryADDSubmit")
		public static WebElement supplierCategoryAddSubmit;

		@FindBy(id="ID_SupCat_SupplierCategoryEditSubmit")
		public static WebElement supplierCategoryEditSubmit;
		
		@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
		public static WebElement homeIcon;	
		
		@FindBy(id = "ID_SupCat_SupplierCategory")
		public static WebElement supplierCategoryTabIcon;
					
		public static HashMap<String,WebElement> element()
		{
			HashMap<String,WebElement> element=new HashMap<String, WebElement>();
				
			element.put(module, masterIcon);
			 
			element.put(subModule, contactsIcon);
			 
			element.put(screen, supplierCategoryIcon);
			 
			element.put(action, supplierCategoryAction);
			 
			element.put(add,supplierCategoryAdd );
			
			element.put(edit,supplierCategoryEdit);
			
			element.put(delete,supplierCategoryDelete);
			 
			element.put(nameValue, supplierCategory);
			 
			element.put(descriptionValue, supplierCategoryDescription);
			 
			element.put(addSubmitButton, supplierCategoryAddSubmit);
				
			element.put(editSubmitButton,supplierCategoryEditSubmit);
			
			element.put(tabHeader, supplierCategoryTabIcon);
			
			element.put(home, homeIcon);
			
			return element;
		}
		
		

		public static HashMap<String, List<WebElement>> list()
		{
			 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
			
			 elements.put(nameList, supplierCategoryList);
			 
			 elements.put(descriptionList, supplierCategoryDescriptionList);
			 
			 elements.put(checkBoxList, supplierCategoryCheckboxList);
			 
			return elements;
		}
		
		
		
		
		
		
		
	}