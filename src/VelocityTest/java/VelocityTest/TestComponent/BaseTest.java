package VelocityTest.TestComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;


    public void initializeDriver() {
        driver = new ChromeDriver();
    }

return driver;
    //FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\Velocity\\src\\main\\java\\velocity\\Resources\\Global\\GlobalData.Properties");

    public void brow() {
        driver = initializeDriver();

    }
}
