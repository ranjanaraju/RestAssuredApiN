import static io.restassured.RestAssured.given;

public class SeconRest {

    public static void main(String[] args){
        given().when().get("https://reqres.in/api/users?page=2").then().log()
                .all();

    }
}
