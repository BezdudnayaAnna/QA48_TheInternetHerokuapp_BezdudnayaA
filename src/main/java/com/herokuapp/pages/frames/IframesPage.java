package com.herokuapp.pages.frames;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IframesPage extends BasePage {
    public IframesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iframe;
    @FindBy(tagName = "body")
    WebElement body;
    public IframesPage verifyIframeByText() {
        Long count1 = (Long) js.executeScript("return document.getElementsByTagName('iframe').length;");
        System.out.println("1. The total number of iframes in the parent page is: " + count1);

        driver.switchTo().frame(iframe);
        Assert.assertTrue(body.getText().contains("Your content goes here."));

        driver.switchTo().defaultContent();

        return this;
    }


}

