package Config;

public class RegistrationDetail {
	
	
	public static String purifiedWater="Purified Water";
	
	public static String hpclRoutine="Routine";
	
	public static String bulkProduct="Bulk Product";
	
	public static String rawMaterial="Raw Material";
	
	public static String intermediate="Intermediate";
	
	public static String finishedGoods="Finished Goods";
	
	public static String externallyManufactured="Externally Manufactured";
	
	public static String stabilityStudies="Stability Studies";
	

	public static String requestTest="Request Test";
	
	public static String claimTest="Claim Test";
	
	public static String specialTest="Special Test";
	
	public static String requestTestKorean="시험 요청";
	
	public static String claimTestKorean="클레임 검사";
	
	public static String specialTestKorean="특수 검사";
	
	
	
	
	public static String registrationType(String registrationType)
	{
		String registrationSubType=null;
		
		if(registrationType.equals("Bulk Product"))
		{
			registrationSubType="Bulk Product";
		}
		else if(registrationType.equals("Purified Water"))
		{
			registrationSubType="Purified Water";
		}
		
		else if(registrationType.equals("Stability Studies"))
		{
			registrationSubType="Stability Studies";
		}
		
		else if(registrationType.equals("Externally Manufactured"))
		{
			registrationSubType="Externally Manufactured";
		}
		else if(registrationType.equals("Finished Goods"))
		{
			registrationSubType="Finished Goods";
		}
		
		else if(registrationType.equals("Raw Material"))
		{
			registrationSubType="Raw Material";
		}
		
		else if(registrationType.equals("Intermediate"))
		{
			registrationSubType="Intermediate";
		}
		
		else if(registrationType.equals("Request Test"))
		{
			registrationSubType="Request Test";
		}
		
		else if(registrationType.equals("Claim Test"))
		{
			registrationSubType="Claim Test";
		}
		
		else if(registrationType.equals("Special Test"))
		{
			registrationSubType="Special Test";
		}
		
		else if(registrationType.equals("Finished Goods"))
		{
			registrationSubType="Finished Goods";
		}
		
		else if(registrationType.equals("Externally Manufactured"))
		{
			registrationSubType="Externally Manufactured";
		}
		else if(registrationType.equals("Stability Studies"))
		{
			registrationSubType="Stability Studies";
		}
		
		else if(registrationType.equals(hpclRoutine))
		{
			registrationSubType="Routine";
		}
		else if(registrationType.equals(claimTestKorean))
		{
			registrationSubType=claimTestKorean;
		}
		else if(registrationType.equals(requestTestKorean))
		{
			registrationSubType=requestTestKorean;
		}
		
		else if(registrationType.equals(specialTestKorean))
		{
			registrationSubType=specialTestKorean;
		}
		
		
		
		return registrationSubType;
	}
	
	
	public static String registrationCategory(String registrationSubType)
	{
		String registrationCategory="";
		
		if(registrationSubType.equals(RegistrationDetail.claimTestKorean)||registrationSubType.equals(RegistrationDetail.specialTestKorean)||registrationSubType.equals(RegistrationDetail.requestTestKorean))
		{
			registrationCategory="품목";
		}
		else 
		{
			registrationCategory="Product";		
		}
		
		
		return registrationCategory;
		
		
	
	}
	
	

}
