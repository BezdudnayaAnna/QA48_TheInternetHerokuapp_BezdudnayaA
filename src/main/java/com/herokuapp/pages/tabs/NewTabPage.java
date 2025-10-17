package com.herokuapp.pages.tabs;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewTabPage extends BasePage {
    public NewTabPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h3")
    WebElement pageTitle;
    public NewTabPage veryfiNewTabTitle(String text) {
        Assert.assertTrue(pageTitle.getText().contains(text));
        return this;
    }
}
