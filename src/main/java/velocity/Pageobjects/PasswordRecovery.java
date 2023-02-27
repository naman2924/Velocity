package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import velocity.CommonFunctions.CommonFunctions;

public class PasswordRecovery  {
    WebDriver driver;

    public PasswordRecovery(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement forgetEmail;
    @FindBy(xpath = "//button[text()='Send link']")
    WebElement sendLinkButton;
    public void PasswordRecoveryAction(String email){
        forgetEmail.sendKeys();
        sendLinkButton.click();
    }
}

