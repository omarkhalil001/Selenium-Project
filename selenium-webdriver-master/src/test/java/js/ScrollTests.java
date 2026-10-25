package js;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ScrollTests extends BaseTests {

    @Test
    public void testScrollToElement(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void ScrollToParagraph(){
        int index = 5;
        var infiniteScroll = homePage.clickInfiniteScroll();
        infiniteScroll.scrollIntoParagraph(index);
        assertEquals(infiniteScroll.getNumberOfParagraphs(),5,
                "Incorrect Numbers of Paragraphs");
    }

}
