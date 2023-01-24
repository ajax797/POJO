package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GET_req1 
{

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		Response res = given().request(Method.GET,"/api/users?page=2");
		System.out.println(res.prettyPrint());
		
		
	}

}
