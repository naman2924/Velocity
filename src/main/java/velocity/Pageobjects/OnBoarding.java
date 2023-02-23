package velocity.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnBoarding {

    WebDriver driver;

    public OnBoarding(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Tell us about yourSelf? page
    @FindBy(name = "teamSize")
    WebElement teamSize;


    @FindBy(name = "organizationalRole")
    WebElement selectRole;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextButton;

    @FindBy(name = "organizationName")
    WebElement companyName;

    //set your objective page
    @FindBy(name = "objective")
    WebElement objectiveDropdown;

    @FindBy(name = "combinedAdBudget")
    WebElement addBudget;

    @FindBy(name = "expectedROAS")
    WebElement ExpectedRoas;

    @FindBy(name = "expectedMonthlySales")
    WebElement expectedSalesCount;
    By product = By.name("expectedMonthlySales");

    // get synced up
    // @FindBy()


}

