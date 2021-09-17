package Config;

import java.util.HashMap;

import Utility.BrowserOperation;

public class ScreenName extends BrowserOperation{
	
	public static HashMap<String, String> screen(String screen)
	{
		HashMap<String, String> menu=new HashMap<String, String>();
		
		menu.put(IconType.screen,screen);
		
		menu.put(IconType.subModule,SubModuleName.subModule(screen));
		
		menu.put(IconType.module,ModuleName.module(screen));
		 
		return menu;
	}
	
 
	
	public static String department="Department";
	
	public static String storageCondition="Storage Condition";
	
	public static String storageLocation="Storage Location";
	
	public static String containerType="Container Type";
	
	public static String unit="Unit";
	
	public static String sampleTestComments="Sample Test Comments";
	
	public static String genericRegistration="Generic Registration";
	
	public static String jobAllocation="Job Allocation";
	
	public static String myJobs="My Jobs";
		
	public static String resultEntryBySample="Result Entry By Sample";
	
/*	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	
	public static String designation="Designation";
	
	public static String department="Department";
	*/
	

}
