package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage{
    private WebDriver driver;

    private By messageLocator = By.id("flash");
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getMesseage(){
        String message = driver.findElement(messageLocator).getText();
        return message;
    }
}
