package Utility;

import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	
	   static Logger logger = Logger.getLogger(Log.class);

	    public static void main(String[] args) throws URISyntaxException
	    {    
	    	
	        String jarPath = Log.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
	        
	      	String jar=jarPath.substring(0,jarPath.length()-4);
	    	
	    	try {
	    		PropertyConfigurator.configure("Configuration//Config//config.properties");
				
			} catch (Exception e) {
				PropertyConfigurator.configure(jar+"//Config//config.properties");
			} 
	    	
	       

	    }


}
