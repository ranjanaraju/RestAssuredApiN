package Udemy1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class POST3
{
    public static void main(String[] args)
    {
        RestAssured.baseURI="https://reqres.in/";
        String response=given().log().all().header("Content-Type","application/json").body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}").
                when().post("/api/users")
                .then().log().all().statusCode(201).body("job",equalTo("leader")).extract().response().asString();
            JsonPath js=new JsonPath(response);
            String placeId=js.getString("name");
            System.out.println(placeId);

    }
}
