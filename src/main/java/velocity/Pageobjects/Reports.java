package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import velocity.CommonFunctions.CommonFunctions;

import java.util.List;

public class Reports extends CommonFunctions {

    WebDriver driver;

    public Reports(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "td[class='pl-6']")
    List<WebElement> ReportsName;

}
