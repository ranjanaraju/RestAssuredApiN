package Udemy1;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class GET
{
    public static void main(String[] args)
    {

        String getplace=given().log().all().when().get("/api/users/2").
                then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath js=new JsonPath(getplace);
        String actual=js.getString("data");
        System.out.println(actual);

    }
}
