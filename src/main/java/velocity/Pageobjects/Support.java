package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Support {


    WebDriver driver;

    public Support (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[text()='Schedule free call']")
    WebElement scheduleFreeCall;
    //for assertion
    @FindBy(xpath = "//h1[text()='Ask for Support']")
    WebElement PageHeading;
}
