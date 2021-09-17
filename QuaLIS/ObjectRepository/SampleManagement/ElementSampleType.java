package SampleManagement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementSampleType {
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	

	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMastergetdiv\"]/div/div[1]/div[1]/p")
	public static List<WebElement> sampleTypeSampleCategoryList;
	
	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMastergetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> sampleTypeList;


	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMastergetdiv\"]/div/div[1]/div[3]/p")
	public static List<WebElement> sampleTypeDescriptionList;


	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMastergetdiv\"]/div/div[1]/div[4]/p")
	public static List<WebElement> sampleTypeCheckboxList;

	
	


	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMasterHeaderdiv\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_SAM_SampleMasterHeaderdiv\"]/div[2]/div/i")
	public static WebElement searchClose;
	

	

	@FindBy(id = "iModuleID_14")
	public static WebElement sampleManagementIcon;
	

	@FindBy(id = "iFormID_39")
	public static WebElement sampleTypeIcon;


	@FindBy(xpath = "//*[@id='ID_SAM_SampleTabs']/div[2]/a")
	public static WebElement sampleTypeAction;

	@FindBy(id = "ID_SAM_SampleAddbutton")
	public static WebElement sampleTypeAdd;

	@FindBy(id = "ID_SAM_SampleEditbutton")
	public static WebElement sampleTypeEdit;

	@FindBy(id = "ID_SAM_SampleDeletebutton")
	public static WebElement sampleTypeDelete;

	@FindBy(id = "ID_SAM_SampleRefresh")
	public static WebElement sampleTypeRefresh;

	@FindBy(id = "ID_SAM_SampleSetDefault")
	public static WebElement sampleTypeSetDefault;
	
	
	@FindBy(id="ID_SAM_SampleCategory")
	public static WebElement sampleCategory;
                   
  

	@FindBy(id = "ID_SAM_SampleName")
	public static WebElement sampleType;

	@FindBy(id = "ID_SAM_SampleDescription")
	public static WebElement sampleTypeDescription;

	@FindBy(id = "ID_SAM_SampleADDSubmit")
	public static WebElement sampleTypeAddSubmit;

	@FindBy(id = "ID_SAM_SampleCancel")
	public static WebElement sampleTypeAddCancel;

	@FindBy(id = "ID_SAM_SampleEditSubmit")
	public static WebElement sampleTypeEditSubmit;

	@FindBy(id = "ID_SAM_SampleCancel")
	public static WebElement sampleTypeEditCancel;

	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(sampleManagementIcon);
		 
		 aa.add(sampleTypeIcon);
		 
		 aa.add(sampleTypeAction);
		 
		 aa.add(sampleTypeAdd);
		 
		 aa.add(sampleTypeEdit);
		 
		 aa.add(sampleTypeDelete);
		 
		 return aa;
	}
	


}
