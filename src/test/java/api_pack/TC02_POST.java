package api_pack;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC02_POST extends BaseClass{

	@BeforeClass
	public void function1()
	{
		RestAssured.baseURI="http://restapi.demoqa.com";
		String resource="/register";
		RestAssured.basePath="/customer/"+resource;
	}
	@Test
	public void Test1()
	{
		
		RequestSpecification request=RestAssured.given();
		request.contentType("application/json");
		JSONObject payload=new JSONObject();
		
		payload.put("FirstName","Priya");
		payload.put("LastName","Gautam");
		payload.put("UserName","Priya@110790");
		payload.put("Password","Priya12345678");
		payload.put("Email","Priya1189@gmail.com");
		
		request.body(payload.toJSONString());
		Response response=request.request(Method.POST);
		System.out.println(response.asString());
	
	}
}
