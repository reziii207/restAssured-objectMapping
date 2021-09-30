package Step;

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

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

public class AssertAPIWithStatusCode201 {

    public void AssertStatusCode(Response response){
        Assert.assertEquals(response.statusCode(), 201);
    }
}
