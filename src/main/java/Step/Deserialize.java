package Step;

import Models.Request.UnsuccessfulRegistrationRequest;
import Models.Response.SuccessfulRegistrationResponse;
import Models.Response.UnsuccessfulRegistrationResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

public class Deserialize {

    public void deserializeResponse(Response response) {
        if (response.statusCode() == 200) {
            ResponseBody body = response.getBody();
            SuccessfulRegistrationResponse responseBody = body.as(SuccessfulRegistrationResponse.class);

            Assert.assertEquals(responseBody.token,"QpwL5tke4Pnpja7X4");
            Assert.assertEquals(responseBody.id,"4");

        } else if (response.statusCode() == 400) {
            ResponseBody body = response.getBody();
            UnsuccessfulRegistrationResponse responseBody = body.as(UnsuccessfulRegistrationResponse.class);

            Assert.assertEquals(responseBody.error,"Missing password");
        }

    }
}

