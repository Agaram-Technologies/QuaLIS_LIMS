package CompetenceManagement;

import java.util.HashMap;  
import org.openqa.selenium.support.PageFactory;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import java.io.IOException;
import java.net.URISyntaxException; 
import Flow.TestDataHylands; 
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation; 

public class TestCoverageTechnique extends BrowserOperation{
	


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageTechnique.techniqueAddAllField(TestDataHylands.technique());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageTechnique.techniqueDeleteAllField(TestDataHylands.technique());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageTechnique.techniqueAddMandatoryField(TestDataHylands.technique());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageTechnique.techniqueDeleteMandatoryField(TestDataHylands.technique());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageTechnique.techniqueAddAllField(TestDataHylands.technique());
			
			TestCoverageTechnique.techniqueEditName(TestDataHylands.technique());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageTechnique.techniqueEditDescriptionValueToValue(TestDataHylands.technique());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageTechnique.techniqueEditDescriptionValueToNull(TestDataHylands.technique());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageTechnique.techniqueEditDescriptionNullToValue(TestDataHylands.technique());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> techniqueAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementTechnique.class);
			
 		output=FunctionAdd.addAllField(value,ElementTechnique.menu(), ElementTechnique.element(),ElementTechnique.list());
	
		return output;
	
	}

	public static void techniqueEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementTechnique.element(), ElementTechnique.list());
	}
	
	public static void techniqueAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionAdd.addMandatoryField(value, ElementTechnique.element());
	}
	
	public static void techniqueEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionEdit.editName(value, ElementTechnique.element(), ElementTechnique.list());
	
		
		
	}
	 
	
	public static void techniqueEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementTechnique.element(), ElementTechnique.list());
	}
	
	public static void techniqueEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementTechnique.element(), ElementTechnique.list());
	}
	
	
	
	public static void techniqueDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionDelete.delete(value, ElementTechnique.element(), ElementTechnique.list());		
	}
	
	public static void techniqueDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionDelete.deleteAll(value, ElementTechnique.element(), ElementTechnique.list());		
	}
	
	public static void techniqueDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTechnique.class);
		
		FunctionDelete.deleteMandatory(value, ElementTechnique.element(), ElementTechnique.list());		
	}
	

	
	
	

}
