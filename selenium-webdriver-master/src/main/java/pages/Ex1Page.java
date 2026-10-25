package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex1Page {
    private WebDriver driver;
    private By startbutton = By.cssSelector("#start > button");
    private By resultText = By.cssSelector("#finish > h4");
    private By loading = By.xpath("//div[@style='display: none;'][@id='loading']");
    public Ex1Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startbutton).click();

    }
    public String getResultText() {
//        driver.findElement(loading);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(resultText)));
        return driver.findElement(resultText).getText();
    }

}
