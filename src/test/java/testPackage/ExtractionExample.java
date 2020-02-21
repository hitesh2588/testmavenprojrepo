package testPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;

public class ExtractionExample {
	
	
	@Test
	public void getRequest() {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=9090;
		RestAssured.basePath="/student";
		
		String firstnamelist= given().contentType(ContentType.JSON).header("user","pass").log().all().get("/100").then().extract().path("firstName");
		System.out.println(firstnamelist);
//		res.prettyPrint();
		
	}

}
