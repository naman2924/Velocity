package velocity.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import velocity.CommonFunctions.CommonFunctions;

public class UploadReports  {
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

    By submit= By.xpath("//button[text()='Submit']");
    public void uploadFileTest() {
        CommonFunctions call= new CommonFunctions(this.driver);
        call.OpenUrl("https://velocity-48mzf.ondigitalocean.app/upload-reports");
        call.dropdown(selectOrganization, 1);
        reportName.sendKeys("test");
        dateSelector.sendKeys("23032023");
        uploadFile.sendKeys("D:\\SND\\Policy.pdf");
        call.elementToBeClickable(15,submit );
        submitButton.click();
        driver.navigate().to("https://velocity-48mzf.ondigitalocean.app/reports/weekly");

    }
}
