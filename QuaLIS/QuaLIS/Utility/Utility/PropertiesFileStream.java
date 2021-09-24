package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileStream {
	
	public static Properties withoutEditDeleteMasterExcel() throws IOException
	{

		FileInputStream fis = new FileInputStream("TestCase//Alert//ExcelWithoutSelect.properties");

		Properties properties = new Properties();

		properties.load(fis);

		return properties;
		
		//String driverName=properties.getProperty("browser");
	}

	
	public static Properties withoutEditDeleteMasterScreenshot() throws IOException
	{

		FileInputStream fis = new FileInputStream("TestCase//Alert//ScreenshotWithoutSelect.properties");

		Properties properties = new Properties();

		properties.load(fis);

		return properties;
		
		//String driverName=properties.getProperty("browser");
	}

}
