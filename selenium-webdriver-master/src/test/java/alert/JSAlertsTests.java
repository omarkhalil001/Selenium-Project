package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JSAlertsTests extends BaseTests {
    @Test
    public void jsAlertsTest() {
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.clickAlertButton();
        assertEquals(jsAlertPage.getAlertMessage(),"I am a JS Alert",
                "The alert message is not correct");
        jsAlertPage.acceptAlert();
        assertEquals(jsAlertPage.getResultMessage(),"You successfully clicked an alert",
                "The result message is not correct");
    }
    @Test
    public void jsconfirmTest() {
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.clickConfirmButton();
        assertEquals(jsAlertPage.getAlertMessage(),"I am a JS Confirm",
                "The confirm message is not correct");
        jsAlertPage.dismissAlert();
        assertEquals(jsAlertPage.getResultMessage(),"You clicked: Cancel",
                "The result message is not correct");
    }
    @Test
    public void jsPromptTest() {
        var jsAlertPage = homePage.clickJavaScriptAlerts();
        jsAlertPage.clickPromptButton();
        assertEquals(jsAlertPage.getAlertMessage(),"I am a JS prompt",
                "The confirm message is not correct");
        jsAlertPage.setPromptText("Andrew is here");
        jsAlertPage.acceptAlert();
        assertEquals(jsAlertPage.getResultMessage(),"You entered: Andrew is here",
                "The result message is not correct");
    }
}
