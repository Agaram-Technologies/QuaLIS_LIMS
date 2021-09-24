package Utility;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;


import org.apache.commons.collections4.map.HashedMap; 

public class ResultOutput
{
	public static void info(HashMap<String, String> output,String className,String outputTerm,String result) throws URISyntaxException, IOException
	{
		BasicOperation.screenshot(result);

		System.out.println(result);
			
		QuaLISLog.info(className, result);
		
		output.put(outputTerm, result);

	}
	
	public static void error(HashMap<String, String> output,String className,String outputTerm,String result) throws URISyntaxException, IOException
	{
		BasicOperation.screenshot(result);

		System.out.println(result);
			
		QuaLISLog.error(className, result);
		
		output.put(outputTerm, result);

	}
}
