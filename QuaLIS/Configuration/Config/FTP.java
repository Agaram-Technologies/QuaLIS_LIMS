package Config;

import java.util.HashMap;

public class FTP {
	
	
	
	public static String userName="userName";
	
	public static String hostName="hostName";
	
	public static String filePath="filePath";
	
	public static String passWord="passWord";
	
	public static String port="port";
	
	
	
	public static HashMap<String, String> ftp(String project)
	{
		
		String userName="agl78\\ate186";
		
		String hostName="agl78";
		
		String filePath=null;
		
		String passWord="agaram@123";
		
		String port=null;
		
		
		if(project==ProjectDetail.hylands)
		{
			filePath="D:\\FTP\\Hylands";
			
			port="75";
		}
		
		else if(project==ProjectDetail.hpcl)
		{

			filePath="D:\\FTP\\Hpcl";
			
			port="23";
		}
		
		
		HashMap<String, String> ftp=new HashMap<String , String>();
		
		ftp.put(FTP.userName, userName);
		
		ftp.put(FTP.passWord, passWord);
		
		ftp.put(FTP.filePath, filePath);
		
		ftp.put(FTP.hostName, hostName);
		
		ftp.put(FTP.port, port);
		
		
		
		return ftp;
		
	}

}
