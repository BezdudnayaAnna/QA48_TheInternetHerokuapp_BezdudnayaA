package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdownSelect;
    public DropdownPage selectOption(String option) {
        Select select = new Select(dropdownSelect);
        select.selectByVisibleText(option);
        return this;
    }

    public DropdownPage verifyOption(String expectedResult) {
        //String selectedOption=new Select(dropdownSelect).getFirstSelectedOption().getText();
        Assert.assertTrue(shouldHaveText(dropdownSelect, expectedResult, 5));
        return this;
    }
}
