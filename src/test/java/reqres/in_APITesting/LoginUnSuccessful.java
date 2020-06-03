package reqres.in_APITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.utility;

public class LoginUnSuccessful extends utility{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/login";
	}
	@Test
	public void Test1()
	{
		logger.info("Unsuccessfull login");
		RequestSpecification request=RestAssured.given();
		request.contentType("application/json");
		JSONObject payload=new JSONObject();
		
		payload.put("email","peter@klaven");
		
		request.body(payload.toJSONString());
		Response response=request.request(Method.POST);
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	
	}
	
}
