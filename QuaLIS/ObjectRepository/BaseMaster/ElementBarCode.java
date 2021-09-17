package BaseMaster;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementBarCode {
	
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;

	@FindBy(id = "iFormID_108")
	public static WebElement barCodeIcon;
	
	@FindBy(xpath = "//*[@id='ID_BARCODE_ActionMenu']/a")
	public static WebElement barCodeAction;

	@FindBy(id = "ID_BARCODE_Addbutton")
	public static WebElement barCodeAdd ;

	@FindBy(id = "ID_BARCODE_Editbutton")
	public static WebElement barCodeEdit;
	
	@FindBy(id = "ID_BARCODE_Deletebutton")
	public static WebElement barCodeDelete;

	@FindBy(id = "ID_BARCODE_Refreshbutton")
	public static WebElement barCodeRefresh;	

	@FindBy(id = "ID_BARCODE_AddBarcodeName")
	public static WebElement barCode ;
	
	
	@FindBy(id = "ID_BARCODE_QueryCombo")
	public static WebElement barCodeQuery ;

	@FindBy(id = "ID_BARCODE_FileuploadBtn")
	public static WebElement barCodeFileIcon;
	
	@FindBy(id = "ID_BARCODE_ControlTypeCombo ")
	public static WebElement barCodeControlType;

	@FindBy(id = "ID_BARCODE_AddDescription")
	public static WebElement barCodeDescription;	

	@FindBy(id = "ID_BARCODEADDSubmit")
	public static WebElement barCodeAddSubmit;
	

	@FindBy(id = "ID_BARCODE_Cancel")
	public static WebElement barCodeAddCancel;
	

	
	
	
	
	@FindBy(xpath = "//*[@id=\"ID_BARCODE_DesignBind\"]/div")
	public static List<WebElement> barCodeList;
	
	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(baseMasterIcon);
		 
		 aa.add(barCodeIcon);
		 
		 aa.add(barCodeAction);
		 
		 aa.add(barCodeAdd);
		 
		 aa.add(barCodeEdit);
		 
		 aa.add(barCodeDelete);
		 
		 return aa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}