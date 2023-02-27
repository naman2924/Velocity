package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    WebDriver driver;


    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "headlessui-menu-button-:R34p:")
    WebElement username;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement clickLogout;


    //Actions on Element
    public void LogoutAction() {
        username.click();
        clickLogout.click();
    }
}
