package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void positiveAlertAppearsTest(){
        new AlertsPage(driver).alertAppears();

    }

   @Test
    public void positiveAlertConfirmTest(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
   }

   @Test
   public void positiveAlertPromptTest(){
        new AlertsPage(driver).typePrompt("Hi").verifyPrompt("Hi");
   }
}
