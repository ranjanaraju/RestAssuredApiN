package Udemy1;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PUT_Update
{
    public static void main(String[] args)
    {
        String job="Proffesor";
        RestAssured.baseURI="https://reqres.in/";
        given().log().all().header("Content-Type","application/json").body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \""+job+"\"\n" +
                "}").when().put("/api/users/2")
                .then().assertThat().log().all().statusCode(200).body("job",equalTo("Proffesor"));
    }
}
