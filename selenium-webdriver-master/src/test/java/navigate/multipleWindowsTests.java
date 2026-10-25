package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class multipleWindowsTests extends BaseTests {
    @Test
    public void multipleWindowsTests(){
        var newWindowPage = homePage.clickMultipleWindows().clickLink();
        getWindowManager().switchToTab("New Window");
        String  newWindowText = newWindowPage.getHeaderText();
        assertEquals(newWindowText,"New Window",
                "You are in The wrong Context");
    }
}
