package Models.Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class UnsuccessfulRegistrationRequest {

    public Response unsuccessfulResponse() {

        Map<String, String> credentials = new HashMap<String, String>();
        credentials.put("email", "sydney@fife");


        return   RestAssured
                .given()
                .baseUri("https://reqres.in/api/register")
                .contentType(ContentType.JSON)
                .body(credentials)
                .when()
                .post();
    }
}
