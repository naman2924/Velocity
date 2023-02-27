package velocity.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions {
    WebDriver driver;



    public void elementToBeClickable(int seconds, By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(findBy));

    }

    public void visibilityOfElementLocated(int seconds, By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

    }

    public void OpenUrl(String url) {
        driver.get(url);
    }
    public void dropdown(WebElement element, int i){
        Select dropDown= new Select(element);
        dropDown.selectByIndex(i);

    }

}
