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
    public void nd() throws InterruptedException {
brow();
        UploadReports m = new UploadReports(driver);
        m.uploadFileTest();
    }
}






