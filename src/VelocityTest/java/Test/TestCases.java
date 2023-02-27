package Test;

import VelocityTest.TestComponent.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import velocity.CommonFunctions.CommonFunctions;
import velocity.Pageobjects.UploadReports;

import java.io.FileNotFoundException;

public class TestCases {

    public static void main(String[] args) {
        UploadReports m = new UploadReports();
        m.uploadFileTest();
    }


}




