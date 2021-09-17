package Utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Properties;

public class Build {
	
	public static void main(String[] args) throws URISyntaxException, IOException 
	{
		
		BrowserOperation.launchLIMS();
				
		
	}
	
	public static void preCondition() throws URISyntaxException, IOException
	{
		HashMap<String, String> output=new HashMap<String, String>();
		
        // Get path of the JAR file
        String jarPath = Build.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
    
      	String jar=jarPath.substring(0,jarPath.length()-4);
		
		FileInputStream fis = null;
		
		try {
			
			String propertyFile=jar+"\\config\\config.properties";
			
			fis = new FileInputStream(propertyFile);
			
			System.out.println("config file path is "+propertyFile);
			
			
			
		} 
		catch (Exception e) 
		{
			
					
			String propertyFile="Configuration\\config\\config.properties";
			
			try {
				fis = new FileInputStream(propertyFile);
				
				System.out.println("config file path is "+propertyFile);
				
			} catch (Exception e2) {
				
				System.out.println("Unable to locate the config.properties file");
				// TODO: handle exception
			}
			
			
			
			
			
		}
	
		

		Properties properties = new Properties();

		properties.load(fis);		
		
		String path=properties.getProperty("BuildPath");
		
		String log=properties.getProperty("logFolder");
		
		
		try 
		{
			boolean logFolder=FileHandling.createFolder(path+"\\"+log);
			
			
			if(logFolder==false)
			{
				String result="Created Log folder as "+log;
				
				QuaLISLog.info(result);
				
								
				System.out.println(result);
			}
			else
			{
				String result=log+" Folder is already available, So New folder is not created";
				
				QuaLISLog.info(result);
				
				System.out.println(result);
			}
			
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to access the Build path");
		}
		
	
		
	
		
		
		
	}

}
