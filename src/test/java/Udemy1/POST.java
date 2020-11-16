package Udemy1;

import Udemy1_Files.payload;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class POST
{
    public static void main(String[] args)
    {
        RestAssured.baseURI="https://reqres.in/";
        given().log().all().header("Content-Type","application/json").body(payload.Addplace()).
                when().post("https://reqres.in/api/users")
                .then().log().all().statusCode(201);

    }

}
