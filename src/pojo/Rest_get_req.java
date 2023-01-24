package pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_get_req 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();	
		Response res = req.request(Method.GET, "/api/users/2");
		
		Single_user su = res.as(Single_user.class);
		data d = su.getData();
		int id = d.getId();
		System.out.println(id);
		String fn = d.getFirst_name();
		System.out.println(fn);
		System.out.println(d.getLast_name());
		System.out.println(d.getAvatar());
		
		
		
		
		
		
		
	}

}
//Response res=req.request(Method.GET,"/api/users/2");