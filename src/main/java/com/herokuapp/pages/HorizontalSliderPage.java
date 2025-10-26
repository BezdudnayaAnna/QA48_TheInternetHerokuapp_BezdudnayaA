package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input[type='range']")
    WebElement sliderInput;
    public HorizontalSliderPage moveSlider() {
        pause(3000);
        new Actions(driver).dragAndDropBy(sliderInput, 30, 0).perform();
        pause(3000);
        return this;
    }

    @FindBy(id = "range")
    WebElement sliderValue;
    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(sliderValue.getText(), number);
        return this;
    }
}
