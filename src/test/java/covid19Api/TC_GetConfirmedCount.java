package covid19Api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.utility;

public class TC_GetConfirmedCount extends utility{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="https://api.covid19api.com";
		RestAssured.basePath="live/country/south-africa/status/confirmed";
	}
	@Test
	public void Test1()
	{
		logger.info("Returns all the available countries confirmed cases");
		RequestSpecification request=RestAssured.given();
		Response response=request.request(Method.GET);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		logger.info("STOP");
		// Assert.assertEquals(response.getStatusCode(),get_status_code);
		
	}

	

	
}
