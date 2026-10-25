package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testValidLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        var SecureAreaPage = loginPage.clickLoginButton();
        assertTrue(SecureAreaPage.getMesseage().contains("You logged into a secure area!"),
              "You didn't login successfully");
    }


}
