package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage{
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.figure:nth-of-type(2) img")
    WebElement user2;
    public HoversPage hoverUser() {
        pause(1000);
        new Actions(driver).moveToElement(user2).perform();
        pause(1000);
        return this;
    }

    @FindBy(css = "div.figure:nth-of-type(2) h5")
    WebElement user2Appear;
    public HoversPage verifyHover() {
        Assert.assertEquals(user2Appear.getText(), "name: user2");
        return this;
    }



}
