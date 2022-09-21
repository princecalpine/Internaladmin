package apipayload;

public class Payload {

	public static String AddPlace()
	{
		return "{\n" + 
				"  \"location\": {\n" + 
				"    \"lat\": -38.383494,\n" + 
				"    \"lng\": 33.427362\n" + 
				"  },\n" + 
				"  \"accuracy\": 50,\n" + 
				"  \"name\": \"Prince house\",\n" + 
				"  \"phone_number\": \"(+91) 949 693 3937\",\n" + 
				"  \"address\": \"29, side layout, Avanur\",\n" + 
				"  \"types\": [\n" + 
				"    \"shoe park\",\n" + 
				"    \"shop\"\n" + 
				"  ],\n" + 
				"  \"website\": \"https://rahulshettyacademy.com\",\n" + 
				"  \"language\": \"Malayalam\"\n" + 
				"}";
	}
}
