package MaterialManagement;

import org.openqa.selenium.support.PageFactory;

import BaseMaster.ElementUnit;
import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageMaterialCategory extends BrowserOperation {
	
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialCategory.class);
		
		Functional.withoutEditAuditTrail(ElementMaterialCategory.list());
		
	}
	
	
}
