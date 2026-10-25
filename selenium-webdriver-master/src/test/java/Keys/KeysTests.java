package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var KeyPressesPage = homePage.clickKeyPresses();
        KeyPressesPage.enterText(Keys.chord(Keys.SHIFT,"Andrew"));
        assertEquals(KeyPressesPage.getResultMessage(),"You entered: W",
                "the value is not correct");
    }
}
