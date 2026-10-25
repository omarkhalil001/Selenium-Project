package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTests {
    @Test
    public void WaitTest1(){
        var ex1Page = homePage.clickDynamicLoading().clickEx1();
        ex1Page.clickStartButton();
        assertEquals(ex1Page.getResultText(),"Hello World!","The text is incorrect");

    }
}
