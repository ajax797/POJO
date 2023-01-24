package pojo1;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get_list_users {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, "/api/users?page=2");
		List_users list = res.as(List_users.class);
		List<Data> d = list.getData();
		for (Data data : d)
		{
			String avatar = data.getAvatar();
			System.out.println(avatar);
			
		}
		System.out.println();
		for (Data data : d)
		{
			int id = data.getId();
			System.out.println(id);
		}
		Support supp = list.getSupport();
		System.out.println(supp.getText());

	}

}
