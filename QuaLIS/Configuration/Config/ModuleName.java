package Config;

public class ModuleName {
	
	public static String master="Master";
	
	public static String transaction="Transaction";
	

	public static String module(String screen)
	{
		String module="r";
		
		if(screen.equals(ScreenName.genericRegistration)||screen.equals(ScreenName.jobAllocation)||screen.equals(ScreenName.myJobs)
				||screen.equals(ScreenName.resultEntryBySample))
		{
			module=transaction;
		}
		else
		{
			module=master;
		}
		return module;
	}

}
