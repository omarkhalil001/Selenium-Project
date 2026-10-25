package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FramesTest extends BaseTests {
    @Test
    public void FramesTest(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertTrue(nestedFramesPage.getLeftText().contains("LEFT"),"The Left Text is incorrect");
        assertTrue(nestedFramesPage.getbottomText().contains("BOTTOM"),"The Bottom Text is incorrect");
    }
}
