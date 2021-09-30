import Models.Request.SuccessfulRegistrationRequest;
import Models.Request.UnsuccessfulRegistrationRequest;
import Models.Request.WithStatusCode201;
import Step.AssertAPIWithStatusCode201;
import Step.Deserialize;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

public class TestClass {

    SuccessfulRegistrationRequest successfulRegistrationRequest = new SuccessfulRegistrationRequest();
    UnsuccessfulRegistrationRequest unsuccessfulRegistrationRequest = new UnsuccessfulRegistrationRequest();
    WithStatusCode201 withStatusCode201 = new WithStatusCode201();
    AssertAPIWithStatusCode201 assertAPIWithStatusCode201 = new AssertAPIWithStatusCode201();
    Deserialize deserialize = new Deserialize();
    
    @Test
    public void test(){
        deserialize.deserializeResponse(successfulRegistrationRequest.successResponse());
        deserialize.deserializeResponse(unsuccessfulRegistrationRequest.unsuccessfulResponse());
        assertAPIWithStatusCode201.AssertStatusCode(withStatusCode201.hasStatusCode201());
    }

}
