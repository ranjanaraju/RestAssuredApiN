package Mukesh;

import io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import org.testng.annotations.Test;



import static org.hamcrest.Matchers.hasItems;

public class Get1Restassured1
{
    @Test
    public void method()
    {
        RestAssured.get(" http://localhost:8080/lotto").
                then().body("lotto.winners.winnerId", hasItems(23, 54));
    }
}
