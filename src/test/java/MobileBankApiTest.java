import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankApiTest {

    @Test
    public void shouldCheck() {
        // Given - When - Then
        // Предусловия
        given()
           .baseUri("https://postman-echo.com")
           .body("some data")
        // Выполняемые действия
           .when()
                .post("/post")
        // ПроверкиL
           .then()
                .statusCode(200)
           .body("data", equalTo("data"))
        ;
    }
}
