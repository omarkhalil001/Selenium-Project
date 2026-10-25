package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By submitButton = By.id("file-submit");
    private By resultFileName= By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile(String filePath){
        driver.findElement(chooseFileButton).sendKeys(filePath);
        driver.findElement(submitButton).click();
    }
    public String getResultFileName(){
        return driver.findElement(resultFileName).getText();
    }
}
