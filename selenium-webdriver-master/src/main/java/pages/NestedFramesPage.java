package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getLeftText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String leftText =  driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return leftText;

    }
    public String getbottomText(){
        driver.switchTo().frame(bottomFrame);
        String bottomText = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return bottomText;
    }
}
