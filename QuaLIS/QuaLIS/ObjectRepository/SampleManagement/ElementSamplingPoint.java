package SampleManagement;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementSamplingPoint {
	
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;
	
	
	/*
	@FindBy(id = "ID_SP_SamplingPort")
	public static WebElement samplingPortTabIcon;
	*/
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMastergetdiv\"]/div/div[1]/div[1]/p")
	public static List<WebElement> sampleSiteList;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMastergetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> sampleTypeList;


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMastergetdiv\"]/div/div[1]/div[3]/p")
	public static List<WebElement> samplingPointDescriptionList;


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMastergetdiv\"]/div/div[1]/div[4]/p")
	public static List<WebElement> samplingPointCheckboxList;

	
	


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMasterHeaderdiv\"]/div[2]/div")
	public static WebElement samplingPointSearchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMasterHeaderdiv\"]/div[2]/div/i")
	public static WebElement samplingPointSearchClose;
	

	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointMastergetdiv_Data\"]")
	public static WebElement samplingPointSearch;
	

	@FindBy(id = "iModuleID_14")
	public static WebElement sampleManagementIcon;
	

	@FindBy(id = "iFormID_1106")
	public static WebElement samplingPointIcon;

	@FindBy(id = "ID_SP_SampingPoint")
	public static WebElement samplingPointTabIcon;


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointTabs\"]/div[2]/a")
	public static WebElement samplingPointAction;

	@FindBy(id = "ID_SP_SamplingPointAddbutton")
	public static WebElement samplingPointAdd;

	@FindBy(id = "ID_SP_SamplingPointEditbutton")
	public static WebElement samplingPointEdit;

	@FindBy(id = "ID_SP_SamplingPointDeletebutton")
	public static WebElement samplingPointDelete;

	@FindBy(id = "ID_SP_SamplingPointRefresh")
	public static WebElement samplingPointRefresh;

	
	@FindBy(id="ID_SamplesiteName")
	public static WebElement samplingSite;
                   
  

	@FindBy(id = "ID_SAM_SampleType")
	public static WebElement sampleType;

	@FindBy(id = "ID_SamplingpointDescription")
	public static WebElement samplingPointDescription;

	@FindBy(id = "ID_SAM_SamplingPointADDSubmit")
	public static WebElement samplingPointAddSubmit;

	@FindBy(id = "ID_SAM_SamplingPointCancel")
	public static WebElement samplingPointAddCancel;

	@FindBy(id = "ID_SAM_SamplingPointEditSubmit")
	public static WebElement samplingPointEditSubmit;

	@FindBy(id = "ID_SAM_SamplingPointCancel")
	public static WebElement samplingPointEditCancel;
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl[1]/dt")
	public static WebElement samplingPointSideViewSamplingPortTerm;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl[2]/dt")
	public static WebElement samplingPointSideViewLocationTerm;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl[1]/dd")
	public static WebElement samplingPointSideViewSamplingPortDescription;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl[2]/dd")
	public static WebElement samplingPointSideViewLocationDescription;	
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl/dd")
	public static List<WebElement> samplingPointSideViewTermList;
	
	@FindBy(xpath = "//*[@id=\"ID_InsideDiv_10001_10001_0\"]/dl/dd")
	public static List<WebElement> samplingPointSideViewDescriptionList;	
	
	
	

	@FindBy(id = "ID_SP_SamplingPort")
	public static WebElement samplingPortTabIcon;


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPointTabs\"]/div[2]/a")
	public static WebElement samplingPortAction;

	@FindBy(id = "ID_SP_SamplingPortAddbutton")
	public static WebElement samplingPortAdd;

	@FindBy(id = "ID_SP_SamplingPortEditbutton")
	public static WebElement samplingPortEdit;

	@FindBy(id = "ID_SP_SamplingPortDeletebutton")
	public static WebElement samplingPortDelete;

	@FindBy(id = "ID_SP_SamplingPortRefresh")
	public static WebElement samplingPortRefresh;

	@FindBy(id = "ID_SampleportName")
	public static WebElement samplingPort;

	@FindBy(id = "ID_Sampleportlocation")
	public static WebElement location;

	
	

	@FindBy(id = "ID_SAM_SamplingPortADDSubmit")
	public static WebElement samplingPortAddSubmit;

	@FindBy(id = "ID_SAM_SampleCancel")
	public static WebElement samplingPortAddCancel;

	@FindBy(id = "ID_SAM_SampleEditSubmit")
	public static WebElement samplingPortEditSubmit;

	@FindBy(id = "ID_SAM_SamplingPortCancel")
	public static WebElement samplingPortEditCancel;

	
	//*[@id="ID_SP_SamplingPortMastergetdiv"]

	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortMastergetdiv\"]/div/div[1]/div[1]/p")
	public static List<WebElement> samplingPortList;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortMastergetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> locationList;

	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortMastergetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> samplingPortCheckboxList;
	//*[@id="ID_SP_SamplingPortHeaderdiv"]/div[2]/div


	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortHeaderdiv\"]/div[2]/div")
	public static WebElement samplingPortSearchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortHeaderdiv\"]/div[2]/div/i")
	public static WebElement samplingPortSearchClose;
	
	@FindBy(xpath = "//*[@id=\"ID_SP_SamplingPortMastergetdiv_Data\"]")
	public static WebElement samplingPortSearch;
	
	
	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(sampleManagementIcon);
		 
		 aa.add(samplingPointIcon);
		 
		 aa.add(samplingPointAction);
		 
		 aa.add(samplingPointAdd);
		 
		 aa.add(samplingPointEdit);
		 
		 aa.add(samplingPointDelete);
		 
		 return aa;
	}
	
	
	
	
	


}
