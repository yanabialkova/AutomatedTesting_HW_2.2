package ru.netology;

import org.hamcrest.Matchers;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @org.junit.jupiter.api.Test
    void shouldGetValueBack() {
        String value = "some data";
        
        given()
                .baseUri("https://postman-echo.com")
                .body(value)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", Matchers.equalTo(value));
    }

}
