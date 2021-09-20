package TestManagement;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Config.ElementName;
import FlowMethod.MasterMethod;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageMethodCategory extends BrowserOperation {
	
	public static void methodCategoryAddAllField(HashMap <String, String> value) throws InterruptedException
	{/*
		driver.findElement(By.id("iMenuID_1")).click();	
		
		
		driver.findElement(By.id("iModuleID_5")).click();	
		
		driver.findElement(By.id("iFormID_21")).click();	
		
		driver.findElement(By.id("ID_MC_MethodCategory")).click();	
		
		BasicOperation.exception(driver.findElement(By.xpath("//*[@id='ID_MC_ActionMenu']/a")));
		
		driver.findElement(By.id("ID_MC_MethodCategoryAddbutton")).click();	
		
		
		
		BasicOperation.exception(driver.findElement(By.id("ID_MC_MethodCategoryName")));
				
		driver.findElement(By.id("ID_MC_MethodCategoryName")).sendKeys(name);
		
		driver.findElement(By.id("ID_MC_MethodCategoryDesc")).sendKeys(description);
		
		
		driver.findElement(By.id("ID_MC_MethodCategoryADDSubmit")).click();	
		
		
	
		BasicOperation.wait(driver.findElement(By.xpath("//*[@id='ID_MC_ActionMenu']/a")));
		
		driver.findElement(By.xpath("//*[@id=\"MenuTree\"]/li[1]/a")).click();	
		

		
		
		driver.findElement(By.id("iModuleID_5")).click();	
	
		driver.findElement(By.id("iMenuID_1")).click();	
		
		*/PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionAdd.addAllField(value, ElementMethodCategory.element());
		
	}
	
	public static void methodCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementMethodCategory.element());
	}
/*	
	public static void methodCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editName(value, ElementMethodCategory.element(), ElementMethodCategory.list());
		
	}
	
	public static void methodCategoryEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editDescription(value, ElementMethodCategory.element(), ElementMethodCategory.list());
	}
	
	public static void methodCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementMethodCategory.element(), ElementMethodCategory.list());
	}
	
	public static void methodCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementMethodCategory.element(), ElementMethodCategory.list());
	}
	
	
	
	public static void methodCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionDelete.delete(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
	}
	
	public static void methodCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionDelete.deleteAll(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
	}
	
	public static void methodCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionDelete.deleteMandatory(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
	}*/

}
