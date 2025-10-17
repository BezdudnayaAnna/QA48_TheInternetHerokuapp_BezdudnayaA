package com.herokuapp.pages.frames;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "frame[name='frame-top']")
    WebElement frameTop;
    @FindBy(css = "frame[name='frame-left']")
    WebElement frameLeft;
    @FindBy (tagName = "body")
    WebElement body;

    public NestedFramesPage handleFrameTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long count1 = (Long) js.executeScript("return document.getElementsByTagName('frame').length;");
        System.out.println("1. The total number of visible frames on the parent page is: "+count1);

        driver.switchTo().frame(frameTop);

        Long count2 = (Long) js.executeScript("return document.getElementsByTagName('frame').length;");
        System.out.println("2. The total number of frames in top frame is: "+count2);

        driver.switchTo().frame(frameLeft);

        Long count3 = (Long) js.executeScript("return document.getElementsByTagName('frame').length;");
        System.out.println("3. The total number of frames in top left frame is: "+count3);
        Assert.assertTrue(body.getText().contains("LEFT"));

        driver.switchTo().defaultContent();

        Long count4 = (Long) js.executeScript("return document.getElementsByTagName('frame').length;");
        System.out.println("4. The total number of visible frames back on the parent page is: "+count4);

        return this;
    }

    @FindBy(css = "frame[name='frame-bottom']")
    WebElement frameBottom;
    public NestedFramesPage handleFrameBottom() {

        driver.switchTo().frame(frameBottom);

        Long count1 = (Long) js.executeScript("return document.getElementsByTagName('frame').length;");
        System.out.println("1. The total number of frames in bottom frame is: "+count1);

        Assert.assertTrue(body.getText().contains("BOTTOM"));

        driver.switchTo().defaultContent();

        return this;
    }
}
