package Esign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementEsign {
	
	

	@FindBy(id="ID_S_txtAuditPopupPassID")
	public static WebElement EsignPassword;
	
 	@FindBy(id="ID_S_txtAuditPopupCommentID")
	public static WebElement EsignComments;

	
	@FindBy(id="txtstaticAuditPopupcheck")
    public static WebElement EsignCheckbox;
	
	

	@FindBy(id="staticbtnAuditPopupSubmit")
	public static WebElement EsignSubmit;
	
 	@FindBy(id="staticbtnAuditPopupCancel")
	public static WebElement EsignCancel;


}
