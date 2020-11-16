package RagavAutomation2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Get
{
    @Test
    public void getNew()
    {
        given().when().get("https://reqres.in/api/users?page=2").then().
                statusCode(200).body("data.id[1]",equalTo(8)).
                statusCode(200).body("data.first_name",hasItems("Michael","Lindsay"));


    }
}
