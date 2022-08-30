package BaseCode;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.api.ConfigManager.ApplicationConfigReader;
import org.api.ConfigManager.ConfigProperties;
import org.api.Endpoints.Endpoints;
import org.api.PayLoads.Payloads;
import org.api.Variables.Variables;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;

import static io.restassured.RestAssured.given;



@Listeners(ExtentReportListner.class)
public class BaseCode extends ExtentReportListner {


    Endpoints ep = new Endpoints();
    Payloads pl = new Payloads();
    Variables V = new Variables();

    public static ApplicationConfigReader cm = new ApplicationConfigReader();

    public static String baseurl = cm.getBaseUrl();

    public String url = RestAssured.baseURI = baseurl;

    @BeforeMethod
    void init()
    {
        System.out.println("Started Executing APIs");
    }



    @Test
    void Get_ListUsers()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given().log().all();
        Response response = httpRequest.get(ep.Get_List_Users);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());


    }

    @Test
    void Get_SingleUser()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given().log().all();
        Response response = httpRequest.get(ep.Get_Single_User);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        Assert.assertEquals(200, response.getStatusCode());

    }



    @Test
    void POST_Create_User()
    {
        test.log(LogStatus.INFO, "My test is starting....");
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Create_User())
                .when()
                .post(ep.POST_Create_User)
                .then().contentType(ContentType.JSON)
                .extract().response();
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        Assert.assertEquals(201, response.getStatusCode());




    }

    @Test
    void PUT_Update_User()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
        Response response = httpRequest.body(pl.Update_User())
                .put(ep.PUT_Update_User);

        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        Assert.assertEquals(200, response.getStatusCode());


    }


    @Test
    void Delete_Single_User()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.delete(ep.Delete_Single_User);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }




}
