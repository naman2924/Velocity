package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import velocity.CommonFunctions.CommonFunctions;

public class AccountAndBilling extends CommonFunctions {
    WebDriver driver;

    public AccountAndBilling(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[text()='Request for Edit']")
    WebElement requestForEdit;
    @FindBy(xpath = "//a[text()='Set New Password']")
    WebElement setNewPassword;
    @FindBy(xpath = "//a[text()='Add Method']")
    WebElement addMethod;

}
