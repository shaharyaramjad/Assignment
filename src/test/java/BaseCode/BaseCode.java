package BaseCode;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.api.Endpoints.Endpoints;
import org.api.PayLoads.Payloads;
import org.api.Variables.Variables;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;

import static io.restassured.RestAssured.given;
@Listeners(ExtentReportListner.class)
public class BaseCode extends ExtentReportListner {
    public static String store;


    Endpoints ep = new Endpoints();
    Payloads pl = new Payloads();
    Variables v = new Variables();
    public String BaseUrl = RestAssured.baseURI = "https://reqres.in/";


    @Test
    void Get_ListUsers()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_List_Users);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }

    @Test
    void Get_SingleUser()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_Single_User);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());


    }


    @Test
    void Get_Single_User_Not_Found()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_Single_User_Not_Found);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }


    @Test
    void Get_List_Resource()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_List_Resource);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }

    @Test
    void Get_Single_Resource()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_Single_Resource);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }

    @Test
    void Get_Single_Resource_Not_Found()
    {
        test.log(LogStatus.INFO, "My test is starting....");
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_Single_Resource_Not_Found);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());


    }

    //Post

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
        JsonPath jsonPathEvaluator = response.jsonPath();
        store = jsonPathEvaluator.get("name");
        System.out.println(store);



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




    }

    @Test
    void Patch_Update_User()
    {
        test.log(LogStatus.INFO, "My test is starting....");


        RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
        Response response = httpRequest.body(pl.Patch_Update_User())
                .patch(ep.Patch_Update_User);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

        System.out.println(response.getBody().asString());
        System.out.println("The Response code - " + response.getStatusCode());

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

    @Test
    void Post_Register_User_Success_full()
    {
        test.log(LogStatus.INFO, "My test is starting....");


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Register_User())
                .when()
                .post(ep.Post_Register_User_Success_full)
                .then()
                .extract().response();
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

        System.out.println(response.getBody().asString());



    }

    @Test
    void Post_Register_User_Un_Success_full()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Register_User_Unsuccess())
                .when()
                .post(ep.Post_Register_User_Un_Success_full)
                .then()
                .extract().response();
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());




    }


    @Test
    void Post_Login_User_Success_full()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Login_User_Success())
                .when()
                .post(ep.Post_Login_User_Success_full)
                .then()
                .extract().response();
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

//        System.out.println(response.getBody().asString());



    }


    @Test
    void Post_Login_User_UnSuccess_full()
    {
        test.log(LogStatus.INFO, "My test is starting....");


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Login_User_UnSuccessfull())
                .when()
                .post(ep.Post_Login_User_Un_Success_full)
                .then()
                .extract().response();
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());

        System.out.println(response.getBody().asString());



    }

    @Test
    void Get_Delayed_Response_Users()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(ep.Get_Delayed_Response_Users);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }




}
