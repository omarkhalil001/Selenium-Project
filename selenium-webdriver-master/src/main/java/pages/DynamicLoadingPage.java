package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ex1link = By.partialLinkText("Example 1");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public Ex1Page  clickEx1(){
        driver.findElement(ex1link).click();
        return new Ex1Page(driver);
    }
}
