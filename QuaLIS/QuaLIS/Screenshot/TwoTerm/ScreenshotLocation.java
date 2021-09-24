package TwoTerm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;


import Utility.BrowserOperation;
import Utility.FileHandling;

public class ScreenshotLocation extends BrowserOperation
{
	public static String globalPath="";
	
	public static String testCoverageTwoField="TestCoverage Two Field";
	
	public static void globalPath() throws IOException
	{
		configProperties();
		
		globalPath=screenshot;
		
		FileHandling.createFolder(globalPath+testCoverageTwoField);
	}
	
	public static void testCoverageTwoFieldAddAllField() throws IOException
	{
		HashMap<String, String> output=new  HashMap<String, String> ();
		
		globalPath();
		
		output.put(ScreenshotName.expandModuleIcon, "expandModuleIcon");
		
		output.put(ScreenshotName.expandSubModuleIcon, "expandSubModuleIcon");
		
		output.put(ScreenshotName.screenIcon, "screenIcon");
		
		output.put(ScreenshotName.tabIcon, "tabIcon");
		
		output.put(ScreenshotName.actionButton, "actionButton");
		
		output.put(ScreenshotName.addPopup, "addPopup");
		
		output.put(ScreenshotName.enteredName, "enteredName");
		
		output.put(ScreenshotName.enteredDescription, "enteredDescription");
		
		output.put(ScreenshotName.afterAddGrid, "afterAddGrid");
		
		output.put(ScreenshotName.beforeAddGrid, "beforeAddGrid");
		
	}

















}
