import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.endpoints;
import org.example.payload;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;


public class CRUD {
    endpoints obj = new endpoints();
    payload pl = new payload();

    public Properties prop;





    @BeforeClass
    public void TestDataSetup() throws IOException {

        File Src = new File("C:\\Users\\VenD-Shahryar\\Desktop\\Assignment_01\\Assignment_001\\src\\main\\resources\\config.properties");
        FileInputStream fil = new FileInputStream(Src);
        prop = new Properties();
        prop.load(fil);





    }



    public String BaseUrl = RestAssured.baseURI = prop.getProperty("baseurl") ;
//    "https://reqres.in/"

    @Test
    void Get_ListUsers()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_List_Users);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }


    @Test
    void Get_SingleUser()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_Single_User);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());


    }


    @Test
    void Get_Single_User_Not_Found()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_Single_User_Not_Found);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }


    @Test
    void Get_List_Resource()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_List_Resource);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }

    @Test
    void Get_Single_Resource()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_Single_Resource);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }

    @Test
    void Get_Single_Resource_Not_Found()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_Single_Resource_Not_Found);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());


    }

    @Test
    void POST_Create_User()
    {


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Create_User())
                .when()
                .post(obj.POST_Create_User)
                .then()
                .extract().response();

        System.out.println(response.getBody().asString());

//        Assertions.assertEquals(pl.store, response.jsonPath().getString("name"));
//        Assertions.assertEquals("leader", response.jsonPath().getString("job"));


    }

    @Test
    void PUT_Update_User()
    {


        RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
        Response res = httpRequest.body(pl.Update_User())
                .put(obj.PUT_Update_User);

        System.out.println(res.getBody().asString());
        System.out.println("The Response code - " + res.getStatusCode());


    }

    @Test
    void Patch_Update_User()
    {


        RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
        Response res = httpRequest.body(pl.Patch_Update_User())
                .patch(obj.Patch_Update_User);

        System.out.println(res.getBody().asString());
        System.out.println("The Response code - " + res.getStatusCode());



    }

    @Test
    void Delete_Single_User()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.delete(obj.Delete_Single_User);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

    }

    @Test
    void Post_Register_User_Success_full()
    {

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Register_User())
                .when()
                .post(obj.Post_Register_User_Successfull)
                .then()
                .extract().response();

        System.out.println(response.getBody().asString());

//        Assertions.assertEquals("morpheus", response.jsonPath().getString("name"));
//        Assertions.assertEquals("leader", response.jsonPath().getString("job"));


    }

    @Test
    void Post_Register_User_Un_Success_full()
    {


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Register_User_Unsuccess())
                .when()
                .post(obj.Post_Register_User_UnSuccessfull)
                .then()
                .extract().response();

        System.out.println(response.getBody().asString());




    }


    @Test
    void Post_Login_User_Success_full()
    {

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Login_User_Success())
                .when()
                .post(obj.Post_Login_User_Successfull)
                .then()
                .extract().response();

        System.out.println(response.getBody().asString());



    }


    @Test
    void Post_Login_User_Un_Success_full()
    {

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(pl.Login_User_UnSuccessfull())
                .when()
                .post(obj.Post_Login_User_UnSuccessfull)
                .then()
                .extract().response();

        System.out.println(response.getBody().asString());



    }

    @Test
    void Get_Delayed_Response_Users()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(obj.Get_Delayed_Response_Users);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }











}
