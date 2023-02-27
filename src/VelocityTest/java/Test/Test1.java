package Test;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import velocity.CommonFunctions.CommonFunctions;

public class Test1 extends CommonFunctions {

    @Test
    public void Naman2() {

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
        WebElement test = driver.findElement(By.name("startDate"));
        //test.click();
        test.sendKeys("22032023");
        driver.findElement(By.cssSelector("input[placeholder='Upload file']")).sendKeys("D:\\SND\\Policy.pdf");

        //upload.sendKeys("C:/Users/Lenovo/Downloads/Webpagev1.2(1).pdf");
        //driver.findElement(By.cssSelector("input[placeholder='Upload file']")).click();

//        Actions a = new Actions(driver);
//        a.sendKeys(upload, "C:\\Users\\Lenovo\\Downloads\\Webpagev1.2(1).pdf");
        //sendKeys("C:\\Users\\Lenovo\\Downloads\\Webpage v1.2 (1).pdf").build().perform();


    }

}
