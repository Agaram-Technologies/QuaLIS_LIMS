package Contacts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementCountry {
	


	@FindBy(xpath="//*[@id=\"ID_Lims_AlertMsg_0\"]")
	public static WebElement countryAlert;
	
	
	@FindBy(xpath="//*[@id=\"ID_Lims_AlertMsg_0\"]/div/span/i")
	public static WebElement countryAlertClose;
	
	

	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_15")
	public static WebElement contactsIcon;

 	@FindBy(id="ID_BC_countryEDITSubmit")
	public static WebElement countryEditSubmit;
 	
	@FindBy(id="iFormID_5")
    public static WebElement countryIcon;
	
	@FindBy(xpath="//*[@id='ID_BC_ActionMenu']/a")
    public static WebElement countryAction;
	
	
	@FindBy(id="ID_BC_CountryAddbutton")
    public static WebElement countryAdd;
	
	@FindBy(id="ID_BC_CountryEditbutton")
    public static WebElement countryEdit;
	
	@FindBy(id="ID_BC_BCRefreshbutton")
    public static WebElement countryRefresh;
	
	@FindBy(id="ID_BC_CountryDeletebutton")
    public static WebElement countryDelete;
	
	@FindBy(id="ID_BC_CountryName")
    public static WebElement country;
	
	@FindBy(id="ID_BC_Countryabb")
    public static WebElement countryAbbreviation;
	
	@FindBy(id="ID_BC_Countrytwochar")
    public static WebElement countryTwoCharCode;
	
	@FindBy(id="ID_BC_Countrythreechr")
    public static WebElement countryThreeCharCode;
	
	@FindBy(id="ID_BC_countryADDSubmit")
    public static WebElement countryAddSubmit;
	
	
	@FindBy(xpath="//*[@id=\"ID_BC_CountryDesignBind\"]/div/div[1]/div[1]/p")
    public static List<WebElement> countryList;
	
	@FindBy(xpath="//*[@id=\"ID_BC_CountryDesignBind\"]/div/div[2]")
    public static List<WebElement> countryCheckboxList;
	
	
	
	
	@FindBy(xpath="//*[@id=\"ID_BC_CountryDesignBind\"]/div/div[1]/div[2]/p")
    public static List<WebElement> countryAbbreviationList;
	
	
	@FindBy(xpath="//*[@id=\"ID_BC_CountryDesignBind\"]/div/div[1]/div[3]/p")
    public static List<WebElement> countryTwoCharacterCodeList;
	
	@FindBy(xpath="//*[@id=\"ID_BC_CountryDesignBind\"]/div/div[1]/div[4]/p")
    public static List<WebElement> countryThreeCharacterCodeList;
	
	
	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(contactsIcon);
		 
		 aa.add(countryIcon);
		 
		 aa.add(countryAction);
		 
		 aa.add(countryAdd);
		 
		 aa.add(countryEdit);
		 
		 aa.add(countryDelete);
		 
		 aa.add(countryDelete);
		 
		 aa.add(countryDelete);
		 
		 aa.add(countryDelete);
		 
		 aa.add(countryDelete);
		 
		 return aa;
	}
	
	
	
	
	
}
