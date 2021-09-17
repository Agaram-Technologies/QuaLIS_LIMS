package Utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class QuaLISLog {
	
	static Logger logger = Logger.getLogger(QuaLISLog.class.getName());
	
	public static void info(String info) throws URISyntaxException, IOException
	{
		HashMap<String, String> output=new HashMap<String, String>();
		
        // Get path of the JAR file
        String jarPath = QuaLISLog.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
    
      	String jar=jarPath.substring(0,jarPath.length()-4);
		
      	try {
      		
      		System.out.println("before error");
    		PropertyConfigurator.configure("Configuration\\config\\config.properties");
    	                               
    		System.out.println("after error");
    		
    		
			
		} catch (Exception e) {
			
			System.out.println("exception path");
			PropertyConfigurator.configure(jar+"\\config\\config.properties");
		} 
	    
		logger.info(info);
			
	}
	
	
	public static void error(String error) throws URISyntaxException, IOException
	{
		HashMap<String, String> output=new HashMap<String, String>();
		
        // Get path of the JAR file
        String jarPath = QuaLISLog.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
    
      	String jar=jarPath.substring(0,jarPath.length()-4);
		
      	try {
      		
      		System.out.println("before error");
      		
      		PropertyConfigurator.configure(jar+"Config\\config.properties");
      		
    		PropertyConfigurator.configure("Configuration\\Config\\config.properties");
    	                               
    		System.out.println("after error");
    		
    		
			
		} catch (Exception e) {
			
			System.out.println("exception path");
			
		} 
		logger.error(error);
		
		
			
	}
	

	public static void main(String[] args) throws URISyntaxException, IOException {
		QuaLISLog.error("d");
		
	}

}
