package RaghavAutomation4;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DataDrivenExamples extends DataForTests
{
    @Parameters({"userId"})
    @Test(dataProvider="TestData")
    public void put(String firstname, String lastname, int subjectId)
    {
        JSONObject request=new JSONObject();
        request.put("firstname", firstname);
        request.put("lastname", lastname);
        request.put("subjectId",subjectId);

        baseURI="http://localhost:3000/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).
                log().all();
    }

//    @Test(dataProvider = "DeleteData")
    public void test_delete(int userId)
    {
        baseURI="http://localhost:3000/";

        when().
                delete("/users/"+userId).
        then().
                statusCode(200);



    }
}
