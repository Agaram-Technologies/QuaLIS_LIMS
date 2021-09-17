package BaseMaster;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;
public class ElementSampleTestComments extends ElementName {



	@FindBy(xpath = "//*[@id=\"ID_STC_SamptestcommMasterHead\"]/div[2]/div")
	public static WebElement searchIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_STC_SamptestcommMasterHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	//*[@id=""]/div[2]/div
	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;
	
	@FindBy(id = "iFormID_133")
	public static WebElement sampleTestCommentsIcon;

	@FindBy(xpath = "//*[@id='ID_STC_SampTestActionMenu']/a")
	public static WebElement sampleTestCommentsAction;
	

	@FindBy(xpath = "//*[@id=\"ID_STC_SamptestcommDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement>  sampleTestCommentsList;
	


	@FindBy(xpath = "//*[@id=\"ID_STC_SamptestcommDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement>  sampleTestCommentsDescriptionList;
	

	@FindBy(xpath = "//*[@id=\"ID_STC_SamptestcommDataBind\"]/div/div[2]")
	public static List<WebElement>  sampleTestCommentsCheckboxList;
	
	
	
	@FindBy(id = "ID_STC_SampTestCommAddbutton")
	public static WebElement sampleTestCommentsAdd ;

	@FindBy(id = "ID_STC_SampTestCommEditbutton")
	public static WebElement sampleTestCommentsEdit;
	
	@FindBy(id = "ID_STC_SampTestCommDeletebutton")
	public static WebElement sampleTestCommentsDelete;

	@FindBy(id = "ID_STC_SampTestRefreshbutton")
	public static WebElement sampleTestCommentsRefresh;

	@FindBy(id = "ID_STC_SampTestImportbutton")
	public static WebElement sampleTestCommentsImport;
	
	@FindBy(id = "ID_STC_SampTestExportbutton")
	public static WebElement sampleTestCommentsExportPDF;
	
	@FindBy(id = "ID_STC_SampTestExportXLSbutton")
	public static WebElement storageConditionExportXLS;

	@FindBy(id = "ID_STC_SampTestcomName")
	public static WebElement sampleTestComments ;
	
	
	
	@FindBy(id = "ID_STC_SampTestcomDesc")
	public static WebElement sampleTestCommentsDescription;
	
	@FindBy(id = "ID_STC_SampTestSubmitAdd")
	public static WebElement sampleTestCommentsAddSubmit ;
	

	@FindBy(id = "ID_STC_SampTestCancel")
	public static WebElement sampleTestCommentsAddCancel;
	
	@FindBy(id = "ID_STC_SampTestSubmitEDIT")
	public static WebElement sampleTestCommentsEditSubmit;

	@FindBy(id = "ID_STC_SampTestCancel")
	public static WebElement sampleTestCommentsEditCancel;

	
	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
		
	@FindBy(id = "ID_STC_SAMPCOMMETEST")
	public static WebElement sampleTestCommentsTabIcon;
	
	
	public static HashMap<String,WebElement> element()
	{
		HashMap<String,WebElement> element=new HashMap<String, WebElement>();
		
		element.put(module, masterIcon);
		
		element.put(subModule, baseMasterIcon);
		
		element.put(screen, sampleTestCommentsIcon);
		
		element.put(action, sampleTestCommentsAction);
		
		element.put(add, sampleTestCommentsAdd);
		
		element.put(edit, sampleTestCommentsEdit);
		
		element.put(delete, sampleTestCommentsDelete);
		
		element.put(nameValue, sampleTestComments);
		
		element.put(descriptionValue, sampleTestCommentsDescription);
		
		element.put(addSubmitButton, sampleTestCommentsAddSubmit);
		
		element.put(editSubmitButton, sampleTestCommentsEditSubmit);
		
		element.put(tabHeader, sampleTestCommentsTabIcon);
		
		element.put(home, homeIcon);
			
		return element;
	}
	
	
	public static HashMap<String, List<WebElement>> list()
	{
		 HashMap<String,List<WebElement>> elements=new HashMap<String,List<WebElement>>();
		
		 elements.put(nameList, sampleTestCommentsList);
		 
		 elements.put(descriptionList, sampleTestCommentsDescriptionList);
		 
		 elements.put(checkBoxList, sampleTestCommentsCheckboxList);
		 
		return elements;
	}
		
	
}
