package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.lang.annotation.Target;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {
    @Test
    public void testHovers(){
        var hoverPage = homePage.clickHovers();
        int figureIndex = 1;
        var figCaption = hoverPage.hoverOverFigure(figureIndex);
        assertTrue(figCaption.isCaptionDisplayed(),"The Caption is not Dispalyed");
        assertTrue(figCaption.getName().contains("user1"),"Incorrect user");
        assertEquals(figCaption.getLinkText(),"View profile","the link text is not correct");
        assertTrue(figCaption.getLinkURL().contains("/users/"+figureIndex),"The url is not correct");
    }
}
