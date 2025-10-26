package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id="column-a")
    WebElement columnA;
    @FindBy(id="column-b")
    WebElement columnB;
    public DragAndDropPage standardDragAndDrop() {
        pause(2000);
        new Actions(driver).dragAndDrop(columnA, columnB).perform();
        pause(2000);
        return this;
    }

@FindBy (xpath = "//*[@id='column-a']/header")
WebElement headerA;
    public DragAndDropPage verifyDragAndDrop(String text) {
        pause(2000);
        Assert.assertEquals(headerA.getText(), text);
        pause(2000);
        return this;
    }
}
