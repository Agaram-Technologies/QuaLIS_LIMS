package Test;

import java.io.IOException;
import java.net.URISyntaxException;

import Utility.BrowserOperation;

public class Test_A 
{
	
	public static void main(String[] args) throws URISyntaxException, IOException
	{
		preCondition();
	}

	
	public static void preCondition()
	{		
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
        System.out.println("Current Method Execution Name Using StackTraceElement - " +
            stackTraceElements[0].getMethodName());}
	
	public static void postCondition()
	{
		
	}
	
	public static void test()
	{
		
	}
}
