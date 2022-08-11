import io.restassured.RestAssured;
import org.junit.BeforeClass;
import utils.ExtentReportListner;
import utils.FileandEnv;

public class BaseTest extends ExtentReportListner {

    @BeforeClass
    public void baseTest(){
        RestAssured.baseURI = FileandEnv.envAndFile().get("baseurl");

    }
}
