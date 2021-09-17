package BaseMaster;

import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageSampleTestComments extends BrowserOperation{
	
	public static void twoFieldTestCase() throws InterruptedException
	{
	TestCoverageSampleTestComments.sampleTestCommentsAddAllField(TestDataHylands.sampleTestComments());
	
	TestCoverageSampleTestComments.sampleTestCommentsDeleteAllField(TestDataHylands.sampleTestComments());		
	
	TestCoverageSampleTestComments.sampleTestCommentsAddMandatoryField(TestDataHylands.sampleTestComments());
	
	TestCoverageSampleTestComments.sampleTestCommentsDeleteMandatoryField(TestDataHylands.sampleTestComments());
	
	TestCoverageSampleTestComments.sampleTestCommentsAddAllField(TestDataHylands.sampleTestComments());
	
	TestCoverageSampleTestComments.sampleTestCommentsEditName(TestDataHylands.sampleTestComments());
	
	// Description value to value
	TestCoverageSampleTestComments.sampleTestCommentsEditDescription(TestDataHylands.sampleTestComments());
	
	// Description value to null
	TestCoverageSampleTestComments.sampleTestCommentsEditDescriptionValueToNull(TestDataHylands.sampleTestComments());
			
	// Description null to value
	TestCoverageSampleTestComments.sampleTestCommentsEditDescriptionNullToValue(TestDataHylands.sampleTestComments());
		
	
	TestCoverageSampleTestComments.sampleTestCommentsDeleteAll(TestDataHylands.sampleTestComments());	
	}
		

	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		 boolean screen=Function.preCondition( ElementSampleTestComments.element());
		
		return screen;
	}
	
	
	
	public static void sampleTestCommentsAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
			
		FunctionAdd.addAllField(value, ElementSampleTestComments.element());
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
	
	public static void sampleTestCommentsEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleTestComments.class);
		
		FunctionEdit.editDescription(value, ElementSampleTestComments.element(), ElementSampleTestComments.list());
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
