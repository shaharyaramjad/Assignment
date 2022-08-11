package baseTest;

import apiConfigs.APIPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;
import com.relevantcodes.extentreports.LogStatus;
import utils.FileandEnv;

import static io.restassured.RestAssured.given;


@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner {
    @Test
    public void utilsTest(){
        int a = 10;
        int b = 20;

        int sum = a+b;

        test.log(LogStatus.INFO,"test has been started...");
        test.log(LogStatus.PASS, "Test has been pass");
        test.log(LogStatus.FAIL,"My sum value is "+sum);
        test.log(LogStatus.INFO,"test has been completed...");
    }
    @Test
    void Get_ListUsers()
    {

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get(APIPath.apiPath.Get_List_Users);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getStatusCode());
        System.out.println(response.getCookies());
        System.out.println(response.getTime());
    }
}
