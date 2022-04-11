package apiAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class User_Post extends ParamClass{
	

	
	@SuppressWarnings("unchecked")
	@Test(dataProvider = "UserDetails")
	public void post_user(String name, String job) {
		File schema = new File(System.getProperty("user.dir")+"\\schema.json");
		JSONObject request = new JSONObject();
		request.put("name", name);
		request.put("job", job);
		
		System.out.println(request.toJSONString());
		
		given().log().all().header("Content-Type","application/json").
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().assertThat().statusCode(201).header("Content-Type",containsString("application/json"))
        .body(matchesJsonSchema(schema));
      //  .time(Matchers.lessThanOrEqualTo(4000L));
	}
	
	
@SuppressWarnings({ "unchecked", "unused" })
@Test(dataProvider = "POJOUserDetails")
	public void POJO(String name, String job) {
		JSONObject request = new JSONObject();
		request.put("name", name);
		request.put("job", job);
		RequestSpecification request1 = RestAssured.given().log().all().header("Content-Type","application/json");
		request1.body(request);
		@SuppressWarnings("rawtypes")
		ResponseBody response =request1.post("https://reqres.in/api/users").getBody();
		JSONResponse responseBody = response.as(JSONResponse.class);
		System.out.println(responseBody);
		
		}
	
	}


