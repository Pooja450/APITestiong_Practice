package api_pack;

import org.testng.Assert;
// import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC01_GET extends BaseClass{

		
		@BeforeClass
		public void function1()
		{
			RestAssured.baseURI="http://restapi.demoqa.com";
			String city="mysore";
			RestAssured.basePath="/utilities/weather/city"+city;
		}
		@Test
		public void Test1()
		{
			
			RequestSpecification request=RestAssured.given();
			Response response=request.request(Method.GET);
			System.out.println(response.getStatusCode());
			
			Assert.assertEquals(response.getStatusCode(),get_status_code);
			
				
			
		}

	}
		
		
		

