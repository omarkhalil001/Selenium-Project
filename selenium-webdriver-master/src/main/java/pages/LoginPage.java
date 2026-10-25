package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By usernamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By loginbutton = By.cssSelector("#login>button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserNameField(String username) {
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void setPasswordField(String password) {
        driver.findElement(passwordfield).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton( ) {
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }
}
