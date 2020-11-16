package RagavAutomation3;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test1
{
   // @Test
    public void get()
    {

        baseURI="http://localhost:3000/";

        given().
                param("name","automation").
                get("/subjects").
                then().statusCode(200).log().all();
    }
   // @Test
    public void put()
    {
        JSONObject request=new JSONObject();
        request.put("firstname", "Jai");
        request.put("lastname","Shree Rama Chandra");
        request.put("subjectId","4");

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

    //@Test
    public void patch()
    {
        JSONObject request=new JSONObject();

        request.put("lastname","Shree Rama Chandra...");

        baseURI="http://localhost:3000/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
                when().
                patch("/users/4").
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void delete()
    {
        baseURI="http://localhost:3000/";

        when().
                delete("/users/4").
        then().
                statusCode(200);
    }


}
