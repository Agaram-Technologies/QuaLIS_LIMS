package Contacts;

	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

import Config.ElementName;

	public class ElementClientGroup extends ElementName{

		
		
		//*[@id=""]/div[2]/div
		

		@FindBy(xpath = "//*[@id=\"ID_CGroup_ClientGroupHead\"]/div[2]/div")
		public static WebElement SearchIcon;
		
		@FindBy(xpath = "//*[@id=\"ID_CGroup_ClientGroupHead\"]/div[2]/div/i")
		public static WebElement SearchClose;
		

		@FindBy(xpath = "//*[@id=\"ID_CGroup_ClientGroupDesignBind\"]/div/div[1]/div[1]")
		public static List<WebElement> clientGroupList;
		
		

		@FindBy(xpath = "//*[@id=\"ID_CGroup_ClientGroupDesignBind\"]/div/div[1]/div[2]")
		public static List<WebElement> clientGroupDescriptionList;
		
		

		@FindBy(xpath = "//*[@id=\"ID_CGroup_ClientGroupDesignBind\"]/div/div[2]")
		public static List<WebElement> clientGroupCheckboxList;
		
		
		
		//Master
			@FindBy(id="iMenuID_1")
			public static WebElement masterIcon;
		    
		//Contacts	
			@FindBy(id="iModuleID_15")
			public static WebElement contactsIcon;

	//Client Group	
			@FindBy(id="iFormID_118")
			public static WebElement clientGroupIcon;
			
			@FindBy(xpath="//*[@id=\"ID_CGroup_ActionMenu\"]/a")
			public static WebElement clientGroupAction;
			
	//Add		
			@FindBy(id="ID_CGroup_ClientGroupAddbutton")
			public static WebElement clientGroupAdd;
			
			@FindBy(id="ID_CGroup_ClientGroupEditbutton")
			public static WebElement clientGroupEdit;
			
			@FindBy(id="ID_CGroup_ClientGroupDeletebutton")
			public static WebElement clientGroupDelete;

			@FindBy(id="ID_CGroup_ClientGroupName")
			public static WebElement clientGroup;

			@FindBy(id="ID_CGroup_ClientGroupDesc")
			public static WebElement clientGroupDescription;

			@FindBy(id="ID_CGroup_ClientGroupADDSubmit")
			public static WebElement clientGroupAddSubmit;
			
			@FindBy(id="ID_CGroup_ClientGroupEditSubmit")
			public static WebElement clientGroupEditSubmit;
					
			@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
			public static WebElement homeIcon;	
			
			@FindBy(id = "ID_CGroup_ClientGroup")
			public static WebElement clientGroupTabIcon;
						
			public static HashMap<String,WebElement> element()
			{
				HashMap<String,WebElement> element=new HashMap<String, WebElement>();
					
				element.put(module, masterIcon);
				 
				element.put(subModule, contactsIcon);
				 
				element.put(screen, clientGroupIcon);
				 
				element.put(action, clientGroupAction);
				 
				element.put(add,clientGroupAdd );
				
				element.put(edit, clientGroupEdit);
				 
				element.put(delete,clientGroupDelete);
				 
				element.put(nameValue, clientGroup);
				 
				element.put(descriptionValue, clientGroupDescription);
				 
				element.put(addSubmitButton, clientGroupAddSubmit);
					
				element.put(editSubmitButton,clientGroupEditSubmit);
				
				element.put(tabHeader, clientGroupTabIcon);
				
				element.put(home, homeIcon);
				
				return element;
			}
			
			


			public static HashMap<String, List<WebElement>> list()
			{
				 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
				
				 elements.put(nameList, clientGroupList);
				 
				 elements.put(descriptionList, clientGroupDescriptionList);
				 
				 elements.put(checkBoxList, clientGroupCheckboxList);
				 
				return elements;
			}
			
			
			
			
			
			
			
			
			
			
			
			

	 }