package reqres.in_APITesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.utility;

public class ResourceList extends utility{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/unknown";
	}
	@Test
	public void Test1()
	{
		logger.info("Fetch Resource List TestCase ");
		RequestSpecification request=RestAssured.given();
		Response response=request.request(Method.GET);
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asString());
		logger.info("STOP"); 
		
		// Assert.assertEquals(response.getStatusCode(),get_status_code);
		
	}
	
}
