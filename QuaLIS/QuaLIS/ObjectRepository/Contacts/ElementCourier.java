package Contacts;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElementCourier {
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_CM_CourierHead\"]/div[2]/div")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_CM_CourierHead\"]/div[2]/div/i")
	public static WebElement searchClose;
	
	
	
	//*[@id=""]/div[2]/div
	
	

		@FindBy(id="iMenuID_1")
		public static WebElement masterIcon;
	    
	//Contacts	
		@FindBy(id="iModuleID_15")
		public static WebElement contactsIcon;

	//Courier	
		@FindBy(id="iFormID_49")
		public static WebElement courierIcon;

		@FindBy(className="TM_StaticActionIcon")
		public static WebElement courierAction;

	//Add	
		@FindBy(id="ID_CM_CourierAddbutton")
		public static WebElement courierAdd;

		@FindBy(id="ID_CM_CourierName")
		public static WebElement courier;

		@FindBy(id="ID_CM_ContactPerson")
		public static WebElement contactPerson;

		@FindBy(id="ID_CM_Address1")
		public static WebElement addressOne;

		@FindBy(id="ID_CM_Address2")
		public static WebElement courierAddressTwo;

		@FindBy(id="ID_CM_Address3")
		public static WebElement courierAddressThree;

		@FindBy(id="ID_CM_CountryName")
		public static WebElement courierCountry;

		@FindBy(id="ID_CM_PhoneNo")
		public static WebElement courierPhoneNumber;

		@FindBy(id="ID_CM_MobileNo")
		public static WebElement courierMobileNumber;

		@FindBy(id="ID_CM_Fax")
		public static WebElement courierFax;

		@FindBy(id="ID_CM_Email")
		public static WebElement courierEmail;

		@FindBy(id="ID_CM_CourierADDSubmit")
		public static WebElement courierAddSubmit;

	}