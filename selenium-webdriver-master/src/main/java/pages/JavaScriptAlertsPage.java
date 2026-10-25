package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By confirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By promptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By resultMessage = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton() {
        driver.findElement(alertButton).click();
    }
    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }
    public void clickPromptButton() {
        driver.findElement(promptButton).click();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    public void setPromptText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
    public String  getResultMessage() {
        return driver.findElement(resultMessage).getText();
    }
}
