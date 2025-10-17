package com.herokuapp.pages.frames;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/nested_frames']")
    WebElement nestedframes;
    public NestedFramesPage getNestedFrames() {
        click(nestedframes);
        return new NestedFramesPage(driver);
    }

    @FindBy(css = "a[href='/iframe']")
    WebElement iframe;
    public IframesPage getIframes() {
        click(iframe);
        return new IframesPage(driver);
    }

}
