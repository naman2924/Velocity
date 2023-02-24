package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import velocity.Pageobjects.DashBoard;
import velocity.Pageobjects.LoginPage;
import velocity.Pageobjects.OnBoarding;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://velocity-48mzf.ondigitalocean.app/login");
//        LoginPage LoginTest = new LoginPage(driver);
//        LoginTest.Login("test@codeword.tech", "hello@123");
//       // driver.findElement(By.xpath("//p[text()='Campaigns']")).click();
//        var date=driver.findElement(By.className("mt-3")).getText();
//        System.out.println(date);
//        driver.findElement(By.id("headlessui-menu-button-:R34p:")).click();
//        driver.findElement(By.xpath("//a[text()='Logout']")).click();


        driver.get("https://velocity-48mzf.ondigitalocean.app/upload-reports");
        WebElement org = driver.findElement(By.id("org-input"));
        Select organization = new Select(org);
//        Thread.sleep(10000);
        organization.selectByIndex(1);
driver.findElement()
        Keys.chord(Keys.ENTER);

    }
}
