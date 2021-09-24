package BaseMaster;

import java.util.HashMap; 

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

public class TestCoverageSampleTestComments extends BrowserOperation{
	
	
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageSampleTestComments.sampleTestCommentsAddAllField(TestDataHylands.sampleTestComments());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageSampleTestComments.sampleTestCommentsDeleteAllField(TestDataHylands.sampleTestComments());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageSampleTestComments.sampleTestCommentsAddMandatoryField(TestDataHylands.sampleTestComments());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageSampleTestComments.sampleTestCommentsDeleteMandatoryField(TestDataHylands.sampleTestComments());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageSampleTestComments.sampleTestCommentsAddAllField(TestDataHylands.sampleTestComments());
			
			TestCoverageSampleTestComments.sampleTestCommentsEditName(TestDataHylands.sampleTestComments());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageSampleTestComments.sampleTestCommentsEditDescriptionValueToValue(TestDataHylands.sampleTestComments());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageSampleTestComments.sampleTestCommentsEditDescriptionValueToNull(TestDataHylands.sampleTestComments());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageSampleTestComments.sampleTestCommentsEditDescriptionNullToValue(TestDataHylands.sampleTestComments());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> sampleTestCommentsAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementSampleTestComments.class);
			
 		output=FunctionAdd.addAllField(value,ElementSampleTestComments.menu(), ElementSampleTestComments.element(),ElementSampleTestComments.list());
	
		return output;
	
	}
 
	
	
	public static void sampleTestCommentsAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionAdd.addMandatoryField(value, ElementSampleTestComments.element());
	}
	
	public static void sampleTestCommentsEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionEdit.editName(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());
		
		
	}
	
	public static void sampleTestCommentsEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());
	}
	
	public static void sampleTestCommentsEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());
	}
	
	public static void sampleTestCommentsEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());
	}
	
	
	
	public static void sampleTestCommentsDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionDelete.delete(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());		
	}
	
	public static void sampleTestCommentsDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionDelete.deleteAll(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());		
	}
	
	public static void sampleTestCommentsDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionDelete.deleteMandatory(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());		
	}
	
	
	
	
/*
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		Functional.withoutEditAuditTrail(ElementSampleTestComments.list());
		
	}
	*/

}
