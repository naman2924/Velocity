package velocity.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadReports {
    WebDriver driver;

    public UploadReports(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "org-input")
    WebElement selectOrganization;

    @FindBy(id = "name-input")
    WebElement reportName;

    @FindBy(id = "startDate-input")
    WebElement dateSelector;

    @FindBy(id = "durationType-input")
    WebElement reportType;

    @FindBy(css = "input[placeholder='Upload file']")
    WebElement uploadFile;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement submitButton;
}
