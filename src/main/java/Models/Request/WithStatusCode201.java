package Models.Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class WithStatusCode201 {

    public Response hasStatusCode201() {

        Map<String, String> credentials = new HashMap<String, String>();
        credentials.put("name", "morpheus");
        credentials.put("job", "leader");

        return   RestAssured
                .given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON)
                .body(credentials)
                .when()
                .post();
    }
}
