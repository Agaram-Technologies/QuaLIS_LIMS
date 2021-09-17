package Utility;

import java.io.File;
import java.io.IOException;

public class FileHandling 
{
	public static boolean createFolder(String location)
	{
		boolean exist=false;
		
		File file = new File(location);
		
		if(file.exists()==false)
		{
			file.mkdir();
		}
		else
		{
			exist=true;
		}
		
		return exist;
		
	}
	
	public static boolean createFile(String location) throws IOException
	{
		boolean exist=false;
		
		File file = new File(location);
		
		if(file.exists()==false)
		{
			file.createNewFile();
		}
		else
		{
			exist=true;
		}
		
		return exist;
	}
}
