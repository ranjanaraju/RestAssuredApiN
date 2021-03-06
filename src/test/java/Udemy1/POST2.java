package Udemy1;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class POST2
{
    public static void main(String[] args)
    {
        RestAssured.baseURI="https://reqres.in/";
        given().log().all().header("Content-Type","application/json").body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}").
                when().post("/api/users")
                .then().log().all().statusCode(201).body("job",equalTo("leader"));
                //.header("server","Apache/2.4.18(Ubuntu)");

    }
}
