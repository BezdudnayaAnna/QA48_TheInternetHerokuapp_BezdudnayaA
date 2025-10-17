package com.herokuapp.pages.tabs;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement newTab;
    public NewTabPage getNewTab(int index) {
        click(newTab);
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return new NewTabPage(driver);
    }

}
