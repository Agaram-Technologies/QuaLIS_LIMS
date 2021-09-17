package Config;

public class SubModuleName {
	

	public static String baseMaster="Base Master";
	
	
	public static String subModule(String screen)
	{
		String module="";
		
		if(screen.equals(ScreenName.storageCondition)||screen.equals(ScreenName.storageLocation)||screen.equals(ScreenName.unit)
				||screen.equals(ScreenName.sampleTestComments)||screen.equals(ScreenName.containerType))
		{
			module=baseMaster;
		}
		else
		{
			module="Undefined";
		}
		
		return module;
	}
}
