package Settings;

public class RegistrationTypeDetail 
{
	public static String registrationTypeInstrument="Instrument Samples";
	
	public static String registrationTypeInstrumentIDS="IDS_ROUTINESAMPLE";
	
	public static String registrationSubTypeInstrument="Instrument";
	
	public static String registrationSubTypeInstrumentIDS="IDS_ROUTINESAMPLE";

	public static String registrationTypeMaterial="Material";
	
	public static String registrationTypeMaterialIDS="Material_ids";
	
	public static String registrationSubTypeMaterial="Material";
	
	public static String registrationSubTypeMaterialIDS="Material_Ds";
		
	public static String registrationTypeDomnicaRoutine="Routine Sample";
	
	public static String registrationTypeDomnicaRoutineIDS="IDS_ROUTINESAMPLE";
	
	public static String registrationSubTypeDomnicaRoutine="Routine Sample";
	
	public static String registrationSubTypeDomnicaRoutineIDS="IDS_ROUTINESAMPLE";

	public static String registrationTypeHylandsPurifiedWater="Purified Water";
	
	public static String registrationTypeHylandsPurifiedWaterIDS="IDS_ROUTINESAMPLE";
	
	public static String registrationSubTypeHylandsPurifiedWater="Purified Water";
	
	public static String registrationSubTypeHylandsPurifiedWaterIDS="Purified Water";
	
	public static String registrationTypeHylandsRawMaterial="Raw Material";
	
	public static String registrationTypeHylandsRawMaterialIDS="IDS_ROUTINESAMPLE";
	
	public static String registrationSubTypeHylandsRawMaterial="Raw Material";
	
	public static String registrationSubTypeHylandsRawMaterialIDS="Raw Material";

	public static String registrationTypeHylandsIntermediate="Intermediate";
	
	public static String registrationTypeHylandsIntermediateIDS="Intermediate";
	
	public static String registrationSubTypeHylandsIntermediate="Intermediate";
	
	public static String registrationSubTypeHylandsIntermediateIDS="Intermediate";

	public static String registrationTypeHylandsBulkProduct="Bulk Product";
	
	public static String registrationTypeHylandsBulkProductIDS="Bulk Product";
	
	public static String registrationSubTypeHylandsBulkProduct="Bulk Product";
	
	public static String registrationSubTypeHylandsBulkProductIDS="Bulk Product";

	public static String registrationTypeHylandsFinishedGoods="Finished Goods";
	
	public static String registrationTypeHylandsFinishedGoodsIDS="Finished Goods";
	
	public static String registrationSubTypeHylandsFinishedGoods="Finished Goods";
	
	public static String registrationSubTypeHylandsFinishedGoodsIDS="Finished Goods";
	
	public static String registrationTypeHylandsStabilityStudies="Stability Studies";
	
	public static String registrationTypeHylandsStabilityStudiesIDS="Stability Studies";
	
	public static String registrationSubTypeHylandsStabilityStudies="Stability Studies";
	
	public static String registrationSubTypeHylandsStabilityStudiesIDS="Stability Studies";
	
	public static String registrationTypeHylandsExternallyManufactured="Externally Manufactured";
	
	public static String registrationTypeHylandsExternallyManufacturedIDS="Externally Manufactured";
	
	public static String registrationSubTypeHylandsExternallyManufactured="Externally Manufactured";
	
	public static String registrationSubTypeHylandsExternallyManufacturedIDS="Externally Manufactured";
	
	
	
	
	
	public static  String registrationType(String registrationSubType)
	{
		String registrationType="";
		
		
		
		if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine))
		{
			registrationType=RegistrationTypeDetail.registrationTypeDomnicaRoutine;
		}
	    else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeInstrument))
		{
			registrationType=RegistrationTypeDetail.registrationTypeInstrument;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeMaterial))
		{
			registrationType=RegistrationTypeDetail.registrationTypeMaterial;
		}
	
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsPurifiedWater;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsRawMaterial;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsIntermediate;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsBulkProduct;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsStabilityStudies;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured))
		{
			registrationType=RegistrationTypeDetail.registrationTypeHylandsExternallyManufactured;
		}
		
	
	
	
		return registrationType;
	}
	
	public static  String registrationTypeIDS(String registrationSubType)
	{
		String registrationTypeIDS="";
		
		if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeDomnicaRoutineIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsPurifiedWaterIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsRawMaterialIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsIntermediateIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsBulkProductIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsStabilityStudiesIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeHylandsExternallyManufacturedIDS;
		}
	
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeInstrument))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeInstrumentIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeMaterial))
		{
			registrationTypeIDS=RegistrationTypeDetail.registrationTypeMaterialIDS;
		}
	
		return registrationTypeIDS;
	}

	
	public static  String registrationSubTypeIDS(String registrationSubType)
	{
		String registrationSubTypeIDS="";
		
		if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeDomnicaRoutineIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWater))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsPurifiedWaterIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsRawMaterial))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsRawMaterialIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsIntermediate))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsIntermediateIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsBulkProduct))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsBulkProductIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudies))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsStabilityStudiesIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufactured))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeHylandsExternallyManufacturedIDS;
		}
	
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeInstrument))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeInstrumentIDS;
		}
		else if(registrationSubType.equals(RegistrationTypeDetail.registrationSubTypeMaterial))
		{
			registrationSubTypeIDS=RegistrationTypeDetail.registrationSubTypeMaterialIDS;
		}
	
		return registrationSubTypeIDS;
	}

}
