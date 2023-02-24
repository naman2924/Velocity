package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
    WebDriver driver;

    public DashBoard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Dashboard -Performance marketing pack section
    @FindBy(xpath = "//p[text()='Campaigns']")
    WebElement Campaign;
    @FindBy(xpath = "//p[text()='Email Support']")
    WebElement email;
    @FindBy(xpath = "//p[text()='Reports']")
    WebElement Reports;
    @FindBy(xpath = "//p[text()='Explore More']")
    WebElement ExploreMore;

    // dashboard promotional banner
    @FindBy(xpath = "//p[text()='Grab it now']")
    WebElement grabItNowButton;
    @FindBy(css = "img[alt='closeIcon']")
    WebElement closeButton;

    // Dashboard Left menu

    @FindBy(xpath = "//p[text()='Dashboard']")
    WebElement dashboard;
    @FindBy(xpath = "//p[text()='Plans & Bundles']")
    WebElement PlansAndBundles;

    @FindBy(xpath = "//p[text()='Account & Billing']")
    WebElement AccountAndBundles;

    @FindBy(xpath = "//p[text()='Support']")
    WebElement Support;

    @FindBy(className = "mt-3")
    WebElement ValidityDate;




}
