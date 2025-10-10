package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "button[onclick='jsAlert()']")
    WebElement jSAlertButton;
    public AlertsPage alertAppears() {
        click(jSAlertButton);
        Assert.assertTrue(isAlertDisplayed());
        return this;
    }

    @FindBy (css = "button[onclick='jsConfirm()']")
    WebElement jSConfirmButton;
    public AlertsPage selectResult(String result) {
        click(jSConfirmButton);
        if(result!=null && result.equals("OK")){
            driver.switchTo().alert().accept();
        }else if(result!=null && result.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id="result")
    WebElement alertConfirmResult;
    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(alertConfirmResult.getText().contains(text));
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement alertPrompt;
    public AlertsPage typePrompt(String prompt) {
        click(alertPrompt);
        if(prompt!=null) {
            driver.switchTo().alert().sendKeys(prompt);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    public AlertsPage verifyPrompt(String text) {
        Assert.assertTrue(alertConfirmResult.getText().contains(text));
        return this;
    }
}
