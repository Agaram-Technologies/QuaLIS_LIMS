package Utility;

import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class fileInput {
	
	
	public static void file() throws IOException
	{
		FileInputStream fis = new FileInputStream("Configuration//Config//TestCase.properties");

		Properties properties = new Properties();

		properties.load(fis);
		
		
		
		File file=new File("");
		
		
		
	}

}
