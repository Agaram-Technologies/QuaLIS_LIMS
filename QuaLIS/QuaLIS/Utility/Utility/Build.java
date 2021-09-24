package Utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Properties;


import Config.Config;

public class Build extends Config{
	
	
	public static void main(String[] args) throws URISyntaxException, IOException
	{
		preCondition();
	}
	
	public static void preCondition() throws URISyntaxException, IOException
	{
		Config.configProperties();
			
		reportFolderName=testOutputFolderName+"\\"+reportFolderName;
				
		screenshotFolderName=testOutputFolderName+"\\"+screenshotFolderName;
		
		logFolderName=testOutputFolderName+"\\"+logFolderName;
		
		excelReportFolderName=reportFolderName+"\\"+excelReportFolderName;
		
		extentReportFolderName=reportFolderName+"\\"+extentReportFolderName;
		
		FileHandling.createFolder(testOutputFolderName);
		
		FileHandling.createFolder(reportFolderName);
		
		FileHandling.createFolder(screenshotFolderName);
		
		FileHandling.createFolder(logFolderName);
		
		FileHandling.createFolder(excelReportFolderName);
		
		FileHandling.createFolder(extentReportFolderName);
		
		QuaLISLog.info(Build.class.getName(), "All Pre Requisite folder is created");
	}

}
