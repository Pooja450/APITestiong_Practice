package covid19Api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.utility;

public class TC_GetCountries extends utility{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="https://api.covid19api.com";
		RestAssured.basePath="/countries";
	}
	@Test
	public void Test1()
	{
		logger.info("Returns all the available countries and provinces, as well as the country slug for per country requests.");
		RequestSpecification request=RestAssured.given();
		Response response=request.request(Method.GET);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		logger.info("STOP");
		// Assert.assertEquals(response.getStatusCode(),get_status_code);
		
	}

	
}
