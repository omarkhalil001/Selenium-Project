package utitilies;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goToURL(String url){
        driver.navigate().to(url);
    }
    public void switchToTab(String title){
        Set<String> windowHandels = driver.getWindowHandles();
        for(String windowHandle : windowHandels){
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(title)){
                break;
            }
        }

    }
}
