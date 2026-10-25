package navigate;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utitilies.WindowManager;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickEx1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goToURL("https://www.google.com/");
    }
}
