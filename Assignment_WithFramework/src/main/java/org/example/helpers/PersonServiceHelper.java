package org.example.helpers;


import  com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.specification.RequestSpecification;
import org.example.constants.EndPoints;
import org.example.model.Person;
import org.example.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import java.lang.reflect.Type;
import java.util.List;



import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PersonServiceHelper {
    //    Fetch the Data from Endpoints
    //    GET/POST/GET Single/Patch/Delete
    // We need to read the config variables
    //    Rest Assured about the URL, port
    //    Make a Get REQUEST on this url and send the data to TestGETPerson


    private static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");

    public PersonServiceHelper(){
        RestAssured.baseURI = BASE_URL;

    }

    public List<Person> getAllUser(){

        RequestSpecification httpRequest = given().log().all();
        Response response = httpRequest.get(EndPoints.GET_LIST_USERS).andReturn();

        assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Ok");

        List<Person> personList = response.as(type);
        return personList;

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());



    }



}
