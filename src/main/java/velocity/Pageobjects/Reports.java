package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Reports {

    WebDriver driver;

    public Reports(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "td[class='pl-6']")
    List<WebElement> ReportsName;

}
