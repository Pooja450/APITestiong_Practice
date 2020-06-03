package api_pack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_Api extends BaseClass{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="http://restapi.demoqa.com";
		RestAssured.basePath="/authentication/CheckForAuthentication";
	}
	@Test
	public void Test1()
	{
		// System.out.println("hello pooja");
		RequestSpecification request=RestAssured.given();
		request.auth().basic("ToolsQA","TestPassword" );
		Response response=request.request(Method.GET);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
	}
}
