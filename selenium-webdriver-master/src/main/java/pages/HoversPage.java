package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By figureCaption = By.className("figcaption");
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }
    public FigCaption hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        WebElement figure = driver.findElements(figureBox).get(index-1);
        actions.moveToElement(figure).perform();
        return new FigCaption(figure.findElement(figureCaption));
    }
    public class FigCaption{
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public FigCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){

            return caption.isDisplayed();
        }
        public String getName(){
            return caption.findElement(name).getText();
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
        public String getLinkURL(){
            return caption.findElement(link).getAttribute("href");
        }
    }

}
