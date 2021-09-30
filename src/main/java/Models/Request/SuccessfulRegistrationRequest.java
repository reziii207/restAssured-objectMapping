package Models.Request;

import com.sun.xml.bind.v2.model.core.TypeRef;
import io.cucumber.java.bs.A;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuccessfulRegistrationRequest {

        public Response successResponse() {
            Map<String,String> credentials = new HashMap<String,String>();
            credentials.put("email", "eve.holt@reqres.in");
            credentials.put("password", "pistol");

            return   RestAssured
                    .given()
                    .baseUri("https://reqres.in/api/register")
                    .contentType(ContentType.JSON)
                    .body(credentials)
                    .when()
                    .post();
        }
}
