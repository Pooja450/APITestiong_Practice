package covid19Api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.utility;

public class TC_GetByDate extends utility {

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="https://api.covid19api.com";
		RestAssured.basePath="country/south-africa/status/confirmed?from=2020-05-25T00:00:00Z&to=2020-05-26T00:00:00Z";
	}
	@Test
	public void Test1()
	{
		logger.info("Returns all cases by case type for a country. Country must be the slug from /countries or /summary. Cases must be one of: confirmed, recovered, deaths");
		RequestSpecification request=RestAssured.given();
		Response response=request.request(Method.GET);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		logger.info("STOP1");
		// Assert.assertEquals(response.getStatusCode(),get_status_code);
		
	}

	
	
	
}
