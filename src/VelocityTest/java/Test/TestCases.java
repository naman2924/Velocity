package Test;

import VelocityTest.TestComponent.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import velocity.CommonFunctions.CommonFunctions;
import velocity.Pageobjects.UploadReports;

import java.io.FileNotFoundException;

public class TestCases extends BaseTest {

    @Test
    public void reportsTest{
        BaseTest n=new BaseTest();
        n.brow();
        UploadReports m = new UploadReports();
        m.uploadFileTest();
    }


}




