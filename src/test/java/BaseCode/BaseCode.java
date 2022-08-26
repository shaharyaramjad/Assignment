package BaseCode;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.api.Endpoints.Endpoints;
import org.api.PayLoads.Payloads;
import org.api.Variables.Variables;

import org.junit.Test;

import org.testng.annotations.Listeners;

import utils.ExtentReportListner;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertNotNull;

@Listeners(ExtentReportListner.class)
public class BaseCode extends ExtentReportListner {

    Endpoints ep = new Endpoints();
    Payloads pl = new Payloads();
    Variables v = new Variables();

    String BaseUrl = RestAssured.baseURI = "https://reqres.in/";


    @Test
    public void Get_ListUsers()
    {
        test.log(LogStatus.INFO, "My test is starting....");

        RequestSpecification httpRequest = given().log().all();
        Response response = httpRequest.get(ep.Get_List_Users);
        test.log(LogStatus.INFO,response.getBody().asString());
        test.log(LogStatus.INFO,"My Status code is "+response.getStatusCode());
        test.log(LogStatus.INFO,"Response time is "+ response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        assertNotNull(response,"List is Not Empty");
    }

    @Test
    public void Get_SingleUser()
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
    public void Get_Single_User_Not_Found()
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
    public void Get_List_Resource()
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
    public void Get_Single_Resource()
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
    public void Get_Single_Resource_Not_Found()
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
    public void POST_Create_User()
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



    }

    @Test
    public void PUT_Update_User()
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
    public void Patch_Update_User()
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
    public void Delete_Single_User()
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
    public void Post_Register_User_Success_full()
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
    public void Post_Register_User_Un_Success_full()
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
    public void Post_Login_User_Success_full()
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
    public void Post_Login_User_UnSuccess_full()
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
    public void Get_Delayed_Response_Users()
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
