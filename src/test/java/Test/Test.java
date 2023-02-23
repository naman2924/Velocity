package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import velocity.Pageobjects.DashBoard;
import velocity.Pageobjects.LoginPage;
import velocity.Pageobjects.OnBoarding;

public class Test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://velocity-48mzf.ondigitalocean.app/login");
        LoginPage LoginTest = new LoginPage(driver);
        LoginTest.Login("test@codeword.tech", "hello@123");
       // driver.findElement(By.xpath("//p[text()='Campaigns']")).click();
        driver.findElement(By.id("headlessui-menu-button-:R34p:")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}
