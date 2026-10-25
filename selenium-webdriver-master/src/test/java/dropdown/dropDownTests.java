package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class dropDownTests extends BaseTests {
    @Test
    public void testDropDown(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "The Number of selected elements is not correct");
        assertTrue(selectedOptions.contains(option),"the option wan not selected");
    }

}
