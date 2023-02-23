package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "email")
    WebElement EnterEmail;

    @FindBy(name = "password")
    WebElement EnterPassword;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement submit;

    @FindBy(tagName = "a")
    WebElement forgetPassword;

    public void Login(String email, String password) {
        EnterEmail.sendKeys(email);
        EnterPassword.sendKeys(password);
        submit.click();
    }


}
