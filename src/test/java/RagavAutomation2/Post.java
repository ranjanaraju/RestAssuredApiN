package RagavAutomation2;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Post {
    //  @Test
    public void test1Post() {
//        Map<String,Object> map=new HashMap<String, Object>();
//        map.put("name","radhakrishna");
//        map.put("job","creator");
//        System.out.println(map);

        JSONObject request = new JSONObject();
        request.put("name", "radhakrishna");
        request.put("job", "creator");
        System.out.println(request.toJSONString());
        given().header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).when()
                .post("https://reqres.in/api/users").then().statusCode(201);

    }

    // @Test
    public void test1Put() {
//        Map<String,Object> map=new HashMap<String, Object>();
//        map.put("name","radhakrishna");
//        map.put("job","creator");
//        System.out.println(map);

        JSONObject request = new JSONObject();
        request.put("name", "radhakrishna");
        request.put("job", "creator");
        System.out.println(request.toJSONString());
        given().header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).when()
                .put("https://reqres.in/api/users/2").then().statusCode(200).log().all();

    }

    @Test
    public void delete()
    {
        when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
    }
}

