import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstRestAssured
{

    @Test
    void test1()
    {
        Response response=RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode,200);
    }
    @Test
    void test2()
    {
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));
    }

}
