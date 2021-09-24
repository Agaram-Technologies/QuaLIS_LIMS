package Utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import Config.Config;
public class QuaLISLog extends Config{
	
	 
	
	public static void info(String className, String info) throws URISyntaxException, IOException
	{
		 configProperties();
		
		 Logger logger = Logger.getLogger(className);
		 
		 PropertyConfigurator.configure(limsProperties);
    	 
		 logger.info(info);
			
	}
	
	
	public static void error(String className, String error) throws URISyntaxException, IOException
	{
		
		 configProperties();

		
		Logger logger = Logger.getLogger(className);
		 
		 PropertyConfigurator.configure(limsProperties);
    	 
		 logger.error(error);
			
	}
	

	public static void main(String[] args) throws URISyntaxException, IOException
	{
		
		for(int i=0; i<10; i++)
		{
			QuaLISLog.error(i+"",i+""+"Dddddddd");		
		}
		
	}

}
